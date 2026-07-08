package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C850050XWh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ C0XT7<C0XX6> LLILZ;
    public final /* synthetic */ C0XYD LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C850050XWh(String str, String str2, Fragment fragment, C0XT7<C0XX6> c0xt7, C0XYD c0xyd, boolean z) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = fragment;
        this.LLILZ = c0xt7;
        this.LLILZIL = c0xyd;
        this.LLILZLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strOptString;
        String strOptString2;
        JSONObject jSONObject;
        if (!Intrinsics.LJFF(this.LL, "phone") && C123100dR.LIZ(this.LLILLJJLI)) {
            C852810Xct c852810Xct = C852810Xct.LIZ;
            Fragment fragment = this.LLILLL;
            String str = this.LLILLJJLI;
            c852810Xct.getClass();
            C852810Xct.LJIIZILJ(fragment, str);
        }
        if (Intrinsics.LJFF(this.LL, "handle")) {
            ((IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class)).LIZLLL(((C0XX6) this.LLILZ.LJIIIZ).LJIILJJIL.LIZ, "username");
            ((IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class)).LJIIJ("username");
        }
        T t = this.LLILZ.LJIIIZ;
        JSONObject jSONObjectOptJSONObject = (t == 0 || (jSONObject = t.LJ) == null) ? null : jSONObject.optJSONObject("data");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String str2 = this.LL;
        BaseAccountFlowFragment mobParams = this.LLILZIL.getMobParams();
        C0XO3 c0xo3 = ((C0XX6) this.LLILZ.LJIIIZ).LJIILJJIL;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("is_org_account", Integer.valueOf(this.LLILZLL ? 1 : 0));
        pairArr[1] = new Pair("account_type", Integer.valueOf(((C0XX6) this.LLILZ.LJIIIZ).LJIILJJIL.LJIJ));
        String str3 = "";
        if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("tt_account_type")) == null) {
            strOptString = "";
        }
        pairArr[2] = new Pair("tt_account_type", strOptString);
        pairArr[3] = new Pair("is_org_account_inter_period", (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.optBoolean("is_org_account_conv_inter_period")) ? CardStruct.IStatusCode.DEFAULT : "1");
        if (jSONObjectOptJSONObject != null && (strOptString2 = jSONObjectOptJSONObject.optString("org_account_biz_line_platform_name")) != null) {
            str3 = strOptString2;
        }
        pairArr[4] = new Pair("business_platform_name", str3);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(false, str2, mobParams, c0xo3, mapLJIIIIZZ);
        C0XYO c0xyo = C0XYO.LIZ;
        Fragment fragment2 = this.LLILLL;
        C0XYD c0xyd = this.LLILZIL;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
        C0XO3 c0xo32 = ((C0XX6) this.LLILZ.LJIIIZ).LJIILJJIL;
        c0xyo.getClass();
        C0XYO.LIZJ(fragment2, c0xyd, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo32);
        return Unit.LIZ;
    }
}
