package X;

import Y.ARunnableS90S0200000_21;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.model.SurpriseResource;
import com.ss.android.ugc.tiktok.report.ReportWebContainer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402230mar implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        switch (this.$t) {
            case 0:
                mh2$0(this, c262100zr);
                break;
            case 1:
                mh2$1(this, c262100zr);
                break;
            case 2:
                mh2$2(this, c262100zr);
                break;
            case 3:
                mh2$3(this, c262100zr);
                break;
            case 4:
                mh2$4(this, c262100zr);
                break;
            case 5:
                mh2$5(this, c262100zr);
                break;
            case 6:
                mh2$6(this, c262100zr);
                break;
            case 7:
                mh2$7(this, c262100zr);
                break;
            case 8:
                mh2$8(this, c262100zr);
                break;
        }
    }

    public C1402230mar(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C1402230mar c1402230mar, C262100zr c262100zr) {
        Map<String, ? extends Object> mapLIZ;
        InterfaceC1381790m3t interfaceC1381790m3t;
        ReportWebContainer reportWebContainer = (ReportWebContainer) c1402230mar.l0;
        String str = c262100zr.LIZ;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null) {
            mapLIZ = interfaceC1107590evd.LIZ();
        } else {
            mapLIZ = null;
        }
        if (reportWebContainer.LLJILJILJ != null && (interfaceC1381790m3t = reportWebContainer.LLJILLL) != null) {
            interfaceC1381790m3t.LIZ(str, mapLIZ);
        }
        InterfaceC1387770mDX interfaceC1387770mDX = reportWebContainer.LLJJI;
        if (interfaceC1387770mDX != null) {
            interfaceC1387770mDX.LIZ(str, mapLIZ, reportWebContainer.LLIZLLLIL, reportWebContainer);
        }
    }

    public static final void mh2$1(C1402230mar c1402230mar, C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "wallet_exchange_status")) {
            C1348790lCf c1348790lCf = (C1348790lCf) c1402230mar.l0;
            c1348790lCf.LIZLLL.BQ2(1, 0L, c1348790lCf.LIZJ, "from_recharge");
            ((C1348790lCf) c1402230mar.l0).LJIIIZ.LJIIIIZZ();
        }
    }

    public static final void mh2$2(C1402230mar c1402230mar, C262100zr c262100zr) {
        Integer numValueOf;
        String strLJFF;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        String strLJFF2 = null;
        if (interfaceC1107590evd != null) {
            numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd, "action_type", 0));
        } else {
            numValueOf = null;
        }
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 != null) {
            strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "link", "");
        } else {
            strLJFF = null;
        }
        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
        if (interfaceC1107590evd3 != null) {
            strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd3, "reply_cid", "");
        }
        ((C1356260lOi) c1402230mar.l0).LJ(numValueOf);
        if (numValueOf != null) {
            C1356260lOi c1356260lOi = (C1356260lOi) c1402230mar.l0;
            numValueOf.intValue();
            if (numValueOf.intValue() == EnumC1349940lEW.CLICK_CONFIRM.getActionType()) {
                c1356260lOi.LJI("click_redirect_button");
                return;
            }
            if (numValueOf.intValue() != EnumC1349940lEW.CLICK_REPLY.getActionType()) {
                if (numValueOf.intValue() != EnumC1349940lEW.CLICK_RAISE_KEYBOARD.getActionType()) {
                    if (numValueOf.intValue() != EnumC1349940lEW.CLICK_IMAGE_COMMENT.getActionType()) {
                        if (numValueOf.intValue() == EnumC1349940lEW.CLICK_JUMP_ACTIVITY_PAGE.getActionType()) {
                            c1356260lOi.LJI("click_redirect_button");
                            if (strLJFF == null) {
                                return;
                            }
                            SmartRouter.buildRoute(c1356260lOi.LLILZIL, strLJFF).open();
                            return;
                        }
                        c1356260lOi.LJI("click_redirect_button");
                        return;
                    }
                }
            }
            c1356260lOi.LJI("click_redirect_button");
            InterfaceC1356280lOk interfaceC1356280lOk = c1356260lOi.LLILZ.LIZ;
            if (interfaceC1356280lOk == null) {
                return;
            }
            interfaceC1356280lOk.LJFF(numValueOf, strLJFF2);
        }
    }

    public static final void mh2$3(C1402230mar c1402230mar, C262100zr c262100zr) {
        String strLJFF;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "url", "")) != null) {
            C1356260lOi c1356260lOi = (C1356260lOi) c1402230mar.l0;
            if (strLJFF.length() > 0) {
                c1356260lOi.LJ(Integer.valueOf(EnumC1349940lEW.CLICK_JUMP_ACTIVITY_PAGE.getActionType()));
                c1356260lOi.LJI("click_easter_egg");
                SmartRouter.buildRoute(c1356260lOi.LLILZIL, strLJFF).open();
            }
        }
    }

    public static final void mh2$4(C1402230mar c1402230mar, C262100zr c262100zr) {
        Boolean boolValueOf;
        String str;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null) {
            boolValueOf = Boolean.valueOf(C1871910yoP.LIZIZ(interfaceC1107590evd, "from_blank_close", false));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            str = "click_blank";
        } else {
            str = "finish_animation";
        }
        ((C1356260lOi) c1402230mar.l0).LJI(str);
    }

    public static final void mh2$5(C1402230mar c1402230mar, C262100zr c262100zr) {
        String strLJFF;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null) {
            strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "reason", "");
        } else {
            strLJFF = null;
        }
        ((C1356260lOi) c1402230mar.l0).LJI(null);
        C1356250lOh.LIZ(((C1356260lOi) c1402230mar.l0).LLJJIII, strLJFF);
    }

    public static final void mh2$6(C1402230mar c1402230mar, C262100zr c262100zr) {
        C1356260lOi c1356260lOi = (C1356260lOi) c1402230mar.l0;
        c1356260lOi.getClass();
        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
        if (c0n0yLJLJJI != null && !c0n0yLJLJJI.isMute()) {
            c0n0yLJLJJI.LJFF();
            c1356260lOi.LLJJ = true;
        }
    }

    public static final void mh2$7(C1402230mar c1402230mar, C262100zr c262100zr) {
        C0N0Y c0n0yLJLJJI;
        C1356260lOi c1356260lOi = (C1356260lOi) c1402230mar.l0;
        if (c1356260lOi.LLJJ && (c0n0yLJLJJI = C1483410ohn.LJLJJI()) != null) {
            c1356260lOi.LLJJ = false;
            c0n0yLJLJJI.LJIJJ();
        }
    }

    public static final void mh2$8(C1402230mar c1402230mar, C262100zr c262100zr) {
        boolean z;
        Integer num;
        String string;
        C1353060lJY c1353060lJYLIZIZ;
        CommentSurprise commentSurprise;
        SurpriseResource surpriseResource;
        C1349800lEI c1349800lEILJ;
        InterfaceC1356280lOk interfaceC1356280lOk = ((C1356260lOi) c1402230mar.l0).LLILZ.LIZ;
        if (interfaceC1356280lOk != null && interfaceC1356280lOk.isShowing()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1356260lOi c1356260lOi = (C1356260lOi) c1402230mar.l0;
            c1356260lOi.LLIZLLLIL = false;
            C0GUO c0guo = c1356260lOi.LLJI;
            if (c0guo != null) {
                int visibility = c0guo.getVisibility();
                c0guo.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c0guo);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((C1356260lOi) c1402230mar.l0).LLJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 0);
            }
            C1356260lOi c1356260lOi2 = (C1356260lOi) c1402230mar.l0;
            InterfaceC1356280lOk interfaceC1356280lOk2 = c1356260lOi2.LLILZ.LIZ;
            if (interfaceC1356280lOk2 != null && (c1349800lEILJ = interfaceC1356280lOk2.LJ()) != null) {
                C20684815ws.LJIILLIIL("easter_egg_show", C1352020lHs.LIZ(c1356260lOi2.LIZJ(c1349800lEILJ)).LIZ);
            }
            ((C1356260lOi) c1402230mar.l0).LLJILLL = System.currentTimeMillis();
            C1356260lOi c1356260lOi3 = (C1356260lOi) c1402230mar.l0;
            if (c1356260lOi3.LLJJIJI > 0 && c1356260lOi3.LLJ != null) {
                c1356260lOi3.LIZLLL(true);
                CommentSurpriseStruct commentSurpriseStruct = ((C1356260lOi) c1402230mar.l0).LLJJIII;
                if (commentSurpriseStruct != null && (commentSurprise = commentSurpriseStruct.commentSurprise) != null && (surpriseResource = commentSurprise.surpriseResource) != null) {
                    num = surpriseResource.effectId;
                } else {
                    num = null;
                }
                Keva keva = (Keva) C1356310lOn.LIZ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("comment_easter_egg_has_load_");
                if (num == null || (string = num.toString()) == null) {
                    string = "";
                }
                sbLIZ.append(string);
                keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                C1352020lHs.LIZIZ(((C1356260lOi) c1402230mar.l0).LLJJIII, Boolean.TRUE, null);
                InterfaceC1356280lOk interfaceC1356280lOk3 = ((C1356260lOi) c1402230mar.l0).LLILZ.LIZ;
                if (interfaceC1356280lOk3 != null && (c1353060lJYLIZIZ = interfaceC1356280lOk3.LIZIZ()) != null) {
                    c1353060lJYLIZIZ.setEasterEggShowing(true);
                }
                C1356260lOi c1356260lOi4 = (C1356260lOi) c1402230mar.l0;
                CommentSurpriseStruct commentSurpriseStruct2 = c1356260lOi4.LLJJIII;
                if (commentSurpriseStruct2 != null) {
                    BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                    c1356260lOi4.LLJJIJIIJIL = bPEAHandler;
                    ARunnableS90S0200000_21 aRunnableS90S0200000_21 = new ARunnableS90S0200000_21(commentSurpriseStruct2, c1356260lOi4, 60);
                    c1356260lOi4.LLJJIJIL = aRunnableS90S0200000_21;
                    C786410Ut5.LJLIIL(1750L, bPEAHandler, aRunnableS90S0200000_21);
                    return;
                }
                return;
            }
            return;
        }
        C1356250lOh.LIZ(((C1356260lOi) c1402230mar.l0).LLJJIII, "comment_close_while_loading");
        ((C1356260lOi) c1402230mar.l0).LJI(null);
    }
}
