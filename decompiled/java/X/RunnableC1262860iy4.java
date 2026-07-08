package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iy4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class RunnableC1262860iy4 implements Runnable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ C1262850iy3 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    public RunnableC1262860iy4(int i, int i2, View view, C1262850iy3 c1262850iy3, Function0 function0) {
        this.LL = i;
        this.LLILLJJLI = view;
        this.LLILLL = c1262850iy3;
        this.LLILZ = i2;
        this.LLILZIL = function0;
    }

    public final void LIZ() {
        int height = this.LL;
        if (height == -1) {
            height = this.LLILLJJLI.getHeight();
        }
        if (LIZIZ(height, this.LLILZ, this.LLILLJJLI, this.LLILLL, this.LLILZIL)) {
            return;
        }
        View view = this.LLILLJJLI;
        C447550Hgn.LIZIZ(view, new C1262880iy6(height, this.LLILZ, view, this.LLILLL, this.LLILZIL));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("RecUserDialogController@fee0.adjustSize$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecUserDialogController@fee0.adjustSize$1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(int r10, int r11, android.view.View r12, final X.C1262850iy3 r13, kotlin.jvm.functions.Function0 r14) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1262860iy4.LIZIZ(int, int, android.view.View, X.0iy3, kotlin.jvm.functions.Function0):boolean");
    }
}
