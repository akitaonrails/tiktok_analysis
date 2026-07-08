package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ATListenerS448S0100000_15;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostEnableMatchResumeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeContinueAreaExpandAnchorSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeContinueAreaExpandAudienceSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS155S0101000_15;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS559S0100000_15;
import tikcast.linkmic.common.CohostTypeSpotExtra;

/* JADX INFO: renamed from: X.0bmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986720bmg extends ConstraintLayout implements C1AXB, InterfaceC956450azr {
    public static final int LLJLLIL = C439101nJ.LIZ(1);
    public static final float LLJLLL = C497740JfY.LIZIZ(8);
    public final String LL;
    public final DataChannel LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public final boolean LLILZIL;
    public C954460awe LLILZLL;
    public EnumC918810a19 LLIZ;
    public boolean LLIZLLLIL;
    public final boolean LLJ;
    public Long LLJI;
    public final Room LLJIJIL;
    public final InterfaceC1085480eLy LLJILJIL;
    public long LLJILJILJ;
    public final boolean LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final GestureDetector LLJLILLLLZIIL;
    public final C01GW LLJLL;

    @Override // X.C1AXB
    public final boolean isEmpty() {
        return false;
    }

    private final String getCurrentRoomAnchorDisplayName() {
        Room room;
        DataChannel dataChannel = this.LLILLJJLI;
        String strLIZ = C0KVU.LIZ((dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? null : room.getOwner());
        return strLIZ == null ? "" : strLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0018 A[PHI: r1
      0x0018: PHI (r1v14 java.lang.String) = (r1v12 java.lang.String), (r1v15 java.lang.String) binds: [B:13:0x0016, B:11:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[PHI: r0
      0x0065: PHI (r0v1 tikcast.linkmic.common.CohostUserInfo) = 
      (r0v0 tikcast.linkmic.common.CohostUserInfo)
      (r0v10 tikcast.linkmic.common.CohostUserInfo)
      (r0v10 tikcast.linkmic.common.CohostUserInfo)
     binds: [B:23:0x004d, B:28:0x005f, B:30:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[PHI: r0 r1
      0x0068: PHI (r0v3 tikcast.linkmic.common.CohostUserInfo) = (r0v1 tikcast.linkmic.common.CohostUserInfo), (r0v10 tikcast.linkmic.common.CohostUserInfo) binds: [B:32:0x0066, B:30:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r1v10 java.lang.String) = (r1v8 java.lang.String), (r1v11 java.lang.String) binds: [B:32:0x0066, B:30:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getDisplayName() {
        /*
            r5 = this;
            X.0awe r2 = r5.LLILZLL
            r0 = 0
            if (r2 == 0) goto L26
            X.0Tip r1 = r2.LJIJJ
        L7:
            java.lang.String r4 = ""
            if (r1 == 0) goto L28
            if (r2 == 0) goto L15
            X.0Tip r0 = r2.LJIJJ
            if (r0 == 0) goto L15
            java.lang.String r1 = r0.LIZ
            if (r1 != 0) goto L18
        L15:
            r1 = r4
            if (r2 == 0) goto L21
        L18:
            X.0Tip r0 = r2.LJIJJ
            if (r0 == 0) goto L21
            java.lang.String r0 = r0.LIZIZ
            if (r0 == 0) goto L21
            r4 = r0
        L21:
            java.lang.String r0 = X.C0KVU.LIZIZ(r1, r4)
            return r0
        L26:
            r1 = r0
            goto L7
        L28:
            java.lang.String r2 = "CoHostEnlargeWindowView"
            java.lang.String r1 = "getDisplayName userInfo is null, fallback to userInfoMap"
            X.C20441214yg.LIZIZ(r2, r1)
            X.0at4 r1 = X.C915980Zwa.LJI()
            X.0agK r1 = r1.LIZJ()
            java.util.Map r3 = r1.LLJZ()
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r1 = X.C915980Zwa.LJII()
            long r1 = r1.getChannelId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r2 = r3.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L65
            X.0awe r0 = r5.LLILZLL
            if (r0 == 0) goto L72
            long r0 = r0.LJ
        L55:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            tikcast.linkmic.common.CohostUserInfo r0 = (tikcast.linkmic.common.CohostUserInfo) r0
            if (r0 == 0) goto L65
            java.lang.String r1 = r0.displayId
            if (r1 != 0) goto L68
        L65:
            r1 = r4
            if (r0 == 0) goto L6d
        L68:
            java.lang.String r0 = r0.nickname
            if (r0 == 0) goto L6d
            r4 = r0
        L6d:
            java.lang.String r0 = X.C0KVU.LIZIZ(r1, r4)
            return r0
        L72:
            r0 = 0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C986720bmg.getDisplayName():java.lang.String");
    }

    private final LiveIconView getFollowView() {
        if (this.LLILZ) {
            return getViewEnlargeFollow();
        }
        if (this.LLILZIL) {
            return null;
        }
        return getViewCompactFollow();
    }

    private final C941290abP getRippleHandler() {
        return (C941290abP) this.LLJJ.getValue();
    }

    private final View getViewCompactBorder() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    private final ConstraintLayout getViewCompactInfo() {
        return (ConstraintLayout) this.LLJJL.getValue();
    }

    private final C16F5 getViewCompactNickname() {
        return (C16F5) this.LLJL.getValue();
    }

    private final C16F5 getViewCompactTag() {
        return (C16F5) this.LLJJJJJIL.getValue();
    }

    private final View getViewContainerBg() {
        return (View) this.LLJJI.getValue();
    }

    private final C0FPQ getViewEnlargeAvatar() {
        return (C0FPQ) this.LLJJIJIL.getValue();
    }

    private final ConstraintLayout getViewEnlargeInfo() {
        return (ConstraintLayout) this.LLJJIJIIJIL.getValue();
    }

    private final C16F5 getViewEnlargeNickname() {
        return (C16F5) this.LLJJJ.getValue();
    }

    private final C16FZ getViewLoading() {
        return (C16FZ) this.LLJJIII.getValue();
    }

    private final C956430azp getViewPauseContainer() {
        return (C956430azp) this.LLJJIJI.getValue();
    }

    public final boolean e0() {
        Room room;
        DataChannel dataChannel = this.LLILLJJLI;
        Long lValueOf = (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? null : Long.valueOf(room.getOwnerUserId());
        C954460awe c954460awe = this.LLILZLL;
        if (c954460awe != null && c954460awe.LJI()) {
            return true;
        }
        C954460awe c954460awe2 = this.LLILZLL;
        return c954460awe2 != null && c954460awe2.LJIIIZ(lValueOf);
    }

    @Override // X.C1AXB
    public Boolean getAudioMute() {
        return Boolean.valueOf(this.LLIZLLLIL);
    }

    public final ScaleGestureDetector getContainerScaleDetector() {
        return (ScaleGestureDetector) this.LLJLL.getValue();
    }

    @Override // X.C1AXB
    public Integer getLogicPos() {
        return Integer.valueOf(this.LLILLL);
    }

    @Override // X.C1AXB
    public Integer getUiPos() {
        return Integer.valueOf(this.LLILLL);
    }

    @Override // X.C1AXB
    public Long getUid() {
        C954460awe c954460awe = this.LLILZLL;
        if (c954460awe != null) {
            return Long.valueOf(c954460awe.LJ);
        }
        return null;
    }

    public final LiveIconView getViewCompactFollow() {
        return (LiveIconView) this.LLJLIL.getValue();
    }

    public final LiveIconView getViewCompactMute() {
        return (LiveIconView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final LiveIconView getViewEnlargeFollow() {
        return (LiveIconView) this.LLJJJIL.getValue();
    }

    public final LiveIconView getViewEnlargeMute() {
        return (LiveIconView) this.LLJJJJ.getValue();
    }

    public final void h0() {
        if (!this.LLJ || this.LLILZLL == null) {
            return;
        }
        boolean zIsMute = isMute();
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            C954460awe c954460awe = this.LLILZLL;
            interfaceC954180awCLJIIIZ.LJJIJL(c954460awe != null ? c954460awe.LJI : 0L, !zIsMute);
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 != null) {
            interfaceC954180awCLJIIIZ2.LIZJ("CoHostEnlargeWindowView onClick");
        }
        C955440ayE c955440ayE = new C955440ayE();
        C954460awe c954460awe2 = this.LLILZLL;
        boolean z = !zIsMute;
        c955440ayE.LJJIJLIJ(c954460awe2 != null ? c954460awe2.LJ : 0L, z);
        LLD(-1, z);
        if (zIsMute) {
            return;
        }
        C766270U4b.LIZLLL(2131842786);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0() {
        /*
            r3 = this;
            boolean r0 = r3.LLILZ
            r2 = 0
            r1 = 8
            if (r0 == 0) goto L36
            boolean r0 = r3.LLILZIL
            if (r0 != 0) goto L86
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getViewEnlargeInfo()
            X.C786410Ut5.LL(r2, r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r3.getViewEnlargeMute()
            X.C786410Ut5.LLJJIJIL(r0, r2)
            X.16F5 r0 = r3.getViewCompactTag()
            X.C786410Ut5.LLJJJJ(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getViewCompactInfo()
            X.C786410Ut5.LL(r1, r0)
            android.view.View r0 = r3.getViewCompactBorder()
            X.C786410Ut5.LJLLLLLL(r1, r0)
        L2e:
            X.0FPQ r0 = r3.getViewEnlargeAvatar()
            r0.invalidate()
            return
        L36:
            boolean r0 = r3.LLILZIL
            if (r0 != 0) goto L5e
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getViewEnlargeInfo()
            X.C786410Ut5.LL(r1, r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r3.getViewEnlargeMute()
            X.C786410Ut5.LLJJIJIL(r0, r1)
            X.16F5 r0 = r3.getViewCompactTag()
            X.C786410Ut5.LLJJJJ(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getViewCompactInfo()
            X.C786410Ut5.LL(r2, r0)
            android.view.View r0 = r3.getViewCompactBorder()
            X.C786410Ut5.LJLLLLLL(r2, r0)
            goto L2e
        L5e:
            boolean r0 = r3.LLILZIL
            if (r0 == 0) goto L86
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getViewEnlargeInfo()
            X.C786410Ut5.LL(r1, r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r3.getViewEnlargeMute()
            X.C786410Ut5.LLJJIJIL(r0, r1)
            X.16F5 r0 = r3.getViewCompactTag()
            X.C786410Ut5.LLJJJJ(r0, r2)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getViewCompactInfo()
            X.C786410Ut5.LL(r1, r0)
            android.view.View r0 = r3.getViewCompactBorder()
            X.C786410Ut5.LJLLLLLL(r2, r0)
            goto L2e
        L86:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getViewEnlargeInfo()
            X.C786410Ut5.LL(r1, r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r3.getViewEnlargeMute()
            X.C786410Ut5.LLJJIJIL(r0, r1)
            X.16F5 r0 = r3.getViewCompactTag()
            X.C786410Ut5.LLJJJJ(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getViewCompactInfo()
            X.C786410Ut5.LL(r1, r0)
            android.view.View r0 = r3.getViewCompactBorder()
            X.C786410Ut5.LJLLLLLL(r1, r0)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C986720bmg.j0():void");
    }

    @Override // X.C1AXB
    public int getH() {
        return getHeight();
    }

    @Override // X.C1AXB
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.C1AXB
    public int getX() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getLeft();
    }

    @Override // android.view.View, X.C1AXB
    public int getY() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getTop();
    }

    public final void i0() {
        LiveIconView followView = getFollowView();
        if (followView == null || this.LLILZLL == null) {
            return;
        }
        C786410Ut5.LLJJIJIL(followView, 8);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C1099420eiS c1099420eiS = new C1099420eiS();
        C954460awe c954460awe = this.LLILZLL;
        c1099420eiS.LIZIZ(c954460awe != null ? c954460awe.LJ : 0L);
        C954460awe c954460awe2 = this.LLILZLL;
        c1099420eiS.LJ(c954460awe2 != null ? c954460awe2.LJFF : 0L);
        c1099420eiS.getClass();
        interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099420eiS)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 183), new AfS176S0100000_7(followView, 184));
    }

    public final boolean isMute() {
        String str;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ == null) {
            return false;
        }
        C954460awe c954460awe = this.LLILZLL;
        if (c954460awe == null || (str = c954460awe.LJIIJJI) == null) {
            str = "";
        }
        return interfaceC954180awCLJIIIZ.LJ(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0J1N) C784440Upu.LIZ().LJ(C257100z3.class).LIZJ(C11RD.LIZJ(this))).LIZ(new AfS176S0100000_7(this, 182), new C09JN() { // from class: X.0Jk8
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("CoHostEnlargeWindowView@1bcf.onAttachedToWindow$2");
                C1C7U.LIZIZ("CoHostEnlargeWindowView@1bcf.onAttachedToWindow$2");
            }
        });
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow, linkMicId=");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("CoHostEnlargeWindowView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow, linkMicId=");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("CoHostEnlargeWindowView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1AXB
    public String getLinkMicId() {
        return this.LL;
    }

    @Override // X.C1AXB
    public Boolean getVideoMute() {
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC956450azr
    public final void LLL(EnumC918810a19 enumC918810a19) {
        if (enumC918810a19 == this.LLIZ) {
            return;
        }
        this.LLIZ = enumC918810a19;
        int i = C917160ZyU.LIZ[enumC918810a19.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    return;
                }
                C786410Ut5.LJLLLLLL(0, getViewContainerBg());
                C786410Ut5.LLLIZZ(getViewLoading(), 8);
                return;
            }
            C786410Ut5.LJLLLLLL(8, getViewContainerBg());
            C786410Ut5.LLLIZZ(getViewLoading(), 8);
            return;
        }
        C786410Ut5.LJLLLLLL(0, getViewContainerBg());
        C786410Ut5.LLLIZZ(getViewLoading(), 0);
    }

    public final void l0(String str) {
        C954460awe c954460awe;
        Long lValueOf;
        Long lValueOf2;
        long j;
        LiveIconView followView = getFollowView();
        if (followView == null || (c954460awe = this.LLILZLL) == null || c954460awe.LJI()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFollowStatus uid=");
        C954460awe c954460awe2 = this.LLILZLL;
        Long lValueOf3 = null;
        if (c954460awe2 != null) {
            lValueOf = Long.valueOf(c954460awe2.LJ);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(" followStatus=");
        C954460awe c954460awe3 = this.LLILZLL;
        if (c954460awe3 != null) {
            lValueOf3 = Long.valueOf(c954460awe3.LJIJJLI);
        }
        sbLIZ.append(lValueOf3);
        sbLIZ.append(" source = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("CoHostEnlargeWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C954460awe c954460awe4 = this.LLILZLL;
        if (c954460awe4 != null && (lValueOf2 = Long.valueOf(c954460awe4.LJIJJLI)) != null) {
            if (lValueOf2.longValue() == -1) {
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                C954460awe c954460awe5 = this.LLILZLL;
                if (c954460awe5 != null) {
                    j = c954460awe5.LJ;
                } else {
                    j = 0;
                }
                interfaceC500940JkiUser.LJ(j, "CoHostEnlargeWindowView_updateFollowStatus", "enlargeWindow_updateFollowStatus").LJJIIZ(new AfS176S0100000_7(this, 185), new C09JN() { // from class: X.0Jk7
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("CoHostEnlargeWindowView@1bcf.updateFollowStatus$2");
                        C1C7U.LIZIZ("CoHostEnlargeWindowView@1bcf.updateFollowStatus$2");
                    }
                });
                return;
            }
            if (lValueOf2.longValue() == 1 || lValueOf2.longValue() == 2) {
                C786410Ut5.LLJJIJIL(followView, 8);
                return;
            }
        }
        C786410Ut5.LLJJIJIL(followView, 0);
    }

    public final void n0(int i) {
        int i2;
        if (!LiveCohostEnableMatchResumeSetting.INSTANCE.isEnableCoHostResume()) {
            return;
        }
        View viewContainerBg = getViewContainerBg();
        if (i == 2 && !this.LLILZ) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, viewContainerBg);
    }

    @Override // X.InterfaceC956450azr
    public final void o(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onOnlineStateUpdate, linkMicId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", state=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("CoHostEnlargeWindowView", C2188811AlT.LIZIZ(sbLIZ));
        getViewPauseContainer().LJ(i, this.LL, new AwS155S0101000_15(this, i, 3), true, this.LLILZ);
    }

    public final void setVolumeBorderState(boolean z) {
        int i;
        Number numberValueOf;
        GradientDrawable gradientDrawable;
        C957020b0m c957020b0m;
        if (z) {
            i = R.attr.fxy;
        } else {
            i = R.attr.ewy;
        }
        ViewParent parent = getParent();
        GradientDrawable gradientDrawable2 = null;
        if ((parent instanceof C957020b0m) && (c957020b0m = (C957020b0m) parent) != null) {
            numberValueOf = Integer.valueOf(c957020b0m.getShapeDescriptor().LIZIZ);
        } else {
            numberValueOf = Float.valueOf(LLJLLL);
        }
        View viewCompactBorder = getViewCompactBorder();
        Drawable background = getViewCompactBorder().getBackground();
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setStroke(LLJLLIL, C20736316Cj.LIZIZ(i, getContext()));
            gradientDrawable.setCornerRadius(numberValueOf.floatValue());
            gradientDrawable2 = gradientDrawable;
        }
        viewCompactBorder.setBackground(gradientDrawable2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    @Override // X.InterfaceC956450azr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLD(int r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.LLILZIL
            if (r0 == 0) goto L7
            r5.LLIZLLLIL = r7
            return
        L7:
            if (r7 == 0) goto L96
            r4 = 2131106618(0x7f061b3a, float:1.7825792E38)
            boolean r0 = r5.LLJ
            if (r0 != 0) goto L99
            r3 = 2131107422(0x7f061e5e, float:1.7827423E38)
        L13:
            boolean r0 = r5.LLJ
            r2 = 0
            if (r0 == 0) goto L41
            boolean r0 = r5.LLILZ
            if (r0 == 0) goto L33
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r5.getViewEnlargeMute()
            r0.setIconAttr(r4)
            r0.setIconTintAttr(r3)
            X.C786410Ut5.LLJJIJIL(r0, r2)
        L29:
            r5.LLIZLLLIL = r7
            X.0FPQ r0 = r5.getViewEnlargeAvatar()
            r0.invalidate()
            return
        L33:
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r5.getViewCompactMute()
            r0.setIconAttr(r4)
            r0.setIconTintAttr(r3)
            X.C786410Ut5.LLJJIJIL(r0, r2)
            goto L29
        L41:
            if (r7 == 0) goto L80
            boolean r0 = r5.LLIZLLLIL
            if (r7 == r0) goto L60
            X.0awe r0 = r5.LLILZLL
            if (r0 == 0) goto L60
            boolean r0 = r5.e0()
            if (r0 != 0) goto L60
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r5.getCurrentRoomAnchorDisplayName()
            r1[r2] = r0
            r0 = 2131842785(0x7f1156e1, float:1.9318916E38)
            X.C766270U4b.LJII(r0, r1)
        L60:
            boolean r0 = r5.LLILZ
            if (r0 == 0) goto L72
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r5.getViewEnlargeMute()
            r0.setIconAttr(r4)
            r0.setIconTintAttr(r3)
            X.C786410Ut5.LLJJIJIL(r0, r2)
            goto L29
        L72:
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r5.getViewCompactMute()
            r0.setIconAttr(r4)
            r0.setIconTintAttr(r3)
            X.C786410Ut5.LLJJIJIL(r0, r2)
            goto L29
        L80:
            boolean r0 = r5.LLILZ
            r1 = 8
            if (r0 == 0) goto L8e
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r5.getViewEnlargeMute()
            X.C786410Ut5.LLJJIJIL(r0, r1)
            goto L29
        L8e:
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r5.getViewCompactMute()
            X.C786410Ut5.LLJJIJIL(r0, r1)
            goto L29
        L96:
            r4 = 2131106614(0x7f061b36, float:1.7825784E38)
        L99:
            r3 = 2131103656(0x7f060fa8, float:1.7819784E38)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C986720bmg.LLD(int, boolean):void");
    }

    @Override // X.InterfaceC956450azr
    public final void Z(int i, boolean z) {
        if (this.LLILZ) {
            setVolumeBorderState(false);
            return;
        }
        boolean zLJFF = getRippleHandler().LJFF(i, new AwS559S0100000_15(this, 632));
        if (!this.LLIZLLLIL && z && zLJFF) {
            setVolumeBorderState(true);
        }
    }

    @Override // X.InterfaceC956450azr
    public final void i(C954460awe c954460awe, int i, int i2) {
        C954460awe c954460awe2;
        C754570Tip c754570Tip;
        ImageModel imageModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCoHostUser");
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uid=");
        sbLIZ.append(c954460awe.LJ);
        sbLIZ.append(", from=");
        sbLIZ.append(i2);
        C20441214yg.LJIIIZ("CoHostEnlargeWindowView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = c954460awe;
        String displayName = getDisplayName();
        if (this.LLILZ) {
            getViewEnlargeNickname().setText(displayName);
        } else if (!this.LLILZIL) {
            getViewCompactNickname().setText(displayName);
        }
        if (this.LLILZ && (c954460awe2 = this.LLILZLL) != null && (c754570Tip = c954460awe2.LJIJJ) != null && (imageModel = c754570Tip.LIZJ) != null) {
            getViewEnlargeAvatar().setAvatar(imageModel);
        }
        l0("updateCoHostUser");
        LLD(-1, isMute());
        C956430azp viewPauseContainer = getViewPauseContainer();
        viewPauseContainer.LLILLL = i;
        viewPauseContainer.LLILZLL = c954460awe;
    }

    @Override // X.InterfaceC956450azr
    public final void LLFZ(int i, Rect rect, int i2, CohostTypeSpotExtra cohostTypeSpotExtra, boolean z) {
        boolean z2;
        C954460awe c954460awe;
        C754570Tip c754570Tip;
        ImageModel imageModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateWindowInfo, pos=");
        sbLIZ.append(i);
        sbLIZ.append(", windowContentType=");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("CoHostEnlargeWindowView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = i;
        if (cohostTypeSpotExtra != null) {
            z2 = cohostTypeSpotExtra.isEnlarged;
        } else {
            z2 = false;
        }
        if (this.LLILZ != z2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateEnlargeState");
            sbLIZ2.append(", linkMicId=");
            sbLIZ2.append(this.LL);
            sbLIZ2.append(", isEnlarged=");
            sbLIZ2.append(this.LLILZ);
            sbLIZ2.append(" -> ");
            sbLIZ2.append(z2);
            C20441214yg.LJIIIZ("CoHostEnlargeWindowView", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILZ = z2;
            j0();
            String displayName = getDisplayName();
            if (this.LLILZ) {
                getViewEnlargeNickname().setText(displayName);
            } else if (!this.LLILZIL) {
                getViewCompactNickname().setText(displayName);
            }
            if (this.LLILZ && (c954460awe = this.LLILZLL) != null && (c754570Tip = c954460awe.LJIJJ) != null && (imageModel = c754570Tip.LIZJ) != null) {
                getViewEnlargeAvatar().setAvatar(imageModel);
            }
            l0("updateEnlargeState");
            LLD(-1, isMute());
            setVolumeBorderState(false);
        }
    }

    public C986720bmg(final Context context, String str, DataChannel dataChannel, int i, boolean z, boolean z2) {
        Room room;
        boolean zBooleanValue;
        long id;
        boolean zCoHostCanLike$livesetting_release;
        Boolean bool;
        super(context);
        this.LL = str;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLIZ = EnumC918810a19.StateInit;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJIJIL = room;
        this.LLJJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(258));
        this.LLJJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 625));
        this.LLJJIII = C1935407i4.LIZ(new AwS559S0100000_15(this, 631));
        this.LLJJIJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 618));
        this.LLJJIJIIJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 628));
        this.LLJJIJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 626));
        this.LLJJJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 630));
        this.LLJJJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 627));
        this.LLJJJJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 629));
        this.LLJJJJJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 624));
        this.LLJJJJLIIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 619));
        this.LLJJL = C1935407i4.LIZ(new AwS559S0100000_15(this, 621));
        this.LLJJLIIIJLLLLLLLZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 622));
        this.LLJL = C1935407i4.LIZ(new AwS559S0100000_15(this, 623));
        this.LLJLIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 620));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f907g3a, this, true);
        ((C1091250eVH) findViewById(R.id.i47)).setEnableSizeChange(true);
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJ = zBooleanValue;
        IBarrageService iBarrageService = (IBarrageService) C1161920gLG.LIZJ(IBarrageService.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LLJILJIL = iBarrageService.O41(id);
        setTag(str);
        if (zBooleanValue) {
            zCoHostCanLike$livesetting_release = LiveLikeContinueAreaExpandAnchorSetting.INSTANCE.coHostCanLike$livesetting_release();
        } else {
            zCoHostCanLike$livesetting_release = LiveLikeContinueAreaExpandAudienceSetting.INSTANCE.coHostCanLike$livesetting_release();
        }
        this.LLJILLL = zCoHostCanLike$livesetting_release;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init CoHostEnlargeWindowView, linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" isEnlarged=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" isRoomOwner=");
        sbLIZ.append(z2);
        sbLIZ.append(" isAnchor=");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("CoHostEnlargeWindowView", C2188811AlT.LIZIZ(sbLIZ));
        View viewCompactBorder = getViewCompactBorder();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(LLJLLIL, C20736316Cj.LIZIZ(R.attr.ewy, getContext()));
        gradientDrawable.setCornerRadius(LLJLLL);
        viewCompactBorder.setBackground(gradientDrawable);
        C0FPQ viewEnlargeAvatar = getViewEnlargeAvatar();
        viewEnlargeAvatar.LLJ = getViewEnlargeMute();
        viewEnlargeAvatar.invalidate();
        j0();
        setClickable(true);
        setOnTouchListener(new ATListenerS448S0100000_15(this, 4));
        getViewEnlargeFollow().setClickable(true);
        C786410Ut5.g8(getViewEnlargeFollow(), new ACListenerS150S0100000_15(this, 204));
        getViewCompactFollow().setClickable(true);
        C786410Ut5.g8(getViewCompactFollow(), new ACListenerS150S0100000_15(this, 206));
        getViewEnlargeMute().setClickable(true);
        C786410Ut5.g8(getViewEnlargeMute(), new ACListenerS150S0100000_15(this, 208));
        getViewCompactMute().setClickable(true);
        C786410Ut5.g8(getViewCompactMute(), new ACListenerS150S0100000_15(this, 209));
        HandlerHook.viewPost(this, new ARunnableS115S0100000_15(this, 111));
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: X.0bmh
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                InterfaceC1085480eLy interfaceC1085480eLy;
                if ((this.LL.e0() || this.LL.LLJILLL) && (interfaceC1085480eLy = this.LL.LLJILJIL) != null) {
                    interfaceC1085480eLy.LJIIIZ(motionEvent.getRawX(), motionEvent.getRawY());
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                if (this.LL.LLILZLL == null) {
                    return;
                }
                C784440Upu.LIZ().LIZIZ(new C986760bmk());
            }
        });
        gestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: X.0bma
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                InterfaceC1085480eLy interfaceC1085480eLy;
                this.LLJILJILJ = System.currentTimeMillis();
                if ((this.e0() || this.LLJILLL) && (interfaceC1085480eLy = this.LLJILJIL) != null) {
                    interfaceC1085480eLy.LJFF();
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                long j;
                long j2;
                boolean zLJJLIL;
                String str2;
                long id2;
                String str3;
                User owner;
                String str4 = null;
                long j3 = 0;
                if (C951960asc.LIZIZ()) {
                    C986720bmg c986720bmg = this;
                    C954460awe c954460awe = c986720bmg.LLILZLL;
                    if (c954460awe != null) {
                        long j4 = c954460awe.LJ;
                        Room room2 = c986720bmg.LLJIJIL;
                        if (room2 != null && (owner = room2.getOwner()) != null) {
                            id2 = owner.getId();
                        } else {
                            id2 = 0;
                        }
                        String str5 = "own_host";
                        if (j4 == id2) {
                            str3 = "own_host";
                        } else {
                            str3 = "other_host";
                        }
                        long jFf = C915980Zwa.LJII().ff();
                        if (jFf > 0) {
                            if (jFf != id2) {
                                str5 = "other_host";
                            }
                        } else {
                            str5 = null;
                        }
                        C955400ayA.LJLJJI(j4, jFf, true, str3, str5);
                    }
                    Context context2 = context;
                    C986720bmg c986720bmg2 = this;
                    C954460awe c954460awe2 = c986720bmg2.LLILZLL;
                    boolean zIsMute = c986720bmg2.isMute();
                    C986720bmg c986720bmg3 = this;
                    c986720bmg3.getClass();
                    InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                    if (interfaceC954180awCLJIIIZ != null) {
                        C954460awe c954460awe3 = c986720bmg3.LLILZLL;
                        if (c954460awe3 == null || (str2 = c954460awe3.LJIIJJI) == null) {
                            str2 = "";
                        }
                        zLJJLIL = interfaceC954180awCLJIIIZ.LJJLIL(str2);
                    } else {
                        zLJJLIL = false;
                    }
                    if (C951960asc.LJ(context2, c954460awe2, zIsMute, zLJJLIL)) {
                        return true;
                    }
                }
                long jLJI = 1000;
                if (this.e0()) {
                    C954460awe c954460awe4 = this.LLILZLL;
                    if (c954460awe4 == null || c954460awe4.LJI() || !C915980Zwa.LJII().LJJLIIIJJI() || Math.abs(System.currentTimeMillis() - this.LLJILJILJ) <= 1000) {
                        return true;
                    }
                    C986720bmg c986720bmg4 = this;
                    DataChannel dataChannel2 = c986720bmg4.LLILLJJLI;
                    C954460awe c954460awe5 = c986720bmg4.LLILZLL;
                    if (c954460awe5 != null) {
                        str4 = c954460awe5.LJIIJJI;
                    }
                    C01H4.LIZ(dataChannel2, str4, "cohost_window");
                    return true;
                }
                if (this.LLJILLL) {
                    long jAbs = Math.abs(System.currentTimeMillis() - this.LLJILJILJ);
                    InterfaceC1085480eLy interfaceC1085480eLy = this.LLJILJIL;
                    if (interfaceC1085480eLy != null) {
                        jLJI = interfaceC1085480eLy.LJI();
                    }
                    if (jAbs <= jLJI) {
                        return true;
                    }
                }
                C954460awe c954460awe6 = this.LLILZLL;
                if (c954460awe6 != null) {
                    j = c954460awe6.LJ;
                } else {
                    j = 0;
                }
                UserProfileEvent userProfileEvent = new UserProfileEvent(j);
                C986720bmg c986720bmg5 = this;
                userProfileEvent.linkInRoomEnable = false;
                C954460awe c954460awe7 = c986720bmg5.LLILZLL;
                if (c954460awe7 != null) {
                    j2 = c954460awe7.LJFF;
                } else {
                    j2 = 0;
                }
                userProfileEvent.roomId = j2;
                userProfileEvent.currentHasMultiCoHostPermission = true;
                if (c954460awe7 != null) {
                    j3 = c954460awe7.LJ;
                }
                userProfileEvent.currentMultiCoHostGuestId = j3;
                userProfileEvent.clickModule = "link_anchor_profile";
                userProfileEvent.setFromLiveModule("match_anchor");
                userProfileEvent.enigmaEnterFrom = "pk_contributor_rank";
                C784440Upu.LIZ().LIZIZ(userProfileEvent);
                return true;
            }
        });
        this.LLJLILLLLZIIL = gestureDetector;
        this.LLJLL = C452501pT.LIZIZ(new AwS430S0200000_29(context, this, 90));
    }
}
