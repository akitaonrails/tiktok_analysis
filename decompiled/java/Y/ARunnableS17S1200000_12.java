package Y;

import X.C0BL0;
import X.C0T6Q;
import X.C0TJB;
import X.C0TK8;
import X.C0TKB;
import X.C0UC4;
import X.C0UG4;
import X.C0UG5;
import X.C0UIO;
import X.C10H5;
import X.C10SV;
import X.C1124870fNV;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C1248210iaR;
import X.C1254890ilD;
import X.C1276840jKc;
import X.C1303280k1G;
import X.C1389890mGx;
import X.C13LP;
import X.C158B;
import X.C1701940uOG;
import X.C19249910Sr;
import X.C19748512Ol;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2273311DyT;
import X.C2344009Gk;
import X.C2487409ou;
import X.C423100GiS;
import X.C768430UCj;
import X.C772350URl;
import X.C772400URq;
import X.C772410URr;
import X.C786410Ut5;
import X.C807840VmY;
import X.EnumC1253850ijX;
import X.EnumC742790TBt;
import X.InterfaceC1268640j7O;
import X.InterfaceC769000UEo;
import X.InterfaceC769900UIa;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragment;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragmentV2;
import com.bytedance.android.livesdk.gift.model.CrossScreenSeiInfo;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectMessageSwitch;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS17S1200000_12 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ((C1254890ilD) this.l1).LIZLLL();
        if (this.s0.length() == 0) {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) this.l2);
            c1389890mGx.LJIIIZ(R.string.shz);
            c1389890mGx.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx((Activity) this.l2);
            c1389890mGx2.LJIIJ(this.s0);
            c1389890mGx2.LJIIJJI();
        }
        if (((C1254890ilD) this.l1).LLILLL) {
            C1248210iaR.LJ("ImageBackgroundHandler", "Finishing activity after commit error", EnumC1253850ijX.OTHERS, "");
            C2487409ou.LIZLLL(3000L, new ARunnableS112S0100000_12((Activity) this.l2, 18));
        }
    }

    public final void LIZ$1() {
        String str;
        JSONObject jSONObject;
        Locale localeCurrentLocale;
        String strLIZ;
        InterfaceC769000UEo interfaceC769000UEoBaseComposerManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).baseComposerManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_v2_EffectMonitor#gift_");
        sbLIZ.append(((C0UIO) this.l1).LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startPlayStickerGift addCurrentSticker, panel=");
        sbLIZ2.append(this.s0);
        sbLIZ2.append(", baseComposer=");
        sbLIZ2.append(interfaceC769000UEoBaseComposerManager.hashCode());
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        str = "";
        if (Intrinsics.LJFF(this.s0, "effect_gift_game")) {
            LiveEffect liveEffect = (LiveEffect) this.l2;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                for (String str2 : liveEffect.LLL()) {
                    JSONObject jSONObjectPut = new JSONObject().put("key", str2);
                    C1124870fNV.LIZJ().getClass();
                    String strLIZIZ2 = C1124870fNV.LIZIZ(str2);
                    if (strLIZIZ2 == null) {
                        strLIZIZ2 = "";
                    }
                    jSONArray.put(jSONObjectPut.put("value", strLIZIZ2));
                }
                jSONObject2.put("translations", jSONArray);
                jSONObject2.put("s_userName", liveEffect.LLLI());
                jSONObject2.put("sender_id", String.valueOf(liveEffect.getFromUserId()));
                jSONObject2.put("gift_id", liveEffect.getGiftId());
                jSONObject2.put("gameplay_id", String.valueOf(liveEffect.LLLFF()));
                jSONObject2.put("msg_id", String.valueOf(liveEffect.getMsgId()));
                IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                if (iHostAppContext != null && (localeCurrentLocale = iHostAppContext.currentLocale()) != null && (strLIZ = C2273311DyT.LIZ(localeCurrentLocale)) != null) {
                    str = strLIZ;
                }
                jSONObject2.put("language", str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("buildArenaGiftParamsJsonString Exception: ");
                sbLIZ3.append(e.getMessage());
                C20441214yg.LJ("gift_sticker", C2188811AlT.LIZIZ(sbLIZ3));
            }
            String strJ3 = C786410Ut5.J3(jSONObject2);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("gift_sticker_v2_EffectMonitor#gift_");
            sbLIZ4.append(((C0UIO) this.l1).LIZ);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Arena gift params ");
            sbLIZ5.append(strJ3);
            C20441214yg.LJIIIZ(strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ5));
            interfaceC769000UEoBaseComposerManager.setRenderCacheString("tt_arena_gift_params", strJ3);
        } else if (Intrinsics.LJFF("effect_gift_music", this.s0)) {
            String str3 = (String) C13LP.LJJJLZIJ(0, ((LiveEffect) this.l2).LLLII());
            interfaceC769000UEoBaseComposerManager.setRenderCacheString("music_res_dir", str3 != null ? str3 : "");
        } else {
            interfaceC769000UEoBaseComposerManager.setRenderCacheString("tt_sticker_gift_multilingual_param", ((LiveEffect) this.l2).LLILZIL());
            interfaceC769000UEoBaseComposerManager.setRenderCacheString("LiveLayout", ((LiveEffect) this.l2).LLJJL());
        }
        boolean z = ((C0UIO) this.l1).LIZIZ;
        LiveEffect liveEffect2 = (LiveEffect) this.l2;
        String str4 = this.s0;
        if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectMessageHandler() != null) {
            if (LiveEffectMessageSwitch.INSTANCE.enable()) {
                C1276840jKc.LIZ.getClass();
                C1276840jKc.LJJIIZ.clear();
            }
            C0UC4 c0uc4 = C0UC4.LIZ;
            C0UC4.LJJII(liveEffect2, str4, z);
        }
        LiveEffect liveEffect3 = (LiveEffect) this.l2;
        boolean z2 = ((C0UIO) this.l1).LIZIZ;
        String str5 = this.s0;
        if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectMessageHandler() != null) {
            C768430UCj.LJ(liveEffect3, 0L, z2, str5);
        }
        InterfaceC769900UIa stickerEffectListener = GiftService.LLILLJJLI.getStickerEffectListener();
        if (stickerEffectListener != null) {
            stickerEffectListener.LJJIJIIJI(this.s0);
        }
        boolean zLLLF = ((LiveEffect) this.l2).LLLF();
        if (zLLLF) {
            InterfaceC1268640j7O interfaceC1268640j7O = ((C0UIO) this.l1).LIZLLL;
            LiveEffect liveEffect4 = (LiveEffect) this.l2;
            if (interfaceC1268640j7O == null || liveEffect4 == null) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("sendReplayShowGiftEffectMsg, filterManager = ");
                sbLIZ6.append(interfaceC1268640j7O);
                sbLIZ6.append(", liveEffect=");
                sbLIZ6.append(liveEffect4);
                C20441214yg.LJ("StickerGiftEffectSDKHelper", C2188811AlT.LIZIZ(sbLIZ6));
            } else {
                try {
                    n nVar = new n();
                    nVar.LJJIIJ("effect_id", String.valueOf(liveEffect4.getEffectId()));
                    nVar.LJJIIJ("path", liveEffect4.getFilePath());
                    nVar.LJJIIJ("msg_id", String.valueOf(liveEffect4.getMsgId()));
                    int iSendEffectMsg = interfaceC1268640j7O.sendEffectMsg(57, 3, 2, nVar.toString());
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("sendReplayShowGiftEffectMsg, commonArg=");
                    sbLIZ7.append(nVar);
                    sbLIZ7.append(", result=");
                    sbLIZ7.append(iSendEffectMsg);
                    C20441214yg.LIZIZ("StickerGiftEffectSDKHelper", C2188811AlT.LIZIZ(sbLIZ7));
                } catch (IllegalStateException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        } else {
            interfaceC769000UEoBaseComposerManager.kr((LiveEffect) this.l2, this.s0);
            if (((C0UIO) this.l1).LIZJ != null) {
                JSONObject jSONObject3 = new JSONObject();
                CrossScreenSeiInfo crossScreenSeiInfo = new CrossScreenSeiInfo(((LiveEffect) this.l2).LLILLJJLI(), ((LiveEffect) this.l2).getGiftId(), ((LiveEffect) this.l2).getPrice(), ((LiveEffect) this.l2).getDuration(), ((LiveEffect) this.l2).LLIIIZ(), ((LiveEffect) this.l2).LJJIIJ(), ((LiveEffect) this.l2).getRepeatCount(), ((LiveEffect) this.l2).getFromUserId(), C158B.LIZ());
                try {
                    jSONObject = new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, crossScreenSeiInfo));
                } catch (JSONException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    jSONObject = jSONObject3;
                }
                if (((LiveEffect) this.l2).LJJLIIJ()) {
                    C11NZ.LJJJJLL(0L, 3L, 0L, 100L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS148S0200000_12((C0UIO) this.l1, jSONObject, 35));
                    GiftService.LLILLJJLI.reportCrossScreenSeiWrite(crossScreenSeiInfo, ((LiveEffect) this.l2).getEffectId(), ((LiveEffect) this.l2).LJJIJ());
                }
            }
        }
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("gift_sticker_v2_");
        sbLIZ8.append(((C0UIO) this.l1).LIZ);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ8);
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("use original channel render, panel = ");
        sbLIZ9.append(this.s0);
        sbLIZ9.append(", enableReplay = ");
        sbLIZ9.append(zLLLF);
        C20441214yg.LJIIIZ(strLIZIZ4, C2188811AlT.LIZIZ(sbLIZ9));
    }

    public final void LIZ$2() {
        C786410Ut5.LJLLLLLL(8, (View) this.l1);
        C1303280k1G c1303280k1G = ((C0TJB) this.l2).LJIJJ;
        if (c1303280k1G != null) {
            c1303280k1G.cancelAnimation();
        }
        C0TJB c0tjb = (C0TJB) this.l2;
        c0tjb.LJIJJ = null;
        C423100GiS c423100GiS = c0tjb.LJIJJLI;
        if (c423100GiS != null) {
            c423100GiS.LIZ();
        }
        C0TJB c0tjb2 = (C0TJB) this.l2;
        c0tjb2.LJIJJLI = null;
        EnumC742790TBt enumC742790TBt = c0tjb2.LJFF;
        if (enumC742790TBt != EnumC742790TBt.SWIPE_UP_GUIDE) {
            if (enumC742790TBt == EnumC742790TBt.NOT_INTERESTED_TUTORIAL) {
                c0tjb2.LJI.LJIIIIZZ(false);
                return;
            }
            return;
        }
        c0tjb2.LJI.LJIIJ(false);
        String str = ((C0TJB) this.l2).LJIIIZ.LJIIJ() ? "swipe_up_dot_gesture" : "swipe_up_phone_gesture";
        C10H5 c10h5 = C10H5.NEW_USER_GUIDE_DISAPPEAR;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("exit_method", this.s0);
        c2344009Gk.LJIIIIZZ("ui_type", str);
        C0TJB c0tjb3 = (C0TJB) this.l2;
        if (((Boolean) C0BL0.LIZ.getValue()).booleanValue()) {
            c2344009Gk.LJFF("gid", c0tjb3.LJIJI);
        }
        c2344009Gk.LIZLLL(((C0TJB) this.l2).LJIIZILJ, "duration");
        C19249910Sr.LIZIZ.LIZJ(c2344009Gk);
        Map<String, String> map = c2344009Gk.LIZ;
        C807840VmY.LIZ(map);
        C10SV.LIZIZ(c10h5, map);
    }

    public final void LIZ$3() {
        SharedPreferences.Editor editorEdit = C0T6Q.LIZJ((Context) this.l1, this.s0).edit();
        editorEdit.clear().apply();
        for (String str : ((Map) this.l2).keySet()) {
            editorEdit.putString(str, (String) ((Map) this.l2).get(str));
        }
        editorEdit.apply();
    }

    public static final void run$0(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("ImageBackgroundHandler@94e8.handleCommitError$1");
        try {
            aRunnableS17S1200000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageBackgroundHandler@94e8.handleCommitError$1");
    }

    public static final void run$1(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameCastWiredFragment@4f72.loading$1$2");
        try {
            ((GameCastWiredFragment) aRunnableS17S1200000_12.l1).PR(2, (View) aRunnableS17S1200000_12.l2, aRunnableS17S1200000_12.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameCastWiredFragment@4f72.loading$1$2");
    }

    public static final void run$10(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        int iLJI;
        C772400URq c772400URq = (C772400URq) aRunnableS17S1200000_12.l1;
        C772410URr c772410URr = (C772410URr) aRunnableS17S1200000_12.l2;
        String str = aRunnableS17S1200000_12.s0;
        c772400URq.getClass();
        C1C7U.LIZ("BroadcastRoomManager@c275.createRoomInternal$4L");
        synchronized (C772350URl.LIZ) {
            iLJI = C772350URl.LIZIZ.LJI();
        }
        c772400URq.LIZIZ(c772410URr, str, iLJI);
        C1C7U.LIZIZ("BroadcastRoomManager@c275.createRoomInternal$4L");
    }

    public static final void run$11(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LottieGuide@52eb.dismiss$1$1");
        try {
            aRunnableS17S1200000_12.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LottieGuide@52eb.dismiss$1$1");
    }

    public static final void run$12(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("CacheRepository@34a7.replaceAllString$1");
        try {
            aRunnableS17S1200000_12.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CacheRepository@34a7.replaceAllString$1");
    }

    public static final void run$13(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("ExperimentCache@e1ae.getValue$3");
        try {
            ((C0TK8) aRunnableS17S1200000_12.l2).LJII.LIZIZ(aRunnableS17S1200000_12.s0, (C0TKB) aRunnableS17S1200000_12.l1, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExperimentCache@e1ae.getValue$3");
    }

    public static final void run$2(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameCastWiredFragment@4f72.loading$1$3");
        try {
            ((GameCastWiredFragment) aRunnableS17S1200000_12.l1).PR(0, (View) aRunnableS17S1200000_12.l2, aRunnableS17S1200000_12.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameCastWiredFragment@4f72.loading$1$3");
    }

    public static final void run$3(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameCastWiredFragmentV2@456d.loading$1$1");
        try {
            ((GameCastWiredFragmentV2) aRunnableS17S1200000_12.l1).PR(1, (View) aRunnableS17S1200000_12.l2, aRunnableS17S1200000_12.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameCastWiredFragmentV2@456d.loading$1$1");
    }

    public static final void run$4(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameCastWiredFragmentV2@456d.loading$1$2");
        try {
            ((GameCastWiredFragmentV2) aRunnableS17S1200000_12.l1).PR(2, (View) aRunnableS17S1200000_12.l2, aRunnableS17S1200000_12.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameCastWiredFragmentV2@456d.loading$1$2");
    }

    public static final void run$5(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameCastWiredFragmentV2@456d.loading$1$3");
        try {
            ((GameCastWiredFragmentV2) aRunnableS17S1200000_12.l1).PR(0, (View) aRunnableS17S1200000_12.l2, aRunnableS17S1200000_12.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameCastWiredFragmentV2@456d.loading$1$3");
    }

    public static final void run$6(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameCastWiredFragment@4f72.loading$1$1");
        try {
            ((GameCastWiredFragment) aRunnableS17S1200000_12.l1).PR(1, (View) aRunnableS17S1200000_12.l2, aRunnableS17S1200000_12.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameCastWiredFragment@4f72.loading$1$1");
    }

    public static final void run$7(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("StickerGiftEffectComposerImpl@71e0.startPlayStickerGift$cont$1");
        try {
            aRunnableS17S1200000_12.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerGiftEffectComposerImpl@71e0.startPlayStickerGift$cont$1");
    }

    public static final void run$8(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveComposerManagerB@e202.addCurrentSticker$1");
        try {
            ((C0UG4) aRunnableS17S1200000_12.l1).LJJJJ(aRunnableS17S1200000_12.s0, (LiveEffect) aRunnableS17S1200000_12.l2, true, true, Long.valueOf(System.currentTimeMillis()));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveComposerManagerB@e202.addCurrentSticker$1");
    }

    public static final void run$9(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveComposerManagerOPT@a709.addCurrentSticker$1");
        try {
            ((C0UG5) aRunnableS17S1200000_12.l1).LJJJJI(aRunnableS17S1200000_12.s0, (LiveEffect) aRunnableS17S1200000_12.l2, true, true, Long.valueOf(System.currentTimeMillis()));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveComposerManagerOPT@a709.addCurrentSticker$1");
    }

    public ARunnableS17S1200000_12(Context context, Map map, int i) {
        this.$t = i;
        this.l1 = context;
        this.s0 = "SP_EXPERIMENT_EXPOSURE_CACHE";
        this.l2 = map;
    }

    public ARunnableS17S1200000_12(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
