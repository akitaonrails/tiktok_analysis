package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180991AXh extends C09AY implements Function1<LayoutDSLConfig, Unit> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180991AXh(C1AXM c1axm) {
        super(1);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LayoutDSLConfig layoutDSLConfig) {
        final LayoutDSLConfig layoutDSLConfig2 = layoutDSLConfig;
        this.LL.LJJJI();
        final C1AXM c1axm = this.LL;
        if (layoutDSLConfig2 == null) {
            c1axm.getClass();
        } else {
            c1axm.LLJJIII.LIZ = layoutDSLConfig2.sceneVersion;
            String strLLIIII = c1axm.LLIIII(730);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1axm.LJLLL());
            sbLIZ.append(":receiveMsgAndUpdate layoutDSLConfig = ");
            sbLIZ.append(layoutDSLConfig2);
            C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
            C2177031AIb c2177031AIb = c1axm.LL;
            c2177031AIb.LJFF.LJJJ(c2177031AIb.LIZIZ, layoutDSLConfig2.sceneVersion, new InterfaceC1303110k0z() { // from class: X.1AXu
                @Override // X.InterfaceC1303110k0z
                public final void LIZ(DslLayout dslLayout) {
                    final C1AXM c1axm2 = c1axm;
                    c1axm2.LLJJIJI = dslLayout;
                    c1axm2.LL.LJFF.LJJL(c1axm2.LLJJIII.LIZ, layoutDSLConfig2.layoutId, new InterfaceC1303160k14() { // from class: X.1AY2
                        @Override // X.InterfaceC1303160k14
                        public final void LIZ(Layout layout) {
                            if (layout != null) {
                                c1axm2.LJJLIIJ().LJIILJJIL(layout, false);
                            }
                        }
                    }, null);
                }
            }, null);
        }
        return Unit.LIZ;
    }
}
