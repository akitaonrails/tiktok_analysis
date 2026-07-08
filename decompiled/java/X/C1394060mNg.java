package X;

import Y.ACListenerS124S0200000_21;
import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0mNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394060mNg extends AbstractC1066890drz {
    public AnchorPanelAction LLJ;

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.AbstractC1066910ds1
    public final boolean LJIIL() {
        return !C2514809tK.LIZ;
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1394090mNj c1394090mNj = C1394090mNj.LIZ;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        c1394090mNj.getClass();
        C1394090mNj.LIZ(c2344009Gk, anchorCommonStruct);
        return new C1400390mXt(new AwS565S0100000_21(c2344009Gk, 1261), new AwS565S0100000_21(c2344009Gk, 1262), new AwS565S0100000_21(c2344009Gk, 1263), null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1394060mNg();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.AI_SELF_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final String LIZLLL() {
        return LJJIJIIJI();
    }

    public final String LJJIJIIJI() {
        String keyword;
        if (!C1067940dtg.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AI Self | ");
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            keyword = anchorCommonStruct != null ? anchorCommonStruct.getKeyword() : null;
            sbLIZ.append(keyword != null ? keyword : "");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        try {
            String string = C1BWL.LIZJ().getString(2131826567);
            Object[] objArr = new Object[1];
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            String keyword2 = anchorCommonStruct2 != null ? anchorCommonStruct2.getKeyword() : null;
            if (keyword2 == null) {
                keyword2 = "";
            }
            objArr[0] = keyword2;
            return C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AI Self · ");
            AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
            keyword = anchorCommonStruct3 != null ? anchorCommonStruct3.getKeyword() : null;
            sbLIZ2.append(keyword != null ? keyword : "");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            C1394090mNj c1394090mNj = C1394090mNj.LIZ;
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            c1394090mNj.getClass();
            C1394090mNj.LIZ(c2344009Gk, anchorCommonStruct);
            LJJIIJ(c2344009Gk);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJJJI(SmartImageView smartImageView) {
        int i;
        if (C1067400dso.LIZ()) {
            super.LJJJI(smartImageView);
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        C01GW c01gw = C277010AtP.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 2) {
            i = R.raw.icon_anchor_effect;
        } else if (((Number) c01gw.getValue()).intValue() == 1) {
            i = R.raw.icon_anchor_ai_self_yellow;
        } else {
            i = R.raw.icon_anchor_ai_self;
        }
        c419910GdJ.LIZ = i;
        smartImageView.setImageDrawable(c419910GdJ.LIZ(smartImageView.getContext()));
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.isFeatureEnabled()) {
            IAIPortraitFeatureService.LIZ.getClass();
            IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
            if (iAIPortraitFeatureServiceLIZ == null || !iAIPortraitFeatureServiceLIZ.isFeatureEnabled()) {
                AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) C13LP.LJJJLL(arrayList);
                AnchorPanelAction anchorPanelAction = null;
                if (anchorCommonStruct2 != null) {
                    LJIILIIL(anchorCommonStruct2);
                    list.remove(anchorCommonStruct2);
                    List<AnchorPanelAction> actions = anchorCommonStruct2.getActions();
                    if (actions != null) {
                        Iterator<AnchorPanelAction> it2 = actions.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            AnchorPanelAction next = it2.next();
                            if (next.getActionType() == 1) {
                                anchorPanelAction = next;
                                break;
                            }
                        }
                        anchorPanelAction = anchorPanelAction;
                    }
                    this.LLJ = anchorPanelAction;
                } else {
                    anchorCommonStruct2 = null;
                }
                this.LLIZ = anchorCommonStruct2;
                return EnumC1050190dR3.DONE;
            }
        }
        C19719612Di.LJJIIZI(list);
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            C1394090mNj c1394090mNj = C1394090mNj.LIZ;
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            c1394090mNj.getClass();
            C1394090mNj.LIZ(c2344009Gk, anchorCommonStruct);
            LJJIIJZLJL(c2344009Gk);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String id;
        if (!C04UD.LIZ()) {
            C1394090mNj c1394090mNj = C1394090mNj.LIZ;
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            c1394090mNj.getClass();
            C1394090mNj.LIZ(c2344009Gk, anchorCommonStruct);
            LJJII(c2344009Gk, true, true);
        }
        C1394090mNj c1394090mNj2 = C1394090mNj.LIZ;
        Activity activityLJIILJJIL = LJIILJJIL();
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null) {
            id = anchorCommonStruct2.getId();
        } else {
            id = null;
        }
        c1394090mNj2.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLJIILJJIL, "//aime/style/detail");
        smartRouteBuildRoute.withParam("ids", id);
        smartRouteBuildRoute.withParam("enter_from", "homepage_hot");
        smartRouteBuildRoute.open();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        UrlModel icon = null;
        if (anchorCommonStruct == null) {
            return null;
        }
        C1394730mOl c1394730mOlLIZ = C1066980ds8.LIZ(viewGroup.getContext());
        c1394730mOlLIZ.setTitle(LJJIJIIJI());
        c1394730mOlLIZ.setSubTitle(anchorCommonStruct.getDescription());
        C786410Ut5.ca(c1394730mOlLIZ, new ACListenerS124S0200000_21(c2344009Gk, this, 36));
        UrlModel thumbnail = anchorCommonStruct.getThumbnail();
        if (thumbnail != null) {
            c1394730mOlLIZ.setIcon(thumbnail);
        }
        AnchorPanelAction anchorPanelAction = this.LLJ;
        if (anchorPanelAction != null) {
            icon = anchorPanelAction.getIcon();
        }
        c1394730mOlLIZ.setButtonIcon(icon);
        c1394730mOlLIZ.setButtonOnClickListener(new AwS598S0100000_19(this, 585));
        viewGroup.addView(c1394730mOlLIZ);
        return c1394730mOlLIZ;
    }
}
