package Y;

import X.AbstractC1115080f7i;
import X.C01GW;
import X.C0IJT;
import X.C0T6Z;
import X.C1077740e9U;
import X.C1078210eAF;
import X.C1086750eO1;
import X.C1101370elb;
import X.C1109830ezF;
import X.C1110090ezf;
import X.C1115070f7h;
import X.C1135180fe8;
import X.C1136030ffV;
import X.C1138500fjU;
import X.C1138600fje;
import X.C1138940fkC;
import X.C1148280fzG;
import X.C1161920gLG;
import X.C13LP;
import X.C19748512Ol;
import X.C1C7U;
import X.C1CC2;
import X.C20430714wz;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2640010k;
import X.C360660ECa;
import X.C474500IjA;
import X.C786410Ut5;
import X.EnumC1083220eIK;
import X.EnumC1086740eO0;
import X.InterfaceC1085710eML;
import X.InterfaceC1115280f82;
import Y.AUListenerS224S0200000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBlocksUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupComplianceDialogUI;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS22S1100000_17 implements Runnable {
    public final int $t;
    public Object l1;
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
            case 14:
                run$14(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        ((C1086750eO1) this.l1).LLJJIJIL = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[TakeStageMarqueeDiag] delayed runnable uptime=");
        sbLIZ.append(SystemClock.uptimeMillis());
        sbLIZ.append(" -> doStartMarquee");
        C20441214yg.LJIIIZ("TakeStageMarquee", C2188811AlT.LIZIZ(sbLIZ));
        C1086750eO1 c1086750eO1 = (C1086750eO1) this.l1;
        if (c1086750eO1.LLJJ == EnumC1086740eO0.LL && c1086750eO1.getVisibility() == 0) {
            final C1086750eO1 c1086750eO12 = (C1086750eO1) this.l1;
            final String str = this.s0;
            c1086750eO12.setScrollX(c1086750eO12.LJJJJIZL());
            c1086750eO12.LLJJ = EnumC1086740eO0.LLILLJJLI;
            c1086750eO12.setPadding(c1086750eO12.LLJJJIL, c1086750eO12.getPaddingTop(), c1086750eO12.LLJJJJJIL, c1086750eO12.getPaddingBottom());
            c1086750eO12.setEllipsize(null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) c1086750eO12.LLJJL);
            spannableStringBuilder.append((CharSequence) str);
            c1086750eO12.setText(spannableStringBuilder);
            c1086750eO12.setScrollX(c1086750eO12.LJJJJIZL());
            C786410Ut5.y3(c1086750eO12.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0eNy
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    C786410Ut5.D3(c1086750eO12.getViewTreeObserver(), this);
                    C1086750eO1 c1086750eO13 = c1086750eO12;
                    if (c1086750eO13.LLJJ == EnumC1086740eO0.LLILLJJLI && c1086750eO13.getVisibility() == 0) {
                        TextPaint paint = c1086750eO12.getPaint();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str);
                        sbLIZ2.append(c1086750eO12.LLJJL);
                        int iCeil = (int) Math.ceil(paint.measureText(C2188811AlT.LIZIZ(sbLIZ2)));
                        if (iCeil < 1) {
                            iCeil = 1;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[TakeStageMarqueeDiag] onPreDraw scrollDistance=");
                        sbLIZ3.append(iCeil);
                        sbLIZ3.append(" viewW=");
                        sbLIZ3.append(c1086750eO12.getWidth());
                        sbLIZ3.append(" scrollX=");
                        sbLIZ3.append(c1086750eO12.getScrollX());
                        C20441214yg.LJIIIZ("TakeStageMarquee", C2188811AlT.LIZIZ(sbLIZ3));
                        final C1086750eO1 c1086750eO14 = c1086750eO12;
                        final String str2 = str;
                        c1086750eO14.setScrollX(c1086750eO14.LJJJJIZL());
                        int scrollX = c1086750eO14.getScrollX();
                        int i = C497740JfY.LJJ() ? scrollX - iCeil : scrollX + iCeil;
                        long j = (long) ((iCeil / c1086750eO14.LLJJJJLIIL) * 1000);
                        if (j < 1) {
                            j = 1;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("[TakeStageMarqueeDiag] startMarquee startX=");
                        sbLIZ4.append(scrollX);
                        sbLIZ4.append(" target=");
                        sbLIZ4.append(i);
                        sbLIZ4.append(" dist=");
                        sbLIZ4.append(iCeil);
                        sbLIZ4.append(" durationMs=");
                        sbLIZ4.append(j);
                        sbLIZ4.append(" speedPx=");
                        sbLIZ4.append(c1086750eO14.LLJJJJLIIL);
                        C20441214yg.LJIIIZ("TakeStageMarquee", C2188811AlT.LIZIZ(sbLIZ4));
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollX, i);
                        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfInt.setDuration(j);
                        valueAnimatorOfInt.addUpdateListener(new AUListenerS224S0200000_17(c1086750eO14, new C238400w2(), 2));
                        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: X.0eNz
                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                C20441214yg.LJIIIZ("TakeStageMarquee", "[TakeStageMarqueeDiag] onAnimationCancel");
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("[TakeStageMarqueeDiag] onAnimationEnd len=");
                                sbLIZ5.append(str2.length());
                                C20441214yg.LJIIIZ("TakeStageMarquee", C2188811AlT.LIZIZ(sbLIZ5));
                                C1086750eO1 c1086750eO15 = c1086750eO14;
                                c1086750eO15.LLJJ = EnumC1086740eO0.LLILLL;
                                c1086750eO15.setEllipsize(TextUtils.TruncateAt.END);
                                c1086750eO14.LJJJJI();
                                c1086750eO14.setText(str2);
                                C1086750eO1 c1086750eO16 = c1086750eO14;
                                c1086750eO16.setScrollX(c1086750eO16.LJJJJIZL());
                                c1086750eO14.LLJJI = null;
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                C20441214yg.LJIIIZ("TakeStageMarquee", "[TakeStageMarqueeDiag] onAnimationStart");
                            }
                        });
                        valueAnimatorOfInt.start();
                        c1086750eO14.LLJJI = valueAnimatorOfInt;
                    }
                    return true;
                }
            });
        }
    }

    public final void LIZ$2() {
        ResourceModel resourceModel;
        List<String> list;
        JSONObject jSONObject = new JSONObject();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_effect_msg_load_start");
        sbLIZ.append(this.s0);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c474500IjALIZ.LJJII(Integer.valueOf(((C1138500fjU) this.l1).LJII ? 1 : 0), "is_asset_local");
        c474500IjALIZ.LJJII(Integer.valueOf(((C1138500fjU) this.l1).LIZIZ ? 1 : 0), "is_own_send");
        AssetsModel assetsModel = ((C1138500fjU) this.l1).LIZ;
        Object objLJJJLL = null;
        c474500IjALIZ.LJJII(assetsModel != null ? Long.valueOf(assetsModel.id) : null, "asset_id");
        AssetsModel assetsModel2 = ((C1138500fjU) this.l1).LIZ;
        c474500IjALIZ.LJJII(assetsModel2 != null ? assetsModel2.getResourceFormat() : null, "resources_format");
        AssetsModel assetsModel3 = ((C1138500fjU) this.l1).LIZ;
        if (assetsModel3 != null && (resourceModel = assetsModel3.resourceByteVC1Model) != null && (list = resourceModel.urlList) != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        }
        c474500IjALIZ.LJJII(objLJJJLL, "resource_bytevc1_url");
        c474500IjALIZ.LJJII(Integer.valueOf(C2640010k.LIZIZ() ? 1 : 0), "is_anchor");
        c474500IjALIZ.LJJII(((C1138500fjU) this.l1).LIZLLL, "log_id");
        c474500IjALIZ.LJJII(((C1138500fjU) this.l1).LJ, "msg_id");
        c474500IjALIZ.LJJII(C1101370elb.LIZ.LJIIL(), "overload_score");
        C1135180fe8.LIZIZ(c474500IjALIZ);
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIZI(((C1138500fjU) this.l1).LJFF);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public final void LIZ$3() throws JSONException {
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap;
        List<String> list;
        ConcurrentHashMap<String, String> concurrentHashMap2;
        ConcurrentHashMap<String, String> concurrentHashMap3;
        JSONObject jSONObject = new JSONObject();
        C1138600fje c1138600fje = ((C1138940fkC) this.l1).LIZJ;
        int i = 0;
        JSONObject jSONObjectPut = jSONObject.put("effect_load_status", ((c1138600fje == null || !c1138600fje.LJFF) ? 0 : 1) ^ 1);
        C1138600fje c1138600fje2 = ((C1138940fkC) this.l1).LIZJ;
        JSONObject jSONObjectPut2 = jSONObjectPut.put("resource_downloaded", ((c1138600fje2 == null || !c1138600fje2.LJFF) ? 0 : 1) ^ 1);
        C1138600fje c1138600fje3 = ((C1138940fkC) this.l1).LIZJ;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("tray_position", c1138600fje3 != null ? c1138600fje3.LJ : 0);
        C1138600fje c1138600fje4 = ((C1138940fkC) this.l1).LIZJ;
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("res_type", c1138600fje4 != null ? Integer.valueOf(c1138600fje4.LJIILIIL) : null).put("is_anchor", C2640010k.LIZIZ() ? 1 : 0);
        C1138600fje c1138600fje5 = ((C1138940fkC) this.l1).LIZJ;
        JSONObject jSONObjectPut5 = jSONObjectPut4.put("is_own_send", (c1138600fje5 == null || !c1138600fje5.LIZLLL) ? 0 : 1).put("effect_id", ((C1138940fkC) this.l1).LIZIZ.LJFF).put("asset_id", ((C1138940fkC) this.l1).LIZIZ.LJFF).put("gift_id", ((C1138940fkC) this.l1).LIZIZ.LJIIL);
        C1138600fje c1138600fje6 = ((C1138940fkC) this.l1).LIZJ;
        if (c1138600fje6 == null || (str = c1138600fje6.LJIIL) == null) {
            str = "unknown";
        }
        JSONObject jSONObjectPut6 = jSONObjectPut5.put("resources_format", str);
        C1138600fje c1138600fje7 = ((C1138940fkC) this.l1).LIZJ;
        if (c1138600fje7 != null && c1138600fje7.LJFF) {
            i = 1;
        }
        C1135180fe8.LIZ(jSONObjectPut6.put("is_local", i ^ 1));
        C1138600fje c1138600fje8 = ((C1138940fkC) this.l1).LIZJ;
        if (c1138600fje8 != null && (concurrentHashMap3 = c1138600fje8.LJIIZILJ) != null) {
            for (Map.Entry<String, String> entry : concurrentHashMap3.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        C0T6Z c0t6z = ((C1138940fkC) this.l1).LIZIZ.LJIIZILJ;
        if (c0t6z != null) {
            for (Map.Entry<String, String> entry2 : c0t6z.entrySet()) {
                jSONObject.put(entry2.getKey(), entry2.getValue());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        C1138600fje c1138600fje9 = ((C1138940fkC) this.l1).LIZJ;
        JSONObject jSONObjectPut7 = jSONObject2.put("send_receive_im_dur", c1138600fje9 != null ? c1138600fje9.LJIIIIZZ : 0L);
        C1138600fje c1138600fje10 = ((C1138940fkC) this.l1).LIZJ;
        JSONObject jSONObjectPut8 = jSONObjectPut7.put("before_queue_dur", c1138600fje10 != null ? c1138600fje10.LJIIIZ : 0L);
        C1138600fje c1138600fje11 = ((C1138940fkC) this.l1).LIZJ;
        JSONObject jSONObjectPut9 = jSONObjectPut8.put("in_queue_dur", c1138600fje11 != null ? c1138600fje11.LJIIJ : 0L).put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue())).put("overload_score", C1101370elb.LIZ.LJIIL());
        C1138600fje c1138600fje12 = ((C1138940fkC) this.l1).LIZJ;
        if (c1138600fje12 != null) {
            C1136030ffV.LIZIZ(c1138600fje12, jSONObjectPut9);
        }
        for (Map.Entry<String, String> entry3 : ((C1138940fkC) this.l1).LIZIZ.LJIIZILJ.entrySet()) {
            jSONObjectPut9.put(entry3.getKey(), entry3.getValue());
        }
        C1138600fje c1138600fje13 = ((C1138940fkC) this.l1).LIZJ;
        if (c1138600fje13 != null && (concurrentHashMap2 = c1138600fje13.LJIIZILJ) != null) {
            for (Map.Entry<String, String> entry4 : concurrentHashMap2.entrySet()) {
                jSONObjectPut9.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject jSONObjectPut10 = new JSONObject().put("resource_url", C13LP.LJJJLL(((C1138940fkC) this.l1).LIZ.resourceModel.urlList));
        ResourceModel resourceModel = ((C1138940fkC) this.l1).LIZ.resourceByteVC1Model;
        JSONObject jSONObjectPut11 = jSONObjectPut10.put("resource_bytevc1_url", (resourceModel == null || (list = resourceModel.urlList) == null) ? null : C13LP.LJJJLL(list));
        C1138600fje c1138600fje14 = ((C1138940fkC) this.l1).LIZJ;
        JSONObject jSONObjectPut12 = jSONObjectPut11.put("log_id", c1138600fje14 != null ? c1138600fje14.LIZIZ : null);
        C1138600fje c1138600fje15 = ((C1138940fkC) this.l1).LIZJ;
        JSONObject jSONObjectPut13 = jSONObjectPut12.put("msg_id", c1138600fje15 != null ? Long.valueOf(c1138600fje15.LIZ) : null);
        for (Map.Entry<String, String> entry5 : ((C1138940fkC) this.l1).LIZIZ.LJIIZILJ.entrySet()) {
            jSONObjectPut13.put(entry5.getKey(), entry5.getValue());
        }
        C1138600fje c1138600fje16 = ((C1138940fkC) this.l1).LIZJ;
        if (c1138600fje16 != null && (concurrentHashMap = c1138600fje16.LJIIZILJ) != null) {
            for (Map.Entry<String, String> entry6 : concurrentHashMap.entrySet()) {
                jSONObjectPut13.put(entry6.getKey(), entry6.getValue());
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_render_start");
        sbLIZ.append(this.s0);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObjectPut13);
        c474500IjALIZ.LJJIIJZLJL(jSONObjectPut9);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("gift_render_start");
        sbLIZ2.append(this.s0);
        C1CC2.LJ(C2188811AlT.LIZIZ(sbLIZ2), jSONObject, jSONObjectPut9, jSONObjectPut13);
    }

    public final void LIZ$4() {
        List list = (List) ((LinkedHashMap) ((C1078210eAF) this.l1).LJIJ).get(this.s0);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start load ");
        sbLIZ.append(this.s0);
        C20441214yg.LJ("matao-test", C2188811AlT.LIZIZ(sbLIZ));
        String str = this.s0;
        if (Intrinsics.LJFF(str, ((C1078210eAF) this.l1).LJ)) {
            C1077740e9U c1077740e9U = (C1077740e9U) ((C1078210eAF) this.l1).LIZ;
            c1077740e9U.LIZJ.mT();
            c1077740e9U.LIZJ.jU();
        } else if (Intrinsics.LJFF(str, ((C1078210eAF) this.l1).LJFF)) {
            ((C1077740e9U) ((C1078210eAF) this.l1).LIZ).LIZJ.KT();
        } else if (Intrinsics.LJFF(str, ((C1078210eAF) this.l1).LJI)) {
            C1077740e9U c1077740e9U2 = (C1077740e9U) ((C1078210eAF) this.l1).LIZ;
            c1077740e9U2.LIZJ.IT();
            c1077740e9U2.LIZJ.qS();
        } else if (Intrinsics.LJFF(str, ((C1078210eAF) this.l1).LJII)) {
            AbsAudienceInteractionFragment absAudienceInteractionFragment = ((C1077740e9U) ((C1078210eAF) this.l1).LIZ).LIZJ;
            if (absAudienceInteractionFragment.LLJJI != null) {
                absAudienceInteractionFragment.LLJJI.load(R.id.h5d, new EndWidget());
            }
            DataChannelGlobal.LLILZ.JQ2(C1148280fzG.class, EnumC1083220eIK.IN_LIVE_ROOM);
            AbsAudienceInteractionFragment absAudienceInteractionFragment2 = ((C1077740e9U) ((C1078210eAF) this.l1).LIZ).LIZJ;
            absAudienceInteractionFragment2.kU(absAudienceInteractionFragment2.LLILLJJLI);
        }
        ((C1078210eAF) this.l1).LJ(this.s0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: Exception -> 0x010e, PHI: r9
      0x0079: PHI (r9v4 java.lang.String) = (r9v0 java.lang.String), (r9v5 java.lang.String) binds: [B:28:0x0077, B:26:0x0074] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x010e, blocks: (B:3:0x0004, B:4:0x0016, B:6:0x001c, B:10:0x0039, B:12:0x003d, B:13:0x003f, B:17:0x004c, B:19:0x0050, B:20:0x0056, B:23:0x0066, B:25:0x006a, B:29:0x0079, B:31:0x007d, B:35:0x0084, B:37:0x0088, B:40:0x008d, B:42:0x0093, B:43:0x0098, B:45:0x00a3, B:47:0x00a7, B:48:0x00ab, B:50:0x00b5, B:51:0x00b9, B:53:0x00bf, B:55:0x00dd, B:56:0x00f8), top: B:61:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[PHI: r9
      0x0081: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String), (r9v4 java.lang.String) binds: [B:28:0x0077, B:30:0x007b, B:32:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[Catch: Exception -> 0x010e, PHI: r1 r9
      0x0084: PHI (r1v12 java.lang.String) = (r1v8 java.lang.String), (r1v13 java.lang.String) binds: [B:34:0x0082, B:32:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r9v3 java.lang.String) = (r9v1 java.lang.String), (r9v4 java.lang.String) binds: [B:34:0x0082, B:32:0x007f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x010e, blocks: (B:3:0x0004, B:4:0x0016, B:6:0x001c, B:10:0x0039, B:12:0x003d, B:13:0x003f, B:17:0x004c, B:19:0x0050, B:20:0x0056, B:23:0x0066, B:25:0x006a, B:29:0x0079, B:31:0x007d, B:35:0x0084, B:37:0x0088, B:40:0x008d, B:42:0x0093, B:43:0x0098, B:45:0x00a3, B:47:0x00a7, B:48:0x00ab, B:50:0x00b5, B:51:0x00b9, B:53:0x00bf, B:55:0x00dd, B:56:0x00f8), top: B:61:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$5() {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS22S1100000_17.LIZ$5():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[Catch: Exception -> 0x010d, PHI: r1
      0x0085: PHI (r1v12 java.lang.String) = (r1v8 java.lang.String), (r1v13 java.lang.String) binds: [B:34:0x0083, B:32:0x0080] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x010d, blocks: (B:3:0x0002, B:7:0x000f, B:8:0x001f, B:10:0x0025, B:14:0x0042, B:16:0x0046, B:17:0x0048, B:21:0x0055, B:23:0x0059, B:24:0x005b, B:26:0x006b, B:27:0x0071, B:31:0x007e, B:35:0x0085, B:38:0x008a, B:40:0x0090, B:41:0x0095, B:43:0x00a0, B:45:0x00a4, B:46:0x00a8, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00dc, B:54:0x00f7), top: B:59:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$6() {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS22S1100000_17.LIZ$6():void");
    }

    public final void LIZ$7() {
        StringBuilder sb = new StringBuilder();
        String str = this.s0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                if (sb.length() > 0) {
                    sb.append("_");
                }
                sb.append(String.valueOf(cCharAt).toLowerCase(Locale.ROOT));
            } else {
                sb.append(cCharAt);
            }
        }
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, (IMessage) this.l1);
        C01GW c01gw = C20430714wz.LIZ;
        C20430714wz.LIZ(sb.toString(), new JSONObject(json));
    }

    public final void LIZ$0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGlobalLayout. width=");
        sbLIZ.append(((C1086750eO1) this.l1).getWidth());
        sbLIZ.append(", visibility=");
        sbLIZ.append(((C1086750eO1) this.l1).getVisibility());
        sbLIZ.append(", invoke ");
        sbLIZ.append(this.s0);
        C20441214yg.LIZIZ("TakeStageMarquee", C2188811AlT.LIZIZ(sbLIZ));
        ((C1086750eO1) this.l1).LJJJJL();
    }

    public static final void run$0(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("ChatPinViewHolder@1571.onBind$1");
        try {
            C1109830ezF c1109830ezF = (C1109830ezF) aRunnableS22S1100000_17.l1;
            C1110090ezf.LIZIZ(c1109830ezF.LLJLIL, c1109830ezF.LLJJIJIL, aRunnableS22S1100000_17.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChatPinViewHolder@1571.onBind$1");
    }

    public static final void run$1(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("ChatPinViewHolder@1571.updatePinStatus$1");
        try {
            C1109830ezF c1109830ezF = (C1109830ezF) aRunnableS22S1100000_17.l1;
            C1110090ezf.LIZIZ(c1109830ezF.LLJLIL, c1109830ezF.LLJJIJIL, aRunnableS22S1100000_17.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChatPinViewHolder@1571.updatePinStatus$1");
    }

    public static final void run$10(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveTTMStrategyManager@cf1c.asyncRegisterSceneWithSceneKey$1$1");
        try {
            aRunnableS22S1100000_17.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveTTMStrategyManager@cf1c.asyncRegisterSceneWithSceneKey$1$1");
    }

    public static final void run$11(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveTTMStrategyManager@cf1c.launchLiveStrategies$1$1");
        try {
            aRunnableS22S1100000_17.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveTTMStrategyManager@cf1c.launchLiveStrategies$1$1");
    }

    public static final void run$12(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("UniversalPopupBlocksUI@db40.dismissBottomSheetOrDialog$1");
        try {
            InterfaceC1085710eML interfaceC1085710eML = ((UniversalPopupBlocksUI) aRunnableS22S1100000_17.l1).LLILLL;
            if (interfaceC1085710eML != null) {
                interfaceC1085710eML.mj2(aRunnableS22S1100000_17.s0, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UniversalPopupBlocksUI@db40.dismissBottomSheetOrDialog$1");
    }

    public static final void run$13(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("UniversalPopupComplianceDialogUI@fc36.dismissDialog$1");
        try {
            InterfaceC1085710eML interfaceC1085710eML = ((UniversalPopupComplianceDialogUI) aRunnableS22S1100000_17.l1).LLILLL;
            if (interfaceC1085710eML != null) {
                interfaceC1085710eML.mj2(aRunnableS22S1100000_17.s0, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UniversalPopupComplianceDialogUI@fc36.dismissDialog$1");
    }

    public static final void run$14(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveTriggerIMMsgListener@cdb0.onMessage$1");
        try {
            aRunnableS22S1100000_17.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveTriggerIMMsgListener@cdb0.onMessage$1");
    }

    public static final void run$2(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("TakeStageMarqueeTextView@c5d1.scheduleTryStartMarquee$1$onGlobalLayout$1");
        try {
            aRunnableS22S1100000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakeStageMarqueeTextView@c5d1.scheduleTryStartMarquee$1$onGlobalLayout$1");
    }

    public static final void run$3(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("TakeStageMarqueeTextView@c5d1.tryStartMarquee$1");
        try {
            aRunnableS22S1100000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakeStageMarqueeTextView@c5d1.tryStartMarquee$1");
    }

    public static final void run$4(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        int iIndexOf;
        final LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) aRunnableS22S1100000_17.l1;
        String str = aRunnableS22S1100000_17.s0;
        liveEmojiInputDialogFragment.getClass();
        C1C7U.LIZ("LiveEmojiInputDialogFragment@b667.initInputPanelViews$1L");
        if (liveEmojiInputDialogFragment.LLJ) {
            C1C7U.LIZIZ("LiveEmojiInputDialogFragment@b667.initInputPanelViews$1L");
            return;
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context() == null) {
            C1C7U.LIZIZ("LiveEmojiInputDialogFragment@b667.initInputPanelViews$1L");
            return;
        }
        if (liveEmojiInputDialogFragment.getContext() == null) {
            C1C7U.LIZIZ("LiveEmojiInputDialogFragment@b667.initInputPanelViews$1L");
            return;
        }
        liveEmojiInputDialogFragment.LLLFFI.setAdapter(new C1115070f7h(liveEmojiInputDialogFragment.LLLLIILL));
        liveEmojiInputDialogFragment.LLLFFI.addOnPageChangeListener(new C360660ECa() { // from class: X.0f7u
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                if (i == 1) {
                    liveEmojiInputDialogFragment.LLLLLLJ = Boolean.TRUE;
                }
            }

            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                liveEmojiInputDialogFragment.cS(i, "comment_panel");
            }
        });
        AbstractC1115080f7i abstractC1115080f7i = liveEmojiInputDialogFragment.LLLFZ;
        if (abstractC1115080f7i == null || (iIndexOf = ((ArrayList) liveEmojiInputDialogFragment.LLLLIILL).indexOf(abstractC1115080f7i)) == -1) {
            iIndexOf = 0;
        }
        liveEmojiInputDialogFragment.LLLFFI.setCurrentItem(iIndexOf, false);
        liveEmojiInputDialogFragment.cS(iIndexOf, str);
        liveEmojiInputDialogFragment.LLJ = true;
        InterfaceC1115280f82 interfaceC1115280f82 = liveEmojiInputDialogFragment.LLLLIL;
        if (interfaceC1115280f82 != null) {
            interfaceC1115280f82.LIZ();
        } else if (liveEmojiInputDialogFragment.LLLILZLLLI) {
            liveEmojiInputDialogFragment.UR(new EmoteModel());
        }
        C1C7U.LIZIZ("LiveEmojiInputDialogFragment@b667.initInputPanelViews$1L");
    }

    public static final void run$5(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftEffectMsgLoadMonitor@e584.startDownloadInternal$1");
        try {
            aRunnableS22S1100000_17.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftEffectMsgLoadMonitor@e584.startDownloadInternal$1");
    }

    public static final void run$6(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("SpecialGiftEffectPlayMonitor@5694.reportRenderStartInternal$1");
        try {
            aRunnableS22S1100000_17.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecialGiftEffectPlayMonitor@5694.reportRenderStartInternal$1");
    }

    public static final void run$7(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("WidgetsLoadProvider@f1bb.executeWidgetLoadTask$1");
        try {
            C1078210eAF.LIZJ((C1078210eAF) aRunnableS22S1100000_17.l1, aRunnableS22S1100000_17.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WidgetsLoadProvider@f1bb.executeWidgetLoadTask$1");
    }

    public static final void run$8(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        boolean zLIZ;
        C1C7U.LIZ("WidgetsLoadProvider@f1bb.loadWidgetsByPriority$task$1");
        try {
            aRunnableS22S1100000_17.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WidgetsLoadProvider@f1bb.loadWidgetsByPriority$task$1");
    }

    public static final void run$9(ARunnableS22S1100000_17 aRunnableS22S1100000_17) {
        CommentWidget commentWidget = (CommentWidget) aRunnableS22S1100000_17.l1;
        String str = aRunnableS22S1100000_17.s0;
        commentWidget.getClass();
        C1C7U.LIZ("CommentWidget@f00c.showRethinkVtsDialog$1L");
        commentWidget.I1(str);
        commentWidget.c2("livesdk_comment_rethink_cg_click");
        C1C7U.LIZIZ("CommentWidget@f00c.showRethinkVtsDialog$1L");
    }

    public ARunnableS22S1100000_17(UniversalPopupBlocksUI universalPopupBlocksUI, int i) {
        this.$t = i;
        this.l1 = universalPopupBlocksUI;
        this.s0 = "close_button";
    }

    public ARunnableS22S1100000_17(UniversalPopupComplianceDialogUI universalPopupComplianceDialogUI, int i) {
        this.$t = i;
        this.l1 = universalPopupComplianceDialogUI;
        this.s0 = "close_button";
    }

    public ARunnableS22S1100000_17(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
