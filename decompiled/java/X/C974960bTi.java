package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0bTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974960bTi implements InterfaceC975900bVE {
    public final MatchBaseWidget LIZ;
    public LinkDialog LIZIZ;
    public final DataChannel LIZJ;
    public final C977590bXx LIZLLL;
    public Function0<Unit> LJ;

    @Override // X.InterfaceC975900bVE
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC975900bVE
    public final void LJIIL() {
        LinkDialog linkDialog = this.LIZIZ;
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

    public C974960bTi(MatchBaseWidget matchBaseWidget) {
        C977590bXx c977590bXx;
        this.LIZ = matchBaseWidget;
        if (matchBaseWidget != null) {
            c977590bXx = (C977590bXx) matchBaseWidget.y1(C977590bXx.class);
        } else {
            c977590bXx = null;
        }
        this.LIZLLL = c977590bXx;
        this.LJ = AFwS203S0000000_15.get$arr$(262);
        this.LIZJ = matchBaseWidget != null ? matchBaseWidget.provideDataChannel() : null;
    }

    @Override // X.InterfaceC975900bVE
    public final void LJJIJL(EnumC974980bTk enumC974980bTk, EnumC975850bV9 enumC975850bV9, boolean z, String str, GiftMode giftMode, InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit> interfaceC1631620sYq, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        boolean z2;
        EnumC974650bTD enumC974650bTD;
        EnumC977660bY4 enumC977660bY4;
        long jLIZ = C158B.LIZ();
        LinkDialog linkDialog = this.LIZIZ;
        if (linkDialog != null && linkDialog.isVisible()) {
            LinkDialog linkDialog2 = this.LIZIZ;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TYPE_TEAM_MATCH_INVITER) {
                return;
            }
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        C977590bXx c977590bXx = this.LIZLLL;
        if (c977590bXx != null) {
            c977590bXx.LIZ(this.LIZJ);
        }
        this.LJ = function03;
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget != null) {
            EnumC974980bTk enumC974980bTk2 = EnumC974980bTk.REJECT;
            if (enumC974980bTk == enumC974980bTk2) {
                z2 = true;
            } else {
                z2 = false;
            }
            LinkDialog linkDialogLIZJ = C977650bY3.LIZJ(matchBaseWidget, matchBaseWidget, str, giftMode, z2, interfaceC1631620sYq, z, false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show teamMate select dialog ");
            sbLIZ.append(this.LIZIZ);
            C20441214yg.LJ("PrepareCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            C957750b1x.LIZ(this.LIZJ, linkDialogLIZJ, "TeamMatchInviteDialog");
            this.LIZIZ = linkDialogLIZJ;
            linkDialogLIZJ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 15));
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            if (enumC974980bTk == enumC974980bTk2) {
                enumC974650bTD = EnumC974650bTD.INVITEREJECT;
            } else {
                enumC974650bTD = EnumC974650bTD.CLICKICON;
            }
            C974540bT2.LIZ.LJJLIIIIJ(enumC974650bTD, null, C158B.LIZ() - jLIZ);
        }
    }
}
