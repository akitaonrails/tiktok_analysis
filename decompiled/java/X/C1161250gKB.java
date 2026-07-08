package X;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.hybrid.spark.raven.data.PageInfo;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0gKB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161250gKB {
    public final ConcurrentHashMap<String, MutableLiveData<C1161140gK0>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C1161180gK4, MutableLiveData<C1161140gK0>> LIZIZ = new ConcurrentHashMap<>();
    public final MutableLiveData<PageInfo> LIZJ = new MutableLiveData<>();

    public final void LIZ(String str) {
        if (!this.LIZ.containsKey(str)) {
            this.LIZ.put(str, new MutableLiveData<>());
        }
    }

    public final void LIZLLL(PageInfo pageInfo) {
        if (pageInfo != null) {
            LIZIZ(this.LIZJ, pageInfo);
        }
    }

    public static void LIZIZ(MutableLiveData mutableLiveData, Object obj) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            mutableLiveData.setValue(obj);
        } else {
            mutableLiveData.postValue(obj);
        }
    }

    public final void LIZJ(List<C1161140gK0> list, boolean z) {
        if (list != null) {
            for (C1161140gK0 c1161140gK0 : list) {
                LIZ(c1161140gK0.LIZ);
                C1161180gK4 c1161180gK4 = c1161140gK0.LIZIZ;
                if (!this.LIZIZ.containsKey(c1161180gK4)) {
                    this.LIZIZ.put(c1161180gK4, new MutableLiveData<>());
                }
                if (z || c1161140gK0.LIZLLL != null) {
                    MutableLiveData<C1161140gK0> mutableLiveData = this.LIZ.get(c1161140gK0.LIZ);
                    if (mutableLiveData != null) {
                        LIZIZ(mutableLiveData, c1161140gK0);
                    }
                    MutableLiveData<C1161140gK0> mutableLiveData2 = this.LIZIZ.get(c1161140gK0.LIZIZ);
                    if (mutableLiveData2 != null) {
                        LIZIZ(mutableLiveData2, c1161140gK0);
                    }
                }
            }
        }
    }
}
