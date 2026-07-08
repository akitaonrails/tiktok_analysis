package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h79, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191610h79 implements InterfaceC1192080h7u {
    public final Function0<InterfaceC1191710h7J> LIZ;
    public InterfaceC1191840h7W LIZIZ;

    @Override // X.InterfaceC1192080h7u
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZJ(PoiReviewsApi.PoiReviewModel poiReviewModel, List<? extends Object> list) {
    }

    @Override // X.InterfaceC1192080h7u
    public final void onResume(boolean z) {
    }

    public final PoiReviewsApi.PoiReviewModel LIZLLL() {
        InterfaceC1191840h7W interfaceC1191840h7W = this.LIZIZ;
        if (interfaceC1191840h7W != null) {
            return interfaceC1191840h7W.LJIL();
        }
        return null;
    }

    public final InterfaceC1191710h7J LJ() {
        return this.LIZ.invoke();
    }

    public C1191610h79(AwS562S0100000_18 awS562S0100000_18) {
        this.LIZ = awS562S0100000_18;
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZIZ(InterfaceC1191840h7W interfaceC1191840h7W) {
        this.LIZIZ = interfaceC1191840h7W;
    }

    public final void LJFF(Context context, String str, String str2, String str3) {
        String strLJJLIIIJJI;
        String logId;
        Integer source;
        String strZZ1;
        String strYy;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        String strO32;
        String verifiedDisplay;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        View view;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL2;
        Fragment fragmentLJIIJ;
        String poiId;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL3;
        View view2;
        PageFinder pageFinderVia;
        if (str2 != null && str2.length() != 0) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile");
            smartRouteBuildRoute.withParam("uid", str2);
            InterfaceC1191840h7W interfaceC1191840h7W = this.LIZIZ;
            PageFinder pageFinderVia2 = null;
            if (interfaceC1191840h7W != null && (abstractRefactorPoiReviewCellLLLLLLIL3 = interfaceC1191840h7W.LLLLLLIL()) != null && (view2 = abstractRefactorPoiReviewCellLLLLLLIL3.itemView) != null && (pageFinderVia = PageFinder.via(view2)) != null) {
                smartRouteBuildRoute.withParam("source_btm_token", C18JG.LIZ("c68202.d81238", pageFinderVia, null));
            }
            smartRouteBuildRoute.open();
            PoiReviewsApi.PoiReviewModel poiReviewModelLIZLLL = LIZLLL();
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            InterfaceC1191710h7J interfaceC1191710h7JLJ = LJ();
            if (interfaceC1191710h7JLJ != null) {
                strLJJLIIIJJI = interfaceC1191710h7JLJ.LJJLIIIJJI();
            } else {
                strLJJLIIIJJI = null;
            }
            InterfaceC1191710h7J interfaceC1191710h7JLJ2 = LJ();
            if (interfaceC1191710h7JLJ2 != null) {
                logId = interfaceC1191710h7JLJ2.getLogId();
            } else {
                logId = null;
            }
            if (poiReviewModelLIZLLL != null) {
                source = poiReviewModelLIZLLL.getSource();
            } else {
                source = null;
            }
            InterfaceC1191710h7J interfaceC1191710h7JLJ3 = LJ();
            if (interfaceC1191710h7JLJ3 != null) {
                strZZ1 = interfaceC1191710h7JLJ3.ZZ1();
            } else {
                strZZ1 = null;
            }
            String str4 = "";
            if (strZZ1 == null) {
                strZZ1 = "";
            }
            if (poiReviewModelLIZLLL != null && (poiId = poiReviewModelLIZLLL.getPoiId()) != null) {
                str4 = poiId;
            }
            InterfaceC1191710h7J interfaceC1191710h7JLJ4 = LJ();
            if (interfaceC1191710h7JLJ4 != null) {
                strYy = interfaceC1191710h7JLJ4.yy();
            } else {
                strYy = null;
            }
            InterfaceC1191840h7W interfaceC1191840h7W2 = this.LIZIZ;
            if (interfaceC1191840h7W2 != null && (abstractRefactorPoiReviewCellLLLLLLIL2 = interfaceC1191840h7W2.LLLLLLIL()) != null && (fragmentLJIIJ = C1189060h32.LJIIJ(abstractRefactorPoiReviewCellLLLLLLIL2)) != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            InterfaceC1191710h7J interfaceC1191710h7JLJ5 = LJ();
            if (interfaceC1191710h7JLJ5 != null) {
                strO32 = interfaceC1191710h7JLJ5.o32();
            } else {
                strO32 = null;
            }
            PoiReviewsApi.PoiReviewModel poiReviewModelLIZLLL2 = LIZLLL();
            if (poiReviewModelLIZLLL2 != null) {
                verifiedDisplay = poiReviewModelLIZLLL2.getVerifiedDisplay();
            } else {
                verifiedDisplay = null;
            }
            InterfaceC1191840h7W interfaceC1191840h7W3 = this.LIZIZ;
            if (interfaceC1191840h7W3 != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W3.LLLLLLIL()) != null && (view = abstractRefactorPoiReviewCellLLLLLLIL.itemView) != null) {
                pageFinderVia2 = PageFinder.via(view);
            }
            c1191160h6Q.getClass();
            C1191160h6Q.LJIIZILJ(strLJJLIIIJJI, str, str2, str3, logId, source, strZZ1, strYy, str4, strO32, interfaceC665370Q7zLJFF, verifiedDisplay, pageFinderVia2);
        }
    }

    public final void LJI(String str, final Context context, String str2, String str3, String str4, View view) {
        String strYy;
        String curUserId;
        String strP40;
        String strZZ1;
        String poiId;
        String verifiedDisplay;
        Object c098200Yq;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        Fragment fragmentLJIIJ;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL2;
        InterfaceC1184330gvP interfaceC1184330gvP;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        SparkContext sparkContext;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL3;
        Fragment fragmentLJIIJ2;
        String reviewId;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        if (context == null) {
            return;
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
        InterfaceC1191710h7J interfaceC1191710h7JLJ = LJ();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = null;
        if (interfaceC1191710h7JLJ == null || (strYy = interfaceC1191710h7JLJ.yy()) == null) {
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
        InterfaceC1191710h7J interfaceC1191710h7JLJ2 = LJ();
        if (interfaceC1191710h7JLJ2 == null || (strP40 = interfaceC1191710h7JLJ2.P40()) == null) {
            strP40 = "";
        }
        sparkContext2.LJJJZ("extra_info", strP40);
        InterfaceC1191710h7J interfaceC1191710h7JLJ3 = LJ();
        if (interfaceC1191710h7JLJ3 != null) {
            strZZ1 = interfaceC1191710h7JLJ3.ZZ1();
        } else {
            strZZ1 = null;
        }
        sparkContext2.LJJJZ("collect_info", String.valueOf(strZZ1));
        PoiReviewsApi.PoiReviewModel poiReviewModelLIZLLL = LIZLLL();
        if (poiReviewModelLIZLLL == null || (poiId = poiReviewModelLIZLLL.getPoiId()) == null) {
            poiId = "";
        }
        sparkContext2.LJJJZ("poi_id", poiId);
        PoiReviewsApi.PoiReviewModel poiReviewModelLIZLLL2 = LIZLLL();
        if (poiReviewModelLIZLLL2 != null && (reviewId = poiReviewModelLIZLLL2.getReviewId()) != null) {
            str8 = reviewId;
        }
        sparkContext2.LJJJZ("review_id", str8);
        PoiReviewsApi.PoiReviewModel poiReviewModelLIZLLL3 = LIZLLL();
        if (poiReviewModelLIZLLL3 != null) {
            verifiedDisplay = poiReviewModelLIZLLL3.getVerifiedDisplay();
        } else {
            verifiedDisplay = null;
        }
        if (C123100dR.LIZ(verifiedDisplay) && verifiedDisplay != null) {
            sparkContext2.LJJJZ("review_tags", verifiedDisplay);
        }
        try {
            InterfaceC1191840h7W interfaceC1191840h7W = this.LIZIZ;
            if (interfaceC1191840h7W != null && (abstractRefactorPoiReviewCellLLLLLLIL3 = interfaceC1191840h7W.LLLLLLIL()) != null && (fragmentLJIIJ2 = C1189060h32.LJIIJ(abstractRefactorPoiReviewCellLLLLLLIL3)) != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ2, null);
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
        try {
            InterfaceC1191840h7W interfaceC1191840h7W2 = this.LIZIZ;
            if (interfaceC1191840h7W2 != null && (abstractRefactorPoiReviewCellLLLLLLIL2 = interfaceC1191840h7W2.LLLLLLIL()) != null && (interfaceC1184330gvP = (InterfaceC1184330gvP) C1170350gYr.LIZJ(abstractRefactorPoiReviewCellLLLLLLIL2, C13LE.LIZ(InterfaceC1184330gvP.class))) != null) {
                c098200Yq = interfaceC1184330gvP.Nf();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        InterfaceC1191710h7J interfaceC1191710h7JLJ4 = LJ();
        if (interfaceC1191710h7JLJ4 != null) {
            InterfaceC1191840h7W interfaceC1191840h7W3 = this.LIZIZ;
            if (interfaceC1191840h7W3 != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W3.LLLLLLIL()) != null && (fragmentLJIIJ = C1189060h32.LJIIJ(abstractRefactorPoiReviewCellLLLLLLIL)) != null) {
                interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJIIJ, null);
            }
            JSONObject jSONObjectRE = interfaceC1191710h7JLJ4.rE(c1185410gx9, interfaceC665370Q7zLJFF2);
            if (jSONObjectRE != null) {
                sparkContext2.LJJJZ("poi_review_landing_params", C786410Ut5.J3(jSONObjectRE));
            }
        }
        sparkContext2.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0h7a
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
        sparkContext2.LJJJJZI(new C1209100hZM(view, 17));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext2).LIZIZ();
    }
}
