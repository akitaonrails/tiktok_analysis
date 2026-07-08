package X;

import android.view.Window;
import java.util.EnumSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IYH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IYH {
    public static final /* synthetic */ int LIZJ = 0;
    public final Function0<Window> LIZ;
    public final EnumSet<C0IIP> LIZIZ = EnumSet.noneOf(C0IIP.class);

    public final synchronized void LIZIZ() {
        if (this.LIZIZ.isEmpty()) {
            return;
        }
        this.LIZIZ.clear();
        LIZ(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0IYH(Function0<? extends Window> function0) {
        this.LIZ = function0;
    }

    public final void LIZ(boolean z) {
        Window windowInvoke = this.LIZ.invoke();
        if (windowInvoke == null) {
            C20441214yg.LJ("AntiScreenRecordController", "applyFlag window is null");
        } else if (z) {
            windowInvoke.setFlags(8192, 8192);
        } else {
            windowInvoke.clearFlags(8192);
        }
    }

    public final synchronized void LIZJ(C0IIP c0iip, boolean z) {
        boolean zRemove;
        boolean zIsEmpty = this.LIZIZ.isEmpty();
        if (z) {
            zRemove = this.LIZIZ.add(c0iip);
        } else {
            zRemove = this.LIZIZ.remove(c0iip);
        }
        if (!zRemove) {
            return;
        }
        boolean zIsEmpty2 = this.LIZIZ.isEmpty();
        if (zIsEmpty) {
            if (!zIsEmpty2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setSource ");
                sbLIZ.append(c0iip);
                sbLIZ.append(" active: true");
                C20441214yg.LIZIZ("AntiScreenRecordController", C2188811AlT.LIZIZ(sbLIZ));
                LIZ(true);
            }
        } else if (zIsEmpty2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setSource ");
            sbLIZ2.append(c0iip);
            sbLIZ2.append(" active: false");
            C20441214yg.LIZIZ("AntiScreenRecordController", C2188811AlT.LIZIZ(sbLIZ2));
            LIZ(false);
        }
    }
}
