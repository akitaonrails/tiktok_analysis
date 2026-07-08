package X;

import android.graphics.Rect;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181001AXi implements InterfaceC964840bDO {
    public final C2177031AIb LIZ;
    public final C2180891AWx LIZIZ;
    public final C1AYR LIZJ;
    public final Function1<Boolean, Unit> LIZLLL;
    public final Function1<Layout, Boolean> LJ;
    public final Function1<LayoutDSLConfig, Unit> LJFF;
    public final InterfaceC1631630sYr<Layout, String, Boolean, Boolean, Unit> LJI;
    public final Function1<String, Unit> LJII;

    @Override // X.InterfaceC964840bDO
    public final void LJJIJIL() {
    }

    @Override // X.InterfaceC964840bDO
    public final void LIZIZ() {
        this.LIZLLL.invoke(Boolean.TRUE);
        this.LJII.invoke("onPermittedUserJoined");
    }

    @Override // X.InterfaceC964840bDO
    public final void LJI() {
        Layout layoutLIZJ = this.LIZJ.LIZJ(false);
        Function1<Boolean, Unit> function1 = this.LIZLLL;
        Boolean bool = Boolean.TRUE;
        function1.invoke(bool);
        this.LJII.invoke("onReplyAgreeInviteMessageReceived");
        if (layoutLIZJ == null || this.LIZIZ.getLocalVisibleRect(new Rect())) {
            return;
        }
        this.LJI.invoke(layoutLIZJ, "onReplyAgreeInviteMessageReceived", bool, Boolean.FALSE);
    }

    @Override // X.InterfaceC964840bDO
    public final void LJIIIZ() {
        this.LIZLLL.invoke(Boolean.TRUE);
        this.LJII.invoke("onJoinDirectSucceed");
    }

    @Override // X.InterfaceC964840bDO
    public final void LJIIJJI() {
        this.LJII.invoke("onJoinChannelSucceed");
        Layout layoutLIZJ = this.LIZJ.LIZJ(true);
        this.LIZLLL.invoke(Boolean.TRUE);
        if (layoutLIZJ != null) {
            this.LJ.invoke(layoutLIZJ).booleanValue();
        }
    }

    @Override // X.InterfaceC964840bDO
    public final void LIZ(LayoutDSLConfig layoutDSLConfig) {
        this.LJII.invoke("onInviteSucceed");
        this.LIZLLL.invoke(Boolean.TRUE);
        this.LJFF.invoke(layoutDSLConfig);
    }

    @Override // X.InterfaceC964840bDO
    public final void LIZJ(InviteMessage inviteMessage) {
        this.LJII.invoke("onInviteMessageReceived");
        this.LJFF.invoke(inviteMessage.layoutDSLConfig);
    }

    @Override // X.InterfaceC964840bDO
    public final void LJ(PermitApplyMessage permitApplyMessage) {
        this.LJII.invoke("onReplyApplyMessageReceived");
        LinkUser linkUser = permitApplyMessage.applier;
        if (linkUser != null) {
            this.LIZJ.LJIILLIIL(new C1AXI(EnumC918810a19.StateJoined, linkUser.userId, linkUser.linkMicId, null, null, null, null, 1016), null);
        }
        this.LIZLLL.invoke(Boolean.TRUE);
        this.LJFF.invoke(permitApplyMessage.layoutDSLConfig);
    }

    @Override // X.InterfaceC964840bDO
    public final void LJFF(String str) {
        this.LIZLLL.invoke(Boolean.TRUE);
        this.LIZJ.LJIILLIIL(new C1AXI(EnumC918810a19.StateJoined, null, str, null, null, null, null, 1016), null);
        this.LJII.invoke("onReplyAgreeInviteSucceed");
    }

    @Override // X.InterfaceC964840bDO
    public final void LJII(InviteMessage inviteMessage) {
        LayoutDSLConfig layoutDSLConfig = inviteMessage.layoutDSLConfig;
        this.LJII.invoke("onAnchorReceiveModeratorInviteMessage");
        this.LIZLLL.invoke(Boolean.TRUE);
        this.LJFF.invoke(layoutDSLConfig);
    }

    @Override // X.InterfaceC964840bDO
    public final void LJIIIIZZ(long j) {
        String str;
        C2177031AIb c2177031AIb = this.LIZ;
        if ((c2177031AIb.LJIIIIZZ && c2177031AIb.LJ != j) || j == UserService.getInstance().user().getCurrentUserId()) {
            Layout layoutLIZJ = this.LIZJ.LIZJ(true);
            Function1<Boolean, Unit> function1 = this.LIZLLL;
            Boolean bool = Boolean.TRUE;
            function1.invoke(bool);
            Function1<String, Unit> function12 = this.LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUserWillJoin. update layoutId[");
            if (layoutLIZJ != null) {
                str = layoutLIZJ.layoutId;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append("] and is visible [");
            sbLIZ.append(this.LIZIZ.getLocalVisibleRect(new Rect()));
            sbLIZ.append(']');
            function12.invoke(C2188811AlT.LIZIZ(sbLIZ));
            if (layoutLIZJ != null && !this.LIZIZ.getLocalVisibleRect(new Rect())) {
                this.LJI.invoke(layoutLIZJ, "onUserWillJoin", bool, bool);
            }
        }
    }

    @Override // X.InterfaceC964840bDO
    public final void LJIIJ(LayoutDSLConfig layoutDSLConfig) {
        LJIILIIL("onReplyApplySucceed", layoutDSLConfig);
    }

    @Override // X.InterfaceC964840bDO
    public final void LJIIL(LayoutDSLConfig layoutDSLConfig) {
        LJIILIIL("onAnchorReceiveModeratorPermitApplyMessage", layoutDSLConfig);
    }

    public final void LJIILJJIL(LayoutDSLConfig layoutDSLConfig) {
        this.LJFF.invoke(layoutDSLConfig);
    }

    public final void LJIILIIL(String str, LayoutDSLConfig layoutDSLConfig) {
        this.LJII.invoke(str);
        Function1<Boolean, Unit> function1 = this.LIZLLL;
        Boolean bool = Boolean.TRUE;
        function1.invoke(bool);
        this.LJFF.invoke(layoutDSLConfig);
        Layout layoutLIZJ = this.LIZJ.LIZJ(false);
        if (layoutLIZJ != null && !this.LIZIZ.getLocalVisibleRect(new Rect())) {
            this.LJI.invoke(layoutLIZJ, "anchorProcessReplyApplySuccess", bool, Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC964840bDO
    public final void LIZLLL(LayoutDSLConfig layoutDSLConfig, long j, String str) {
        this.LIZJ.LJIILLIIL(new C1AXI(EnumC918810a19.StateJoined, Long.valueOf(j), str, null, null, null, null, 1016), null);
        LJIILIIL("onReplyApplySucceed", layoutDSLConfig);
    }

    public C2181001AXi(C2177031AIb c2177031AIb, C2180891AWx c2180891AWx, C1AYR c1ayr, C1AY3 c1ay3, C2181111AXt c2181111AXt, C2180991AXh c2180991AXh, C2181091AXr c2181091AXr, C2181071AXp c2181071AXp) {
        this.LIZ = c2177031AIb;
        this.LIZIZ = c2180891AWx;
        this.LIZJ = c1ayr;
        this.LIZLLL = c1ay3;
        this.LJ = c2181111AXt;
        this.LJFF = c2180991AXh;
        this.LJI = c2181091AXr;
        this.LJII = c2181071AXp;
    }
}
