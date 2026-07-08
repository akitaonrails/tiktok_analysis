package com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.anchor;

import X.C098200Yq;
import X.C1161920gLG;
import X.C1555540qa8;
import X.C189200o6;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C915980Zwa;
import X.C920830a4P;
import X.C925150aBN;
import X.C930540aK4;
import X.C940770aaZ;
import X.C946890akR;
import X.C946950akX;
import X.C947420alI;
import X.C956790b0P;
import X.EnumC947440alK;
import X.InterfaceC665370Q7z;
import X.InterfaceC946970akZ;
import X.InterfaceC954180awC;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenPickSongPageEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceShowFinishBgEvent;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class LetsDanceAnchorWidget extends LetsDanceBaseWidget<LetsDanceAnchorViewModel> {
    public ISharedBgAbility LLIZLLLIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C20441214yg.LIZIZ("LetsDanceAnchorWidget", "LetsDanceAnchorWidget onCreate");
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.dataChannel.gg0(C956790b0P.class);
        if (interfaceC665370Q7z != null) {
            this.LLIZLLLIL = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
        }
        this.dataChannel.BQ2(this, MultiLetsDanceOpenPickSongPageEvent.class, new AwS594S0100000_15(this, 425));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C20441214yg.LIZIZ("LetsDanceAnchorWidget", "LetsDanceAnchorWidget onDestroy");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget
    public final Class<LetsDanceAnchorViewModel> y1() {
        return LetsDanceAnchorViewModel.class;
    }

    public final void B1(C946890akR c946890akR) {
        Object c098200Yq;
        C947420alI c947420alILJII;
        String str;
        Integer numValueOf;
        String strU3;
        String string;
        Long l;
        try {
            String str2 = c946890akR.LJIIIZ;
            if (str2 == null) {
                str2 = "unknown";
            }
            String string2 = null;
            C946950akX.LIZIZ(str2, "success", null, 12);
            InterfaceC946970akZ interfaceC946970akZX1 = x1();
            if (interfaceC946970akZX1 != null) {
                c947420alILJII = interfaceC946970akZX1.LJII();
            } else {
                c947420alILJII = null;
            }
            Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=lets_dance_select").buildUpon();
            builderBuildUpon.appendQueryParameter("game_stage", c946890akR.LIZ);
            MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
            if (multiGuestDataHolder != null && multiGuestDataHolder.LJJIFFI == 0) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            builderBuildUpon.appendQueryParameter("is_guest_connection", str);
            MultiGuestDataHolder multiGuestDataHolder2 = C920830a4P.LIZ;
            if (multiGuestDataHolder2 != null) {
                numValueOf = Integer.valueOf(multiGuestDataHolder2.LJJIFFI);
            } else {
                numValueOf = null;
            }
            builderBuildUpon.appendQueryParameter("guest_cnt", String.valueOf(numValueOf));
            builderBuildUpon.appendQueryParameter("layout_id", C925150aBN.LIZLLL());
            builderBuildUpon.appendQueryParameter("panel_layout_type", String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
            builderBuildUpon.appendQueryParameter("enter_from", c946890akR.LJFF);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                strU3 = interfaceC954180awCLLJLL.U3();
            } else {
                strU3 = null;
            }
            builderBuildUpon.appendQueryParameter("channel_id", strU3);
            builderBuildUpon.appendQueryParameter("room_id", String.valueOf(C930540aK4.LJIIJ()));
            if (c947420alILJII != null) {
                string = Long.valueOf(c947420alILJII.LIZIZ).toString();
            } else {
                string = null;
            }
            builderBuildUpon.appendQueryParameter("game_session_id", string);
            if (c947420alILJII != null && (l = c947420alILJII.LJI) != null) {
                string2 = l.toString();
            }
            builderBuildUpon.appendQueryParameter("song_id", string2);
            String string3 = builderBuildUpon.build().toString();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openPickSongPanel url=");
            sbLIZ.append(string3);
            C20441214yg.LIZIZ("LetsDanceAnchorWidget", C2188811AlT.LIZIZ(sbLIZ));
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).pauseBGM(Boolean.FALSE);
            IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
            Context contextLJII = this.context;
            if (contextLJII == null) {
                contextLJII = C497740JfY.LJII();
            }
            c098200Yq = iHybridContainerService.YC1(contextLJII, string3, AFwS250S0000000_15.get$arr$(58));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("LetsDanceAnchorWidget", "openPickSongPanel error", thM5exceptionOrNullimpl);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget
    public final void A1(EnumC947440alK enumC947440alK, EnumC947440alK enumC947440alK2) {
        DataChannel dataChannel;
        super.A1(enumC947440alK, enumC947440alK2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGamePhaseChanged ");
        sbLIZ.append(enumC947440alK);
        sbLIZ.append(" -> ");
        sbLIZ.append(enumC947440alK2);
        C20441214yg.LIZIZ("LetsDanceAnchorWidget", C2188811AlT.LIZIZ(sbLIZ));
        if ((enumC947440alK == null || enumC947440alK == EnumC947440alK.NONE) && enumC947440alK2 == EnumC947440alK.FINISH && (dataChannel = this.dataChannel) != null) {
            dataChannel.FQ2(MultiLetsDanceShowFinishBgEvent.class);
        }
    }
}
