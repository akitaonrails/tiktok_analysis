package X;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;

/* JADX INFO: renamed from: X.11do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19547411do implements InterfaceC19549111e5 {
    public C19547511dp LIZ;
    public C19547511dp LIZIZ;

    public final void LJIIJ() throws JSONException {
        C201955140j.LIZIZ("VoiceConversionStream", "begin init");
        if (this.LIZ == null) {
            this.LIZ = new C19547511dp();
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new C19547511dp();
        }
        C19547511dp c19547511dp = this.LIZ;
        if (c19547511dp != null) {
            c19547511dp.LIZIZ();
        }
        C19547511dp c19547511dp2 = this.LIZIZ;
        if (c19547511dp2 != null) {
            c19547511dp2.LIZIZ();
        }
    }

    public final void LJIIL() {
        C19547511dp c19547511dp = this.LIZ;
        if (c19547511dp != null) {
            c19547511dp.LIZLLL();
        }
        C19547511dp c19547511dp2 = this.LIZIZ;
        if (c19547511dp2 != null) {
            c19547511dp2.LIZLLL();
        }
    }

    public final void LJ(boolean z) {
        C201955140j.LIZIZ("VoiceConversionStream", "begin cancel");
        if (z) {
            C19547511dp c19547511dp = this.LIZIZ;
            if (c19547511dp != null) {
                c19547511dp.LJFF.clear();
                c19547511dp.LJ.clear();
                C19547811ds c19547811ds = c19547511dp.LIZJ;
                if (c19547811ds != null) {
                    new C19547611dq();
                    C23250099c.LIZLLL((InterfaceC497601wk) c19547811ds.LJFF.getValue(), null, null, new C19547911dt(c19547811ds, null), 3);
                    return;
                }
                return;
            }
            return;
        }
        C19547511dp c19547511dp2 = this.LIZ;
        if (c19547511dp2 == null) {
            return;
        }
        c19547511dp2.LJFF.clear();
        c19547511dp2.LJ.clear();
        C19547811ds c19547811ds2 = c19547511dp2.LIZJ;
        if (c19547811ds2 == null) {
            return;
        }
        new C19547611dq();
        C23250099c.LIZLLL((InterfaceC497601wk) c19547811ds2.LJFF.getValue(), null, null, new C19547911dt(c19547811ds2, null), 3);
    }

    public final void LJI(boolean z) {
        C201955140j.LIZIZ("VoiceConversionStream", "begin destroy");
        if (z) {
            C19547511dp c19547511dp = this.LIZIZ;
            if (c19547511dp != null) {
                C201955140j.LIZIZ("VoiceConversionStream", "blockingQueue.add:TYPE_DESTROY");
                LinkedBlockingQueue<C19547611dq> linkedBlockingQueue = c19547511dp.LIZ;
                C19547611dq c19547611dq = new C19547611dq();
                c19547611dq.LIZ = 3;
                linkedBlockingQueue.add(c19547611dq);
                return;
            }
            return;
        }
        C19547511dp c19547511dp2 = this.LIZ;
        if (c19547511dp2 == null) {
            return;
        }
        C201955140j.LIZIZ("VoiceConversionStream", "blockingQueue.add:TYPE_DESTROY");
        LinkedBlockingQueue<C19547611dq> linkedBlockingQueue2 = c19547511dp2.LIZ;
        C19547611dq c19547611dq2 = new C19547611dq();
        c19547611dq2.LIZ = 3;
        linkedBlockingQueue2.add(c19547611dq2);
    }

    public final int LJIIIIZZ(boolean z) {
        C19547811ds c19547811ds;
        C19547611dq c19547611dq;
        Integer numValueOf;
        C19547811ds c19547811ds2;
        C19547611dq c19547611dq2;
        Integer numValueOf2;
        if (z) {
            C19547511dp c19547511dp = this.LIZIZ;
            if (c19547511dp != null && (c19547811ds2 = c19547511dp.LIZJ) != null && (c19547611dq2 = c19547811ds2.LIZLLL) != null && (numValueOf2 = Integer.valueOf(c19547611dq2.LJFF)) != null) {
                return numValueOf2.intValue();
            }
            return 0;
        }
        C19547511dp c19547511dp2 = this.LIZ;
        if (c19547511dp2 != null && (c19547811ds = c19547511dp2.LIZJ) != null && (c19547611dq = c19547811ds.LIZLLL) != null && (numValueOf = Integer.valueOf(c19547611dq.LJFF)) != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final long LJIIIZ(boolean z) {
        if (z) {
            C19547511dp c19547511dp = this.LIZIZ;
            if (c19547511dp != null) {
                return c19547511dp.LIZLLL;
            }
            return 0L;
        }
        C19547511dp c19547511dp2 = this.LIZ;
        if (c19547511dp2 != null) {
            return c19547511dp2.LIZLLL;
        }
        return 0L;
    }

    public final void LJIILIIL(C19546611dg c19546611dg) {
        C19547811ds c19547811ds;
        C19547511dp c19547511dp = this.LIZ;
        if (c19547511dp != null && (c19547811ds = c19547511dp.LIZJ) != null) {
            c19547811ds.LIZIZ = new C19548511dz(c19547511dp, c19546611dg);
        }
    }

    public final void LJIILJJIL(C19546711dh c19546711dh) {
        C19547811ds c19547811ds;
        C19547511dp c19547511dp = this.LIZIZ;
        if (c19547511dp != null && (c19547811ds = c19547511dp.LIZJ) != null) {
            c19547811ds.LIZIZ = new C19548511dz(c19547511dp, c19546711dh);
        }
    }

    public final void LJFF(String str, boolean z) {
        if (z) {
            C19547511dp c19547511dp = this.LIZIZ;
            if (c19547511dp != null) {
                c19547511dp.LIZ(str, false);
                return;
            }
            return;
        }
        C19547511dp c19547511dp2 = this.LIZ;
        if (c19547511dp2 == null) {
            return;
        }
        c19547511dp2.LIZ(str, false);
    }

    public final boolean LJIIJJI(String str, boolean z) {
        if (z) {
            C19547511dp c19547511dp = this.LIZIZ;
            if (c19547511dp != null) {
                return c19547511dp.LIZJ(str);
            }
            return false;
        }
        C19547511dp c19547511dp2 = this.LIZ;
        if (c19547511dp2 != null) {
            return c19547511dp2.LIZJ(str);
        }
        return false;
    }

    public final void LJIILL(String str, int i, List<String> list, List<String> list2, List<Long> list3, List<Long> list4, List<Long> list5, List<Long> list6, String str2) {
        C201955140j.LIZIZ("VoiceConversionStream", "begin startStreamVC");
        C19547511dp c19547511dp = this.LIZ;
        if (c19547511dp != null) {
            c19547511dp.LJ(str, i, list, list2, list3, list4, list5, list6, str2);
        }
    }

    public final void LJIIZILJ(String str, int i, List<String> list, List<String> list2, List<Long> list3, List<Long> list4, List<Long> list5, List<Long> list6, String str2) {
        C201955140j.LIZIZ("VoiceConversionStream", "begin startStreamVC");
        C19547511dp c19547511dp = this.LIZIZ;
        if (c19547511dp != null) {
            c19547511dp.LJ(str, i, list, list2, list3, list4, list5, list6, str2);
        }
    }
}
