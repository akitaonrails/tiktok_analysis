package X;

import Y.AObjectS282S0200000_3;
import Y.AObjectS379S0100000_3;
import Y.AObjectS401S0100000_27;
import Y.AObjectS78S0000000_28;
import Y.AObjectS92S1100000_3;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10c7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19282110c7 {
    public static final C01GW<C19282110c7> LJ = C452501pT.LIZIZ(new AObjectS78S0000000_28(18));
    public long LIZ;
    public String LIZIZ = "";
    public C19282410cA LIZJ;
    public boolean LIZLLL;

    public C19282110c7() {
        LIZJ(EnumC1779550wPR.INIT);
    }

    public static void LIZLLL(List list) {
        C13IV c13iv = C19253410Ua.LIZ;
        c13iv.getClass();
        String strLIZJ = c13iv.LIZJ(new C19979613Fi(C19282410cA.Companion.serializer()), list);
        C19281810c4.LIZ.getClass();
        C10ZP.LIZJ("active_manager", "active_days_record", strLIZJ);
    }

    public final void LIZIZ(long j) {
        try {
            if (this.LIZLLL) {
                C19282310c9.LIZIZ("DelayTask", new AObjectS78S0000000_28(21));
                return;
            }
            this.LIZLLL = true;
            C19282310c9.LIZIZ("DelayTask", new AObjectS78S0000000_28(19));
            C19282010c6.LIZ(j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19282310c9.LIZIZ("DelayTask", new Function0() { // from class: X.006U
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Exception exc = e;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("createDelayTask error, e: ");
                    sbLIZ.append(exc.getMessage());
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            });
        }
    }

    public final void LIZJ(final EnumC1779550wPR enumC1779550wPR) {
        boolean z;
        List listLL;
        EnumC19282510cB enumC19282510cB;
        if (this.LIZLLL && enumC1779550wPR == EnumC1779550wPR.DELAY_TASK) {
            this.LIZLLL = false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (enumC1779550wPR != EnumC1779550wPR.DELAY_TASK && jCurrentTimeMillis - this.LIZ < 60000) {
            C19282310c9.LIZIZ("Launch", new AObjectS379S0100000_3(enumC1779550wPR, 10));
            return;
        }
        this.LIZ = jCurrentTimeMillis;
        final String str = ((DateFormat) C0W4R.LIZ.getValue()).format(new Date(jCurrentTimeMillis));
        if (this.LIZIZ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && Intrinsics.LJFF(this.LIZIZ, str)) {
            C19282310c9.LIZIZ("CheckSameDay", new Function0() { // from class: X.0wPt
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    C19282110c7 c19282110c7 = this.LL;
                    String str2 = str;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("same day not run, currentDay:");
                    sbLIZ.append(c19282110c7.LIZIZ);
                    sbLIZ.append(" now:");
                    sbLIZ.append(str2);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            });
            LIZIZ(jCurrentTimeMillis);
            return;
        }
        C19281810c4.LIZ.getClass();
        String strLIZ = C10ZP.LIZ("active_manager", "active_days_record");
        if (strLIZ.length() == 0) {
            listLL = C13BV.INSTANCE;
        } else {
            C13IV c13iv = C19253410Ua.LIZ;
            c13iv.getClass();
            listLL = C13LP.LL((Iterable) c13iv.LIZIZ(new C19979613Fi(C19282410cA.Companion.serializer()), strLIZ), 59);
        }
        C19282310c9.LIZIZ("Record", new AObjectS282S0200000_3(enumC1779550wPR, listLL, 0));
        if (true ^ listLL.isEmpty()) {
            final C19282410cA c19282410cA = (C19282410cA) ListProtector.get(listLL, 0);
            if (Intrinsics.LJFF(c19282410cA.LIZIZ, str)) {
                this.LIZIZ = c19282410cA.LIZIZ;
                this.LIZJ = c19282410cA;
                C19282310c9.LIZIZ("CheckSameDay", new Function0() { // from class: X.0wKW
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        EnumC1779550wPR enumC1779550wPR2 = enumC1779550wPR;
                        C19282410cA c19282410cA2 = c19282410cA;
                        String str2 = str;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("enterFrom(");
                        sbLIZ.append(enumC1779550wPR2);
                        sbLIZ.append(") same day not run,  recentDay:");
                        sbLIZ.append(c19282410cA2.LIZIZ);
                        sbLIZ.append(", now:");
                        sbLIZ.append(str2);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                });
                LIZIZ(jCurrentTimeMillis);
                return;
            }
        }
        C19282310c9.LIZIZ("Launch", new AObjectS92S1100000_3(enumC1779550wPR, str, 1));
        this.LIZIZ = str;
        C19282410cA c19282410cA2 = new C19282410cA(0);
        c19282410cA2.LIZ = jCurrentTimeMillis;
        c19282410cA2.LIZIZ = str;
        if (listLL.isEmpty()) {
            c19282410cA2.LIZJ = EnumC19282510cB.RECORD_LESS_30.toString();
            LIZLLL(Collections.singletonList(c19282410cA2));
            C19282310c9.LIZIZ("NewDay", new AObjectS401S0100000_27(c19282410cA2, 6));
        } else {
            C19282410cA c19282410cA3 = (C19282410cA) ListProtector.get(listLL, 0);
            long j = c19282410cA3.LIZ;
            long j2 = c19282410cA2.LIZ;
            if (j > j2) {
                c19282410cA2.LIZJ = EnumC19282510cB.RECORD_LESS_30.toString();
                LIZLLL(Collections.singletonList(c19282410cA2));
                C19282910cF c19282910cF = C19282910cF.LIZ;
                final long j3 = c19282410cA2.LIZ;
                final long j4 = c19282410cA3.LIZ;
                c19282910cF.getClass();
                C20684815ws.LJIILLIIL("reset_when_change_time", new HashMap());
                C19282310c9.LIZ(new Function0() { // from class: X.0W4S
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        long j5 = j3;
                        long j6 = j4;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reset_when_change_time, now:");
                        sbLIZ.append(C0W4R.LIZIZ(j5));
                        sbLIZ.append(", lastLaunch:");
                        sbLIZ.append(C0W4R.LIZIZ(j6));
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                });
                C19282310c9.LIZIZ("NewDay", new AObjectS78S0000000_28(20));
            } else {
                c19282410cA2.LJI = C0W4R.LIZ(j2, j);
                int iLIZ = C0W4R.LIZ(c19282410cA2.LIZ, ((C19282410cA) ListProtector.get(listLL, listLL.size() - 1)).LIZ);
                c19282410cA2.LJFF = iLIZ;
                int iLIZ2 = LIZ(30, c19282410cA2.LIZ, listLL);
                c19282410cA2.LIZLLL = iLIZ2;
                c19282410cA2.LJ = LIZ(5, c19282410cA2.LIZ, listLL);
                if (iLIZ > 30) {
                    if (iLIZ2 == 0) {
                        enumC19282510cB = EnumC19282510cB.RETURN_USER;
                    } else if (iLIZ2 < 3) {
                        enumC19282510cB = EnumC19282510cB.LOW_ACTIVE_30_2;
                    } else if (iLIZ2 < 10) {
                        enumC19282510cB = EnumC19282510cB.LOW_ACTIVE_30_9;
                    } else {
                        enumC19282510cB = EnumC19282510cB.NORMAL;
                    }
                } else {
                    enumC19282510cB = EnumC19282510cB.RECORD_LESS_30;
                }
                c19282410cA2.LIZJ = enumC19282510cB.toString();
                C19282310c9.LIZIZ("NewDay", new AObjectS401S0100000_27(c19282410cA2, 7));
                LIZLLL(C13LP.LJLIL(listLL, Collections.singletonList(c19282410cA2)));
                C19282910cF.LIZ.getClass();
                C1904800zfS.LIZ.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C19282210c8(c19282410cA2, null), 3);
            }
        }
        this.LIZJ = c19282410cA2;
        LIZIZ(jCurrentTimeMillis);
    }

    public static int LIZ(final int i, long j, final List list) {
        int size = list.size();
        for (final int i2 = 0; i2 < size; i2++) {
            final int iAbs = Math.abs(C0W4R.LIZ(j, ((C19282410cA) ListProtector.get(list, i2)).LIZ));
            if (iAbs > i) {
                C19282310c9.LIZIZ("computeActiveDays", new Function0() { // from class: X.04y9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i;
                        int i4 = i2;
                        List list2 = list;
                        int i5 = iAbs;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("range: ");
                        sbLIZ.append(i3);
                        sbLIZ.append(", index: ");
                        sbLIZ.append(i4);
                        sbLIZ.append(", day: ");
                        sbLIZ.append(ListProtector.get(list2, i4));
                        sbLIZ.append(", diff: ");
                        sbLIZ.append(i5);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                });
                return i2;
            }
        }
        C19282310c9.LIZIZ("computeActiveDays", new Function0() { // from class: X.04w7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                List list2 = list;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("range: ");
                sbLIZ.append(i3);
                sbLIZ.append(", recordList.size: ");
                sbLIZ.append(list2.size());
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        });
        return list.size();
    }
}
