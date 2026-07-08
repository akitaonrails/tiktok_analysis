package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.live.slot.barrage.BarrageAnimation$initHandler$1;
import com.bytedance.android.livesdk.dataChannel.PublicScreenHeightInsufficient;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.level.LiveBarrageReleasePlayerTimeSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBarrageSwitchSettings;
import com.bytedance.android.livesdk.livesetting.level.UserLevelConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutRenderingScopeOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveRankingAndPrivilegeDowngradeSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BarrageTypeFansLevelParam;
import com.bytedance.android.livesdk.model.message.BarrageTypeUserGradeParam;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090880eUg {
    public final View LIZ;
    public final InterfaceC1090750eUT LIZIZ;
    public final DataChannel LIZJ;
    public C1143920fsE LIZLLL;
    public C1090830eUb LJ;
    public final boolean LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 362));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS561S0100000_17(this, 361));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 373));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 360));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 365));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 366));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 357));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 371));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 364));
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 363));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 359));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 358));
    public final C01GW LJIJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 356));
    public final C01GW LJIJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 370));
    public final C01GW LJIJJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 372));
    public final C01GW LJIJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 369));
    public final C01GW LJIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 368));
    public final C01GW LJJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 374));
    public final C01GW LJJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 376));
    public final C01GW LJJIFFI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 367));
    public final C01GW LJJII = C452501pT.LIZIZ(new AwS561S0100000_17(this, 375));
    public final C01GW LJJIII = C452501pT.LIZIZ(new AwS561S0100000_17(this, 377));
    public final int LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public BarrageAnimation$initHandler$1 LJJIIZI;
    public final long LJJIJ;
    public InterfaceC1091030eUv LJJIJIIJI;

    public final void LIZIZ() {
        this.LJJIIZ = false;
        C1322090kVb c1322090kVb = (C1322090kVb) this.LJIJI.getValue();
        if (c1322090kVb != null) {
            c1322090kVb.setImageDrawable(null);
        }
        C1324720kZq c1324720kZqLJIILL = LJIILL();
        if (c1324720kZqLJIILL != null) {
            c1324720kZqLJIILL.setImageDrawable(null);
        }
    }

    public final C421370Gff LJFF() {
        return (C421370Gff) this.LJIIL.getValue();
    }

    public final C1324720kZq LJI() {
        return (C1324720kZq) this.LJIIZILJ.getValue();
    }

    public final C16F5 LJII() {
        return (C16F5) this.LJIIIZ.getValue();
    }

    public final C1324720kZq LJIIIIZZ() {
        return (C1324720kZq) this.LJII.getValue();
    }

    public final LinearLayout LJIIIZ() {
        return (LinearLayout) this.LJI.getValue();
    }

    public final C1324720kZq LJIIJ() {
        return (C1324720kZq) this.LJIILL.getValue();
    }

    public final ConstraintLayout LJIIJJI() {
        return (ConstraintLayout) this.LJIIJ.getValue();
    }

    public final LinearLayout LJIIL() {
        return (LinearLayout) this.LJIIJJI.getValue();
    }

    public final FrameLayout LJIILIIL() {
        return (FrameLayout) this.LJJIFFI.getValue();
    }

    public final Space LJIILJJIL() {
        return (Space) this.LJIILIIL.getValue();
    }

    public final C1324720kZq LJIILL() {
        return (C1324720kZq) this.LJIJJ.getValue();
    }

    public final C16F5 LJIILLIIL() {
        return (C16F5) this.LJIIIIZZ.getValue();
    }

    public final FrameLayout LJIIZILJ() {
        return (FrameLayout) this.LJJI.getValue();
    }

    public final void LJIJ() {
        InterfaceC1090750eUT interfaceC1090750eUT = this.LIZIZ;
        boolean z = true;
        boolean z2 = false;
        if (interfaceC1090750eUT != null) {
            if (!((SlotBarrageWidget) interfaceC1090750eUT).LLILZIL) {
                ((SlotBarrageWidget) interfaceC1090750eUT).J1();
                return;
            }
            View view = this.LIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(4, view);
            }
            if (!C500260Jjc.LJJJI((Boolean) this.LIZJ.gg0(PublicScreenHeightInsufficient.class))) {
                float f = C1082470eH7.LIZ;
                DataChannel dataChannel = this.LIZJ;
                if (!C1082470eH7.LIZ(dataChannel) && !C1082470eH7.LIZJ(dataChannel)) {
                    return;
                }
            }
            if (((SlotBarrageWidget) this.LIZIZ).LLILZLL != null) {
                if (!(!r1.LIZJ.isEmpty()) && !(!r1.LIZIZ.isEmpty())) {
                    z = false;
                }
                z2 = z;
            }
            if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(z2))) {
                ((SlotBarrageWidget) this.LIZIZ).J1();
            }
        }
    }

    public final void LJIJJ() {
        C1090830eUb c1090830eUb = this.LJ;
        if (c1090830eUb != null) {
            c1090830eUb.LIZJ();
        }
        this.LJ = null;
        this.LJJIIZ = false;
        ConstraintLayout constraintLayoutLJIIJJI = LJIIJJI();
        if (constraintLayoutLJIIJJI != null) {
            C786410Ut5.LL(8, constraintLayoutLJIIJJI);
        }
        BarrageAnimation$initHandler$1 barrageAnimation$initHandler$1 = this.LJJIIZI;
        if (barrageAnimation$initHandler$1 != null) {
            barrageAnimation$initHandler$1.removeCallbacksAndMessages(null);
        }
        InterfaceC1091030eUv interfaceC1091030eUv = this.LJJIJIIJI;
        if (interfaceC1091030eUv != null) {
            interfaceC1091030eUv.release();
        }
        this.LJJIJIIJI = null;
    }

    public final TranslateAnimation LIZLLL(AnimationAnimationListenerC1151570g4Z animationAnimationListenerC1151570g4Z) {
        long j;
        int i;
        if (this.LJJIIJZLJL) {
            j = 0;
        } else {
            j = 500;
        }
        if (C497740JfY.LJJ()) {
            i = -1;
        } else {
            i = 1;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, (-1.0f) * i, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(j);
        translateAnimation.setInterpolator(new C2268791DrB(0.12f, 0.5f, 0.21f, 1.0f));
        if (animationAnimationListenerC1151570g4Z != null) {
            translateAnimation.setAnimationListener(animationAnimationListenerC1151570g4Z);
        }
        return translateAnimation;
    }

    public final boolean LJ(BarrageMessage barrageMessage) {
        Long lValueOf;
        InterfaceC2262081DgM currentUser;
        User user;
        if (!this.LJFF || barrageMessage.isLocalInsertMsg) {
            return false;
        }
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            return false;
        }
        User user2 = barrageMessage.user;
        Long lValueOf2 = null;
        if (user2 != null) {
            lValueOf = Long.valueOf(user2.getId());
        } else {
            lValueOf = null;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUser = interfaceC500940JkiUser.getCurrentUser();
        } else {
            currentUser = null;
        }
        if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
            lValueOf2 = Long.valueOf(user.getId());
        }
        if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
            return false;
        }
        return true;
    }

    public final void LJJ(float f) {
        C421370Gff c421370GffLJFF = LJFF();
        if (c421370GffLJFF != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421370GffLJFF);
            c421370GffLJFF.setAlpha(f);
        }
        LinearLayout linearLayoutLJIIL = LJIIL();
        if (linearLayoutLJIIL != null) {
            C786410Ut5.W4(linearLayoutLJIIL, f);
        }
        FrameLayout frameLayoutLJIIZILJ = LJIIZILJ();
        if (frameLayoutLJIIZILJ != null) {
            C786410Ut5.U4(frameLayoutLJIIZILJ, f);
        }
    }

    public final void LJJIFFI(boolean z) {
        int i;
        C0KVZ c0kvz = (C0KVZ) this.LJIJ.getValue();
        int i2 = 0;
        if (c0kvz != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLJZ(c0kvz, i);
        }
        C1324720kZq c1324720kZq = (C1324720kZq) this.LJIJI.getValue();
        if (c1324720kZq != null) {
            if (z) {
                i2 = 8;
            }
            C786410Ut5.LLJJIII(c1324720kZq, i2);
        }
    }

    public static void LJIJJLI(C16F5 c16f5, Text text) {
        int i;
        TextFormat textFormat;
        if (text != null && (textFormat = text.defaultFormat) != null) {
            i = textFormat.weight;
        } else {
            i = 0;
        }
        int i2 = 500;
        if (i > 0) {
            int i3 = text.defaultFormat.weight;
            if (i3 != 500) {
                i2 = OppoPermissionPopupMaskDelayExp.DEFAULT;
                if (i3 != 700) {
                    i2 = 400;
                }
            }
            C1119920fFW.LJI(i2, c16f5);
        } else {
            C1119920fFW.LJI(500, c16f5);
        }
        if (c16f5 != null) {
            c16f5.setTextAppearance(R.style.rn);
            c16f5.setText(C154800iY.LIZ(text));
        }
    }

    public final void LIZ(boolean z, boolean z2) {
        LinearLayout linearLayoutLJIIL = LJIIL();
        if (linearLayoutLJIIL != null) {
            int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.la);
            int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.l9);
            if (z2) {
                iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.l_);
            }
            int iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.ll);
            if (C497740JfY.LJJ()) {
                if (z) {
                    iLJIIIZ2 += iLJIIIZ3;
                }
                linearLayoutLJIIL.setPadding(iLJIIIZ2, linearLayoutLJIIL.getPaddingTop(), iLJIIIZ, linearLayoutLJIIL.getPaddingBottom());
            } else {
                int paddingTop = linearLayoutLJIIL.getPaddingTop();
                if (z) {
                    iLJIIIZ2 += iLJIIIZ3;
                }
                linearLayoutLJIIL.setPadding(iLJIIIZ, paddingTop, iLJIIIZ2, linearLayoutLJIIL.getPaddingBottom());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdk.model.message.BarrageMessage r19, long r20) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1090880eUg.LIZJ(com.bytedance.android.livesdk.model.message.BarrageMessage, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0480  */
    /* JADX WARN: Type inference failed for: r0v108, types: [com.bytedance.android.live.slot.barrage.BarrageAnimation$initHandler$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(com.bytedance.android.livesdk.model.message.BarrageMessage r14, long r15) {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1090880eUg.LJIJI(com.bytedance.android.livesdk.model.message.BarrageMessage, long):void");
    }

    public final void LJIL(BarrageMessage barrageMessage, boolean z) {
        User user;
        List<BadgeStruct> badgeList;
        User user2;
        List<BadgeStruct> badgeList2;
        int size;
        if (z) {
            C0KVZ c0kvz = (C0KVZ) this.LJIJ.getValue();
            User userLJIIIIZZ = C1090780eUW.LJIIIIZZ(barrageMessage);
            if (userLJIIIIZZ != null) {
                ArrayList arrayList = null;
                switch (barrageMessage.msgType) {
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                        BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
                        if (barrageTypeUserGradeParam != null && (user = barrageTypeUserGradeParam.user) != null && (badgeList = user.getBadgeList()) != null && badgeList.size() > 0) {
                            arrayList = new ArrayList();
                            for (BadgeStruct badgeStruct : badgeList) {
                                if (badgeStruct.badgeScene == 8) {
                                    arrayList.add(badgeStruct);
                                }
                            }
                        }
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        BarrageTypeFansLevelParam barrageTypeFansLevelParam = barrageMessage.fansLevelParam;
                        if (barrageTypeFansLevelParam != null && (user2 = barrageTypeFansLevelParam.user) != null && (badgeList2 = user2.getBadgeList()) != null && badgeList2.size() > 0) {
                            arrayList = new ArrayList();
                            for (BadgeStruct badgeStruct2 : badgeList2) {
                                if (badgeStruct2.badgeScene == 10) {
                                    arrayList.add(badgeStruct2);
                                }
                            }
                        }
                        break;
                }
                if (arrayList == null) {
                    C20441214yg.LJ("BarrageAnimation", "bindBadgeIconView user level badgeStructList is empty");
                } else if (c0kvz != null) {
                    c0kvz.LJ(false, arrayList, userLJIIIIZZ, 3, null, null, true);
                }
                if (LiveLayoutRenderingScopeOptimizationSetting.INSTANCE.getValue().barrageOpt && c0kvz != null) {
                    List<? extends AbstractC498530Jgp<? extends AbstractC521080Kc6>> list = c0kvz.LLILLL;
                    if (list != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    c0kvz.LLJILJIL = size;
                }
            }
        } else {
            C1324570kZb.LIZIZ(barrageMessage.icon, (C1324720kZq) this.LJIJI.getValue());
        }
        C16F5 c16f5 = (C16F5) this.LJIJJLI.getValue();
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
        C16F5 c16f52 = (C16F5) this.LJIL.getValue();
        if (c16f52 != null) {
            C786410Ut5.LLJJJJ(c16f52, 0);
        }
        if (C497740JfY.LJJ()) {
            TextView textView = (TextView) this.LJIJJLI.getValue();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.START);
            }
        } else {
            TextView textView2 = (TextView) this.LJIJJLI.getValue();
            if (textView2 != null) {
                textView2.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        C16F5 c16f53 = (C16F5) this.LJIJJLI.getValue();
        C16F5 c16f54 = (C16F5) this.LJIL.getValue();
        if (barrageMessage.content != null) {
            Text text = barrageMessage.content;
            Text text2 = new Text();
            TextPiece textPiece = new TextPiece();
            textPiece.type = EnumC1133850fbz.STRING.getPieceType();
            User userLJIIIIZZ2 = C1090780eUW.LJIIIIZZ(barrageMessage);
            if (userLJIIIIZZ2 != null) {
                textPiece.stringValue = C0KVU.LIZ(userLJIIIIZZ2);
                textPiece.format = text.defaultFormat;
            }
            text2.pieces = C1697810uHb.LJIILJJIL(textPiece);
            text2.defaultFormat = text.defaultFormat;
            text2.defaultPattern = "{0:string}";
            LJIJJLI(c16f53, text2);
            LJIJJLI(c16f54, text);
        }
    }

    public final void LJJI(long j, Animation.AnimationListener animationListener) {
        long j2;
        if (this.LJJIIJZLJL) {
            j2 = 0;
        } else {
            j2 = 500;
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(LIZLLL(null));
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setStartOffset(j2 + j);
        alphaAnimation.setInterpolator(new C2268791DrB(0.48f, 0.04f, 0.52f, 0.96f));
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(animationListener);
        View view = this.LIZ;
        if (view != null) {
            view.startAnimation(animationSet);
        }
    }

    public C1090880eUg(View view, InterfaceC1090750eUT interfaceC1090750eUT, DataChannel dataChannel) {
        UserLevelDynamicConfig userLevelDynamicConfig;
        Context contextLJII;
        Resources resources;
        this.LIZ = view;
        this.LIZIZ = interfaceC1090750eUT;
        this.LIZJ = dataChannel;
        this.LJFF = LiveRankingAndPrivilegeDowngradeSetting.isBarrageAnimDisabled(C500260Jjc.LJIIZILJ(dataChannel));
        UserLevelConfig userLevelConfig = UserLevelSettings.INSTANCE.getUserLevelConfig();
        int dimensionPixelSize = 0;
        if (userLevelConfig != null && (userLevelDynamicConfig = userLevelConfig.userLevelDynamicConfig) != null && userLevelDynamicConfig.enableGradeNinePatchScale && (contextLJII = C497740JfY.LJII()) != null && (resources = contextLJII.getResources()) != null) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.l7);
        }
        this.LJJIIJ = dimensionPixelSize;
        UserLevelBarrageSwitchSettings.INSTANCE.getValue();
        this.LJJIJ = LiveBarrageReleasePlayerTimeSetting.INSTANCE.getValue();
    }
}
