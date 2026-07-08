package X;

import com.bytedance.pipo.ttpay.portal.TiktokPayFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776080wJq implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        switch (this.$t) {
            case 0:
                mh2$0(this, c262100zr);
                break;
            case 1:
                mh2$1(this, c262100zr);
                break;
        }
    }

    public C1776080wJq(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C1776080wJq c1776080wJq, C262100zr c262100zr) {
        C19EG activity = ((TiktokPayFragment) c1776080wJq.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void mh2$1(C1776080wJq c1776080wJq, C262100zr c262100zr) {
        try {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                C1713570uh1 c1713570uh1 = (C1713570uh1) c1776080wJq.l0;
                C1714260ui8.LIZ.getClass();
                C1714260ui8.LIZIZ(c1713570uh1, interfaceC1107590evd);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            ((C1713570uh1) c1776080wJq.l0).LJIILIIL.LIZ(C1713490ugt.LIZ("Error from js Event", th, 4));
        }
    }
}
