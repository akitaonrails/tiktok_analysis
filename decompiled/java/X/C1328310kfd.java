package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1328310kfd extends AbstractC1328840kgU<C1328480kfu, C1328480kfu> {
    public final boolean LIZJ;
    public final InterfaceC1327160kdm LIZLLL;
    public final InterfaceC1327930kf1 LJ;
    public final C1326950kdR LJFF;
    public final C1326950kdR LJI;
    public final Map<String, C1326950kdR> LJII;
    public final InterfaceC1325590kbF LJIIIIZZ;
    public boolean LJIIIZ;
    public final C1328400kfm LJIIJ;
    public final /* synthetic */ C1328090kfH LJIIJJI;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1327820keq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(int r9, java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1328310kfd.LJII(int, java.lang.Object):void");
    }

    public final void LJIIL(C1328480kfu c1328480kfu, int i) throws Throwable {
        if (!AbstractC1327820keq.LJ(i) && (i & 10) == 0) {
            c1328480kfu.LJIJJLI();
            if (c1328480kfu.LLILLL != C1330000kiM.LIZJ) {
                C1325710kbR c1325710kbRLJFF = this.LJ.LJFF();
                if (!c1325710kbRLJFF.LIZLLL()) {
                    return;
                }
                InterfaceC1325590kbF interfaceC1325590kbF = this.LJIIIIZZ;
                this.LJ.LIZJ();
                C1291300jhw c1291300jhwLIZLLL = interfaceC1325590kbF.LIZLLL(c1325710kbRLJFF);
                EnumC1325560kbC enumC1325560kbC = c1325710kbRLJFF.LIZ;
                if (enumC1325560kbC == EnumC1325560kbC.SMALL) {
                    this.LJI.LJII(c1291300jhwLIZLLL, c1328480kfu);
                    return;
                }
                if (enumC1325560kbC == EnumC1325560kbC.CUSTOM) {
                    C1326950kdR c1326950kdR = this.LJII.get(c1325710kbRLJFF.LJIL);
                    if (c1326950kdR != null) {
                        c1326950kdR.LJII(c1291300jhwLIZLLL, c1328480kfu);
                        return;
                    }
                    return;
                }
                this.LJFF.LJII(c1291300jhwLIZLLL, c1328480kfu);
            }
        }
    }

    public final C19871212ow LJIIJJI(C1328480kfu c1328480kfu, C1324630kZh c1324630kZh, C1327120kdi c1327120kdi, String str) throws Throwable {
        String strLIZIZ;
        long j;
        if (!this.LJ.LIZ().LJIIJ(this.LJ.getId())) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        c1328480kfu.LJIJJLI();
        sbLIZ.append(c1328480kfu.LLILZLL);
        sbLIZ.append("x");
        c1328480kfu.LJIJJLI();
        sbLIZ.append(c1328480kfu.LLIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (c1324630kZh != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1324630kZh.LIZ);
            sbLIZ2.append("x");
            sbLIZ2.append(c1324630kZh.LIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "Unspecified";
        }
        HashMap map = new HashMap();
        c1328480kfu.LJIJJLI();
        map.put("Image format", String.valueOf(c1328480kfu.LLILLL));
        map.put("Original size", strLIZIZ2);
        map.put("Requested size", strLIZIZ);
        C1328400kfm c1328400kfm = this.LJIIJ;
        synchronized (c1328400kfm) {
            j = c1328400kfm.LJIIIZ - c1328400kfm.LJIIIIZZ;
        }
        map.put("queueTime", String.valueOf(j));
        map.put("Transcoder id", str);
        map.put("Transcoding result", String.valueOf(c1327120kdi));
        return C19871212ow.copyOf((Map) map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1328310kfd(C1328090kfH c1328090kfH, final InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1, boolean z, InterfaceC1327160kdm interfaceC1327160kdm, C1326950kdR c1326950kdR, C1326950kdR c1326950kdR2, Map<String, C1326950kdR> map, InterfaceC1325590kbF interfaceC1325590kbF) {
        super(interfaceC1328020kfA);
        this.LJIIJJI = c1328090kfH;
        this.LJ = interfaceC1327930kf1;
        this.LIZJ = z;
        this.LIZLLL = interfaceC1327160kdm;
        this.LJFF = c1326950kdR;
        this.LJI = c1326950kdR2;
        this.LJII = map;
        this.LJIIIIZZ = interfaceC1325590kbF;
        final EnumC1331380kka priority = interfaceC1327930kf1.getPriority();
        this.LJIIJ = new C1328400kfm(c1328090kfH.LIZ, new AbstractC1328430kfp(priority) { // from class: X.0kfc
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1328440kfq
            public final void LIZ(C1328480kfu c1328480kfu, int i) throws Throwable {
                C1327120kdi c1327120kdiTranscode;
                int i2 = i;
                C1328310kfd c1328310kfd = this.LIZIZ;
                InterfaceC1327160kdm interfaceC1327160kdm2 = c1328310kfd.LIZLLL;
                c1328480kfu.LJIJJLI();
                InterfaceC1328370kfj interfaceC1328370kfjLIZ = interfaceC1327160kdm2.LIZ(c1328480kfu.LLILLL, this.LIZIZ.LIZJ);
                interfaceC1328370kfjLIZ.getClass();
                c1328310kfd.LJ.LIZ().LJI(c1328310kfd.LJ.getId(), "ResizedImageDiskCacheWriteProducer");
                C1325710kbR c1325710kbRLJFF = c1328310kfd.LJ.LJFF();
                C1328760kgM c1328760kgMLIZLLL = c1328310kfd.LJIIJJI.LIZIZ.LIZLLL();
                try {
                    try {
                        c1327120kdiTranscode = interfaceC1328370kfjLIZ.transcode(c1328480kfu, c1328760kgMLIZLLL, c1325710kbRLJFF.LJIILIIL, c1325710kbRLJFF.LJIIJJI, null, 85);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1328310kfd.LJ.LIZ().LIZ(c1328310kfd.LJ.getId(), e, "ResizedImageDiskCacheWriteProducer", null);
                        if (AbstractC1327820keq.LIZLLL(i2)) {
                            c1328310kfd.LIZIZ.onFailure(e);
                        }
                    }
                    if (c1327120kdiTranscode.LIZ != 2) {
                        C19871212ow c19871212owLJIIJJI = c1328310kfd.LJIIJJI(c1328480kfu, c1325710kbRLJFF.LJIIJJI, c1327120kdiTranscode, interfaceC1328370kfjLIZ.getIdentifier());
                        C1323050kX9 c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(c1328760kgMLIZLLL.LIZ());
                        try {
                            C1328480kfu c1328480kfu2 = new C1328480kfu(c1323050kX9LJIJJLI);
                            c1328480kfu2.LLILLL = C1328580kg4.LIZ;
                            try {
                                c1328480kfu2.LJIJJ();
                                c1328310kfd.LJIIL(c1328480kfu2, i2);
                                c1328310kfd.LJ.LIZ().LIZIZ(c1328310kfd.LJ.getId(), "ResizedImageDiskCacheWriteProducer", c19871212owLJIIJJI);
                                if (c1327120kdiTranscode.LIZ != 1) {
                                    i2 |= 16;
                                }
                                c1328310kfd.LIZIZ.LIZJ(i2, c1328480kfu2);
                                C1328480kfu.LIZIZ(c1328480kfu2);
                                C1323050kX9.LJII(c1323050kX9LJIJJLI);
                                c1328760kgMLIZLLL.close();
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1328480kfu.LIZIZ(c1328480kfu2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C1323050kX9.LJII(c1323050kX9LJIJJLI);
                            throw th2;
                        }
                    }
                    throw new RuntimeException("Error while transcoding the image");
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c1328760kgMLIZLLL.close();
                    throw th3;
                }
            }
        }, 100);
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0kfg
            @Override // X.C1330860kjk, X.InterfaceC1330340kiu
            public final void LIZ() {
                if (this.LIZIZ.LJ.LIZLLL()) {
                    this.LIZIZ.LJIIJ.LJ();
                }
            }

            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                this.LIZIZ.LJIIJ.LIZ();
                this.LIZIZ.LJIIIZ = true;
                interfaceC1328020kfA.LIZIZ();
            }
        });
    }
}
