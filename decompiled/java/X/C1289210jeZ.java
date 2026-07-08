package X;

import com.lynx.animax.ability.BaseAbility;
import com.lynx.animax.util.LynxAnimaX;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0jeZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289210jeZ extends BaseAbility implements InterfaceC1288110jcn {
    public boolean LJII = true;
    public final WeakReference<LynxBaseUI> LJIIIIZZ;
    public final WeakReference<s> LJIIIZ;

    @Override // com.lynx.animax.ability.BaseAbility
    public final C1285680jYs LJIIL() {
        return LynxAnimaX.inst().getScope();
    }

    @Override // X.InterfaceC1288110jcn
    public final void LIZ(C1288070jcj c1288070jcj) {
        if (this.LJII) {
            LJIILJJIL(c1288070jcj, "update");
        }
    }

    @Override // X.InterfaceC1288110jcn
    public final void LIZIZ(C1288070jcj c1288070jcj) {
        LJIILJJIL(c1288070jcj, "firstframe");
    }

    @Override // X.InterfaceC1288110jcn
    public final void LIZJ(C1288070jcj c1288070jcj) {
        LJIILJJIL(c1288070jcj, "repeat");
    }

    @Override // X.InterfaceC1288110jcn
    public final void LIZLLL(C1288070jcj c1288070jcj) {
        LJIILJJIL(c1288070jcj, "compositionready");
    }

    @Override // X.InterfaceC1288110jcn
    public final void LJ(C1288070jcj c1288070jcj) {
        LJIILJJIL(c1288070jcj, "completion");
    }

    @Override // X.InterfaceC1288110jcn
    public final void LJFF(C1288090jcl c1288090jcl) {
        LJIILJJIL(c1288090jcl, "fps");
    }

    @Override // X.InterfaceC1288110jcn
    public final void LJI(C1288060jci c1288060jci) {
        LJIILJJIL(c1288060jci, "warning");
        LJIILL(c1288060jci, "warn");
    }

    @Override // X.InterfaceC1288110jcn
    public final void LJII(C1288100jcm c1288100jcm) {
        LJIILJJIL(c1288100jcm, "taplayers");
    }

    @Override // X.InterfaceC1288110jcn
    public final void LJIIIIZZ(C1288060jci c1288060jci) {
        int iLIZ = c1288060jci.LIZ();
        if (iLIZ != EnumC1285690jYt.VIDEO_PLAYER_ERROR.getErrorCode() && iLIZ != EnumC1285690jYt.VIDEO_PLAYER_ERROR_HAS_OCCURRED.getErrorCode()) {
            LJIILJJIL(c1288060jci, "error");
            LJIILL(c1288060jci, "error");
        }
    }

    @Override // X.InterfaceC1288110jcn
    public final void LJIIIZ(C1288070jcj c1288070jcj) {
        LJIILJJIL(c1288070jcj, "start");
    }

    @Override // X.InterfaceC1288110jcn
    public final void LJIIJ(C1288070jcj c1288070jcj) {
        LJIILJJIL(c1288070jcj, "cancel");
    }

    @Override // X.InterfaceC1288110jcn
    public final void LJIIJJI(C1288070jcj c1288070jcj) {
        LJIILJJIL(c1288070jcj, "ready");
    }

    @Override // com.lynx.animax.ability.BaseAbility
    public final String LJIILIIL(String str) {
        s sVar = this.LJIIIZ.get();
        if (sVar == null) {
            return str;
        }
        return C1294030jmL.LIZ(sVar, str, false);
    }

    public C1289210jeZ(s sVar, LynxBaseUI lynxBaseUI) {
        this.LJIIIIZZ = new WeakReference<>(lynxBaseUI);
        this.LJIIIZ = new WeakReference<>(sVar);
        ((CopyOnWriteArrayList) this.LIZ).add(this);
    }

    public final void LJIILJJIL(C1288070jcj c1288070jcj, final String str) {
        C1298720jtu c1298720jtu;
        LynxBaseUI lynxBaseUI = this.LJIIIIZZ.get();
        s sVar = this.LJIIIZ.get();
        if (lynxBaseUI == null || sVar == null || (c1298720jtu = sVar.LLIZ) == null) {
            return;
        }
        final int sign = lynxBaseUI.getSign();
        final Map<String, Object> map = c1288070jcj.LIZ;
        c1298720jtu.LIZIZ(new C1298700jts(sign, str, map) { // from class: X.0jeb
            @Override // X.C1298700jts
            public final String LIZLLL() {
                return "detail";
            }
        });
    }

    public final void LJIILL(C1288060jci c1288060jci, String str) {
        s sVar = this.LJIIIZ.get();
        if (sVar == null) {
            return;
        }
        LynxError lynxError = new LynxError(c1288060jci.LIZ(), -2, c1288060jci.LIZIZ(), "", str);
        lynxError.LIZ = true;
        sVar.LJIILLIIL(lynxError);
    }
}
