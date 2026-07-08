package X;

import com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870810YEd implements InterfaceC876290YZf {
    public final Function0<Boolean> LIZ;
    public final Function0<InterfaceC868170Y3z> LIZIZ;
    public final C868780Y6i LIZJ;
    public final Function0<C870880YEk> LIZLLL;

    @Override // X.InterfaceC876290YZf
    public final void LIZJ() {
        if (this.LIZ.invoke().booleanValue()) {
            C868780Y6i.LJIILJJIL(this.LIZJ, "ApplicationEventHandler", "onWsConnFailed", 4);
            C870880YEk c870880YEkInvoke = this.LIZLLL.invoke();
            c870880YEkInvoke.LJFF = true;
            C868780Y6i c868780Y6iLIZLLL = c870880YEkInvoke.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onWsConnFailed isBackground ");
            sbLIZ.append(c870880YEkInvoke.LIZIZ);
            sbLIZ.append(" interval ");
            sbLIZ.append(c870880YEkInvoke.LIZ.LJIIIZ().LJJJ.LIZIZ);
            C868780Y6i.LJ(c868780Y6iLIZLLL, "ImSDKMonitorHelper", C2188811AlT.LIZIZ(sbLIZ), 4);
            if (!c870880YEkInvoke.LIZ.LJIIIZ().LJJJ.LIZ || c870880YEkInvoke.LIZ.LJ().LJ().isAppBackground()) {
                return;
            }
            c870880YEkInvoke.LIZ.LJIIZILJ().LJ().LIZIZ().LIZLLL();
        }
    }

    @Override // X.InterfaceC876290YZf
    public final void LJ() {
        if (this.LIZ.invoke().booleanValue()) {
            C868780Y6i.LJIILJJIL(this.LIZJ, "ApplicationEventHandler", "onWsConnSuccess", 4);
            C870880YEk c870880YEkInvoke = this.LIZLLL.invoke();
            C868780Y6i.LJIILJJIL(c870880YEkInvoke.LIZ.LIZLLL(), "ImSDKMonitorHelper", "onWsConnSuccess", 4);
            c870880YEkInvoke.LIZ.LJIIZILJ().LJ().LIZIZ().LIZ();
            if (c870880YEkInvoke.LJ && c870880YEkInvoke.LJFF) {
                c870880YEkInvoke.LIZ.LJIIIZ().getClass();
            }
            c870880YEkInvoke.LJ = true;
            c870880YEkInvoke.LJFF = false;
        }
    }

    @Override // X.InterfaceC876290YZf
    public final void LJFF() {
        if (this.LIZ.invoke().booleanValue()) {
            C868780Y6i c868780Y6i = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onNetworkChanged, ");
            sbLIZ.append(true);
            C868780Y6i.LJIILJJIL(c868780Y6i, "ApplicationEventHandler", C2188811AlT.LIZIZ(sbLIZ), 4);
            this.LIZLLL.invoke().LIZLLL.getDomain().LIZJ().LLLFZ();
        }
    }

    @Override // X.InterfaceC876290YZf
    public final void LIZIZ(long j) {
        if (!this.LIZ.invoke().booleanValue()) {
            return;
        }
        LJ();
        this.LIZIZ.invoke().LJIIZILJ(j);
    }

    @Override // X.InterfaceC876290YZf
    public final void LIZLLL(boolean z) {
        if (!this.LIZ.invoke().booleanValue()) {
            return;
        }
        if (z) {
            C870880YEk c870880YEkInvoke = this.LIZLLL.invoke();
            C868780Y6i.LJIILJJIL(c870880YEkInvoke.LIZ.LIZLLL(), "ImSDKMonitorHelper", "switchToBackground", 4);
            if (c870880YEkInvoke.LIZIZ.compareAndSet(false, true)) {
                c870880YEkInvoke.LIZ.LJIIZILJ().LJ().LIZIZ().LIZ();
                C23250099c.LIZLLL(c870880YEkInvoke.LIZ.LIZJ(), C0PEM.LIZ, null, new C870850YEh(c870880YEkInvoke, null), 2);
            }
            ReceiveMsgPerfTracker receiveMsgPerfTrackerLJFF = c870880YEkInvoke.LIZ.LJ().getMessage().LJFF();
            if (receiveMsgPerfTrackerLJFF != null) {
                receiveMsgPerfTrackerLJFF.LIZIZ();
                return;
            }
            return;
        }
        C870880YEk c870880YEkInvoke2 = this.LIZLLL.invoke();
        C868780Y6i.LJIILJJIL(c870880YEkInvoke2.LIZ.LIZLLL(), "ImSDKMonitorHelper", "switchToForeground", 4);
        C23250099c.LIZLLL(c870880YEkInvoke2.LIZ.LIZJ(), C0PEM.LIZ, null, new C870820YEe(c870880YEkInvoke2, c870880YEkInvoke2.LIZIZ.compareAndSet(true, false), null), 2);
    }

    @Override // X.InterfaceC876290YZf
    public final void LIZ(String str, byte[] bArr) {
        if (!this.LIZ.invoke().booleanValue()) {
            return;
        }
        LJ();
        InterfaceC868170Y3z interfaceC868170Y3zInvoke = this.LIZIZ.invoke();
        if (str == null) {
            str = "";
        }
        interfaceC868170Y3zInvoke.LLIIZ(str, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C870810YEd(Function0<Boolean> function0, Function0<? extends InterfaceC868170Y3z> function02, C868780Y6i c868780Y6i, Function0<C870880YEk> function03) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = c868780Y6i;
        this.LIZLLL = function03;
    }
}
