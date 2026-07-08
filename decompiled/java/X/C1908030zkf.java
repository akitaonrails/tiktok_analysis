package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908030zkf {
    public static final C1908030zkf LIZ = new C1908030zkf();

    public static final boolean LIZLLL(UserVerify userVerify) {
        if (TextUtils.isEmpty(userVerify.getCustomVerify()) && TextUtils.isEmpty(userVerify.getEnterpriseVerifyReason())) {
            return false;
        }
        return true;
    }

    public static final int LIZIZ(Context context, Float f) {
        if (context == null || f == null) {
            return R.drawable.bwj;
        }
        int iLJIILJJIL = C12ES.LJIILJJIL(f.floatValue(), context);
        if (iLJIILJJIL != 17) {
            if (iLJIILJJIL != 20) {
                switch (iLJIILJJIL) {
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 14:
                    case 15:
                        return R.drawable.bwj;
                }
            }
            return R.drawable.bwl;
        }
        return R.drawable.bwk;
    }

    public static final boolean LJ(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return false;
        }
        return true;
    }

    public static final Drawable LIZ(Context context, Float f, Integer num) {
        if (context != null && f != null) {
            if (num != null && num.intValue() == 12) {
                return C14MI.LIZ(context, R.drawable.bwk);
            }
            if (num != null && num.intValue() == 14) {
                return C14MI.LIZ(context, R.drawable.bwl);
            }
            int iLJIILJJIL = C12ES.LJIILJJIL(f.floatValue(), context);
            if (iLJIILJJIL != 17) {
                if (iLJIILJJIL != 20) {
                    switch (iLJIILJJIL) {
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        case 14:
                        case 15:
                            return C14MI.LIZ(context, R.drawable.bwj);
                        default:
                            return C14MI.LIZ(context, R.drawable.bwl);
                    }
                }
                return C14MI.LIZ(context, R.drawable.bwl);
            }
            return C14MI.LIZ(context, R.drawable.bwk);
        }
        return null;
    }

    public static final int LIZJ(Context context, Float f, Integer num) {
        float fLIZJ;
        int iLJIILJJIL;
        if (num != null) {
            if (num.intValue() >= 12) {
                fLIZJ = C12ES.LIZJ(4.0f, context);
            } else {
                fLIZJ = C12ES.LIZJ(3.0f, context);
            }
        } else if (context != null && f != null && (iLJIILJJIL = C12ES.LJIILJJIL(f.floatValue(), context)) != 17 && iLJIILJJIL != 20) {
            switch (iLJIILJJIL) {
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                case 14:
                case 15:
                    fLIZJ = C12ES.LIZJ(3.0f, context);
                    break;
                default:
                    fLIZJ = C12ES.LIZJ(4.0f, context);
                    break;
            }
        } else {
            fLIZJ = C12ES.LIZJ(4.0f, context);
        }
        return (int) fLIZJ;
    }

    public static void LJIIIIZZ(Context context, TextView textView, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(textView.getText());
        if (z) {
            try {
                spannableStringBuilder.delete((spannableStringBuilder.length() - 2) - 3, spannableStringBuilder.length() - 3);
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        spannableStringBuilder.append((CharSequence) " T");
        C786410Ut5.q2(spannableStringBuilder, new C416750GVt(context, LIZIZ(context, Float.valueOf(textView.getTextSize()))), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
        textView.setText(spannableStringBuilder);
    }

    public static final boolean LJIIJ(Context context, UserVerify userVerify, TextView textView) {
        if (context == null || textView == null || !LIZLLL(userVerify)) {
            return false;
        }
        LIZ.getClass();
        LJIIIIZZ(context, textView, false);
        return true;
    }

    public static void LJFF(Context context, TextView textView, boolean z, Integer num) {
        if (z) {
            C1110304Vx.LIZ().d();
            Drawable drawableLIZ = LIZ(context, Float.valueOf(textView.getTextSize()), num);
            if (drawableLIZ != null) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableLIZ, (Drawable) null);
                textView.setCompoundDrawablePadding(LIZJ(context, Float.valueOf(textView.getTextSize()), num));
                return;
            }
            return;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static final void LJI(Context context, String str, String str2, TextView textView) {
        if (context != null && textView != null) {
            boolean zLJ = LJ(str, str2);
            LIZ.getClass();
            LJFF(context, textView, zLJ, null);
        }
    }

    public static final void LJIIIZ(Context context, String str, String str2, TextView textView, boolean z) {
        if (context != null && textView != null && LJ(str, str2)) {
            LIZ.getClass();
            LJIIIIZZ(context, textView, z);
        }
    }
}
