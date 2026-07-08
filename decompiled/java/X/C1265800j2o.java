package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiBoostData;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0j2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1265800j2o extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265800j2o(C1233330iCR c1233330iCR, int i) {
        super(700L);
        this.$t = i;
        this.l0 = c1233330iCR;
    }

    public static final void LIZ$0(C1265800j2o c1265800j2o, View view) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C1262140iwu) c1265800j2o.l0).getContext());
        if (c19egLIZIZ != null) {
            C1262140iwu c1262140iwu = (C1262140iwu) c1265800j2o.l0;
            IRecommendUsersService iRecommendUsersService = (IRecommendUsersService) ServiceManager.get().getService(IRecommendUsersService.class);
            String enterFrom = c1262140iwu.getEnterFrom();
            String str = "";
            if (enterFrom == null) {
                enterFrom = "";
            }
            String previousPage = c1262140iwu.getPreviousPage();
            if (previousPage != null) {
                str = previousPage;
            }
            iRecommendUsersService.LIZJ(c19egLIZIZ, enterFrom, str);
        }
    }

    public static final void LIZ$1(C1265800j2o c1265800j2o, View view) {
        String videoViewSchema;
        PromoteModel promoteModel;
        if (view != null) {
            Context context = ((C1233330iCR) c1265800j2o.l0).getContext();
            Aweme aweme = ((C1233330iCR) c1265800j2o.l0).LLJ;
            String eventType = null;
            if (aweme != null && (promoteModel = aweme.getPromoteModel()) != null) {
                videoViewSchema = promoteModel.getVideoViewSchema();
            } else {
                videoViewSchema = null;
            }
            SmartRouter.buildRoute(context, videoViewSchema).open();
            ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
            if (iCommercePromoteLogger != null) {
                C1233330iCR c1233330iCR = (C1233330iCR) c1265800j2o.l0;
                Aweme aweme2 = c1233330iCR.LLJ;
                C2189821An6 c2189821An6 = c1233330iCR.LLJI;
                if (c2189821An6 != null) {
                    eventType = c2189821An6.getEventType();
                }
                iCommercePromoteLogger.LJIIIZ(aweme2, "video", "myself", "video_view", eventType, null, null);
            }
        }
    }

    public static final void LIZ$2(C1265800j2o c1265800j2o, View view) {
        String str;
        String eventType;
        String eventType2;
        String aid;
        String authorUid;
        Integer numValueOf;
        PoiDataStruct poiDataStruct;
        PoiBoostData poiBoostData;
        if (view != null) {
            Context context = ((C1233330iCR) c1265800j2o.l0).getContext();
            Aweme aweme = ((C1233330iCR) c1265800j2o.l0).LLJ;
            String str2 = null;
            if (aweme != null && (poiBoostData = aweme.getPoiBoostData()) != null) {
                str = poiBoostData.schema;
            } else {
                str = null;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
            C2189821An6 c2189821An6 = ((C1233330iCR) c1265800j2o.l0).LLJI;
            if (c2189821An6 != null) {
                eventType = c2189821An6.getEventType();
            } else {
                eventType = null;
            }
            smartRouteBuildRoute.withParam("enter_from", eventType);
            smartRouteBuildRoute.withParam("enter_method", "bottom_bar");
            smartRouteBuildRoute.withParam("roma_enable_with_param", 1);
            smartRouteBuildRoute.open();
            C2189821An6 c2189821An62 = ((C1233330iCR) c1265800j2o.l0).LLJI;
            if (c2189821An62 != null) {
                eventType2 = c2189821An62.getEventType();
            } else {
                eventType2 = null;
            }
            Aweme aweme2 = ((C1233330iCR) c1265800j2o.l0).LLJ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", eventType2);
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            if (aweme2 != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme2);
            } else {
                authorUid = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            if (aweme2 != null) {
                numValueOf = Integer.valueOf(aweme2.getAwemeType());
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJIIIIZZ("aweme_type", String.valueOf(numValueOf));
            if (aweme2 != null && (poiDataStruct = aweme2.getPoiDataStruct()) != null) {
                str2 = poiDataStruct.poiId;
            }
            c2344009Gk.LJIIIIZZ("poi_id", str2);
            C1350920lG6.LJJJ(c2344009Gk, "ttls_author_video_incentive_detail_click");
        }
    }

    public static final void LIZ$3(C1265800j2o c1265800j2o, View view) {
        View viewTd;
        boolean z;
        boolean z2;
        C1265550j2P c1265550j2P = (C1265550j2P) c1265800j2o.l0;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c1265550j2P.getContext());
        if (c19egLIZIZ != null) {
            if (C295390Bhx.LIZJ()) {
                if (c1265550j2P.LLJ == null) {
                    c1265550j2P.LLJ = C786410Ut5.Td(C786410Ut5.ne(c1265550j2P.getContext()), R.layout.eje, null, false);
                }
                viewTd = c1265550j2P.LLJ;
            } else {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(c1265550j2P.getContext()), R.layout.eje, null, false);
            }
            if (viewTd != null) {
                C127K c127k = (C127K) viewTd.findViewById(R.id.uky);
                if (c127k != null) {
                    AnonymousClass1278 anonymousClass1278 = new AnonymousClass1278(viewTd.getContext());
                    if (c1265550j2P.LLILZLL == EnumC1155170gAN.DEFAULT.getValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    anonymousClass1278.LJIILJJIL(z2);
                    anonymousClass1278.LJIILLIIL(new C1265910j2z(c1265550j2P, 3));
                    c127k.setAccessory(anonymousClass1278);
                }
                C127K c127k2 = (C127K) viewTd.findViewById(R.id.ukz);
                if (c127k2 != null) {
                    AnonymousClass1278 anonymousClass12782 = new AnonymousClass1278(viewTd.getContext());
                    if (c1265550j2P.LLILZLL == EnumC1155170gAN.LATEST.getValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    anonymousClass12782.LJIILJJIL(z);
                    anonymousClass12782.LJIILLIIL(new C1265910j2z(c1265550j2P, 4));
                    c127k2.setAccessory(anonymousClass12782);
                }
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                C0OM1 c0om1 = new C0OM1();
                c0om1.LIZJ(0);
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = C1216270hkv.LIZJ(2131834828);
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZJ(new AwS563S0100000_19(c1265550j2P, 2790));
                c0om1.LIZIZ(c1251150ifB);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIL = c0om1;
                tuxSheet.LLJJJ = null;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, c1265550j2P.getContext());
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJI = numLIZJ;
                tuxSheet2.LLJJIII = viewTd;
                c1265550j2P.LLILZIL = tuxSheet2;
                tuxSheet2.show(c19egLIZIZ.getSupportFragmentManager(), "sort");
            } else {
                return;
            }
        }
        C20684815ws.LJIILLIIL("livesdk_following_sort_click", new HashMap());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265800j2o(Object obj, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = obj;
    }
}
