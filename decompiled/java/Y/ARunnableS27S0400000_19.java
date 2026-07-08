package Y;

import X.C0N6C;
import X.C0P0T;
import X.C0XQ7;
import X.C1216520hlK;
import X.C1216580hlQ;
import X.C1235340iFg;
import X.C1248930ibb;
import X.C1260470iuD;
import X.C1388190mED;
import X.C1391600mJi;
import X.C18NR;
import X.C19EG;
import X.C1C7U;
import X.C450720Hlu;
import X.C786410Ut5;
import X.EnumC1235690iGF;
import X.EnumC1237820iJg;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS27S0400000_19 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((TuxTextView) this.l0).getLineCount() > 1) {
            ((TuxTextView) this.l1).setText("");
            C786410Ut5.LLLLZLL((TuxTextView) this.l1, 8);
            ((C1260470iuD) this.l2).LLILZLL = 8;
        } else {
            ((TuxTextView) this.l1).setText(((BannerDisplayInfo) this.l3).description);
            C786410Ut5.LLLLZLL((TuxTextView) this.l1, 0);
            ((C1260470iuD) this.l2).LLILZLL = 0;
        }
    }

    public final void LIZ$1() {
        C0P0T c0p0t;
        C0P0T c0p0t2 = ((C1216520hlK) this.l0).LIZJ;
        if (c0p0t2 == null || !c0p0t2.isShowing()) {
            C1216520hlK c1216520hlK = (C1216520hlK) this.l0;
            C450720Hlu c450720Hlu = new C450720Hlu((Context) this.l1);
            c450720Hlu.LJIIJ(2131836717);
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LJII = 3000L;
            c1391600mJi.LIZIZ = (View) this.l2;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c450720Hlu.LJ(new AwS420S0200000_19((C1216520hlK) this.l0, (C1216520hlK) this.l3, (Function0<Unit>) 101));
            c1216520hlK.LIZJ = c450720Hlu.LIZIZ();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) this.l1);
            if (c19egLIZIZ == null || c19egLIZIZ.isFinishing() || (c0p0t = ((C1216520hlK) this.l0).LIZJ) == null) {
                return;
            }
            c0p0t.show();
        }
    }

    public final void LIZ$2() {
        C0P0T c0p0t;
        C0P0T c0p0t2 = ((C1216580hlQ) this.l0).LIZJ;
        if (c0p0t2 == null || !c0p0t2.isShowing()) {
            C1216580hlQ c1216580hlQ = (C1216580hlQ) this.l0;
            C450720Hlu c450720Hlu = new C450720Hlu((Context) this.l1);
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.START;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZLLL = enumC1235690iGF;
            c1391600mJi.LIZIZ = (View) this.l2;
            c450720Hlu.LJIIJ(2131845046);
            c450720Hlu.LJ(new AwS563S0100000_19((Function0) this.l3, (Function0<Unit>) 2840));
            c1216580hlQ.LIZJ = c450720Hlu.LIZIZ();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) this.l1);
            if (c19egLIZIZ == null || c19egLIZIZ.isFinishing() || (c0p0t = ((C1216580hlQ) this.l0).LIZJ) == null) {
                return;
            }
            c0p0t.show();
        }
    }

    public static final void run$0(ARunnableS27S0400000_19 aRunnableS27S0400000_19) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aRunnableS27S0400000_19.l0;
        Bundle bundle = (Bundle) aRunnableS27S0400000_19.l1;
        ArrayList arrayList = (ArrayList) aRunnableS27S0400000_19.l2;
        VerificationMethodType verificationMethodType = (VerificationMethodType) aRunnableS27S0400000_19.l3;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.changeMobileWithType$1L");
        i18nSettingManageMyAccountActivity.LLILZ = true;
        i18nSettingManageMyAccountActivity.LLILZIL = 2;
        i18nSettingManageMyAccountActivity.LJIIL();
        bundle.putInt("phone_number_source", EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_ACCOUNT_MANAGEMENT_PHONE_NUMBER.getValue());
        C786410Ut5.LJJIZ(bundle, "eligible_verification_methods", arrayList);
        String value = C0N6C.MANAGE_MY_ACCOUNT.getValue();
        int i = C1235340iFg.LIZ[verificationMethodType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C0XQ7.LIZ().modifyMobileVerifyByPassword(i18nSettingManageMyAccountActivity, value, bundle, true, null);
                }
            } else {
                C0XQ7.LIZ().modifyMobileVerifyByEmail(i18nSettingManageMyAccountActivity, value, bundle, true, null);
            }
        } else {
            C0XQ7.LIZ().modifyMobile(i18nSettingManageMyAccountActivity, value, bundle, true, null);
        }
        C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.changeMobileWithType$1L");
    }

    public static final void run$1(ARunnableS27S0400000_19 aRunnableS27S0400000_19) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoTopicBannerViewHolder@d7ad.bindText$1");
        try {
            aRunnableS27S0400000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoTopicBannerViewHolder@d7ad.bindText$1");
    }

    public static final void run$2(ARunnableS27S0400000_19 aRunnableS27S0400000_19) {
        boolean zLIZ;
        C1C7U.LIZ("FeedAvatarDefaultAssem@5993.onFollowStatusChange$$inlined$postDelayed$3");
        try {
            ValueAnimator valueAnimator = (ValueAnimator) aRunnableS27S0400000_19.l0;
            valueAnimator.addListener(new AAListenerS140S0300000_19((FeedAvatarDefaultAssem) aRunnableS27S0400000_19.l1, (Aweme) aRunnableS27S0400000_19.l2, (FollowStatus) aRunnableS27S0400000_19.l3, 1));
            valueAnimator.start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedAvatarDefaultAssem@5993.onFollowStatusChange$$inlined$postDelayed$3");
    }

    public static final void run$3(ARunnableS27S0400000_19 aRunnableS27S0400000_19) {
        boolean zLIZ;
        C1C7U.LIZ("FeedAvatarDefaultAssem@5993.optimisticFollowOnMissingAuthor$$inlined$postDelayed$2");
        try {
            ValueAnimator valueAnimator = (ValueAnimator) aRunnableS27S0400000_19.l0;
            if (valueAnimator != null) {
                valueAnimator.addListener(new AAListenerS140S0300000_19((FeedAvatarDefaultAssem) aRunnableS27S0400000_19.l1, (Aweme) aRunnableS27S0400000_19.l2, (FollowStatus) aRunnableS27S0400000_19.l3, 0));
                valueAnimator.start();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedAvatarDefaultAssem@5993.optimisticFollowOnMissingAuthor$$inlined$postDelayed$2");
    }

    public static final void run$4(ARunnableS27S0400000_19 aRunnableS27S0400000_19) {
        boolean zLIZ;
        C1C7U.LIZ("GoLiveTooltip@ef06.show$1$1");
        try {
            aRunnableS27S0400000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GoLiveTooltip@ef06.show$1$1");
    }

    public static final void run$5(ARunnableS27S0400000_19 aRunnableS27S0400000_19) {
        boolean zLIZ;
        User user;
        User user2;
        C1C7U.LIZ("MusProfileEditFragment@fdf.onChanged$1");
        try {
            if (!((Activity) aRunnableS27S0400000_19.l0).isFinishing() && (user = (User) aRunnableS27S0400000_19.l1) != null && (user2 = (User) aRunnableS27S0400000_19.l2) != null) {
                ((MusProfileEditFragment) aRunnableS27S0400000_19.l3).LLIZLLLIL = user2;
                String str = MusProfileEditFragment._pnsPageId;
                UrlModel avatarMedium = user.getAvatarMedium();
                UrlModel avatarMedium2 = ((User) aRunnableS27S0400000_19.l2).getAvatarMedium();
                if (avatarMedium != null ? avatarMedium2 == null || avatarMedium != avatarMedium2 : avatarMedium2 != null) {
                    ((MusProfileEditFragment) aRunnableS27S0400000_19.l3).RT((User) aRunnableS27S0400000_19.l2, true);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusProfileEditFragment@fdf.onChanged$1");
    }

    public static final void run$6(ARunnableS27S0400000_19 aRunnableS27S0400000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileRootBaseComponent@b05a.constructComponentTree$2$1$runnable$1");
        try {
            Assembler assembler = (Assembler) aRunnableS27S0400000_19.l0;
            ProfileRootBaseComponent profileRootBaseComponent = (ProfileRootBaseComponent) aRunnableS27S0400000_19.l1;
            assembler.EQ2(profileRootBaseComponent, new AwS228S0300000_19(profileRootBaseComponent, (C1248930ibb) aRunnableS27S0400000_19.l3, (ProfileComponents) aRunnableS27S0400000_19.l2, 18));
            ((Assembler) aRunnableS27S0400000_19.l0).QQ2((ProfileRootBaseComponent) aRunnableS27S0400000_19.l1, new AwS598S0100000_19((C1248930ibb) aRunnableS27S0400000_19.l3, 449));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileRootBaseComponent@b05a.constructComponentTree$2$1$runnable$1");
    }

    public static final void run$7(ARunnableS27S0400000_19 aRunnableS27S0400000_19) {
        boolean zLIZ;
        C1C7U.LIZ("LongPressCommentTooltip@56cf.show$1$1");
        try {
            aRunnableS27S0400000_19.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LongPressCommentTooltip@56cf.show$1$1");
    }

    public static final void run$8(ARunnableS27S0400000_19 aRunnableS27S0400000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ECommerceAnchorAnimationViewV3@f530.doWhenTitleLayoutReady$$inlined$doOnPreDraw$1");
        try {
            if (((TuxTextView) aRunnableS27S0400000_19.l1).isAttachedToWindow()) {
                ((Function1) aRunnableS27S0400000_19.l2).invoke(((C18NR) aRunnableS27S0400000_19.l3).getTitleShowStateInfo$ecommerce_video_release());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECommerceAnchorAnimationViewV3@f530.doWhenTitleLayoutReady$$inlined$doOnPreDraw$1");
    }

    public ARunnableS27S0400000_19(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
