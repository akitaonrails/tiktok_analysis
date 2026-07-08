package X;

import android.os.SystemClock;
import android.util.ArrayMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0krw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335940krw extends C1320270kSf {
    public final Map<String, List<String>> LIZ = new ArrayMap();
    public long LIZIZ = -1;

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZLLL(String str) {
        ((ArrayMap) this.LIZ).remove(str);
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LIZIZ(String str, String str2, Map<String, String> map) {
        List list = (List) ((ArrayMap) this.LIZ).get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LJII(C1325710kbR c1325710kbR, String str, boolean z) {
        List list = (List) ((ArrayMap) this.LIZ).remove(str);
        if (list != null && list.contains("NetworkFetchProducer") && this.LIZIZ > 0) {
            SystemClock.elapsedRealtime();
            this.LIZIZ = -1L;
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZJ(C1325710kbR c1325710kbR, Object obj, String str, boolean z) {
        ((ArrayMap) this.LIZ).put(str, new LinkedList());
        if (this.LIZIZ == -1) {
            this.LIZIZ = SystemClock.elapsedRealtime();
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LJ(C1325710kbR c1325710kbR, String str, Throwable th, boolean z) {
        ((ArrayMap) this.LIZ).remove(str);
    }
}
