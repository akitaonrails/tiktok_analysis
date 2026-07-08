package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.053D, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C053D extends C053H<C12910053k, InterfaceC12901053b, List<? extends Long>> {
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
        C053I<String> c053iLJIIIIZZ = LJIIIIZZ();
        String strLJJLIIIJ = C13LP.LJJLIIIJ(second, ",", null, null, 0, null, null, 62);
        if (strLJJLIIIJ.length() == 0) {
            strLJJLIIIJ = "[]";
        }
        c053iLJIIIIZZ.LJFF(strLJJLIIIJ, strLJIIIZ);
    }

    public C053D(C12910053k c12910053k, AnonymousClass0531 anonymousClass0531) {
        super(c12910053k, anonymousClass0531);
        this.LIZLLL = C452501pT.LIZIZ(new AwS546S0100000_2(anonymousClass0531, 985));
    }

    @Override // X.C053H, X.C053S
    public final boolean LJI(long j, String str) {
        Pair<Boolean, List<? extends Long>> pairLJII = LJII(str);
        boolean zBooleanValue = pairLJII.getFirst().booleanValue();
        List<? extends Long> second = pairLJII.getSecond();
        if (!zBooleanValue) {
            return false;
        }
        int size = second.size();
        int i = this.LIZ.LIZ;
        if (size <= 0 || i <= 0 || size % i != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C053S
    public final void LIZIZ(long j, long j2, String str) {
        LJ().LJFF(C13LP.LJLILLLLZI(Long.valueOf(j), LJII(str).getSecond()), str);
    }
}
