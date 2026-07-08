package X;

import X.InterfaceC1891350zJl;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21293418Uq<T extends InterfaceC1891350zJl> implements InterfaceC607860Nsm {
    public static final C21293418Uq<T> LIZ = new C21293418Uq<>();

    @Override // X.InterfaceC607860Nsm
    public final InterfaceC1891350zJl LIZ(List list, C869590Y9l c869590Y9l, int i, String str) {
        C18VH c18vh;
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            c18vh = C18VH.END;
        } else {
            c18vh = C18VH.START;
        }
        String strLJ = C21291518Tx.LJ(EnumC21291418Tw.UNKNOWN_CELL_ERROR_TEXT, new Object[0]);
        String uuid = c869590Y9l.getUuid();
        C909940Zmq c909940Zmq = new C909940Zmq(new C1622006Ws(C452501pT.LIZIZ(new AwS576S0100000_32(c869590Y9l, 731))), c18vh, new C909930Zmp(c869590Y9l), uuid);
        c909940Zmq.LIZ(new C0H93(c869590Y9l.getUuid(), C0ZDX.LJJJJIZL(c869590Y9l), strLJ));
        return c909940Zmq;
    }
}
