package X;

import android.view.View;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1753050vih extends C2217421BqW implements Function1<View, AbsFullSpanVH<Object>> {
    public C1753050vih(AssemPowerCell assemPowerCell) {
        super(1, assemPowerCell, PdpBridgeBaseCell.class, "createViewHolder", "createViewHolder(Landroid/view/View;)Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/basicui/listitem/common/AbsFullSpanVH;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbsFullSpanVH<Object> invoke(View view) {
        return ((PdpBridgeBaseCell) this.receiver).R5(view);
    }
}
