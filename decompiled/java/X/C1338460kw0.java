package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338460kw0 {
    public long LIZ;
    public boolean LIZIZ;
    public int LIZJ = 1;
    public int LIZLLL = 200;

    public static boolean LIZ(C1338450kvz c1338450kvz) {
        RecyclerView.LayoutManager layoutManager = c1338450kvz.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.canScrollVertically()) {
            if (c1338450kvz.canScrollVertically(1)) {
                return false;
            }
        } else if (!layoutManager.canScrollHorizontally() || c1338450kvz.canScrollHorizontally(1)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.view.ViewGroup r12, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Boolean, kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338460kw0.LIZIZ(android.view.ViewGroup, kotlin.jvm.functions.Function2):void");
    }

    public final Long LIZJ(long j, Function1<? super Long, Boolean> function1) {
        long j2 = j - this.LIZ;
        if (function1.invoke(Long.valueOf(j2)).booleanValue()) {
            this.LIZ = j;
            return Long.valueOf(j2);
        }
        return null;
    }
}
