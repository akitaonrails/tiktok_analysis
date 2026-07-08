package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.comment.CommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18M5, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18M5 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ AwemePruningModel LLILLJJLI;
    public final /* synthetic */ AnchorProductInfoModel LLILLL;
    public final /* synthetic */ List<AnchorProductInfoModel> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, Object> LLIZ;
    public final /* synthetic */ List<SkuItem> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18M5(Aweme aweme, AwemePruningModel awemePruningModel, AnchorProductInfoModel anchorProductInfoModel, List<AnchorProductInfoModel> list, boolean z, String str, Map<String, Object> map, List<SkuItem> list2) {
        super(1);
        this.LL = aweme;
        this.LLILLJJLI = awemePruningModel;
        this.LLILLL = anchorProductInfoModel;
        this.LLILZ = list;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = map;
        this.LLIZLLLIL = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        IECommerceHostService iECommerceHostService;
        int iIntValue;
        String str;
        IECommerceHostService iECommerceHostService2;
        boolean z;
        boolean z2;
        String name;
        C957403oi c957403oi2 = c957403oi;
        C21272518Mp c21272518Mp = C21272518Mp.LIZ;
        String aid = this.LL.getAid();
        c21272518Mp.getClass();
        Map<String, ? extends Object> mapLJIIIZ = C21272518Mp.LJIIIZ(aid);
        if (mapLJIIIZ != null) {
            c957403oi2.LJ(mapLJIIIZ);
        }
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi2.LIZLLL("is_from_comment", "1");
        String str2 = this.LLILLJJLI.aid;
        if (str2 == null) {
            str2 = "";
        }
        c957403oi2.LIZLLL("group_id", str2);
        String str3 = this.LLILLJJLI.authorUid;
        if (str3 == null) {
            str3 = "";
        }
        c957403oi2.LIZLLL("author_id", str3);
        String str4 = this.LLILLJJLI.requestId;
        if (str4 == null) {
            str4 = "";
        }
        c957403oi2.LIZLLL("request_id", str4);
        String str5 = this.LLILLJJLI.eventType;
        if (str5 == null) {
            str5 = "";
        }
        c957403oi2.LIZLLL("enter_from", str5);
        c957403oi2.LIZLLL("anchor_show_type", "video_cart_tag");
        c957403oi2.LIZLLL("product_source", String.valueOf(this.LLILLL.extraData.platform));
        String str6 = this.LLILLL.extraData.source;
        if (str6 == null) {
            str6 = "";
        }
        c957403oi2.LIZLLL("source", str6);
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        List<AnchorProductInfoModel> list = this.LLILZ;
        anchorBizUtils.getClass();
        c957403oi2.LIZLLL("product_id", AnchorBizUtils.LJIL(list));
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILLL;
        c21272018Mk.getClass();
        c957403oi2.LIZLLL("biz_type", C21272018Mk.LJIIJJI(anchorProductInfoModel));
        c957403oi2.LIZLLL("anchor_type_cnt", Integer.valueOf(C21272018Mk.LJIIIIZZ(this.LL)));
        String str7 = this.LLILLJJLI.authorUid;
        String name2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IAccountDependencyService.class.getName();
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
            iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        c957403oi2.LIZLLL("is_self", Integer.valueOf(Intrinsics.LJFF(str7, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0));
        c957403oi2.LIZLLL("is_single_anchor", "no");
        if (this.LLILLJJLI.isAd() != null) {
            c957403oi2.LIZLLL("is_ad", Integer.valueOf(AnchorBizUtils.LJJJJZI(this.LLILLJJLI) ? 1 : 0));
            AwemeRawAd awemeRawAd = this.LLILLJJLI.awemeRawAd;
            if (awemeRawAd != null) {
                Object adId = awemeRawAd.getAdId();
                if (adId == null) {
                    adId = "";
                }
                c957403oi2.LIZLLL("ad_id", adId);
                Object creativeId = awemeRawAd.getCreativeId();
                if (creativeId == null) {
                    creativeId = "";
                }
                c957403oi2.LIZLLL("creative_id", creativeId);
            }
        }
        Integer numLJIIZILJ = C21272218Mm.LJIIZILJ(this.LLILLJJLI);
        if (numLJIIZILJ != null) {
            iIntValue = numLJIIZILJ.intValue();
        } else {
            iIntValue = 0;
        }
        c957403oi2.LIZLLL("follow_status", Integer.valueOf(iIntValue));
        Integer num = this.LLILLL.extraData.productStatus;
        if (num != null && num.intValue() == 70) {
            c957403oi2.LIZLLL("shopping_status", "product_not_available");
        } else {
            c957403oi2.LIZLLL("shopping_status", "product_available");
        }
        c957403oi2.LIZLLL("is_mix_product", C21272218Mm.LJIJ(this.LLILLL.extra));
        c957403oi2.LIZLLL("source_page_type", "video");
        c957403oi2.LIZLLL("page_name", "video");
        if (this.LLILZIL) {
            str = "video_comment_single_anchor";
        } else {
            str = "video_comment_multi_anchor";
        }
        c957403oi2.LIZLLL("entrance_form", str);
        AwemePruningModel awemePruningModel = this.LLILLJJLI;
        c957403oi2.LJ(C21272218Mm.LJIILJJIL(awemePruningModel, awemePruningModel.eventType, awemePruningModel.mMobParams));
        if (this.LLILZIL) {
            String str8 = this.LLILZLL;
            if (str8 != null) {
                c957403oi2.LIZLLL("track_id", str8);
            }
            c957403oi2.LIZLLL("is_single_anchor", "yes");
        }
        c957403oi2.LIZLLL("pure_ecommerce", Integer.valueOf(AnchorBizUtils.LJJL(this.LL) ? 1 : 0));
        Map mapLJIIIZ2 = C21272518Mp.LJIIIZ(this.LL.getAid());
        if (mapLJIIIZ2 != null) {
            Object obj = mapLJIIIZ2.get("volume");
            if (obj != null) {
                c957403oi2.LIZLLL("volume", obj.toString());
            }
            Object obj2 = mapLJIIIZ2.get("volume_type");
            if (obj2 != null) {
                c957403oi2.LIZLLL("volume_type", obj2.toString());
            }
            Object obj3 = mapLJIIIZ2.get("inherited_volume");
            if (obj3 != null) {
                c957403oi2.LIZLLL("inherited_volume", obj3.toString());
            }
        }
        HashMap<String, String> map = this.LLILLJJLI.mMobParams;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    c957403oi2.LIZLLL(key, value);
                }
            }
        }
        Map<String, ? extends Object> map2 = this.LLIZ;
        if (map2 != null) {
            c957403oi2.LJ(map2);
        }
        AnchorProductInfoModel anchorProductInfoModel2 = this.LLILLL;
        if (anchorProductInfoModel2 != null) {
            C21272018Mk c21272018Mk2 = C21272018Mk.LIZ;
            List<SkuItem> list2 = this.LLIZLLLIL;
            c21272018Mk2.getClass();
            c957403oi2.LJ(C21272018Mk.LJIJI(anchorProductInfoModel2, list2));
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            ICommentDependencyService iCommentDependencyServiceCreateICommentDependencyServicebyMonsterPlugin = CommentDependencyService.createICommentDependencyServicebyMonsterPlugin(false);
            if (iCommentDependencyServiceCreateICommentDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = ICommentDependencyService.class.getName();
            if (iCommentDependencyServiceCreateICommentDependencyServicebyMonsterPlugin != null) {
                name2 = iCommentDependencyServiceCreateICommentDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
            iECommerceHostService2 = iCommentDependencyServiceCreateICommentDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommentDependencyService.class);
        }
        Map<String, String> contentRecReasonParams = ((ICommentDependencyService) iECommerceHostService2).getContentRecReasonParams(this.LL, this.LLILLJJLI.eventType);
        if (contentRecReasonParams != null) {
            c957403oi2.LJ(contentRecReasonParams);
        }
        C21272018Mk c21272018Mk3 = C21272018Mk.LIZ;
        List<AnchorProductInfoModel> list3 = this.LLILZ;
        c21272018Mk3.getClass();
        c957403oi2.LJ(C21272018Mk.LJFF(list3));
        return Unit.LIZ;
    }
}
