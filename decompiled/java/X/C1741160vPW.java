package X;

import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.performance.EcPerfSceneConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS63S0010000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vPW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741160vPW extends AbstractC1741290vPj {
    public final ShopMallMixFragment LJ;
    public volatile EnumC1741050vPL LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public C1767790w6T LJIIJ;
    public final List<InterfaceC1741330vPn> LJIIJJI;

    @Override // X.AbstractC1741290vPj
    public final List<InterfaceC1741330vPn> LIZJ() {
        return this.LJIIJJI;
    }

    public C1741160vPW(final ShopMallMixFragment shopMallMixFragment) {
        this.LJ = shopMallMixFragment;
        this.LJIIJJI = C1697810uHb.LJIIJJI(new InterfaceC1741330vPn() { // from class: X.0NWQ
            @Override // X.InterfaceC1741330vPn
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1741330vPn
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1741330vPn
            public final void LIZ(C1741260vPg c1741260vPg) {
                List<Integer> list;
                long jCurrentTimeMillis;
                if (!C0NWT.LIZ()) {
                    return;
                }
                int i = C0NWS.LIZ[c1741260vPg.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i == 2 && C0NWR.LJI.getValue() != null) {
                        AtomicBoolean atomicBoolean = C0NWR.LIZJ;
                        if (!atomicBoolean.get()) {
                            atomicBoolean.set(true);
                            if (C0NWR.LIZLLL > 0) {
                                jCurrentTimeMillis = System.currentTimeMillis() - C0NWR.LIZLLL;
                            } else {
                                jCurrentTimeMillis = 0;
                            }
                            C0NWR.LIZLLL = 0L;
                            for (C09AE c09ae : (ArrayList) C0NWR.LJ) {
                                if (c09ae.isActive()) {
                                    c09ae.LIZIZ(null);
                                }
                            }
                            ((ArrayList) C0NWR.LJ).clear();
                            C054G c054g = C0NTE.LIZ;
                            C0NTE.LIZ("mall", C0NWX.EXIT, C0NWR.LIZ(Long.valueOf(jCurrentTimeMillis), "out_mall"));
                            return;
                        }
                        return;
                    }
                    return;
                }
                C01GW c01gw = C0NWR.LJI;
                if (c01gw.getValue() != null) {
                    AtomicBoolean atomicBoolean2 = C0NWR.LIZIZ;
                    if (!atomicBoolean2.get()) {
                        atomicBoolean2.set(true);
                        C0NWR.LIZLLL = System.currentTimeMillis();
                        EcPerfSceneConfig ecPerfSceneConfig = (EcPerfSceneConfig) c01gw.getValue();
                        if (ecPerfSceneConfig != null && (list = ecPerfSceneConfig.enterPageRunningTimeList) != null) {
                            Iterator<Integer> it2 = list.iterator();
                            while (it2.hasNext()) {
                                int iIntValue = it2.next().intValue();
                                C1DFH c1dfh = C0PEM.LIZ;
                                AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NTD(iIntValue, null), 3);
                                anonymousClass0956LIZLLL.LJII(new AwS588S0100000_9(anonymousClass0956LIZLLL, 665));
                                ((ArrayList) C0NWR.LJ).add(anonymousClass0956LIZLLL);
                            }
                        }
                    }
                }
            }
        }, new InterfaceC1741330vPn(shopMallMixFragment) { // from class: X.0vPN
            public static final /* synthetic */ int LIZIZ = 0;
            public final ShopMallMixFragment LIZ;

            @Override // X.InterfaceC1741330vPn
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1741330vPn
            public final void LIZJ() {
            }

            {
                this.LIZ = shopMallMixFragment;
            }

            @Override // X.InterfaceC1741330vPn
            public final void LIZ(C1741260vPg c1741260vPg) {
                EnumC1741200vPa enumC1741200vPa;
                EnumC1741180vPY enumC1741180vPY = c1741260vPg.LIZIZ;
                if ((enumC1741180vPY == EnumC1741180vPY.IN_MALL_HOMEPAGE && ((enumC1741200vPa = c1741260vPg.LIZJ.LIZ) == EnumC1741200vPa.CLOSE_LANDING_PAGE_FULL_SCREEN || enumC1741200vPa == EnumC1741200vPa.CLOSE_LANDING_PAGE_HALF_SCREEN)) || enumC1741180vPY == EnumC1741180vPY.OUT_OF_MALL) {
                    ShopMallMixFragment shopMallMixFragment2 = this.LIZ;
                    C1741060vPM.LIZ(shopMallMixFragment2, shopMallMixFragment2.LLJJJ.LIZLLL);
                }
            }
        }, new InterfaceC1741330vPn(shopMallMixFragment) { // from class: X.0w6i
            public static final /* synthetic */ int LIZIZ = 0;
            public final ShopMallMixFragment LIZ;

            @Override // X.InterfaceC1741330vPn
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1741330vPn
            public final void LIZJ() {
            }

            {
                this.LIZ = shopMallMixFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:170:0x0402  */
            /* JADX WARN: Removed duplicated region for block: B:370:0x089a  */
            /* JADX WARN: Removed duplicated region for block: B:388:0x091b  */
            /* JADX WARN: Type inference failed for: r2v106 */
            /* JADX WARN: Type inference failed for: r2v107, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r2v110 */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v3 */
            /* JADX WARN: Type inference failed for: r7v33 */
            /* JADX WARN: Type inference failed for: r7v34 */
            /* JADX WARN: Type inference failed for: r7v35 */
            /* JADX WARN: Type inference failed for: r7v36 */
            /* JADX WARN: Type inference failed for: r7v4 */
            /* JADX WARN: Type inference failed for: r7v7, types: [X.0NOB, java.lang.Long, java.util.Map] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1741330vPn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C1741260vPg r50) {
                /*
                    Method dump skipped, instruction units count: 2335
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1767940w6i.LIZ(X.0vPg):void");
            }
        }, new C1740940vPA(shopMallMixFragment), new C1767930w6h(shopMallMixFragment), this.LIZLLL, new InterfaceC1741330vPn(shopMallMixFragment) { // from class: X.0w6p
            public final ShopMallMixFragment LIZ;

            @Override // X.InterfaceC1741330vPn
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1741330vPn
            public final void LIZIZ() {
                this.LIZ.LLJJJ.getClass();
                C1767790w6T c1767790w6T = C1767980w6m.LJII;
                if (c1767790w6T != null) {
                    c1767790w6T.LJIILL = true;
                }
                C1767960w6k.LIZ.getClass();
                C1767960w6k.LJFF = true;
                ((ArrayList) this.LIZ.LLJJ.LL).clear();
                C1770900wBU.LIZ.getClass();
                if (!C1770900wBU.LJIJI) {
                    C1770900wBU.LJIJI = true;
                    if (C1770900wBU.LJII()) {
                        C1770900wBU.LIZJ(new AwS63S0010000_26(true, 2));
                    } else {
                        C1770900wBU.LIZJ(new AwS63S0010000_26(true, 1));
                    }
                }
                C1768340w7M.LIZ.getClass();
                C1768340w7M.LJ = null;
            }

            {
                this.LIZ = shopMallMixFragment;
            }

            @Override // X.InterfaceC1741330vPn
            public final void LIZ(C1741260vPg c1741260vPg) {
                if (c1741260vPg.LIZIZ == EnumC1741180vPY.OUT_OF_MALL) {
                    this.LIZ.LLJJJ.getClass();
                    C1767790w6T c1767790w6T = C1767980w6m.LJII;
                    if (c1767790w6T != null) {
                        c1767790w6T.LJIILL = true;
                    }
                }
                if (c1741260vPg.LJFF()) {
                    this.LIZ.LLJJJ.LJ = false;
                    C1767960w6k.LIZ.getClass();
                    C1767960w6k.LJFF = false;
                }
            }
        });
    }

    public final void LJ(String str, EnumC1741050vPL enumC1741050vPL) {
        EnumC1741200vPa enumC1741200vPa;
        int i = C1741170vPX.LIZJ[enumC1741050vPL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                C1741370vPr c1741370vPr = C1741370vPr.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unexpected landingPageType: ");
                sbLIZ.append(enumC1741050vPL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1741260vPg c1741260vPgLIZIZ = LIZIZ();
                this.LJ.getActivity();
                C1741370vPr.LIZ(c1741370vPr, str, strLIZIZ, c1741260vPgLIZIZ, 24);
                enumC1741200vPa = EnumC1741200vPa.OPEN_LANDING_PAGE_HALF_SCREEN;
            } else {
                enumC1741200vPa = EnumC1741200vPa.OPEN_LANDING_PAGE_FULL_SCREEN;
            }
        } else {
            enumC1741200vPa = EnumC1741200vPa.OPEN_LANDING_PAGE_HALF_SCREEN;
        }
        LIZ(EnumC1741180vPY.IN_MALL_COVERED_BY_PAGE, new C1741150vPV(enumC1741200vPa, false, 6));
    }

    public final void LJFF(String str, EnumC1741200vPa enumC1741200vPa) {
        EnumC1741180vPY enumC1741180vPY = LIZIZ().LIZIZ;
        EnumC1741180vPY enumC1741180vPY2 = EnumC1741180vPY.IN_MALL_HOMEPAGE;
        boolean z = false;
        if (enumC1741180vPY == enumC1741180vPY2) {
            C1767980w6m c1767980w6m = this.LJ.LLJJJ;
            if (c1767980w6m.LJ) {
                c1767980w6m.LJ = false;
            }
        }
        this.LJ.LLJJJ.getClass();
        C1767790w6T c1767790w6T = C1767980w6m.LJII;
        if (!Intrinsics.LJFF(this.LJIIJ, c1767790w6T)) {
            this.LJIIJ = c1767790w6T;
            z = true;
        }
        LIZ(enumC1741180vPY2, new C1741150vPV(enumC1741200vPa, z, 4));
        EnumC1741050vPL enumC1741050vPL = this.LJFF;
        if (enumC1741050vPL != null) {
            this.LJFF = null;
            if (enumC1741050vPL == EnumC1741050vPL.FULL_SCREEN) {
                this.LJII = true;
            } else {
                LJ(str, enumC1741050vPL);
            }
        }
    }
}
