package Y;

import X.C1BA1;
import X.C20085613iQ;
import X.C2192911As5;
import X.C2199811B7r;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import java.util.Comparator;

/* JADX INFO: loaded from: classes35.dex */
public class AComparatorS53S0000000_34 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            case 8:
                return compare$8(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS53S0000000_34(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS53S0000000_34 aComparatorS53S0000000_34, Object obj, Object obj2) {
        return (int) (((C2199811B7r) obj).LIZ - ((C2199811B7r) obj2).LIZ);
    }

    public static final int compare$1(AComparatorS53S0000000_34 aComparatorS53S0000000_34, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C2192911As5) obj2).LIZIZ), Long.valueOf(((C2192911As5) obj).LIZIZ));
    }

    public static final int compare$2(AComparatorS53S0000000_34 aComparatorS53S0000000_34, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Double.valueOf(((SocialAffinityItem) obj2).score), Double.valueOf(((SocialAffinityItem) obj).score));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$3(Y.AComparatorS53S0000000_34 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            X.1Cux r3 = (X.InterfaceC2245651Cux) r3
            boolean r0 = r3 instanceof X.C2190071AnV
            r2 = 0
            if (r0 == 0) goto L2d
            X.1AnV r3 = (X.C2190071AnV) r3
            int r0 = r3.LIZJ
        Lb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Lf:
            X.1Cux r4 = (X.InterfaceC2245651Cux) r4
            boolean r0 = r4 instanceof X.C2190071AnV
            if (r0 == 0) goto L22
            X.1AnV r4 = (X.C2190071AnV) r4
            int r0 = r4.LIZJ
        L19:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1d:
            int r0 = X.C20085613iQ.LIZIZ(r1, r2)
            return r0
        L22:
            boolean r0 = r4 instanceof X.C2190061AnU
            if (r0 == 0) goto L1d
            X.1AnU r4 = (X.C2190061AnU) r4
            if (r4 == 0) goto L1d
            int r0 = r4.LIZ
            goto L19
        L2d:
            boolean r0 = r3 instanceof X.C2190061AnU
            if (r0 == 0) goto L38
            X.1AnU r3 = (X.C2190061AnU) r3
            if (r3 == 0) goto L38
            int r0 = r3.LIZ
            goto Lb
        L38:
            r1 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AComparatorS53S0000000_34.compare$3(Y.AComparatorS53S0000000_34, java.lang.Object, java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$4(Y.AComparatorS53S0000000_34 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            X.1Cux r4 = (X.InterfaceC2245651Cux) r4
            boolean r0 = r4 instanceof X.C2190051AnT
            r2 = 0
            if (r0 == 0) goto L2d
            X.1AnT r4 = (X.C2190051AnT) r4
            int r0 = r4.LIZ
        Lb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Lf:
            X.1Cux r3 = (X.InterfaceC2245651Cux) r3
            boolean r0 = r3 instanceof X.C2190051AnT
            if (r0 == 0) goto L22
            X.1AnT r3 = (X.C2190051AnT) r3
            int r0 = r3.LIZ
        L19:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1d:
            int r0 = X.C20085613iQ.LIZIZ(r1, r2)
            return r0
        L22:
            boolean r0 = r3 instanceof X.C2190071AnV
            if (r0 == 0) goto L1d
            X.1AnV r3 = (X.C2190071AnV) r3
            if (r3 == 0) goto L1d
            int r0 = r3.LIZ
            goto L19
        L2d:
            boolean r0 = r4 instanceof X.C2190071AnV
            if (r0 == 0) goto L38
            X.1AnV r4 = (X.C2190071AnV) r4
            if (r4 == 0) goto L38
            int r0 = r4.LIZ
            goto Lb
        L38:
            r1 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AComparatorS53S0000000_34.compare$4(Y.AComparatorS53S0000000_34, java.lang.Object, java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$5(Y.AComparatorS53S0000000_34 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            X.1Cux r3 = (X.InterfaceC2245651Cux) r3
            boolean r0 = r3 instanceof X.C2190071AnV
            r2 = 0
            if (r0 == 0) goto L2d
            X.1AnV r3 = (X.C2190071AnV) r3
            int r0 = r3.LIZJ
        Lb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Lf:
            X.1Cux r4 = (X.InterfaceC2245651Cux) r4
            boolean r0 = r4 instanceof X.C2190071AnV
            if (r0 == 0) goto L22
            X.1AnV r4 = (X.C2190071AnV) r4
            int r0 = r4.LIZJ
        L19:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1d:
            int r0 = X.C20085613iQ.LIZIZ(r1, r2)
            return r0
        L22:
            boolean r0 = r4 instanceof X.C2190061AnU
            if (r0 == 0) goto L1d
            X.1AnU r4 = (X.C2190061AnU) r4
            if (r4 == 0) goto L1d
            int r0 = r4.LIZ
            goto L19
        L2d:
            boolean r0 = r3 instanceof X.C2190061AnU
            if (r0 == 0) goto L38
            X.1AnU r3 = (X.C2190061AnU) r3
            if (r3 == 0) goto L38
            int r0 = r3.LIZ
            goto Lb
        L38:
            r1 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AComparatorS53S0000000_34.compare$5(Y.AComparatorS53S0000000_34, java.lang.Object, java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$6(Y.AComparatorS53S0000000_34 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            X.1Cux r4 = (X.InterfaceC2245651Cux) r4
            boolean r0 = r4 instanceof X.C2190051AnT
            r2 = 0
            if (r0 == 0) goto L2d
            X.1AnT r4 = (X.C2190051AnT) r4
            int r0 = r4.LIZ
        Lb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Lf:
            X.1Cux r3 = (X.InterfaceC2245651Cux) r3
            boolean r0 = r3 instanceof X.C2190051AnT
            if (r0 == 0) goto L22
            X.1AnT r3 = (X.C2190051AnT) r3
            int r0 = r3.LIZ
        L19:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1d:
            int r0 = X.C20085613iQ.LIZIZ(r1, r2)
            return r0
        L22:
            boolean r0 = r3 instanceof X.C2190071AnV
            if (r0 == 0) goto L1d
            X.1AnV r3 = (X.C2190071AnV) r3
            if (r3 == 0) goto L1d
            int r0 = r3.LIZ
            goto L19
        L2d:
            boolean r0 = r4 instanceof X.C2190071AnV
            if (r0 == 0) goto L38
            X.1AnV r4 = (X.C2190071AnV) r4
            if (r4 == 0) goto L38
            int r0 = r4.LIZ
            goto Lb
        L38:
            r1 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AComparatorS53S0000000_34.compare$6(Y.AComparatorS53S0000000_34, java.lang.Object, java.lang.Object):int");
    }

    public static final int compare$7(AComparatorS53S0000000_34 aComparatorS53S0000000_34, Object obj, Object obj2) {
        return (int) (((C1BA1) obj).LIZ - ((C1BA1) obj2).LIZ);
    }

    public static final int compare$8(AComparatorS53S0000000_34 aComparatorS53S0000000_34, Object obj, Object obj2) {
        return (int) (((C1BA1) obj).LIZ - ((C1BA1) obj2).LIZ);
    }
}
