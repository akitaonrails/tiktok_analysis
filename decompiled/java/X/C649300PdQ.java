package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649300PdQ extends C649290PdP {
    public InterfaceC1541990qEH LJIL;
    public final C01GW LJJ;

    @Override // X.C649290PdP, X.C0PZI
    public final View LIZIZ() {
        View viewE1;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LJIL;
        return (interfaceC1541990qEH == null || (viewE1 = interfaceC1541990qEH.e1()) == null) ? this.LJIILIIL : viewE1;
    }

    public final C1537480q70 LJIIJJI() {
        return (C1537480q70) this.LJJ.getValue();
    }

    public final void LJIIL(C1537720q7O c1537720q7O) {
        C1537480q70 hybridContext;
        Object objLJFF;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LJIL;
        if (interfaceC1541990qEH != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null && (objLJFF = hybridContext.LJFF(ISearchContextAbility.class)) != null) {
            c1537720q7O.getHybridContext().LJJ(ISearchContextAbility.class, objLJFF);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C649300PdQ(android.content.Context r13, X.EnumC648990Pcv r14, com.bytedance.hybrid.spark.SparkContext r15) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C649300PdQ.<init>(android.content.Context, X.0Pcv, com.bytedance.hybrid.spark.SparkContext):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, X.0Pd8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // X.C649290PdP, X.C0PZI
    public final void LJFF(final DynamicPatch dynamicPatch, Map<String, ? extends Object> map, boolean z, boolean z2, boolean z3, final LynxViewClient lynxViewClient) {
        Integer numValueOf;
        CharSequence charSequenceLJIIIIZZ;
        EnumC647870Pb7 enumC647870Pb7;
        EnumC647870Pb7 enumC647870Pb72;
        int i;
        EnumC647870Pb7 enumC647870Pb73;
        View viewE1;
        View viewE12;
        AbstractC1542100qES abstractC1542100qES;
        LynxView lynxView;
        C1ECQ.LIZ.getClass();
        if (C1ECQ.LIZIZ()) {
            C649470Pdh c649470Pdh = C649470Pdh.LIZ;
            DynamicPatch dynamicPatch2 = this.LJIIJJI;
            c649470Pdh.getClass();
            Integer numValueOf2 = null;
            if (C649470Pdh.LJIIJJI(dynamicPatch, dynamicPatch2, z3)) {
                View viewLIZIZ = LIZIZ();
                if ((viewLIZIZ instanceof LynxView) && (lynxView = (LynxView) viewLIZIZ) != null) {
                    lynxView.onEnterForeground();
                }
                InterfaceC1541990qEH interfaceC1541990qEH = this.LJIL;
                if (interfaceC1541990qEH != null && (abstractC1542100qES = this.LJ) != null) {
                    abstractC1542100qES.LJLIIIL(interfaceC1541990qEH);
                    return;
                }
                return;
            }
            if (!C0BRO.LIZ()) {
                LJIIIIZZ();
                this.LIZLLL = null;
            }
            final C649330PdT c649330PdT = new C649330PdT(map, this, z2, dynamicPatch, z);
            this.LJIIJJI = dynamicPatch;
            this.LJIJI.LIZ(dynamicPatch);
            final C0R4T c0r4t = this.LJIJJ;
            if (c0r4t != null) {
                C649100Pd6 c649100Pd6 = C649100Pd6.LIZ;
                final Context context = this.LIZIZ;
                final InterfaceC1541990qEH interfaceC1541990qEH2 = this.LJIL;
                final C1537480q70 c1537480q70LJIIJJI = LJIIJJI();
                c649100Pd6.getClass();
                if (!z) {
                    C649100Pd6.LJI(context, interfaceC1541990qEH2, c1537480q70LJIIJJI, c649330PdT, lynxViewClient);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadFromCacheLite start spark load, kitview hashcode:");
                if (interfaceC1541990qEH2 != null && (viewE12 = interfaceC1541990qEH2.e1()) != null) {
                    numValueOf = Integer.valueOf(viewE12.hashCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", dynamicContainer.kitView:");
                InterfaceC1541990qEH interfaceC1541990qEH3 = this.LJIL;
                if (interfaceC1541990qEH3 != null && (viewE1 = interfaceC1541990qEH3.e1()) != null) {
                    numValueOf2 = Integer.valueOf(viewE1.hashCode());
                }
                sbLIZ.append(numValueOf2);
                C2188811AlT.LIZIZ(sbLIZ);
                Object obj = this.LJIL;
                if ((obj instanceof View) && C649100Pd6.LJ((View) obj)) {
                    C647890Pb9 c647890Pb9 = new C647890Pb9();
                    c647890Pb9.LJIIZILJ("type", "spark_container_destroyed");
                    c647890Pb9.LJIIZILJ("schema", dynamicPatch.schema);
                    c647890Pb9.LJIILJJIL();
                    return;
                }
                final C259800zU c259800zU = new C259800zU();
                String bulletSchema = dynamicPatch.getBulletSchema();
                ?? r0 = bulletSchema;
                if (bulletSchema == null) {
                    r0 = dynamicPatch.schema;
                }
                c259800zU.element = r0;
                if (TextUtils.isEmpty(r0)) {
                    c259800zU.element = "";
                }
                dynamicPatch.schema = (String) c259800zU.element;
                final C259800zU c259800zU2 = new C259800zU();
                C649310PdR c649310PdR = C649310PdR.LIZ;
                String str = (String) c259800zU.element;
                AbstractC1542100qES abstractC1542100qES2 = new AbstractC1542100qES() { // from class: X.0PdU
                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH4) {
                        Integer numValueOf3;
                        C1537720q7O c1537720q7O;
                        C259800zU<C649120Pd8> c259800zU3 = c259800zU2;
                        C649120Pd8 c649120Pd8 = c259800zU3.element;
                        if (c649120Pd8 != null) {
                            C649300PdQ c649300PdQ = this;
                            AbstractC1542100qES abstractC1542100qES3 = c0r4t;
                            DynamicPatch dynamicPatch3 = dynamicPatch;
                            Function0<TemplateData> function0 = c649330PdT;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[onLoadFinish] In loadFromCacheLite callback onLoadFinish, ready to onPreLoadSucceedSparkLite. view hashcode:");
                            View viewE13 = interfaceC1541990qEH4.e1();
                            Integer numValueOf4 = null;
                            if (viewE13 != null) {
                                numValueOf3 = Integer.valueOf(viewE13.hashCode());
                            } else {
                                numValueOf3 = null;
                            }
                            sbLIZ2.append(numValueOf3);
                            sbLIZ2.append(", cache hashcode:");
                            C649120Pd8 c649120Pd82 = c259800zU3.element;
                            if (c649120Pd82 != null && (c1537720q7O = c649120Pd82.LIZIZ) != null) {
                                numValueOf4 = Integer.valueOf(c1537720q7O.hashCode());
                            }
                            sbLIZ2.append(numValueOf4);
                            sbLIZ2.append(" succeed:");
                            sbLIZ2.append(c259800zU3.element);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            SearchMiddleMonitor.INSTANCE.recordPreloadFinish(EnumC037300Bf.FROM_CONTINUE_LOAD);
                            C649100Pd6 c649100Pd62 = C649100Pd6.LIZ;
                            TemplateData templateDataInvoke = function0.invoke();
                            c649100Pd62.getClass();
                            C649100Pd6.LJIILIIL(c649300PdQ, c649120Pd8, abstractC1542100qES3, dynamicPatch3, templateDataInvoke);
                        }
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH4, String str2, String str3) {
                        SearchMiddleMonitor.INSTANCE.recordPreloadFailed(str3);
                        C649100Pd6 c649100Pd62 = C649100Pd6.LIZ;
                        Context context2 = context;
                        String str4 = c259800zU.element;
                        InterfaceC1541990qEH interfaceC1541990qEH5 = interfaceC1541990qEH2;
                        C649300PdQ c649300PdQ = this;
                        AbstractC1542100qES abstractC1542100qES3 = c0r4t;
                        c649100Pd62.getClass();
                        C649100Pd6.LJI(context, C649100Pd6.LIZLLL(context2, str4, interfaceC1541990qEH5, c649300PdQ, abstractC1542100qES3), c1537480q70LJIIJJI, c649330PdT, lynxViewClient);
                    }
                };
                c649310PdR.getClass();
                C19EG c19egLJ = C651290Pgd.LJ();
                if (c19egLJ == null || (charSequenceLJIIIIZZ = C1308910kAL.LJIIIIZZ(c19egLJ)) == null) {
                    charSequenceLJIIIIZZ = "";
                }
                C649310PdR.LIZIZ(charSequenceLJIIIIZZ);
                C649120Pd8 c649120Pd8 = (C649120Pd8) C649310PdR.LJ().remove(str);
                ?? r3 = c649120Pd8;
                if (c649120Pd8 == null) {
                    r3 = (C649120Pd8) C649310PdR.LIZLLL().remove(str);
                }
                if (C0QCS.LIZ(str)) {
                    if (r3 != 0) {
                        enumC647870Pb73 = r3.LIZJ;
                    } else {
                        enumC647870Pb73 = null;
                    }
                    if (enumC647870Pb73 == EnumC647870Pb7.LOADING) {
                        C649310PdR.LJFF.put(r3.LIZIZ, abstractC1542100qES2);
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fetch cache of ");
                sbLIZ2.append(str);
                sbLIZ2.append(" and result is ");
                sbLIZ2.append((Object) r3);
                sbLIZ2.append(" status:");
                if (r3 != 0) {
                    enumC647870Pb7 = r3.LIZJ;
                } else {
                    enumC647870Pb7 = null;
                }
                sbLIZ2.append(enumC647870Pb7);
                sbLIZ2.append(' ');
                C2188811AlT.LIZIZ(sbLIZ2);
                c259800zU2.element = r3;
                if (r3 != 0 && (enumC647870Pb72 = r3.LIZJ) != null && (i = C647860Pb6.LIZ[enumC647870Pb72.ordinal()]) != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return;
                            } else {
                                throw new C1954807lC();
                            }
                        }
                    } else {
                        SearchMiddleMonitor.INSTANCE.recordPreloadFinish(EnumC037300Bf.FROM_ALREADY_FINISH);
                        C649100Pd6.LJIILIIL(this, (C649120Pd8) c259800zU2.element, c0r4t, dynamicPatch, (TemplateData) c649330PdT.invoke());
                        return;
                    }
                }
                C649100Pd6.LJI(context, C649100Pd6.LIZLLL(context, (String) c259800zU.element, interfaceC1541990qEH2, this, c0r4t), c1537480q70LJIIJJI, c649330PdT, lynxViewClient);
                return;
            }
            return;
        }
        super.LJFF(dynamicPatch, map, z, z2, z3, lynxViewClient);
    }
}
