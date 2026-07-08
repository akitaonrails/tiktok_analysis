package X;

import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264880j1K extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1264850j1H LL;
    public final /* synthetic */ C1091830eWD LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ User LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1264880j1K(InterfaceC1264850j1H interfaceC1264850j1H, C1091830eWD c1091830eWD, String str, String str2, User user, Map<String, Object> map) {
        super(0);
        this.LL = interfaceC1264850j1H;
        this.LLILLJJLI = c1091830eWD;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = user;
        this.LLILZLL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c7945.d4673_i");
        sbLIZ.append(this.LL.Yg());
        sbLIZ.append("_w6893");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(strLIZIZ, PageFinder.via((View) this.LLILLJJLI), null);
        IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
        if (iECommerceShowcaseService != null) {
            iECommerceShowcaseService.LIZIZ(this.LLILLJJLI.getContext(), C1733740vDY.LIZ(this.LLILLL, strCreateJumpSourceBtmToken), this.LLILZ, C736460Sui.LIZJ(this.LLILZIL), "follow", null, null, this.LLILZLL, C1733740vDY.LIZLLL(this.LLILLJJLI, strLIZIZ));
        }
        return Unit.LIZ;
    }
}
