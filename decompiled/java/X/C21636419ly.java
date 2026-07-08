package X;

import android.app.Dialog;
import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.19ly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21636419ly extends C09AY implements Function1<C0LCS<? extends Boolean>, Unit> {
    public final /* synthetic */ C556940Lsq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21636419ly(C556940Lsq c556940Lsq) {
        super(1);
        this.LL = c556940Lsq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0LCS<? extends Boolean> c0lcs) {
        C21636519lz c21636519lz;
        ViewGroup viewGroup;
        C0LCS<? extends Boolean> c0lcs2 = c0lcs;
        this.LL.LLJLL = ((Boolean) c0lcs2.LIZ).booleanValue();
        if (((Boolean) c0lcs2.LIZ).booleanValue() && this.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            final C556940Lsq c556940Lsq = this.LL;
            HandlerHook.viewPost(c556940Lsq.mView, new Runnable() { // from class: X.19lw
                /* JADX WARN: Removed duplicated region for block: B:31:0x0146  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 335
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC21636219lw.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("InputMentionPanelScene@f5f2.initObserver$2$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("InputMentionPanelScene@f5f2.initObserver$2$1");
                }
            });
        } else {
            C21636319lx c21636319lxLLLLLJLJLL = this.LL.LLLLLJLJLL();
            Dialog dialog = c21636319lxLLLLLJLJLL.LIZJ;
            if (dialog != null) {
                dialog.hide();
            }
            Dialog dialog2 = c21636319lxLLLLLJLJLL.LIZJ;
            if (dialog2 != null) {
                dialog2.dismiss();
                C785410UrT.LIZ(dialog2);
            }
            ViewParent parent = c21636319lxLLLLLJLJLL.LIZIZ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c21636319lxLLLLLJLJLL.LIZIZ, viewGroup);
            }
            c21636319lxLLLLLJLJLL.LIZJ = null;
            c21636319lxLLLLLJLJLL.LJ = null;
            if (Build.VERSION.SDK_INT >= 31 && (c21636519lz = c21636319lxLLLLLJLJLL.LJIIL) != null) {
                c21636519lz.LIZ.removeCrossWindowBlurEnabledListener(c21636519lz.LIZJ);
            }
            c21636319lxLLLLLJLJLL.LJIIL = null;
        }
        return Unit.LIZ;
    }
}
