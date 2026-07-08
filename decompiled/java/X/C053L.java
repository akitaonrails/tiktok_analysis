package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.053L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C053L extends C053H<C12908053i, InterfaceC12901053b, List<? extends Long>> {
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

    public C053L(C12908053i c12908053i, AnonymousClass0531 anonymousClass0531) {
        super(c12908053i, anonymousClass0531);
        this.LIZLLL = C452501pT.LIZIZ(new AwS546S0100000_2(anonymousClass0531, 988));
    }

    @Override // X.C053H, X.C053S
    public final boolean LJI(long j, String str) {
        Pair<Boolean, List<? extends Long>> pairLJII = LJII(str);
        boolean zBooleanValue = pairLJII.getFirst().booleanValue();
        List<? extends Long> second = pairLJII.getSecond();
        if (!zBooleanValue) {
            return false;
        }
        C12908053i c12908053i = this.LIZ;
        long timeInMs = j - c12908053i.LIZJ.getTimeInMs(c12908053i.LIZIZ);
        ArrayList arrayList = new ArrayList();
        for (Long l : second) {
            long jLongValue = l.longValue();
            if (timeInMs <= jLongValue && jLongValue <= j) {
                arrayList.add(l);
            }
        }
        if (arrayList.size() < this.LIZ.LIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C053S
    public final void LIZIZ(long j, long j2, String str) {
        LJ().LJFF(C13LP.LJLILLLLZI(Long.valueOf(j), LJ().getData(str).getSecond()), str);
    }
}
