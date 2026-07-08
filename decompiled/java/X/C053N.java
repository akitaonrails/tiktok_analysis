package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.053N, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C053N extends C053H<C12909053j, InterfaceC12901053b, List<? extends Long>> {
    public final C01GW LIZLLL;

    @Override // X.C053S
    public final C053I<List<Long>> LJ() {
        return (C053I) this.LIZLLL.getValue();
    }

    @Override // X.C053S
    public final void LJFF(String str) {
        String strLJIIIZ = LJIIIZ(str);
        Pair<Boolean, List<? extends Long>> pairLJII = LJII(str);
        boolean zBooleanValue = pairLJII.getFirst().booleanValue();
        List<? extends Long> second = pairLJII.getSecond();
        if (!zBooleanValue) {
            return;
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(second, ",", null, null, 0, null, null, 62);
        if (strLJJLIIIJ.length() == 0) {
            strLJJLIIIJ = "[]";
        }
        LJIIIIZZ().LJFF(strLJJLIIIJ, strLJIIIZ);
    }

    public C053N(C12909053j c12909053j, AnonymousClass0531 anonymousClass0531) {
        super(c12909053j, anonymousClass0531);
        this.LIZLLL = C452501pT.LIZIZ(new AwS546S0100000_2(anonymousClass0531, 989));
    }

    @Override // X.C053H, X.C053S
    public final boolean LJI(long j, String str) {
        Pair<Boolean, List<? extends Long>> pairLJII = LJII(str);
        boolean zBooleanValue = pairLJII.getFirst().booleanValue();
        List<? extends Long> second = pairLJII.getSecond();
        if (!zBooleanValue) {
            return false;
        }
        Iterator<? extends Long> it2 = second.iterator();
        int i = 0;
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            C12924053y c12924053y = C12924053y.LIZ;
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            long j3 = 60;
            long jLIZIZ = C12924053y.LIZIZ(c12924053y, jLongValue / j2, ((j / j2) / j3) / j3);
            C12909053j c12909053j = this.LIZ;
            if (jLIZIZ >= c12909053j.LIZIZ && jLIZIZ <= c12909053j.LIZJ && (i = i + 1) >= c12909053j.LIZ) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C053S
    public final void LIZIZ(long j, long j2, String str) {
        C12924053y c12924053y = C12924053y.LIZ;
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j4 = j / j3;
        long j5 = j2 / j3;
        long j6 = 60;
        long jLIZIZ = C12924053y.LIZIZ(c12924053y, j4, (j5 / j6) / j6);
        C12909053j c12909053j = this.LIZ;
        if (jLIZIZ >= c12909053j.LIZIZ && jLIZIZ <= c12909053j.LIZJ) {
            LJ().LJFF(C13LP.LJLILLLLZI(Long.valueOf(j), LJII(str).getSecond()), str);
        }
    }
}
