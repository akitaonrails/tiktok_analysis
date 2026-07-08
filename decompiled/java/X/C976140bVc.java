package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976140bVc implements InterfaceC975900bVE {
    public final MatchBaseWidget LIZ;
    public final DataChannel LIZIZ;
    public final C977620bY0 LIZJ;
    public LinkDialog LIZLLL;
    public Function0<Unit> LJ;

    @Override // X.InterfaceC975900bVE
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC975900bVE
    public final void LJIIL() {
        LinkDialog linkDialog = this.LIZLLL;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
    }

    @Override // X.InterfaceC975900bVE
    public final void LJIIZILJ() {
        MatchBaseWidget matchBaseWidget = this.LIZ;
        C985030bjx c985030bjx = null;
        if (matchBaseWidget == null || matchBaseWidget.getView() == null) {
            return;
        }
        MatchBaseWidget matchBaseWidget2 = this.LIZ;
        View viewFindViewById = matchBaseWidget2 != null ? matchBaseWidget2.findViewById(R.id.cnn) : null;
        MatchBaseWidget matchBaseWidget3 = this.LIZ;
        if (matchBaseWidget3 != null && (c985030bjx = (C985030bjx) matchBaseWidget3.findViewById(R.id.cnl)) != null) {
            c985030bjx.LIZIZ();
        }
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(false);
        }
        if (c985030bjx != null) {
            c985030bjx.setEnabled(false);
        }
    }

    public C976140bVc(MatchBaseWidget matchBaseWidget) {
        C977620bY0 c977620bY0;
        this.LIZ = matchBaseWidget;
        if (matchBaseWidget != null) {
            c977620bY0 = (C977620bY0) matchBaseWidget.y1(C977620bY0.class);
        } else {
            c977620bY0 = null;
        }
        this.LIZJ = c977620bY0;
        this.LJ = AFwS203S0000000_15.get$arr$(456);
        this.LIZIZ = matchBaseWidget != null ? matchBaseWidget.provideDataChannel() : null;
    }

    @Override // X.InterfaceC975900bVE
    public final void LJJIJL(EnumC974980bTk enumC974980bTk, EnumC975850bV9 enumC975850bV9, boolean z, String str, GiftMode giftMode, InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit> interfaceC1631620sYq, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        C979690bbL c979690bbL;
        EnumC974650bTD enumC974650bTD;
        C977620bY0 c977620bY0;
        MutableLiveData<Boolean> mutableLiveData;
        EnumC977660bY4 enumC977660bY4;
        long jLIZ = C158B.LIZ();
        LinkDialog linkDialog = this.LIZLLL;
        if (linkDialog != null && linkDialog.isVisible()) {
            LinkDialog linkDialog2 = this.LIZLLL;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TYPE_TWO_MATCH_INVITER) {
                return;
            }
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        C977620bY0 c977620bY02 = this.LIZJ;
        if (c977620bY02 != null) {
            c977620bY02.LIZ(this.LIZIZ);
        }
        if (enumC975850bV9 == EnumC975850bV9.INVITER_FROM_FRIEND_RANK) {
            C977620bY0 c977620bY03 = this.LIZJ;
            if (c977620bY03 != null && (mutableLiveData = c977620bY03.LJIJI) != null) {
                mutableLiveData.setValue(Boolean.FALSE);
            }
            List<C954460awe> listLIZIZ = C2074808Aw.LIZIZ();
            List<C954460awe> listLIZLLL = C2074808Aw.LIZLLL();
            List<C954460awe> listLIZJ = C2074808Aw.LIZJ();
            if ((!listLIZIZ.isEmpty()) && (!listLIZLLL.isEmpty()) && (!listLIZJ.isEmpty())) {
                C977620bY0 c977620bY04 = this.LIZJ;
                if (c977620bY04 != null) {
                    c977620bY04.LIZLLL(listLIZIZ);
                }
                C977620bY0 c977620bY05 = this.LIZJ;
                if (c977620bY05 != null) {
                    c977620bY05.LJIIIZ(new ArrayList(listLIZLLL), new ArrayList(listLIZJ));
                }
                Map<Long, GiftGalleryBadgeInfo> mapLIZ = C2074808Aw.LIZ();
                if ((true ^ mapLIZ.isEmpty()) && (c977620bY0 = this.LIZJ) != null) {
                    c977620bY0.LJ(mapLIZ);
                }
            }
        } else {
            C977620bY0 c977620bY06 = this.LIZJ;
            if (c977620bY06 != null) {
                c977620bY06.LIZIZ();
            }
        }
        this.LJ = function03;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            c979690bbL = (C979690bbL) dataChannel.gg0(C962520b9e.class);
        } else {
            c979690bbL = null;
        }
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget != null) {
            LinkDialog linkDialogLIZLLL = C977650bY3.LIZLLL(matchBaseWidget, matchBaseWidget, str, giftMode, enumC974980bTk, enumC975850bV9, interfaceC1631620sYq, (AwS416S0200000_15) function0, (AwS559S0100000_15) function02, z, null, c979690bbL, 1024);
            C957750b1x.LIZ(this.LIZIZ, linkDialogLIZLLL, "TwoMatchInviteDialog");
            this.LIZLLL = linkDialogLIZLLL;
            linkDialogLIZLLL.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 28));
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            if (enumC974980bTk == EnumC974980bTk.REJECT) {
                enumC974650bTD = EnumC974650bTD.INVITEREJECT;
            } else {
                enumC974650bTD = EnumC974650bTD.CLICKICON;
            }
            C974540bT2.LIZ.LJJLIIIIJ(enumC974650bTD, null, C158B.LIZ() - jLIZ);
        }
    }
}
