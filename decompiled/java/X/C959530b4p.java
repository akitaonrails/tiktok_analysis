package X;

import Y.AfS184S0100000_15;
import Y.AfS82S0101000_15;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.InteractUnifiedStateChangeChannel;
import com.bytedance.android.live.liveinteract.api.LinkCoHostLeaveChannel;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.linkroom.QuickCoHostRequestingEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.event.QuickCoHostStateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.ui.interactsolo.QuickCoHostInteractSoloHostWidget;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.level.FansClubCohostForSuperFanOnlyLiveSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.AutoMatchKeepAliveDuringCohostEnabledSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RandomLinkMicKeepLiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RandomLinkMicKeepLiveIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostLayoutChangeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveQuickCohostPreFilterSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.QuickCohostResetStartTimeOnCancelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RevenueAlogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0b4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959530b4p implements InterfaceC962210b99 {
    public final DataChannel LIZ;
    public final Room LIZIZ;
    public C959820b5I LIZJ;
    public C959540b4q LIZLLL;
    public C959550b4r LJ;
    public C959490b4l LJFF;
    public final C960000b5a LJI;
    public C959620b4y LJII;
    public C956340azg LJIIIIZZ;
    public RecyclableWidgetManager LJIIIZ;
    public QuickCoHostInteractSoloHostWidget LJIIJ;
    public final C11NJ LJIIJJI = new C11NJ();
    public boolean LJIIL;
    public final C959560b4s LJIILIIL;

    public final void LIZLLL() {
        e0(null);
        this.LJII = null;
        C959820b5I c959820b5I = this.LIZJ;
        if (c959820b5I != null) {
            c959820b5I.LIZ();
        }
        this.LIZJ = null;
        C959540b4q c959540b4q = this.LIZLLL;
        if (c959540b4q != null) {
            c959540b4q.LIZJ();
        }
        this.LIZLLL = null;
        C959550b4r c959550b4r = this.LJ;
        if (c959550b4r != null) {
            c959550b4r.LIZJ();
        }
        this.LJ = null;
        C959490b4l c959490b4l = this.LJFF;
        if (c959490b4l != null) {
            c959490b4l.LIZ = 0;
            ((ArrayList) c959490b4l.LIZIZ).clear();
            c959490b4l.LIZJ = null;
            c959490b4l.LIZLLL = null;
        }
        this.LJFF = null;
        C915980Zwa.LJIIIZ().LJI();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        if (LiveCohostLayoutChangeSetting.INSTANCE.isEnable()) {
            C915980Zwa.LJIIIIZZ().vq0(this.LJIILIIL);
        }
        this.LJIIJJI.dispose();
    }

    @Override // X.InterfaceC962190b97
    public final C959600b4w c0() {
        C959620b4y c959620b4y = this.LJII;
        if (c959620b4y != null) {
            return c959620b4y.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC962190b97
    public final EnumC958840b3i d0() {
        EnumC958840b3i enumC958840b3i;
        C959620b4y c959620b4y = this.LJII;
        return (c959620b4y == null || (enumC958840b3i = c959620b4y.LJIIIIZZ) == null) ? EnumC958840b3i.UNKNOWN : enumC958840b3i;
    }

    @Override // X.InterfaceC962190b97
    public final EnumC958900b3o k0() {
        EnumC958900b3o enumC958900b3oY2;
        C959620b4y c959620b4y = this.LJII;
        return (c959620b4y == null || (enumC958900b3oY2 = c959620b4y.Y2()) == null) ? EnumC958900b3o.NONE : enumC958900b3oY2;
    }

    @Override // X.InterfaceC962190b97
    public final C214831195p m0() {
        QuickCoHostInteractSoloHostWidget quickCoHostInteractSoloHostWidget = this.LJIIJ;
        if (quickCoHostInteractSoloHostWidget != null) {
            return quickCoHostInteractSoloHostWidget.LL;
        }
        return null;
    }

    public final void LJFF() {
        if (C1152520g66.LIZ()) {
            C480460Ism.LIZ().getClass();
            this.LJIIJJI.LIZ(((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).requestOffliveInviteInfo(3, 0L).LJFF(new C0UO0()).LJJIIZ(new AfS184S0100000_15(this, 11), new C09JN() { // from class: X.0b5O
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("QuickCoHostManager@2d13.seedPreferenceCacheFromCheckpoint$sub$2");
                    C20441214yg.LJFF("QuickCoHostManager", "seedPreferenceCacheFromCheckpoint error", (Throwable) obj);
                    C1C7U.LIZIZ("QuickCoHostManager@2d13.seedPreferenceCacheFromCheckpoint$sub$2");
                }
            }));
        } else {
            InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
            C13BV c13bv = C13BV.INSTANCE;
            interfaceC955420ayCLIZ.LLJJIJI(c13bv);
            C915980Zwa.LJI().LIZ().LJIL(c13bv);
            C20441214yg.LJIIIZ("QuickCoHostManager", "seedPreferenceCacheFromCheckpoint skipped — preference match off");
        }
    }

    @Override // X.InterfaceC962190b97
    public final boolean a0() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC962190b97
    public final C956340azg f0() {
        return this.LJIIIIZZ;
    }

    public final void LJ(long j) {
        Long lValueOf;
        C214831195p c214831195pM0;
        C959600b4w c959600b4w;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstFrameRender frameUserId = ");
        sbLIZ.append(j);
        sbLIZ.append(", rivalUserId = ");
        C959620b4y c959620b4y = this.LJII;
        if (c959620b4y != null && (c959600b4w = c959620b4y.LIZIZ) != null) {
            lValueOf = Long.valueOf(c959600b4w.LJIILLIIL);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C20441214yg.LIZIZ("QuickCoHostManager", C2188811AlT.LIZIZ(sbLIZ));
        C959620b4y c959620b4y2 = this.LJII;
        if (c959620b4y2 != null) {
            C959600b4w c959600b4w2 = c959620b4y2.LIZIZ;
            if (c959600b4w2 != null && c959600b4w2.LJIILLIIL == j) {
                C959600b4w c959600b4w3 = c959620b4y2.LIZIZ;
                if (c959600b4w3 != null) {
                    c959600b4w3.LJIJJLI = true;
                    c959600b4w3.LJIL = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onFirstFrameRender frameUserId = ");
                sbLIZ2.append(j);
                sbLIZ2.append(' ');
                C20441214yg.LIZIZ("QuickCoHostManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (C1152520g66.LIZIZ() && (c214831195pM0 = m0()) != null) {
                    c214831195pM0.LIZ(C960240b5y.LIZ);
                    return;
                }
                return;
            }
            C959600b4w c959600b4w4 = c959620b4y2.LIZIZ;
            if (c959600b4w4 != null) {
                c959600b4w4.LJIJJLI = false;
                c959600b4w4.LJIL = 0L;
            }
        }
        C20441214yg.LIZIZ("QuickCoHostManager", "onFirstFrameRender reset static data");
    }

    public final void LJI(boolean z) {
        this.LJIIL = z;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.LC0(QuickCoHostRequestingEvent.class, Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC962190b97
    public final void e0(RecyclableWidgetManager recyclableWidgetManager) {
        RecyclableWidgetManager recyclableWidgetManager2;
        if (recyclableWidgetManager != null) {
            if (!C1152520g66.LIZIZ()) {
                C20441214yg.LJIIIZ("QuickCoHostManager", "bindWidgetManager — skipped INTERACT_SOLO load (layout experiment off)");
                return;
            }
            QuickCoHostInteractSoloHostWidget quickCoHostInteractSoloHostWidget = this.LJIIJ;
            if (quickCoHostInteractSoloHostWidget != null) {
                C20441214yg.LJIIL("QuickCoHostManager", "bindWidgetManager — re-entrance, unloading previous host widget");
                RecyclableWidgetManager recyclableWidgetManager3 = this.LJIIIZ;
                if (recyclableWidgetManager3 != null) {
                    recyclableWidgetManager3.unload(quickCoHostInteractSoloHostWidget);
                }
            }
            QuickCoHostInteractSoloHostWidget quickCoHostInteractSoloHostWidget2 = new QuickCoHostInteractSoloHostWidget();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindWidgetManager — loading host widget dataChannel=");
            sbLIZ.append(this.LIZ);
            C20441214yg.LIZIZ("QuickCoHostManager", C2188811AlT.LIZIZ(sbLIZ));
            recyclableWidgetManager.doLoad(R.id.kve, quickCoHostInteractSoloHostWidget2, false, new Object[]{this.LIZ});
            this.LJIIIZ = recyclableWidgetManager;
            this.LJIIJ = quickCoHostInteractSoloHostWidget2;
            return;
        }
        C20441214yg.LIZIZ("QuickCoHostManager", "bindWidgetManager — unloading host widget");
        QuickCoHostInteractSoloHostWidget quickCoHostInteractSoloHostWidget3 = this.LJIIJ;
        if (quickCoHostInteractSoloHostWidget3 != null && (recyclableWidgetManager2 = this.LJIIIZ) != null) {
            recyclableWidgetManager2.unload(quickCoHostInteractSoloHostWidget3);
        }
        this.LJIIIZ = null;
        this.LJIIJ = null;
    }

    @Override // X.InterfaceC962190b97
    public final void h0(C956340azg c956340azg) {
        this.LJIIIIZZ = c956340azg;
    }

    @Override // X.InterfaceC962190b97
    public final long j0(long j) {
        if (this.LJ != null) {
            return C959550b4r.LJ(j);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC962190b97
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel r11) {
        /*
            r10 = this;
            com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r0 = r11.linkLayerMessage
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r0 = r0.bizContent
            r4 = 0
            if (r0 == 0) goto L27
            webcast.im.CohostContent r0 = r0.cohostContent
            if (r0 == 0) goto L27
            webcast.im.JoinGroupDirectBizContent r0 = r0.joinGroupDirectBizContent
            if (r0 == 0) goto L27
            com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent r0 = r0.randomMatchContent
            if (r0 == 0) goto L27
            long r2 = r0.pairedTime
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L27
            X.0azg r1 = new X.0azg
            r1.<init>()
            X.07tI r0 = X.EnumC2005007tI.JOIN_GROUP_DIRECT_MSG
            r1.LIZ = r0
            r1.LIZIZ = r2
            r10.LJIIIIZZ = r1
        L27:
            X.0b4y r0 = r10.LJII
            r7 = 0
            if (r0 == 0) goto Lb1
            X.0b3i r0 = r0.LJIIIIZZ
        L2e:
            X.0b3i r5 = X.EnumC958840b3i.UNKNOWN
            if (r0 != r5) goto La1
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r0 = r11.businessContent
            if (r0 == 0) goto Lae
            webcast.im.CohostContent r0 = r0.cohostContent
            if (r0 == 0) goto Lae
            webcast.im.JoinGroupDirectBizContent r0 = r0.joinGroupDirectBizContent
            if (r0 == 0) goto Lae
            com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent r0 = r0.randomMatchContent
            if (r0 == 0) goto Lae
            long r0 = r0.sourceType
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            if (r9 == 0) goto Laf
            long r1 = r9.longValue()
            int r0 = (int) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L53:
            boolean r8 = X.C957990b2L.LJ(r0)
            if (r9 == 0) goto Lac
            long r1 = r9.longValue()
            int r0 = (int) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L62:
            boolean r6 = X.C957990b2L.LJI(r0)
            if (r9 == 0) goto Laa
            long r1 = r9.longValue()
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L71:
            X.01GW r4 = X.C957990b2L.LIZIZ
            java.lang.Object r0 = r4.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = X.C13LP.LJJJJ(r1, r0)
            if (r9 == 0) goto L88
            long r1 = r9.longValue()
            int r0 = (int) r1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L88:
            java.lang.Object r0 = r4.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r0 = X.C13LP.LJJJJ(r7, r0)
            if (r3 != 0) goto La7
            if (r0 != 0) goto La7
            if (r8 == 0) goto La2
            X.0b3i r5 = X.EnumC958840b3i.QUICK_PAIR
        L9a:
            X.0b4y r0 = r10.LJII
            if (r0 == 0) goto La1
            r0.LJII(r5)
        La1:
            return
        La2:
            if (r6 == 0) goto L9a
            X.0b3i r5 = X.EnumC958840b3i.QUICK_RECOMMEND
            goto L9a
        La7:
            X.0b3i r5 = X.EnumC958840b3i.QUICK_BATTLE
            goto L9a
        Laa:
            r1 = r7
            goto L71
        Lac:
            r0 = r7
            goto L62
        Lae:
            r9 = r7
        Laf:
            r0 = r7
            goto L53
        Lb1:
            r0 = r7
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C959530b4p.l0(com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel):void");
    }

    @Override // X.InterfaceC962190b97
    public final long n0(long j) {
        if (this.LIZLLL != null) {
            return C959540b4q.LJ(j);
        }
        return 0L;
    }

    @Override // X.InterfaceC962200b98
    public final void LIZ(EnumC959580b4u enumC959580b4u, InterfaceC914930Zut<C960260b60> interfaceC914930Zut) {
        switch (C959570b4t.LIZIZ[enumC959580b4u.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                C959620b4y c959620b4y = this.LJII;
                if (c959620b4y != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onQuickCoHostCancelButtonClick");
                    sbLIZ.append(" current status = ");
                    sbLIZ.append(c959620b4y.Y2());
                    sbLIZ.append(" exitType = ");
                    sbLIZ.append(enumC959580b4u);
                    C20441214yg.LJIIIZ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = c959620b4y.LJII;
                    if (interfaceC959610b4x != null) {
                        interfaceC959610b4x.LJIIIIZZ(enumC959580b4u, interfaceC914930Zut);
                    }
                }
                break;
            case 6:
                C959620b4y c959620b4y2 = this.LJII;
                if (c959620b4y2 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onGroupChannelIdChanged");
                    sbLIZ2.append(" current status = ");
                    sbLIZ2.append(c959620b4y2.Y2());
                    C20441214yg.LJIIIZ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x2 = c959620b4y2.LJII;
                    if (interfaceC959610b4x2 != null) {
                        interfaceC959610b4x2.LJFF();
                    }
                }
                break;
            case 7:
                C959620b4y c959620b4y3 = this.LJII;
                if (c959620b4y3 != null) {
                    C20441214yg.LIZIZ("QuickCoHostEngine", "onRoomClose");
                    InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x3 = c959620b4y3.LJII;
                    if (interfaceC959610b4x3 != null) {
                        interfaceC959610b4x3.LJIJ();
                    }
                }
                break;
            case 8:
                C959620b4y c959620b4y4 = this.LJII;
                if (c959620b4y4 != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onKeepAliveFailed, current status = ");
                    sbLIZ3.append(c959620b4y4.Y2());
                    C20441214yg.LJ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ3));
                    InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x4 = c959620b4y4.LJII;
                    if (interfaceC959610b4x4 != null) {
                        interfaceC959610b4x4.LJIIZILJ();
                    }
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C959620b4y c959620b4y5 = this.LJII;
                if (c959620b4y5 != null) {
                    if (!LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
                        C20441214yg.LIZIZ("QuickCoHostEngine", "team pair is not enabled. skip quit quick co-host for team pair");
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("quitQuickCoHostForTeamPair, current status = ");
                        sbLIZ4.append(c959620b4y5.Y2());
                        sbLIZ4.append(", exitType=");
                        sbLIZ4.append(enumC959580b4u);
                        C20441214yg.LIZIZ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ4));
                        InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x5 = c959620b4y5.LJII;
                        if (interfaceC959610b4x5 != null) {
                            interfaceC959610b4x5.LJIILIIL(enumC959580b4u);
                        }
                    }
                }
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C959620b4y c959620b4y6 = this.LJII;
                if (c959620b4y6 != null) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("quitQuickCoHostForQuickBattle, current status = ");
                    sbLIZ5.append(c959620b4y6.Y2());
                    sbLIZ5.append(", exitType=");
                    sbLIZ5.append(enumC959580b4u);
                    C20441214yg.LIZIZ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ5));
                    InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x6 = c959620b4y6.LJII;
                    if (interfaceC959610b4x6 != null) {
                        interfaceC959610b4x6.LJIILJJIL(enumC959580b4u, interfaceC914930Zut);
                    }
                }
                break;
            case 14:
                C959620b4y c959620b4y7 = this.LJII;
                if (c959620b4y7 != null) {
                    c959620b4y7.LIZJ(enumC959580b4u);
                }
                break;
            default:
                C959620b4y c959620b4y8 = this.LJII;
                if (c959620b4y8 != null) {
                    c959620b4y8.LIZJ(enumC959580b4u);
                }
                break;
        }
    }

    @Override // X.InterfaceC962200b98
    public final void LIZIZ(EnumC959750b5B enumC959750b5B, final C950840aqo c950840aqo) {
        Number numberValueOf;
        C950840aqo c950840aqo2;
        int i = 1;
        LJI(true);
        InterfaceC914930Zut<C960260b60> interfaceC914930Zut = new InterfaceC914930Zut<C960260b60>() { // from class: X.0b4n
            @Override // X.InterfaceC914930Zut
            public final void onSuccess(C960260b60 c960260b60) {
                InterfaceC914930Zut<C960260b60> interfaceC914930Zut2;
                C950840aqo c950840aqo3 = c950840aqo;
                if (c950840aqo3 != null && (interfaceC914930Zut2 = c950840aqo3.LIZIZ) != null) {
                    interfaceC914930Zut2.onSuccess(c960260b60);
                }
                this.LJI(false);
                C959490b4l c959490b4l = this.LJFF;
                if (c959490b4l != null) {
                    c959490b4l.LIZLLL = null;
                }
            }

            @Override // X.InterfaceC914930Zut
            public final void LIZ(int i2, String str, Throwable th) {
                InterfaceC914930Zut<C960260b60> interfaceC914930Zut2;
                C950840aqo c950840aqo3 = c950840aqo;
                if (c950840aqo3 != null && (interfaceC914930Zut2 = c950840aqo3.LIZIZ) != null) {
                    interfaceC914930Zut2.LIZ(i2, str, th);
                }
                this.LJI(false);
                C959490b4l c959490b4l = this.LJFF;
                if (c959490b4l != null) {
                    c959490b4l.LIZLLL = null;
                }
            }
        };
        C959600b4w c959600b4wC0 = c0();
        if (c950840aqo == null || (numberValueOf = c950840aqo.LIZ) == null) {
            if (enumC959750b5B != EnumC959750b5B.TYPE_INVITEE_LIST_DIALOG) {
                i = 0;
            }
            numberValueOf = Integer.valueOf(i);
        }
        if (c959600b4wC0 != null) {
            c959600b4wC0.LJIJI = numberValueOf;
        }
        Function0<Unit> awS416S0200000_15 = null;
        if (c950840aqo != null) {
            c950840aqo2 = new C950840aqo(c950840aqo.LIZ, interfaceC914930Zut, c950840aqo.LIZJ, c950840aqo.LIZLLL, c950840aqo.LJ);
            C959490b4l c959490b4l = this.LJFF;
            if (c959490b4l != null) {
                c959490b4l.LIZLLL = new AwS416S0200000_15(c950840aqo, this, 8);
            }
        } else {
            c950840aqo2 = new C950840aqo(null, new InterfaceC914930Zut<C960260b60>() { // from class: X.0b4o
                @Override // X.InterfaceC914930Zut
                public final void onSuccess(C960260b60 c960260b60) {
                    this.LIZ.LJI(false);
                }

                @Override // X.InterfaceC914930Zut
                public final void LIZ(int i2, String str, Throwable th) {
                    this.LIZ.LJI(false);
                }
            }, null, 29);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startQuickCoHost, entranceType = ");
        sbLIZ.append(enumC959750b5B);
        sbLIZ.append(", params = ");
        sbLIZ.append(c950840aqo2);
        C20441214yg.LIZIZ("QuickCoHostManager", C2188811AlT.LIZIZ(sbLIZ));
        C959490b4l c959490b4l2 = this.LJFF;
        if (c959490b4l2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startQuickCoHostByEntranceType entranceType = ");
            sbLIZ2.append(enumC959750b5B);
            C20441214yg.LIZIZ("QuickCoHostManager", C2188811AlT.LIZIZ(sbLIZ2));
            switch (C959570b4t.LIZ[enumC959750b5B.ordinal()]) {
                case 1:
                    awS416S0200000_15 = new AwS416S0200000_15(c950840aqo2, this, 9);
                    break;
                case 2:
                case 3:
                    awS416S0200000_15 = new AwS416S0200000_15(this, enumC959750b5B, 10);
                    break;
                case 4:
                    awS416S0200000_15 = new AwS559S0100000_15(this, 64);
                    break;
                case 5:
                    awS416S0200000_15 = new AwS559S0100000_15(this, 65);
                    break;
                case 6:
                    awS416S0200000_15 = new AwS559S0100000_15(this, 66);
                    break;
                case 7:
                case 8:
                    awS416S0200000_15 = new AwS259S0300000_15(this, enumC959750b5B, c950840aqo2, 2);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    awS416S0200000_15 = new AwS259S0300000_15(this, enumC959750b5B, c950840aqo2, 3);
                    break;
            }
            c959490b4l2.LIZJ = awS416S0200000_15;
            c959490b4l2.LIZ = 0;
            c959490b4l2.LIZIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0b4V] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0b4v] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0b3v, X.0b4s] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0b5D] */
    public C959530b4p(Context context, Room room, final DataChannel dataChannel) {
        IMessageManager iMessageManager;
        this.LIZ = dataChannel;
        this.LIZIZ = room;
        ?? r11 = new InterfaceC959930b5T() { // from class: X.0b4v
            @Override // X.InterfaceC959930b5T
            public final void LJ() {
            }

            @Override // X.InterfaceC959930b5T
            public final void LIZJ() {
                C959530b4p c959530b4p = this.LIZ;
                c959530b4p.getClass();
                C20441214yg.LIZIZ("QuickCoHostManager", "pair success, finish quick co-host pairing process");
                C961300b7g.LIZ.getClass();
                C961300b7g.LIZLLL();
                C960000b5a c960000b5a = c959530b4p.LJI;
                if (c960000b5a != null) {
                    C11JF c11jf = c960000b5a.LIZIZ;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                    c960000b5a.LIZIZ = null;
                    C11JF c11jf2 = c960000b5a.LIZJ;
                    if (c11jf2 != null) {
                        c11jf2.dispose();
                    }
                    c960000b5a.LIZJ = null;
                }
            }

            @Override // X.InterfaceC959930b5T
            public final void LIZIZ(int i, C955540ayO c955540ayO) {
                C959530b4p c959530b4p = this.LIZ;
                c959530b4p.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onAutoMatchSuccess scene = ");
                sbLIZ.append(i);
                sbLIZ.append(" inviteType = ");
                sbLIZ.append(c955540ayO);
                C20441214yg.LIZIZ("QuickCoHostManager", C2188811AlT.LIZIZ(sbLIZ));
                C960000b5a c960000b5a = c959530b4p.LJI;
                if (c960000b5a != null) {
                    if (i == 2 && !AutoMatchKeepAliveDuringCohostEnabledSetting.INSTANCE.isEnable()) {
                        C20441214yg.LIZIZ("QuickCoHostKeepAliveManager", "keepAlive request return by during cohost");
                    } else if (!RandomLinkMicKeepLiveEnableSetting.INSTANCE.isEnable()) {
                        C20441214yg.LIZIZ("QuickCoHostKeepAliveManager", "keepAlive request return by setting");
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("keepAlive request start current status = ");
                        sbLIZ2.append(c960000b5a.LIZ.Y2());
                        C20441214yg.LIZIZ("QuickCoHostKeepAliveManager", C2188811AlT.LIZIZ(sbLIZ2));
                        RandomLinkMicKeepLiveIntervalSetting randomLinkMicKeepLiveIntervalSetting = RandomLinkMicKeepLiveIntervalSetting.INSTANCE;
                        InterfaceC420801kM interfaceC420801kMLJJLJLI = C11NZ.LJJJJJL(randomLinkMicKeepLiveIntervalSetting.getValue(), randomLinkMicKeepLiveIntervalSetting.getValue(), TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS82S0101000_15(i, c960000b5a, 5));
                        C11JF c11jf = c960000b5a.LIZJ;
                        if (c11jf != null) {
                            c11jf.dispose();
                        }
                        c960000b5a.LIZJ = (C11JF) interfaceC420801kMLJJLJLI;
                    }
                }
                C784440Upu.LIZ().LIZIZ(new C974180bSS(i, c955540ayO, null));
            }

            @Override // X.InterfaceC959930b5T
            public final void LJFF(int i, int i2) {
                this.LIZ.getClass();
                C959530b4p.LIZJ(i, i2, null);
            }

            @Override // X.InterfaceC959930b5T
            public final void LJI(EnumC958900b3o enumC958900b3o, EnumC959690b55 enumC959690b55) {
                C959620b4y c959620b4y;
                C959600b4w c959600b4w;
                C959600b4w c959600b4w2;
                C959530b4p c959530b4p = this.LIZ;
                c959530b4p.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("engineDidEnterStatus status = ");
                sbLIZ.append(enumC958900b3o);
                sbLIZ.append(" source = ");
                sbLIZ.append(enumC959690b55);
                C20441214yg.LIZIZ("QuickCoHostManager", C2188811AlT.LIZIZ(sbLIZ));
                DataChannel dataChannel2 = c959530b4p.LIZ;
                if (dataChannel2 != null) {
                    dataChannel2.zW(QuickCoHostStateChannel.class, enumC958900b3o);
                }
                if (C959570b4t.LIZLLL[enumC958900b3o.ordinal()] == 1) {
                    C915980Zwa.LJI().LIZ().LLLFZ().clear();
                    if (c959530b4p.LIZLLL != null) {
                        C959540b4q.LIZIZ();
                    }
                    if (c959530b4p.LJ != null) {
                        C959550b4r.LIZIZ();
                    }
                    C960000b5a c960000b5a = c959530b4p.LJI;
                    if (c960000b5a != null) {
                        C11JF c11jf = c960000b5a.LIZIZ;
                        if (c11jf != null) {
                            c11jf.dispose();
                        }
                        c960000b5a.LIZIZ = null;
                        C11JF c11jf2 = c960000b5a.LIZJ;
                        if (c11jf2 != null) {
                            c11jf2.dispose();
                        }
                        c960000b5a.LIZJ = null;
                    }
                    C959620b4y c959620b4y2 = c959530b4p.LJII;
                    if (c959620b4y2 != null) {
                        c959620b4y2.LJII(EnumC958840b3i.UNKNOWN);
                    }
                    C959620b4y c959620b4y3 = c959530b4p.LJII;
                    if (c959620b4y3 != null && (c959600b4w2 = c959620b4y3.LIZIZ) != null) {
                        String source = EnumC959780b5E.ENGINE_DID_ENTER_NONE_STATUS.getSource();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("resetModel, source = ");
                        sbLIZ2.append(source);
                        C20441214yg.LIZIZ("QuickCoHostModel", C2188811AlT.LIZIZ(sbLIZ2));
                        c959600b4w2.LIZ(EnumC958840b3i.UNKNOWN);
                        c959600b4w2.LIZJ = 0L;
                        c959600b4w2.LIZLLL = 0L;
                        c959600b4w2.LJ = null;
                        c959600b4w2.LJIIL = 0L;
                        c959600b4w2.LJFF = 0L;
                        c959600b4w2.LJI = 0;
                        c959600b4w2.LJII = false;
                        c959600b4w2.LJIIIIZZ = true;
                        c959600b4w2.LJIIIZ = true;
                        c959600b4w2.LJIJI = null;
                        c959600b4w2.LJIJJ = null;
                        c959600b4w2.LJIIJ = 0;
                        c959600b4w2.LJIIJJI = 0;
                    }
                    if (enumC959690b55 == EnumC959690b55.QUICK_CO_HOST_CANCEL_BUTTON_CLICKED && QuickCohostResetStartTimeOnCancelSetting.enabled() && (c959620b4y = c959530b4p.LJII) != null && (c959600b4w = c959620b4y.LIZIZ) != null) {
                        c959600b4w.LJIILJJIL = 0L;
                    }
                    if (enumC959690b55 != EnumC959690b55.FIRST_FRAME_RENDER) {
                        InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
                        EnumC955660aya enumC955660aya = EnumC955660aya.IDLE;
                        interfaceC955420ayCLIZ.LLIILZL(enumC955660aya);
                        C915980Zwa.LJI().LIZ().LJLJL(enumC955660aya, false);
                        C915980Zwa.LJI().LIZ().LLJJI(C955540ayO.LIZIZ);
                    }
                }
                if (enumC958900b3o.isIdle()) {
                    DataChannel dataChannel3 = c959530b4p.LIZ;
                    if (dataChannel3 != null) {
                        dataChannel3.zW(InteractUnifiedStateChangeChannel.class, new C974320bSg("cohost_quick", false, enumC958900b3o.toString()));
                        return;
                    }
                    return;
                }
                DataChannel dataChannel4 = c959530b4p.LIZ;
                if (dataChannel4 == null) {
                    return;
                }
                dataChannel4.zW(InteractUnifiedStateChangeChannel.class, new C974320bSg("cohost_quick", true, enumC958900b3o.toString()));
            }

            @Override // X.InterfaceC959930b5T
            public final void LIZ(int i, int i2, Throwable th) {
                this.LIZ.getClass();
                C959530b4p.LIZJ(i, i2, th);
            }

            @Override // X.InterfaceC959930b5T
            public final void LIZLLL(int i, C955540ayO c955540ayO, Throwable th) {
                this.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onAutoMatchFail scene = ");
                sbLIZ.append(i);
                sbLIZ.append(" inviteType = ");
                sbLIZ.append(c955540ayO);
                C20441214yg.LIZIZ("QuickCoHostManager", C2188811AlT.LIZIZ(sbLIZ));
                C784440Upu.LIZ().LIZIZ(new C974180bSS(i, c955540ayO, th));
            }
        };
        ?? r2 = new InterfaceC958970b3v() { // from class: X.0b4s
            @Override // X.InterfaceC958970b3v
            public final void LIZJ(int i, List list) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJIJL(C2180891AWx c2180891AWx) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJJI() {
            }

            @Override // X.InterfaceC958970b3v
            public final boolean LJJJIL() {
                return true;
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIIIL(Map map) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJJJ() {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLLL(List list, boolean z) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLJ(LinkUser linkUser) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
                C959600b4w c959600b4wC0;
                DataChannel dataChannel2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPreLayoutSwitch, layout = ");
                sbLIZ.append(interfaceC937820aVo);
                sbLIZ.append(' ');
                sbLIZ.append(interfaceC937820aVo.getLayoutBusinessType());
                C20441214yg.LJIIIZ("QuickCoHostManager", C2188811AlT.LIZIZ(sbLIZ));
                if (this.LL.k0() == EnumC958900b3o.WAITED && (c959600b4wC0 = C915980Zwa.LJIIIZ().c0()) != null && c959600b4wC0.LJII && LiveCohostLayoutChangeSetting.INSTANCE.isEnable()) {
                    C931800aM6.LIZ.getClass();
                    if (!C931800aM6.LIZIZ() && (dataChannel2 = this.LL.LIZ) != null) {
                        dataChannel2.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(6, "multi-guest switch layout"));
                    }
                }
            }
        };
        this.LJIILIIL = r2;
        AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15(this, 4);
        AwS629S0100000_15 awS629S0100000_152 = new AwS629S0100000_15(this, 5);
        AwS629S0100000_15 awS629S0100000_153 = new AwS629S0100000_15(this, 6);
        C915980Zwa.LJIIIZ().b61(room, this);
        C959820b5I c959820b5I = new C959820b5I(dataChannel);
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.LINK_MESSAGE.getIntType(), (OnIMMessageListener) c959820b5I.LIZJ);
        }
        c959820b5I.LIZIZ = new InterfaceC960060b5g() { // from class: X.0b45
            @Override // X.InterfaceC960060b5g
            public final void LIZJ(LinkMessage linkMessage) {
                C959620b4y c959620b4y = this.LIZ.LJII;
                if (c959620b4y != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onReceiveTeamPairMatchMessage");
                    sbLIZ.append(", receive team pair message ");
                    sbLIZ.append(linkMessage);
                    sbLIZ.append(". currentState=");
                    sbLIZ.append(c959620b4y.LJII);
                    C20441214yg.LJIIIZ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = c959620b4y.LJII;
                    if (interfaceC959610b4x != null) {
                        interfaceC959610b4x.LIZJ(linkMessage);
                    }
                }
            }

            @Override // X.InterfaceC960060b5g
            public final void LIZLLL(LinkMessage linkMessage) {
                C958790b3d c958790b3d = InterfaceC954910axN.LIZ;
                AFwS250S0000000_15 aFwS250S0000000_15 = AFwS250S0000000_15.get$arr$(18);
                c958790b3d.getClass();
                if (RevenueAlogSetting.INSTANCE.isEnabled()) {
                    C958790b3d.LIZIZ("network_im").LJIIJJI(linkMessage, aFwS250S0000000_15);
                }
                C959620b4y c959620b4y = this.LIZ.LJII;
                if (c959620b4y != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onGetMessage");
                    sbLIZ.append(", receive quick pair message ");
                    sbLIZ.append(linkMessage);
                    C20441214yg.LJIIIZ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = c959620b4y.LJII;
                    if (interfaceC959610b4x != null) {
                        interfaceC959610b4x.LJI(linkMessage);
                    }
                }
            }
        };
        this.LIZJ = c959820b5I;
        C959540b4q c959540b4q = C959540b4q.LIZ;
        C959540b4q.LIZLLL = dataChannel;
        this.LIZLLL = c959540b4q;
        C959550b4r c959550b4r = C959550b4r.LIZ;
        C959550b4r.LIZLLL = dataChannel;
        this.LJ = c959550b4r;
        C959490b4l c959490b4l = new C959490b4l();
        if (!LiveQuickCohostPreFilterSetting.INSTANCE.isEnable()) {
            c959490b4l.LIZ(new InterfaceC959480b4k() { // from class: X.0b4i
                @Override // X.InterfaceC959480b4k
                public final void LIZ(C959490b4l c959490b4l2) {
                    User userLIZIZ = C0KXJ.LIZIZ();
                    if (userLIZIZ != null && userLIZIZ.getSecret() == 1) {
                        C19EG c19egLIZ = C500260Jjc.LIZ(C497740JfY.LJII());
                        if (c19egLIZ != null) {
                            C962110b8z.LIZ(c19egLIZ, EnumC960290b63.REQUEST, null, new AwS559S0100000_15(c959490b4l2, 1046));
                        }
                        AwS416S0200000_15 awS416S0200000_15 = c959490b4l2.LIZLLL;
                        if (awS416S0200000_15 != null) {
                            awS416S0200000_15.invoke();
                        }
                        C20441214yg.LIZIZ("PrivateAccountInterceptor", "checkPrivateAccount block by private account");
                        return;
                    }
                    c959490b4l2.LIZIZ();
                }
            });
        }
        c959490b4l.LIZ(new InterfaceC959480b4k(dataChannel) { // from class: X.0b3M
            public final DataChannel LIZ;

            {
                this.LIZ = dataChannel;
            }

            @Override // X.InterfaceC959480b4k
            public final void LIZ(C959490b4l c959490b4l2) {
                if (FansClubCohostForSuperFanOnlyLiveSetting.INSTANCE.isEnabled() && C494680Jac.LJIILL(this.LIZ)) {
                    C19EG c19egLIZ = C500260Jjc.LIZ(C497740JfY.LJII());
                    if (c19egLIZ != null) {
                        C958650b3P.LIZ(c19egLIZ, new AwS559S0100000_15(c959490b4l2, 1047), null);
                    }
                    AwS416S0200000_15 awS416S0200000_15 = c959490b4l2.LIZLLL;
                    if (awS416S0200000_15 != null) {
                        awS416S0200000_15.invoke();
                    }
                    C20441214yg.LIZIZ("SubscribeOnlyInterceptor", "checkSubscribeOnly, block by LIVE subscribers only");
                    return;
                }
                c959490b4l2.LIZIZ();
            }
        });
        c959490b4l.LIZ(new C958600b3K(context));
        c959490b4l.LIZ(new InterfaceC959480b4k() { // from class: X.0b3L
            @Override // X.InterfaceC959480b4k
            public final void LIZ(C959490b4l c959490b4l2) {
                int size = C915980Zwa.LJII().LLILZLL(true).size();
                List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
                ArrayList arrayList = new ArrayList();
                for (C954460awe c954460awe : listLJIJJ) {
                    C954460awe c954460awe2 = c954460awe;
                    EnumC950200apm enumC950200apm = c954460awe2.LJJIIZ;
                    if (enumC950200apm == EnumC950200apm.INVITING || enumC950200apm == EnumC950200apm.INVITED) {
                        if (c954460awe2.LJIIJJI()) {
                            arrayList.add(c954460awe);
                        }
                    }
                }
                int size2 = arrayList.size();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LinkMicPositionInterceptor intercept coHostUserSize = ");
                sbLIZ.append(size);
                sbLIZ.append(" coHostUserList = ");
                sbLIZ.append(C915980Zwa.LJII().LJIJJ());
                C20441214yg.LJIIIZ("LinkMicPositionInterceptor", C2188811AlT.LIZIZ(sbLIZ));
                if (C950220apo.LJIJ(size, 0)) {
                    C955400ayA c955400ayA = C955400ayA.LIZ;
                    C955400ayA.LJLLLL("maximum_number_reached");
                    if (size2 <= 0 && !C915980Zwa.LJIIIZ().Jf()) {
                        C766270U4b.LIZLLL(2131841237);
                    } else {
                        C766270U4b.LIZLLL(2131841238);
                    }
                    AwS416S0200000_15 awS416S0200000_15 = c959490b4l2.LIZLLL;
                    if (awS416S0200000_15 != null) {
                        awS416S0200000_15.invoke();
                        return;
                    }
                    return;
                }
                c959490b4l2.LIZIZ();
            }
        });
        this.LJFF = c959490b4l;
        C959620b4y c959620b4y = new C959620b4y(C500260Jjc.LJJLIIIIJ(dataChannel), new C959600b4w(EnumC959690b55.INITIALIZE), new InterfaceC960050b5f() { // from class: X.0b5D
            @Override // X.InterfaceC960050b5f
            public final AbstractC959650b51 LIZ(final EnumC958900b3o enumC958900b3o, final InterfaceC959730b59 interfaceC959730b59, final Object obj) {
                int i = C959450b4h.LIZ[enumC958900b3o.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    return new AbstractC959650b51<Object>(enumC958900b3o, interfaceC959730b59, obj) { // from class: X.0b4z
                                        @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
                                        public final void LIZLLL() {
                                            AbstractC959650b51.LJJIIJZLJL(this, true, 0L, EnumC959580b4u.TEAM_PAIR_CONNECTED, 2, null, null, null, null, 486);
                                            if (this.LIZ.c0().LJII) {
                                                C931800aM6.LIZ.getClass();
                                                if (!C931800aM6.LIZIZ()) {
                                                    C956380azk c956380azk = new C956380azk(6, "QuickCoHostStatePrepared");
                                                    DataChannel dataChannel2 = this.LIZ.getDataChannel();
                                                    if (dataChannel2 != null) {
                                                        dataChannel2.zW(LinkCrossRoomStateChangeEvent.class, c956380azk);
                                                    }
                                                }
                                            }
                                            LJJIJ(EnumC958900b3o.NONE, null, EnumC959690b55.FIRST_FRAME_RENDER);
                                        }

                                        @Override // X.AbstractC959650b51
                                        public final boolean LJJIIZI() {
                                            return false;
                                        }

                                        @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
                                        public final void LJIILLIIL() {
                                            boolean z;
                                            int i2;
                                            C914570ZuJ c914570ZuJ;
                                            C959600b4w c959600b4wC0 = this.LIZ.c0();
                                            C214831195p c214831195pM0 = C915980Zwa.LJIIIZ().m0();
                                            if (c214831195pM0 == null || !C1152520g66.LIZIZ()) {
                                                return;
                                            }
                                            boolean z2 = true;
                                            boolean z3 = c959600b4wC0.LJIIJJI > 0;
                                            EnumC958840b3i enumC958840b3i = c959600b4wC0.LIZIZ;
                                            long j = c959600b4wC0.LJIILLIIL;
                                            if (!C958850b3j.LIZ(enumC958840b3i, z3)) {
                                                z = false;
                                                break;
                                            }
                                            if (LiveDirectMatchSetting.INSTANCE.isEnabled()) {
                                                ConcurrentHashMap<Long, C914570ZuJ> concurrentHashMapLJLLI = C915980Zwa.LJII().LJLLI();
                                                if (j <= 0 || (c914570ZuJ = concurrentHashMapLJLLI.get(Long.valueOf(j))) == null || c914570ZuJ.LIZ != 5) {
                                                    Collection<C914570ZuJ> collectionValues = concurrentHashMapLJLLI.values();
                                                    if (!collectionValues.isEmpty()) {
                                                        Iterator<T> it2 = collectionValues.iterator();
                                                        while (it2.hasNext()) {
                                                            if (((C914570ZuJ) it2.next()).LIZ == 5) {
                                                            }
                                                        }
                                                    }
                                                }
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("skip celebration — direct_match rivalUid=");
                                                sbLIZ.append(j);
                                                sbLIZ.append(" type=");
                                                sbLIZ.append(enumC958840b3i);
                                                C20441214yg.LJIIIZ("QuickCohostCelebrationPolicy", C2188811AlT.LIZIZ(sbLIZ));
                                                z = false;
                                                break;
                                            }
                                            z = true;
                                            if (z) {
                                                c214831195pM0.LIZ(new C20689215xa(c959600b4wC0.LJIILLIIL, c959600b4wC0.LJIJ, c959600b4wC0.LJIIZILJ));
                                            } else {
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("stateDidEnter — skip celebration; tear down overlay type=");
                                                sbLIZ2.append(c959600b4wC0.LIZIZ);
                                                sbLIZ2.append(" rivalUid=");
                                                sbLIZ2.append(c959600b4wC0.LJIILLIIL);
                                                C20441214yg.LJIIIZ("QuickCoHostStatePrepared", C2188811AlT.LIZIZ(sbLIZ2));
                                                c214831195pM0.LIZ(C960250b5z.LIZ);
                                            }
                                            EnumC958840b3i enumC958840b3i2 = c959600b4wC0.LIZIZ;
                                            if (enumC958840b3i2 == EnumC958840b3i.QUICK_PAIR || enumC958840b3i2 == EnumC958840b3i.QUICK_RECOMMEND) {
                                                LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
                                                int i3 = C464550IJp.LIZIZ().LJJLI;
                                                if (i3 != 0) {
                                                    i2 = 2131851875;
                                                } else {
                                                    z2 = false;
                                                    i2 = 2131851879;
                                                }
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("match toast: type=");
                                                sbLIZ3.append(enumC958840b3i2);
                                                sbLIZ3.append(" matchedPreferenceTag=");
                                                sbLIZ3.append(i3);
                                                sbLIZ3.append(" variant=");
                                                sbLIZ3.append(z2 ? "music-host" : "no-music-host");
                                                C20441214yg.LJIIIZ("QuickCoHostStatePrepared", C2188811AlT.LIZIZ(sbLIZ3));
                                                C766270U4b.LIZLLL(i2);
                                            }
                                        }

                                        @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
                                        public final void LJ(Integer num, EnumC959580b4u enumC959580b4u, BattleGamePlayContent battleGamePlayContent, boolean z) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onQuickCoHostFinish exitReason:");
                                            sbLIZ.append(num);
                                            sbLIZ.append(", exitType:");
                                            sbLIZ.append(enumC959580b4u);
                                            sbLIZ.append(", battleGamePlayContent:");
                                            sbLIZ.append(battleGamePlayContent);
                                            sbLIZ.append(", skipCancelMatch:");
                                            sbLIZ.append(z);
                                            C20441214yg.LIZIZ("QuickCoHostStatePrepared", C2188811AlT.LIZIZ(sbLIZ));
                                            if (!z) {
                                                AbstractC959650b51.LJJIIJZLJL(this, true, 0L, enumC959580b4u, num, battleGamePlayContent, null, null, null, 454);
                                            }
                                            if (this.LIZ.c0().LJII) {
                                                C931800aM6.LIZ.getClass();
                                                if (!C931800aM6.LIZIZ()) {
                                                    C956380azk c956380azk = new C956380azk(6, "QuickCoHostStatePrepared");
                                                    DataChannel dataChannel2 = this.LIZ.getDataChannel();
                                                    if (dataChannel2 != null) {
                                                        dataChannel2.zW(LinkCrossRoomStateChangeEvent.class, c956380azk);
                                                    }
                                                }
                                            }
                                            LJJIJ(EnumC958900b3o.NONE, null, EnumC959690b55.FIRST_FRAME_RENDER);
                                        }
                                    };
                                }
                                throw new C1954807lC();
                            }
                            return new AbstractC959650b51<InterfaceC959260b4O>(enumC958900b3o, interfaceC959730b59, obj) { // from class: X.0b5H
                                @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
                                public final void LJII() {
                                    InterfaceC959260b4O interfaceC959260b4OLJJIIZ = LJJIIZ();
                                    if (interfaceC959260b4OLJJIIZ != null) {
                                        interfaceC959260b4OLJJIIZ.LJ((C954640aww) this.LIZIZ, new AwS559S0100000_15(this, 942), new AwS559S0100000_15(this, 929));
                                    }
                                }

                                @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
                                public final void LIZIZ(C954640aww c954640aww) {
                                    InterfaceC959260b4O interfaceC959260b4OLJJIIZ = LJJIIZ();
                                    if (interfaceC959260b4OLJJIIZ != null) {
                                        interfaceC959260b4OLJJIIZ.LJIIIIZZ(c954640aww, new AwS559S0100000_15(this, 930), new AwS559S0100000_15(this, 931));
                                    }
                                }
                            };
                        }
                        return new AbstractC959650b51<InterfaceC959960b5W>(enumC958900b3o, interfaceC959730b59, obj) { // from class: X.0b58
                            @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
                            public final void LJIIJJI(String str, List list) {
                            }

                            @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
                            public final void LJIJI() {
                                InterfaceC959960b5W interfaceC959960b5WLJJIIZ = LJJIIZ();
                                if (interfaceC959960b5WLJJIIZ != null) {
                                    interfaceC959960b5WLJJIIZ.LJII((LinkMessage) this.LIZIZ, null, new AwS559S0100000_15(this, 940));
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("quickPairInvite, triggerMessage = ");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(", quick cohost type = ");
                                sbLIZ.append(this.LIZ.d0());
                                C20441214yg.LIZIZ("QuickCoHostStateInvited", C2188811AlT.LIZIZ(sbLIZ));
                            }

                            @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
                            public final void LIZ(LinkMessage linkMessage) {
                                InterfaceC959960b5W interfaceC959960b5WLJJIIZ = LJJIIZ();
                                if (interfaceC959960b5WLJJIIZ != null) {
                                    interfaceC959960b5WLJJIIZ.LIZ(linkMessage);
                                }
                            }

                            @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
                            public final void LIZJ(LinkMessage linkMessage) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onReceiveTeamPairMatchMessage, message = ");
                                sbLIZ.append(linkMessage);
                                C20441214yg.LIZIZ("QuickCoHostStateInvited", C2188811AlT.LIZIZ(sbLIZ));
                                InterfaceC959960b5W interfaceC959960b5WLJJIIZ = LJJIIZ();
                                if (interfaceC959960b5WLJJIIZ != null) {
                                    interfaceC959960b5WLJJIIZ.LIZ(linkMessage);
                                }
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
                            
                                if (r2.intValue() == X.C955540ayO.LJJJJZ.LIZ) goto L11;
                             */
                            @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJJIIJ(X.C954630awv r5) {
                                /*
                                    r4 = this;
                                    com.bytedance.android.live.liveinteract.multihost.core.model.MHPermitJoinBizContent r0 = r5.LJI
                                    r3 = 0
                                    if (r0 == 0) goto L58
                                    int r0 = r0.sourceType
                                    java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                                Lb:
                                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                    java.lang.String r0 = "onReceiveReplyMessage, sourceType="
                                    r1.append(r0)
                                    r1.append(r2)
                                    java.lang.String r0 = ", joinReplyMessage="
                                    r1.append(r0)
                                    r1.append(r5)
                                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                                    java.lang.String r0 = "QuickCoHostStateInvited"
                                    X.C20441214yg.LIZIZ(r0, r1)
                                    if (r2 == 0) goto L5a
                                    X.0ayO r0 = X.C955540ayO.LJJJJLI
                                    int r1 = r0.LIZ
                                    int r0 = r2.intValue()
                                    if (r0 == r1) goto L3e
                                    X.0ayO r0 = X.C955540ayO.LJJJJZ
                                    int r1 = r0.LIZ
                                    int r0 = r2.intValue()
                                    if (r0 != r1) goto L5a
                                L3e:
                                    X.0b59 r1 = r4.LIZ
                                    X.0b3i r0 = X.EnumC958840b3i.TEAM_PAIR
                                    r1.LJII(r0)
                                    X.0b5h r2 = r4.LJJIIZ()
                                    X.0b5W r2 = (X.InterfaceC959960b5W) r2
                                    if (r2 == 0) goto L57
                                    kotlin.jvm.internal.AwS559S0100000_15 r1 = new kotlin.jvm.internal.AwS559S0100000_15
                                    r0 = 939(0x3ab, float:1.316E-42)
                                    r1.<init>(r4, r0)
                                    r2.LIZIZ(r5, r1, r3)
                                L57:
                                    return
                                L58:
                                    r2 = r3
                                    goto Lb
                                L5a:
                                    X.0b5h r3 = r4.LJJIIZ()
                                    X.0b5W r3 = (X.InterfaceC959960b5W) r3
                                    if (r3 == 0) goto L73
                                    kotlin.jvm.internal.AwS559S0100000_15 r2 = new kotlin.jvm.internal.AwS559S0100000_15
                                    r0 = 937(0x3a9, float:1.313E-42)
                                    r2.<init>(r4, r0)
                                    kotlin.jvm.internal.AwS559S0100000_15 r1 = new kotlin.jvm.internal.AwS559S0100000_15
                                    r0 = 938(0x3aa, float:1.314E-42)
                                    r1.<init>(r4, r0)
                                    r3.LIZIZ(r5, r2, r1)
                                L73:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C959720b58.LJJIIJ(X.0awv):void");
                            }
                        };
                    }
                    return new C959640b50(enumC958900b3o, interfaceC959730b59, obj);
                }
                return new C959660b52(enumC958900b3o, interfaceC959730b59, obj);
            }
        }, new InterfaceC960040b5e() { // from class: X.0b4V
            @Override // X.InterfaceC960040b5e
            public final AbstractC959270b4P LIZ(EnumC958900b3o enumC958900b3o, final InterfaceC959730b59 interfaceC959730b59) {
                int i = C958910b3p.LIZ[enumC958900b3o.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    int i2 = C958910b3p.LIZIZ[interfaceC959730b59.d0().ordinal()];
                                    if (i2 != 1) {
                                        if (i2 != 2) {
                                            if (i2 != 3) {
                                                if (i2 != 4) {
                                                    if (i2 == 5) {
                                                        return new AbstractC959270b4P(interfaceC959730b59) { // from class: X.0b4b
                                                            @Override // X.InterfaceC960070b5h
                                                            public final Set LJIIIZ() {
                                                                return Collections.singleton(EnumC958900b3o.NONE);
                                                            }
                                                        };
                                                    }
                                                    return null;
                                                }
                                                return new AbstractC959270b4P(interfaceC959730b59) { // from class: X.0b4d
                                                    @Override // X.InterfaceC960070b5h
                                                    public final Set LJIIIZ() {
                                                        return Collections.singleton(EnumC958900b3o.NONE);
                                                    }
                                                };
                                            }
                                            return new AbstractC959270b4P(interfaceC959730b59) { // from class: X.0b4c
                                                @Override // X.InterfaceC960070b5h
                                                public final Set LJIIIZ() {
                                                    return Collections.singleton(EnumC958900b3o.NONE);
                                                }
                                            };
                                        }
                                        return new AbstractC959270b4P(interfaceC959730b59) { // from class: X.0b4a
                                            @Override // X.InterfaceC960070b5h
                                            public final Set LJIIIZ() {
                                                return Collections.singleton(EnumC958900b3o.NONE);
                                            }
                                        };
                                    }
                                    return new AbstractC959270b4P(interfaceC959730b59) { // from class: X.0b4e
                                        @Override // X.InterfaceC960070b5h
                                        public final Set LJIIIZ() {
                                            return Collections.singleton(EnumC958900b3o.NONE);
                                        }
                                    };
                                }
                                throw new C1954807lC();
                            }
                            int i3 = C958910b3p.LIZIZ[interfaceC959730b59.d0().ordinal()];
                            if (i3 != 1) {
                                if (i3 == 3) {
                                    return new C958510b3B(interfaceC959730b59);
                                }
                                return null;
                            }
                            return new C958520b3C(interfaceC959730b59);
                        }
                        int i4 = C958910b3p.LIZIZ[interfaceC959730b59.d0().ordinal()];
                        if (i4 != 1) {
                            if (i4 == 3) {
                                return new C958480b38(interfaceC959730b59);
                            }
                            return null;
                        }
                        return new C958490b39(interfaceC959730b59);
                    }
                    int i5 = C958910b3p.LIZIZ[interfaceC959730b59.d0().ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                if (i5 != 4) {
                                    if (i5 != 5) {
                                        return new C959370b4Z(interfaceC959730b59);
                                    }
                                    return new C959350b4X(interfaceC959730b59);
                                }
                                return new C959300b4S(interfaceC959730b59);
                            }
                            return new C959340b4W(interfaceC959730b59);
                        }
                        return new C959310b4T(interfaceC959730b59);
                    }
                    return new C959360b4Y(interfaceC959730b59);
                }
                int i6 = C958910b3p.LIZIZ[interfaceC959730b59.d0().ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        return new C959890b5P(interfaceC959730b59);
                    }
                    return new C959900b5Q(interfaceC959730b59);
                }
                return new C959680b54(interfaceC959730b59);
            }
        }, r11, dataChannel);
        this.LJI = new C960000b5a(c959620b4y);
        this.LJII = c959620b4y;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiCoHostStateChannel.class, this, new AwS594S0100000_15(this, 47));
            dataChannel.CQ2(LinkCoHostLeaveChannel.class, this, new AwS594S0100000_15(this, 48));
            C975230bU9.LJII(dataChannel, this, new AwS629S0100000_15(this, 3));
        }
        C915980Zwa.LJII().LLLJIL(C954640aww.class, awS629S0100000_15);
        C915980Zwa.LJII().LLLJIL(C954630awv.class, awS629S0100000_152);
        C915980Zwa.LJII().LLLJIL(C954930axP.class, awS629S0100000_153);
        if (LiveCohostLayoutChangeSetting.INSTANCE.isEnable()) {
            C915980Zwa.LJIIIIZZ().VE2(r2);
        }
        if (C1152520g66.LIZ()) {
            LJFF();
        }
    }

    public static void LIZJ(int i, int i2, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCancelAutoMatchResponse. scene=");
        sbLIZ.append(i);
        sbLIZ.append(" exitReason=");
        sbLIZ.append(i2);
        sbLIZ.append(" throwable=");
        sbLIZ.append(th);
        C20441214yg.LIZIZ("QuickCoHostManager", C2188811AlT.LIZIZ(sbLIZ));
        C784440Upu.LIZ().LIZIZ(new C960280b62(i, i2));
    }
}
