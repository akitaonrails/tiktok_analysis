package X;

import Y.ACListenerS119S0200000_16;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.expriment.DisableAudioAnchorABSwitchConfig;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.multi.maker.VcVoiceAttr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0dtf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067930dtf extends AbstractC1066890drz {
    public AnchorPanelAction LLJ;

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(new AwS560S0100000_16(this, 710), new AwS560S0100000_16(this, 711), new AwS560S0100000_16(this, 712), null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1067930dtf();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_VOICECONVERSION.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final String LIZLLL() {
        String keyword;
        if (C1067940dtg.LIZ()) {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) {
                keyword = "";
            }
            if (C1533950q1J.LJ(keyword)) {
                return C1BWL.LIZJ().getString(2131826573, keyword);
            }
        }
        return super.LIZLLL();
    }

    public final C1065100dp6 LJJIJIIJI() {
        String logExtra;
        AnchorCommonStruct anchorCommonStruct;
        String logExtra2;
        List<AnchorCommonStruct> anchors = LJIIZILJ().getAnchors();
        if (anchors != null && (anchors.isEmpty() ^ true)) {
            logExtra2 = ((AnchorCommonStruct) ListProtector.get(LJIIZILJ().getAnchors(), 0)).getLogExtra();
        } else {
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (anchorCommonStruct2 == null || (logExtra = anchorCommonStruct2.getLogExtra()) == null || logExtra.length() <= 0 || (anchorCommonStruct = this.LLIZ) == null) {
                return null;
            }
            logExtra2 = anchorCommonStruct.getLogExtra();
        }
        if (logExtra2 != null) {
            return new C1065100dp6(logExtra2);
        }
        return null;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            String strLJJIJIIJIL = null;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            interfaceC1392640mLO.Cf();
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 == null) {
                interfaceC1392640mLO2 = null;
            }
            interfaceC1392640mLO2.LJJLIIIJJIZ();
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct != null) {
                strLJJIJIIJIL = LJJIJIIJIL(anchorCommonStruct);
            }
            c2344009Gk.LJFF("audio_tool_origin_from", strLJJIJIIJIL);
            LJJIIJ(c2344009Gk);
        }
    }

    public final String LJJIJIIJIL(AnchorCommonStruct anchorCommonStruct) {
        String extra;
        VcVoiceAttr vcVoiceAttr;
        String str;
        Gson gson = new Gson();
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 == null || (extra = anchorCommonStruct2.getExtra()) == null || (vcVoiceAttr = (VcVoiceAttr) GsonProtectorUtils.fromJson(gson, extra, VcVoiceAttr.class)) == null || (str = vcVoiceAttr.createSource) == null) {
            return "";
        }
        return str;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        boolean z;
        List<AnchorPanelAction> actions;
        List<AnchorPanelAction> actions2;
        if (((DisableAudioAnchorABSwitchConfig) C1067950dth.LIZIZ.getValue()).disableVoiceConversion) {
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : list) {
                if (anchorCommonStruct.getType() == type()) {
                    arrayList.add(anchorCommonStruct);
                }
            }
            list.removeAll(arrayList);
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAccountType() == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        boolean zLIZ = ((AccountUserService) C0XQ7.LJFF()).LIZ();
        AnchorPanelAction anchorPanelAction = null;
        if ((!z || C2353809Ke.LIZ) && zIsLogin && !zLIZ) {
            ArrayList arrayList2 = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct2 : list) {
                AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct2;
                if (anchorCommonStruct3.getType() == type() && (actions = anchorCommonStruct3.getActions()) != null) {
                    Iterator<AnchorPanelAction> it2 = actions.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AnchorPanelAction next = it2.next();
                            if (next.getActionType() == 1) {
                                if (next != null) {
                                    arrayList2.add(anchorCommonStruct2);
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList2.size() == 0) {
                return EnumC1050190dR3.NOT_FOUND;
            }
            AnchorCommonStruct anchorCommonStruct4 = (AnchorCommonStruct) C13LP.LJJJJZI(arrayList2);
            LJIILIIL(anchorCommonStruct4);
            list.remove(anchorCommonStruct4);
            List<AnchorPanelAction> actions3 = anchorCommonStruct4.getActions();
            if (actions3 != null) {
                Iterator<AnchorPanelAction> it3 = actions3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    AnchorPanelAction next2 = it3.next();
                    if (next2.getActionType() == 1) {
                        anchorPanelAction = next2;
                        break;
                    }
                }
                anchorPanelAction = anchorPanelAction;
            }
            this.LLJ = anchorPanelAction;
            this.LLIZ = anchorCommonStruct4;
            if (arrayList2.size() > 1) {
                return EnumC1050190dR3.PROCEED;
            }
            return EnumC1050190dR3.DONE;
        }
        ArrayList arrayList3 = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct5 : list) {
            AnchorCommonStruct anchorCommonStruct6 = anchorCommonStruct5;
            if (anchorCommonStruct6.getType() == type() && (actions2 = anchorCommonStruct6.getActions()) != null) {
                Iterator<AnchorPanelAction> it4 = actions2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        AnchorPanelAction next3 = it4.next();
                        if (next3.getActionType() == 1) {
                            if (next3 != null) {
                                arrayList3.add(anchorCommonStruct5);
                            }
                        }
                    }
                }
            }
        }
        list.removeAll(arrayList3);
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        String strLJJIJIIJIL;
        if (!C04UD.LIZ()) {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct != null) {
                strLJJIJIIJIL = LJJIJIIJIL(anchorCommonStruct);
            } else {
                strLJJIJIIJIL = null;
            }
            c2344009Gk.getClass();
            c2344009Gk.LJIIIIZZ("audio_tool_origin_from", strLJJIJIIJIL);
            LJJIIJZLJL(c2344009Gk);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String strLIZ;
        String keyword;
        String strLJ;
        String strLIZ2;
        String strLIZIZ;
        String strLJ2;
        String groupId;
        String strLJJIJIIJIL;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        String strLJJIJIIJIL2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strCf = interfaceC1392640mLO.Cf();
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
        if (!C04UD.LIZ()) {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct != null) {
                strLJJIJIIJIL = LJJIJIIJIL(anchorCommonStruct);
            } else {
                strLJJIJIIJIL = null;
            }
            c2344009Gk.getClass();
            c2344009Gk.LJIIIIZZ("audio_tool_origin_from", strLJJIJIIJIL);
            LJJII(c2344009Gk, true, true);
        }
        try {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            C1065100dp6 c1065100dp6LJJIJIIJI = LJJIJIIJI();
            if (c1065100dp6LJJIJIIJI != null) {
                strLJ2 = c1065100dp6LJJIJIIJI.LJ();
            } else {
                strLJ2 = null;
            }
            c2344009Gk2.LJIIIIZZ("main_anchor_type", strLJ2);
            Aweme awemeLJIIZILJ = LJIIZILJ();
            if (awemeLJIIZILJ != null) {
                groupId = awemeLJIIZILJ.getGroupId();
            } else {
                groupId = null;
            }
            c2344009Gk2.LJIIIIZZ("group_id", groupId);
            C20684815ws.LJIILLIIL("enter_creation_anchor_detail", c2344009Gk2.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(LJIILJJIL(), "//voice_conversion/detail");
        smartRouteBuildRoute.withParam("anchor_type", "voice_conversion");
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null) {
            strLIZ = new C1065100dp6(anchorCommonStruct2.getLogExtra()).LIZ();
        } else {
            strLIZ = null;
        }
        smartRouteBuildRoute.withParam("anchor_id", strLIZ);
        AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
        if (anchorCommonStruct3 != null) {
            keyword = anchorCommonStruct3.getKeyword();
        } else {
            keyword = null;
        }
        String str = "";
        if (keyword == null) {
            keyword = "";
        }
        smartRouteBuildRoute.withParam("anchor_name", keyword);
        C1065100dp6 c1065100dp6LJJIJIIJI2 = LJJIJIIJI();
        if (c1065100dp6LJJIJIIJI2 != null) {
            strLJ = c1065100dp6LJJIJIIJI2.LJ();
        } else {
            strLJ = null;
        }
        smartRouteBuildRoute.withParam("main_anchor_type", strLJ);
        C1065100dp6 c1065100dp6LJJIJIIJI3 = LJJIJIIJI();
        if (c1065100dp6LJJIJIIJI3 != null) {
            strLIZ2 = c1065100dp6LJJIJIIJI3.LIZ();
        } else {
            strLIZ2 = null;
        }
        smartRouteBuildRoute.withParam("main_anchor_id", strLIZ2);
        C1065100dp6 c1065100dp6LJJIJIIJI4 = LJJIJIIJI();
        if (c1065100dp6LJJIJIIJI4 != null) {
            strLIZIZ = c1065100dp6LJJIJIIJI4.LIZIZ();
        } else {
            strLIZIZ = null;
        }
        smartRouteBuildRoute.withParam("main_anchor_name", strLIZIZ);
        smartRouteBuildRoute.withParam("music_model", LJIIZILJ().getMusic());
        smartRouteBuildRoute.withParam("enter_from", strCf);
        String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
        if (authorUid == null) {
            authorUid = "";
        }
        smartRouteBuildRoute.withParam("author_id", authorUid);
        String aid = awemeLJJLIIIJJIZ.getAid();
        if (aid != null) {
            str = aid;
        }
        smartRouteBuildRoute.withParam("group_id", str);
        AnchorCommonStruct anchorCommonStruct4 = this.LLIZ;
        if (anchorCommonStruct4 != null) {
            strLJJIJIIJIL2 = LJJIJIIJIL(anchorCommonStruct4);
        }
        smartRouteBuildRoute.withParam("audio_tool_origin_from", strLJJIJIIJIL2);
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
        UrlModel thumbnail = anchorCommonStruct.getThumbnail();
        if (thumbnail != null) {
            c1394730mOlLIZ.setIcon(thumbnail);
        }
        String keyword = anchorCommonStruct.getKeyword();
        if (keyword == null) {
            keyword = "";
        }
        c1394730mOlLIZ.setTitle(keyword);
        c1394730mOlLIZ.setSubTitle(anchorCommonStruct.getDescription());
        C786410Ut5.ca(c1394730mOlLIZ, new ACListenerS119S0200000_16(this, c2344009Gk, 20));
        AnchorPanelAction anchorPanelAction = this.LLJ;
        if (anchorPanelAction != null) {
            icon = anchorPanelAction.getIcon();
        }
        c1394730mOlLIZ.setButtonIcon(icon);
        c1394730mOlLIZ.setButtonOnClickListener(new AwS595S0100000_16(this, c2344009Gk, 238));
        viewGroup.addView(c1394730mOlLIZ);
        return c1394730mOlLIZ;
    }
}
