package X;

import Y.ARunnableS115S0100000_15;
import Y.ARunnableS48S0300000_15;
import Y.ARunnableS9S0310000_15;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937980aW4 implements InterfaceC940580aaG, InterfaceC964770bDH {
    public final boolean LL;
    public final InterfaceC938090aWF LLILLJJLI;
    public String LLILZLL;
    public boolean LLJ;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(6));
    public final long LLILZ = 4290888129L;
    public boolean LLILZIL = true;
    public int LLIZ = 720;
    public int LLIZLLLIL = 720;

    @Override // X.InterfaceC964770bDH
    public final void LIZ(long j, C1AZU c1azu) {
    }

    @Override // X.InterfaceC940580aaG
    public final void LIZJ(int i) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJFF(C954780axA c954780axA) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJIIJJI(String str, SurfaceView surfaceView) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJIIZILJ(String str, SurfaceView surfaceView) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJIJJLI(String str, boolean z) {
    }

    @Override // X.InterfaceC964770bDH
    @InterfaceC1294060jmO
    public final void LJJ(Map<String, String> map) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJI(long j, C1AZU c1azu) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJIFFI(int i, int i2, int i3) {
    }

    @Override // X.InterfaceC964770bDH
    @InterfaceC1294060jmO
    public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJIIZI(String str, String str2) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJIJIIJIL(String str, boolean z) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJIL(String str, boolean z) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJJ() {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJJJJ(String str, float f, float f2) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJJJJL(int i, C965030bDh c965030bDh) {
    }

    @Override // X.InterfaceC964770bDH
    @InterfaceC1294060jmO
    public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJJJZI(C954780axA c954780axA) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJJLL(C954780axA c954780axA) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJJZ(int i, String str) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJLIIIJ() {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
    }

    @Override // X.InterfaceC964770bDH
    @InterfaceC1294060jmO
    public final void LJJLIIIJJIZ(String str) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJLIIIJLJLI() {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJLIL() {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJLL(int i, int i2) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJZZI(C965210bDz c965210bDz) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
    }

    @Override // X.InterfaceC964770bDH
    public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
        return null;
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLLL(InterfaceC954180awC interfaceC954180awC) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIILZL() {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIL(List<LinkUser> list) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
    }

    @Override // X.InterfaceC964770bDH
    @InterfaceC1294060jmO
    public final void LLJI(String str, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage) {
    }

    @Override // X.InterfaceC964770bDH
    @InterfaceC1294060jmO
    public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLZ(String str) {
    }

    public final float LJIIIIZZ() {
        return (this.LLIZLLLIL * 8.0f) / this.LLIZ;
    }

    public final HashMap<View, ViewGroup> LJIIIZ() {
        return (HashMap) this.LLILLL.getValue();
    }

    public final void LJI() {
        for (Map.Entry<View, ViewGroup> entry : LJIIIZ().entrySet()) {
            View key = entry.getKey();
            C439101nJ.LJI(key);
            HandlerHook.viewPost(entry.getValue(), new ARunnableS115S0100000_15(key, 0));
            C417850GZz.LIZIZ(entry.getValue(), ViewOutlineProvider.BACKGROUND);
            Iterator<View> it2 = new C09RD(entry.getValue()).iterator();
            while (it2.hasNext()) {
                C417850GZz.LIZIZ(it2.next(), ViewOutlineProvider.BACKGROUND);
            }
        }
        this.LLILLJJLI.LIZ(0.0f);
        LJIIIZ().clear();
    }

    public final Drawable LJIIL(View view) {
        LivesdkLinkmicFloatWindowOptimizeSetting livesdkLinkmicFloatWindowOptimizeSetting = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE;
        if (livesdkLinkmicFloatWindowOptimizeSetting.isV1(this.LL)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(livesdkLinkmicFloatWindowOptimizeSetting.getSTROKE_WIDTH(), (int) this.LLILZ);
            gradientDrawable.setCornerRadius(LJIIIIZZ());
            return gradientDrawable;
        }
        if (livesdkLinkmicFloatWindowOptimizeSetting.isV2(this.LL)) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setStroke(livesdkLinkmicFloatWindowOptimizeSetting.getSTROKE_WIDTH(), C20736316Cj.LIZIZ(R.attr.a1h, view.getContext()));
            gradientDrawable2.setCornerRadius(LJIIIIZZ());
            return gradientDrawable2;
        }
        return null;
    }

    public final void LJIILJJIL(boolean z) {
        this.LLILZIL = z;
        if (!z) {
            LJI();
        }
    }

    public C937980aW4(boolean z, C938010aW7 c938010aW7) {
        this.LL = z;
        this.LLILLJJLI = c938010aW7;
        C915980Zwa.LJIIIIZZ().Fe(this);
    }

    @Override // X.InterfaceC940580aaG
    public final void LIZIZ(View view, ViewGroup viewGroup) {
        LJIILIIL(view, viewGroup, false);
    }

    @Override // X.InterfaceC940580aaG
    public final void LIZLLL(View view, boolean z) {
        GradientDrawable gradientDrawable;
        if (z) {
            if (!this.LLJ) {
                LivesdkLinkmicFloatWindowOptimizeSetting livesdkLinkmicFloatWindowOptimizeSetting = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE;
                if (livesdkLinkmicFloatWindowOptimizeSetting.isV2(this.LL)) {
                    gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setStroke(livesdkLinkmicFloatWindowOptimizeSetting.getSTROKE_WIDTH(), C20736316Cj.LIZIZ(R.attr.a0d, view.getContext()));
                    gradientDrawable.setCornerRadius(LJIIIIZZ());
                } else {
                    gradientDrawable = null;
                }
                view.setBackground(gradientDrawable);
            }
        } else if (this.LLJ) {
            view.setBackground(LJIIL(view));
        }
        this.LLJ = z;
    }

    @Override // X.InterfaceC940580aaG
    public final void LJ(View view, ViewGroup viewGroup) {
        C439101nJ.LJI(view);
        C930540aK4.LJJJ(viewGroup, new ARunnableS48S0300000_15(view, this, view, 0));
        C417850GZz.LIZIZ(viewGroup, ViewOutlineProvider.BACKGROUND);
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        while (it2.hasNext()) {
            C417850GZz.LIZIZ(it2.next(), ViewOutlineProvider.BACKGROUND);
        }
        LJIIIZ().remove(view);
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJIZ(String str, long j) {
        if (Intrinsics.LJFF(str, this.LLILZLL)) {
            LJIILJJIL(true);
            this.LLILZLL = null;
        }
    }

    public final void LJIILIIL(View view, ViewGroup viewGroup, boolean z) {
        if (!this.LLILZIL || LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE.isV0(this.LL)) {
            return;
        }
        if (C916800Zxu.LJFF()) {
            C439101nJ.LJI(view);
            viewGroup.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            viewGroup.setClipToOutline(true);
            Iterator<View> it2 = new C09RD(viewGroup).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    C417850GZz.LIZIZ((View) c09re.next(), ViewOutlineProvider.BACKGROUND);
                } else {
                    this.LLILLJJLI.LIZ(0.0f);
                    return;
                }
            }
        } else {
            C930540aK4.LJJIL(-1, view, viewGroup);
            C930540aK4.LJJJ(viewGroup, new ARunnableS9S0310000_15(this, z, view, viewGroup, 0));
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
        LJIILJJIL(false);
        Long l = linkUser.userId;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (l != null && l.longValue() == currentUserId) {
            this.LLILZLL = linkUser.linkMicId;
        }
    }
}
