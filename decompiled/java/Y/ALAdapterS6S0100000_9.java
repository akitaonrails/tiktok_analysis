package Y;

import X.C0C0T;
import X.C0DTR;
import X.C1196320hEk;
import X.C12ES;
import X.C1558520qew;
import X.C1CRB;
import X.C621730Oa3;
import X.C621750Oa5;
import X.C624550Oeb;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageInteractionAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorInputBaseAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEditEventGamePlayAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinFullScreenTopBarAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiCell;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAnimationAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemEditPageConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes10.dex */
public class ALAdapterS6S0100000_9 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationEnd$0(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator, boolean z) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (4 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
            case 2:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                onAnimationEnd$1(this, animator);
                break;
            case 4:
                onAnimationEnd$2(this, animator);
                break;
            case 5:
                onAnimationEnd$3(this, animator);
                break;
            case 6:
                onAnimationEnd$4(this, animator);
                break;
            case 7:
                onAnimationEnd$5(this, animator);
                break;
            case 8:
                onAnimationEnd$6(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$7(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$10(this, animator);
                break;
            case 14:
                onAnimationEnd$11(this, animator);
                break;
            case 15:
                onAnimationEnd$12(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (13 - this.$t != 0) {
            super.onAnimationEnd(animator, z);
        } else {
            onAnimationEnd$0(this, animator, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            default:
                super.onAnimationStart(animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$3(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$4(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$5(this, animator);
                break;
            case 14:
                onAnimationStart$6(this, animator);
                break;
            case 15:
                onAnimationStart$7(this, animator);
                break;
        }
    }

    public ALAdapterS6S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        ((BulletinPageInteractionAssem) aLAdapterS6S0100000_9.l0).LLJJIJIL = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        ViewGroup viewGroup;
        BulletinEmojiAnimationAbility bulletinEmojiAnimationAbility;
        String str;
        BulletinEmojiCell bulletinEmojiCell = (BulletinEmojiCell) aLAdapterS6S0100000_9.l0;
        TuxTextView tuxTextView = bulletinEmojiCell.LLJ;
        if (tuxTextView == null || (viewGroup = bulletinEmojiCell.LLJILJIL) == null) {
            return;
        }
        BulletinEmojiCell bulletinEmojiCell2 = (BulletinEmojiCell) aLAdapterS6S0100000_9.l0;
        bulletinEmojiCell2.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(bulletinEmojiCell2);
        if (interfaceC665370Q7zLIZ != null && (bulletinEmojiAnimationAbility = (BulletinEmojiAnimationAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinEmojiAnimationAbility.class, null)) != null) {
            BulletinEmojiItem item = ((BulletinEmojiCell) aLAdapterS6S0100000_9.l0).getItem();
            if (item == null || (str = item.emoji) == null) {
                str = "";
            }
            bulletinEmojiAnimationAbility.DE2(str, tuxTextView, viewGroup, null);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        BulletinCreatorInputBaseAssem bulletinCreatorInputBaseAssem = (BulletinCreatorInputBaseAssem) aLAdapterS6S0100000_9.l0;
        if (bulletinCreatorInputBaseAssem.LLJLLIL == animator) {
            bulletinCreatorInputBaseAssem.LLJLLIL = null;
        }
    }

    public static final void onAnimationEnd$10(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        C0DTR.LIZIZ(((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Lo());
        ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Jo().setClickable(true);
    }

    public static final void onAnimationEnd$11(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        C0DTR.LIZIZ(((BulletinFullScreenTopBarAssem) aLAdapterS6S0100000_9.l0).hp());
        ((BulletinFullScreenTopBarAssem) aLAdapterS6S0100000_9.l0).LLJJJJJIL = true;
    }

    public static final void onAnimationEnd$12(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        C0DTR.LIZIZ(((BulletinFullScreenTopBarAssem) aLAdapterS6S0100000_9.l0).ip());
        ((BulletinFullScreenTopBarAssem) aLAdapterS6S0100000_9.l0).LLJJJJJIL = true;
    }

    public static final void onAnimationEnd$2(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        ((BulletinPageInteractionAssem) aLAdapterS6S0100000_9.l0).LLJJIJIL = null;
    }

    public static final void onAnimationEnd$3(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        C0DTR.LIZIZ((C1CRB) aLAdapterS6S0100000_9.l0);
    }

    public static final void onAnimationEnd$4(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        C0DTR.LIZIZ(((BulletinPageInteractionAssem) aLAdapterS6S0100000_9.l0).So());
    }

    public static final void onAnimationEnd$5(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        C0DTR.LIZIZ(((BulletinPageInteractionAssem) aLAdapterS6S0100000_9.l0).Go());
    }

    public static final void onAnimationEnd$6(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        FrameLayout frameLayoutNo;
        if (C0C0T.LIZ() && (frameLayoutNo = ((BulletinPageInteractionAssem) aLAdapterS6S0100000_9.l0).No()) != null) {
            int childCount = frameLayoutNo.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = frameLayoutNo.getChildAt(i);
                if (childAt != null) {
                    childAt.setImportantForAccessibility(0);
                }
            }
        }
        FrameLayout frameLayoutNo2 = ((BulletinPageInteractionAssem) aLAdapterS6S0100000_9.l0).No();
        if (frameLayoutNo2 != null) {
            C786410Ut5.LJJJJIZL(frameLayoutNo2);
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        FrameLayout frameLayoutNo;
        if (C0C0T.LIZ() && (frameLayoutNo = ((BulletinPageInteractionAssem) aLAdapterS6S0100000_9.l0).No()) != null) {
            int childCount = frameLayoutNo.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = frameLayoutNo.getChildAt(i);
                if (childAt != null) {
                    childAt.setImportantForAccessibility(0);
                }
            }
        }
        FrameLayout frameLayoutNo2 = ((BulletinPageInteractionAssem) aLAdapterS6S0100000_9.l0).No();
        if (frameLayoutNo2 != null) {
            C786410Ut5.LJJJJIZL(frameLayoutNo2);
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        ((BulletinPageInteractionAssem) aLAdapterS6S0100000_9.l0).Oo().getState().LJFF(null);
    }

    public static final void onAnimationEnd$9(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        C0DTR.LIZIZ(((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Jo());
        ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Lo().setClickable(true);
    }

    public static final void onAnimationStart$0(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        BulletinEmojiItem item = ((BulletinEmojiCell) aLAdapterS6S0100000_9.l0).getItem();
        if (item != null) {
            item.LLILLL = false;
        }
    }

    public static final void onAnimationStart$1(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        C12ES.LJIILL(0, (C1CRB) aLAdapterS6S0100000_9.l0);
    }

    public static final void onAnimationStart$2(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        C12ES.LJIILL(0, (C1CRB) aLAdapterS6S0100000_9.l0);
    }

    public static final void onAnimationStart$3(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        TuxImageModel tuxImageModel;
        ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Jo().setClickable(false);
        ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Lo().setClickable(false);
        C12ES.LJIILL(0, ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Lo());
        C12ES.LJIILL(0, ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Jo());
        TuxIconView tuxIconViewJo = ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Jo();
        BulletinItemEditPageConfig bulletinItemEditPageConfig = ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).LLJJIII;
        TuxImageModel tuxImageModel2 = null;
        if (bulletinItemEditPageConfig != null) {
            tuxImageModel = bulletinItemEditPageConfig.activeIconUrl;
        } else {
            tuxImageModel = null;
        }
        C624550Oeb.LJ(tuxIconViewJo, tuxImageModel);
        TuxIconView tuxIconViewLo = ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Lo();
        BulletinItemEditPageConfig bulletinItemEditPageConfig2 = ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).LLJJIII;
        if (bulletinItemEditPageConfig2 != null) {
            tuxImageModel2 = bulletinItemEditPageConfig2.inactiveIconUrl;
        }
        C624550Oeb.LJ(tuxIconViewLo, tuxImageModel2);
    }

    public static final void onAnimationStart$4(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        TuxImageModel tuxImageModel;
        ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Jo().setClickable(false);
        ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Lo().setClickable(false);
        C12ES.LJIILL(0, ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Lo());
        C12ES.LJIILL(0, ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Jo());
        TuxIconView tuxIconViewJo = ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Jo();
        BulletinItemEditPageConfig bulletinItemEditPageConfig = ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).LLJJIII;
        TuxImageModel tuxImageModel2 = null;
        if (bulletinItemEditPageConfig != null) {
            tuxImageModel = bulletinItemEditPageConfig.activeIconUrl;
        } else {
            tuxImageModel = null;
        }
        C624550Oeb.LJ(tuxIconViewJo, tuxImageModel);
        TuxIconView tuxIconViewLo = ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).Lo();
        BulletinItemEditPageConfig bulletinItemEditPageConfig2 = ((BulletinEditEventGamePlayAssem) aLAdapterS6S0100000_9.l0).LLJJIII;
        if (bulletinItemEditPageConfig2 != null) {
            tuxImageModel2 = bulletinItemEditPageConfig2.inactiveIconUrl;
        }
        C624550Oeb.LJ(tuxIconViewLo, tuxImageModel2);
    }

    public static final void onAnimationStart$5(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        super.onAnimationStart(animator);
        C786410Ut5.LJLLLLLL(0, ((C621730Oa3) aLAdapterS6S0100000_9.l0).LIZIZ);
        ((C621730Oa3) aLAdapterS6S0100000_9.l0).LIZLLL.sendEmptyMessageDelayed(2, C621750Oa5.LIZ().duration);
    }

    public static final void onAnimationStart$6(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        BulletinFullScreenTopBarAssem bulletinFullScreenTopBarAssem = (BulletinFullScreenTopBarAssem) aLAdapterS6S0100000_9.l0;
        bulletinFullScreenTopBarAssem.LLJJJJJIL = false;
        C12ES.LJIILL(0, bulletinFullScreenTopBarAssem.ip());
        C12ES.LJIILL(0, ((BulletinFullScreenTopBarAssem) aLAdapterS6S0100000_9.l0).hp());
    }

    public static final void onAnimationStart$7(ALAdapterS6S0100000_9 aLAdapterS6S0100000_9, Animator animator) {
        BulletinFullScreenTopBarAssem bulletinFullScreenTopBarAssem = (BulletinFullScreenTopBarAssem) aLAdapterS6S0100000_9.l0;
        bulletinFullScreenTopBarAssem.LLJJJJJIL = false;
        C12ES.LJIILL(0, bulletinFullScreenTopBarAssem.ip());
        C12ES.LJIILL(0, ((BulletinFullScreenTopBarAssem) aLAdapterS6S0100000_9.l0).hp());
    }
}
