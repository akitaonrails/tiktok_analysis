package X;

import android.view.FrameMetrics;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0VV0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VV0 extends AbstractC791320V2k {
    public static final C0VV0 LLILLJJLI = new C0VV0();
    public static final Set<C0VV1> LLILLL = new LinkedHashSet();
    public static volatile boolean LLILZ;

    @Override // X.AbstractC791320V2k
    public final void LJIILLIIL(long j, long j2, String str) {
        Iterator<C0VV1> it2 = LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ();
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIIZILJ(String str, FrameMetrics frameMetrics, int i) {
        Iterator<C0VV1> it2 = LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(frameMetrics);
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILL(long j, long j2, long j3, long j4, boolean z) {
        this.LL = false;
        Iterator<C0VV1> it2 = LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(j, j3, z);
        }
    }
}
