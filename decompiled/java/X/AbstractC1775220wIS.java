package X;

import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1775220wIS extends AbstractC1775260wIW implements InterfaceC1775490wIt, InterfaceC1775470wIr {
    public abstract C1775180wIO LJI();

    public abstract InterfaceC1775430wIn LJII();

    public final void LJIIIZ() {
        int iDoubleValue;
        C1775180wIO c1775180wIOLJI = LJI();
        if (c1775180wIOLJI != null) {
            Long lLLLJL = LJII().LLLJL();
            long jLongValue = lLLLJL != null ? lLLLJL.longValue() : 0L;
            c1775180wIOLJI.LJIJ = jLongValue;
            int i = 100;
            long j = jLongValue * ((long) 100);
            try {
                Double dK2 = LJII().K2();
                iDoubleValue = (int) (j / (dK2 != null ? (long) dK2.doubleValue() : 1L));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                iDoubleValue = 0;
            }
            if (iDoubleValue < 0) {
                i = 0;
            } else if (iDoubleValue <= 100) {
                i = iDoubleValue;
            }
            c1775180wIOLJI.LJIJI = i;
        }
    }

    @Override // X.InterfaceC1775470wIr
    public final void LIZLLL(Boolean bool) {
        String strLLLL;
        LJIIIZ();
        C1775180wIO c1775180wIOLJI = LJI();
        if (c1775180wIOLJI != null) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                strLLLL = EnumC1775410wIl.PLAYING.getStatus();
            } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                strLLLL = EnumC1775410wIl.STOP.getStatus();
            } else {
                strLLLL = LJII().LLLL();
            }
            c1775180wIOLJI.LJIJJ = strLLLL;
        }
    }

    public AbstractC1775220wIS(ViewGroup viewGroup, C1775400wIk c1775400wIk) {
        super(viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIIIIZZ(X.AbstractC1775220wIS r13, X.EnumC1775210wIR r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1775220wIS.LJIIIIZZ(X.0wIS, X.0wIR, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1775470wIr
    public final void LJ(Integer num, String str, String str2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1775320wIc(str, this, num, str2, null), 3);
    }
}
