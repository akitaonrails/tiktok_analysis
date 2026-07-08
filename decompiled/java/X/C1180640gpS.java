package X;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.slash.data.PageInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180640gpS {
    public final ConcurrentHashMap<String, MutableLiveData<C1180920gpu>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C1180090goZ, MutableLiveData<C1180920gpu>> LIZIZ = new ConcurrentHashMap<>();
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

    public final void LIZJ(List<C1180920gpu> list, boolean z) {
        if (list != null) {
            for (C1180920gpu c1180920gpu : list) {
                LIZ(c1180920gpu.LIZ);
                C1180090goZ c1180090goZ = c1180920gpu.LIZIZ;
                if (!this.LIZIZ.containsKey(c1180090goZ)) {
                    this.LIZIZ.put(c1180090goZ, new MutableLiveData<>());
                }
                if (z || c1180920gpu.LIZLLL != null) {
                    MutableLiveData<C1180920gpu> mutableLiveData = this.LIZ.get(c1180920gpu.LIZ);
                    if (mutableLiveData != null) {
                        LIZIZ(mutableLiveData, c1180920gpu);
                    }
                    MutableLiveData<C1180920gpu> mutableLiveData2 = this.LIZIZ.get(c1180920gpu.LIZIZ);
                    if (mutableLiveData2 != null) {
                        LIZIZ(mutableLiveData2, c1180920gpu);
                    }
                }
            }
        }
        if (z && ((Number) C263590AUr.LIZ.getValue()).intValue() >= 1) {
            Iterator<Map.Entry<String, MutableLiveData<C1180920gpu>>> it2 = this.LIZ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, MutableLiveData<C1180920gpu>> next = it2.next();
                if (next.getValue().getValue() != null) {
                    if (list != null) {
                        Iterator<C1180920gpu> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            C1180920gpu next2 = it3.next();
                            if (Intrinsics.LJFF(next2.LIZ, next.getKey())) {
                                if (next2 != null) {
                                }
                            }
                        }
                    }
                    C1180170goh.LIZLLL().LIZ(new AwS547S0100000_3(next, (Map.Entry<String, MutableLiveData<C1180920gpu>>) 167));
                    it2.remove();
                }
            }
            Iterator<Map.Entry<C1180090goZ, MutableLiveData<C1180920gpu>>> it4 = this.LIZIZ.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry<C1180090goZ, MutableLiveData<C1180920gpu>> next3 = it4.next();
                if (next3.getValue().getValue() != null) {
                    if (list != null) {
                        Iterator<C1180920gpu> it5 = list.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            C1180920gpu next4 = it5.next();
                            if (Intrinsics.LJFF(next4.LIZIZ, next3.getKey())) {
                                if (next4 != null) {
                                }
                            }
                        }
                    }
                    C1180170goh.LIZLLL().LIZ(new AwS547S0100000_3(next3, (Map.Entry<String, MutableLiveData<C1180920gpu>>) 168));
                    it4.remove();
                }
            }
        }
    }
}
