package X;

import Y.AAListenerS325S0100000_14;
import Y.AUListenerS57S0201000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.tracker.MessageListTracker;
import com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.SkeletonLayoutReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMAwemeSideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.vibefeed.feed.interact.msg.VibeMessageCell;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ZtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914000ZtO implements InterfaceC2211931Bhf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2211931Bhf
    public final void LIZ(View view, String str) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view, str);
                break;
            case 1:
                LIZ$1(this, view, str);
                break;
            case 2:
                LIZ$2(this, view, str);
                break;
            case 3:
                LIZ$3(this, view, str);
                break;
            case 4:
                LIZ$4(this, view, str);
                break;
            case 5:
                LIZ$5(this, view, str);
                break;
        }
    }

    public C914000ZtO(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(X.C914000ZtO r21, android.view.View r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914000ZtO.LIZ$0(X.0ZtO, android.view.View, java.lang.String):void");
    }

    public static final void LIZ$1(C914000ZtO c914000ZtO, View view, String str) {
        ShareLiveCardAssem shareLiveCardAssem = (ShareLiveCardAssem) c914000ZtO.l0;
        try {
            shareLiveCardAssem.Jp((C0ZZ9) C631370Opb.LIZ(shareLiveCardAssem));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        ((ShareLiveCardAssem) c914000ZtO.l0).LLLILZ = System.currentTimeMillis();
    }

    public static final void LIZ$2(C914000ZtO c914000ZtO, View view, String str) {
        try {
            SkeletonLayoutAssemblerBridge skeletonLayoutAssemblerBridgeBp = ((IMSkeletonLayoutReusedUISlotAssem) c914000ZtO.l0).Bp();
            if (skeletonLayoutAssemblerBridgeBp != null && skeletonLayoutAssemblerBridgeBp.mz0()) {
                return;
            }
            boolean zAp = ((IMSkeletonLayoutReusedUISlotAssem) c914000ZtO.l0).Ap();
            MessageListTracker messageListTracker = (MessageListTracker) ((IMSkeletonLayoutReusedUISlotAssem) c914000ZtO.l0).LLJLLIL.getValue();
            if (messageListTracker != null) {
                messageListTracker.nc0(new C788980UxE(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ((IMSkeletonLayoutReusedUISlotAssem) c914000ZtO.l0)), C631370Opb.LIZIZ((IMSkeletonLayoutReusedUISlotAssem) c914000ZtO.l0), zAp));
            }
            if (zAp) {
                ((IMSkeletonLayoutReusedUISlotAssem) c914000ZtO.l0).Tp();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZ$3(C914000ZtO c914000ZtO, View view, String str) {
        try {
            SkeletonLayoutAssemblerBridge skeletonLayoutAssemblerBridgeYp = ((SkeletonLayoutReusedUISlotAssem) c914000ZtO.l0).yp();
            if (skeletonLayoutAssemblerBridgeYp != null && skeletonLayoutAssemblerBridgeYp.mz0()) {
                return;
            }
            boolean zUp = ((SkeletonLayoutReusedUISlotAssem) c914000ZtO.l0).up();
            MessageListTracker messageListTracker = (MessageListTracker) ((SkeletonLayoutReusedUISlotAssem) c914000ZtO.l0).LLJLL.getValue();
            if (messageListTracker != null) {
                messageListTracker.nc0(new C788980UxE(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ((SkeletonLayoutReusedUISlotAssem) c914000ZtO.l0)), C631370Opb.LIZIZ((SkeletonLayoutReusedUISlotAssem) c914000ZtO.l0), zUp));
            }
            if (zUp) {
                ((SkeletonLayoutReusedUISlotAssem) c914000ZtO.l0).getClass();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZ$4(C914000ZtO c914000ZtO, View view, String str) {
        ((VibeMessageCell) c914000ZtO.l0).I5(true);
    }

    public static final void LIZ$5(C914000ZtO c914000ZtO, View view, String str) {
        long jCurrentTimeMillis;
        SessionInfo sessionInfo;
        DMAwemeSideMessageStatusReusedSkeletonUISlot dMAwemeSideMessageStatusReusedSkeletonUISlot;
        Fragment fragmentLJI;
        C457780HxI chatHierarchyData = ((DMAwemeSideMessageStatusReusedSkeletonUISlot) c914000ZtO.l0).getChatHierarchyData();
        if (chatHierarchyData != null && (sessionInfo = chatHierarchyData.LL) != null && (fragmentLJI = C724240Sb0.LJI((dMAwemeSideMessageStatusReusedSkeletonUISlot = (DMAwemeSideMessageStatusReusedSkeletonUISlot) c914000ZtO.l0))) != null && C494501wF.LIZ(fragmentLJI)) {
            try {
                InterfaceC902170ZaJ interfaceC902170ZaJLJFF = C912070ZqH.LIZIZ.LJFF();
                AssemVMLazy assemVMLazy = dMAwemeSideMessageStatusReusedSkeletonUISlot.LLLF;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SideMessageStatusReusedSkeletonUISlot.LLLIL;
                interfaceC902170ZaJLJFF.LJIIIIZZ(sessionInfo, ((C457970Hxb) assemVMLazy.getValue().getState()).LL, "quick_live_react", null, "next_to_message", C0I0B.LJFF.LIZIZ());
            } catch (C738130SxP e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                C1AF0.LJFF(e, "DMAwemeSideMessageStatusReusedSkeletonUISlot onExposeCallback showCameraEntrance AssemIllegalStateException");
            }
        }
        C910050Zn1.LIZ.getClass();
        if (C306990C1p.LIZ(C910050Zn1.LIZIZ)) {
            InterfaceC12999056v interfaceC12999056vLIZ = C910050Zn1.LIZ();
            if (interfaceC12999056vLIZ != null) {
                EnumC12995056r enumC12995056r = EnumC12995056r.SHOW;
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                if (iMHostApi != null) {
                    jCurrentTimeMillis = iMHostApi.LIZIZ();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                if (interfaceC12999056vLIZ.LIZIZ(enumC12995056r, curUserId, jCurrentTimeMillis)) {
                    return;
                }
            }
        } else if (((Keva) C910050Zn1.LIZJ.getValue()).getBoolean(C910050Zn1.LIZIZ(), false)) {
            return;
        }
        View view2 = (View) ((DMAwemeSideMessageStatusReusedSkeletonUISlot) c914000ZtO.l0).LLLILZ.getValue();
        DMAwemeSideMessageStatusReusedSkeletonUISlot dMAwemeSideMessageStatusReusedSkeletonUISlot2 = (DMAwemeSideMessageStatusReusedSkeletonUISlot) c914000ZtO.l0;
        if (view2.isLaidOut() && !view2.isLayoutRequested()) {
            int width = dMAwemeSideMessageStatusReusedSkeletonUISlot2.Jp().getWidth();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS57S0201000_14(width, view2, dMAwemeSideMessageStatusReusedSkeletonUISlot2, 3));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILJJIL());
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS57S0201000_14(width, view2, dMAwemeSideMessageStatusReusedSkeletonUISlot2, 2));
            valueAnimatorOfFloat2.setDuration(250L);
            valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILJJIL());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, ObjectAnimator.ofFloat(dMAwemeSideMessageStatusReusedSkeletonUISlot2.LLLILZJ.getValue(), "alpha", 1.0f, 0.0f));
            animatorSet.setInterpolator(C1619980sG4.LJIILJJIL());
            animatorSet.setDuration(250L);
            animatorSet.setStartDelay(3000L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(valueAnimatorOfFloat2, ObjectAnimator.ofFloat(dMAwemeSideMessageStatusReusedSkeletonUISlot2.LLLILZJ.getValue(), "alpha", 0.0f, 1.0f));
            animatorSet2.setInterpolator(C1619980sG4.LJIILJJIL());
            animatorSet2.setDuration(250L);
            animatorSet2.addListener(new AAListenerS325S0100000_14(animatorSet, 5));
            animatorSet2.start();
            return;
        }
        view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC913850Zt9(dMAwemeSideMessageStatusReusedSkeletonUISlot2, 1));
    }
}
