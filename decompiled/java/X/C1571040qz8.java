package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.MFLeftIconPriority;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571040qz8 {
    public final C19EG LIZ;
    public final InterfaceC1617760sCU LIZIZ;
    public final HomeTabAbility LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(563));

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<? extends X.InterfaceC1570980qz2> LIZ(boolean r4) {
        /*
            r3 = this;
            X.0CXE r0 = X.C0CXE.LIZ
            r0.getClass()
            boolean r0 = X.C0CXE.LIZ()
            r2 = 0
            if (r0 != 0) goto L69
            X.0CXC r0 = X.C0CXC.LIZ
            r0.getClass()
            boolean r0 = X.C0CXC.LIZIZ()
            if (r0 != 0) goto L69
            if (r4 == 0) goto L56
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r3.LIZJ
            if (r0 == 0) goto L68
            kotlin.Pair r0 = r0.pI()
            if (r0 == 0) goto L68
            java.lang.Object r1 = r0.getFirst()
            java.util.List r1 = (java.util.List) r1
        L29:
            if (r1 == 0) goto L68
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L68
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L3a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r1.next()
            X.0qyu r0 = (X.InterfaceC1570900qyu) r0
            java.lang.String r0 = r0.getTag()
            if (r0 == 0) goto L3a
            X.0qz0 r0 = r3.LIZIZ(r0)
            if (r0 == 0) goto L3a
            r2.add(r0)
            goto L3a
        L56:
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r3.LIZJ
            if (r0 == 0) goto L68
            kotlin.Pair r0 = r0.pI()
            if (r0 == 0) goto L68
            java.lang.Object r1 = r0.getSecond()
            java.util.List r1 = (java.util.List) r1
            goto L29
        L67:
            return r2
        L68:
            return r2
        L69:
            if (r4 == 0) goto L9e
            com.ss.android.ugc.aweme.experiment.Entrance r0 = X.C1585030rLh.LJ()
            if (r0 == 0) goto La8
            java.util.List<com.ss.android.ugc.aweme.experiment.Candidate> r1 = r0.candidates
        L73:
            if (r1 == 0) goto La8
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L84:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.experiment.Candidate r0 = (com.ss.android.ugc.aweme.experiment.Candidate) r0
            java.lang.String r0 = r0.entranceKey
            if (r0 == 0) goto L84
            X.0qz0 r0 = r3.LIZIZ(r0)
            if (r0 == 0) goto L84
            r2.add(r0)
            goto L84
        L9e:
            com.ss.android.ugc.aweme.experiment.Entrance r0 = X.C1585030rLh.LJII()
            if (r0 == 0) goto La8
            java.util.List<com.ss.android.ugc.aweme.experiment.Candidate> r1 = r0.candidates
            goto L73
        La7:
            return r2
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1571040qz8.LIZ(boolean):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0qz0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0qz0] */
    public final C1570960qz0 LIZIZ(String str) {
        final InterfaceC1570900qyu interfaceC1570900qyuLIZJ;
        HomeTabAbility homeTabAbility;
        final InterfaceC1570900qyu interfaceC1570900qyuLIZJ2;
        if ((Intrinsics.LJFF(str, "USER") || Intrinsics.LJFF(str, "NOTIFICATION")) && (interfaceC1570900qyuLIZJ = LIZJ(str)) != null) {
            return new InterfaceC1570980qz2(interfaceC1570900qyuLIZJ) { // from class: X.0qz0
                public final InterfaceC1570900qyu LL;

                @Override // X.InterfaceC1570980qz2
                public final void LIZ() {
                    this.LL.LIZ();
                }

                @Override // X.InterfaceC1570980qz2
                public final String LIZLLL() {
                    return this.LL.getTag();
                }

                @Override // X.InterfaceC1570980qz2
                public final void T1() {
                    this.LL.T1();
                }

                @Override // X.InterfaceC1570980qz2
                public final void j6() {
                    this.LL.g2();
                }

                @Override // X.InterfaceC1570980qz2
                public final InterfaceC1570900qyu LIZJ() {
                    return this.LL;
                }

                @Override // X.InterfaceC1570980qz2
                public final MFLeftIconPriority LJ() {
                    return MFLeftIconPriority.DYNAMIC;
                }

                {
                    this.LL = interfaceC1570900qyuLIZJ;
                }
            };
        }
        if (!((List) this.LIZLLL.getValue()).contains(str) && (homeTabAbility = this.LIZJ) != null && homeTabAbility.wd0(str) && (interfaceC1570900qyuLIZJ2 = LIZJ(str)) != null) {
            return new InterfaceC1570980qz2(interfaceC1570900qyuLIZJ2) { // from class: X.0qz0
                public final InterfaceC1570900qyu LL;

                @Override // X.InterfaceC1570980qz2
                public final void LIZ() {
                    this.LL.LIZ();
                }

                @Override // X.InterfaceC1570980qz2
                public final String LIZLLL() {
                    return this.LL.getTag();
                }

                @Override // X.InterfaceC1570980qz2
                public final void T1() {
                    this.LL.T1();
                }

                @Override // X.InterfaceC1570980qz2
                public final void j6() {
                    this.LL.g2();
                }

                @Override // X.InterfaceC1570980qz2
                public final InterfaceC1570900qyu LIZJ() {
                    return this.LL;
                }

                @Override // X.InterfaceC1570980qz2
                public final MFLeftIconPriority LJ() {
                    return MFLeftIconPriority.DYNAMIC;
                }

                {
                    this.LL = interfaceC1570900qyuLIZJ2;
                }
            };
        }
        return null;
    }

    public final InterfaceC1570900qyu LIZJ(String str) {
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairPI;
        List<InterfaceC1570900qyu> second;
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairPI2;
        List<InterfaceC1570900qyu> first;
        if (Intrinsics.LJFF(str, "NOTIFICATION")) {
            return C19212010Ec.LIZJ.LJJJJJ(this.LIZ, this.LIZIZ);
        }
        InterfaceC1570900qyu interfaceC1570900qyu = null;
        C1255210ilj c1255210ilj = null;
        interfaceC1570900qyu = null;
        interfaceC1570900qyu = null;
        interfaceC1570900qyu = null;
        if (Intrinsics.LJFF(str, "USER")) {
            C19EG c19eg = this.LIZ;
            InterfaceC1617760sCU interfaceC1617760sCU = this.LIZIZ;
            C1571260qzU c1571260qzU = new C1571260qzU();
            c1571260qzU.LL = c19eg;
            c1571260qzU.LLILLJJLI = interfaceC1617760sCU;
            if (c19eg != null) {
                c1255210ilj = new C1255210ilj(c19eg);
            }
            c1571260qzU.LLILLL = c1255210ilj;
            return c1571260qzU;
        }
        HomeTabAbility homeTabAbility = this.LIZJ;
        if (homeTabAbility != null && (pairPI2 = homeTabAbility.pI()) != null && (first = pairPI2.getFirst()) != null) {
            for (InterfaceC1570900qyu interfaceC1570900qyu2 : first) {
                if (Intrinsics.LJFF(interfaceC1570900qyu2.getTag(), str)) {
                    interfaceC1570900qyu = interfaceC1570900qyu2;
                }
            }
        }
        HomeTabAbility homeTabAbility2 = this.LIZJ;
        if (homeTabAbility2 != null && (pairPI = homeTabAbility2.pI()) != null && (second = pairPI.getSecond()) != null) {
            for (InterfaceC1570900qyu interfaceC1570900qyu3 : second) {
                if (Intrinsics.LJFF(interfaceC1570900qyu3.getTag(), str)) {
                    interfaceC1570900qyu = interfaceC1570900qyu3;
                }
            }
        }
        InterfaceC1570900qyu interfaceC1570900qyu4 = interfaceC1570900qyu;
        if (interfaceC1570900qyu == null) {
            return interfaceC1570900qyu4;
        }
        interfaceC1570900qyu.V1(this.LIZIZ);
        return interfaceC1570900qyu4;
    }

    public C1571040qz8(C19EG c19eg, InterfaceC1617760sCU interfaceC1617760sCU, HomeTabAbility homeTabAbility) {
        this.LIZ = c19eg;
        this.LIZIZ = interfaceC1617760sCU;
        this.LIZJ = homeTabAbility;
    }
}
