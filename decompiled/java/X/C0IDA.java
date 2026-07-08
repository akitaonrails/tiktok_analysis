package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IDA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDA extends ViewOutlineProvider {
    public final int $t;
    public float f0;

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
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C0IDA(int i) {
        this.$t = i;
        this.f0 = 8.0f;
    }

    public C0IDA(float f, int i) {
        this.$t = i;
        this.f0 = f;
    }

    public static final void getOutline$0(C0IDA c0ida, View view, Outline outline) {
        float fFloatValue;
        Float f;
        Object tag = view.getTag(R.id.xce);
        if ((tag instanceof Float) && (f = (Float) tag) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = c0ida.f0;
        }
        if (fFloatValue == 0.0f && c0ida.f0 > 0.0f) {
            int width = view.getWidth();
            int height = view.getHeight();
            float f2 = c0ida.f0;
            outline.setRoundRect(0, 0, width, height + ((int) f2), f2);
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$1(C0IDA c0ida, View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width > 0 && height > 0) {
            float fMax = Math.max(view.getScaleX(), view.getScaleY());
            if (fMax <= 0.0f) {
                fMax = 1.0f;
            }
            outline.setRoundRect(0, 0, width, height, Math.min(c0ida.f0 / fMax, Math.min(width, height) / 2.0f));
        }
    }

    public static final void getOutline$10(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$11(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$12(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$13(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$14(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$15(C0IDA c0ida, View view, Outline outline) {
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
            outline.setRoundRect(0, 0, width, height, c0ida.f0);
        }
    }

    public static final void getOutline$16(C0IDA c0ida, View view, Outline outline) {
        int width = view.getWidth();
        float height = view.getHeight();
        float f = c0ida.f0;
        outline.setRoundRect(0, 0, width, (int) (height + f), f);
    }

    public static final void getOutline$17(C0IDA c0ida, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(Float.valueOf(c0ida.f0)));
        }
    }

    public static final void getOutline$18(C0IDA c0ida, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0ida.f0))), C418440Gaw.LIZIZ(Float.valueOf(c0ida.f0)));
        }
    }

    public static final void getOutline$2(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$3(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$4(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, -((int) c0ida.f0), view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$5(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, 0, ((int) c0ida.f0) + view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$6(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
    }

    public static final void getOutline$7(C0IDA c0ida, View view, Outline outline) {
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
        }
    }

    public static final void getOutline$8(C0IDA c0ida, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c0ida.f0);
        }
    }

    public static final void getOutline$9(C0IDA c0ida, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C12ES.LIZJ(c0ida.f0, view.getContext()));
    }
}
