package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146540fwS {
    public static final C1146350fw9 LIZ(C1146430fwH c1146430fwH, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        int iLIZLLL;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "gift_clicked_by_creator") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "gift_id", -1)) <= 0) {
            return null;
        }
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        double dLIZJ = -1.0d;
        if (interfaceC1107590evd2 != null) {
            dLIZJ = C1871910yoP.LIZJ(interfaceC1107590evd2, "event_id", -1.0d);
        }
        long j = (long) dLIZJ;
        if (j == -1) {
            C1146360fwA c1146360fwA = c1146430fwH.LIZ;
            if (c1146360fwA != null) {
                j = c1146360fwA.LLILLJJLI;
            } else {
                j = 0;
            }
        }
        return C1146440fwI.LIZ(c1146430fwH, new C1146550fwT(iLIZLLL, j));
    }
}
