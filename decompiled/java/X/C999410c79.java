package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.widget.DataCenter;
import com.bytedance.android.widget.NextLiveData;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0c79, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999410c79 {
    public final DataCenter LIZ;

    public C999410c79(Fragment fragment) {
        DataCenter dataCenter = (DataCenter) ViewModelProviders.of(fragment).get(DataCenter.class);
        dataCenter.LLILLL = fragment;
        this.LIZ = dataCenter;
    }

    public final void LIZ(String str, Observer observer) {
        DataCenter dataCenter = this.LIZ;
        dataCenter.getClass();
        if (!TextUtils.isEmpty(str) && observer != null) {
            NextLiveData nextLiveData = (NextLiveData) ((HashMap) dataCenter.LLILLJJLI).get(str);
            if (nextLiveData == null) {
                nextLiveData = new NextLiveData();
                if (((HashMap) dataCenter.LL).containsKey(str)) {
                    nextLiveData.setValue(new C998850c6F(str, ((HashMap) dataCenter.LL).get(str)));
                }
                ((HashMap) dataCenter.LLILLJJLI).put(str, nextLiveData);
            }
            LifecycleOwner lifecycleOwner = dataCenter.LLILLL;
            if (lifecycleOwner != null) {
                nextLiveData.observe(lifecycleOwner, observer, false);
            }
        }
    }
}
