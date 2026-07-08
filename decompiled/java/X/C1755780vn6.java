package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.tabbar.PdpTabBarAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.tabbar.PdpTabBarVM;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.BaseItemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeaderAssem;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755780vn6 {
    public final AbstractC738140SxQ LIZ;
    public final InterfaceC1755080vly LIZIZ;
    public final C1755800vn8 LIZJ = new C1755800vn8();
    public final C1755810vn9 LIZLLL;

    public C1755780vn6(PdpHeaderAssem pdpHeaderAssem, InterfaceC1755080vly interfaceC1755080vly) {
        this.LIZ = pdpHeaderAssem;
        this.LIZIZ = interfaceC1755080vly;
        C1755810vn9 c1755810vn9 = new C1755810vn9();
        c1755810vn9.LIZ.put("pdp_header_tab_bar_style_1", new InterfaceC1179400gnS() { // from class: X.0vn7
            @Override // X.InterfaceC1179400gnS
            public final void LIZ() {
            }

            @Override // X.InterfaceC1179400gnS
            public final C19719912Dl LIZJ() {
                return C13LE.LIZ(PdpTabBarAssem.class);
            }

            @Override // X.InterfaceC1179400gnS
            public final void getContainerId() {
            }

            @Override // X.InterfaceC1179400gnS
            public final BaseItemViewModel<? extends InterfaceC0148002o> LIZIZ(AbstractC738140SxQ abstractC738140SxQ) {
                C019F c019f = C019F.LIZ;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpTabBarVM.class);
                return (BaseItemViewModel) C724750Sbp.LIZ(abstractC738140SxQ, C724750Sbp.LJIIJ(abstractC738140SxQ, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS570S0100000_26(c19719912DlLIZ, 1611), AFwS268S0000000_26.get$arr$(760), null, true).getValue();
            }
        });
        this.LIZLLL = c1755810vn9;
    }
}
