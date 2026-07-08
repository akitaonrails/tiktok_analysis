package X;

import android.app.Dialog;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337710kun implements InterfaceC1519605xC {
    public final C1305050k47 LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public boolean LIZLLL;
    public final /* synthetic */ C1337700kum LJ;

    public final void LIZ() {
        Unit unit;
        ViewGroup viewGroup;
        boolean zRemove = this.LJ.LJ.remove(this);
        this.LIZ.LIZ();
        ViewParent parent = this.LIZ.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LIZ, viewGroup);
        }
        if (zRemove && this.LJ.LJ.isEmpty()) {
            try {
                Dialog dialog = this.LJ.LIZIZ;
                if (dialog != null) {
                    dialog.dismiss();
                    C785410UrT.LIZ(dialog);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C1337700kum c1337700kum = this.LJ;
            c1337700kum.LIZIZ = null;
            c1337700kum.LIZJ = null;
            c1337700kum.LIZLLL = null;
        }
    }

    @Override // X.InterfaceC1519605xC
    public final void cancel() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        try {
            Function0<Unit> function0 = this.LIZJ;
            if (function0 != null) {
                function0.invoke();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ();
    }

    public C1337710kun(C1337700kum c1337700kum, C1305050k47 c1305050k47, Function0<Unit> function0, Function0<Unit> function02) {
        this.LJ = c1337700kum;
        this.LIZ = c1305050k47;
        this.LIZIZ = function0;
        this.LIZJ = function02;
    }
}
