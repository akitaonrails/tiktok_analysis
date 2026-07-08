package X;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C569770MWh {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair<Integer, Integer> LIZIZ(int i) {
        int i2 = R.anim.ce;
        int i3 = R.anim.ft;
        switch (i) {
            case 1:
                i2 = 0;
                i3 = 0;
                break;
            case 2:
                i3 = R.anim.fu;
                i2 = R.anim.g3;
                break;
            case 3:
            case BdTuring.TYPE_ECAF /* 9 */:
            case 28:
                i2 = R.anim.a8;
                i3 = 0;
                break;
            case 4:
                i3 = R.anim.fv;
                i2 = R.anim.g0;
                break;
            case 5:
                i2 = R.anim.g0;
                i3 = 0;
                break;
            case 6:
            case 22:
            case 23:
            case 25:
            case 30:
            default:
                i2 = R.anim.g2;
                break;
            case 7:
                i3 = R.anim.cd;
                i2 = R.anim.a8;
                break;
            case 8:
                i3 = R.anim.fs;
                i2 = R.anim.a8;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                i3 = R.anim.cd;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                i2 = R.anim.fb;
                i3 = R.anim.gr;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                i2 = R.anim.f9;
                i3 = R.anim.gr;
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                i2 = R.anim.f8;
                i3 = R.anim.gr;
                break;
            case 14:
                i2 = R.anim.f_;
                i3 = R.anim.gr;
                break;
            case 15:
                i2 = R.anim.f5;
                i3 = R.anim.gr;
                break;
            case 16:
                i2 = R.anim.f4;
                i3 = R.anim.gr;
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                i2 = R.anim.f6;
                i3 = R.anim.gr;
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                i3 = R.anim.gr;
                break;
            case 19:
                i2 = R.anim.f7;
                i3 = R.anim.gr;
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                i2 = R.anim.fe;
                i3 = R.anim.cd;
                break;
            case 21:
                i2 = R.anim.ih;
                i3 = R.anim.ie;
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                i2 = R.anim.ir;
                i3 = R.anim.a6;
                break;
            case 26:
                i2 = R.anim.iv;
                i3 = R.anim.a6;
                break;
            case 27:
                i3 = R.anim.iz;
                i2 = R.anim.a6;
                break;
            case 29:
                i3 = R.anim.l1;
                i2 = R.anim.gr;
                break;
            case 31:
                i3 = R.anim.l2;
                i2 = R.anim.gr;
                break;
            case 32:
                i3 = R.anim.l3;
                i2 = R.anim.gr;
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                i3 = R.anim.l4;
                i2 = R.anim.gr;
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                i3 = R.anim.f485me;
                i2 = R.anim.gr;
                break;
        }
        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public static Pair<Integer, Integer> LIZJ(int i) {
        int i2 = R.anim.g0;
        int i3 = R.anim.fv;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 22) {
                                if (i != 23) {
                                    if (i != 25) {
                                        if (i == 300) {
                                            i3 = R.anim.j6;
                                        } else {
                                            switch (i) {
                                                case 6:
                                                    i2 = 0;
                                                    break;
                                                case 7:
                                                    i2 = R.anim.ce;
                                                    break;
                                                case 8:
                                                    i2 = R.anim.fz;
                                                    break;
                                                case BdTuring.TYPE_ECAF /* 9 */:
                                                    i3 = R.anim.a7;
                                                    i2 = R.anim.gr;
                                                    break;
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                    i3 = R.anim.cd;
                                                    i2 = R.anim.ce;
                                                    break;
                                                case BdTuring.TYPE_EMAIL /* 11 */:
                                                    i3 = R.anim.fa;
                                                    i2 = R.anim.gr;
                                                    break;
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                    i3 = R.anim.f2;
                                                    i2 = R.anim.gr;
                                                    break;
                                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                    i3 = R.anim.f1;
                                                    i2 = R.anim.gr;
                                                    break;
                                                case 14:
                                                    i3 = R.anim.f3;
                                                    i2 = R.anim.gr;
                                                    break;
                                                case 15:
                                                    i3 = R.anim.ey;
                                                    i2 = R.anim.gr;
                                                    break;
                                                case 16:
                                                    i3 = R.anim.ex;
                                                    i2 = R.anim.gr;
                                                    break;
                                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                    i3 = R.anim.ez;
                                                    i2 = R.anim.gr;
                                                    break;
                                                case 19:
                                                    i3 = R.anim.f0;
                                                    i2 = R.anim.gr;
                                                    break;
                                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                    i3 = R.anim.fd;
                                                    i2 = R.anim.ce;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 27:
                                                            i3 = R.anim.iz;
                                                            break;
                                                        case 28:
                                                            i3 = R.anim.j5;
                                                            break;
                                                        case 29:
                                                            i3 = R.anim.l1;
                                                            i2 = R.anim.gr;
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 31:
                                                                    i3 = R.anim.l2;
                                                                    break;
                                                                case 32:
                                                                    i3 = R.anim.l3;
                                                                    break;
                                                                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                                    i3 = R.anim.l4;
                                                                    break;
                                                            }
                                                            i2 = R.anim.gr;
                                                            break;
                                                    }
                                                    break;
                                            }
                                        }
                                        i2 = 0;
                                    } else {
                                        i3 = R.anim.iu;
                                    }
                                } else {
                                    i3 = R.anim.is;
                                }
                                i2 = R.anim.a6;
                            } else {
                                i3 = R.anim.ig;
                                i2 = R.anim.if_res_0x7f02018b;
                            }
                        } else {
                            i2 = R.anim.g2;
                        }
                        i3 = R.anim.ft;
                    } else {
                        i2 = 0;
                    }
                    i3 = R.anim.a7;
                } else {
                    i3 = R.anim.fw;
                    i2 = R.anim.g1;
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
        }
        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public static void LJ(Activity activity) {
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            activity.setTranslucent(true);
        } else {
            C1286830jaj.LIZ(activity);
        }
    }

    public static void LIZ(int i, Activity activity) {
        if (activity == null) {
            return;
        }
        Pair<Integer, Integer> pairLIZIZ = LIZIZ(i);
        C786410Ut5.ae(pairLIZIZ.getFirst().intValue(), activity, pairLIZIZ.getSecond().intValue());
    }

    public static void LIZLLL(int i, Activity activity) {
        if (activity == null) {
            return;
        }
        if (((Boolean) C277350Atx.LIZ.getValue()).booleanValue()) {
            C786410Ut5.ae(0, activity, 0);
        } else {
            Pair<Integer, Integer> pairLIZJ = LIZJ(i);
            C786410Ut5.ae(pairLIZJ.getFirst().intValue(), activity, pairLIZJ.getSecond().intValue());
        }
    }
}
