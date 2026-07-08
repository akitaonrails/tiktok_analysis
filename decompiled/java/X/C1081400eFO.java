package X;

import android.graphics.Rect;
import com.bytedance.android.live.BarrageAdjustmentEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoViewRealSizeChannel;
import com.bytedance.android.live.room.PadMultiScreenWidthChannel;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkLayoutDataChannel;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081400eFO extends ElementSpecImpl {
    public final AbstractC1080560eE2 LL;
    public final Function1<Boolean, Unit> LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public C1081600eFi LLILZIL;
    public int LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.ies.sdk.widgets.ConstraintProperty r7) {
        /*
            r6 = this;
            java.lang.Class<com.bytedance.android.livesdkapi.host.user.IHostPad> r0 = com.bytedance.android.livesdkapi.host.user.IHostPad.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.user.IHostPad r0 = (com.bytedance.android.livesdkapi.host.user.IHostPad) r0
            boolean r0 = r0.isPad()
            r2 = 2
            r4 = 0
            if (r0 == 0) goto L6b
            int r0 = X.C497740JfY.LIZ
            boolean r0 = X.C500260Jjc.LJJII(r0)
            if (r0 == 0) goto L6b
            X.0eE2 r0 = r6.LL
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.getDataChannel()
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoViewRealSizeChannel> r0 = com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoViewRealSizeChannel.class
            java.lang.Object r5 = r1.gg0(r0)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            if (r5 == 0) goto L68
            int r3 = X.C497740JfY.LJIIZILJ()
            X.0eE2 r0 = r6.LL
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.getDataChannel()
            java.lang.Class<com.bytedance.android.live.room.PadMultiScreenWidthChannel> r0 = com.bytedance.android.live.room.PadMultiScreenWidthChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L83
            float r0 = r0.floatValue()
        L40:
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            int r3 = r3 - r0
            int r0 = r5.left
            if (r0 != 0) goto L53
            int r0 = r5.width()
            int r0 = r3 - r0
            int r0 = r0 / r2
            r5.left = r0
        L53:
            int r1 = r5.width()
            int r0 = r5.height()
            if (r1 <= r0) goto L72
            r0 = 1136361472(0x43bb8000, float:375.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            int r3 = r3 - r0
        L66:
            if (r3 >= 0) goto L69
        L68:
            r3 = 0
        L69:
            r6.LLILLL = r3
        L6b:
            int r1 = r6.LLILZLL
            int r0 = r6.LLILLL
            if (r1 != r0) goto L85
            return
        L72:
            int r0 = r5.left
            int r1 = r3 - r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            int r3 = r3 - r0
            int r3 = java.lang.Math.min(r1, r3)
            goto L66
        L83:
            r0 = 0
            goto L40
        L85:
            r6.LLILZLL = r0
            if (r0 != 0) goto Lae
            r0 = 8
            r7.visibility(r0)
        L8e:
            int r0 = r6.LLILLL
            r7.margin(r2, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "resolveConstraint: "
            r1.append(r0)
            int r0 = r6.LLILLL
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "NormalInteractDelegateGuidelineSpec"
            X.C20441214yg.LIZIZ(r0, r1)
            r7.apply()
            return
        Lae:
            r7.visibility(r4)
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1081400eFO.LIZ(com.bytedance.ies.sdk.widgets.ConstraintProperty):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.ies.sdk.widgets.ConstraintProperty r5) {
        /*
            r4 = this;
            r0 = 0
            r4.LLILLL = r0
            X.0eFi r3 = r4.LLILZIL
            r2 = 0
            if (r3 == 0) goto L5e
            X.0a1P r1 = r3.LIZ
        La:
            X.0a1P r0 = X.EnumC918970a1P.FLOATING_FIX
            if (r1 == r0) goto L1c
            if (r3 == 0) goto L5c
            X.0a1P r1 = r3.LIZ
        L12:
            X.0a1P r0 = X.EnumC918970a1P.FLOATING
            if (r1 != r0) goto L2d
            if (r3 == 0) goto L2d
            int r0 = r3.LIZIZ
            if (r0 <= 0) goto L2d
        L1c:
            if (r3 == 0) goto L20
            X.0a1P r2 = r3.LIZ
        L20:
            X.0a1P r0 = X.EnumC918970a1P.FLOATING
            if (r2 != r0) goto L59
            int r1 = r4.LLILZ
            X.0eE2 r0 = r4.LL
            int r0 = r0.LIZLLL
            int r1 = r1 + r0
        L2b:
            r4.LLILLL = r1
        L2d:
            X.0eE2 r0 = r4.LL
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.getDataChannel()
            java.lang.Class<com.bytedance.android.live.BarrageAdjustmentEvent> r1 = com.bytedance.android.live.BarrageAdjustmentEvent.class
            int r0 = r4.LLILLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LC0(r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "resolveMultiLive rightMargin:"
            r1.append(r0)
            int r0 = r4.LLILLL
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "NormalInteractDelegateGuidelineSpec"
            X.C20441214yg.LJIIIZ(r0, r1)
            r4.LIZ(r5)
            return
        L59:
            int r1 = r4.LLILZ
            goto L2b
        L5c:
            r1 = r2
            goto L12
        L5e:
            r1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1081400eFO.LIZIZ(com.bytedance.ies.sdk.widgets.ConstraintProperty):void");
    }

    public C1081400eFO(AbstractC1080560eE2 abstractC1080560eE2, C1082580eHI c1082580eHI) {
        super(R.id.pbo);
        this.LL = abstractC1080560eE2;
        this.LLILLJJLI = c1082580eHI;
        abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.ar8);
        addSceneObserver(new DataChannelSceneObserver<C1081600eFi, MultiLiveRTCLayoutChannel>() { // from class: X.0eFQ
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<MultiLiveRTCLayoutChannel> getType() {
                return MultiLiveRTCLayoutChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1081600eFi c1081600eFi) {
                boolean z;
                C1081600eFi c1081600eFi2 = c1081600eFi;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("type: ");
                sbLIZ.append(c1081600eFi2.LIZ);
                sbLIZ.append(", guestCount: ");
                sbLIZ.append(c1081600eFi2.LIZIZ);
                sbLIZ.append(", btmEmptyViewHeight: ");
                sbLIZ.append(c1081600eFi2.LIZJ);
                sbLIZ.append(", guestWindowWidth: ");
                sbLIZ.append(c1081600eFi2.LIZLLL);
                C20441214yg.LIZIZ("NormalInteractDelegateGuidelineSpec", C2188811AlT.LIZIZ(sbLIZ));
                C1081400eFO c1081400eFO = this.LIZ;
                c1081400eFO.LLILZIL = c1081600eFi2;
                EnumC918970a1P enumC918970a1P = c1081600eFi2.LIZ;
                int i = 0;
                if (enumC918970a1P == EnumC918970a1P.FLOATING_FIX || (enumC918970a1P == EnumC918970a1P.FLOATING && c1081600eFi2.LIZIZ > 0)) {
                    z = true;
                } else {
                    z = false;
                }
                if (c1081600eFi2.LIZIZ > 0) {
                    i = c1081600eFi2.LIZLLL;
                }
                c1081400eFO.LLILZ = i;
                c1081400eFO.LLILLJJLI.invoke(Boolean.valueOf(z));
                this.LIZ.LIZIZ(constraintProperty);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C938170aWN, VoiceChatLayoutChannel>() { // from class: X.0eFX
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<VoiceChatLayoutChannel> getType() {
                return VoiceChatLayoutChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C938170aWN c938170aWN) {
                this.LIZ.LLILLJJLI.invoke(Boolean.FALSE);
                this.LIZ.LIZIZ(constraintProperty);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C936530aTj, GameLinkLayoutDataChannel>() { // from class: X.0eFL
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<GameLinkLayoutDataChannel> getType() {
                return GameLinkLayoutDataChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C936530aTj c936530aTj) {
                int i;
                C1081400eFO c1081400eFO = this.LIZ;
                int i2 = c936530aTj.LIZ;
                boolean z = false;
                if (i2 == 0) {
                    i = 0;
                } else {
                    i = i2 + c1081400eFO.LL.LIZLLL;
                }
                c1081400eFO.LLILLL = i;
                c1081400eFO.LIZ(constraintProperty);
                C1081400eFO c1081400eFO2 = this.LIZ;
                Function1<Boolean, Unit> function1 = c1081400eFO2.LLILLJJLI;
                if (c1081400eFO2.LLILLL > 0) {
                    z = true;
                }
                function1.invoke(Boolean.valueOf(z));
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C956380azk, LinkCrossRoomStateChangeEvent>() { // from class: X.0eFM
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LinkCrossRoomStateChangeEvent> getType() {
                return LinkCrossRoomStateChangeEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C956380azk c956380azk) {
                C956380azk c956380azk2 = c956380azk;
                C1081400eFO c1081400eFO = this.LIZ;
                c1081400eFO.getClass();
                int i = c956380azk2.LIZ;
                boolean z = true;
                if (i != 1 && i != 0) {
                    return;
                }
                if (i == 1) {
                    if (!c956380azk2.LJIIJ) {
                        c1081400eFO.LLILLL = 0;
                    }
                } else {
                    c1081400eFO.LLILLL = 0;
                    if (c956380azk2.LIZ()) {
                        c1081400eFO.LLILLL = c956380azk2.LIZLLL + c1081400eFO.LL.LIZLLL;
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resolveMultiHost set rightMargin:");
                sbLIZ.append(c1081400eFO.LLILLL);
                sbLIZ.append(" source:");
                sbLIZ.append(c956380azk2.LIZIZ);
                C20441214yg.LJIIIZ("NormalInteractDelegateGuidelineSpec", C2188811AlT.LIZIZ(sbLIZ));
                c1081400eFO.LL.getDataChannel().LC0(BarrageAdjustmentEvent.class, Integer.valueOf(c1081400eFO.LLILLL));
                c1081400eFO.LIZ(constraintProperty);
                Function1<Boolean, Unit> function1 = c1081400eFO.LLILLJJLI;
                if (c1081400eFO.LLILLL <= 0) {
                    z = false;
                }
                function1.invoke(Boolean.valueOf(z));
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C0IMR, VideoOrientationChangeChannel>() { // from class: X.0eFK
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<VideoOrientationChangeChannel> getType() {
                return VideoOrientationChangeChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0IMR c0imr) {
                if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && C500260Jjc.LJJII(C497740JfY.LIZ)) {
                    this.LIZ.LIZ(constraintProperty);
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Rect, MultiGuestV3VideoViewRealSizeChannel>() { // from class: X.0eFR
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<MultiGuestV3VideoViewRealSizeChannel> getType() {
                return MultiGuestV3VideoViewRealSizeChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Rect rect) {
                if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && C500260Jjc.LJJII(C497740JfY.LIZ)) {
                    this.LIZ.LIZ(constraintProperty);
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Float, PadMultiScreenWidthChannel>() { // from class: X.0eFN
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<PadMultiScreenWidthChannel> getType() {
                return PadMultiScreenWidthChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) {
                f.floatValue();
                this.LIZ.LIZ(constraintProperty);
            }
        });
        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 646));
    }
}
