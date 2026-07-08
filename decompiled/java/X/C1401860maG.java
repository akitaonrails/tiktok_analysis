package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0maG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401860maG extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C1401860maG c1401860maG, View view) {
        String aid;
        if (view != null) {
            C1340720kze c1340720kze = (C1340720kze) c1401860maG.l0;
            if (!c1340720kze.LLILZ.invoke(view, c1340720kze.LL).booleanValue()) {
                C1340720kze c1340720kze2 = (C1340720kze) c1401860maG.l0;
                String string = c1340720kze2.LL.schema;
                if (string != null) {
                    if (string.length() != 0) {
                        Uri.Builder builderBuildUpon = UriProtector.parse(string).buildUpon();
                        builderBuildUpon.appendQueryParameter("source", "comment_activity");
                        builderBuildUpon.appendQueryParameter("current_page", c1340720kze2.LLILLL);
                        Aweme aweme = c1340720kze2.LLILLJJLI;
                        if (aweme != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        builderBuildUpon.appendQueryParameter("last_group_id", aid);
                        string = builderBuildUpon.build().toString();
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((TuxTextView) c1401860maG.l1).getRootView().getContext(), string);
                    smartRouteBuildRoute.withParam("enter_from", ((C1340720kze) c1401860maG.l0).LLILLL);
                    smartRouteBuildRoute.withParam("refer", ((C1340720kze) c1401860maG.l0).LLILLL);
                    smartRouteBuildRoute.open();
                }
                C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                EnumC1342350l2H enumC1342350l2H = EnumC1342350l2H.CLICK;
                Long lValueOf = Long.valueOf(((C1340720kze) c1401860maG.l0).LL.id);
                C1340720kze c1340720kze3 = (C1340720kze) c1401860maG.l0;
                Aweme aweme2 = c1340720kze3.LLILLJJLI;
                String str = c1340720kze3.LLILLL;
                c1350920lG6.getClass();
                C1350920lG6.LJLI(enumC1342350l2H, lValueOf, aweme2, str);
            }
        }
    }

    public static final void LIZ$1(C1401860maG c1401860maG, View view) {
        boolean z;
        C1393950mNV c1393950mNV = (C1393950mNV) c1401860maG.l0;
        NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) c1401860maG.l1;
        c1393950mNV.getClass();
        if (!a0.LJJIIZI(newFaceStickerBean.extra, "coveruri", false) && !a0.LJJIIZI(newFaceStickerBean.extra, "coverthumburi", false) && newFaceStickerBean.effectSource != 103) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C1393950mNV) c1401860maG.l0).itemView.getContext(), "//aime/style/detail");
            smartRouteBuildRoute.withParam("ids", ((NewFaceStickerBean) c1401860maG.l1).effectId);
            smartRouteBuildRoute.withParam("enter_from", "personal_homepage");
            smartRouteBuildRoute.open();
        } else {
            Context context = ((C1393950mNV) c1401860maG.l0).itemView.getContext();
            NewFaceStickerBean newFaceStickerBean2 = (NewFaceStickerBean) c1401860maG.l1;
            String str = newFaceStickerBean2.id;
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (!TextUtils.isEmpty("")) {
                c2344009Gk.LJFF("tab_name", "");
            }
            c2344009Gk.LJIIIIZZ("enter_from", "collection_prop");
            c2344009Gk.LJIIIIZZ("content", "prop");
            c2344009Gk.LJIIIIZZ("prop_id", str);
            C20684815ws.LJIILLIIL("click_personal_collection", c2344009Gk.LIZ);
            LogPbBean logPbBean = newFaceStickerBean2.logPbBean;
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            if (!TextUtils.isEmpty("")) {
                c2344009Gk2.LJFF("tab_name", "");
            }
            c2344009Gk2.LJIIIIZZ("enter_from", "collection_prop");
            c2344009Gk2.LJIIIIZZ("enter_method", "click_collection_prop");
            c2344009Gk2.LJIIIIZZ("prop_id", str);
            c2344009Gk2.LJ(logPbBean, "log_pb");
            C20684815ws.LJIILLIIL("enter_prop_detail", c2344009Gk2.LIZ);
            SmartRoute smartRouteLIZ = C1394200mNu.LIZ.LIZ(context, str, "collection_prop");
            smartRouteLIZ.withParam("extra_stickers", C19881612qc.LIZIZ(newFaceStickerBean2.id));
            smartRouteLIZ.withParam("is_favourite_prop", 1);
            smartRouteLIZ.open();
        }
        C1458960o4M.LIZ = true;
    }

    public static final void LIZ$2(C1401860maG c1401860maG, View view) {
        List<String> listLIZIZ;
        boolean zLJI = MethodIDManager.LJI(202347);
        Context context = view.getContext();
        if (context != null && ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(context)) {
            C786410Ut5.re(Toast.makeText(context, context.getString(2131832497), 0));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        FaceStickerBean.sCurPropSource = "collection_prop";
        C1393930mNT c1393930mNT = new C1393930mNT();
        c1393930mNT.LIZIZ = "collection_prop";
        c1393930mNT.LIZLLL = "prop_music_recommended";
        c1393930mNT.LJ = "personal_homepage";
        c1393930mNT.LJIL = 1;
        final C1393950mNV c1393950mNV = (C1393950mNV) c1401860maG.l1;
        c1393930mNT.LJIILIIL = new InterfaceC19340210lU() { // from class: X.0mOq
            @Override // X.InterfaceC19340210lU
            public final void LIZ(Effect effect, String str) {
                String strLJJLIIIJ;
                List<String> v2Tags;
                C1458960o4M.LIZ = true;
                C1458960o4M.LIZJ(true);
                IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
                C1449410nox c1449410nox = new C1449410nox(str, "collection_prop", "personal_homepage", null, null, null, null, null, 248);
                C1393950mNV c1393950mNV2 = c1393950mNV;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("prop_id", effect.getEffectId());
                c2344009Gk.LIZJ(1, "is_favourite_prop");
                c2344009Gk.LJIIIIZZ("enter_method", "click_collection_prop");
                c2344009Gk.LIZJ(C1458960o4M.LIZ(), "favorite_scene");
                c1393950mNV2.getClass();
                c2344009Gk.LJFF("prop_resource_id", effect.getResourceId());
                C1448620nng.LIZ(new C1394790mOr(c2344009Gk));
                EffectLabel effectLabel = effect.getEffectLabel();
                if (effectLabel != null && (v2Tags = effectLabel.getV2Tags()) != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(v2Tags, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = null;
                }
                c2344009Gk.LJFF("prop_category", strLJJLIIIJ);
                c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
                iRecordMobService.LIZLLL(c1449410nox, c2344009Gk.LIZ);
            }
        };
        C116L c116lLIZ = c1393930mNT.LIZ();
        List<String> list = ((NewFaceStickerBean) c1401860maG.l0).children;
        if (list != null && !list.isEmpty()) {
            listLIZIZ = ((NewFaceStickerBean) c1401860maG.l0).children;
        } else {
            listLIZIZ = C19881612qc.LIZIZ(((NewFaceStickerBean) c1401860maG.l0).id);
        }
        ((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LJFF(((C1393950mNV) c1401860maG.l1).LLILZLL.getContext(), listLIZIZ, c116lLIZ, ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
        String str = ((NewFaceStickerBean) c1401860maG.l0).id;
        String strLIZJ = C1206450hV5.LIZJ(2);
        C2344009Gk c2344009GkLIZIZ = C1206450hV5.LIZIZ("prop", "collection_prop");
        c2344009GkLIZIZ.LJIIIIZZ("prop_id", str);
        C20684815ws.LJIILLIIL(strLIZJ, c2344009GkLIZIZ.LIZ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZ$3(C1401860maG c1401860maG, View view) {
        if (view != null) {
            ((C1399210mVz) c1401860maG.l0).LJJJLL(view, (C2344009Gk) c1401860maG.l1);
        }
    }

    public static final void LIZ$4(C1401860maG c1401860maG, View view) {
        if (view != null) {
            ((C1397440mT8) c1401860maG.l0).LJJJLL(view, (C2344009Gk) c1401860maG.l1);
        }
    }

    public static final void LIZ$5(C1401860maG c1401860maG, View view) {
        AnchorProductInfo anchorProductInfo;
        String str;
        if (view != null && (anchorProductInfo = (AnchorProductInfo) c1401860maG.l0) != null && (str = anchorProductInfo.unavailableSchema) != null && str.length() > 0) {
            SmartRouter.buildRoute(((DialogC1393760mNC) c1401860maG.l1).getContext(), str).open();
            ((DialogC1393760mNC) c1401860maG.l1).LJLI("tiktokec_module_click");
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C1401860maG(X.C1393950mNV r2, com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 1 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1401860maG.<init>(X.0mNV, com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401860maG(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
