package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0ID9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0ID9 extends ViewOutlineProvider {
    public final int $t;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.$t) {
            case 0:
                getOutline$0(this, view, outline);
                break;
            case 1:
                getOutline$1(this, view, outline);
                break;
            case 2:
                getOutline$2(this, view, outline);
                break;
            case 3:
                getOutline$3(this, view, outline);
                break;
            case 4:
                getOutline$4(this, view, outline);
                break;
            case 5:
                getOutline$5(this, view, outline);
                break;
            case 6:
                getOutline$6(this, view, outline);
                break;
            case 7:
                getOutline$7(this, view, outline);
                break;
            case 8:
                getOutline$8(this, view, outline);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                getOutline$9(this, view, outline);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                getOutline$10(this, view, outline);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                getOutline$11(this, view, outline);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                getOutline$12(this, view, outline);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                getOutline$13(this, view, outline);
                break;
            case 14:
                getOutline$14(this, view, outline);
                break;
            case 15:
                getOutline$15(this, view, outline);
                break;
            case 16:
                getOutline$16(this, view, outline);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                getOutline$17(this, view, outline);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                getOutline$18(this, view, outline);
                break;
            case 19:
                getOutline$19(this, view, outline);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                getOutline$20(this, view, outline);
                break;
            case 21:
                getOutline$21(this, view, outline);
                break;
            case 22:
                getOutline$22(this, view, outline);
                break;
            case 23:
                getOutline$23(this, view, outline);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                getOutline$24(this, view, outline);
                break;
            case 25:
                getOutline$25(this, view, outline);
                break;
            case 26:
                getOutline$26(this, view, outline);
                break;
            case 27:
                getOutline$27(this, view, outline);
                break;
            case 28:
                getOutline$28(this, view, outline);
                break;
            case 29:
                getOutline$29(this, view, outline);
                break;
            case 30:
                getOutline$30(this, view, outline);
                break;
            case 31:
                getOutline$31(this, view, outline);
                break;
            case 32:
                getOutline$32(this, view, outline);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                getOutline$33(this, view, outline);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                getOutline$34(this, view, outline);
                break;
            case 35:
                getOutline$35(this, view, outline);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                getOutline$36(this, view, outline);
                break;
            case 37:
                getOutline$37(this, view, outline);
                break;
            case 38:
                getOutline$38(this, view, outline);
                break;
            case 39:
                getOutline$39(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C0ID9(int i) {
        this.$t = i;
    }

    public static final void getOutline$0(C0ID9 c0id9, View view, Outline outline) {
        int width;
        int height;
        if (outline != null) {
            if (view != null) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            outline.setRoundRect(0, 0, width, height, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
    }

    public static final void getOutline$1(C0ID9 c0id9, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C11VU.LIZ(5.0f));
        }
    }

    public static final void getOutline$10(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
    }

    public static final void getOutline$11(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
    }

    public static final void getOutline$12(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
    }

    public static final void getOutline$13(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), view.getHeight() / 2.0f);
    }

    public static final void getOutline$14(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), view.getWidth() * 0.23f);
    }

    public static final void getOutline$15(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C11VU.LIZ(20.0f));
    }

    public static final void getOutline$16(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C11VU.LIZ(20.0f));
    }

    public static final void getOutline$17(C0ID9 c0id9, View view, Outline outline) {
        if (view == null) {
            return;
        }
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        if (outline != null) {
            outline.setRoundRect(rect, Math.min(view.getWidth(), view.getHeight()) / 2.0f);
        }
    }

    public static final void getOutline$18(C0ID9 c0id9, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(8));
        }
    }

    public static final void getOutline$19(C0ID9 c0id9, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
    }

    public static final void getOutline$2(C0ID9 c0id9, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
    }

    public static final void getOutline$20(C0ID9 c0id9, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
    }

    public static final void getOutline$21(C0ID9 c0id9, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
    }

    public static final void getOutline$22(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(4));
    }

    public static final void getOutline$23(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(8));
    }

    public static final void getOutline$24(C0ID9 c0id9, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
    }

    public static final void getOutline$25(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(10));
    }

    public static final void getOutline$26(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C497740JfY.LIZIZ(12));
    }

    public static final void getOutline$27(C0ID9 c0id9, View view, Outline outline) {
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }

    public static final void getOutline$28(C0ID9 c0id9, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int) C511520K4g.LIZ(12.0f));
        }
    }

    public static final void getOutline$29(C0ID9 c0id9, View view, Outline outline) {
        int width;
        int height;
        if (outline != null) {
            if (view != null) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            outline.setRoundRect(0, 0, width, height, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
    }

    public static final void getOutline$3(C0ID9 c0id9, View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        C1546210qL5.LIZ.getClass();
        outline.setRoundRect(0, 0, width, height, C814420VxA.LIZIZ(C1546210qL5.LIZ(3)));
    }

    public static final void getOutline$30(C0ID9 c0id9, View view, Outline outline) {
        int width;
        int height;
        if (outline != null) {
            if (view != null) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            outline.setRoundRect(0, 0, width, height, C418440Gaw.LIZIZ(8));
        }
    }

    public static final void getOutline$31(C0ID9 c0id9, View view, Outline outline) {
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }

    public static final void getOutline$32(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(16));
    }

    public static final void getOutline$33(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(8));
    }

    public static final void getOutline$34(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(8));
    }

    public static final void getOutline$35(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(8));
    }

    public static final void getOutline$36(C0ID9 c0id9, View view, Outline outline) {
        outline.setOval(0, (view.getHeight() - view.getWidth()) / 2, view.getWidth(), ((view.getHeight() - view.getWidth()) / 2) + view.getWidth());
    }

    public static final void getOutline$37(C0ID9 c0id9, View view, Outline outline) {
        outline.setOval(0, (view.getHeight() - view.getWidth()) / 2, view.getWidth(), ((view.getHeight() - view.getWidth()) / 2) + view.getWidth());
    }

    public static final void getOutline$38(C0ID9 c0id9, View view, Outline outline) {
        int width;
        int height;
        if (outline != null) {
            if (view != null) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            outline.setRoundRect(0, 0, width, height, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
    }

    public static final void getOutline$39(C0ID9 c0id9, View view, Outline outline) {
        int width;
        int height;
        if (outline != null) {
            if (view != null) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            outline.setRoundRect(0, 0, width, height, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
    }

    public static final void getOutline$4(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(8));
    }

    public static final void getOutline$5(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(8));
    }

    public static final void getOutline$6(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(14));
    }

    public static final void getOutline$7(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), C418440Gaw.LIZIZ(8));
    }

    public static final void getOutline$8(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(8));
    }

    public static final void getOutline$9(C0ID9 c0id9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(6));
    }
}
