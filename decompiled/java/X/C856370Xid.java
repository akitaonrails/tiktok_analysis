package X;

import Y.AfS183S0100000_14;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import lth.o;

/* JADX INFO: renamed from: X.0Xid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856370Xid extends AbstractC857240Xk2<Unit> {
    public final /* synthetic */ C856350Xib LLILZ;

    @Override // X.AbstractC857240Xk2
    public final void LIZIZ() {
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZLLL() {
    }

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return EnumC856470Xin.PRE_SENSITIVE_TITLE_CHECK.getValue().getSecond();
    }

    public C856370Xid(C856350Xib c856350Xib) {
        this.LLILZ = c856350Xib;
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZ(C857220Xk0 c857220Xk0) {
        C856350Xib c856350Xib = this.LLILZ;
        if (!c856350Xib.LIZ) {
            c857220Xk0.LIZ(this);
            return;
        }
        String str = c856350Xib.LIZLLL;
        if (str == null || str.length() == 0) {
            str = "";
        }
        if (!o.LJIIZILJ.LIZ()) {
            C1444700nhM c1444700nhMLJJIJIIJIL = C0CHQ.LIZ().getPublishService().LJJIJIIJIL();
            EnumC1987607qU enumC1987607qU = EnumC1987607qU.TEXT_TYPE_TITLE;
            c1444700nhMLJJIJIIJIL.getClass();
            C19497811Qa c19497811QaLJLJI = C1444720nhO.LIZ(str, enumC1987607qU).LJLJI(c856350Xib.LJI, TimeUnit.MILLISECONDS);
            C1701890uOB.LIZIZ(16, "initialCapacity");
            C19501211Ri c19501211Ri = new C19501211Ri(c19497811QaLJLJI, 16);
            c856350Xib.LJII = (C11JF) c19501211Ri.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS183S0100000_14(c856350Xib, 11), new AfS183S0100000_14(c856350Xib, 12));
            c856350Xib.LJFF = c19501211Ri;
        }
        c857220Xk0.LIZ(this);
    }
}
