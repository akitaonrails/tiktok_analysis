package X;

import android.util.Pair;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qYB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554330qYB extends AbstractC1552040qUU {
    public final int $t;
    public Object l0;

    public static final void LJIIIIZZ$0(C1554330qYB c1554330qYB, Map map, Map map2) {
    }

    @Override // X.AbstractC1552040qUU
    public final void LJII(Throwable th, Map map) {
        switch (this.$t) {
            case 1:
                LJII$0(this, th, map);
                break;
            case 2:
            default:
                super.LJII(th, map);
                break;
            case 3:
                LJII$1(this, th, map);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        if (1 - this.$t != 0) {
            super.LJIIIIZZ(map, map2);
        } else {
            LJIIIIZZ$0(this, map, map2);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIIZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2, C1551680qTu c1551680qTu) {
        if (this.$t != 0) {
            super.LJIIIZ(map, map2, c1551680qTu);
        } else {
            LJIIIZ$0(this, map, map2, c1551680qTu);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
        switch (this.$t) {
            case 1:
                LJIILLIIL$0(this, localPackageModel);
                break;
            case 2:
            default:
                super.LJIILLIIL(localPackageModel);
                break;
            case 3:
                LJIILLIIL$1(this, localPackageModel);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
        switch (this.$t) {
            case 1:
                LJIJ$0(this, updatePackage, th);
                break;
            case 2:
                LJIJ$1(this, updatePackage, th);
                break;
            case 3:
                LJIJ$2(this, updatePackage, th);
                break;
            default:
                super.LJIJ(updatePackage, th);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        switch (this.$t) {
            case 1:
                LJIL$0(this, j, updatePackage);
                break;
            case 2:
                LJIL$1(this, j, updatePackage);
                break;
            case 3:
                LJIL$2(this, j, updatePackage);
                break;
            default:
                super.LJIL(j, updatePackage);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1554330qYB(Object obj, List<C1552740qVc> list) {
        this.$t = list;
        this.l0 = obj;
    }

    public static final void LJIILLIIL$0(C1554330qYB c1554330qYB, LocalPackageModel localPackageModel) {
        C1552590qVN c1552590qVNLIZ = ((C1552730qVb) c1554330qYB.l0).LIZ(new C1552740qVc(localPackageModel.getAccessKey(), localPackageModel.getChannel()));
        if (c1552590qVNLIZ != null) {
            c1552590qVNLIZ.LIZ(EnumC1552690qVX.LOCAL_NEWEST_VERSION);
        }
    }

    public static final void LJIILLIIL$1(C1554330qYB c1554330qYB, LocalPackageModel localPackageModel) {
        ((InterfaceC1631620sYq) c1554330qYB.l0).invoke("onLocalNewestVersion", Boolean.FALSE, "local newest version");
    }

    public static final void LJII$0(C1554330qYB c1554330qYB, Throwable th, Map map) {
        List<UpdatePackage> list;
        if ((th instanceof C1553030qW5) && (list = ((C1553030qW5) th).channels) != null) {
            C1552730qVb c1552730qVb = (C1552730qVb) c1554330qYB.l0;
            for (UpdatePackage updatePackage : list) {
                C1552590qVN c1552590qVNLIZ = c1552730qVb.LIZ(new C1552740qVc(updatePackage.getAccessKey(), updatePackage.getChannel()));
                if (c1552590qVNLIZ != null) {
                    c1552590qVNLIZ.LIZ(EnumC1552690qVX.INVALID_CHANNEL);
                }
            }
        }
    }

    public static final void LJII$1(C1554330qYB c1554330qYB, Throwable th, Map map) {
        String message;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c1554330qYB.l0;
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        interfaceC1631620sYq.invoke("onCheckServerVersionFail", bool, message);
    }

    public static final void LJIJ$0(C1554330qYB c1554330qYB, UpdatePackage updatePackage, Throwable th) {
        C1552590qVN c1552590qVNLIZ;
        if (updatePackage != null && (c1552590qVNLIZ = ((C1552730qVb) c1554330qYB.l0).LIZ(new C1552740qVc(updatePackage.getAccessKey(), updatePackage.getChannel()))) != null) {
            c1552590qVNLIZ.LIZ(EnumC1552690qVX.CHECK_UPDATE_FAILED);
        }
    }

    public static final void LJIJ$1(C1554330qYB c1554330qYB, UpdatePackage updatePackage, Throwable th) {
        C1552590qVN c1552590qVNLIZ;
        if (updatePackage != null && (c1552590qVNLIZ = ((C1552730qVb) c1554330qYB.l0).LIZ(new C1552740qVc(updatePackage.getAccessKey(), updatePackage.getChannel()))) != null) {
            c1552590qVNLIZ.LIZ(EnumC1552690qVX.CHECK_UPDATE_FAILED);
        }
    }

    public static final void LJIJ$2(C1554330qYB c1554330qYB, UpdatePackage updatePackage, Throwable th) {
        String message;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c1554330qYB.l0;
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        interfaceC1631620sYq.invoke("onUpdateFailed", bool, message);
    }

    public static final void LJIL$0(C1554330qYB c1554330qYB, long j, UpdatePackage updatePackage) {
        C1552590qVN c1552590qVNLIZ;
        if (updatePackage != null && (c1552590qVNLIZ = ((C1552730qVb) c1554330qYB.l0).LIZ(new C1552740qVc(updatePackage.getAccessKey(), updatePackage.getChannel()))) != null) {
            c1552590qVNLIZ.LIZ(EnumC1552690qVX.CHECK_UPDATE_SUCCEED);
        }
    }

    public static final void LJIL$1(C1554330qYB c1554330qYB, long j, UpdatePackage updatePackage) {
        C1552590qVN c1552590qVNLIZ;
        if (updatePackage != null && (c1552590qVNLIZ = ((C1552730qVb) c1554330qYB.l0).LIZ(new C1552740qVc(updatePackage.getAccessKey(), updatePackage.getChannel()))) != null) {
            c1552590qVNLIZ.LIZ(EnumC1552690qVX.CHECK_UPDATE_SUCCEED);
        }
    }

    public static final void LJIL$2(C1554330qYB c1554330qYB, long j, UpdatePackage updatePackage) {
        ((InterfaceC1631620sYq) c1554330qYB.l0).invoke("onUpdateSuccess", Boolean.TRUE, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        r4.add(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIZ$0(X.C1554330qYB r8, java.util.Map r9, java.util.Map r10, X.C1551680qTu r11) {
        /*
            java.lang.Object r0 = r8.l0
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r8 = r0.iterator()
        L12:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r6 = r8.next()
            r0 = r6
            X.0qVc r0 = (X.C1552740qVc) r0
            java.lang.String r7 = r0.LIZ
            java.lang.String r3 = r0.LIZIZ
            if (r9 == 0) goto L48
            java.lang.Object r0 = r9.get(r7)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L48
            java.util.Iterator r2 = r0.iterator()
        L31:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r1 = r2.next()
            r0 = r1
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L31
            if (r1 != 0) goto L74
        L48:
            r0 = r10
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r7)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L70
            java.util.Iterator r2 = r0.iterator()
        L57:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.geckox.model.UpdatePackage r0 = (com.bytedance.geckox.model.UpdatePackage) r0
            java.lang.String r0 = r0.getChannel()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L57
            if (r1 != 0) goto L74
        L70:
            r5.add(r6)
            goto L12
        L74:
            r4.add(r6)
            goto L12
        L78:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r5, r4)
            r0.getFirst()
            java.lang.Object r1 = r0.getSecond()
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L96
            X.0qVU r0 = X.C1552660qVU.LIZ
            r0.getClass()
            X.C1552660qVU.LIZ(r1)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1554330qYB.LJIIIZ$0(X.0qYB, java.util.Map, java.util.Map, X.0qTu):void");
    }
}
