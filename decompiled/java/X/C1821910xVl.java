package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkHeaderAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xVl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821910xVl extends C09AY implements Function1<LinearLayout, View> {
    public final /* synthetic */ PcsThirdPartyLinkHeaderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821910xVl(PcsThirdPartyLinkHeaderAssem pcsThirdPartyLinkHeaderAssem) {
        super(1);
        this.LL = pcsThirdPartyLinkHeaderAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(LinearLayout linearLayout) {
        this.LL.getClass();
        return PcsThirdPartyLinkHeaderAssem.hp(R.attr.cpf, linearLayout);
    }
}
