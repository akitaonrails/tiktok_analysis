package X;

import Y.ACListenerS84S0300000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h7B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1191630h7B implements InterfaceC1192080h7u {
    public final Function0<InterfaceC1191710h7J> LIZ;
    public C1191650h7D LIZIZ;
    public SmartImageView LIZJ;
    public InterfaceC1191840h7W LIZLLL;

    @Override // X.InterfaceC1192080h7u
    public final boolean LIZ() {
        return false;
    }

    public void LJIIJ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
    }

    @Override // X.InterfaceC1192080h7u
    public final void onResume(boolean z) {
    }

    public final View LJIIJJI() {
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        InterfaceC1191840h7W interfaceC1191840h7W = this.LIZLLL;
        if (interfaceC1191840h7W == null || (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W.LLLLLLIL()) == null) {
            return null;
        }
        return abstractRefactorPoiReviewCellLLLLLLIL.itemView;
    }

    public final InterfaceC1191710h7J LJIILIIL() {
        return this.LIZ.invoke();
    }

    public void LIZLLL() {
        C1191650h7D c1191650h7D;
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams;
        if (C297470BlJ.LIZ() && (c1191650h7D = this.LIZIZ) != null) {
            boolean zLIZ = C262280APq.LIZ();
            ViewGroup.LayoutParams layoutParams2 = c1191650h7D.LL.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            }
            if (zLIZ && (layoutParams = c1191650h7D.LLILLJJLI.getLayoutParams()) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            }
            c1191650h7D.LLILLL.setTuxFont(72);
            c1191650h7D.LLILLL.setTextColorRes(R.attr.a1j);
            C1189060h32.LJJII(c1191650h7D.LLILZ, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 0, 0, 0);
            SmartImageView smartImageView = c1191650h7D.LLIZ;
            ViewGroup.LayoutParams layoutParams3 = smartImageView.getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (c19me = (C19ME) layoutParams3) != null) {
                ((ViewGroup.MarginLayoutParams) c19me).width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                ((ViewGroup.MarginLayoutParams) c19me).height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c19me.topToTop = R.id.mm_;
                c19me.bottomToBottom = R.id.mm_;
                C786410Ut5.G6(smartImageView, c19me);
            }
            c1191650h7D.LLILZIL.setGuidelineBegin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
            c1191650h7D.LLILZLL.setTextSize(10.0f);
            C1189060h32.LJJII(c1191650h7D.LLIZLLLIL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0);
            C1189060h32.LJJII(c1191650h7D.LLJI, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0);
        }
    }

    public final PageFinder LJIIL() {
        View viewLJIIJJI = LJIIJJI();
        if (viewLJIIJJI != null) {
            return PageFinder.via(viewLJIIJJI);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1191630h7B(Function0<? extends InterfaceC1191710h7J> function0) {
        this.LIZ = function0;
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZIZ(InterfaceC1191840h7W interfaceC1191840h7W) {
        this.LIZLLL = interfaceC1191840h7W;
        View view = interfaceC1191840h7W.LLLLLLIL().itemView;
        this.LIZIZ = (C1191650h7D) view.findViewById(R.id.ji7);
        this.LIZJ = (SmartImageView) view.findViewById(R.id.bpv);
        LIZLLL();
    }

    public void LJ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        C1191650h7D c1191650h7D = this.LIZIZ;
        if (c1191650h7D == null) {
            return;
        }
        if (C1190820h5s.LJFF(poiReviewModel) && !C1190820h5s.LJII(poiReviewModel) && !Intrinsics.LJFF(poiReviewModel.isLocalAdded(), Boolean.TRUE)) {
            if (C262280APq.LIZ()) {
                c1191650h7D.h0(false, null);
            }
            c1191650h7D.setOnNameClick(null);
        } else {
            c1191650h7D.h0(false, new ACListenerS84S0300000_18(this, poiReviewModel, c1191650h7D, 9));
            C427690Gpr.LJI(c1191650h7D.LLILLL, null);
            c1191650h7D.setOnNameClick(new ACListenerS84S0300000_18(this, poiReviewModel, c1191650h7D, 10));
            C339190DRl.LIZIZ(c1191650h7D.LLJIJIL);
            C339190DRl.LIZIZ(c1191650h7D.LLJILJIL);
        }
    }

    public void LJFF(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        PoiReviewsApi.PoiUserReviewModel poiUserReviewModel;
        UrlModel urlModel;
        boolean z;
        String strLJJLIIIJJI;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        Fragment fragmentLJIIJ;
        Context context;
        SmartImageView smartImageView = this.LIZJ;
        if (smartImageView == null) {
            return;
        }
        C786410Ut5.LLFF(8, smartImageView);
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
        if (author != null && (poiUserReviewModel = author.userReviewProfileFrame) != null && (urlModel = poiUserReviewModel.badgeUrl) != null) {
            View viewLJIIJJI = LJIIJJI();
            if (viewLJIIJJI != null && (context = viewLJIIJJI.getContext()) != null && C426750GoL.LIZLLL(context)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C786410Ut5.Tc(smartImageView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            } else {
                C786410Ut5.Tc(smartImageView, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            }
            C786410Ut5.td(smartImageView, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            C786410Ut5.LLFF(0, smartImageView);
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL = LJIILIIL();
            if (interfaceC1191710h7JLJIILIIL != null && interfaceC1191710h7JLJIILIIL.yu1(poiReviewModel.getReviewId())) {
                return;
            }
            InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL2 = LJIILIIL();
            if (interfaceC1191710h7JLJIILIIL2 != null) {
                interfaceC1191710h7JLJIILIIL2.iU1(poiReviewModel.getReviewId());
            }
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL3 = LJIILIIL();
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
            if (interfaceC1191710h7JLJIILIIL3 != null) {
                strLJJLIIIJJI = interfaceC1191710h7JLJIILIIL3.LJJLIIIJJI();
            } else {
                strLJJLIIIJJI = null;
            }
            String poiId = poiReviewModel.getPoiId();
            String reviewId = poiReviewModel.getReviewId();
            String str = poiReviewModel.getAuthor().userId;
            Integer num = poiReviewModel.getAuthor().userReviewProfileFrame.badgeLevel;
            InterfaceC1191840h7W interfaceC1191840h7W = this.LIZLLL;
            if (interfaceC1191840h7W != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W.LLLLLLIL()) != null && (fragmentLJIIJ = C1189060h32.LJIIJ(abstractRefactorPoiReviewCellLLLLLLIL)) != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            }
            PageFinder pageFinderLJIIL = LJIIL();
            c1191160h6Q.getClass();
            C1191160h6Q.LJJIJ(pageFinderLJIIL, interfaceC665370Q7zLJFF, num, strLJJLIIIJJI, poiId, reviewId, str);
        }
    }

    public void LJIIIIZZ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        C1191650h7D c1191650h7D = this.LIZIZ;
        if (c1191650h7D == null) {
            return;
        }
        c1191650h7D.setOnLevelClick(new ACListenerS84S0300000_18(this, poiReviewModel, c1191650h7D, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    @Override // X.InterfaceC1192080h7u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.PoiReviewModel r7, java.util.List<? extends java.lang.Object> r8) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1191630h7B.LIZJ(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi$PoiReviewModel, java.util.List):void");
    }

    public void LJII(C1191650h7D c1191650h7D, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        PoiReviewsApi.PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel;
        Integer num;
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
        if (author != null && (poiReviewUserLevelInfoModel = author.userLevelInfo) != null && (num = poiReviewUserLevelInfoModel.level) != null) {
            int iIntValue = num.intValue();
            if (iIntValue <= 0) {
                c1191650h7D.setLevel(null);
            } else {
                c1191650h7D.setLevel(new C1191770h7P(iIntValue, poiReviewModel.getAuthor().userLevelInfo.smallLevelIcon, poiReviewModel.getAuthor().userLevelInfo.levelIcon));
                LJIIIIZZ(poiReviewModel);
            }
        }
    }

    public void LJIIIZ(C1191650h7D c1191650h7D, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        float fLIZLLL;
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
        if (content != null) {
            fLIZLLL = C1190820h5s.LIZLLL(content);
        } else {
            fLIZLLL = 0.0f;
        }
        c1191650h7D.setRating(new C1890207am(fLIZLLL));
    }

    public void LJI(C1191650h7D c1191650h7D, PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        UrlModel urlModelLIZ;
        int i;
        Context context;
        UrlStruct urlStructLIZ;
        if (z && C1190820h5s.LJIIJJI(poiReviewModel)) {
            View viewLJIIJJI = LJIIJJI();
            if (viewLJIIJJI != null && (context = viewLJIIJJI.getContext()) != null && (urlStructLIZ = C1190820h5s.LIZ(poiReviewModel, context)) != null) {
                urlModelLIZ = C904300Zdk.LIZ(urlStructLIZ);
            } else {
                urlModelLIZ = null;
            }
            String brandName = poiReviewModel.getBrandName();
            boolean zLIZ = C297470BlJ.LIZ();
            if (urlModelLIZ == null) {
                C339190DRl.LIZIZ(c1191650h7D.LLJIJIL);
                C339190DRl.LIZIZ(c1191650h7D.LLJILJIL);
                return;
            }
            C339190DRl.LIZLLL(c1191650h7D.LLJIJIL);
            C339190DRl.LIZLLL(c1191650h7D.LLJILJIL);
            C1189590h3t c1189590h3t = c1191650h7D.LLJILJIL;
            if (zLIZ) {
                i = 71;
            } else {
                i = 61;
            }
            c1189590h3t.LIZ(i);
            c1191650h7D.LLJILJIL.LIZIZ(urlModelLIZ, brandName);
            return;
        }
        C339190DRl.LIZIZ(c1191650h7D.LLJIJIL);
        C339190DRl.LIZIZ(c1191650h7D.LLJILJIL);
    }

    public final void LJIILJJIL(String str, String str2, Context context, String str3, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String strLJJLIIIJJI;
        String logId;
        String strZZ1;
        String strYy;
        String strO32;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        PoiReviewsApi.PoiReviewModel poiReviewModelLJIL;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        Fragment fragmentLJIIJ;
        if (str2 != null && str2.length() != 0) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile");
            smartRouteBuildRoute.withParam("uid", str2);
            PageFinder pageFinderLJIIL = LJIIL();
            String verifiedDisplay = null;
            if (pageFinderLJIIL != null) {
                smartRouteBuildRoute.withParam("source_btm_token", C18JG.LIZ("c68202.d81238", pageFinderLJIIL, null));
            }
            smartRouteBuildRoute.open();
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL = LJIILIIL();
            if (interfaceC1191710h7JLJIILIIL != null) {
                strLJJLIIIJJI = interfaceC1191710h7JLJIILIIL.LJJLIIIJJI();
            } else {
                strLJJLIIIJJI = null;
            }
            InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL2 = LJIILIIL();
            if (interfaceC1191710h7JLJIILIIL2 != null) {
                logId = interfaceC1191710h7JLJIILIIL2.getLogId();
            } else {
                logId = null;
            }
            Integer source = poiReviewModel.getSource();
            InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL3 = LJIILIIL();
            if (interfaceC1191710h7JLJIILIIL3 != null) {
                strZZ1 = interfaceC1191710h7JLJIILIIL3.ZZ1();
            } else {
                strZZ1 = null;
            }
            if (strZZ1 == null) {
                strZZ1 = "";
            }
            String poiId = poiReviewModel.getPoiId();
            if (poiId == null) {
                poiId = "";
            }
            InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL4 = LJIILIIL();
            if (interfaceC1191710h7JLJIILIIL4 != null) {
                strYy = interfaceC1191710h7JLJIILIIL4.yy();
            } else {
                strYy = null;
            }
            InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL5 = LJIILIIL();
            if (interfaceC1191710h7JLJIILIIL5 != null) {
                strO32 = interfaceC1191710h7JLJIILIIL5.o32();
            } else {
                strO32 = null;
            }
            InterfaceC1191840h7W interfaceC1191840h7W = this.LIZLLL;
            if (interfaceC1191840h7W != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W.LLLLLLIL()) != null && (fragmentLJIIJ = C1189060h32.LJIIJ(abstractRefactorPoiReviewCellLLLLLLIL)) != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            InterfaceC1191840h7W interfaceC1191840h7W2 = this.LIZLLL;
            if (interfaceC1191840h7W2 != null && (poiReviewModelLJIL = interfaceC1191840h7W2.LJIL()) != null) {
                verifiedDisplay = poiReviewModelLJIL.getVerifiedDisplay();
            }
            PageFinder pageFinderLJIIL2 = LJIIL();
            c1191160h6Q.getClass();
            C1191160h6Q.LJIIZILJ(strLJJLIIIJJI, str, str2, str3, logId, source, strZZ1, strYy, poiId, strO32, interfaceC665370Q7zLJFF, verifiedDisplay, pageFinderLJIIL2);
        }
    }

    public final void LJIILL(String str, final Context context, String str2, String str3, String str4, View view) {
        PoiReviewsApi.PoiReviewModel poiReviewModelLJIL;
        String strYy;
        String curUserId;
        String strP40;
        String strZZ1;
        String poiId;
        String verifiedDisplay;
        JSONObject jSONObjectRE;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        SparkContext sparkContext;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        Fragment fragmentLJIIJ;
        String reviewId;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        InterfaceC1191840h7W interfaceC1191840h7W = this.LIZLLL;
        if (interfaceC1191840h7W != null) {
            poiReviewModelLJIL = interfaceC1191840h7W.LJIL();
        } else {
            poiReviewModelLJIL = null;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        String strLIZIZ = TiktokPoiLynxSettings.LIZIZ("poi_review_center");
        String str8 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        sparkContext2.LJJLIIJ(strLIZIZ);
        sparkContext2.LJJJZ("enter_method", str);
        if (str7 == null) {
            str7 = "";
        }
        sparkContext2.LJJJZ("enter_from", str7);
        if (str6 == null) {
            str6 = "";
        }
        sparkContext2.LJJJZ("poi_id", str6);
        InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL = LJIILIIL();
        if (interfaceC1191710h7JLJIILIIL == null || (strYy = interfaceC1191710h7JLJIILIIL.yy()) == null) {
            strYy = "";
        }
        sparkContext2.LJJJZ("from_group_id", strYy);
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService != null) {
            curUserId = iAccountUserService.getCurUserId();
        } else {
            curUserId = null;
        }
        if (!Intrinsics.LJFF(curUserId, str5)) {
            if (str5 == null) {
                str5 = "";
            }
            sparkContext2.LJJJZ("to_user_id", str5);
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL2 = LJIILIIL();
        if (interfaceC1191710h7JLJIILIIL2 == null || (strP40 = interfaceC1191710h7JLJIILIIL2.P40()) == null) {
            strP40 = "";
        }
        sparkContext2.LJJJZ("extra_info", strP40);
        InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL3 = LJIILIIL();
        if (interfaceC1191710h7JLJIILIIL3 != null) {
            strZZ1 = interfaceC1191710h7JLJIILIIL3.ZZ1();
        } else {
            strZZ1 = null;
        }
        sparkContext2.LJJJZ("collect_info", String.valueOf(strZZ1));
        if (poiReviewModelLJIL == null || (poiId = poiReviewModelLJIL.getPoiId()) == null) {
            poiId = "";
        }
        sparkContext2.LJJJZ("poi_id", poiId);
        if (poiReviewModelLJIL != null && (reviewId = poiReviewModelLJIL.getReviewId()) != null) {
            str8 = reviewId;
        }
        sparkContext2.LJJJZ("review_id", str8);
        if (poiReviewModelLJIL != null) {
            verifiedDisplay = poiReviewModelLJIL.getVerifiedDisplay();
        } else {
            verifiedDisplay = null;
        }
        if (C123100dR.LIZ(verifiedDisplay) && verifiedDisplay != null) {
            sparkContext2.LJJJZ("review_tags", verifiedDisplay);
        }
        try {
            InterfaceC1191840h7W interfaceC1191840h7W2 = this.LIZLLL;
            if (interfaceC1191840h7W2 != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W2.LLLLLLIL()) != null && (fragmentLJIIJ = C1189060h32.LJIIJ(abstractRefactorPoiReviewCellLLLLLLIL)) != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            Map mapLJII = C1182380gsG.LJII(interfaceC665370Q7zLJFF);
            if (!mapLJII.isEmpty()) {
                sparkContext2.LJJJZ("poi_general_track_params", C2365509Or.LJ(mapLJII));
                sparkContext = sparkContext2;
            } else {
                sparkContext = null;
            }
            C189200o6.m2constructorimpl(sparkContext);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL4 = LJIILIIL();
        if (interfaceC1191710h7JLJIILIIL4 != null && (jSONObjectRE = interfaceC1191710h7JLJIILIIL4.rE(null, null)) != null) {
            sparkContext2.LJJJZ("poi_review_landing_params", C786410Ut5.J3(jSONObjectRE));
        }
        sparkContext2.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0h7Z
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJJJI() {
                return !C444960Hcc.LIZJ(context) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJLI() {
                return !C444960Hcc.LIZJ(context) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
            }
        });
        sparkContext2.LJJJJZI(new C1209100hZM(view, 16));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext2).LIZIZ();
    }
}
