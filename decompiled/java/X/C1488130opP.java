package X;

import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0opP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488130opP {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(168));

    public static InterfaceC1484830ok5 LIZIZ() {
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        return C582130MsN.LIZ().LIZJ(c1478410oZj);
    }

    public static InterfaceC1488150opR LIZJ() {
        return (InterfaceC1488150opR) LIZ.getValue();
    }

    public static C1482560ogQ LIZ(C1488140opQ c1488140opQ) {
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = UUID.randomUUID().toString();
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        c1058540deW.LIZLLL = c1488140opQ.LIZIZ;
        if (c1488140opQ.LIZ.length() > 0) {
            c1058540deW.LIZIZ = c1488140opQ.LIZ;
        }
        C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
        boolean z = c1488140opQ.LIZJ;
        C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
        c1479570obb.LIZIZ = z;
        c1479570obb.LJIIIZ = c1488140opQ.LIZLLL;
        int i = c1488140opQ.LJ;
        if (i > 0) {
            c1479570obb.LJIIJ = i;
        }
        int i2 = c1488140opQ.LJFF;
        if (i2 > 0) {
            c1479570obb.LJIIJJI = i2;
        }
        if (c1488140opQ.LJI) {
            c1479570obb.LJIILJJIL = true;
        }
        c1482570ogRLIZ.LIZ(EnumC1046760dLW.VIDEO);
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        return new C1484680ojq(c1482580ogS2).LIZ();
    }

    public static void LIZLLL(final String str, List list) {
        if (!C15536066k.LIZ()) {
            LIZJ().LJIILLIIL(512, list);
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        LIZJ().LJIILLIIL(512, list);
        LIZJ().LIZLLL(new InterfaceC1475300oUi() { // from class: X.0opS
            public final /* synthetic */ String LLILLJJLI = "sleep_hours";

            @Override // X.InterfaceC1475300oUi
            public final /* synthetic */ void Dd(int i, String str2, String str3, String str4) {
            }

            @Override // X.InterfaceC1475300oUi
            public final /* synthetic */ void LLLLZLLIL(String str2) {
            }

            @Override // X.InterfaceC1475300oUi
            public final /* synthetic */ void Sm() {
            }

            @Override // X.InterfaceC1475300oUi
            public final /* synthetic */ void T8(List list2) {
            }

            @Override // X.InterfaceC1475300oUi
            public final /* synthetic */ void Xi(String str2, String str3, long j, long j2) {
            }

            @Override // X.InterfaceC1475300oUi
            public final /* synthetic */ void Z9() {
            }

            @Override // X.InterfaceC1475300oUi
            public final /* synthetic */ void ck() {
            }

            @Override // X.InterfaceC1475300oUi
            public final /* synthetic */ void qc(long j, long j2, String str2) {
            }

            @Override // X.InterfaceC1475300oUi
            public final /* synthetic */ void t8(String str2, long j, long j2, String str3) {
            }

            @Override // X.InterfaceC1475300oUi
            public final void tf(long j, long j2, String str2, String str3) {
                C1202960hPS c1202960hPS = C1202960hPS.LIZ;
                String str4 = str;
                String str5 = this.LLILLJJLI;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c1202960hPS.getClass();
                C1202960hPS.LIZJ(jCurrentTimeMillis2, str4, str5, "video", "success", "none");
                C1488130opP.LIZJ().LIZIZ(this);
            }
        });
    }
}
