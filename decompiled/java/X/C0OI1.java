package X;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OI1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OI1 {
    public static final C0OI1 LIZ = new C0OI1();
    public static final Map<String, C0OI2> LIZIZ = new LinkedHashMap();

    public static void LIZIZ(long j, EnumC617010OHz enumC617010OHz) throws JSONException {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        Object c0oi2 = linkedHashMap.get(curUserId);
        if (c0oi2 == null) {
            c0oi2 = new C0OI2();
            linkedHashMap.put(curUserId, c0oi2);
        }
        C0OI2 c0oi22 = (C0OI2) c0oi2;
        if (enumC617010OHz != EnumC617010OHz.INVALID) {
            Map<Long, MutableLiveData<EnumC617010OHz>> map = c0oi22.LIZIZ;
            Long lValueOf = Long.valueOf(j);
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
            Object mutableLiveData = linkedHashMap2.get(lValueOf);
            if (mutableLiveData == null) {
                mutableLiveData = new MutableLiveData();
                linkedHashMap2.put(lValueOf, mutableLiveData);
            }
            LiveData liveData = (LiveData) mutableLiveData;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                liveData.setValue(enumC617010OHz);
            } else {
                liveData.postValue(enumC617010OHz);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bbId", String.valueOf(j));
        jSONObject.put("subscribeStatus", enumC617010OHz.getStatus());
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "notifyBulletinStatusChanged"));
    }

    public static EnumC617010OHz LIZ(long j, LifecycleOwner lifecycleOwner, Observer observer) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        Object c0oi2 = linkedHashMap.get(curUserId);
        if (c0oi2 == null) {
            c0oi2 = new C0OI2();
            linkedHashMap.put(curUserId, c0oi2);
        }
        C0OI2 c0oi22 = (C0OI2) c0oi2;
        Map<Long, MutableLiveData<EnumC617010OHz>> map = c0oi22.LIZIZ;
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
        Object mutableLiveData = linkedHashMap2.get(lValueOf);
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData();
            linkedHashMap2.put(lValueOf, mutableLiveData);
        }
        LiveData liveData = (LiveData) mutableLiveData;
        liveData.observe(lifecycleOwner, observer);
        Map<Long, List<Observer<EnumC617010OHz>>> map2 = c0oi22.LIZ;
        Long lValueOf2 = Long.valueOf(j);
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) map2;
        Object arrayList = linkedHashMap3.get(lValueOf2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap3.put(lValueOf2, arrayList);
        }
        ((List) arrayList).add(observer);
        return (EnumC617010OHz) liveData.getValue();
    }
}
