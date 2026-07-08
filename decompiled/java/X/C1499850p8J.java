package X;

import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.TTRetrofit;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p8J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499850p8J implements InterfaceC1507130pK3 {
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public List<AbstractC2343909Gj> LJ;
    public InterfaceC1515510pXZ LJI;
    public Object LJII;
    public int LJIIIZ;
    public Integer LJIIJ;
    public boolean LJIIJJI;
    public List<InterfaceC1904907d9> LIZLLL = new ArrayList();
    public final List<C09S8> LJFF = RetrofitFactory.LIZ.LIZIZ();
    public final NetworkPartnerGroup LJIIIIZZ = new NetworkPartnerGroup();

    @Override // X.InterfaceC1507130pK3
    public final TTRetrofit build() {
        if (this.LJ == null) {
            this.LJ = RetrofitFactory.LIZ.LIZ();
        }
        if (this.LJI != null) {
            Iterator<AbstractC2343909Gj> it2 = this.LJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object obj = (AbstractC2343909Gj) it2.next();
                if (obj instanceof InterfaceC1499860p8K) {
                    ((InterfaceC1499860p8K) obj).LIZ(this.LJI);
                    break;
                }
            }
        }
        return new TTRetrofit(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[PHI: r1
      0x009b: PHI (r1v13 int) = (r1v12 int), (r1v30 int), (r1v30 int) binds: [B:19:0x0094, B:8:0x003e, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r4 = this;
            java.lang.String r0 = r4.LIZ
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            boolean r0 = r4.LIZIZ
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.LIZJ
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<X.07d9> r0 = r4.LIZLLL
            int r0 = LJII(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<X.09Gj> r0 = r4.LJ
            int r0 = LJII(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<X.09S8> r0 = r4.LJFF
            int r0 = LJII(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            X.0pXZ r0 = r4.LJI
            if (r0 == 0) goto L9d
            int r0 = r0.hashCode()
        L35:
            int r1 = r1 + r0
            java.lang.Object r2 = r4.LJII
            boolean r0 = r2 instanceof X.C1499810p8F
            if (r0 == 0) goto L92
            int r1 = r1 * 31
            if (r2 == 0) goto L9b
            java.lang.String r0 = r2.toString()
            if (r0 == 0) goto L9b
            int r0 = r0.hashCode()
        L4a:
            int r1 = r1 + r0
            int r3 = r1 * 31
            com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup r2 = r4.LJIIIIZZ
            java.util.List<com.bytedance.frameworks.baselib.netx.partner.NetworkPartner$Blocker> r0 = r2.LIZ
            int r0 = com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup.LIZLLL(r0)
            int r1 = r0 * 31
            java.util.List<com.bytedance.frameworks.baselib.netx.partner.NetworkPartner$RequestHandler> r0 = r2.LIZIZ
            int r0 = com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup.LIZLLL(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<com.bytedance.frameworks.baselib.netx.partner.NetworkPartner$ResponseHandler> r0 = r2.LIZJ
            int r0 = com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup.LIZLLL(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<com.bytedance.frameworks.baselib.netx.partner.NetworkPartner$ExceptionHandler> r0 = r2.LIZLLL
            int r0 = com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup.LIZLLL(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<com.bytedance.frameworks.baselib.netx.partner.NetworkPartner$Bystander> r0 = r2.LJ
            int r0 = com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup.LIZLLL(r0)
            int r1 = r1 + r0
            int r3 = r3 + r1
            int r1 = r3 * 31
            int r0 = r4.LJIIIZ
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Integer r0 = r4.LJIIJ
            if (r0 == 0) goto L90
            int r0 = r0.intValue()
        L89:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.LJIIJJI
            int r1 = r1 + r0
            return r1
        L90:
            r0 = -1
            goto L89
        L92:
            int r1 = r1 * 31
            if (r2 == 0) goto L9b
            int r0 = r2.hashCode()
            goto L4a
        L9b:
            r0 = 0
            goto L4a
        L9d:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1499850p8J.hashCode():int");
    }

    public C1499850p8J(String str) {
        this.LIZ = str;
    }

    public static int LJII(List list) {
        int iHashCode;
        int i = 0;
        if (list != null) {
            i = 0;
            for (Object obj : list) {
                int i2 = i * 31;
                if (obj != null) {
                    iHashCode = obj.getClass().hashCode();
                } else {
                    iHashCode = 0;
                }
                i = i2 + iHashCode;
            }
        }
        return i;
    }

    @Override // X.InterfaceC1507130pK3
    public final C1499850p8J LIZ(InterfaceC1904907d9 interfaceC1904907d9) {
        List<InterfaceC1904907d9> list = this.LIZLLL;
        if (list != null) {
            list.add(interfaceC1904907d9);
        }
        return this;
    }

    @Override // X.InterfaceC1507130pK3
    public final C1499850p8J LIZIZ(NetworkPartner networkPartner) {
        if (networkPartner != null) {
            this.LJIIIIZZ.LIZ(networkPartner);
        }
        return this;
    }

    @Override // X.InterfaceC1507130pK3
    public final C1499850p8J LIZJ(AbstractC2343909Gj abstractC2343909Gj) {
        if (this.LJ == null) {
            this.LJ = RetrofitFactory.LIZ.LIZ();
        }
        List<AbstractC2343909Gj> list = this.LJ;
        if (list != null) {
            ListProtector.add(list, 0, abstractC2343909Gj);
        }
        return this;
    }

    @Override // X.InterfaceC1507130pK3
    public final C1499850p8J LIZLLL(InterfaceC1515510pXZ interfaceC1515510pXZ) {
        this.LJI = interfaceC1515510pXZ;
        return this;
    }

    public final C1499850p8J LJ(C09S8 c09s8) {
        this.LJFF.add(c09s8);
        return this;
    }

    public final C1499850p8J LJFF(List list) {
        List<InterfaceC1904907d9> list2;
        if (list != null && (list2 = this.LIZLLL) != null) {
            list2.addAll(list);
        }
        return this;
    }

    public final C1499850p8J LJI(C09S8 c09s8) {
        ListProtector.add(this.LJFF, 0, c09s8);
        return this;
    }

    public final C1499850p8J LJIIIIZZ(int i) {
        this.LJIIJ = Integer.valueOf(i);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(C1499850p8J.class, obj.getClass())) {
            return false;
        }
        C1499850p8J c1499850p8J = (C1499850p8J) obj;
        if (this.LIZIZ == c1499850p8J.LIZIZ && this.LIZJ == c1499850p8J.LIZJ && Intrinsics.LJFF(this.LIZ, c1499850p8J.LIZ)) {
            return true;
        }
        return false;
    }
}
