package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpOptConfig;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749710vdJ {
    public final PdpViewModel LIZ;
    public C11JF LIZIZ;
    public long LIZJ = -1;
    public boolean LIZLLL;
    public boolean LJ;

    public C1749710vdJ(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final boolean LIZ(String str) {
        Object objLIZIZ;
        IPdpPreviewService iPdpPreviewService = (IPdpPreviewService) PluggableExtentionKt.pluggableSpi$default(IPdpPreviewService.class, false, false, false, 14, null);
        if (iPdpPreviewService == null || (objLIZIZ = iPdpPreviewService.LIZIZ(str)) == null || !(objLIZIZ instanceof ProductPackStruct)) {
            return false;
        }
        PdpViewModel pdpViewModel = this.LIZ;
        if (pdpViewModel.LLLZIL) {
            return true;
        }
        EnumC1756020vnU enumC1756020vnU = EnumC1756020vnU.PREFETCH_PART;
        if (pdpViewModel.LLLLIIIILLL == EnumC1756020vnU.NOCACHE) {
            pdpViewModel.LLLLIIIILLL = enumC1756020vnU;
        }
        PdpViewModel.zS2(pdpViewModel, (ProductPackStruct) objLIZIZ, null, false, true, false, true, false, C1756440voA.LIZ().directSetState, false, false, 848);
        if (!((PdpOptConfig) C1700310uLd.LIZIZ.getValue()).removeUpdateInfoRepeat) {
            C948503nH.LJFF(this.LIZ, C23271099x.INSTANCE, new C1740890vP5(this, objLIZIZ, null));
        }
        this.LIZ.LLLII = true;
        return true;
    }

    public final boolean LIZLLL(Context context, IPdpStarter.PdpEnterParam pdpEnterParam) {
        Object objLIZ;
        Type type;
        if (!C770702zh.LIZIZ(pdpEnterParam.pdpCacheKey) || (objLIZ = C1323720kYE.LIZ(context).LIZ(pdpEnterParam.pdpCacheKey)) == null) {
            return false;
        }
        C1323720kYE.LIZ(context).LJI(pdpEnterParam.pdpCacheKey);
        String string = objLIZ.toString();
        PdpPreviewInfo pdpPreviewInfo = null;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(PdpPreviewInfo.class));
            } else {
                type = new TypeToken<PdpPreviewInfo>() { // from class: X.0vdK
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
            if (!(objFromJson instanceof PdpPreviewInfo)) {
                objFromJson = null;
            }
            pdpPreviewInfo = (PdpPreviewInfo) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZ.qS2(pdpPreviewInfo);
        return true;
    }

    public static void LJ(Context context, PopUp popUp, Map map) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        long jLongValue;
        String str = popUp.schema;
        if (str == null) {
            return;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        Object obj = map.get("author_id");
        String string12 = null;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        builderBuildUpon.appendQueryParameter("anchor_id", string);
        Object obj2 = map.get("source_content_id");
        if (obj2 != null) {
            string2 = obj2.toString();
        } else {
            string2 = null;
        }
        builderBuildUpon.appendQueryParameter("group_id", string2);
        Object obj3 = map.get("entrance_form");
        if (obj3 != null) {
            string3 = obj3.toString();
        } else {
            string3 = null;
        }
        builderBuildUpon.appendQueryParameter("enter_from", string3);
        Object obj4 = map.get("anchor_show_type");
        if (obj4 != null) {
            string4 = obj4.toString();
        } else {
            string4 = null;
        }
        builderBuildUpon.appendQueryParameter("anchor_show_type", string4);
        Object obj5 = map.get("product_source");
        if (obj5 != null) {
            string5 = obj5.toString();
        } else {
            string5 = null;
        }
        builderBuildUpon.appendQueryParameter("product_source", string5);
        Object obj6 = map.get("source_from");
        if (obj6 != null) {
            string6 = obj6.toString();
        } else {
            string6 = null;
        }
        builderBuildUpon.appendQueryParameter("source_from", string6);
        Object obj7 = map.get("source");
        if (obj7 != null) {
            string7 = obj7.toString();
        } else {
            string7 = null;
        }
        builderBuildUpon.appendQueryParameter("source", string7);
        Object obj8 = map.get("product_id");
        if (obj8 != null) {
            string8 = obj8.toString();
        } else {
            string8 = null;
        }
        builderBuildUpon.appendQueryParameter("product_id", string8);
        Object obj9 = map.get("is_self");
        if (obj9 != null) {
            string9 = obj9.toString();
        } else {
            string9 = null;
        }
        builderBuildUpon.appendQueryParameter("is_self", string9);
        Object obj10 = map.get("is_single_anchor");
        if (obj10 != null) {
            string10 = obj10.toString();
        } else {
            string10 = null;
        }
        builderBuildUpon.appendQueryParameter("is_single_anchor", string10);
        Object obj11 = map.get("is_ad");
        if (obj11 != null) {
            string11 = obj11.toString();
        } else {
            string11 = null;
        }
        builderBuildUpon.appendQueryParameter("is_ad", string11);
        Object obj12 = map.get("ad_id");
        if (obj12 != null) {
            string12 = obj12.toString();
        }
        builderBuildUpon.appendQueryParameter("ad_id", string12);
        String string13 = builderBuildUpon.toString();
        Long l = popUp.fcSecond;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Object objLIZ = C1323720kYE.LIZ(context).LIZ("ug_last_popup_time");
        if (objLIZ == null) {
            SmartRouter.buildRoute(context, string13).open();
            objLIZ = Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        } else {
            long j = CastLongProtector.parseLong(objLIZ.toString()) + jLongValue;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            if (j <= jCurrentTimeMillis / j2) {
                SmartRouter.buildRoute(context, string13).open();
                objLIZ = Long.valueOf(System.currentTimeMillis() / j2);
            }
        }
        C1323720kYE.LIZ(context).LJIIIIZZ(objLIZ.toString(), "ug_last_popup_time");
    }

    public final boolean LIZIZ(IPdpStarter.PdpEnterParam pdpEnterParam, Context context, Function1<? super String, Unit> function1) {
        String str;
        String str2;
        String str3;
        Map<String, String> map = pdpEnterParam.pdpPreParam;
        String str4 = "";
        if (C770702zh.LIZIZ(pdpEnterParam.pdpCacheKey)) {
            if (!LIZLLL(context, pdpEnterParam) && !((PdpOptConfig) C1700310uLd.LIZIZ.getValue()).other) {
                return true;
            }
            PdpPreviewInfo pdpPreviewInfo = this.LIZ.LLLIILIL;
            if (pdpPreviewInfo == null || (str = pdpPreviewInfo.cover) == null) {
                str = "";
            }
            function1.invoke(str);
            PdpViewModel pdpViewModel = this.LIZ;
            C1749710vdJ c1749710vdJ = pdpViewModel.LLLLLLJ;
            PdpPreviewInfo pdpPreviewInfo2 = pdpViewModel.LLLIILIL;
            if (pdpPreviewInfo2 != null && (str3 = pdpPreviewInfo2.id) != null) {
                str4 = str3;
            }
            if (!c1749710vdJ.LIZ(str4) && this.LIZ.LLLIILIL != null) {
                String productId = pdpEnterParam.getProductId();
                PdpPreviewInfo pdpPreviewInfo3 = this.LIZ.LLLIILIL;
                if (pdpPreviewInfo3 != null) {
                    str2 = pdpPreviewInfo3.id;
                } else {
                    str2 = null;
                }
                if (!Intrinsics.LJFF(productId, str2)) {
                }
            }
            return true;
        }
        String str5 = map.get(FollowStatusChangeMethod.PARAM_UID);
        String str6 = map.get("title");
        if (str6 == null) {
            str6 = "";
        }
        String str7 = map.get("price");
        if (str7 == null) {
            str7 = "";
        }
        String str8 = map.get("cover");
        if (str8 != null && !a0.LJJJIL(str8) && !a0.LJJJIL(str6)) {
            function1.invoke(str8);
            this.LIZ.qS2(new PdpPreviewInfo(str6, str7, str8, str5, 0, false, null, null));
            C1749710vdJ c1749710vdJ2 = this.LIZ.LLLLLLJ;
            if (str5 != null) {
                str4 = str5;
            }
            if (c1749710vdJ2.LIZ(str4)) {
                return true;
            }
        } else {
            PdpViewModel pdpViewModel2 = this.LIZ;
            pdpViewModel2.LLLLLLJ.LIZ(pdpViewModel2.getProductId());
            return true;
        }
        return false;
    }

    public final void LIZJ(Context context, String str, String str2) {
        ProductPackStruct productPackStructLIZLLL;
        if (a0.LJJJIL(str) || (productPackStructLIZLLL = C1758140vqu.LIZLLL(str)) == null) {
            return;
        }
        PdpViewModel pdpViewModel = this.LIZ;
        pdpViewModel.LLLIIII = true;
        C1756150vnh c1756150vnh = pdpViewModel.LLLLIL;
        if (c1756150vnh != null) {
            c1756150vnh.LIZIZ(EnumC1756160vni.CACHE, productPackStructLIZLLL);
        }
        PdpViewModel.zS2(this.LIZ, productPackStructLIZLLL, null, false, true, false, false, false, C1756440voA.LIZ().directSetState, true, false, 624);
        C948503nH.LJFF(this.LIZ, C0PEM.LIZJ, new C1740860vP2(this, str2, context, productPackStructLIZLLL, null));
    }
}
