package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C602570NkF extends AbstractC602580NkG {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC602590NkH interfaceC602590NkH = (InterfaceC602590NkH) xBaseParamModel;
        IMixVSearchAbility iMixVSearchAbilityLIZ = C602660NkO.LIZ(this.IBridgeSdkContext);
        if (iMixVSearchAbilityLIZ != null) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            Unit unit = null;
            if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
                iMixVSearchAbilityLIZ.OR0(view, interfaceC602590NkH);
                unit = Unit.LIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ability is not null : ");
            sbLIZ.append(unit);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
