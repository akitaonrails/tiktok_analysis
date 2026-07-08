package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.PdpBridgeVideoCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1752100vhA extends C2217421BqW implements Function1<Integer, InterfaceC1891350zJl> {
    public C1752100vhA(PdpBridgeBaseCell pdpBridgeBaseCell) {
        super(1, pdpBridgeBaseCell, PdpBridgeVideoCell.class, "getItem", "getItem(I)Lcom/bytedance/ies/powerlist/data/PowerItem;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1891350zJl invoke(Integer num) {
        return ((PdpBridgeBaseCell) this.receiver).S5(num.intValue());
    }
}
