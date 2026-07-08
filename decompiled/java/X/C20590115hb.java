package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;

/* JADX INFO: renamed from: X.15hb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20590115hb implements InterfaceC1545990qKj {
    @Override // X.InterfaceC1545990qKj
    public final boolean LIZ() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        return iSparkHostApi != null && iSparkHostApi.LLILZ();
    }

    @Override // X.InterfaceC1545990qKj
    public final String LIZLLL() {
        Integer numValueOf;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null || (numValueOf = Integer.valueOf(iSparkHostApi.LLFF())) == null) {
            return "Unfolded";
        }
        if (numValueOf.intValue() == 0) {
            return "Folded";
        }
        numValueOf.intValue();
        return "Unfolded";
    }

    @Override // X.InterfaceC1545990qKj
    public final boolean isPad() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        return iSparkHostApi != null && iSparkHostApi.LLIILII();
    }

    @Override // X.InterfaceC1545990qKj
    public final boolean LJ() {
        return C07YF.LIZ().enableGlobalProps;
    }

    @Override // X.InterfaceC1545990qKj
    public final boolean LJFF() {
        return C07YF.LIZ().enablePopupAutoAdaptation;
    }

    @Override // X.InterfaceC1545990qKj
    public final boolean LJI() {
        return C07YF.LIZ().enableActivityAutoAdaptation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r0 = X.C20590215hc.LIZJ;
        r1 = X.C20590215hc.LJII;
     */
    @Override // X.InterfaceC1545990qKj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJII(float r4) {
        /*
            r3 = this;
            java.util.List<X.15hc> r0 = X.C20590015ha.LIZJ
            java.util.List<X.15hc> r1 = X.C20590015ha.LIZJ
            int r0 = r1.size()
            java.util.ListIterator r2 = r1.listIterator(r0)
        Lc:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.previous()
            r0 = r1
            X.15hc r0 = (X.C20590215hc) r0
            int r0 = r0.LIZ
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            if (r1 != 0) goto L26
        L22:
            X.15hc r0 = X.C20590215hc.LIZJ
            X.15hc r1 = X.C20590215hc.LJII
        L26:
            X.15hc r0 = X.C20590215hc.LJI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L31
            java.lang.String r0 = "ExtraLarge"
            return r0
        L31:
            X.15hc r0 = X.C20590215hc.LJFF
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "Large"
            return r0
        L3c:
            X.15hc r0 = X.C20590215hc.LJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L47
            java.lang.String r0 = "Expanded"
            return r0
        L47:
            X.15hc r0 = X.C20590215hc.LIZLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L52
            java.lang.String r0 = "Medium"
            return r0
        L52:
            java.lang.String r0 = "Compact"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20590115hb.LJII(float):java.lang.String");
    }

    @Override // X.InterfaceC1545990qKj
    public final String LJIIIIZZ(Context context) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null && iSparkHostApi.LL(context)) {
            return "Vertical";
        }
        return "Horizontal";
    }

    @Override // X.InterfaceC1545990qKj
    public final boolean LJIIIZ(Context context) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null || !iSparkHostApi.LLILZLL(context)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1545990qKj
    public final int LIZIZ(int i, int i2) {
        int iMin = Math.min(i, i2);
        if (iMin <= 0) {
            return 0;
        }
        return (iMin * 3) / 4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // X.InterfaceC1545990qKj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ(int r7, java.lang.String r8) {
        /*
            r6 = this;
            int r0 = r8.hashCode()
            java.lang.String r5 = "Large"
            java.lang.String r4 = "ExtraLarge"
            java.lang.String r3 = "Expanded"
            java.lang.String r2 = "Medium"
            switch(r0) {
                case -1994163307: goto L63;
                case -1874456359: goto L6e;
                case -1571742421: goto L79;
                case 73190171: goto L84;
                default: goto Lf;
            }
        Lf:
            X.15hc r0 = X.C20590215hc.LIZJ
            X.15hc r1 = X.C20590215hc.LIZJ
        L13:
            int r0 = r8.hashCode()
            switch(r0) {
                case -1994163307: goto L42;
                case -1874456359: goto L49;
                case -1571742421: goto L52;
                case 73190171: goto L59;
                default: goto L1a;
            }
        L1a:
            X.0c0M r0 = r1.LIZIZ
            int r5 = r0.LIZ
        L1e:
            X.15hj r0 = X.C20589915hZ.LIZ
            X.0c0M r1 = r1.LIZIZ
            r4 = 1
            if (r5 >= r4) goto L2b
            r0 = 0
        L26:
            int r0 = X.C814420VxA.LIZIZ(r0)
            return r0
        L2b:
            int r0 = r1.LIZJ
            int r3 = r1.LIZIZ
            int r1 = r1.LIZ
            int r0 = r0 * 2
            int r7 = r7 - r0
            int r0 = r1 + (-1)
            int r0 = r0 * r3
            int r7 = r7 - r0
            float r2 = (float) r7
            float r0 = (float) r1
            float r2 = r2 / r0
            float r1 = (float) r5
            float r1 = r1 * r2
            int r5 = r5 - r4
            int r5 = r5 * r3
            float r0 = (float) r5
            float r0 = r0 + r1
            goto L26
        L42:
            boolean r0 = r8.equals(r2)
            if (r0 != 0) goto L50
            goto L1a
        L49:
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L50
            goto L1a
        L50:
            r5 = 6
            goto L1e
        L52:
            boolean r0 = r8.equals(r4)
            if (r0 != 0) goto L60
            goto L1a
        L59:
            boolean r0 = r8.equals(r5)
            if (r0 != 0) goto L60
            goto L1a
        L60:
            r5 = 8
            goto L1e
        L63:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto Lf
            X.15hc r0 = X.C20590215hc.LIZJ
            X.15hc r1 = X.C20590215hc.LIZLLL
            goto L13
        L6e:
            boolean r0 = r8.equals(r3)
            if (r0 == 0) goto Lf
            X.15hc r0 = X.C20590215hc.LIZJ
            X.15hc r1 = X.C20590215hc.LJ
            goto L13
        L79:
            boolean r0 = r8.equals(r4)
            if (r0 == 0) goto Lf
            X.15hc r0 = X.C20590215hc.LIZJ
            X.15hc r1 = X.C20590215hc.LJI
            goto L13
        L84:
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto Lf
            X.15hc r0 = X.C20590215hc.LIZJ
            X.15hc r1 = X.C20590215hc.LJFF
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20590115hb.LIZJ(int, java.lang.String):int");
    }
}
