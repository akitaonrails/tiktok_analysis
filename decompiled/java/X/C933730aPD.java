package X;

import Y.ARunnableS115S0100000_15;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestGuestShowSharePanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenListDialogWithPositionEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.ApplyGuideViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.OpenMultiGuestModeratorsManageDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aPD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933730aPD extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public boolean LLJ;
    public Animator LLJI;
    public C933460aOm LLJIJIL;
    public final C01GW LLJILJIL;
    public ImageView LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public final C01GW LLJJIII;

    public final void LIZLLL() {
        setGuidanceInfo(null);
        LJIIJJI();
    }

    private final Function1<Boolean, Unit> getLimitObserver() {
        return (Function1) this.LLJJIII.getValue();
    }

    private final C933740aPE getViewModel() {
        return (C933740aPE) this.LLJILJIL.getValue();
    }

    public final void LJIIIZ() {
        String str;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IApplyGuideAbility iApplyGuideAbility;
        ApplyGuideViewModel viewModel;
        User owner;
        FollowInfo followInfo;
        User owner2;
        FollowInfo followInfo2;
        if (C922570a7D.LIZ(getDataChannel())) {
            C20441214yg.LIZIZ("VoiceChatEmptyMask", "[onSingleTap] isInViewerLimit");
            return;
        }
        if (C500260Jjc.LJIIZILJ(getDataChannel())) {
            getDataChannel().LC0(AnchorOpenListDialogWithPositionEvent.class, new C927330aEt(getPos()));
        } else {
            C923330a8R c923330a8R = C923330a8R.LIZ;
            long followStatus = 0;
            if (C923330a8R.LJFF()) {
                int pos = getPos();
                boolean z = this.LLJ;
                C925600aC6.LIZ = !z ? "plus_button" : "panel_plus_guide";
                str = z ? "panel_plus_guide" : "plus_button";
                Room room = (Room) getDataChannel().gg0(RoomChannel.class);
                if (room != null && (owner2 = room.getOwner()) != null && (followInfo2 = owner2.getFollowInfo()) != null) {
                    followStatus = followInfo2.getFollowStatus();
                }
                C925640aCA.LJIJJ(str, followStatus, ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1(), C925640aCA.LJFF(C924810aAp.LJ().LJJII), getDataChannel(), "liveHome", "multiguestBtn");
                getDataChannel().LC0(OpenMultiGuestModeratorsManageDialogEvent.class, new C926940aEG(EnumC926990aEL.EMPTY_MASK_DIRECTLY, pos, this.LLJ));
            } else {
                int pos2 = getPos();
                if (C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) == 5) {
                    getDataChannel().FQ2(MultiGuestGuestShowSharePanelEvent.class);
                    C01Z6.LIZ(true);
                } else {
                    boolean z2 = this.LLJ;
                    C925600aC6.LIZ = !z2 ? "plus_button" : "panel_plus_guide";
                    str = z2 ? "panel_plus_guide" : "plus_button";
                    Room room2 = (Room) getDataChannel().gg0(RoomChannel.class);
                    if (room2 != null && (owner = room2.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                        followStatus = followInfo.getFollowStatus();
                    }
                    C925640aCA.LJIJJ(str, followStatus, ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1(), C925640aCA.LJFF(C924810aAp.LJ().LJJII), getDataChannel(), "liveHome", "multiguestBtn");
                    C925770aCN c925770aCN = new C925770aCN(Integer.valueOf(pos2), 0, 7, false, 0, this.LLJ, 0, 0L, null, 0L, null, 8058);
                    if (this.LLJ && (interfaceC665370Q7z = (InterfaceC665370Q7z) getDataChannel().gg0(C956790b0P.class)) != null && (iApplyGuideAbility = (IApplyGuideAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IApplyGuideAbility.class, null)) != null && (viewModel = iApplyGuideAbility.getViewModel()) != null) {
                        viewModel.vQ2();
                    }
                    getDataChannel().LC0(GuestApplyEvent.class, c925770aCN);
                }
            }
        }
        C0JGU.LIZ(null);
    }

    public final void LJIIJJI() {
        C933460aOm c933460aOm = this.LLJIJIL;
        if ((c933460aOm != null ? c933460aOm.LIZ : null) != null) {
            View viewFindViewById = findViewById(R.id.h23);
            if (viewFindViewById != null) {
                C439101nJ.LJI(viewFindViewById);
            }
            View viewFindViewById2 = findViewById(R.id.h34);
            if (viewFindViewById2 != null) {
                C439101nJ.LJI(viewFindViewById2);
            }
            View viewFindViewById3 = findViewById(R.id.qt3);
            if (viewFindViewById3 != null) {
                C12ES.LJIILL(0, viewFindViewById3);
            }
            View viewFindViewById4 = findViewById(R.id.qt4);
            if (viewFindViewById4 != null) {
                C12ES.LJIILL(0, viewFindViewById4);
            }
            View viewFindViewById5 = findViewById(R.id.jfk);
            if (viewFindViewById5 != null) {
                C12ES.LJIILL(0, viewFindViewById5);
            }
            getViewModel().LIZJ(null, null);
            return;
        }
        View viewFindViewById6 = findViewById(R.id.h23);
        if (viewFindViewById6 != null) {
            C12ES.LJIILL(0, viewFindViewById6);
        }
        View viewFindViewById7 = findViewById(R.id.h34);
        if (viewFindViewById7 != null) {
            C12ES.LJIILL(0, viewFindViewById7);
        }
        View viewFindViewById8 = findViewById(R.id.qt3);
        if (viewFindViewById8 != null) {
            C439101nJ.LJI(viewFindViewById8);
        }
        View viewFindViewById9 = findViewById(R.id.qt4);
        if (viewFindViewById9 != null) {
            C439101nJ.LJI(viewFindViewById9);
        }
        View viewFindViewById10 = findViewById(R.id.jfk);
        if (viewFindViewById10 != null) {
            C439101nJ.LJI(viewFindViewById10);
        }
    }

    private final int getPos() {
        return C933710aPB.LJ(getWindow().getPosIdentity());
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.hwk);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        C20441214yg.LIZIZ("VoiceNoGuestBizViewElement", "onAttachedToWindow");
        getViewModel().LIZ(this);
        C500260Jjc.LJLIIIL(1500L, this, new AwS594S0100000_15(new AwS559S0100000_15(this, 1121), (Function0<Unit>) 1048));
        Object parent = getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            C930540aK4.LJJJ(view, new ARunnableS115S0100000_15(this, 201));
        }
        if (C922570a7D.LIZ(getDataChannel())) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(0.5f);
        }
        getDataChannel().BQ2(this, IsViewerLimitedStatusChannel.class, getLimitObserver());
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20441214yg.LIZIZ("VoiceNoGuestBizViewElement", "onDetachedFromWindow");
        getViewModel().onDetach();
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.VOICE_NO_GUEST;
    }

    private final void setGuidanceInfo(C933460aOm c933460aOm) {
        this.LLJIJIL = c933460aOm;
        getViewModel().LIZIZ(c933460aOm);
    }

    public final void LJIIJ(C933460aOm c933460aOm) {
        setGuidanceInfo(c933460aOm);
        LJIIJJI();
    }

    public final void LIZIZ(boolean z, boolean z2) {
        this.LLJ = z2;
        Animator animator = this.LLJI;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJI = null;
        getViewModel().LIZLLL(null, new AwS594S0100000_15(this, 1121), z, z2);
    }

    public C933730aPD(Context context, DataChannel dataChannel, C957020b0m c957020b0m) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJILJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1122));
        this.LLJJIII = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1120));
    }
}
