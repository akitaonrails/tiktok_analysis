package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.InviteAndShareConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.18LL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.EcVideoCampaignHelper$autoPopup$1", f = "EcVideoCampaignHelper.kt", l = {77}, m = "invokeSuspend")
public final class C18LL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InviteAndShareConfig LLILLJJLI;
    public final /* synthetic */ InterfaceC1392640mLO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18LL(InviteAndShareConfig inviteAndShareConfig, InterfaceC1392640mLO interfaceC1392640mLO, InterfaceC1364105Vn<? super C18LL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inviteAndShareConfig;
        this.LLILLL = interfaceC1392640mLO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18LL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        String str2;
        C1C7U.LIZ("EcVideoCampaignHelper@a398.autoPopup$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C19EG c19eg = null;
        boolean z5 = false;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Long lLJFF = C2286608xc.LJFF(this.LLILLJJLI.autoPopupDelay);
            if (lLJFF.longValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                lLJFF = null;
            }
            if (lLJFF != null) {
                long jLongValue = lLJFF.longValue();
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("EcVideoCampaignHelper@a398.autoPopup$1");
                    return objLJFF;
                }
            }
        }
        C18LI c18li = C18LI.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLL;
        String string = this.LLILLJJLI.autoPopupOrderPageSchema;
        c18li.getClass();
        C18LJ c18lj = C18LI.LIZIZ;
        if (c18lj != null) {
            if (string.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 && !c18lj.LIZLLL && Intrinsics.LJFF(c18lj.LIZ, interfaceC1392640mLO.LJJLIIIJJIZ().getAid())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", interfaceC1392640mLO.Cf());
                linkedHashMap.put("source_page_type", "video");
                linkedHashMap.put("previous_page", "video");
                String aid = interfaceC1392640mLO.LJJLIIIJJIZ().getAid();
                if (aid == null) {
                    aid = "";
                }
                linkedHashMap.put("source_content_id", aid);
                Map<String, String> map = c18lj.LIZIZ.daInfo;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                try {
                    Uri uri = UriProtector.parse(string);
                    Uri.Builder builder = new Uri.Builder();
                    builder.scheme(uri.getScheme());
                    builder.authority(uri.getHost());
                    builder.path(uri.getPath());
                    for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                        builder.appendQueryParameter(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
                    }
                    builder.appendQueryParameter("campaign_type", String.valueOf(c18lj.LIZIZ.campaignType));
                    builder.appendQueryParameter("campaign_info", c18lj.LIZIZ.campaignInfo);
                    builder.appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap));
                    string = builder.build().toString();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                SmartRouter.buildRoute(interfaceC1392640mLO.LIZIZ(), string).open();
                c18lj.LIZLLL = true;
            } else {
                if (string.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    str2 = "schema is empty";
                } else if (c18lj.LIZLLL) {
                    str2 = "coupon page already visited.";
                } else {
                    str2 = "aid not match";
                }
                C18LI.LJI(str2);
            }
        }
        Integer numLJ = C2286608xc.LJ(this.LLILLJJLI.autoPopupAnchorPanel);
        if (numLJ.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            numLJ = null;
        }
        if (numLJ != null) {
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLILLL;
            numLJ.intValue();
            C18LI.LIZ.getClass();
            C18LJ c18lj2 = C18LI.LIZIZ;
            if (c18lj2 != null) {
                if (!Intrinsics.LJFF(c18lj2.LIZ, interfaceC1392640mLO2.LJJLIIIJJIZ().getAid())) {
                    c18lj2 = null;
                }
                if (c18lj2 != null) {
                    AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                    List<AnchorCommonStruct> anchors = interfaceC1392640mLO2.LJJLIIIJJIZ().getAnchors();
                    anchorBizUtils.getClass();
                    List listLJJZZIII = AnchorBizUtils.LJJZZIII(AnchorBizUtils.LJJIIZ(anchors), false);
                    C21269318Lj c21269318Lj = new C21269318Lj();
                    c21269318Lj.LIZ.setPanelStyle(AnchorBizUtils.LJJJI(listLJJZZIII.size(), 2));
                    c21269318Lj.LIZ.setPanelClickMethod(1);
                    C21272618Mq c21272618Mq = C21272618Mq.LIZ;
                    Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
                    if (listLJJZZIII.size() == 1) {
                        z5 = true;
                    }
                    c21272618Mq.getClass();
                    c21269318Lj.LIZ.setEnableMaybeYouLike(C21272618Mq.LJIIIZ(awemeLJJLIIIJJIZ, listLJJZZIII, z5));
                    c21269318Lj.LIZ.setEnablePromotionBanner(true);
                    c21269318Lj.LIZ.setEnableSearchEntrance(true);
                    c21269318Lj.LIZ.setEnableClaimVoucher(true);
                    AnchorPanelConfig anchorPanelConfig = c21269318Lj.LIZ;
                    Activity activityLIZIZ = interfaceC1392640mLO2.LIZIZ();
                    if (activityLIZIZ instanceof C19EG) {
                        c19eg = (C19EG) activityLIZIZ;
                    }
                    if (c19eg != null) {
                        if (listLJJZZIII.size() == 1) {
                            str = "video_single_anchor";
                        } else {
                            str = "video_multi_anchor";
                        }
                        ProductListModel productListModelLJJIJL = C21272218Mm.LJJIJL(interfaceC1392640mLO2.LJJLIIIJJIZ(), interfaceC1392640mLO2, str, anchorPanelConfig, str);
                        anchorBizUtils.getClass();
                        AnchorBizUtils.LJJLJ(c19eg, productListModelLJJIJL, null, anchorPanelConfig, interfaceC1392640mLO2, null);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcVideoCampaignHelper@a398.autoPopup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
