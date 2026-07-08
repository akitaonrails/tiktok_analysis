package X;

import Y.AComparatorS48S0000000_29;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS129S0100000_29;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.livesdk.broadcast.LiveCenterTriggerApi;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterECSuggestionSetting;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorPreviewNotifySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorWhiteBox2Setting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterApiOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterEntranceXmlOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.growth.LiveCenterGrowthDisplayTimeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.AnchorReminderWordInfoMsg;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import webcast.data.AnchorGrowLevelImMsgNotification;
import webcast.data.AnchorGrowLevelImMsgV2;
import webcast.data.LiveJourneyImMessage;
import webcast.data.RealtimeLiveCenterWhiteBoxPreviewIM;

/* JADX INFO: renamed from: X.12OA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12OA {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final WeakReference<LiveCenterEntranceWidget> LIZIZ;
    public C12O8 LIZJ;
    public boolean LIZLLL;
    public int LJI;
    public Pair<String, Integer> LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public C12OI LJIIL;
    public final List<C12OI> LJIILIIL;
    public final ConcurrentLinkedDeque<C12O8> LIZ = new ConcurrentLinkedDeque<>();
    public final Map<String, Integer> LJ = new LinkedHashMap();
    public final Map<String, String> LJFF = new LinkedHashMap();
    public final ARunnableS129S0100000_29 LJII = new ARunnableS129S0100000_29(this, 191);
    public boolean LJIIJJI = true;

    public final C12O8 LIZIZ() {
        View view;
        int size;
        LiveCenterEntranceWidget liveCenterEntranceWidget = this.LIZIZ.get();
        if (liveCenterEntranceWidget == null || (view = liveCenterEntranceWidget.getView()) == null || ((size = this.LJFF.size()) == 0 && this.LJI == 0)) {
            return null;
        }
        C12OE c12oe = this.LJI <= size ? C12OE.PUNISH : C12OE.PUNISH_END;
        LJFF(view, c12oe);
        return c12oe == C12OE.PUNISH ? new C12O7(view) : new C12O6(view);
    }

    public final DataChannel LJI() {
        LiveCenterEntranceWidget liveCenterEntranceWidget = this.LIZIZ.get();
        if (liveCenterEntranceWidget != null) {
            return liveCenterEntranceWidget.dataChannel;
        }
        return null;
    }

    public final LiveCenterEntranceWidget LJII() {
        return this.LIZIZ.get();
    }

    public final void LJJ() {
        View view;
        if (LiveCenterUIStyleOptimizationSetting.INSTANCE.enable()) {
            C12OW c12ow = new C12OW(C497740JfY.LJIJI(2131856129), C497740JfY.LJIJI(2131856128), null, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_13", "ttlive_slr_diamonds.png"), null, true, null, null, 0L, null, null, null, 8148);
            C20441214yg.LIZIZ("LiveCenterStateManager", "triggerSlrDiamondsState: experiment group → triggerTopNoticeState");
            LJJIFFI(c12ow);
        } else {
            LiveCenterEntranceWidget liveCenterEntranceWidget = this.LIZIZ.get();
            if (liveCenterEntranceWidget == null || (view = liveCenterEntranceWidget.getView()) == null) {
                return;
            }
            LJFF(view, C12OE.SLR_DIAMONDS);
            LIZLLL(new C19416610xo(view));
        }
    }

    public final void LJJIIJZLJL() {
        Object next;
        Map<String, Integer> map = this.LJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Number) entry.getValue()).intValue() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = C2097808Js.LJIL(linkedHashMap).iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                Pair pair = (Pair) next;
                pair.getFirst();
                int iIntValue = ((Number) pair.getSecond()).intValue();
                do {
                    Object next2 = it2.next();
                    Pair pair2 = (Pair) next2;
                    pair2.getFirst();
                    int iIntValue2 = ((Number) pair2.getSecond()).intValue();
                    if (iIntValue > iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Pair<String, Integer> pair3 = (Pair) next;
        this.LJIIIIZZ = pair3;
        if (pair3 != null) {
            int iIntValue3 = pair3.getSecond().intValue();
            C473410IhP.LIZ().removeCallbacks(this.LJII);
            C473410IhP.LIZJ(this.LJII, (((long) iIntValue3) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - C158B.LIZ());
        }
    }

    public C12OA(LiveCenterEntranceWidget liveCenterEntranceWidget) {
        this.LIZIZ = new WeakReference<>(liveCenterEntranceWidget);
        if (LJIIIZ(null)) {
            C20441214yg.LIZIZ("MainFrame#LC", "init component listener");
            DataChannel dataChannelLJI = LJI();
            if (dataChannelLJI != null) {
                C1102070emj c1102070emj = C1102070emj.LIZ;
                InterfaceC1102350enB interfaceC1102350enB = new InterfaceC1102350enB() { // from class: X.12OG
                    @Override // X.InterfaceC1102350enB
                    public final void LIZ() {
                        LiveCenterEntranceWidget liveCenterEntranceWidgetLJII;
                        View view;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onBannerConsumed: ");
                        sbLIZ.append(this.LIZ.LJIIIZ);
                        C20441214yg.LIZIZ("MainFrame#LC", C2188811AlT.LIZIZ(sbLIZ));
                        C12OA c12oa = this.LIZ;
                        if (!c12oa.LJIIIZ || (liveCenterEntranceWidgetLJII = c12oa.LJII()) == null || (view = liveCenterEntranceWidgetLJII.getView()) == null) {
                            return;
                        }
                        C786410Ut5.T4(view, 1.0f);
                    }

                    @Override // X.InterfaceC1102350enB
                    public final void LIZIZ() {
                        LiveCenterEntranceWidget liveCenterEntranceWidgetLJII;
                        View view;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onBannerActivate: ");
                        sbLIZ.append(this.LIZ.LJIIIZ);
                        C20441214yg.LIZIZ("MainFrame#LC", C2188811AlT.LIZIZ(sbLIZ));
                        C12OA c12oa = this.LIZ;
                        if (!c12oa.LJIIIZ || (liveCenterEntranceWidgetLJII = c12oa.LJII()) == null || (view = liveCenterEntranceWidgetLJII.getView()) == null) {
                            return;
                        }
                        C786410Ut5.T4(view, 0.2f);
                    }
                };
                c1102070emj.getClass();
                C1102070emj.LIZ(dataChannelLJI, 3, 2, interfaceC1102350enB);
                C1102070emj.LIZ(dataChannelLJI, 1, 2, new InterfaceC1102350enB() { // from class: X.12OH
                    @Override // X.InterfaceC1102350enB
                    public final void LIZ() {
                        LiveCenterEntranceWidget liveCenterEntranceWidgetLJII;
                        View view;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onMidTouchConsumed: ");
                        sbLIZ.append(this.LIZ.LJIIIZ);
                        C20441214yg.LIZIZ("MainFrame#LC", C2188811AlT.LIZIZ(sbLIZ));
                        C12OA c12oa = this.LIZ;
                        if (c12oa.LJIIIZ || (liveCenterEntranceWidgetLJII = c12oa.LJII()) == null || (view = liveCenterEntranceWidgetLJII.getView()) == null) {
                            return;
                        }
                        C786410Ut5.T4(view, 1.0f);
                    }

                    @Override // X.InterfaceC1102350enB
                    public final void LIZIZ() {
                        LiveCenterEntranceWidget liveCenterEntranceWidgetLJII;
                        View view;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onMidTouchActivate: ");
                        sbLIZ.append(this.LIZ.LJIIIZ);
                        C20441214yg.LIZIZ("MainFrame#LC", C2188811AlT.LIZIZ(sbLIZ));
                        C12OA c12oa = this.LIZ;
                        if (c12oa.LJIIIZ || (liveCenterEntranceWidgetLJII = c12oa.LJII()) == null || (view = liveCenterEntranceWidgetLJII.getView()) == null) {
                            return;
                        }
                        C786410Ut5.T4(view, 0.2f);
                    }
                });
            }
        }
        new HashMap();
        this.LJIILIIL = new ArrayList();
    }

    public static boolean LJIIJ(C12O8 c12o8) {
        C12OE c12oe;
        C12OE[] c12oeArr = {C12OE.PUNISH, C12OE.PUNISH_END};
        if (c12o8 != null) {
            c12oe = c12o8.LIZ;
        } else {
            c12oe = null;
        }
        if (C13LQ.LJJIJIIJI(c12oe, c12oeArr) < 0) {
            return false;
        }
        return true;
    }

    public final boolean LIZ(C12OE c12oe) {
        C12OE c12oe2;
        C12O8 c12o8Peek = this.LIZ.peek();
        if (c12o8Peek != null) {
            c12oe2 = c12o8Peek.LIZ;
        } else {
            c12oe2 = null;
        }
        if (c12oe2 == c12oe) {
            return true;
        }
        return false;
    }

    public final void LIZJ(C12O8 c12o8) {
        View view;
        if (!LiveCenterEntranceXmlOptSetting.INSTANCE.enable() && !LiveCenterUIStyleOptimizationSetting.INSTANCE.enable()) {
            LJ(c12o8);
            return;
        }
        LiveCenterEntranceWidget liveCenterEntranceWidget = this.LIZIZ.get();
        if (liveCenterEntranceWidget == null || (view = liveCenterEntranceWidget.getView()) == null) {
            return;
        }
        view.requestLayout();
        LJ(c12o8);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C12O8 r15) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12OA.LIZLLL(X.12O8):void");
    }

    public final void LJ(C12O8 c12o8) {
        LiveMode liveModeLIZJ;
        DataChannel dataChannelLJI;
        if (LiveCenterApiOpt.INSTANCE.enable() && c12o8.LIZ != C12OE.DEFAULT) {
            DataChannel dataChannelLJI2 = LJI();
            if (dataChannelLJI2 != null) {
                liveModeLIZJ = C751980Tee.LIZJ(dataChannelLJI2);
            } else {
                liveModeLIZJ = null;
            }
            if (liveModeLIZJ == LiveMode.VIDEO && (dataChannelLJI = LJI()) != null) {
                dataChannelLJI.FQ2(LiveCenterTriggerApi.class);
            }
        }
        if (this.LIZ.isEmpty()) {
            this.LIZ.add(c12o8);
            c12o8.getClass();
            c12o8.LIZJ = new WeakReference<>(this);
            LJIJJ(this, c12o8, null);
        } else {
            C12O8 c12o8Peek = this.LIZ.peek();
            if (c12o8Peek != null) {
                if (c12o8Peek.LIZ(c12o8)) {
                    c12o8Peek.LJIILL(c12o8);
                } else {
                    c12o8.getClass();
                    c12o8.LIZJ = new WeakReference<>(this);
                    if (c12o8.LIZIZ >= c12o8Peek.LIZIZ) {
                        if (c12o8Peek.LJIIJJI() == 1 && c12o8.LJIJI()) {
                            this.LIZ.poll();
                            this.LIZ.addFirst(c12o8);
                            this.LIZ.addFirst(c12o8Peek);
                        } else {
                            this.LIZ.addFirst(c12o8);
                            if (c12o8Peek.LJIJ(c12o8)) {
                                this.LIZ.remove(c12o8Peek);
                            }
                            LJIJJ(this, c12o8, c12o8Peek);
                        }
                    } else {
                        this.LIZ.add(c12o8);
                        List listLJLLLL = C13LP.LJLLLL(new AComparatorS48S0000000_29(5), this.LIZ);
                        this.LIZ.clear();
                        this.LIZ.addAll(listLJLLLL);
                    }
                }
            }
        }
        this.LIZJ = this.LIZ.peek();
    }

    public final boolean LJIIIZ(C12O8 c12o8) throws JSONException {
        int iLIZIZ;
        DataChannel dataChannel;
        int iLJII;
        if (c12o8 != null) {
            iLIZIZ = c12o8.LIZIZ();
        } else {
            iLIZIZ = 4;
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        LiveCenterEntranceWidget liveCenterEntranceWidgetLJII = LJII();
        if (liveCenterEntranceWidgetLJII != null) {
            dataChannel = liveCenterEntranceWidgetLJII.dataChannel;
        } else {
            dataChannel = null;
        }
        int iLJIIIZ = 0;
        if (c12o8 != null) {
            iLJII = c12o8.LJII();
            iLJIIIZ = c12o8.LJIIIZ();
        } else {
            iLJII = 0;
        }
        c1102070emj.getClass();
        boolean zLJIIIIZZ = C1102070emj.LJIIIIZZ(dataChannel, iLIZIZ, iLJII, iLJIIIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isEnabled: ");
        sbLIZ.append(zLJIIIIZZ);
        sbLIZ.append(", state: ");
        sbLIZ.append(c12o8);
        sbLIZ.append(", component: ");
        sbLIZ.append(iLIZIZ);
        C20441214yg.LIZIZ("MainFrame#LC", C2188811AlT.LIZIZ(sbLIZ));
        return zLJIIIIZZ;
    }

    public final void LJIILJJIL(C12O8 c12o8) {
        if (!this.LIZ.isEmpty()) {
            C12O8 c12o8Peek = this.LIZ.peek();
            if (Intrinsics.LJFF(c12o8Peek, c12o8)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("remove state: ");
                sbLIZ.append(c12o8);
                sbLIZ.append(", head: ");
                sbLIZ.append(c12o8Peek);
                C20441214yg.LIZIZ("LiveCenterStateManager", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.remove(c12o8Peek);
                LJIJJ(this, this.LIZ.peek(), c12o8Peek);
            } else {
                this.LIZ.remove(c12o8);
            }
            C20441214yg.LIZIZ("LiveCenterStateManager", "After Remove");
            if (this.LIZ.isEmpty()) {
                C20441214yg.LIZIZ("LiveCenterStateManager", "Remove to Bottom");
                C12OY.LJIIZILJ(LJI(), "normal", "show");
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_icon");
                c474500IjALIZ.LJIJJLI(LJI());
                c474500IjALIZ.LJ("show");
                c474500IjALIZ.LJJII("normal", "restriction_status");
                c474500IjALIZ.LJJII(0, "restriction_number");
                c474500IjALIZ.LJJII("normal", "icon_type");
                c474500IjALIZ.LJJII(0, "coldstart_viewer_cnt");
                c474500IjALIZ.LIZ();
            }
        }
        this.LIZJ = this.LIZ.peek();
    }

    public final void LJIJJLI(AnchorReminderWordInfoMsg anchorReminderWordInfoMsg) {
        View view;
        LiveCenterEntranceWidget liveCenterEntranceWidget = this.LIZIZ.get();
        if (liveCenterEntranceWidget != null && (view = liveCenterEntranceWidget.getView()) != null) {
            C12O8 c12o8 = this.LIZJ;
            if (c12o8 instanceof C19416410xm) {
                C20441214yg.LIZIZ("LiveCenterStateManager", "cue1");
                C19416410xm c19416410xm = (C19416410xm) c12o8;
                c19416410xm.LJ = anchorReminderWordInfoMsg;
                TextView textView = c19416410xm.LJIIIIZZ;
                if (textView != null) {
                    textView.setText(anchorReminderWordInfoMsg.content);
                    return;
                }
                return;
            }
            C20441214yg.LIZIZ("LiveCenterStateManager", "cue2");
            LJFF(view, C12OE.ANCHOR_CUE);
            LIZLLL(new C19416410xm(view, anchorReminderWordInfoMsg));
        }
    }

    public final void LJIL(AnchorReminderWordInfoMsg anchorReminderWordInfoMsg) {
        LiveCenterEntranceWidget liveCenterEntranceWidget;
        View view;
        if (!LiveCenterECSuggestionSetting.INSTANCE.isEnabled()) {
            return;
        }
        if ((!this.LJIIJ || !this.LJIIJJI) && (liveCenterEntranceWidget = this.LIZIZ.get()) != null && (view = liveCenterEntranceWidget.getView()) != null) {
            C12O8 c12o8 = this.LIZJ;
            if (c12o8 instanceof C19416310xl) {
                ((C19416310xl) c12o8).LJIJJLI(anchorReminderWordInfoMsg);
            } else {
                LJFF(view, C12OE.EC_SUGGEST);
                LIZLLL(new C19416310xl(view, anchorReminderWordInfoMsg));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r0 = r4.LIZIZ.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r1 = r0.getView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        LJFF(r1, X.C12OE.STATUS_DEGRADE_NOTIFY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r1.findViewById(com.zhiliaoapp.musically.R.id.w15) == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        LIZLLL(new X.C19416210xk(r1, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((!r4.LJ.isEmpty()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(X.C0IQ1 r5) {
        /*
            r4 = this;
            java.util.concurrent.ConcurrentLinkedDeque<X.12O8> r0 = r4.LIZ
            java.util.Iterator r3 = r0.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.12O8 r0 = (X.C12O8) r0
            X.12OE r1 = r0.LIZ
            X.12OE r0 = X.C12OE.STATUS_DEGRADE_NOTIFY
            if (r1 != r0) goto L6
            if (r2 != 0) goto L4b
        L1b:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r4.LJ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L4b
            java.lang.ref.WeakReference<com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget> r0 = r4.LIZIZ
            java.lang.Object r0 = r0.get()
            com.bytedance.android.widget.Widget r0 = (com.bytedance.android.widget.Widget) r0
            if (r0 == 0) goto L4b
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L4b
            X.12OE r0 = X.C12OE.STATUS_DEGRADE_NOTIFY
            r4.LJFF(r1, r0)
            r0 = 2131392111(0x7f0a766f, float:1.840484E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L4b
            X.10xk r0 = new X.10xk
            r0.<init>(r1, r5)
            r4.LIZLLL(r0)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12OA.LJJI(X.0IQ1):void");
    }

    public final void LJJIFFI(C12OW c12ow) {
        if (this.LJIIJ && this.LJIIJJI) {
            return;
        }
        LIZLLL(new C12OJ(c12ow));
    }

    public final void LJJII(RealtimeLiveCenterWhiteBoxPreviewIM realtimeLiveCenterWhiteBoxPreviewIM) {
        LiveCenterEntranceWidget liveCenterEntranceWidget;
        View view;
        C12OE c12oe;
        C12O8 c19415510xd;
        if (!LiveAnchorPreviewNotifySetting.INSTANCE.enable()) {
            return;
        }
        C12O8 c12o8 = this.LIZJ;
        if (!(c12o8 instanceof C19415510xd) && !(c12o8 instanceof C19416110xj) && (liveCenterEntranceWidget = this.LIZIZ.get()) != null && (view = liveCenterEntranceWidget.getView()) != null) {
            if (!a0.LJJJIL(realtimeLiveCenterWhiteBoxPreviewIM.bigCardText)) {
                c12oe = C12OE.PREVIEW_WATCH_XL;
            } else {
                c12oe = C12OE.PREVIEW_WATCH;
            }
            LJFF(view, c12oe);
            if (!a0.LJJJIL(realtimeLiveCenterWhiteBoxPreviewIM.bigCardText)) {
                c19415510xd = new C19416110xj(view, realtimeLiveCenterWhiteBoxPreviewIM);
            } else {
                c19415510xd = new C19415510xd(realtimeLiveCenterWhiteBoxPreviewIM.viewer, view);
            }
            LIZLLL(c19415510xd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[PHI: r1
      0x0083: PHI (r1v4 java.lang.String) = (r1v1 java.lang.String), (r1v5 java.lang.String) binds: [B:25:0x0081, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087 A[PHI: r1
      0x0087: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:25:0x0081, B:27:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(java.util.List<webcast.data.RealtimeViolationRecord> r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12OA.LJJIII(java.util.List):void");
    }

    public final void LJJIIJ(boolean z) {
        DataChannel dataChannelLJI = LJI();
        if (dataChannelLJI != null) {
            ((IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).f10(dataChannelLJI, C1107810evz.LJJJJIZL, new C1107780evw(z, 2));
        }
    }

    public final void LJJIIZ(long j) {
        View view;
        if (LiveAnchorWhiteBox2Setting.INSTANCE.enable() || this.LIZLLL) {
            return;
        }
        C12O8 c12o8 = this.LIZJ;
        if (!(c12o8 instanceof C19415610xe)) {
            C12OE c12oe = C12OE.COLD_START;
            C12OY.LJIJ(LJI(), c12oe, (int) j, "show");
            LiveCenterEntranceWidget liveCenterEntranceWidget = this.LIZIZ.get();
            if (liveCenterEntranceWidget != null && (view = liveCenterEntranceWidget.getView()) != null) {
                LJFF(view, c12oe);
                C19415610xe c19415610xe = new C19415610xe(view);
                c19415610xe.LJIJJ(j);
                LIZLLL(c19415610xe);
                return;
            }
            return;
        }
        C19415610xe c19415610xe2 = (C19415610xe) c12o8;
        if (c19415610xe2 == null) {
            return;
        }
        C12OY.LJIJ(LJI(), C12OE.COLD_START, (int) j, "show");
        c19415610xe2.LJIJJ(j);
    }

    public final void LJFF(View view, C12OE c12oe) {
        boolean zLJIIIIZZ;
        switch (C12OC.LIZ[c12oe.ordinal()]) {
            case 1:
            case 2:
                zLJIIIIZZ = LJIIIIZZ(R.id.violation_area, view, true);
                break;
            case 3:
                zLJIIIIZZ = LJIIIIZZ(R.id.c8z, view, false);
                break;
            case 4:
            case 5:
                zLJIIIIZZ = LJIIIIZZ(R.id.yh9, view, true);
                break;
            case 6:
                zLJIIIIZZ = LJIIIIZZ(R.id.j8j, view, true);
                break;
            case 7:
                zLJIIIIZZ = LJIIIIZZ(R.id.j8m, view, true);
                break;
            case 8:
                zLJIIIIZZ = LJIIIIZZ(R.id.fht, view, true);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                zLJIIIIZZ = LJIIIIZZ(R.id.n0w, view, true);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                zLJIIIIZZ = LJIIIIZZ(R.id.mvg, view, true);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                zLJIIIIZZ = LJIIIIZZ(R.id.fap, view, true);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                zLJIIIIZZ = LJIIIIZZ(R.id.w15, view, true);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                zLJIIIIZZ = LJIIIIZZ(R.id.ghk, view, true);
                break;
            case 14:
                zLJIIIIZZ = LJIIIIZZ(R.id.rsm, view, true);
                break;
            case 15:
                zLJIIIIZZ = LJIIIIZZ(R.id.rsn, view, true);
                break;
            case 16:
                zLJIIIIZZ = LJIIIIZZ(R.id.jsv, view, false);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                zLJIIIIZZ = LJIIIIZZ(R.id.nqu, view, true);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                zLJIIIIZZ = LJIIIIZZ(R.id.vlk, view, true);
                break;
            default:
                return;
        }
        if (!zLJIIIIZZ) {
            return;
        }
        DataChannel dataChannelLJI = LJI();
        String key = c12oe.getKey();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_inflate");
        c474500IjALIZ.LJIJJLI(dataChannelLJI);
        c474500IjALIZ.LJJII(key, "icon_type");
        c474500IjALIZ.LJJII(Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannelLJI)), "room_id");
        c474500IjALIZ.LIZ();
    }

    public final void LJIIJJI(int i, String str) {
        C12O8 next;
        LiveCenterEntranceWidget liveCenterEntranceWidget;
        View view;
        Iterator<C12O8> it2 = this.LIZ.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (next.LIZ != C12OE.BOOST_CARD);
        if ((!(next instanceof C19415910xh) || next == null) && (liveCenterEntranceWidget = this.LIZIZ.get()) != null && (view = liveCenterEntranceWidget.getView()) != null) {
            LJFF(view, C12OE.BOOST_CARD);
            C19415910xh c19415910xh = new C19415910xh(view);
            if (i != 1) {
                if (i == 2) {
                    C1143680frq.LIZLLL(c19415910xh.LJFF, "tiktok_live_broadcast_demand_2", "ttlive_prop_promote_coupon.png");
                    TextView textView = c19415910xh.LJI;
                    if (textView != null) {
                        textView.setText(C497740JfY.LJIJI(2131856004));
                    }
                }
            } else {
                ImageView imageView = c19415910xh.LJFF;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ek6);
                }
                TextView textView2 = c19415910xh.LJI;
                if (textView2 != null) {
                    textView2.setText(C497740JfY.LJIJI(2131841690));
                }
            }
            C16F5 c16f5 = c19415910xh.LJII;
            if (c16f5 != null) {
                c16f5.setText(str);
            }
            LIZLLL(c19415910xh);
        }
    }

    public final void LJIIL(long j, boolean z) {
        if (this.LIZLLL) {
            return;
        }
        C12O8 c12o8 = null;
        if (z) {
            this.LIZLLL = false;
            C12O8 c12o82 = this.LIZJ;
            if (c12o82 != null && c12o82.LIZIZ > 1) {
                return;
            }
            Iterator<C12O8> it2 = this.LIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C12O8 next = it2.next();
                if (next.LIZ == C12OE.COLD_START) {
                    if (next != null) {
                        return;
                    }
                }
            }
            C20441214yg.LIZIZ("LiveCenterStateManager::20min", "schedule Cold Start");
            C473410IhP.LIZJ(new ARunnableS128S0100000_28(this, 108), 1200000L);
            LJJIIZ(j);
            return;
        }
        Iterator<C12O8> it3 = this.LIZ.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C12O8 next2 = it3.next();
            if (next2.LIZ == C12OE.COLD_START) {
                c12o8 = next2;
                break;
            }
        }
        C12O8 c12o83 = c12o8;
        if (c12o83 != null) {
            this.LIZLLL = true;
            LJIILIIL(c12o83, true);
        }
    }

    public final void LJIILIIL(C12O8 c12o8, boolean z) {
        Integer numValueOf;
        String strLJJLIIIJ;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try remove state: ");
        sbLIZ.append(c12o8.LJIIIZ());
        sbLIZ.append(", shouldCheck: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MainFrame#LC", C2188811AlT.LIZIZ(sbLIZ));
        if (z && LJIIIZ(c12o8)) {
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannelLJI = LJI();
            C19775612Yw c19775612Yw = C19775612Yw.get$arr$(2);
            List listSingletonList = Collections.singletonList(C1107810evz.LJJJJIZL.LIZ);
            c1102070emj.getClass();
            List listLJJIIJZLJL = C1102070emj.LJJIIJZLJL(dataChannelLJI, c19775612Yw, listSingletonList);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PeekList: ");
            if (listLJJIIJZLJL != null) {
                numValueOf = Integer.valueOf(listLJJIIJZLJL.size());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(' ');
            if (listLJJIIJZLJL != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(listLJJIIJZLJL, null, null, null, 0, null, AFwS273S0000000_29.get$arr$(364), 31);
            } else {
                strLJJLIIIJ = null;
            }
            sbLIZ2.append(strLJJLIIIJ);
            C20441214yg.LIZIZ("MainFrame#LC", C2188811AlT.LIZIZ(sbLIZ2));
            if (listLJJIIJZLJL != null && !listLJJIIJZLJL.isEmpty()) {
                Iterator it2 = listLJJIIJZLJL.iterator();
                while (it2.hasNext()) {
                    if (((C1088780eRI) it2.next()).LIZIZ == 4) {
                        C12OI c12oi = this.LJIIL;
                        if (c12oi != null) {
                            C12O8 c12o82 = c12oi.LIZIZ;
                            if ((c12o82 instanceof C12O7) || (c12o82 instanceof C12O6)) {
                                LJJIIJ(false);
                                this.LJIIL = null;
                                return;
                            }
                        }
                        C1102070emj c1102070emj2 = C1102070emj.LIZ;
                        DataChannel dataChannelLJI2 = LJI();
                        C12OI c12oi2 = this.LJIIL;
                        if (c12oi2 != null) {
                            str = c12oi2.LIZ;
                        } else {
                            str = null;
                        }
                        c1102070emj2.getClass();
                        C1102070emj.LJIIL(dataChannelLJI2, 2, str);
                        this.LJIIL = null;
                        LJIILJJIL(c12o8);
                        return;
                    }
                }
            }
            LJIILJJIL(c12o8);
            return;
        }
        LJIILJJIL(c12o8);
    }

    public final void LJIILL(String str, C128V c128v) {
        int i;
        AbstractC19416810xq abstractC19416810xq;
        String type;
        C19416310xl c19416310xl;
        String type2;
        C19416410xm c19416410xm;
        String str2;
        C19416410xm c19416410xm2;
        String str3;
        C19416410xm c19416410xm3;
        String type3;
        C19415710xf c19415710xf;
        C19415610xe c19415610xe;
        C12O7 c12o7;
        C12OE c12oe;
        C12OE c12oe2;
        C12O8 c12o8 = this.LIZJ;
        DataChannel dataChannel = null;
        if (c12o8 != null && (c12oe2 = c12o8.LIZ) != null) {
            i = C12OC.LIZ[c12oe2.ordinal()];
        } else {
            i = -1;
        }
        long jCurrentTimeMillis = 0;
        String str4 = "";
        switch (i) {
            case 1:
                C12O8 c12o82 = this.LIZJ;
                if ((c12o82 instanceof C12O7) && (c12o7 = (C12O7) c12o82) != null) {
                    c12o7.LJJIFFI(str);
                    break;
                }
                break;
            case 2:
            case 3:
            case 8:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case 16:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            default:
                DataChannel dataChannelLJI = LJI();
                C12O8 c12o83 = this.LIZJ;
                if (c12o83 == null || (c12oe = c12o83.LIZ) == null) {
                    c12oe = C12OE.DEFAULT;
                }
                C12OY.LJIJ(dataChannelLJI, c12oe, 0, str);
                break;
            case 4:
                C12O8 c12o84 = this.LIZJ;
                if ((c12o84 instanceof C19415610xe) && (c19415610xe = (C19415610xe) c12o84) != null) {
                    C12OY.LJIJ(LJI(), C12OE.COLD_START, (int) c19415610xe.LJIIIIZZ, str);
                    break;
                }
                break;
            case 5:
                C12O8 c12o85 = this.LIZJ;
                if ((c12o85 instanceof C19415710xf) && (c19415710xf = (C19415710xf) c12o85) != null) {
                    C12OY.LJIILJJIL(LJI(), c19415710xf.LIZ, new HashMap(), str, (int) c19415710xf.LJIIIZ);
                    break;
                }
                break;
            case 6:
            case 7:
                C12O8 c12o86 = this.LIZJ;
                if ((c12o86 instanceof C12OL) && c12o86 != null) {
                    C12OY.LJIILJJIL(LJI(), c12o86.LIZ, c12o86.LJIIJ(str), str, 0);
                    break;
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                C12O8 c12o87 = this.LIZJ;
                if ((c12o87 instanceof C12ON) && c12o87 != null) {
                    C12OY.LJIILJJIL(LJI(), c12o87.LIZ, c12o87.LJIIJ(str), str, 0);
                    break;
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C12O8 c12o88 = this.LIZJ;
                if ((c12o88 instanceof C12OO) && c12o88 != null) {
                    LiveCenterEntranceWidget liveCenterEntranceWidget = this.LIZIZ.get();
                    if (liveCenterEntranceWidget != null) {
                        dataChannel = liveCenterEntranceWidget.dataChannel;
                    }
                    C12OY.LJIILJJIL(dataChannel, c12o88.LIZ, c12o88.LJIIJ(str), str, 0);
                    break;
                }
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                C12O8 c12o89 = this.LIZJ;
                if ((c12o89 instanceof C19416410xm) && (c19416410xm = (C19416410xm) c12o89) != null) {
                    if (Intrinsics.LJFF(str, "click")) {
                        c19416410xm.LJIIIZ = true;
                        DataChannel dataChannelLJI2 = LJI();
                        String str5 = c19416410xm.LJ.messageKey;
                        if (c128v != null && (type3 = c128v.getType()) != null) {
                            str4 = type3;
                        }
                        if (c19416410xm.LJIIL != 0) {
                            jCurrentTimeMillis = System.currentTimeMillis() - c19416410xm.LJIIL;
                        }
                        C12OY.LJIIL(dataChannelLJI2, str5, str4, jCurrentTimeMillis, c19416410xm.LJ.suggestionTemplateId, null, false, 224);
                    } else {
                        DataChannel dataChannelLJI3 = LJI();
                        C12O8 c12o810 = this.LIZJ;
                        boolean z = c12o810 instanceof C19416410xm;
                        if (!z || (c19416410xm3 = (C19416410xm) c12o810) == null || (str2 = c19416410xm3.LJ.messageKey) == null) {
                            str2 = "";
                        }
                        if (z && (c19416410xm2 = (C19416410xm) c12o810) != null && (str3 = c19416410xm2.LJ.suggestionTemplateId) != null) {
                            str4 = str3;
                        }
                        C12OY.LJIILIIL(dataChannelLJI3, str2, str4, null, false, 56);
                    }
                    break;
                }
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C12O8 c12o811 = this.LIZJ;
                if ((c12o811 instanceof C19416310xl) && (c19416310xl = (C19416310xl) c12o811) != null) {
                    if (Intrinsics.LJFF(str, "click")) {
                        c19416310xl.LJIIIZ = true;
                        DataChannel dataChannelLJI4 = LJI();
                        String str6 = c19416310xl.LJ.messageKey;
                        if (c128v != null && (type2 = c128v.getType()) != null) {
                            str4 = type2;
                        }
                        if (c19416310xl.LJIIJ != 0) {
                            jCurrentTimeMillis = System.currentTimeMillis() - c19416310xl.LJIIJ;
                        }
                        C12OY.LJIIL(dataChannelLJI4, str6, str4, jCurrentTimeMillis, c19416310xl.LJ.suggestionTemplateId, "ec_live_copilot", false, 192);
                    } else {
                        DataChannel dataChannelLJI5 = LJI();
                        AnchorReminderWordInfoMsg anchorReminderWordInfoMsg = c19416310xl.LJ;
                        C12OY.LJIILIIL(dataChannelLJI5, anchorReminderWordInfoMsg.messageKey, anchorReminderWordInfoMsg.suggestionTemplateId, "ec_live_copilot", false, 48);
                    }
                    break;
                }
                break;
            case 14:
            case 15:
                C12O8 c12o812 = this.LIZJ;
                if (c12o812 != null) {
                    C12OY.LJIILJJIL(LJI(), c12o812.LIZ, c12o812.LJIIJ(str), str, 0);
                }
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                C12O8 c12o813 = this.LIZJ;
                if ((c12o813 instanceof C19416010xi) && c12o813 != null) {
                    C12OY.LJIILJJIL(LJI(), c12o813.LIZ, c12o813.LJIIJ(str), str, 0);
                    break;
                }
                break;
            case 19:
                C12O8 c12o814 = this.LIZJ;
                if ((c12o814 instanceof AbstractC19416810xq) && (abstractC19416810xq = (AbstractC19416810xq) c12o814) != null) {
                    if (Intrinsics.LJFF(str, "click")) {
                        if (c128v != null && (type = c128v.getType()) != null) {
                            str4 = type;
                        }
                        abstractC19416810xq.LJJI(str4);
                    } else {
                        C12OY.LJIILIIL(LJI(), abstractC19416810xq.LJIJJLI(), abstractC19416810xq.LJIL(), null, abstractC19416810xq.LJJ(), 40);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.12O8, X.12OP] */
    public final void LJIIZILJ(String str, boolean z) {
        final View view;
        if (a0.LJJJIL(str)) {
            return;
        }
        C12O8 c12o8 = this.LIZJ;
        if (c12o8 instanceof C12OP) {
            C12OP c12op = (C12OP) c12o8;
            if (c12op != null) {
                c12op.LJIJJ(str, z);
                return;
            }
            return;
        }
        LiveCenterEntranceWidget liveCenterEntranceWidget = this.LIZIZ.get();
        if (liveCenterEntranceWidget == null || (view = liveCenterEntranceWidget.getView()) == null) {
            return;
        }
        LJFF(view, C12OE.DECOUPLING);
        ?? r0 = new C12OM(view) { // from class: X.12OP
            @Override // X.C12O8
            public final int LJIIIZ() {
                return 79;
            }

            @Override // X.C12O8
            public final boolean LJIJ(C12O8 c12o82) {
                return true;
            }

            {
                super(view, C12OE.DECOUPLING, 7);
                this.LJFF = view.findViewById(R.id.fht);
                this.LJI = view.findViewById(R.id.fhx);
                this.LJII = (C19728712Gv) view.findViewById(R.id.fhy);
                this.LJIIIZ = view.findViewById(R.id.e8u);
            }

            @Override // X.C12OM, X.C12O8
            public final void LJIILLIIL(C19MB c19mb) {
                super.LJIILLIIL(c19mb);
                C1143680frq.LJ(this.LJI, "tiktok_live_broadcast_demand_8", "live_center_entrance_rewards.png", ImageView.ScaleType.CENTER_CROP);
            }

            public final void LJIJJ(String str2, boolean z2) {
                if (a0.LJJJIL(str2)) {
                    return;
                }
                if (!z2) {
                    View view2 = this.LJI;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                } else {
                    View view3 = this.LJI;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                    C1143680frq.LJ(this.LJI, "tiktok_live_broadcast_demand_8", "live_center_entrance_rewards.png", ImageView.ScaleType.CENTER_CROP);
                }
                C19728712Gv c19728712Gv = this.LJII;
                if (c19728712Gv != null) {
                    boolean zLJJ = C497740JfY.LJJ();
                    c19728712Gv.LLJJ = 1;
                    c19728712Gv.LIZ(str2, zLJJ);
                }
                C19728712Gv c19728712Gv2 = this.LJII;
                if (c19728712Gv2 != null) {
                    c19728712Gv2.requestFocus();
                }
                C19728712Gv c19728712Gv3 = this.LJII;
                if (c19728712Gv3 != null) {
                    c19728712Gv3.LIZIZ();
                }
                C473410IhP.LJ(this.LJIIJJI);
                C473410IhP.LIZJ(this.LJIIJJI, LiveCenterGrowthDisplayTimeSetting.INSTANCE.getValue());
            }
        };
        r0.LJIJJ(str, z);
        LIZLLL(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.12O8, X.12ON] */
    public final void LJIJI(String str, LiveJourneyImMessage liveJourneyImMessage) {
        C12O8 next;
        final View view;
        C12ON c12on;
        if (a0.LJJJIL(str)) {
            return;
        }
        C12O8 c12o8 = this.LIZJ;
        if (c12o8 instanceof C12ON) {
            C12ON c12on2 = (C12ON) c12o8;
            if (c12on2 != null) {
                c12on2.LJIJJ(str, liveJourneyImMessage, true);
                return;
            }
            return;
        }
        Iterator<C12O8> it2 = this.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C12ON) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C12O8 c12o82 = next;
        if (c12o82 != null) {
            if (!(c12o82 instanceof C12ON) || (c12on = (C12ON) c12o82) == null) {
                return;
            }
            c12on.LJIJJ(str, liveJourneyImMessage, false);
            return;
        }
        LiveCenterEntranceWidget liveCenterEntranceWidget = this.LIZIZ.get();
        if (liveCenterEntranceWidget == null || (view = liveCenterEntranceWidget.getView()) == null) {
            return;
        }
        LJFF(view, C12OE.LIVE_JOURNEY_2);
        ?? r0 = new C12OM(view) { // from class: X.12ON
            public static final /* synthetic */ int LJIILIIL = 0;
            public LiveJourneyImMessage LJIIL;

            @Override // X.C12O8
            public final int LJIIIZ() {
                return 77;
            }

            @Override // X.C12O8
            public final boolean LJIJ(C12O8 c12o83) {
                return true;
            }

            {
                super(view, C12OE.LIVE_JOURNEY_2, 3);
                this.LJFF = view.findViewById(R.id.n0w);
                this.LJI = view.findViewById(R.id.n11);
                this.LJII = (C19728712Gv) view.findViewById(R.id.n1a);
                this.LJIIIZ = view.findViewById(R.id.e8u);
            }

            @Override // X.C12O8
            public final Map<String, String> LJIIJ(String str2) {
                long j;
                int i;
                Pair[] pairArr = new Pair[2];
                LiveJourneyImMessage liveJourneyImMessage2 = this.LJIIL;
                if (liveJourneyImMessage2 != null) {
                    j = liveJourneyImMessage2.level;
                } else {
                    j = 1;
                }
                pairArr[0] = new Pair("anchor_level", String.valueOf(j));
                LiveJourneyImMessage liveJourneyImMessage3 = this.LJIIL;
                if (liveJourneyImMessage3 != null) {
                    i = liveJourneyImMessage3.type;
                } else {
                    i = 1;
                }
                pairArr[1] = new Pair("livejourney_type", String.valueOf(i));
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            public final void LJIJJ(String str2, LiveJourneyImMessage liveJourneyImMessage2, boolean z) {
                this.LJIIL = liveJourneyImMessage2;
                if (a0.LJJJIL(str2)) {
                    return;
                }
                View view2 = this.LJI;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                C19728712Gv c19728712Gv = this.LJII;
                if (c19728712Gv != null) {
                    boolean zLJJ = C497740JfY.LJJ();
                    c19728712Gv.LLJJ = 1;
                    c19728712Gv.LIZ(str2, zLJJ);
                }
                C19728712Gv c19728712Gv2 = this.LJII;
                if (c19728712Gv2 != null) {
                    c19728712Gv2.requestFocus();
                }
                C19728712Gv c19728712Gv3 = this.LJII;
                if (c19728712Gv3 != null) {
                    c19728712Gv3.LIZIZ();
                }
                if (z) {
                    C473410IhP.LJ(this.LJIIJJI);
                    C473410IhP.LIZJ(this.LJIIJJI, LiveCenterGrowthDisplayTimeSetting.INSTANCE.getValue());
                }
            }
        };
        r0.LJIJJ(str, liveJourneyImMessage, false);
        LIZLLL(r0);
    }

    public static boolean LJIIIIZZ(int i, View view, boolean z) {
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) viewFindViewById;
            if (viewStub.getParent() != null) {
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                viewLJLLLL.setLayoutDirection(C497740JfY.LJJ() ? 1 : 0);
                if (z) {
                    C786410Ut5.T4(viewLJLLLL, 0.0f);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJIJJ(C12OA c12oa, C12O8 c12o8, C12O8 c12o82) {
        Integer numValueOf;
        c12oa.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toShow: ");
        Integer numValueOf2 = null;
        if (c12o8 != null) {
            numValueOf = Integer.valueOf(c12o8.LJIIIZ());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", toHide: ");
        if (c12o82 != null) {
            numValueOf2 = Integer.valueOf(c12o82.LJIIIZ());
        }
        sbLIZ.append(numValueOf2);
        C20441214yg.LIZIZ("MainFrame#LC", C2188811AlT.LIZIZ(sbLIZ));
        if (c12o82 != null) {
            if ((c12o82 instanceof C12O7) || (c12o82 instanceof C12O6)) {
                c12oa.LJJIIJ(false);
            }
            c12o82.LJIILIIL(new C12OB(c12oa, c12o8, 0), new AwS238S0300000_29(c12oa, c12o8, c12o82, 32));
            return;
        }
        if (c12o8 == null) {
            return;
        }
        c12o8.LJIILJJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.12O8, X.12OL] */
    public final void LJIJ(String str, boolean z, AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV2) {
        final View view;
        if ((!this.LJ.isEmpty()) || a0.LJJJIL(str)) {
            return;
        }
        C12O8 c12o8 = this.LIZJ;
        if (c12o8 instanceof C12OL) {
            C12OL c12ol = (C12OL) c12o8;
            if (c12ol != null) {
                c12ol.LJIJJ(str, z, anchorGrowLevelImMsgV2);
                return;
            }
            return;
        }
        LiveCenterEntranceWidget liveCenterEntranceWidget = this.LIZIZ.get();
        if (liveCenterEntranceWidget == null || (view = liveCenterEntranceWidget.getView()) == null) {
            return;
        }
        LJFF(view, C12OE.GROWTH_MVP_REWARD);
        ?? r0 = new C12OM(view) { // from class: X.12OL
            public AnchorGrowLevelImMsgV2 LJIIL;

            @Override // X.C12O8
            public final int LJIIIZ() {
                return 78;
            }

            {
                super(view, C12OE.GROWTH_MVP_REWARD, 3);
                this.LJFF = view.findViewById(R.id.j8m);
                this.LJI = view.findViewById(R.id.j8n);
                this.LJII = (C19728712Gv) view.findViewById(R.id.j8o);
                this.LJIIIZ = view.findViewById(R.id.e8t);
            }

            @Override // X.C12O8
            public final Map<String, String> LJIIJ(String str2) {
                Integer numValueOf;
                long j;
                AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification;
                if (Intrinsics.LJFF(str2, "click")) {
                    Pair[] pairArr = new Pair[2];
                    AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV22 = this.LJIIL;
                    if (anchorGrowLevelImMsgV22 != null) {
                        numValueOf = Integer.valueOf(anchorGrowLevelImMsgV22.msgType);
                    } else {
                        numValueOf = null;
                    }
                    pairArr[0] = new Pair("growthjourney_type", C12OY.LJIJJLI(numValueOf));
                    AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV23 = this.LJIIL;
                    if (anchorGrowLevelImMsgV23 != null && (anchorGrowLevelImMsgNotification = anchorGrowLevelImMsgV23.notificationData) != null) {
                        j = anchorGrowLevelImMsgNotification.level;
                    } else {
                        j = -1;
                    }
                    pairArr[1] = new Pair("growth_stage", String.valueOf(j));
                    return C2097608Jq.LJI(pairArr);
                }
                return new HashMap();
            }

            @Override // X.C12O8
            public final boolean LJIJ(C12O8 c12o82) {
                return c12o82 instanceof C12O7;
            }

            public final void LJIJJ(String str2, boolean z2, AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV22) {
                this.LJIIL = anchorGrowLevelImMsgV22;
                if (a0.LJJJIL(str2)) {
                    return;
                }
                if (!z2) {
                    View view2 = this.LJI;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                } else {
                    View view3 = this.LJI;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                }
                C19728712Gv c19728712Gv = this.LJII;
                if (c19728712Gv != null) {
                    boolean zLJJ = C497740JfY.LJJ();
                    c19728712Gv.LLJJ = 1;
                    c19728712Gv.LIZ(str2, zLJJ);
                }
                C19728712Gv c19728712Gv2 = this.LJII;
                if (c19728712Gv2 != null) {
                    c19728712Gv2.requestFocus();
                }
            }
        };
        r0.LJIJJ(str, z, anchorGrowLevelImMsgV2);
        LIZLLL(r0);
    }
}
