package X;

import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEasterEggAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicEasterEggAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ApplySkin;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0P4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638910P4f implements InterfaceC1141530foN {
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
            case BdTuring.TYPE_ECAF /* 9 */:
                mh2$9(this, c262100zr);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                mh2$10(this, c262100zr);
                break;
        }
    }

    public C638910P4f(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C638910P4f c638910P4f, C262100zr c262100zr) {
        boolean z;
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplySkinChanged onReceive eventName=");
        sbLIZ.append(c262100zr.LIZ);
        sbLIZ.append(", currentBbId=");
        sbLIZ.append(((BulletinBoardPageHybridAssem) c638910P4f.l0).Vo().LLILLJJLI);
        sbLIZ.append(", hasParams=");
        if (c262100zr.LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(c262100zr.LIZ, "bb_apply_skin_changed")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ApplySkinChanged dropped, eventName mismatch=");
            sbLIZ2.append(c262100zr.LIZ);
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null) {
            C0OPX.LJIIIZ("ApplySkinChanged dropped, params is null");
            return;
        }
        String string2 = interfaceC1107590evd.getString("bulletin_board_id");
        Long l = ((BulletinBoardPageHybridAssem) c638910P4f.l0).Vo().LLILLJJLI;
        String str = null;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF(string2, string)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ApplySkinChanged ignored, event bbId=");
            sbLIZ3.append(string2);
            sbLIZ3.append(", current bbId=");
            sbLIZ3.append(((BulletinBoardPageHybridAssem) c638910P4f.l0).Vo().LLILLJJLI);
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        InterfaceC1107590evd map = interfaceC1107590evd.getMap("apply_skin");
        if (map == null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("ApplySkinChanged dropped, apply_skin map is null, bbId=");
            sbLIZ4.append(string2);
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        try {
            ApplySkin applySkin = (ApplySkin) new Gson().LJII(C786410Ut5.J3(new JSONObject(map.LIZ())), ApplySkin.class);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("ApplySkinChanged received, bbId=");
            sbLIZ5.append(string2);
            sbLIZ5.append(", applySkin.id=");
            sbLIZ5.append(applySkin.id);
            sbLIZ5.append(", styleId=");
            BulletinStyleStruct bulletinStyleStruct = applySkin.styleStruct;
            if (bulletinStyleStruct != null) {
                str = bulletinStyleStruct.styleId;
            }
            sbLIZ5.append(str);
            sbLIZ5.append(", status=");
            sbLIZ5.append(applySkin.status);
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5));
            ((BulletinBoardPageHybridAssem) c638910P4f.l0).Vo().LLJJJJJIL = applySkin;
            BulletinStyleStruct bulletinStyleStruct2 = applySkin.styleStruct;
            if (bulletinStyleStruct2 != null) {
                C0OJS.LIZ.getClass();
                C0OJS.LIZ(bulletinStyleStruct2);
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("ApplySkinChanged applied to profileVM, id=");
            sbLIZ6.append(applySkin.id);
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ6));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("ApplySkinChanged parse failed: ");
            sbLIZ7.append(e.getClass().getSimpleName());
            sbLIZ7.append(": ");
            sbLIZ7.append(e.getMessage());
            sbLIZ7.append(", raw=");
            sbLIZ7.append(map);
            C0OPX.LJIIJ(C2188811AlT.LIZIZ(sbLIZ7));
        }
    }

    public static final void mh2$1(C638910P4f c638910P4f, C262100zr c262100zr) {
        String strLJFF;
        C0OPX.LJIIIZ("BulletinEasterEggAssemonClick");
        View viewLJJIJL = ((BulletinEasterEggAssem) c638910P4f.l0).LJJIJL();
        if ((viewLJJIJL instanceof C636810OyN) && viewLJJIJL != null) {
            BulletinEasterEggAssem bulletinEasterEggAssem = (BulletinEasterEggAssem) c638910P4f.l0;
            try {
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                String str = "";
                if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "url", "")) != null) {
                    str = strLJFF;
                }
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(str);
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                Context context = viewLJJIJL.getContext();
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                C0OPQ c0opq = C0OPQ.LIZ;
                String str2 = bulletinEasterEggAssem.LLJILLL;
                c0opq.getClass();
                C0OPQ.LJJIIZ(str2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void mh2$10(C638910P4f c638910P4f, C262100zr c262100zr) {
        Music music;
        String mid;
        C630120Ona.LIZIZ(((MusicEasterEggAssem) c638910P4f.l0).getContentView());
        MusicEasterEggAssem musicEasterEggAssem = (MusicEasterEggAssem) c638910P4f.l0;
        Keva keva = (Keva) musicEasterEggAssem.LLJJIJIIJIL.getValue();
        String str = musicEasterEggAssem.LLJJIJIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        keva.storeBoolean(MusicEasterEggAssem.lp(str), false);
        MusicEasterEggAssem musicEasterEggAssem2 = (MusicEasterEggAssem) c638910P4f.l0;
        String str3 = musicEasterEggAssem2.LLJJIJIL;
        if (str3 == null) {
            str3 = "";
        }
        MusicDetail musicDetail = musicEasterEggAssem2.LLJJJIL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("activity_page", "animation");
        c2344009Gk.LJIIIIZZ("activity_id", str3);
        if (musicDetail != null && (music = musicDetail.music) != null && (mid = music.getMid()) != null) {
            str2 = mid;
        }
        c2344009Gk.LJIIIIZZ("clip_id", str2);
        C20684815ws.LJIILLIIL("mdp_easter_egg_show", c2344009Gk.LIZ);
    }

    public static final void mh2$2(C638910P4f c638910P4f, C262100zr c262100zr) {
        ((BulletinEasterEggAssem) c638910P4f.l0).release();
        C0OPX.LJIIIZ("BulletinEasterEggAssemonClose");
    }

    public static final void mh2$3(C638910P4f c638910P4f, C262100zr c262100zr) {
        String strLJFF;
        Map<String, Object> mapLIZ;
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEasterEggAssemonError, message: ");
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        String str = "";
        if (interfaceC1107590evd != null) {
            strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "message", "");
        } else {
            strLJFF = null;
        }
        sbLIZ.append(strLJFF);
        C0OPX.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
        ((BulletinEasterEggAssem) c638910P4f.l0).release();
        C0OPQ c0opq = C0OPQ.LIZ;
        String str2 = ((BulletinEasterEggAssem) c638910P4f.l0).LLJILLL;
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 != null && (mapLIZ = interfaceC1107590evd2.LIZ()) != null && (string = mapLIZ.toString()) != null) {
            str = string;
        }
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board");
        c2344009Gk.LJIIIIZZ("activity_page", "animation");
        c2344009Gk.LJIIIIZZ("activity_id", str2);
        c2344009Gk.LJIIIIZZ("error_code", str);
        C20684815ws.LJIILLIIL("mdp_easter_egg_error", c2344009Gk.LIZ);
    }

    public static final void mh2$4(C638910P4f c638910P4f, C262100zr c262100zr) {
        C636810OyN c636810OyN;
        View viewLJJIJL = ((BulletinEasterEggAssem) c638910P4f.l0).LJJIJL();
        if ((viewLJJIJL instanceof C636810OyN) && (c636810OyN = (C636810OyN) viewLJJIJL) != null) {
            C337180DJs.LIZJ(c636810OyN);
            c636810OyN.setClickableEnabled(false);
            HandlerHook.viewPostDelay(c636810OyN, new ARunnableS109S0100000_9((Object) c636810OyN, 85), 1000L);
        }
        BulletinEasterEggAssem bulletinEasterEggAssem = (BulletinEasterEggAssem) c638910P4f.l0;
        String str = bulletinEasterEggAssem.LLJILLL;
        ((Keva) bulletinEasterEggAssem.LLJI.getValue()).storeInt(bulletinEasterEggAssem.Ho(str), bulletinEasterEggAssem.Go(str) + 1);
        C0OPQ c0opq = C0OPQ.LIZ;
        String str2 = ((BulletinEasterEggAssem) c638910P4f.l0).LLJILLL;
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board");
        c2344009Gk.LJIIIIZZ("activity_page", "animation");
        c2344009Gk.LJIIIIZZ("activity_id", str2);
        C20684815ws.LJIILLIIL("mdp_easter_egg_show", c2344009Gk.LIZ);
        C0OPX.LJIIIZ("BulletinEasterEggAssemonStart");
    }

    public static final void mh2$5(C638910P4f c638910P4f, C262100zr c262100zr) {
        String str;
        BulletinTooltipAbility bulletinTooltipAbilityOo;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "bulletin_tooltip_js_event") || !C0OMB.LIZ()) {
            return;
        }
        try {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd == null) {
                return;
            }
            String string = interfaceC1107590evd.getString("tooltip_type");
            String string2 = interfaceC1107590evd.getString("location");
            String string3 = interfaceC1107590evd.getString("channel_id");
            if (!Intrinsics.LJFF(string, "chat_bubble") || !Intrinsics.LJFF(string2, "bar_more")) {
                return;
            }
            C0OLV c0olvLo = ((BaseBulletinBarAssem) c638910P4f.l0).Lo();
            if (c0olvLo != null) {
                str = c0olvLo.LL;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(string3, str)) {
                return;
            }
            C0OP4.LIZ.getClass();
            if ((!C0OP4.LIZ().getBoolean("has_show_chat_bubble_tooltip", false)) && (bulletinTooltipAbilityOo = ((BaseBulletinBarAssem) c638910P4f.l0).Oo()) != null) {
                BaseBulletinBarAssem baseBulletinBarAssem = (BaseBulletinBarAssem) c638910P4f.l0;
                baseBulletinBarAssem.getClass();
                bulletinTooltipAbilityOo.m20(new C0OVG(baseBulletinBarAssem));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bulletin_tooltip_js_event error: ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void mh2$6(C638910P4f c638910P4f, C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "bulletin_analysis_tooltip_js_event")) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bulletin_analysis_tooltip_js_event");
                sbLIZ.append(c262100zr.LIZIZ);
                C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd == null) {
                    return;
                }
                String string = interfaceC1107590evd.getString("channel_id");
                BulletinTooltipAbility bulletinTooltipAbilityOo = ((BaseBulletinBarAssem) c638910P4f.l0).Oo();
                if (bulletinTooltipAbilityOo != null) {
                    BaseBulletinBarAssem baseBulletinBarAssem = (BaseBulletinBarAssem) c638910P4f.l0;
                    AwS158S1100000_9 awS158S1100000_9 = new AwS158S1100000_9(string, baseBulletinBarAssem, 10);
                    AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(155);
                    baseBulletinBarAssem.getClass();
                    bulletinTooltipAbilityOo.m20(new C0OVH(awS158S1100000_9, baseBulletinBarAssem, aFwS195S0000000_9));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("bulletin_analysis_tooltip_js_event error: ");
                sbLIZ2.append(e.getMessage());
                C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public static final void mh2$7(C638910P4f c638910P4f, C262100zr c262100zr) {
        String strAsString;
        InterfaceC1871820yoG interfaceC1871820yoG;
        View contentView = ((MusicEasterEggAssem) c638910P4f.l0).getContentView();
        if ((contentView instanceof FrameLayout) && contentView != null) {
            MusicEasterEggAssem musicEasterEggAssem = (MusicEasterEggAssem) c638910P4f.l0;
            try {
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                String str = "";
                if (interfaceC1107590evd == null || (interfaceC1871820yoG = interfaceC1107590evd.get("url")) == null || (strAsString = interfaceC1871820yoG.asString()) == null) {
                    strAsString = "";
                }
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(strAsString);
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                Context context = contentView.getContext();
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                String str2 = musicEasterEggAssem.LLJJIJIL;
                if (str2 != null) {
                    str = str2;
                }
                C1398280mUU.LJII(musicEasterEggAssem.LLJJJIL, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void mh2$8(C638910P4f c638910P4f, C262100zr c262100zr) {
        ((MusicEasterEggAssem) c638910P4f.l0).release();
    }

    public static final void mh2$9(C638910P4f c638910P4f, C262100zr c262100zr) {
        String string;
        String string2;
        Music music;
        String mid;
        Map<String, Object> mapLIZ;
        Map<String, Object> mapLIZ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError, message: ");
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null && (mapLIZ2 = interfaceC1107590evd.LIZ()) != null) {
            string = mapLIZ2.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        MusicEasterEggAssem musicEasterEggAssem = (MusicEasterEggAssem) c638910P4f.l0;
        String str = musicEasterEggAssem.LLJJIJIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        MusicDetail musicDetail = musicEasterEggAssem.LLJJJIL;
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 == null || (mapLIZ = interfaceC1107590evd2.LIZ()) == null || (string2 = mapLIZ.toString()) == null) {
            string2 = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("activity_page", "animation");
        c2344009Gk.LJIIIIZZ("activity_id", str);
        if (musicDetail != null && (music = musicDetail.music) != null && (mid = music.getMid()) != null) {
            str2 = mid;
        }
        c2344009Gk.LJIIIIZZ("clip_id", str2);
        c2344009Gk.LJIIIIZZ("error_code", string2);
        C20684815ws.LJIILLIIL("mdp_easter_egg_error", c2344009Gk.LIZ);
        ((MusicEasterEggAssem) c638910P4f.l0).release();
    }
}
