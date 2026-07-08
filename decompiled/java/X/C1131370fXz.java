package X;

import com.bytedance.android.livesdk.limitation.dialog.GiftLimitDialog;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0fXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131370fXz {
    public static long LIZ;
    public static long LIZIZ;
    public static WeakReference<InterfaceC420801kM> LIZJ;
    public static GiftLimitDialog LIZLLL;
    public static EnumC1127360fRW LJ = EnumC1127360fRW.Idle;

    public static void LIZ() {
        InterfaceC420801kM interfaceC420801kM;
        LJ = EnumC1127360fRW.Idle;
        LIZ = 0L;
        WeakReference<InterfaceC420801kM> weakReference = LIZJ;
        if (weakReference == null || (interfaceC420801kM = weakReference.get()) == null) {
            return;
        }
        interfaceC420801kM.dispose();
    }

    public static String LIZIZ() {
        String strLIZIZ;
        String strLIZIZ2;
        long j = LIZ;
        if (j <= 0) {
            return "";
        }
        int i = (int) (j / 1000);
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 >= 10) {
            strLIZIZ = String.valueOf(i2);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(i2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i3 >= 10) {
            strLIZIZ2 = String.valueOf(i3);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('0');
            sbLIZ2.append(i3);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(" : ");
        sbLIZ3.append(strLIZIZ2);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static void LIZJ(EnumC1127360fRW enumC1127360fRW, long j) {
        LIZ();
        LJ = enumC1127360fRW;
        LIZIZ = j;
        if (j <= 0) {
            return;
        }
        C11NZ.LJJJJJL(0L, 1L, TimeUnit.SECONDS).LJLIIL((LIZIZ / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + 1).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0fYi
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return Long.valueOf(C1131370fXz.LIZIZ - (((Number) obj).longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<Long>() { // from class: X.0fYS
            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                if (C1131370fXz.LJ == EnumC1127360fRW.ItemCountdown) {
                    C784440Upu.LIZ().LIZIZ(new C1130860fXA(0L, C1131370fXz.LIZIZ()));
                } else if (C1131370fXz.LJ == EnumC1127360fRW.DialogCountdown) {
                    C784440Upu.LIZ().LIZIZ(new C1132510fZp(0L));
                }
                C1131370fXz.LIZ();
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Long l) {
                long jLongValue = l.longValue();
                if (jLongValue >= 0) {
                    C1131370fXz.LIZ = jLongValue;
                    if (C1131370fXz.LJ == EnumC1127360fRW.ItemCountdown) {
                        C784440Upu.LIZ().LIZIZ(new C1130860fXA(jLongValue, C1131370fXz.LIZIZ()));
                    } else {
                        if (C1131370fXz.LJ != EnumC1127360fRW.DialogCountdown) {
                            return;
                        }
                        C784440Upu.LIZ().LIZIZ(new C1132510fZp(jLongValue));
                    }
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                C1131370fXz.LIZJ = new WeakReference<>(interfaceC420801kM);
            }
        });
    }
}
