package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18N3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.ad.AdAnchorJumpUtils$openPDPPage$1", f = "AdAnchorJumpUtils.kt", l = {}, m = "invokeSuspend")
public final class C18N3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ AnchorCommonStruct LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18N3(Aweme aweme, AnchorCommonStruct anchorCommonStruct, String str, InterfaceC1364105Vn<? super C18N3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = anchorCommonStruct;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18N3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C1C7U.LIZ("AdAnchorJumpUtils@d21.openPDPPage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAdDependencyService.class.getName();
            if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
        }
        AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("anchor_detail", "otherclick", this.LL.getAwemeRawAd());
        abstractC1056160dagOnAdEvent.LIZ.put("refer", "lynx_anchor");
        abstractC1056160dagOnAdEvent.LIZIZ();
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        AnchorCommonStruct anchorCommonStruct = this.LLILLJJLI;
        anchorBizUtils.getClass();
        List listLJJZZIII = AnchorBizUtils.LJJZZIII(anchorCommonStruct, true);
        C1392660mLQ c1392660mLQ = C1392660mLQ.LIZ;
        Aweme aweme = this.LL;
        String str = this.LLILLL;
        c1392660mLQ.getClass();
        C2344009Gk c2344009GkLIZ = C1392660mLQ.LIZ(str, aweme, listLJJZZIII);
        c2344009GkLIZ.LJIIIIZZ("click_method", "click_anchor");
        c2344009GkLIZ.LJIIIIZZ("click_type", "app_page");
        JSONObject jSONObjectLIZJ = C1392660mLQ.LIZJ(c2344009GkLIZ.LIZ);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LJI("enter_multi_anchor_detail", jSONObjectLIZJ);
        C2344009Gk c2344009GkLIZ2 = C1392660mLQ.LIZ(this.LLILLL, this.LL, listLJJZZIII);
        c2344009GkLIZ2.LJIIIIZZ("click_method", "click_anchor");
        C1507790pL7.LJI("multi_anchor_entrance_click", C1392660mLQ.LIZJ(c2344009GkLIZ2.LIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdAnchorJumpUtils@d21.openPDPPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
