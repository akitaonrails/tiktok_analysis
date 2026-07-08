package X;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAExperiment;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.v2.network.CheckUserNameResponse;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetAvatarNicknameFragment;
import com.ss.android.ugc.aweme.anchor.AddAnchorAssem;
import com.ss.android.ugc.aweme.anchor.AddAnchorViewModel;
import com.ss.android.ugc.aweme.im.ui.assem.HistorySearchActionBarAssem;
import com.ss.android.ugc.aweme.inbox.search.assem.InboxSearchKeyWordAssem;
import com.ss.android.ugc.aweme.inbox.search.assem.InboxSearchUserFilterBarAssem;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchUserFilterVM;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchVM;
import com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.ss.android.ugc.aweme.services.AlternativeNetworkService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.nearby.roaming.RegionSearchHeaderAssem;
import com.ss.android.ugc.profile.business.profile.menu.business.content.search.SearchActionComponent;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchAssem;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditUsernameFragment;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorSearchBarAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0j3A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266020j3A implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$13(C1266020j3A c1266020j3A, Editable editable) {
    }

    public static final void afterTextChanged$7(C1266020j3A c1266020j3A, Editable editable) {
    }

    public static final void afterTextChanged$8(C1266020j3A c1266020j3A, Editable editable) {
    }

    public static final void beforeTextChanged$0(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$10(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$11(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$12(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$13(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$14(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$16(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$17(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$18(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$9(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$16(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$18(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$9(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
            case 6:
                afterTextChanged$6(this, editable);
                break;
            case 7:
                afterTextChanged$7(this, editable);
                break;
            case 8:
                afterTextChanged$8(this, editable);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                afterTextChanged$9(this, editable);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                afterTextChanged$10(this, editable);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                afterTextChanged$11(this, editable);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                afterTextChanged$12(this, editable);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                afterTextChanged$13(this, editable);
                break;
            case 14:
                afterTextChanged$14(this, editable);
                break;
            case 15:
                afterTextChanged$15(this, editable);
                break;
            case 16:
                afterTextChanged$16(this, editable);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                afterTextChanged$17(this, editable);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                afterTextChanged$18(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                beforeTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                beforeTextChanged$9(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                beforeTextChanged$10(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                beforeTextChanged$11(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                beforeTextChanged$12(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                beforeTextChanged$13(this, charSequence, i, i2, i3);
                break;
            case 14:
                beforeTextChanged$14(this, charSequence, i, i2, i3);
                break;
            case 15:
                beforeTextChanged$15(this, charSequence, i, i2, i3);
                break;
            case 16:
                beforeTextChanged$16(this, charSequence, i, i2, i3);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                beforeTextChanged$17(this, charSequence, i, i2, i3);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                beforeTextChanged$18(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                onTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onTextChanged$9(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onTextChanged$10(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onTextChanged$11(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onTextChanged$12(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onTextChanged$13(this, charSequence, i, i2, i3);
                break;
            case 14:
                onTextChanged$14(this, charSequence, i, i2, i3);
                break;
            case 15:
                onTextChanged$15(this, charSequence, i, i2, i3);
                break;
            case 16:
                onTextChanged$16(this, charSequence, i, i2, i3);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onTextChanged$17(this, charSequence, i, i2, i3);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onTextChanged$18(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C1266020j3A(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C1266020j3A c1266020j3A, Editable editable) {
        if (editable != null && editable.length() == 0) {
            ((RelationSearchAssem) c1266020j3A.l0).Jo(Boolean.FALSE);
        }
    }

    public static final void afterTextChanged$1(C1266020j3A c1266020j3A, Editable editable) {
        if (((C1237360iIw) c1266020j3A.l0).getApproveExceed() && editable != null) {
            if (editable.length() > ((C1237360iIw) c1266020j3A.l0).getMessageMaxLength() && !Intrinsics.LJFF(((C1237360iIw) c1266020j3A.l0).LL.getBackground(), ((C1237360iIw) c1266020j3A.l0).LLIZLLLIL)) {
                C1237360iIw c1237360iIw = (C1237360iIw) c1266020j3A.l0;
                c1237360iIw.LL.setBackground(c1237360iIw.LLIZLLLIL);
            } else if (editable.length() <= ((C1237360iIw) c1266020j3A.l0).getMessageMaxLength() && !Intrinsics.LJFF(((C1237360iIw) c1266020j3A.l0).LL.getBackground(), ((C1237360iIw) c1266020j3A.l0).getCurrentContainerBackground())) {
                C1237360iIw c1237360iIw2 = (C1237360iIw) c1266020j3A.l0;
                c1237360iIw2.LL.setBackground(c1237360iIw2.getCurrentContainerBackground());
            }
        }
        ((C1237360iIw) c1266020j3A.l0).LIZ();
        Function1<Editable, Unit> textChangedCallback = ((C1237360iIw) c1266020j3A.l0).getTextChangedCallback();
        if (textChangedCallback != null) {
            textChangedCallback.invoke(editable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$10(X.C1266020j3A r3, android.text.Editable r4) {
        /*
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment) r0
            boolean r0 = r0.LLIZ
            if (r0 == 0) goto L36
            int r0 = r4.length()
            if (r0 > 0) goto L46
            java.lang.Object r1 = r3.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment r1 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment) r1
            boolean r0 = r1.LLJI
            if (r0 != 0) goto L46
            r1.LLIZLLLIL()
        L19:
            int r0 = r4.length()
            r1 = 0
            r2 = 0
            if (r0 <= 0) goto L37
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJIII
            if (r0 == 0) goto L2a
            r1 = r0
        L2a:
            X.C786410Ut5.LLLLLLZZ(r1, r2)
        L2d:
            java.lang.Object r1 = r3.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment r1 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment) r1
            java.lang.String r0 = ""
            r1.nS(r2, r0)
        L36:
            return
        L37:
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJIII
            if (r0 == 0) goto L40
            r1 = r0
        L40:
            r0 = 8
            X.C786410Ut5.LLLLLLZZ(r1, r0)
            goto L2d
        L46:
            java.lang.String r1 = r4.toString()
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment) r0
            java.lang.String r0 = r0.LLILZLL
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L5e
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment) r0
            r0.LLFII()
            goto L19
        L5e:
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment) r0
            r0.LLIZLLLIL()
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266020j3A.afterTextChanged$10(X.0j3A, android.text.Editable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$11(X.C1266020j3A r4, android.text.Editable r5) {
        /*
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            boolean r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L6d
            int r0 = r5.length()
            r1 = 0
            if (r0 > 0) goto L7b
            java.lang.Object r2 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r2 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r2
            boolean r0 = r2.LLJIJIL
            if (r0 != 0) goto L7b
            r2.LLIZLLLIL()
        L1a:
            int r0 = r5.length()
            r3 = 0
            r2 = 8
            if (r0 <= 0) goto L6e
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJJ
            if (r0 == 0) goto L2c
            r3 = r0
        L2c:
            X.C786410Ut5.LLLLLLZZ(r3, r1)
        L2f:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            boolean r0 = r0.LLJILJIL
            if (r0 != 0) goto L6d
            int r0 = r5.length()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            kotlin.jvm.functions.Function1<? super android.text.Editable, java.lang.Boolean> r0 = r0.LLJILJILJ
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r0.invoke(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb1
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            android.widget.TextView r0 = r0.mS()
            X.C786410Ut5.LLIL(r0, r1)
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            android.widget.TextView r1 = r0.mS()
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            java.lang.String r0 = r0.LLJ
            r1.setText(r0)
        L6d:
            return
        L6e:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJJ
            if (r0 == 0) goto L77
            r3 = r0
        L77:
            X.C786410Ut5.LLLLLLZZ(r3, r2)
            goto L2f
        L7b:
            java.lang.String r2 = r5.toString()
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            java.lang.String r0 = r0.LLIZ
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L9f
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            kotlin.jvm.functions.Function1<? super android.text.Editable, java.lang.Boolean> r0 = r0.LLJILJILJ
            if (r0 == 0) goto La8
            java.lang.Object r0 = r0.invoke(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto La8
        L9f:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            r0.LLIZLLLIL()
            goto L1a
        La8:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            r0.LLFII()
            goto L1a
        Lb1:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment) r0
            android.widget.TextView r0 = r0.mS()
            X.C786410Ut5.LLIL(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266020j3A.afterTextChanged$11(X.0j3A, android.text.Editable):void");
    }

    public static final void afterTextChanged$12(C1266020j3A c1266020j3A, Editable editable) {
        String string;
        C1232110iAT c1232110iAT;
        TuxIconView tuxIconView;
        int i;
        Editable editableLLJILLL;
        EditText editTextKS = ((ProfileEditUsernameFragment) c1266020j3A.l0).kS();
        if (editTextKS != null && (editableLLJILLL = C2204961BRm.LLJILLL(editTextKS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzP7qB53K1C6YYkSaiVKimx", null))) != null) {
            string = editableLLJILLL.toString();
        } else {
            string = null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(string);
        if (C1EDI.LJ() && (tuxIconView = ((ProfileEditUsernameFragment) c1266020j3A.l0).LLJJIII) != null) {
            if (!zIsEmpty) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
        if (zIsEmpty || ((ProfileEditUsernameFragment) c1266020j3A.l0).LLJJLIIIJLLLLLLLZ) {
            C0XIC c0xic = ((ProfileEditUsernameFragment) c1266020j3A.l0).LLJJJJJIL;
            AbstractC19489511Mv<CheckUserNameResponse> abstractC19489511Mv = c0xic.LIZ;
            if (abstractC19489511Mv != null && !abstractC19489511Mv.isDisposed()) {
                c0xic.LIZ.dispose();
            }
            C1232110iAT c1232110iAT2 = ((ProfileEditUsernameFragment) c1266020j3A.l0).LLJJL.LIZ;
            if (c1232110iAT2 != null && !c1232110iAT2.LIZ.isDisposed()) {
                c1232110iAT2.LIZ.onNext("");
            }
        }
        ProfileEditUsernameFragment profileEditUsernameFragment = (ProfileEditUsernameFragment) c1266020j3A.l0;
        if (profileEditUsernameFragment.LLJJLIIIJLLLLLLLZ) {
            if (string != null) {
                profileEditUsernameFragment.kS().setSelection(string.length());
            }
            ((ProfileEditUsernameFragment) c1266020j3A.l0).oS(3, null, true);
            ((ProfileEditUsernameFragment) c1266020j3A.l0).LLJJLIIIJLLLLLLLZ = false;
            return;
        }
        C424810GlD c424810GlD = profileEditUsernameFragment.LLJJJJ;
        if (c424810GlD != null) {
            c424810GlD.LIZ(null);
        }
        if (C1EDI.LJ()) {
            ((ProfileEditUsernameFragment) c1266020j3A.l0).oS(0, null, false);
        } else {
            ((ProfileEditUsernameFragment) c1266020j3A.l0).oS(1, null, false);
        }
        if (!zIsEmpty && string != null && (c1232110iAT = ((ProfileEditUsernameFragment) c1266020j3A.l0).LLJJL.LIZ) != null && !c1232110iAT.LIZ.isDisposed()) {
            c1232110iAT.LIZ.onNext(string);
        }
    }

    public static final void afterTextChanged$14(C1266020j3A c1266020j3A, Editable editable) {
        String string;
        String string2;
        String string3;
        String string4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("afterTextChanged, keyword = ");
        if (editable != null && (string4 = editable.toString()) != null) {
            string = a0.LJLIIIL(string4).toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        if (editable != null && (string2 = editable.toString()) != null && (string3 = a0.LJLIIIL(string2).toString()) != null) {
            ((SelectorSearchBarAssem) c1266020j3A.l0).Ho().setState(new AwS70S1000000_19(string3, 25));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$15(X.C1266020j3A r4, android.text.Editable r5) {
        /*
            boolean r0 = X.C1EDI.LJ()
            r3 = 8
            r2 = 0
            if (r0 == 0) goto L5e
            int r0 = r5.length()
            if (r0 == 0) goto L56
            java.lang.String r1 = r5.toString()
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            java.lang.String r0 = r0.LLILZLL
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L56
            java.lang.Object r1 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r1 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r1
            java.lang.String r0 = r5.toString()
            boolean r0 = r1.qS(r0)
            if (r0 == 0) goto L56
            java.lang.Object r1 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r1 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r1
            boolean r0 = r1.LLJJI
            if (r0 != 0) goto L56
            r1.LLFII()
        L38:
            int r0 = r5.length()
            if (r0 <= 0) goto L4a
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJLL
            if (r0 == 0) goto L49
            X.C786410Ut5.LLLLLLZZ(r0, r2)
        L49:
            return
        L4a:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJLL
            if (r0 == 0) goto L49
            X.C786410Ut5.LLLLLLZZ(r0, r3)
            return
        L56:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            r0.LLIZLLLIL()
            goto L38
        L5e:
            int r0 = r5.length()
            if (r0 == 0) goto L9b
            java.lang.String r1 = r5.toString()
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            java.lang.String r0 = r0.LLILZLL
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L9b
            java.lang.Object r1 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r1 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r1
            java.lang.String r0 = r5.toString()
            boolean r0 = r1.qS(r0)
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            r0.LLFII()
        L89:
            int r0 = r5.length()
            if (r0 <= 0) goto La3
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJLL
            if (r0 == 0) goto L49
            X.C786410Ut5.LLLLLLZZ(r0, r2)
            return
        L9b:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            r0.LLIZLLLIL()
            goto L89
        La3:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJLL
            if (r0 == 0) goto L49
            X.C786410Ut5.LLLLLLZZ(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266020j3A.afterTextChanged$15(X.0j3A, android.text.Editable):void");
    }

    public static final void afterTextChanged$16(C1266020j3A c1266020j3A, Editable editable) {
        String string;
        AddAnchorViewModel addAnchorViewModelIp = ((AddAnchorAssem) c1266020j3A.l0).ip();
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        addAnchorViewModelIp.setState(AFwS257S0000000_19.get$arr$(588));
        if (string.length() != 0) {
            AnonymousClass0956 anonymousClass0956 = addAnchorViewModelIp.LLILLJJLI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            addAnchorViewModelIp.LLILLJJLI = C23250099c.LIZLLL(addAnchorViewModelIp.getAssemVMScope(), null, null, new C1232380iAu(addAnchorViewModelIp, string, null), 3);
        }
    }

    public static final void afterTextChanged$17(C1266020j3A c1266020j3A, Editable editable) {
        C197039127h c197039127hQS = ((SetAvatarNicknameFragment) c1266020j3A.l0).QS();
        boolean z = false;
        if (editable.length() > 0 || ((SetAvatarNicknameFragment) c1266020j3A.l0).LLLL) {
            z = true;
        }
        c197039127hQS.setEnabled(z);
        SetAvatarNicknameFragment setAvatarNicknameFragment = (SetAvatarNicknameFragment) c1266020j3A.l0;
        if (!setAvatarNicknameFragment.LLLLLJLJLL) {
            setAvatarNicknameFragment.LLLLLJLJLL = true;
            C20684815ws.LJIILLIIL("start_nickname_typing", setAvatarNicknameFragment.PS().LIZ);
        }
    }

    public static final void afterTextChanged$18(C1266020j3A c1266020j3A, Editable editable) {
        ((C1238900iLQ) c1266020j3A.l0).LLILLL.LIZ();
        C1238900iLQ c1238900iLQ = (C1238900iLQ) c1266020j3A.l0;
        if (c1238900iLQ.LLIZLLLIL) {
            C853660XeG c853660XeG = C853660XeG.LIZ;
            String enterMethod = c1238900iLQ.LLILLJJLI.getEnterMethod();
            String enterFrom = ((C1238900iLQ) c1266020j3A.l0).LLILLJJLI.getEnterFrom();
            c853660XeG.getClass();
            C853660XeG.LIZIZ(enterMethod, enterFrom, "signup", "signup_prioritize_panel", true);
            ((C1238900iLQ) c1266020j3A.l0).LLIZLLLIL = false;
            AccountGSMAExperiment.LIZ.getClass();
            if (AccountGSMAExperiment.LIZJ() || AccountGSMAPhase2Experiment.LIZJ()) {
                AlternativeNetworkService.INSTANCE.preconnect(C1238990iLZ.LIZ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void afterTextChanged$2(C1266020j3A c1266020j3A, Editable editable) {
        String string = a0.LJLIIIL(String.valueOf(editable)).toString();
        AssemVMLazy assemVMLazy = ((HistorySearchActionBarAssem) c1266020j3A.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HistorySearchActionBarAssem.LLJ;
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) assemVMLazy.getValue();
        String str = ((C1240980iOm) assemSingleListViewModel.getState()).LLILLJJLI;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateKeyWord() - keyWord = ");
        sbLIZ.append(string);
        sbLIZ.append(" now keyWord = ");
        sbLIZ.append(str);
        C1720106oR.LJI("HistorySearchResultVM", C2188811AlT.LIZIZ(sbLIZ));
        if (string.length() == 0) {
            assemSingleListViewModel.listClear();
            assemSingleListViewModel.setState(AFwS257S0000000_19.get$arr$(539));
        } else {
            if (Intrinsics.LJFF(string, str)) {
                return;
            }
            assemSingleListViewModel.setState(new AwS70S1000000_19(string, 9));
            C1720106oR.LJI("HistorySearchResultVM", "refresh()");
            assemSingleListViewModel.manualListRefresh();
        }
    }

    public static final void afterTextChanged$3(C1266020j3A c1266020j3A, Editable editable) {
        if (editable != null && editable.length() != 0) {
            C337180DJs.LIZJ(((C1241200iP8) c1266020j3A.l0).getClearBtnFromXml());
        } else {
            C337180DJs.LIZ(((C1241200iP8) c1266020j3A.l0).getClearBtnFromXml());
        }
    }

    public static final void afterTextChanged$4(C1266020j3A c1266020j3A, Editable editable) {
        String string = a0.LJLIIIL(String.valueOf(editable)).toString();
        AssemVMLazy assemVMLazy = ((InboxSearchKeyWordAssem) c1266020j3A.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = InboxSearchKeyWordAssem.LLJI;
        InboxSearchVM inboxSearchVM = (InboxSearchVM) assemVMLazy.getValue();
        inboxSearchVM.LL = string;
        inboxSearchVM.setState(new AwS70S1000000_19(string, 16));
    }

    public static final void afterTextChanged$5(C1266020j3A c1266020j3A, Editable editable) {
        AssemVMLazy assemVMLazy = ((InboxSearchUserFilterBarAssem) c1266020j3A.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = InboxSearchUserFilterBarAssem.LLJ;
        InboxSearchUserFilterVM inboxSearchUserFilterVM = (InboxSearchUserFilterVM) assemVMLazy.getValue();
        inboxSearchUserFilterVM.LL = a0.LJLIIIL(String.valueOf(editable)).toString();
        inboxSearchUserFilterVM.refresh();
    }

    public static final void afterTextChanged$6(C1266020j3A c1266020j3A, Editable editable) {
        if (editable != null && editable.length() != 0) {
            C337180DJs.LIZJ(((C1242080iQY) c1266020j3A.l0).getClearBtnFromXml());
        } else {
            C337180DJs.LIZ(((C1242080iQY) c1266020j3A.l0).getClearBtnFromXml());
        }
    }

    public static final void afterTextChanged$9(C1266020j3A c1266020j3A, Editable editable) {
        String string;
        if (editable == null || (string = editable.toString()) == null || string.length() == 0) {
            string = null;
        }
        ((RegionSearchHeaderAssem) c1266020j3A.l0).Go().setState(new AwS69S1000000_18(string, 0));
    }

    public static final void beforeTextChanged$15(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        int i4;
        if (C1EDI.LJ()) {
            i4 = 50;
        } else {
            i4 = 30;
        }
        if (charSequence.length() <= i4) {
            ((ProfileEditNicknameFragment) c1266020j3A.l0).LLIZLLLIL = charSequence.toString();
            ProfileEditNicknameFragment profileEditNicknameFragment = (ProfileEditNicknameFragment) c1266020j3A.l0;
            EditText editText = profileEditNicknameFragment.LLJLILLLLZIIL;
            Editable editableLLJILLL = null;
            if (editText != null) {
                editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzU9KZg3K1C6YYkSZjhzCp7", null));
            }
            profileEditNicknameFragment.LLJ = Selection.getSelectionEnd(editableLLJILLL);
        }
    }

    public static final void onTextChanged$10(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        ProfileEditBioUrlFragment profileEditBioUrlFragment = (ProfileEditBioUrlFragment) c1266020j3A.l0;
        if (profileEditBioUrlFragment.LLJ == 0) {
            return;
        }
        boolean zUR = profileEditBioUrlFragment.UR(profileEditBioUrlFragment.kS(), ((ProfileEditBioUrlFragment) c1266020j3A.l0).LLJ);
        ProfileEditBioUrlFragment profileEditBioUrlFragment2 = (ProfileEditBioUrlFragment) c1266020j3A.l0;
        ProfileEditInputFragment.SR(profileEditBioUrlFragment2, zUR, profileEditBioUrlFragment2.kS().length(), ((ProfileEditBioUrlFragment) c1266020j3A.l0).LLJ, false, false, 24, null);
    }

    public static final void onTextChanged$11(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        ProfileEditContentFragment profileEditContentFragment = (ProfileEditContentFragment) c1266020j3A.l0;
        if (profileEditContentFragment.LLJI == 0) {
            return;
        }
        boolean zUR = profileEditContentFragment.UR(profileEditContentFragment.kS(), ((ProfileEditContentFragment) c1266020j3A.l0).LLJI);
        if (zUR) {
            ((ProfileEditContentFragment) c1266020j3A.l0).LLJILLL.onNext("");
        }
        ProfileEditContentFragment profileEditContentFragment2 = (ProfileEditContentFragment) c1266020j3A.l0;
        ProfileEditInputFragment.SR(profileEditContentFragment2, zUR, profileEditContentFragment2.kS().length(), ((ProfileEditContentFragment) c1266020j3A.l0).LLJI, false, false, 24, null);
    }

    public static final void onTextChanged$12(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        SpannableString spannableString;
        ProfileEditUsernameFragment profileEditUsernameFragment;
        EditText editTextKS;
        int i4;
        Integer numLIZJ;
        String string;
        Integer numLIZJ2;
        TextView textView = ((ProfileEditUsernameFragment) c1266020j3A.l0).LLJJIJI;
        if (textView != null) {
            textView.setText("www.tiktok.com/");
        }
        ForegroundColorSpan foregroundColorSpan = null;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(((ProfileEditUsernameFragment) c1266020j3A.l0).kS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzP7qB53K1C6YYkSaiVKimx", null));
        boolean z = false;
        if (editableLLJILLL != null && (string = editableLLJILLL.toString()) != null) {
            ProfileEditUsernameFragment profileEditUsernameFragment2 = (ProfileEditUsernameFragment) c1266020j3A.l0;
            profileEditUsernameFragment2.getClass();
            if (Intrinsics.LJFF(string, "")) {
                string = "username";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            sbLIZ.append(string);
            spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            Context context = profileEditUsernameFragment2.getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ2.intValue()), 0, string.length() + 1, 33);
            }
        } else {
            spannableString = null;
        }
        if (C1EDI.LJ() && (editTextKS = (profileEditUsernameFragment = (ProfileEditUsernameFragment) c1266020j3A.l0).kS()) != null) {
            if (C2204961BRm.LLJILLL(editTextKS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzP7qB53K1C6YYkSaiVKimx", null)).length() > 24) {
                z = true;
            }
            int length = editTextKS.length();
            if (z) {
                i4 = R.attr.zs;
            } else {
                i4 = R.attr.a1k;
            }
            Context context2 = profileEditUsernameFragment.getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(i4, context2)) != null) {
                foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
            }
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZJ(C787200UuM.LIZ(length), foregroundColorSpan, 33);
            c1360520lVa.LJI("/");
            c1360520lVa.LIZ.append((CharSequence) C787200UuM.LIZ(24));
            C1360500lVY c1360500lVY = c1360520lVa.LIZ;
            TextView textView2 = profileEditUsernameFragment.LLILLL;
            if (textView2 != null) {
                textView2.setText(c1360500lVY);
            }
        }
        TextView textView3 = ((ProfileEditUsernameFragment) c1266020j3A.l0).LLJJIJI;
        if (textView3 != null) {
            textView3.append(spannableString);
        }
    }

    public static final void onTextChanged$13(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
        String string;
        String string2;
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTextChanged: ");
        sbLIZ.append((Object) charSequence);
        C1720106oR.LJI("SearchActionComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (charSequence == null || (string2 = charSequence.toString()) == null || (string = a0.LJLIIIL(string2).toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            ((SearchActionComponent) c1266020j3A.l0).Wp(new C1249660icm(EnumC1249630icj.EMPTY));
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1249600icg((SearchActionComponent) c1266020j3A.l0, string, null), 3);
        }
    }

    public static final void onTextChanged$14(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
        View view = (View) ((SelectorSearchBarAssem) c1266020j3A.l0).LLJJIII.getValue();
        int i4 = 0;
        if (charSequence == null || charSequence.length() == 0) {
            i4 = 8;
        }
        C786410Ut5.LJLLLLLL(i4, view);
    }

    public static final void onTextChanged$15(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        ((ProfileEditNicknameFragment) c1266020j3A.l0).BS();
    }

    public static final void onTextChanged$17(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
        ((SetAvatarNicknameFragment) c1266020j3A.l0).ZS();
    }

    public static final void onTextChanged$7(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() > 0) {
            ((EditOriginMusicTitleActivity) c1266020j3A.l0).LL.LJJ(new AwS33S0010000_19(true, 30), "save");
            ImageView imageView = ((EditOriginMusicTitleActivity) c1266020j3A.l0).LLILLL;
            if (imageView != null) {
                C786410Ut5.LJZI(0, imageView);
                return;
            }
            return;
        }
        ((EditOriginMusicTitleActivity) c1266020j3A.l0).LL.LJJ(new AwS33S0010000_19(false, 30), "save");
        ImageView imageView2 = ((EditOriginMusicTitleActivity) c1266020j3A.l0).LLILLL;
        if (imageView2 == null) {
            return;
        }
        C786410Ut5.LJZI(4, imageView2);
    }

    public static final void onTextChanged$8(C1266020j3A c1266020j3A, CharSequence charSequence, int i, int i2, int i3) {
        String string = charSequence.toString();
        MufListPageViewModel mufListPageViewModelRS = ((MufListPageFragment) c1266020j3A.l0).rS();
        if (string.length() == 0) {
            mufListPageViewModelRS.setState(AFwS257S0000000_19.get$arr$(284));
        } else {
            C23250099c.LIZLLL(mufListPageViewModelRS.getAssemVMScope(), C0PEM.LIZJ, null, new C1337305Lf(mufListPageViewModelRS, string, null), 2);
        }
    }
}
