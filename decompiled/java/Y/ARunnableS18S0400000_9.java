package Y;

import X.C036E;
import X.C0P0T;
import X.C0SZ8;
import X.C0VSJ;
import X.C1017070cZd;
import X.C1029590ctp;
import X.C1388190mED;
import X.C1391600mJi;
import X.C1480420ocy;
import X.C1481290oeN;
import X.C1594680rbG;
import X.C19EG;
import X.C1B9C;
import X.C1C7U;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2251708rz;
import X.C2344809Gs;
import X.C2354709Kn;
import X.C329320Cva;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C586580MzY;
import X.C612370O0d;
import X.C612400O0g;
import X.C629600Omk;
import X.C629620Omm;
import X.C631220OpM;
import X.C632090Oql;
import X.C637060Oym;
import X.C637420OzM;
import X.C786410Ut5;
import X.C793770VBv;
import X.C794240VDq;
import X.C794420VEi;
import X.C799570VYd;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.EnumC631410Opf;
import X.InterfaceC584210Mvj;
import X.InterfaceC689860R4e;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.controller.I18nPlayerController;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS18S0400000_9 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        MusicModel musicModel;
        C632090Oql c632090Oql = ((C631220OpM) this.l0).LL;
        if (Intrinsics.LJFF((c632090Oql == null || (musicModel = c632090Oql.getMusicModel()) == null) ? null : musicModel.getMusicId(), ((MusicModel) this.l1).getMusicId())) {
            ((MusicPlayViewModel) this.l2).CQ2();
            return;
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper = ((MusicPlayViewModel) this.l2).LLILLJJLI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LJIIIZ();
        }
        ((MusicPlayViewModel) this.l2).setState(new AwS588S0100000_9((C632090Oql) this.l3, 341));
        ((MusicPlayViewModel) this.l2).LLILZLL = EnumC631410Opf.DEFAULT;
        ((MusicPlayViewModel) this.l2).zQ2((MusicModel) this.l1);
    }

    public final void LIZ$1() {
        MusicModel musicModel;
        C632090Oql c632090Oql = ((C631220OpM) this.l0).LL;
        if (Intrinsics.LJFF((c632090Oql == null || (musicModel = c632090Oql.getMusicModel()) == null) ? null : musicModel.getMusicId(), ((MusicModel) this.l1).getMusicId())) {
            ((MusicPlayViewModel) this.l2).CQ2();
            return;
        }
        ((MusicPlayViewModel) this.l2).LLJILJIL.add(((MusicModel) this.l1).getMusicId());
        MusicDownloadPlayHelper musicDownloadPlayHelper = ((MusicPlayViewModel) this.l2).LLILLJJLI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LJIIIZ();
        }
        ((MusicPlayViewModel) this.l2).setState(new AwS588S0100000_9((C632090Oql) this.l3, 342));
        ((MusicPlayViewModel) this.l2).LLILZLL = EnumC631410Opf.DEFAULT;
        ((MusicPlayViewModel) this.l2).zQ2((MusicModel) this.l1);
    }

    public final void LIZ$2() {
        C0P0T c0p0t;
        C629620Omm c629620Omm = (C629620Omm) this.l0;
        C629600Omk c629600Omk = c629620Omm.LJIIJJI;
        if (c629600Omk == null) {
            return;
        }
        C0P0T c0p0t2 = c629620Omm.LIZJ;
        if (c0p0t2 == null || !c0p0t2.isShowing()) {
            try {
                C629620Omm c629620Omm2 = (C629620Omm) this.l0;
                C450720Hlu c450720Hlu = new C450720Hlu((Context) this.l1);
                c450720Hlu.LLILZ = c629600Omk.LIZIZ;
                View view = (View) this.l2;
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = view;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                c450720Hlu.LJ(new AwS253S0300000_9((C629620Omm) this.l0, (C629620Omm) c629600Omk, (C629600Omk) this.l3, (Function0<Unit>) 2));
                c629620Omm2.LIZJ = c450720Hlu.LIZIZ();
                C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) this.l1);
                if (c19egLIZIZ == null || c19egLIZIZ.isFinishing() || (c0p0t = ((C629620Omm) this.l0).LIZJ) == null) {
                    return;
                }
                c0p0t.show();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
            }
        }
    }

    public static final void run$0(ARunnableS18S0400000_9 aRunnableS18S0400000_9) {
        PlayerController playerController = (PlayerController) aRunnableS18S0400000_9.l0;
        InterfaceC584210Mvj interfaceC584210Mvj = (InterfaceC584210Mvj) aRunnableS18S0400000_9.l1;
        Aweme aweme = (Aweme) aRunnableS18S0400000_9.l2;
        InterfaceC689860R4e interfaceC689860R4e = (InterfaceC689860R4e) aRunnableS18S0400000_9.l3;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.initCommerceCard$1L");
        interfaceC584210Mvj.LJIILIIL(playerController.getContext(), playerController.fragment, interfaceC689860R4e.LJJIIZI(), aweme, playerController.mEventType);
        C1C7U.LIZIZ("PlayerController@7763.initCommerceCard$1L");
    }

    public static final void run$1(ARunnableS18S0400000_9 aRunnableS18S0400000_9) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        String string;
        I18nPlayerController i18nPlayerController = (I18nPlayerController) aRunnableS18S0400000_9.l0;
        C1481290oeN c1481290oeN = (C1481290oeN) aRunnableS18S0400000_9.l1;
        Video video = (Video) aRunnableS18S0400000_9.l2;
        C0SZ8 c0sz8 = (C0SZ8) aRunnableS18S0400000_9.l3;
        i18nPlayerController.getClass();
        C1C7U.LIZ("I18nPlayerController@62e.doOnPlayFailed$1L");
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sourceId", c1481290oeN.LIZ);
            jSONObject3.put("errorCode", c1481290oeN.LJ);
            jSONObject3.put("errorExtra", c1481290oeN.LJFF);
            C1B9C c1b9c = C612400O0g.LIZ;
            jSONObject3.put("netWorkQuality", c1b9c.LIZIZ().toString());
            jSONObject3.put("netWorkSpeed", (int) c1b9c.LIZJ());
            jSONObject3.put("playUrl", JsonParseUtils.LJ(video.getProperPlayAddr()));
            jSONObject3.put("playUrlIsLowBr", video.isLowBr());
            jSONObject3.put("video_duration", video.getDuration());
            C586580MzY.LIZIZ(jSONObject3);
            Object obj = c1481290oeN.LJI;
            if (obj != null) {
                jSONObject3.put("extraInfo", obj.toString());
            }
            C0VSJ c0vsjLJIIJJI = C2354709Kn.LJIIJJI(C2354709Kn.LJIILJJIL());
            video.getProperPlayAddr();
            if (c0vsjLJIIJJI == null) {
                string = "";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0vsjLJIIJJI.getPath());
                sbLIZ.append("/");
                C2251708rz c2251708rz = C2251708rz.LIZ;
                String bitRatedRatioUri = video.getPlayAddr().getBitRatedRatioUri();
                c2251708rz.getClass();
                sbLIZ.append(C2251708rz.LIZ(bitRatedRatioUri));
                string = new C612370O0d(C2188811AlT.LIZIZ(sbLIZ)).toString();
            }
            jSONObject3.put("file", string);
            jSONObject = new JSONObject(C786410Ut5.J3(jSONObject3));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = null;
        }
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("play_error");
        mobClickObtain.setLabelName("perf_monitor");
        mobClickObtain.setJsonObject(jSONObject);
        C20684815ws.onEvent(mobClickObtain);
        if (C1594680rbG.LIZIZ(c0sz8)) {
            try {
                jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject3));
                jSONObject2.put("aweme_id", c0sz8.LJIIIIZZ().getAid());
                jSONObject2.put("creative_id", c0sz8.LJIIIIZZ().getAwemeRawAd().getCreativeId());
                if (C1017070cZd.LLIZLLLIL(c0sz8.LJIIIIZZ())) {
                    jSONObject2.put("is_topview", true);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                jSONObject2 = new JSONObject();
            }
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("aweme_ad_media_play_error_rate", 1, jSONObject2);
            C793770VBv.LJIIJJI("aweme_ad_media_play_error", 1, jSONObject2);
            Aweme awemeLJIIIIZZ = c0sz8.LJIIIIZZ();
            if (awemeLJIIIIZZ != null && AwemeExtKt.isAdTraffic(awemeLJIIIIZZ)) {
                C1029590ctp.LIZLLL().LIZ(i18nPlayerController.getContext(), awemeLJIIIIZZ);
                C2184171Adz.LIZLLL("draw_ad", "play_failed", awemeLJIIIIZZ.getAwemeRawAd()).LJIIIIZZ();
            }
        }
        i18nPlayerController.getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList2 = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("aweme_media_error_rate", 1, jSONObject3);
                if (C1594680rbG.LIZJ(c0sz8)) {
                    C329320Cva.LIZ(1, 1, c0sz8.LJIIIIZZ());
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("alarm_reason", "fail_to_play");
                        if (c0sz8.LJIIIIZZ() != null) {
                            jSONObject4.put("group_id", c0sz8.LJIIIIZZ().getAid());
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    MobClick mobClickObtain2 = MobClick.obtain();
                    mobClickObtain2.setEventName("ad_alarm");
                    mobClickObtain2.setLabelName("homepage_hot");
                    mobClickObtain2.setJsonObject(jSONObject4);
                    C20684815ws.onEvent(mobClickObtain2);
                }
                if (VideoBitRateABManager.LJFF.LJFF()) {
                    str = "aweme_media_bitrated_error_rate";
                } else {
                    str = "aweme_media_original_error_rate";
                }
                C793770VBv.LJIIJJI(str, 1, jSONObject3);
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        C794420VEi.LIZIZ("aweme_media_play_error_log", "play_error", jSONObject3);
        C1C7U.LIZIZ("I18nPlayerController@62e.doOnPlayFailed$1L");
    }

    public static final void run$2(ARunnableS18S0400000_9 aRunnableS18S0400000_9) {
        PlayerController playerController = (PlayerController) aRunnableS18S0400000_9.l0;
        Aweme aweme = (Aweme) aRunnableS18S0400000_9.l1;
        C1480420ocy c1480420ocy = (C1480420ocy) aRunnableS18S0400000_9.l2;
        IBaseListFragmentPanel iBaseListFragmentPanel = (IBaseListFragmentPanel) aRunnableS18S0400000_9.l3;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.onRenderFirstFramePost$1L");
        C786410Ut5.LJL(C799570VYd.LIZJ(), new ARunnableS42S0300000_9(playerController, aweme, c1480420ocy, iBaseListFragmentPanel, 1));
        C1C7U.LIZIZ("PlayerController@7763.onRenderFirstFramePost$1L");
    }

    public static final void run$3(ARunnableS18S0400000_9 aRunnableS18S0400000_9) {
        boolean zLIZ;
        C1C7U.LIZ("MusicPlayViewModel@8b09.playMusic$2$1");
        try {
            aRunnableS18S0400000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicPlayViewModel@8b09.playMusic$2$1");
    }

    public static final void run$4(ARunnableS18S0400000_9 aRunnableS18S0400000_9) {
        boolean zLIZ;
        C1C7U.LIZ("MusicPlayViewModel@8b09.playMusicFromReport$1$1");
        try {
            aRunnableS18S0400000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicPlayViewModel@8b09.playMusicFromReport$1$1");
    }

    public static final void run$5(ARunnableS18S0400000_9 aRunnableS18S0400000_9) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDetailAddToDspTooltip@ef5c.show$1$1");
        try {
            aRunnableS18S0400000_9.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDetailAddToDspTooltip@ef5c.show$1$1");
    }

    public static final void run$6(ARunnableS18S0400000_9 aRunnableS18S0400000_9) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateInboxBannerViewHolder@e40d.addHighlightAndEllipsized$1");
        try {
            C637420OzM c637420OzM = (C637420OzM) aRunnableS18S0400000_9.l0;
            TuxTextView tuxTextView = (TuxTextView) aRunnableS18S0400000_9.l1;
            c637420OzM.I5(tuxTextView, (SpannableStringBuilder) aRunnableS18S0400000_9.l2, (C637060Oym) aRunnableS18S0400000_9.l3, tuxTextView.getWidth());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateInboxBannerViewHolder@e40d.addHighlightAndEllipsized$1");
    }

    public ARunnableS18S0400000_9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
