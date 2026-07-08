package Y;

import X.C098200Yq;
import X.C0IZV;
import X.C0TZM;
import X.C189200o6;
import X.C20441214yg;
import X.C766270U4b;
import X.C924650aAZ;
import X.C924770aAl;
import X.C924810aAp;
import X.C940030aZN;
import X.C941160abC;
import X.C944210ag7;
import android.view.View;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkControlWidget;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AObjectS390S0100000_15 implements Function0 {
    public final int $t;
    public Object l0;

    public static final Object invoke$6(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        return MultiGuestPreviewFragment.UR((MultiGuestPreviewFragment) aObjectS390S0100000_15.l0);
    }

    public static final Object invoke$7(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        return MultiGuestPreviewFragment.ZR((MultiGuestPreviewFragment) aObjectS390S0100000_15.l0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(Y.AObjectS390S0100000_15 r3) {
        /*
            java.lang.Object r1 = r3.l0
            com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget r1 = (com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget) r1
            boolean r0 = r1.LLJILJILJ
            if (r0 == 0) goto L13
            com.bytedance.android.live.liveinteract.InteractServiceDel r0 = com.bytedance.android.live.liveinteract.InteractServiceDel.LLILLJJLI
            boolean r0 = r0.g92()
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L13:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r1.dataChannel
            r3 = 1
            if (r1 == 0) goto L66
            java.lang.Class<com.bytedance.android.live.room.SeiCacheChannel> r0 = com.bytedance.android.live.room.SeiCacheChannel.class
            java.lang.Object r1 = r1.gg0(r0)
            X.0ahu r1 = (X.C945320ahu) r1
            if (r1 == 0) goto L66
            com.bytedance.android.livesdk.sei.LiveSeiStruct r0 = r1.LIZ
            if (r0 == 0) goto L66
            com.bytedance.android.livesdk.sei.SeiAppData r0 = r0.LIZ
            if (r0 == 0) goto L66
            boolean r0 = r0.LJIILLIIL()
            if (r0 != r3) goto L66
            com.bytedance.android.livesdk.sei.LiveSeiStruct r0 = r1.LIZ
            if (r0 == 0) goto L66
            com.bytedance.android.livesdk.sei.SeiAppData r0 = r0.LIZ
            if (r0 == 0) goto L66
            java.util.List<com.bytedance.android.livesdk.sei.SeiRegion> r1 = r0.grids
            if (r1 == 0) goto L66
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L66
            java.util.Iterator r2 = r1.iterator()
            r1 = 0
        L47:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdk.sei.SeiRegion r0 = (com.bytedance.android.livesdk.sei.SeiRegion) r0
            java.lang.String r0 = r0.contentType
            if (r0 == 0) goto L5d
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            if (r0 != 0) goto L47
        L5d:
            int r1 = r1 + 1
            if (r1 >= 0) goto L47
            X.C1697810uHb.LJIJ()
            r0 = 0
            throw r0
        L66:
            r1 = 0
            goto L6b
        L68:
            if (r1 <= r3) goto L66
            r1 = 1
        L6b:
            X.0aAp r0 = X.C924810aAp.LJ()
            boolean r0 = r0.LJIIIZ
            if (r0 != 0) goto L77
            if (r1 != 0) goto L77
            r0 = 0
            goto Le
        L77:
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS390S0100000_15.invoke$0(Y.AObjectS390S0100000_15):java.lang.Object");
    }

    public static final Object invoke$1(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS390S0100000_15.l0;
        linkControlWidget.getClass();
        return new C0IZV(linkControlWidget.context, linkControlWidget.dataChannel);
    }

    public static final Object invoke$10(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        Object c098200Yq;
        C940030aZN c940030aZN = (C940030aZN) aObjectS390S0100000_15.l0;
        try {
            c098200Yq = C941160abC.LIZJ(c940030aZN.LIZ().LJIJJ().LIZIZ, c940030aZN.LL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static final Object invoke$2(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        ((GuestMediaManageFragment) aObjectS390S0100000_15.l0).SR();
        return null;
    }

    public static final Object invoke$3(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        C20441214yg.LJIIIZ("MultiCoHostWidget", "loadMatchAnchorWidget cache miss");
        View view = ((MultiCoHostWidget) aObjectS390S0100000_15.l0).getView();
        if (view != null) {
            MultiCoHostWidget multiCoHostWidget = (MultiCoHostWidget) aObjectS390S0100000_15.l0;
            return C944210ag7.LIZ(view, multiCoHostWidget.A1(), multiCoHostWidget.dataChannel);
        }
        return null;
    }

    public static final Object invoke$4(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        ((MultiGuestPreviewFragment) aObjectS390S0100000_15.l0).iS();
        return null;
    }

    public static final Object invoke$5(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        ((MultiGuestPreviewFragment) aObjectS390S0100000_15.l0).gS();
        return null;
    }

    public static final Object invoke$8(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        ((GuestMediaManageFragment) aObjectS390S0100000_15.l0).LLLILZ.dismiss();
        return null;
    }

    public static final Object invoke$9(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        Boolean bool;
        boolean zBooleanValue;
        GameLinkControlWidget gameLinkControlWidget = (GameLinkControlWidget) aObjectS390S0100000_15.l0;
        gameLinkControlWidget.getClass();
        C924770aAl.LIZ = "connection_button";
        DataChannel dataChannel = gameLinkControlWidget.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C0TZM.class);
        } else {
            bool = Boolean.TRUE;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        Room room = gameLinkControlWidget.LLILZ;
        if (room != null && gameLinkControlWidget.LLILLL != null) {
            C924650aAZ.LJIILIIL(room.getOwner().getFollowInfo().getFollowStatus(), C924810aAp.LJ().LJIIIZ, zBooleanValue);
            gameLinkControlWidget.LLILLL.A1();
            return null;
        }
        C766270U4b.LIZLLL(2131851936);
        C20441214yg.LJIIIZ("GameLinkControlWidget", "onGameLinkClick error");
        return null;
    }

    public AObjectS390S0100000_15(MultiGuestPreviewFragment multiGuestPreviewFragment, int i) {
        this.$t = i;
        switch (i) {
            case 4:
            case 5:
                this.l0 = multiGuestPreviewFragment;
                break;
            default:
                this.l0 = multiGuestPreviewFragment;
                break;
        }
    }

    public AObjectS390S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
