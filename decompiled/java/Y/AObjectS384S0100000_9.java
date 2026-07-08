package Y;

import X.C0CFN;
import X.C0NAP;
import X.C0OJU;
import X.C0QSJ;
import X.C13FE;
import X.C1ER1;
import X.C587580N2u;
import X.C594920NVa;
import X.C687700QyG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC587190N1h;
import X.InterfaceC617160OIo;
import X.InterfaceC617290OJb;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinPageFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinSettingsChildFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageListAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageLoadStatusAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.assem.BulletinCommentSheetAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel;
import com.ss.android.ugc.aweme.music.assem.MusicStatusAssem;
import com.ss.android.ugc.aweme.music.assem.list.MusicListAssem;
import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import com.ss.android.ugc.aweme.music.ghost.GhostMusicAssem;
import com.ss.android.ugc.aweme.music.search.SearchMusicListAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AObjectS384S0100000_9 implements Function0 {
    public final int $t;
    public Object l0;

    public static final Object invoke$0(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return BulletinBaseCell.I5((BulletinBaseCell) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$1(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return BulletinBaseCell.L5((BulletinBaseCell) aObjectS384S0100000_9.l0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            default:
                return null;
        }
    }

    public static final Object invoke$10(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        Aweme aweme = (Aweme) aObjectS384S0100000_9.l0;
        if (((Boolean) C587580N2u.LIZJ.getValue()).booleanValue()) {
            C0CFN.LIZ.LIZIZ(new ARunnableS109S0100000_9(aweme, 68));
            return null;
        }
        C1ER1.LIZIZ.LLLLLIL(aweme.getGroupId(), aweme.getAid());
        return null;
    }

    public static final Object invoke$11(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return MusicListAssem.mp((MusicListAssem) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$12(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return MusicListAssem.lp((MusicListAssem) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$13(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return MusicListAssem.kp((MusicListAssem) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$14(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return MusicListComposableAssem.Ip((MusicListComposableAssem) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$15(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return MusicListComposableAssem.Jp((MusicListComposableAssem) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$16(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return MusicListComposableAssem.Gp((MusicListComposableAssem) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$17(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return MusicStatusAssem.Ap((MusicStatusAssem) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$18(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return MusicStatusAssem.zp((MusicStatusAssem) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$19(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return GhostMusicAssem.op((GhostMusicAssem) aObjectS384S0100000_9.l0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(Y.AObjectS384S0100000_9 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiDetailContentCell r4 = (com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiDetailContentCell) r4
            X.0QSJ r1 = r4.LLJI
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJ
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJ = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJI = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel r0 = new com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0Obm> r0 = X.InterfaceC622800Obm.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0Obm r1 = (X.InterfaceC622800Obm) r1
            java.lang.Class<X.0Obm> r0 = X.InterfaceC622800Obm.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS384S0100000_9.invoke$2(Y.AObjectS384S0100000_9):java.lang.Object");
    }

    public static final Object invoke$20(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return SearchMusicListAssem.cp((SearchMusicListAssem) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$21(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return SearchMusicListAssem.bp((SearchMusicListAssem) aObjectS384S0100000_9.l0);
    }

    public static final Object invoke$22(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return Boolean.valueOf(((Boolean) ((C594920NVa) aObjectS384S0100000_9.l0).LIZJ()).booleanValue());
    }

    public static final Object invoke$23(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return Float.valueOf(((C594920NVa) aObjectS384S0100000_9.l0).LIZLLL());
    }

    public static final Object invoke$24(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return ((C13FE) ((C594920NVa) aObjectS384S0100000_9.l0).LJII).getValue();
    }

    public static final Object invoke$25(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return Float.valueOf(((C594920NVa) aObjectS384S0100000_9.l0).LIZLLL());
    }

    public static final Object invoke$26(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return ((C13FE) ((C594920NVa) aObjectS384S0100000_9.l0).LJII).getValue();
    }

    public static final Object invoke$27(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return Float.valueOf(((C594920NVa) aObjectS384S0100000_9.l0).LIZLLL());
    }

    public static final Object invoke$28(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return ((C13FE) ((C594920NVa) aObjectS384S0100000_9.l0).LJII).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$29(Y.AObjectS384S0100000_9 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem r4 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem) r4
            X.0QSJ r1 = r4.LLJJJJ
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJJIL
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJJJIL = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJJJJ = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel r0 = new com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0OJU> r0 = X.C0OJU.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0OJU r1 = (X.C0OJU) r1
            java.lang.Class<X.0OJU> r0 = X.C0OJU.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS384S0100000_9.invoke$29(Y.AObjectS384S0100000_9):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(Y.AObjectS384S0100000_9 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinPollVoteDetailContentCell r4 = (com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinPollVoteDetailContentCell) r4
            X.0QSJ r1 = r4.LLILZ
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLILLL
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLILLL = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLILZ = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel r0 = new com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0OZB> r0 = X.C0OZB.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0OZB r1 = (X.C0OZB) r1
            java.lang.Class<X.0OZB> r0 = X.C0OZB.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS384S0100000_9.invoke$3(Y.AObjectS384S0100000_9):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$30(Y.AObjectS384S0100000_9 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinQuickPublishAssem r4 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinQuickPublishAssem) r4
            X.0QSJ r1 = r4.LLJIJIL
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJI
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJI = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJIJIL = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel r0 = new com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0OJU> r0 = X.C0OJU.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0OJU r1 = (X.C0OJU) r1
            java.lang.Class<X.0OJU> r0 = X.C0OJU.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS384S0100000_9.invoke$30(Y.AObjectS384S0100000_9):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$31(Y.AObjectS384S0100000_9 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.inbox.bulletin.comment.BulletinCommentSheetFragment r4 = (com.ss.android.ugc.aweme.inbox.bulletin.comment.BulletinCommentSheetFragment) r4
            X.0QSJ r1 = r4.LLJJIJI
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIII
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJJIII = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJJIJI = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel r0 = new com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0OTL> r0 = X.C0OTL.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0OTL r1 = (X.C0OTL) r1
            java.lang.Class<X.0OTL> r0 = X.C0OTL.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS384S0100000_9.invoke$31(Y.AObjectS384S0100000_9):java.lang.Object");
    }

    public static final Object invoke$32(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        BulletinCommentSheetAssem bulletinCommentSheetAssem = (BulletinCommentSheetAssem) aObjectS384S0100000_9.l0;
        int i = BulletinCommentSheetAssem.LLJILJIL;
        return new BulletinCommentActionViewModel((BulletinCommentListViewModel) bulletinCommentSheetAssem.LLJ.getValue());
    }

    public static final Object invoke$33(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        final C0NAP c0nap = (C0NAP) aObjectS384S0100000_9.l0;
        return new InterfaceC587190N1h() { // from class: X.0N1i
            @Override // X.InterfaceC587190N1h
            public final void LIZ(boolean z) {
                if (!z) {
                    Iterator<Pair<Integer, Runnable>> it2 = c0nap.LJIIIZ.iterator();
                    while (it2.hasNext()) {
                        Runnable runnable = (Runnable) it2.next().second;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    c0nap.LJIIIZ.clear();
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$34(Y.AObjectS384S0100000_9 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentSheetCell r4 = (com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentSheetCell) r4
            X.0QSJ r1 = r4.LLJILLL
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJILJILJ
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJILJILJ = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJILLL = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel r0 = new com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0OTL> r0 = X.C0OTL.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0OTL r1 = (X.C0OTL) r1
            java.lang.Class<X.0OTL> r0 = X.C0OTL.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS384S0100000_9.invoke$34(Y.AObjectS384S0100000_9):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$35(Y.AObjectS384S0100000_9 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.inbox.bulletin.BulletinEmojiDetailListFragment r4 = (com.ss.android.ugc.aweme.inbox.bulletin.BulletinEmojiDetailListFragment) r4
            X.0QSJ r1 = r4.LLJI
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJ
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJ = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJI = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel r0 = new com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0Obm> r0 = X.InterfaceC622800Obm.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0Obm r1 = (X.InterfaceC622800Obm) r1
            java.lang.Class<X.0Obm> r0 = X.InterfaceC622800Obm.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS384S0100000_9.invoke$35(Y.AObjectS384S0100000_9):java.lang.Object");
    }

    public static final Object invoke$36(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        InterfaceC617290OJb interfaceC617290OJb;
        BulletinPageFragment bulletinPageFragment = (BulletinPageFragment) aObjectS384S0100000_9.l0;
        String str = BulletinPageFragment._pnsPageId;
        BulletinProfileViewModel bulletinProfileViewModelVR = bulletinPageFragment.VR();
        C0QSJ c0qsjSR = bulletinPageFragment.SR();
        if (c0qsjSR != null) {
            interfaceC617290OJb = (InterfaceC617290OJb) c0qsjSR.getAbility(InterfaceC617290OJb.class);
            C687700QyG.LJ(interfaceC617290OJb, InterfaceC617290OJb.class);
        } else {
            interfaceC617290OJb = null;
        }
        return new BulletinListViewModel(bulletinProfileViewModelVR, interfaceC617290OJb);
    }

    public static final Object invoke$37(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        C0OJU c0oju;
        BulletinPageFragment bulletinPageFragment = (BulletinPageFragment) aObjectS384S0100000_9.l0;
        String str = BulletinPageFragment._pnsPageId;
        C0QSJ c0qsjSR = bulletinPageFragment.SR();
        if (c0qsjSR != null) {
            c0oju = (C0OJU) c0qsjSR.getAbility(C0OJU.class);
            C687700QyG.LJ(c0oju, C0OJU.class);
        } else {
            c0oju = null;
        }
        return new BulletinPublishViewModel(c0oju);
    }

    public static final Object invoke$38(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        BulletinSettingsChildFragment bulletinSettingsChildFragment = (BulletinSettingsChildFragment) aObjectS384S0100000_9.l0;
        String str = BulletinSettingsChildFragment._pnsPageId;
        return new BulletinSettingsChildViewModel((BulletinProfileViewModel) bulletinSettingsChildFragment.LLJJIJIL.getValue());
    }

    public static final Object invoke$4(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        BulletinPageLoadStatusAssem bulletinPageLoadStatusAssem = (BulletinPageLoadStatusAssem) aObjectS384S0100000_9.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinPageLoadStatusAssem.LLJJIJIIJIL;
        return new BulletinPublishViewModel(bulletinPageLoadStatusAssem.Oo());
    }

    public static final Object invoke$5(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        InterfaceC617160OIo interfaceC617160OIo;
        BulletinPageLoadStatusAssem bulletinPageLoadStatusAssem = (BulletinPageLoadStatusAssem) aObjectS384S0100000_9.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinPageLoadStatusAssem.LLJJIJIIJIL;
        C0QSJ c0qsjGo = bulletinPageLoadStatusAssem.Go();
        InterfaceC617290OJb interfaceC617290OJb = null;
        if (c0qsjGo != null) {
            interfaceC617160OIo = (InterfaceC617160OIo) c0qsjGo.getAbility(InterfaceC617160OIo.class);
            C687700QyG.LJ(interfaceC617160OIo, InterfaceC617160OIo.class);
        } else {
            interfaceC617160OIo = null;
        }
        C0QSJ c0qsjGo2 = bulletinPageLoadStatusAssem.Go();
        if (c0qsjGo2 != null) {
            interfaceC617290OJb = (InterfaceC617290OJb) c0qsjGo2.getAbility(InterfaceC617290OJb.class);
            C687700QyG.LJ(interfaceC617290OJb, InterfaceC617290OJb.class);
        }
        return new BulletinListViewModel(interfaceC617160OIo, interfaceC617290OJb);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[PHI: r1
      0x002d: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v4 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(Y.AObjectS384S0100000_9 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinUnreadIndicatorAssem r4 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinUnreadIndicatorAssem) r4
            X.0QSJ r1 = r4.LLJJJJLIIL
            if (r1 != 0) goto L2d
            X.0Q7z r3 = r4.LLJJJJJIL
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJJJJJIL = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJJJJLIIL = r1
            if (r1 != 0) goto L2d
            r2 = 0
        L23:
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListScrollToViewModel r1 = r4.No()
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel r0 = new com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel
            r0.<init>(r2, r1)
            return r0
        L2d:
            java.lang.Class<X.0OIo> r0 = X.InterfaceC617160OIo.class
            java.lang.Object r2 = r1.getAbility(r0)
            X.0OIo r2 = (X.InterfaceC617160OIo) r2
            java.lang.Class<X.0OIo> r0 = X.InterfaceC617160OIo.class
            X.C687700QyG.LJ(r2, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS384S0100000_9.invoke$6(Y.AObjectS384S0100000_9):java.lang.Object");
    }

    public static final Object invoke$7(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        InterfaceC617160OIo interfaceC617160OIo;
        BulletinPageListAssem bulletinPageListAssem = (BulletinPageListAssem) aObjectS384S0100000_9.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinPageListAssem.LLJJLIIIJLLLLLLLZ;
        C0QSJ c0qsjLo = bulletinPageListAssem.Lo();
        InterfaceC617290OJb interfaceC617290OJb = null;
        if (c0qsjLo != null) {
            interfaceC617160OIo = (InterfaceC617160OIo) c0qsjLo.getAbility(InterfaceC617160OIo.class);
            C687700QyG.LJ(interfaceC617160OIo, InterfaceC617160OIo.class);
        } else {
            interfaceC617160OIo = null;
        }
        C0QSJ c0qsjLo2 = bulletinPageListAssem.Lo();
        if (c0qsjLo2 != null) {
            interfaceC617290OJb = (InterfaceC617290OJb) c0qsjLo2.getAbility(InterfaceC617290OJb.class);
            C687700QyG.LJ(interfaceC617290OJb, InterfaceC617290OJb.class);
        }
        return new BulletinListViewModel(interfaceC617160OIo, interfaceC617290OJb);
    }

    public static final Object invoke$8(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return Long.valueOf(((PlayerController) aObjectS384S0100000_9.l0).getCurrentPosition());
    }

    public static final Object invoke$9(AObjectS384S0100000_9 aObjectS384S0100000_9) {
        return Long.valueOf(((PlayerController) aObjectS384S0100000_9.l0).getCurrentPosition());
    }

    public AObjectS384S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
