package X;

import com.bytedance.keva.Keva;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Q6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06Q6 implements InterfaceC892100YzA {
    public static final C06Q6 LIZ = new C06Q6();
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS187S0000000_2.get$arr$(1349));

    public static String LJI() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    public static Keva LJIIIIZZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static final C06Q5 LJIIIZ(int i, String str) {
        String strLJI = LJI();
        return new C06Q5(LJIIIIZZ().getInt(LJII(i, strLJI, str, "_status"), 1), LJIIIIZZ().getInt(LJII(i, strLJI, str, "_error_code"), -1));
    }

    @Override // X.InterfaceC892100YzA
    public final void LIZ(int i, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Keva kevaLJIIIIZZ = LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJI());
        sbLIZ.append('_');
        sbLIZ.append(i);
        sbLIZ.append("__last_success_time");
        kevaLJIIIIZZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
        Keva kevaLJIIIIZZ2 = LJIIIIZZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJI());
        sbLIZ2.append('_');
        sbLIZ2.append(i);
        sbLIZ2.append("__last_success_start_time");
        kevaLJIIIIZZ2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), jCurrentTimeMillis - j);
    }

    @Override // X.InterfaceC892100YzA
    public final void LIZIZ(int i, int i2) {
        Keva kevaLJIIIIZZ = LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJI());
        sbLIZ.append('_');
        sbLIZ.append(i2);
        sbLIZ.append("__last_error_code");
        kevaLJIIIIZZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
        Keva kevaLJIIIIZZ2 = LJIIIIZZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJI());
        sbLIZ2.append('_');
        sbLIZ2.append(i2);
        sbLIZ2.append("__last_error_time");
        kevaLJIIIIZZ2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), System.currentTimeMillis());
    }

    @Override // X.InterfaceC892100YzA
    public final Pair LIZJ(int i, String str) {
        Keva kevaLJIIIIZZ = LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(i);
        sbLIZ.append("__last_error_code");
        int i2 = kevaLJIIIIZZ.getInt(C2188811AlT.LIZIZ(sbLIZ), -1);
        Keva kevaLJIIIIZZ2 = LJIIIIZZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(i);
        sbLIZ2.append("__last_error_time");
        return new Pair(Integer.valueOf(i2), Long.valueOf(kevaLJIIIIZZ2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L)));
    }

    @Override // X.InterfaceC892100YzA
    public final long LIZLLL(int i, String str) {
        Keva kevaLJIIIIZZ = LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(i);
        sbLIZ.append("__last_success_start_time");
        return kevaLJIIIIZZ.getLong(C2188811AlT.LIZIZ(sbLIZ), Long.MAX_VALUE);
    }

    @Override // X.InterfaceC892100YzA
    public final long LJ(int i, String str) {
        Keva kevaLJIIIIZZ = LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(i);
        sbLIZ.append("__last_success_time");
        return kevaLJIIIIZZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static String LJII(int i, String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC892100YzA
    public final void LJFF(int i, int i2, int i3, String str) {
        if (LJIIIIZZ().count() > 500) {
            LJIIIIZZ().clear();
        }
        String strLJI = LJI();
        LJIIIIZZ().storeInt(LJII(i2, strLJI, str, "_status"), i);
        LJIIIIZZ().storeInt(LJII(i2, strLJI, str, "_error_code"), i3);
    }
}
