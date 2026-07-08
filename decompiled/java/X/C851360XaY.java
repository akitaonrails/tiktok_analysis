package X;

import android.util.SparseArray;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0XaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851360XaY {
    public static C851370XaZ LIZ(C19EG c19eg, String str, EnumC852660Xce enumC852660Xce) {
        SparseArray<Map<String, C851370XaZ>> value;
        Map<String, C851370XaZ> map;
        if (c19eg == null || (value = ((TimerHolder) ViewModelProviders.of(c19eg).get(TimerHolder.class)).LL.getValue()) == null || (map = value.get(enumC852660Xce.getValue())) == null) {
            return null;
        }
        return map.get(str);
    }

    public static void LIZIZ(C19EG c19eg, String str, C851370XaZ c851370XaZ, EnumC852660Xce enumC852660Xce) {
        if (c19eg == null) {
            return;
        }
        MediatorLiveData<SparseArray<Map<String, C851370XaZ>>> mediatorLiveData = ((TimerHolder) ViewModelProviders.of(c19eg).get(TimerHolder.class)).LL;
        SparseArray<Map<String, C851370XaZ>> value = mediatorLiveData.getValue();
        if (value == null) {
            value = new SparseArray<>();
        }
        Map<String, C851370XaZ> linkedHashMap = value.get(enumC852660Xce.getValue());
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap.put(str, c851370XaZ);
        value.put(enumC852660Xce.getValue(), linkedHashMap);
        mediatorLiveData.postValue(value);
    }
}
