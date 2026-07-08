package Y;

import X.AbstractC1100450ek7;
import X.AbstractC1113400f50;
import X.AbstractC1117310fBJ;
import X.AbstractC1140540fmm;
import X.AbstractC1140580fmq;
import X.AnimationAnimationListenerC1151570g4Z;
import X.C013C;
import X.C0GY9;
import X.C0IJT;
import X.C1077600e9G;
import X.C1077660e9M;
import X.C1085670eMH;
import X.C1086520eNe;
import X.C1088660eR6;
import X.C1088730eRD;
import X.C1088810eRL;
import X.C1091850eWF;
import X.C1094360eaI;
import X.C1095930ecp;
import X.C1106110etF;
import X.C1109770ez9;
import X.C1111930f2d;
import X.C1113410f51;
import X.C1113520f5C;
import X.C1113540f5E;
import X.C1113800f5e;
import X.C1115580f8W;
import X.C1115590f8X;
import X.C1117710fBx;
import X.C1118060fCW;
import X.C1123880fLu;
import X.C1123980fM4;
import X.C1127390fRZ;
import X.C1127440fRe;
import X.C1127920fSQ;
import X.C1128710fTh;
import X.C1133350fbB;
import X.C1133360fbC;
import X.C1136560fgM;
import X.C1139230fkf;
import X.C1139250fkh;
import X.C1139310fkn;
import X.C1139530fl9;
import X.C1139540flA;
import X.C1139550flB;
import X.C1139580flE;
import X.C1139900flk;
import X.C1140310fmP;
import X.C1142700fqG;
import X.C1144580ftI;
import X.C1146260fw0;
import X.C1148670fzt;
import X.C1149560g1K;
import X.C1149580g1M;
import X.C1161920gLG;
import X.C118300cf;
import X.C12DM;
import X.C12ES;
import X.C1324570kZb;
import X.C1324720kZq;
import X.C1558520qew;
import X.C16F5;
import X.C176600m4;
import X.C1AHS;
import X.C1AHV;
import X.C1AHW;
import X.C1C7U;
import X.C20441214yg;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C226800uA;
import X.C2436109gd;
import X.C443120HZe;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C770580UKq;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C924810aAp;
import X.C973890bRz;
import X.C974450bSt;
import X.EnumC1083260eIO;
import X.EnumC1088820eRM;
import X.EnumC1120860fH2;
import X.EnumC1139760flW;
import X.EnumC919170a1j;
import X.InterfaceC1077630e9J;
import X.InterfaceC1086510eNd;
import X.InterfaceC1088670eR7;
import X.InterfaceC1103130eoR;
import X.InterfaceC1112050f2p;
import X.InterfaceC1112060f2q;
import X.InterfaceC1124060fMC;
import X.InterfaceC1142720fqI;
import X.InterfaceC1142750fqL;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS86S0200000_17;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractUnifiedStateChangeChannel;
import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchEvent;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.IHammerAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.MatchItemEnterAnimAssem;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.setting.LiveMinusOneScreenTipsEventOptSetting;
import com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedSetting;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorClusterSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMinuteGameWaitingTimeoutMsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.creator_succ.ActionButton;
import tikcast.api.creator_succ.UserParam;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS50S0300000_17 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        RecyclerView.ViewHolder childViewHolder = ((C1086520eNe) this.l0).getChildViewHolder((View) this.l1);
        if (childViewHolder != 0 && (childViewHolder instanceof InterfaceC1086510eNd)) {
            C1085670eMH c1085670eMH = (C1085670eMH) this.l2;
            View view = (View) this.l1;
            c1085670eMH.getClass();
            Object tag = view.getTag(R.id.hh2);
            Float f = tag instanceof Float ? (Float) tag : null;
            float fFloatValue = f != null ? f.floatValue() : -1.0f;
            InterfaceC1086510eNd interfaceC1086510eNd = (InterfaceC1086510eNd) childViewHolder;
            if (fFloatValue >= interfaceC1086510eNd.z4()) {
                return;
            }
            C1085670eMH c1085670eMH2 = (C1085670eMH) this.l2;
            View view2 = (View) this.l1;
            childViewHolder.getLayoutPosition();
            c1085670eMH2.getClass();
            float fLIZ = C1085670eMH.LIZ(view2);
            if (fLIZ >= interfaceC1086510eNd.z4()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1085670eMH c1085670eMH3 = (C1085670eMH) this.l2;
                View view3 = (View) this.l1;
                c1085670eMH3.getClass();
                view3.setTag(R.id.hh3, Long.valueOf(jCurrentTimeMillis));
                C1085670eMH c1085670eMH4 = (C1085670eMH) this.l2;
                View view4 = (View) this.l1;
                float fMax = Math.max(fFloatValue, fLIZ);
                c1085670eMH4.getClass();
                C1085670eMH.LIZIZ(view4, fMax);
                interfaceC1086510eNd.b1();
                ((C1085670eMH) this.l2).LIZ.remove((View) this.l1);
                C1085670eMH c1085670eMH5 = (C1085670eMH) this.l2;
                View view5 = (View) this.l1;
                c1085670eMH5.getClass();
                C1085670eMH.LIZIZ(view5, -1.0f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0fqW] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.InputStream, java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l2
            X.0fqe r0 = (X.C1142940fqe) r0
            java.lang.Object r1 = r6.l0
            X.0fqZ r1 = (X.C1142890fqZ) r1
            java.lang.Object r5 = r6.l1
            X.0fqc r5 = (X.InterfaceC1142920fqc) r5
            r0.getClass()
            r0 = 5
            r4 = 0
            java.net.HttpURLConnection r3 = X.C1142940fqe.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L37
            java.io.InputStream r4 = r3.getInputStream()     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L5d
            java.lang.String r1 = "Content-Length"
            r0 = -1
            int r0 = r3.getHeaderFieldInt(r1, r0)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L5d
            long r1 = (long) r0     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L5d
            r0 = r5
            X.0fqW r0 = (X.C1142860fqW) r0     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L5d
            r0.LIZIZ(r4, r1)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L5d
            if (r4 == 0) goto L59
            r4.close()     // Catch: java.io.IOException -> L2d
            goto L59
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L59
        L32:
            r1 = move-exception
            goto L39
        L34:
            r1 = move-exception
            r3 = r4
            goto L5e
        L37:
            r1 = move-exception
            r3 = r4
        L39:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r1 instanceof X.C1142930fqd     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L4b
            r0 = r1
            X.0fqd r0 = (X.C1142930fqd) r0     // Catch: java.lang.Throwable -> L5d
            int r0 = r0.LL     // Catch: java.lang.Throwable -> L5d
        L45:
            X.0fqW r5 = (X.C1142860fqW) r5     // Catch: java.lang.Throwable -> L5d
            r5.LIZ(r0, r1)     // Catch: java.lang.Throwable -> L5d
            goto L4d
        L4b:
            r0 = 0
            goto L45
        L4d:
            if (r4 == 0) goto L57
            r4.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L57:
            if (r3 == 0) goto L5c
        L59:
            r3.disconnect()
        L5c:
            return
        L5d:
            r1 = move-exception
        L5e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L6b
            r4.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6b:
            if (r3 == 0) goto L70
            r3.disconnect()
        L70:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS50S0300000_17.LIZ$1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$11() {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS50S0300000_17.LIZ$11():void");
    }

    public final void LIZ$12() {
        C1139550flB c1139550flB = ((C1139540flA) this.l0).LLJILJIL;
        C1136560fgM c1136560fgM = (C1136560fgM) this.l1;
        if (c1139550flB.LIZIZ != EnumC1139760flW.IDLE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRenderStart ignored, state=");
            sbLIZ.append(c1139550flB.LIZIZ);
            C1139550flB.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            c1139550flB.LIZJ = c1136560fgM;
            c1139550flB.LJII(EnumC1139760flW.WAITING, "onRenderStart()", c1136560fgM);
            C786410Ut5.LJLIIL(LiveGiftMinuteGameWaitingTimeoutMsSetting.INSTANCE.getValue(), c1139550flB.LJIIIIZZ, c1139550flB.LJIIIZ);
        }
        ((C1139540flA) this.l0).LJIILL((C1136560fgM) this.l1, (AssetsModel) this.l2, null);
    }

    public final void LIZ$13() {
        Context context;
        FragmentManager topFragmentManager = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopFragmentManager();
        ((AbstractC1117310fBJ) this.l0).getClass();
        Fragment fragmentLJ = AbstractC1117310fBJ.LJ(topFragmentManager);
        if (fragmentLJ == null || (context = fragmentLJ.getContext()) == null) {
            ((AbstractC1117310fBJ) this.l0).LIZJ(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity(), (C2436109gd) this.l1, (Map) this.l2);
        } else {
            ((AbstractC1117310fBJ) this.l0).LIZJ(context, (C2436109gd) this.l1, (Map) this.l2);
        }
    }

    public final void LIZ$14() {
        String str;
        UserParam userParam;
        User user;
        C226800uA c226800uA = ((C1113540f5E) this.l0).LLILLJJLI;
        C226800uA c226800uA2 = (C226800uA) this.l1;
        if (c226800uA != c226800uA2 || c226800uA2.LJJIIJZLJL) {
            return;
        }
        DataChannel dataChannel = ((C1109770ez9) this.l2).LJIIIZ;
        EnumC1083260eIO enumC1083260eIO = dataChannel != null ? (EnumC1083260eIO) dataChannel.gg0(LiveExtendedScreenStatus.class) : null;
        if (LiveMinusOneScreenTipsEventOptSetting.INSTANCE.getValue()) {
            if (enumC1083260eIO != EnumC1083260eIO.SHOW) {
                C1113540f5E c1113540f5E = (C1113540f5E) this.l0;
                C1109770ez9 c1109770ez9 = (C1109770ez9) this.l2;
                C226800uA c226800uA3 = (C226800uA) this.l1;
                c1113540f5E.getClass();
                if (c226800uA3.LJJIIJZLJL) {
                    return;
                }
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c1113540f5E.itemView, new ARunnableS50S0300000_17(c1113540f5E, c226800uA3, c1109770ez9, 29));
                return;
            }
        } else if (enumC1083260eIO == EnumC1083260eIO.HIDE) {
            return;
        }
        ((C226800uA) this.l1).LJJIIJZLJL = true;
        AbstractC1113400f50 abstractC1113400f50LIZJ = ((C1109770ez9) this.l2).LIZJ();
        C1113410f51 c1113410f51 = abstractC1113400f50LIZJ instanceof C1113410f51 ? (C1113410f51) abstractC1113400f50LIZJ : null;
        C226800uA c226800uA4 = (C226800uA) this.l1;
        InteractionHubGoalMessage interactionHubGoalMessage = (InteractionHubGoalMessage) c226800uA4.LJIL;
        if (interactionHubGoalMessage.hasNewGift) {
            if (c1113410f51 != null && (userParam = interactionHubGoalMessage.userParam) != null && (user = userParam.targetUserInfo) != null) {
                long id = user.getId();
                if (id != 0) {
                    c1113410f51.LJIIL(id, "new_gift_tips");
                }
            }
        } else if (c1113410f51 != null) {
            String strLLJLIL = c226800uA4.LLJLIL();
            if (strLLJLIL.length() != 0) {
                HashMap<String, Integer> map = c1113410f51.LJIJJLI;
                Integer num = map.get(strLLJLIL);
                map.put(strLLJLIL, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        C1113540f5E c1113540f5E2 = (C1113540f5E) this.l0;
        C1109770ez9 c1109770ez92 = (C1109770ez9) this.l2;
        C226800uA c226800uA5 = (C226800uA) this.l1;
        c1113540f5E2.getClass();
        InteractionHubGoalMessage interactionHubGoalMessage2 = (InteractionHubGoalMessage) c226800uA5.LJIL;
        long jLJZL = c226800uA5.LJZL();
        long jLLJJIII = c226800uA5.LLJJIII();
        String strLLII = c226800uA5.LLII();
        String strLLJLIL2 = c226800uA5.LLJLIL();
        ActionButton actionButton = interactionHubGoalMessage2.actionButton;
        int i = actionButton != null ? actionButton.buttonType : 0;
        DataChannel dataChannel2 = c1109770ez92.LJIIIZ;
        boolean zLJFF = Intrinsics.LJFF(enumC1083260eIO != null ? enumC1083260eIO.getFrom() : null, "view_insight");
        String str2 = LiveMinusOneScreenTipsInFeedSetting.isTipsInFeedEnabled() ? "full_screen_feed" : "full_screen_top";
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_companion_tool_tip_show");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        c474500IjALIZ.LJJII(Long.valueOf(jLJZL), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(jLLJJIII), "room_id");
        c474500IjALIZ.LJJII(LiveAnchorClusterSetting.INSTANCE.getValue(), "anchor_cluster_level");
        c474500IjALIZ.LJJII(strLLII, "log_id");
        c474500IjALIZ.LJJII(strLLJLIL2, "tip_id");
        c474500IjALIZ.LJJII("negative_screen", "page_name");
        c474500IjALIZ.LJJII(C1113520f5C.LJI(Integer.valueOf(i)), "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(zLJFF ? 1 : 0), "from_view_insight");
        c474500IjALIZ.LJJII(str2, "tip_show_place");
        c474500IjALIZ.LJJII(enumC1083260eIO, "extended_screen_status");
        c474500IjALIZ.LIZ();
        C1113540f5E c1113540f5E3 = (C1113540f5E) this.l0;
        C1109770ez9 c1109770ez93 = (C1109770ez9) this.l2;
        C226800uA c226800uA6 = (C226800uA) this.l1;
        c1113540f5E3.getClass();
        InteractionHubGoalMessage interactionHubGoalMessage3 = (InteractionHubGoalMessage) c226800uA6.LJIL;
        Text text = interactionHubGoalMessage3.interactionTips;
        if (text == null || (str = text.key) == null) {
            str = "";
        }
        if (enumC1083260eIO != EnumC1083260eIO.HIDE) {
            C1113520f5C.LJFF(c1109770ez93, interactionHubGoalMessage3, str, true, "", enumC1083260eIO);
        }
    }

    public final void LIZ$15() {
        int width;
        final C1146260fw0 c1146260fw0 = (C1146260fw0) this.l0;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1146260fw0.LLJILJIL, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(133L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1146260fw0.LLJILJIL, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(330L);
        objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: X.0fw5
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator, boolean z) {
                super.onAnimationEnd(animator, z);
                DataChannel dataChannel = c1146260fw0.LLILZLL;
                if (dataChannel != null) {
                    dataChannel.FQ2(BattleReMatchEvent.class);
                }
            }
        });
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1146260fw0.LLJJJ, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(333L);
        objectAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1146260fw0.LLJJJ, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat4.setDuration(330L);
        objectAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) C497740JfY.LIZIZ(40.0f), (int) C497740JfY.LIZIZ(10.0f));
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(c1146260fw0, 71));
        valueAnimatorOfInt.setDuration(333L);
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        int i = c1146260fw0.LLILLJJLI;
        HorizontalScrollView horizontalScrollView = c1146260fw0.LLJILLL;
        if (i > (horizontalScrollView != null ? horizontalScrollView.getWidth() : 0) || (width = c1146260fw0.LLILLJJLI) == 0) {
            HorizontalScrollView horizontalScrollView2 = c1146260fw0.LLJILLL;
            width = horizontalScrollView2 != null ? horizontalScrollView2.getWidth() : 0;
        }
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, width);
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS262S0100000_12(c1146260fw0, 70));
        valueAnimatorOfInt2.addListener(new AnimatorListenerAdapter() { // from class: X.0eLL
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator, boolean z) {
                int width2;
                ViewGroup.LayoutParams layoutParams;
                super.onAnimationEnd(animator, z);
                C1146260fw0 c1146260fw02 = c1146260fw0;
                int i2 = c1146260fw02.LLILLJJLI;
                HorizontalScrollView horizontalScrollView3 = c1146260fw02.LLJILLL;
                if (horizontalScrollView3 != null) {
                    width2 = horizontalScrollView3.getWidth();
                } else {
                    width2 = 0;
                }
                if (i2 > width2) {
                    C16F5 c16f5 = c1146260fw0.LLJJJJLIIL;
                    if (c16f5 != null) {
                        layoutParams = c16f5.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = c1146260fw0.LLILLJJLI;
                        }
                    } else {
                        layoutParams = null;
                    }
                    C16F5 c16f52 = c1146260fw0.LLJJJJLIIL;
                    if (c16f52 != null) {
                        C786410Ut5.y6(c16f52, layoutParams);
                    }
                    C1146260fw0 c1146260fw03 = c1146260fw0;
                    C16F5 c16f53 = c1146260fw03.LLJJJJLIIL;
                    if (c16f53 != null) {
                        HandlerHook.viewPost(c16f53, new ARunnableS117S0100000_17(c1146260fw03, 320));
                    }
                }
            }
        });
        valueAnimatorOfInt2.setDuration(1260L);
        valueAnimatorOfInt2.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        ConstraintLayout constraintLayout = c1146260fw0.LLJJJ;
        Integer numValueOf = constraintLayout != null ? Integer.valueOf(constraintLayout.getWidth()) : null;
        ValueAnimator valueAnimatorLJIIJ = C1146260fw0.LJIIJ(C497740JfY.LJJ() ? c1146260fw0.LLJLIL : c1146260fw0.LLJJL, numValueOf != null ? numValueOf.intValue() : (int) C497740JfY.LIZIZ(375.0f));
        ValueAnimator valueAnimatorLJIIJ2 = C1146260fw0.LJIIJ(C497740JfY.LJJ() ? c1146260fw0.LLJLILLLLZIIL : c1146260fw0.LLJJLIIIJLLLLLLLZ, numValueOf != null ? numValueOf.intValue() : (int) C497740JfY.LIZIZ(375.0f));
        ValueAnimator valueAnimatorLJIIJ3 = C1146260fw0.LJIIJ(C497740JfY.LJJ() ? c1146260fw0.LLJLL : c1146260fw0.LLJL, numValueOf != null ? numValueOf.intValue() : (int) C497740JfY.LIZIZ(375.0f));
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(C497740JfY.LJJ() ? c1146260fw0.LLJLIL : c1146260fw0.LLJJL, (Property<C1324720kZq, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat5.setDuration(330L);
        objectAnimatorOfFloat5.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(C497740JfY.LJJ() ? c1146260fw0.LLJLILLLLZIIL : c1146260fw0.LLJJLIIIJLLLLLLLZ, (Property<C1324720kZq, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat6.setDuration(330L);
        objectAnimatorOfFloat6.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(C497740JfY.LJJ() ? c1146260fw0.LLJLL : c1146260fw0.LLJL, (Property<C1324720kZq, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat7.setDuration(330L);
        objectAnimatorOfFloat7.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(new ALAdapterS13S0100000_17(c1146260fw0, 132));
        valueAnimatorOfFloat.setDuration(500L);
        AnimatorSet animatorSet = c1146260fw0.LLIZLLLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        c1146260fw0.LLIZLLLIL = null;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(objectAnimatorOfFloat);
        animatorSet2.play(valueAnimatorOfInt);
        animatorSet2.play(objectAnimatorOfFloat3);
        animatorSet2.play(valueAnimatorLJIIJ);
        animatorSet2.play(valueAnimatorLJIIJ2).after(100L);
        animatorSet2.play(valueAnimatorLJIIJ3).after(200L);
        animatorSet2.play(objectAnimatorOfFloat5).after(170L);
        animatorSet2.play(objectAnimatorOfFloat6).after(270L);
        animatorSet2.play(objectAnimatorOfFloat7).after(370L);
        animatorSet2.play(valueAnimatorOfInt2).after(100L);
        animatorSet2.play(objectAnimatorOfFloat4).after(6370L);
        animatorSet2.play(objectAnimatorOfFloat2).after(6370L);
        animatorSet2.play(valueAnimatorOfFloat);
        animatorSet2.start();
        animatorSet2.addListener(new ALAdapterS9S0100000_12(c1146260fw0, 60));
        c1146260fw0.LLIZLLLIL = animatorSet2;
        ((C1146260fw0) ((ALAdapterS12S0200000_17) this.l1).l1).LJ((C1144580ftI) this.l2);
    }

    public final void LIZ$2() {
        AnimatorSet animatorSet = ((C1088810eRL) this.l0).LLILZ;
        if (animatorSet == null || !animatorSet.isRunning()) {
            int width = ((C1088810eRL) this.l0).getWidth();
            CharSequence text = ((C1088810eRL) this.l0).LLILLJJLI.getText();
            ((C1088810eRL) this.l0).LLILLJJLI.setText((CharSequence) this.l1);
            ((C1088810eRL) this.l0).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = ((C1088810eRL) this.l0).getMeasuredWidth();
            ((C1088810eRL) this.l0).LLILLJJLI.setText(text);
            C1088810eRL c1088810eRL = (C1088810eRL) this.l0;
            ViewGroup.LayoutParams layoutParams = c1088810eRL.getLayoutParams();
            if (layoutParams != null) {
                C1088810eRL c1088810eRL2 = (C1088810eRL) this.l0;
                layoutParams.width = width;
                layoutParams.height = c1088810eRL2.getHeight();
            } else {
                layoutParams = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1088810eRL);
            c1088810eRL.setLayoutParams(layoutParams);
            ((C1088810eRL) this.l0).LLILLL.setText((CharSequence) this.l1);
            C786410Ut5.LLJJJJ(((C1088810eRL) this.l0).LLILLL, 0);
            C786410Ut5.od(((C1088810eRL) this.l0).LLILLL, r0.getHeight() * (-1.0f));
            ((C1088810eRL) this.l0).LLILLL.setTextColor(-1);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(153, 255);
            valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
            valueAnimatorOfInt.setDuration(500L);
            EnumC1088820eRM enumC1088820eRM = (EnumC1088820eRM) this.l2;
            EnumC1088820eRM enumC1088820eRM2 = EnumC1088820eRM.HIGH;
            valueAnimatorOfInt.setStartDelay(enumC1088820eRM == enumC1088820eRM2 ? 250L : 0L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17((C1088810eRL) this.l0, 45));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
            valueAnimatorOfFloat.setDuration(600L);
            valueAnimatorOfFloat.setStartDelay(((EnumC1088820eRM) this.l2) == enumC1088820eRM2 ? 800L : 750L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS15S0102000_17((C1088810eRL) this.l0, width, measuredWidth, 0));
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 153);
            valueAnimatorOfInt2.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
            valueAnimatorOfInt2.setDuration(1000L);
            valueAnimatorOfInt2.setStartDelay(((EnumC1088820eRM) this.l2) == enumC1088820eRM2 ? 1500L : 1250L);
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS266S0100000_17((C1088810eRL) this.l0, 46));
            valueAnimatorOfInt2.addListener(new AAListenerS269S0200000_17((C1088810eRL) this.l0, (CharSequence) this.l1, 2));
            ((C1088810eRL) this.l0).LLILZ = new AnimatorSet();
            AnimatorSet animatorSet2 = ((C1088810eRL) this.l0).LLILZ;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat, valueAnimatorOfInt2);
            }
            AnimatorSet animatorSet3 = ((C1088810eRL) this.l0).LLILZ;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }
    }

    public final void LIZ$3() {
        int width = ((C1091850eWF) this.l0).getBannerContainer().getWidth();
        int[] iArr = new int[2];
        ((C1091850eWF) this.l0).getBannerContainer().getLocationOnScreen(iArr);
        int i = iArr[0];
        int[] iArr2 = new int[2];
        ((View) this.l1).getLocationOnScreen(iArr2);
        int width2 = iArr2[0] + (((View) this.l1).getWidth() / 2);
        int i2 = ((C1091850eWF) this.l0).LLIZ;
        int i3 = C497740JfY.LJJ() ? ((i + width) - width2) - (i2 / 2) : (width2 - i) - (i2 / 2);
        int i4 = i2 / 2;
        C1091850eWF c1091850eWF = (C1091850eWF) this.l0;
        int i5 = c1091850eWF.LLIZLLLIL;
        if (i3 + i4 + i5 > width) {
            i3 = (width - i4) - i5;
        }
        if (i3 - i4 < i5) {
            i3 = i5 + i4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1091850eWF.getMountainPointer().getLayoutParams();
        marginLayoutParams.setMarginStart(i3);
        C786410Ut5.c6(((C1091850eWF) this.l0).getMountainPointer(), marginLayoutParams);
        C500260Jjc.LLFFF(((C1091850eWF) this.l0).getMountainPointer());
        ((Function0) this.l2).invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004b A[PHI: r4
      0x004b: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:29:0x0049, B:27:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055 A[PHI: r4
      0x0055: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:29:0x0049, B:33:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$4() {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS50S0300000_17.LIZ$4():void");
    }

    public final void LIZ$5() {
        C1117710fBx c1117710fBxLJJJJLL;
        if (((C1127390fRZ) this.l0).LJJJLIIL()) {
            return;
        }
        C1127390fRZ c1127390fRZ = (C1127390fRZ) this.l0;
        AbstractC1100450ek7 abstractC1100450ek7 = c1127390fRZ.LLIZLLLIL;
        C1128710fTh c1128710fTh = abstractC1100450ek7 instanceof C1128710fTh ? (C1128710fTh) abstractC1100450ek7 : null;
        if ((c1128710fTh == null || !c1128710fTh.LLZLI) && (c1117710fBxLJJJJLL = c1127390fRZ.LJJJJLL()) != null) {
            c1117710fBxLJJJJLL.B0((C1094360eaI) this.l1);
        }
        C1117710fBx c1117710fBxLJJJJLL2 = ((C1127390fRZ) this.l0).LJJJJLL();
        if (c1117710fBxLJJJJLL2 != null) {
            C1127920fSQ c1127920fSQ = ((C1127440fRe) this.l2).LJII;
            c1117710fBxLJJJJLL2.n0(c1127920fSQ != null ? c1127920fSQ.LIZ : false);
        }
    }

    public final void LIZ$6() {
        Object next;
        C1133350fbB c1133350fbB = (C1133350fbB) this.l0;
        List list = (List) this.l1;
        C1133360fbC c1133360fbC = (C1133360fbC) this.l2;
        c1133350fbB.getClass();
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((GiftPage) next).pageType == 17) {
                    break;
                }
            }
        }
        GiftPage giftPage = (GiftPage) next;
        if (giftPage != null) {
            List<Gift> list2 = giftPage.gifts;
            int i = c1133360fbC.LIZ;
            int i2 = i >= 0 ? i : 0;
            if (i2 < list2.size()) {
                int size = c1133360fbC.LIZIZ;
                if (size == -1) {
                    size = list2.size();
                } else {
                    int size2 = list2.size();
                    if (size > size2) {
                        size = size2;
                    }
                }
                if (size > i2) {
                    Iterator<Gift> it3 = list2.subList(i2, size).iterator();
                    while (it3.hasNext()) {
                        ImageModel imageModel = it3.next().previewImage;
                        if (imageModel != null) {
                            C1324570kZb.LJIIIIZZ(imageModel);
                        }
                    }
                }
            }
        }
    }

    public final void LIZ$7() {
        int width;
        int width2;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        GradientDrawable gradientDrawable;
        ViewGroup viewGroupLLLLLLL;
        ViewGroup viewGroupLLLLLZ;
        C1088730eRD c1088730eRD = (C1088730eRD) this.l0;
        C1088660eR6 c1088660eR6 = c1088730eRD.LJ;
        C1088660eR6 c1088660eR62 = (C1088660eR6) this.l1;
        if (c1088660eR6 != c1088660eR62) {
            c1088660eR62.LIZ(true);
            return;
        }
        InterfaceC1088670eR7 interfaceC1088670eR7 = c1088730eRD.LIZIZ;
        View viewFindViewById = (interfaceC1088670eR7 == null || (viewGroupLLLLLZ = interfaceC1088670eR7.LLLLLZ()) == null) ? null : viewGroupLLLLLZ.findViewById(R.id.user_info_container);
        if (viewFindViewById != null) {
            int[] iArr = new int[2];
            viewFindViewById.getLocationOnScreen(iArr);
            width = iArr[0] + (viewFindViewById.getWidth() > 0 ? viewFindViewById.getWidth() : viewFindViewById.getMeasuredWidth());
        } else {
            width = 0;
        }
        InterfaceC1088670eR7 interfaceC1088670eR72 = c1088730eRD.LIZIZ;
        if (interfaceC1088670eR72 == null || (viewGroupLLLLLLL = interfaceC1088670eR72.LLLLLLL()) == null) {
            width2 = 0;
            i = 0;
        } else {
            int[] iArr2 = new int[2];
            viewGroupLLLLLLL.getLocationOnScreen(iArr2);
            i = iArr2[0];
            width2 = viewGroupLLLLLLL.getWidth() > 0 ? viewGroupLLLLLLL.getWidth() : viewGroupLLLLLLL.getMeasuredWidth();
        }
        if (i > width) {
            width2 += i - width;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(97.0f);
        if (width2 - iLIZIZ >= iLIZIZ2) {
            width2 = iLIZIZ2;
        }
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ath);
        ((C1088660eR6) this.l1).setElevation(4.0f);
        ((C1088730eRD) this.l0).LJFF.LIZJ(Boolean.TRUE);
        C1088660eR6 c1088660eR63 = (C1088660eR6) this.l1;
        List<View> listLJJJZ = ((InterfaceC1088670eR7) this.l2).LJJJZ();
        AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17((C1088730eRD) this.l0, (C1088660eR6) this.l1, 97);
        AwS418S0200000_17 awS418S0200000_172 = new AwS418S0200000_17((C1088730eRD) this.l0, (C1088660eR6) this.l1, 98);
        AnimatorSet animatorSet = c1088660eR63.LLILLJJLI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        c1088660eR63.LLILLJJLI = null;
        ValueAnimator valueAnimator = c1088660eR63.LLILLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c1088660eR63.LLILLL = null;
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = c1088660eR63.LLILZ;
        if (aRunnableS117S0100000_17 != null) {
            HandlerHook.viewRemoveCallbacks(c1088660eR63, aRunnableS117S0100000_17);
        }
        c1088660eR63.LLILZ = null;
        int iMin = Math.min(c1088660eR63.LLJILJIL, width2);
        c1088660eR63.LLJILJILJ = c1088660eR63.LLJILJIL > width2;
        c1088660eR63.LLIZLLLIL = false;
        c1088660eR63.LLJ = true;
        c1088660eR63.LLJI = iMin;
        c1088660eR63.LLJIJIL = iLJIIIZ;
        c1088660eR63.LLILZIL = listLJJJZ;
        c1088660eR63.LLILZLL = awS418S0200000_17;
        c1088660eR63.LLIZ = awS418S0200000_172;
        C16F5 c16f5 = c1088660eR63.LL;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c16f5.getLayoutParams();
        layoutParams.width = iMin;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
        C786410Ut5.y6(c16f5, layoutParams);
        c1088660eR63.LL.setGravity(17);
        Drawable background = c1088660eR63.LL.getBackground();
        GradientDrawable gradientDrawable2 = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setCornerRadius(c1088660eR63.LLJIJIL / 2.0f);
        }
        ViewGroup.LayoutParams layoutParams2 = c1088660eR63.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(iMin, iLJIIIZ);
        }
        marginLayoutParams.width = iMin;
        marginLayoutParams.height = iLJIIIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1088660eR63);
        c1088660eR63.setLayoutParams(marginLayoutParams);
        Drawable background2 = c1088660eR63.getBackground();
        if ((background2 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background2) != null) {
            gradientDrawable.setCornerRadius(c1088660eR63.LLJIJIL / 2.0f);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1088660eR63);
        c1088660eR63.setAlpha(0.0f);
        HandlerHook.viewPost(c1088660eR63, new ARunnableS117S0100000_17(c1088660eR63, 269));
    }

    public final void LIZ$8() {
        FrameLayout frameLayout;
        int i;
        if (((C118300cf) this.l0).element % 2 == 0) {
            frameLayout = ((C1115580f8W) this.l1).LLILZLL;
            if (frameLayout != null) {
                i = R.drawable.dqq;
                frameLayout.setBackgroundResource(i);
            }
        } else {
            frameLayout = ((C1115580f8W) this.l1).LLILZLL;
            if (frameLayout != null) {
                i = R.drawable.dqr;
                frameLayout.setBackgroundResource(i);
            }
        }
        ((C118300cf) this.l0).element++;
        C786410Ut5.LJLIIL(300L, ((C1115580f8W) this.l1).LLJI, this);
        if (((C118300cf) this.l0).element > 3) {
            ((C1115580f8W) this.l1).LLJI.removeCallbacks(this);
            ((C1115580f8W) this.l1).LLJ = true;
            ((EmoteModel) this.l2).shine = false;
        }
    }

    public final void LIZ$9() {
        FrameLayout frameLayout;
        int i;
        if (((C118300cf) this.l0).element % 2 == 0) {
            frameLayout = ((C1115590f8X) this.l1).LLILZLL;
            if (frameLayout != null) {
                i = R.drawable.dqq;
                frameLayout.setBackgroundResource(i);
            }
        } else {
            frameLayout = ((C1115590f8X) this.l1).LLILZLL;
            if (frameLayout != null) {
                i = R.drawable.dqr;
                frameLayout.setBackgroundResource(i);
            }
        }
        ((C118300cf) this.l0).element++;
        C786410Ut5.LJLIIL(300L, ((C1115590f8X) this.l1).LLIZLLLIL, this);
        if (((C118300cf) this.l0).element > 3) {
            ((C1115590f8X) this.l1).LLIZLLLIL.removeCallbacks(this);
            ((C1115590f8X) this.l1).LLIZ = true;
            ((EmoteModel) this.l2).shine = false;
        }
    }

    public final void LIZ$10() {
        IHammerAbility iHammerAbility;
        if (C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
            IHammerAbility iHammerAbility2 = (IHammerAbility) C1558520qew.LIZ(C1558520qew.LJIIL((MatchItemEnterAnimAssem) this.l0), IHammerAbility.class, null);
            if (iHammerAbility2 != null) {
                C974450bSt c974450bSt = C973890bRz.LIZ;
                iHammerAbility2.dP2(0L, true);
                return;
            }
            return;
        }
        if (((List) this.l1) == null || !(!r0.isEmpty()) || (iHammerAbility = (IHammerAbility) C1558520qew.LIZ(C1558520qew.LJIIL((MatchItemEnterAnimAssem) this.l0), IHammerAbility.class, null)) == null) {
            return;
        }
        iHammerAbility.XU1((UUID) this.l2, (List) this.l1, 0L, true);
    }

    public static final void run$0(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        C1142700fqG c1142700fqG = (C1142700fqG) aRunnableS50S0300000_17.l0;
        C1139230fkf c1139230fkf = (C1139230fkf) aRunnableS50S0300000_17.l1;
        C1139250fkh c1139250fkh = (C1139250fkh) aRunnableS50S0300000_17.l2;
        c1142700fqG.getClass();
        C1C7U.LIZ("GiftResourceManager@58b9.onFailure$1L");
        C1139310fkn c1139310fkn = (C1139310fkn) ((HashMap) c1142700fqG.LIZ).get(c1139230fkf.LIZ);
        if (c1139310fkn != null) {
            if (c1139230fkf.LJII < Math.max(c1139230fkf.LIZJ.length, c1142700fqG.LIZIZ.LIZJ) - 1) {
                BPEAHandler bPEAHandler = c1142700fqG.LJFF;
                ARunnableS86S0200000_17 aRunnableS86S0200000_17 = new ARunnableS86S0200000_17(c1142700fqG, c1139230fkf, 2);
                c1142700fqG.LIZIZ.getClass();
                C786410Ut5.LJLIIL(5000, bPEAHandler, aRunnableS86S0200000_17);
                C1C7U.LIZIZ("GiftResourceManager@58b9.onFailure$1L");
                return;
            }
        }
        ((ConcurrentHashMap) c1142700fqG.LJ).put(c1139230fkf.LIZ, new Pair(Boolean.FALSE, Long.valueOf(System.currentTimeMillis())));
        if (c1139310fkn != null) {
            Iterator it2 = ((CopyOnWriteArrayList) c1139310fkn.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1142720fqI) it2.next()).LIZIZ(c1139250fkh);
            }
        }
        ((HashMap) c1142700fqG.LIZ).remove(c1139230fkf.LIZ);
        Iterator it3 = ((CopyOnWriteArrayList) c1142700fqG.LIZJ).iterator();
        while (it3.hasNext()) {
            ((InterfaceC1142750fqL) it3.next()).LIZIZ(c1139250fkh);
        }
        c1142700fqG.LJI--;
        c1142700fqG.LJII++;
        c1142700fqG.LJII();
        C1C7U.LIZIZ("GiftResourceManager@58b9.onFailure$1L");
    }

    public static final void run$1(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreCellDispatchExposure@4c21.dispatchAllCellExposure$1$1");
        try {
            aRunnableS50S0300000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreCellDispatchExposure@4c21.dispatchAllCellExposure$1$1");
    }

    public static final void run$10(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        T t;
        C1111930f2d c1111930f2d = (C1111930f2d) aRunnableS50S0300000_17.l0;
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) aRunnableS50S0300000_17.l1;
        Object obj = aRunnableS50S0300000_17.l2;
        c1111930f2d.getClass();
        C1C7U.LIZ("PublicScreenPresenter@c5a7.updateModel$1L");
        PinMessageViewModel pinMessageViewModel = c1111930f2d.LLILLJJLI;
        if (pinMessageViewModel != null && ((pinMessageViewModel.LLILZ != null || pinMessageViewModel.LLILZIL != null) && pinMessageViewModel.vQ2(interfaceC1112060f2q))) {
            c1111930f2d.LLILLJJLI.zQ2(interfaceC1112060f2q);
            C1C7U.LIZIZ("PublicScreenPresenter@c5a7.updateModel$1L");
            return;
        }
        if (interfaceC1112060f2q != null && (t = c1111930f2d.mView) != 0 && c1111930f2d.LLLJL != null) {
            if (c1111930f2d.LLLLIILLL == interfaceC1112060f2q) {
                ((InterfaceC1112050f2p) t).qe1(interfaceC1112060f2q, obj);
            } else {
                int iLJI = c1111930f2d.LLJLL.LJI(interfaceC1112060f2q);
                if (iLJI != -1) {
                    ((InterfaceC1112050f2p) c1111930f2d.mView).s11(iLJI, obj);
                }
            }
        }
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.updateModel$1L");
    }

    public static final void run$11(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftResourceManageDownloadProducer@638b.reportDownloadStart$1");
        try {
            aRunnableS50S0300000_17.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftResourceManageDownloadProducer@638b.reportDownloadStart$1");
    }

    public static final void run$12(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftResourceManageHandoffProducer@8408.produceResult$1");
        try {
            AbstractC1140540fmm abstractC1140540fmm = ((C1140310fmP) aRunnableS50S0300000_17.l0).LIZ;
            if (abstractC1140540fmm != null) {
                final AbstractC1140580fmq abstractC1140580fmq = (AbstractC1140580fmq) aRunnableS50S0300000_17.l1;
                abstractC1140540fmm.LIZ(new AbstractC1140580fmq(abstractC1140580fmq) { // from class: X.0fmQ
                    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

                    @Override // X.AbstractC1140580fmq
                    public final void LIZ(C1139900flk c1139900flk) {
                        C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS86S0200000_17(this, c1139900flk, 63));
                    }
                }, (C1139900flk) aRunnableS50S0300000_17.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftResourceManageHandoffProducer@8408.produceResult$1");
    }

    public static final void run$13(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        C1106110etF c1106110etF = (C1106110etF) aRunnableS50S0300000_17.l0;
        DataChannel dataChannel = (DataChannel) aRunnableS50S0300000_17.l1;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aRunnableS50S0300000_17.l2;
        c1106110etF.getClass();
        C1C7U.LIZ("ToolbarShareBehavior@28ff.onLoad$2L");
        if (Boolean.TRUE.equals(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Tn(C1106110etF.LLLIZZ.longValue()))) {
            if (C924810aAp.LJ().LJIILIIL) {
                C20441214yg.LIZIZ("CoHostSuggestionToolTip", "Currently in multi guest, postponing tooltip");
                c1106110etF.LLLI = true;
                dataChannel.BQ2(c1106110etF.LLJILJIL, LinkConnectionTypeChangedEvent.class, new AObjectS313S0200000_17(c1106110etF, interfaceC1103130eoR, 12));
            } else if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).C10(dataChannel)) {
                C20441214yg.LIZIZ("CoHostSuggestionToolTip", "Currently in multi cohost, postponing tooltip");
                c1106110etF.LLLI = true;
                dataChannel.BQ2(c1106110etF.LLJILJIL, InteractUnifiedStateChangeChannel.class, new AObjectS313S0200000_17(c1106110etF, interfaceC1103130eoR, 13));
            } else {
                c1106110etF.LIZJ(interfaceC1103130eoR.LJ());
            }
        }
        C1C7U.LIZIZ("ToolbarShareBehavior@28ff.onLoad$2L");
    }

    public static final void run$14(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("ViewerWishesQueueAdapter@5c0b.initSwipeDelete$1$1");
        try {
            Long l = ((C1AHS) aRunnableS50S0300000_17.l0).LLIZ;
            long j = ((C1AHW) aRunnableS50S0300000_17.l1).LIZ;
            if ((l != null && l.longValue() == j) || !((C1AHV) aRunnableS50S0300000_17.l2).LLJILJILJ) {
                ((C1AHS) aRunnableS50S0300000_17.l0).getClass();
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                C1113800f5e.LIZJ(EnumC1120860fH2.GUIDE_VIEWER_WISHES_QUEUE);
                ((C1AHS) aRunnableS50S0300000_17.l0).LLLIIIIL();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewerWishesQueueAdapter@5c0b.initSwipeDelete$1$1");
    }

    public static final void run$15(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftPanelTopLeaf@4350.showDefaultBanner$1");
        try {
            aRunnableS50S0300000_17.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftPanelTopLeaf@4350.showDefaultBanner$1");
    }

    public static final void run$16(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftPreloadManager@643d.handleDynamicPreviewPreload$1$1");
        try {
            aRunnableS50S0300000_17.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftPreloadManager@643d.handleDynamicPreviewPreload$1$1");
    }

    public static final void run$17(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("AudienceRankTopBuyerEntranceGuide@78fc.activate$2");
        try {
            aRunnableS50S0300000_17.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AudienceRankTopBuyerEntranceGuide@78fc.activate$2");
    }

    public static final void run$18(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        try {
            aRunnableS50S0300000_17.LIZ$8();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$19(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        try {
            aRunnableS50S0300000_17.LIZ$9();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$2(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        AnimationAnimationListenerC1151570g4Z animationAnimationListenerC1151570g4Z = (AnimationAnimationListenerC1151570g4Z) aRunnableS50S0300000_17.l0;
        View view = (View) aRunnableS50S0300000_17.l1;
        InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) aRunnableS50S0300000_17.l2;
        animationAnimationListenerC1151570g4Z.getClass();
        C1C7U.LIZ("FrameL3SlotWidget$2@e406.onChanged$1$onAnimationEnd$1L");
        if (view instanceof ViewGroup) {
            C786410Ut5.LJJJJI((ViewGroup) view);
            ((FrameL3SlotWidget) ((AObserverS181S0200000_17) animationAnimationListenerC1151570g4Z.l0).l1).hide();
            C770580UKq.LIZIZ(interfaceC1124060fMC, null);
        }
        C1C7U.LIZIZ("FrameL3SlotWidget$2@e406.onChanged$1$onAnimationEnd$1L");
    }

    public static final void run$20(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        String penaltyWarningSkip;
        C1C7U.LIZ("ExchangeUtilKt@6570.requestExchangeForCampaign$1$onExchangeFail$1");
        try {
            ExchangeParams exchangeParams = (ExchangeParams) aRunnableS50S0300000_17.l0;
            exchangeParams.skipKycReminder = true;
            CustomErrorExtra customErrorExtra = (CustomErrorExtra) aRunnableS50S0300000_17.l1;
            if (customErrorExtra == null) {
                penaltyWarningSkip = "";
            } else {
                penaltyWarningSkip = customErrorExtra.getPenaltyWarningSkip();
            }
            exchangeParams.penaltyWarningSkip = penaltyWarningSkip;
            C1149560g1K.LJFF((ExchangeParams) aRunnableS50S0300000_17.l0, (Function1) aRunnableS50S0300000_17.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExchangeUtilKt@6570.requestExchangeForCampaign$1$onExchangeFail$1");
    }

    public static final void run$21(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        String penaltyWarningSkip;
        C1C7U.LIZ("ExchangeUtilKt@6570.requestExchangeForLiveTask$1$onExchangeFail$1");
        try {
            ExchangeParams exchangeParams = (ExchangeParams) aRunnableS50S0300000_17.l0;
            exchangeParams.skipKycReminder = true;
            CustomErrorExtra customErrorExtra = (CustomErrorExtra) aRunnableS50S0300000_17.l1;
            if (customErrorExtra == null) {
                penaltyWarningSkip = "";
            } else {
                penaltyWarningSkip = customErrorExtra.getPenaltyWarningSkip();
            }
            exchangeParams.penaltyWarningSkip = penaltyWarningSkip;
            ExchangeParams exchangeParams2 = (ExchangeParams) aRunnableS50S0300000_17.l0;
            Function2 function2 = (Function2) aRunnableS50S0300000_17.l2;
            ((WalletExchange) C1148670fzt.LIZ().walletExchange()).LJ(C176600m4.LIZ(), null, false, exchangeParams2, new C1149580g1M(exchangeParams2, function2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExchangeUtilKt@6570.requestExchangeForLiveTask$1$onExchangeFail$1");
    }

    public static final void run$22(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        InterfaceC1077630e9J interfaceC1077630e9J;
        C1C7U.LIZ("WidgetLoadController@d8f9.startLoadPhase$1$1");
        try {
            ((InterfaceC1077630e9J) aRunnableS50S0300000_17.l0).load();
            C1077660e9M c1077660e9M = ((C1077660e9M) aRunnableS50S0300000_17.l1).LIZIZ;
            if (c1077660e9M != null && (interfaceC1077630e9J = c1077660e9M.LIZ) != null && interfaceC1077630e9J.LIZIZ()) {
                ((C1077600e9G) aRunnableS50S0300000_17.l2).LIZJ(((C1077660e9M) aRunnableS50S0300000_17.l1).LIZIZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WidgetLoadController@d8f9.startLoadPhase$1$1");
    }

    public static final void run$23(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("MatchItemEnterAnimAssem@375f.createSpecialEffectRunnable$1");
        try {
            aRunnableS50S0300000_17.LIZ$10();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchItemEnterAnimAssem@375f.createSpecialEffectRunnable$1");
    }

    public static final void run$24(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("PerfDowngradeTriggerByScore@3fbd.perfMetricListener$1$onScoreResult$1");
        try {
            aRunnableS50S0300000_17.LIZ$11();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PerfDowngradeTriggerByScore@3fbd.perfMetricListener$1$onScoreResult$1");
    }

    public static final void run$25(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GameGiftQueueRender@457.onFacialAlgorithmModelPrepared$1");
        try {
            aRunnableS50S0300000_17.LIZ$12();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameGiftQueueRender@457.onFacialAlgorithmModelPrepared$1");
    }

    public static final void run$26(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("BasePlaybookSchemaHandlerV2@f998.handleInner$1$2");
        try {
            aRunnableS50S0300000_17.LIZ$13();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BasePlaybookSchemaHandlerV2@f998.handleInner$1$2");
    }

    public static final void run$27(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("MusicGiftQueueRender@8d3d.onFacialAlgorithmModelPrepared$1");
        try {
            ((C1139580flE) aRunnableS50S0300000_17.l0).LJIILL((C1136560fgM) aRunnableS50S0300000_17.l1, (AssetsModel) aRunnableS50S0300000_17.l2, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicGiftQueueRender@8d3d.onFacialAlgorithmModelPrepared$1");
    }

    public static final void run$28(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("FansClubEntranceAnimator@f96f.playPointsIncreaseFromZeroAnim$pointsTranslationAnim$1$2$1");
        try {
            if (!((C013C) aRunnableS50S0300000_17.l0).element) {
                C12ES.LJIILL(8, ((C1095930ecp) aRunnableS50S0300000_17.l1).LJIIIZ);
                C12ES.LJIILL(8, ((C1095930ecp) aRunnableS50S0300000_17.l1).LJIILLIIL);
                C12ES.LJIILL(0, ((C1095930ecp) aRunnableS50S0300000_17.l1).LJJII);
                ((Function0) aRunnableS50S0300000_17.l2).invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FansClubEntranceAnimator@f96f.playPointsIncreaseFromZeroAnim$pointsTranslationAnim$1$2$1");
    }

    public static final void run$29(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("TipsViewHolder@87bd.scheduleTipShowLog$1");
        try {
            aRunnableS50S0300000_17.LIZ$14();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TipsViewHolder@87bd.scheduleTipShowLog$1");
    }

    public static final void run$3(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        AnimationAnimationListenerC1151570g4Z animationAnimationListenerC1151570g4Z = (AnimationAnimationListenerC1151570g4Z) aRunnableS50S0300000_17.l0;
        View view = (View) aRunnableS50S0300000_17.l1;
        C1123980fM4 c1123980fM4 = (C1123980fM4) aRunnableS50S0300000_17.l2;
        animationAnimationListenerC1151570g4Z.getClass();
        C1C7U.LIZ("FrameSlotWidget@b05a.showSlotMulti$1$onChanged$2$onAnimationEnd$1L");
        if (view instanceof ViewGroup) {
            C786410Ut5.LJJJJI((ViewGroup) view);
            ((C1123880fLu) animationAnimationListenerC1151570g4Z.l0).LLILZ.hide();
            C770580UKq.LIZIZ(c1123980fM4.LIZIZ, null);
        }
        C1C7U.LIZIZ("FrameSlotWidget@b05a.showSlotMulti$1$onChanged$2$onAnimationEnd$1L");
    }

    public static final void run$30(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("BattleNewMvpContainerLayout@9816.showMvpAnimation$avatarStartScaleAnimation$1$1$onAnimationEnd$1");
        try {
            aRunnableS50S0300000_17.LIZ$15();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BattleNewMvpContainerLayout@9816.showMvpAnimation$avatarStartScaleAnimation$1$1$onAnimationEnd$1");
    }

    public static final void run$4(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aRunnableS50S0300000_17.l0;
        GiftGuideMessage giftGuideMessage = (GiftGuideMessage) aRunnableS50S0300000_17.l1;
        C443120HZe c443120HZe = (C443120HZe) aRunnableS50S0300000_17.l2;
        absAudienceInteractionFragment.getClass();
        C1C7U.LIZ("AbsAudienceInteractionFragment@61ad.onGiftGuideNotify$1L");
        absAudienceInteractionFragment.wS(giftGuideMessage, (Long) c443120HZe.getThird());
        C1C7U.LIZIZ("AbsAudienceInteractionFragment@61ad.onGiftGuideNotify$1L");
    }

    public static final void run$5(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("NormalPanel@5c77.animateDescriptionText$1$1");
        try {
            ((C16F5) aRunnableS50S0300000_17.l0).setText((CharSequence) aRunnableS50S0300000_17.l1);
            C1118060fCW.LIZ((C16F5) aRunnableS50S0300000_17.l0);
            ((C16F5) aRunnableS50S0300000_17.l0).animate().setInterpolator((C12DM) aRunnableS50S0300000_17.l2).setStartDelay(0L).alpha(1.0f).setDuration(300L).start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NormalPanel@5c77.animateDescriptionText$1$1");
    }

    public static final void run$6(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("HttpUrlConnectionDownloader@ed4f.download$1");
        try {
            aRunnableS50S0300000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HttpUrlConnectionDownloader@ed4f.download$1");
    }

    public static final void run$7(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("ScrollTextView@b84b.scrollToNewText$1");
        try {
            aRunnableS50S0300000_17.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScrollTextView@b84b.scrollToNewText$1");
    }

    public static final void run$8(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewBannerCommonView@4ab.pointToAnchorView$1");
        try {
            aRunnableS50S0300000_17.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewBannerCommonView@4ab.pointToAnchorView$1");
    }

    public static final void run$9(ARunnableS50S0300000_17 aRunnableS50S0300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftMusicMessageQueue@3730.onFacialAlgorithmModelPrepared$1");
        try {
            ((C1139530fl9) aRunnableS50S0300000_17.l0).LJIILL((C1136560fgM) aRunnableS50S0300000_17.l1, (AssetsModel) aRunnableS50S0300000_17.l2, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftMusicMessageQueue@3730.onFacialAlgorithmModelPrepared$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS50S0300000_17(Object obj, C1139230fkf c1139230fkf, AssetsModel assetsModel, Map<String, String> map) {
        this.$t = map;
        this.l0 = obj;
        this.l1 = c1139230fkf;
        this.l2 = assetsModel;
    }
}
