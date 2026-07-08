package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.AfS151S0200000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiHostGuestWindowHeightEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiHostRefreshAnchorPos;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestBorderViewSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2CohostUserNamePosOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestWindowLoadingSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS696S0100000_15;

/* JADX INFO: renamed from: X.0ak1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946630ak1 extends ConstraintLayout implements C1AXB, InterfaceC932640aNS {
    public final FrameLayout LL;
    public final boolean LLILLJJLI;
    public C936770aU7 LLILLL;
    public DataChannel LLILZ;
    public String LLILZIL;
    public int LLILZLL;
    public EnumC918810a19 LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public C946640ak2 LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final boolean LLJLLL;
    public final boolean LLJZ;
    public final boolean LLJZIJLIL;
    public final int LLL;

    @Override // X.InterfaceC932640aNS
    public final boolean a0() {
        List listLJIIJJI = C1697810uHb.LJIIJJI(0L, 3L);
        return !C13LP.LJJJJ(this.LLILLL != null ? Long.valueOf(r0.LJI) : null, listLJIIJJI);
    }

    @Override // X.C1AXB
    public final boolean isEmpty() {
        return false;
    }

    private final C1324720kZq getAvatarIv() {
        return (C1324720kZq) this.LLJI.getValue();
    }

    private final C1324720kZq getBackupBg() {
        return (C1324720kZq) this.LLJJI.getValue();
    }

    private final LiveIconView getCompactFollowIcon() {
        return (LiveIconView) this.LLJLLIL.getValue();
    }

    private final ConstraintLayout getCompactInfoContainer() {
        return (ConstraintLayout) this.LLJLIL.getValue();
    }

    private final LiveIconView getCompactMuteIcon() {
        return (LiveIconView) this.LLJLILLLLZIIL.getValue();
    }

    private final C16F5 getCompactNickname() {
        return (C16F5) this.LLJLL.getValue();
    }

    private final C498540Jgq getEnlargeAvatar() {
        return (C498540Jgq) this.LLJJJJLIIL.getValue();
    }

    private final LiveIconView getEnlargeFollowIcon() {
        return (LiveIconView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final ConstraintLayout getEnlargeInfoContainer() {
        return (ConstraintLayout) this.LLJJJJJIL.getValue();
    }

    private final LiveIconView getEnlargeMuteIcon() {
        return (LiveIconView) this.LLJL.getValue();
    }

    private final C16F5 getEnlargeNickname() {
        return (C16F5) this.LLJJL.getValue();
    }

    private final int getExternalBorderCornerRadius() {
        int iMax = Math.max(0, this.LLJJIJIL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(CohostWithGuestBorderViewSetting.INSTANCE.getValue().cornerRadiusExtraDp))));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getExternalBorderCornerRadius, cr = ");
        sbLIZ.append(iMax);
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        return iMax;
    }

    private final C1324720kZq getGuestBg() {
        return (C1324720kZq) this.LLJJ.getValue();
    }

    private final View getMuteIconIv() {
        return (View) this.LLJILJIL.getValue();
    }

    private final ConstraintLayout getNormalInfoContainer() {
        return (ConstraintLayout) this.LLJJJJ.getValue();
    }

    private final C1324720kZq getPausedIconIv() {
        return (C1324720kZq) this.LLJIJIL.getValue();
    }

    private final C941290abP getRippleHandler() {
        return (C941290abP) this.LLJJIJI.getValue();
    }

    private final C16F5 getUsernameTv() {
        return (C16F5) this.LLJILJILJ.getValue();
    }

    private final View getViewContainerClickView() {
        return (View) this.LLJ.getValue();
    }

    private final View getVoiceVolumeBorder() {
        return (View) this.LLJJIII.getValue();
    }

    public final void F0() {
        if (!this.LLJJJ || this.LLJJJIL) {
            return;
        }
        if (i0()) {
            C500260Jjc.LLFFF(getCompactMuteIcon());
        } else {
            C500260Jjc.LJIILIIL(getCompactMuteIcon());
        }
    }

    public final void N0() {
        InterfaceC954180awC interfaceC954180awCLJIIIZ;
        boolean z = false;
        boolean z2 = (this.LLIZLLLIL || !CohostWithGuestWindowLoadingSetting.INSTANCE.isEnabled() || !C950220apo.LJI() || ((interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ()) != null && interfaceC954180awCLJIIIZ.LJIILIIL() && this.LLIZ == EnumC918810a19.StateLinked)) ? false : !Intrinsics.LJFF(C946660ak4.LJFF.get(getLinkMicId()), Boolean.TRUE);
        boolean zN0 = n0();
        boolean z3 = getOnlineState() == 2;
        if (zN0 && !z3) {
            z = true;
        }
        if (this.LLJLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateVideoUI (");
            sbLIZ.append(hashCode());
            sbLIZ.append("), guest = ");
            C936770aU7 c936770aU7 = this.LLILLL;
            sbLIZ.append(c936770aU7 != null ? Long.valueOf(c936770aU7.LIZ) : null);
            sbLIZ.append(' ');
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(",shouldShowLoading = ");
            sbLIZ.append(z2);
            sbLIZ.append(", isMuted = ");
            sbLIZ.append(zN0);
            sbLIZ.append(", isPaused = ");
            sbLIZ.append(z3);
            sbLIZ.append(" isEnlargeLayout = ");
            sbLIZ.append(this.LLJJJ);
            sbLIZ.append(" isEnlarged = ");
            sbLIZ.append(this.LLJJJIL);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (z2) {
            C500260Jjc.LLFFF(getAvatarIv());
            if (l0()) {
                C500260Jjc.LJIILIIL(getGuestBg());
                C500260Jjc.LJIILIIL(getBackupBg());
            } else {
                C500260Jjc.LLFFF(getGuestBg());
                C500260Jjc.LLFFF(getBackupBg());
            }
        } else {
            C1324720kZq avatarIv = getAvatarIv();
            if (this.LLJLLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateVideoUI, shouldShowAvatar = ");
                sbLIZ2.append(z);
                C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (z) {
                C500260Jjc.LLFFF(avatarIv);
            } else {
                C500260Jjc.LJIILIIL(avatarIv);
            }
            C1324720kZq guestBg = getGuestBg();
            if (l0()) {
                C500260Jjc.LJIILIIL(guestBg);
            } else if (zN0 || z3) {
                C500260Jjc.LLFFF(guestBg);
            } else {
                C500260Jjc.LJIILIIL(guestBg);
            }
            C1324720kZq backupBg = getBackupBg();
            if (l0()) {
                C500260Jjc.LJIILIIL(backupBg);
            } else if (zN0 || z3) {
                C500260Jjc.LLFFF(backupBg);
            } else {
                C500260Jjc.LJIILIIL(backupBg);
            }
        }
        C1324720kZq pausedIconIv = getPausedIconIv();
        if (z3) {
            C500260Jjc.LLFFF(pausedIconIv);
        } else {
            C500260Jjc.LJIILIIL(pausedIconIv);
        }
        C941290abP rippleHandler = getRippleHandler();
        if (z) {
            return;
        }
        rippleHandler.LIZLLL = true;
    }

    public final ImageView getFollowIconIv() {
        return (ImageView) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC932640aNS
    public long getFollowStatus() {
        C936770aU7 c936770aU7 = this.LLILLL;
        if (c936770aU7 != null) {
            return c936770aU7.LJI;
        }
        return -1L;
    }

    @Override // X.C1AXB
    public Integer getLogicPos() {
        return Integer.valueOf(this.LLILZLL);
    }

    @Override // X.C1AXB
    public Integer getUiPos() {
        return Integer.valueOf(this.LLILZLL);
    }

    @Override // X.C1AXB
    public Long getUid() {
        C936770aU7 c936770aU7 = this.LLILLL;
        if (c936770aU7 != null) {
            return Long.valueOf(c936770aU7.LIZ);
        }
        return null;
    }

    public final boolean j0() {
        return this.LLJJJ && this.LLJJJIL;
    }

    private final int getOnlineState() {
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        Integer numValueOf = interfaceC954180awCLJIIIZ != null ? Integer.valueOf(interfaceC954180awCLJIIIZ.LJLIIL(this.LLILZIL)) : null;
        if (this.LLJZIJLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getOnlineState, guest = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", return = ");
            sbLIZ.append(numValueOf);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final void C0() {
        Long l;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestFollow, guest = ");
        sbLIZ.append(this.LLILZIL);
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJIILIIL(getFollowIconIv());
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C1099420eiS c1099420eiS = new C1099420eiS();
        C936770aU7 c936770aU7 = this.LLILLL;
        long jLongValue = 0;
        c1099420eiS.LIZIZ(c936770aU7 != null ? c936770aU7.LIZ : 0L);
        C936770aU7 c936770aU72 = this.LLILLL;
        if (c936770aU72 != null && (l = c936770aU72.LIZIZ) != null) {
            jLongValue = l.longValue();
        }
        c1099420eiS.LJ(jLongValue);
        c1099420eiS.getClass();
        interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099420eiS)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS184S0100000_15(this, 136), new AfS184S0100000_15(this, 135));
    }

    public final void E0() {
        boolean zI0 = i0();
        if (this.LLJLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateAudioUI, guest = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", isMuted = ");
            sbLIZ.append(zI0);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        }
        View muteIconIv = getMuteIconIv();
        if (zI0) {
            C500260Jjc.LLFFF(muteIconIv);
        } else {
            C500260Jjc.LJIILIIL(muteIconIv);
        }
        C16F5 usernameTv = getUsernameTv();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) usernameTv.getLayoutParams();
        marginLayoutParams.setMarginStart(i0() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) : this.LLL);
        C786410Ut5.y6(usernameTv, marginLayoutParams);
        I0();
        F0();
    }

    public final void I0() {
        if (j0()) {
            if (i0()) {
                C500260Jjc.LLFFF(getEnlargeMuteIcon());
            } else {
                C500260Jjc.LJIILIIL(getEnlargeMuteIcon());
            }
        }
    }

    @Override // X.C1AXB
    public Boolean getAudioMute() {
        return Boolean.valueOf(i0());
    }

    @Override // X.C1AXB
    public int getH() {
        return getHeight();
    }

    @Override // X.C1AXB
    public Boolean getVideoMute() {
        return Boolean.valueOf(n0());
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

    public final boolean i0() {
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        Boolean boolValueOf = interfaceC954180awCLJIIIZ != null ? Boolean.valueOf(interfaceC954180awCLJIIIZ.LJ(this.LLILZIL)) : null;
        if (this.LLJZIJLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isAudioMuted, guest = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", return = ");
            sbLIZ.append(boolValueOf);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }

    public final boolean l0() {
        return (!j0() || C950220apo.LJI() || C950220apo.LJIJI()) ? false : true;
    }

    public final boolean n0() {
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        Boolean boolValueOf = interfaceC954180awCLJIIIZ != null ? Boolean.valueOf(interfaceC954180awCLJIIIZ.LJJLIL(this.LLILZIL)) : null;
        if (this.LLJZIJLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isVideoMuted, guest = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", return = ");
            sbLIZ.append(boolValueOf);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946630ak1.onAttachedToWindow():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ?? arrayList;
        super.onDetachedFromWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow, hashcode = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", pos = ");
        sbLIZ.append(this.LLILZLL);
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ() || CohostWithGuestBorderViewSetting.INSTANCE.isRemoveWithoutPost()) {
            C946640ak2 c946640ak2 = this.LLJJIJIIJIL;
            if (c946640ak2 != null) {
                C500260Jjc.LJJJLL(c946640ak2);
            }
        } else {
            HandlerHook.viewPost(this, new ARunnableS115S0100000_15(this, 127));
        }
        if (C963580bBM.LIZ()) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        long id = roomLJJLI != null ? roomLJJLI.getId() : 0L;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        List<LinkUser> listLIZLLL = interfaceC954180awCLJIIIZ != null ? interfaceC954180awCLJIIIZ.LIZLLL() : null;
        if (listLIZLLL != null) {
            List<LinkUser> listLIZ = C948780anU.LIZ(listLIZLLL);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (ArrayList) listLIZ) {
                Long l = ((LinkUser) obj).roomId;
                if (l == null || l.longValue() != id) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((LinkUser) it2.next()).linkMicId);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (this.LLILZLL == 4 && arrayList.isEmpty()) {
            C20441214yg.LIZIZ("MultiHostGuestWindowView", "onDetachedFromWindow notifyWindowHeight");
            z0(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
    }

    public final void u0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadPausedIcon, guest = ");
        sbLIZ.append(this.LLILZIL);
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZ = getPausedIconIv();
        c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1");
        c1143920fsE.LIZJ = "ttlive_pause_live_anim.webp";
        c1143920fsE.LJFF = true;
        C1143680frq.LJIIIIZZ(c1143920fsE);
    }

    @Override // X.C1AXB
    public String getLinkMicId() {
        return this.LLILZIL;
    }

    private final void setBorderRadius(int i) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        if (this.LLJLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBorderRadius, guest = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", cornerRadius = ");
            sbLIZ.append(i);
            sbLIZ.append(", externalBorder = ");
            sbLIZ.append(this.LLILLJJLI);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJJIJIL = i;
        Drawable background = null;
        if (this.LLILLJJLI) {
            C946640ak2 c946640ak2 = this.LLJJIJIIJIL;
            if (c946640ak2 != null) {
                background = c946640ak2.getBackground();
            }
            if ((background instanceof GradientDrawable) && (gradientDrawable2 = (GradientDrawable) background) != null) {
                gradientDrawable2.setCornerRadius(getExternalBorderCornerRadius());
                return;
            }
            return;
        }
        View voiceVolumeBorder = getVoiceVolumeBorder();
        Drawable background2 = getVoiceVolumeBorder().getBackground();
        if ((background2 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background2) != null) {
            if (i > 0) {
                gradientDrawable.setCornerRadius(i - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))) / 2.0f));
            }
            background = gradientDrawable;
        }
        voiceVolumeBorder.setBackground(background);
    }

    public final void B0(C936770aU7 c936770aU7) {
        Long lValueOf;
        String str;
        ImageModel imageModel;
        long j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestInfo, guest = ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", uid = ");
        Long lValueOf2 = null;
        if (c936770aU7 != null) {
            lValueOf = Long.valueOf(c936770aU7.LIZ);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", nickname = ");
        if (c936770aU7 != null) {
            str = c936770aU7.LJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", avatar = ");
        if (c936770aU7 != null) {
            imageModel = c936770aU7.LJFF;
        } else {
            imageModel = null;
        }
        sbLIZ.append(imageModel);
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = c936770aU7;
        M0(c936770aU7);
        if (c936770aU7 == null || c936770aU7.LJI == -1 || c936770aU7.LJ == null || c936770aU7.LJFF == null) {
            AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(this, c936770aU7, 63);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("queryGuestInfo, guest = ");
            sbLIZ2.append(this.LLILZIL);
            sbLIZ2.append(", uid = ");
            C936770aU7 c936770aU72 = this.LLILLL;
            if (c936770aU72 != null) {
                lValueOf2 = Long.valueOf(c936770aU72.LIZ);
            }
            sbLIZ2.append(lValueOf2);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C936770aU7 c936770aU73 = this.LLILLL;
            if (c936770aU73 != null) {
                j = c936770aU73.LIZ;
            } else {
                j = 0;
            }
            interfaceC500940JkiUser.LJ(j, "MultiHostGuestWindowView", "MultiHostGuestWindowView").LJJIIZ(new AfS151S0200000_15(this, awS416S0200000_15, 38), new C09JN() { // from class: X.00LC
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("MultiHostGuestWindowView@bdd0.queryGuestInfo$2");
                    C1C7U.LIZIZ("MultiHostGuestWindowView@bdd0.queryGuestInfo$2");
                }
            });
        }
    }

    public final void L0(boolean z) {
        int i;
        C946640ak2 c946640ak2 = this.LLJJIJIIJIL;
        if (c946640ak2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateExternalBorderView, borderView = ");
            sbLIZ.append(c946640ak2.hashCode());
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                i = R.attr.fxy;
            } else {
                i = R.attr.ewy;
            }
            int iLIZIZ = C20736316Cj.LIZIZ(i, getContext());
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(CohostWithGuestBorderViewSetting.INSTANCE.getValue().strokeWidthDp)));
            int externalBorderCornerRadius = getExternalBorderCornerRadius();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(0);
            gradientDrawable.setStroke(iLIZIZ2, iLIZIZ);
            if (externalBorderCornerRadius > 0) {
                gradientDrawable.setCornerRadius(externalBorderCornerRadius - (iLIZIZ2 / 2.0f));
            }
            c946640ak2.setBackground(gradientDrawable);
        }
    }

    @Override // X.InterfaceC932640aNS
    public final void LLJJL(String str) {
        C01H4.LIZ(this.LLILZ, this.LLILZIL, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(X.C936770aU7 r6) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946630ak1.M0(X.0aU7):void");
    }

    public final void h0(FrameLayout frameLayout) {
        boolean zIsRtlEnabledForAudience;
        ViewGroup viewGroup;
        C946640ak2 c946640ak2 = this.LLJJIJIIJIL;
        if (c946640ak2 == null) {
            c946640ak2 = new C946640ak2(frameLayout.getContext());
        }
        c946640ak2.setLinkmicId(this.LLILZIL);
        CohostWithGuestBorderViewSetting cohostWithGuestBorderViewSetting = CohostWithGuestBorderViewSetting.INSTANCE;
        if (cohostWithGuestBorderViewSetting.isRtlEnabledForAll()) {
            zIsRtlEnabledForAudience = true;
        } else if (C950220apo.LJI()) {
            zIsRtlEnabledForAudience = cohostWithGuestBorderViewSetting.isRtlEnabledForAnchor();
        } else if (C950220apo.LJIJI()) {
            zIsRtlEnabledForAudience = cohostWithGuestBorderViewSetting.isRtlEnabledForGuest();
        } else {
            zIsRtlEnabledForAudience = cohostWithGuestBorderViewSetting.isRtlEnabledForAudience();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createExternalBorderView, adaptRTL=");
        sbLIZ.append(zIsRtlEnabledForAudience);
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        FrameLayout.LayoutParams layoutParamsLIZ = C425250Glv.LIZ(this, frameLayout, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(cohostWithGuestBorderViewSetting.getValue().extraSizeDp))), 0, zIsRtlEnabledForAudience);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c946640ak2);
        c946640ak2.setLayoutParams(layoutParamsLIZ);
        ViewParent parent = c946640ak2.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(c946640ak2, viewGroup);
        }
        frameLayout.addView(c946640ak2);
        this.LLJJIJIIJIL = c946640ak2;
        L0(false);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createExternalBorderView, borderView_hashcode=");
        sbLIZ2.append(c946640ak2.hashCode());
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void p0(ImageModel imageModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadAvatar, guest = ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", imageModel = ");
        sbLIZ.append(imageModel);
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        if (C1819620xS4.LIZLLL(imageModel)) {
            c0jbnLIZ.LJIIIZ(imageModel);
        } else {
            c0jbnLIZ.LJIJ(R.drawable.elb);
        }
        C1324610kZf c1324610kZfLIZ = c0jbnLIZ.LIZ(getAvatarIv().getWidth(), getAvatarIv().getHeight());
        c1324610kZfLIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZ.LJJI(getAvatarIv());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [REQUEST, X.0kbR] */
    public final void s0(ImageModel imageModel) {
        REQUEST requestLIZ;
        String str;
        List urls;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadBg, guest = ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", imageModel = ");
        sbLIZ.append(imageModel);
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C1291820jim c1291820jim = new C1291820jim(5);
        if (C1819620xS4.LIZLLL(imageModel)) {
            if (imageModel == null || (urls = imageModel.getUrls()) == null || (str = (String) C13LP.LJJJLL(urls)) == null) {
                str = "";
            }
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LJIILIIL = c1291820jim;
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
            imageDecodeOptionsBuilder.getClass();
            c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            requestLIZ = c1325700kbQLIZLLL.LIZ();
        } else {
            C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.elb);
            c1325700kbQLIZJ.LJIILIIL = c1291820jim;
            requestLIZ = c1325700kbQLIZJ.LIZ();
        }
        C1324720kZq guestBg = getGuestBg();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LIZLLL = requestLIZ;
        c1320810kTXLIZJ.LJIILJJIL = getGuestBg().getController();
        guestBg.setController(c1320810kTXLIZJ.LIZ());
        getGuestBg().setForeground(new ColorDrawable(C497740JfY.LIZLLL(R.attr.eos, getContext())));
        C1325700kbQ c1325700kbQLIZJ2 = C1325700kbQ.LIZJ(R.drawable.elb);
        c1325700kbQLIZJ2.LJIILIIL = c1291820jim;
        ?? LIZ = c1325700kbQLIZJ2.LIZ();
        C1324720kZq backupBg = getBackupBg();
        C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
        c1320810kTXLIZJ2.LIZLLL = LIZ;
        c1320810kTXLIZJ2.LJIILJJIL = getBackupBg().getController();
        backupBg.setController(c1320810kTXLIZJ2.LIZ());
    }

    public final void setBorderState(boolean z) {
        int i;
        GradientDrawable gradientDrawable;
        if (this.LLJLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBorderState, guest = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", shouldShowVolume = ");
            sbLIZ.append(z);
            sbLIZ.append(", externalBorder = ");
            sbLIZ.append(this.LLILLJJLI);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLILLJJLI) {
            L0(z);
            return;
        }
        if (this.LLJJJIL) {
            C500260Jjc.LJIILIIL(getVoiceVolumeBorder());
            return;
        }
        C500260Jjc.LLFFF(getVoiceVolumeBorder());
        if (z) {
            i = R.attr.fxy;
        } else {
            i = R.attr.ewy;
        }
        View voiceVolumeBorder = getVoiceVolumeBorder();
        Drawable background = getVoiceVolumeBorder().getBackground();
        GradientDrawable gradientDrawable2 = null;
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), C20736316Cj.LIZIZ(i, getContext()));
            gradientDrawable2 = gradientDrawable;
        }
        voiceVolumeBorder.setBackground(gradientDrawable2);
    }

    public final void z0(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyWindowHeight, pos = ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", height = ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.LC0(MultiHostGuestWindowHeightEvent.class, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(X.InterfaceC937840aVq r16, X.C955080axe r17) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946630ak1.O0(X.0aVq, X.0axe):void");
    }

    public final void Z(int i, boolean z) {
        boolean z2;
        if (this.LLJZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTalkStateUpdate, guest = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", isTalking = ");
            sbLIZ.append(z);
            sbLIZ.append(", volume = ");
            sbLIZ.append(i);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        }
        boolean zLJFF = getRippleHandler().LJFF(i, new AwS559S0100000_15(this, 675));
        if (!i0() && z && zLJFF) {
            if (getOnlineState() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (n0() && !z2) {
                getRippleHandler().LIZLLL(i);
            } else {
                getRippleHandler().LIZLLL = true;
            }
            setBorderState(true);
            return;
        }
        getRippleHandler().LIZLLL = true;
    }

    public C946630ak1(Context context, FrameLayout frameLayout, boolean z) {
        super(context);
        this.LL = frameLayout;
        this.LLILLJJLI = z;
        this.LLILZIL = "";
        this.LLIZ = EnumC918810a19.StateIdle;
        this.LLJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 657));
        this.LLJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 659));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 674));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 672));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 656));
        this.LLJILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 670));
        this.LLJJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 671));
        this.LLJJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 660));
        this.LLJJIII = C452501pT.LIZIZ(new AwS559S0100000_15(this, 658));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 655));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 673));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 667));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 665));
        this.LLJJL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 669));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 666));
        this.LLJL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 668));
        this.LLJLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 662));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 663));
        this.LLJLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 664));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 661));
        this.LLJLLL = true;
        this.LLJZ = true;
        this.LLJZIJLIL = true;
        this.LLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h98, this, true);
    }

    public final void e0(DataChannel dataChannel, InterfaceC937840aVq interfaceC937840aVq, C955080axe c955080axe, C936770aU7 c936770aU7) {
        int iLJIIIIZZ;
        FrameLayout frameLayoutLJJIIJ;
        String strLIZ;
        int cornerRadius;
        if (interfaceC937840aVq != null) {
            iLJIIIIZZ = interfaceC937840aVq.LJIIIIZZ();
        } else if (c955080axe == null) {
            return;
        } else {
            iLJIIIIZZ = c955080axe.LJ;
        }
        this.LLILZLL = iLJIIIIZZ;
        Integer numValueOf = null;
        if (interfaceC937840aVq == null || (frameLayoutLJJIIJ = interfaceC937840aVq.LJJIIJ()) == null) {
            if (c955080axe != null) {
                frameLayoutLJJIIJ = c955080axe.LIZ;
            } else {
                frameLayoutLJJIIJ = null;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attach, hashCode = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", pos = ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", guest = ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", window height = ");
        if (frameLayoutLJJIIJ != null) {
            numValueOf = Integer.valueOf(frameLayoutLJJIIJ.getHeight());
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ = dataChannel;
        if ((interfaceC937840aVq == null || (strLIZ = interfaceC937840aVq.LJ()) == null) && (c955080axe == null || (strLIZ = c955080axe.LIZ()) == null)) {
            strLIZ = "";
        }
        this.LLILZIL = strLIZ;
        C946640ak2 c946640ak2 = this.LLJJIJIIJIL;
        if (c946640ak2 != null) {
            c946640ak2.setLinkmicId(strLIZ);
        }
        C946640ak2 c946640ak22 = this.LLJJIJIIJIL;
        if (c946640ak22 != null) {
            c946640ak22.setPos(this.LLILZLL);
        }
        if (interfaceC937840aVq != null) {
            cornerRadius = interfaceC937840aVq.getCornerRadius();
        } else if (c955080axe != null) {
            cornerRadius = c955080axe.LJI;
        } else {
            cornerRadius = 0;
        }
        this.LLJJIJIL = cornerRadius;
        this.LLIZLLLIL = false;
        CohostWithGuestWindowLoadingSetting cohostWithGuestWindowLoadingSetting = CohostWithGuestWindowLoadingSetting.INSTANCE;
        if (cohostWithGuestWindowLoadingSetting.isEnabled() && cohostWithGuestWindowLoadingSetting.isTimeOutEnabled()) {
            long jTimeOutMs = cohostWithGuestWindowLoadingSetting.timeOutMs();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initLoading, set_time_out = ");
            sbLIZ2.append(jTimeOutMs);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ2));
            HandlerHook.viewPostDelay(this, new ARunnableS115S0100000_15(this, 126), jTimeOutMs);
        }
        B0(c936770aU7);
        int i = this.LLJJIJIL;
        if (this.LLJLLL) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("initBorder, guest = ");
            sbLIZ3.append(this.LLILZIL);
            sbLIZ3.append(", cornerRadius = ");
            sbLIZ3.append(i);
            sbLIZ3.append(", externalBorder = ");
            sbLIZ3.append(this.LLILLJJLI);
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (this.LLILLJJLI) {
            C500260Jjc.LJIILIIL(getVoiceVolumeBorder());
            L0(false);
        } else {
            C500260Jjc.LLFFF(getVoiceVolumeBorder());
            View voiceVolumeBorder = getVoiceVolumeBorder();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(0);
            gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), C20736316Cj.LIZIZ(R.attr.ewy, getContext()));
            if (i > 0) {
                gradientDrawable.setCornerRadius(i - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))) / 2.0f));
            }
            voiceVolumeBorder.setBackground(gradientDrawable);
        }
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 213), getViewContainerClickView());
        C786410Ut5.I7(new AbS696S0100000_15(this, 4), getFollowIconIv());
        getEnlargeFollowIcon().setClickable(true);
        C786410Ut5.g8(getEnlargeFollowIcon(), new ACListenerS150S0100000_15(this, 214));
        getCompactFollowIcon().setClickable(true);
        C786410Ut5.g8(getCompactFollowIcon(), new ACListenerS150S0100000_15(this, 215));
        C930540aK4.LJJJ(this, new ARunnableS115S0100000_15(this, 125));
        if (CohostWithGuestPhase2CohostUserNamePosOpt.INSTANCE.updateOnAttached()) {
            if (isLaidOut() && !isLayoutRequested()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("attach, doOnLayout, view.height=");
                sbLIZ4.append(getHeight());
                C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ4));
                if (dataChannel != null) {
                    dataChannel.FQ2(MultiHostRefreshAnchorPos.class);
                    return;
                }
                return;
            }
            addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986910bmz(dataChannel, this, 0));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!C963580bBM.LIZ() && this.LLILZLL == 4 && i2 != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSizeChanged notifyWindowHeight, pos = ");
            sbLIZ.append(this.LLILZLL);
            sbLIZ.append(", h = ");
            sbLIZ.append(i2);
            C20441214yg.LIZIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
            z0(i2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
    }
}
