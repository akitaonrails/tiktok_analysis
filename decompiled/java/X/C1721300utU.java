package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.ColorDO;
import com.bytedance.pipo.stellar.base.model.CornerDO;
import com.bytedance.pipo.stellar.base.model.Image;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.pipo.stellar.base.model.TuxTagDO;
import com.bytedance.pipo.stellar.base.model.prop.AccessoryDO;
import com.bytedance.pipo.stellar.base.model.prop.DialogActionDO;
import com.bytedance.pipo.stellar.base.model.prop.DialogContentDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.stellar.base.model.prop.ToastContentDO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import wh6.AbS191S0400000_26;
import wh6.AbS333S0300000_26;

/* JADX INFO: renamed from: X.0utU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721300utU {
    public static final C1721300utU LIZ = new C1721300utU();

    public static boolean LJFF(Context context) {
        C1361400lX0 c1361400lX0;
        CharSequence charSequenceLJIIIIZZ;
        if (context instanceof C1361400lX0) {
            c1361400lX0 = (C1361400lX0) context;
        } else {
            c1361400lX0 = null;
        }
        if (c1361400lX0 == null) {
            if (!C960203pA.LIZIZ(context) && ((charSequenceLJIIIIZZ = C1308910kAL.LJIIIIZZ(context)) == null || !charSequenceLJIIIIZZ.equals("TikTok Theme Dark"))) {
                return false;
            }
            return true;
        }
        if (c1361400lX0.LL != C1385040m98.LIZJ(true)) {
            return false;
        }
        return true;
    }

    public static Integer LJI(String str) {
        if (Intrinsics.LJFF(str, "-2")) {
            return -2;
        }
        if (Intrinsics.LJFF(str, "-1")) {
            return -1;
        }
        float f = CastFloatProtector.parseFloat(str);
        if (f < 0.0f) {
            return -2;
        }
        if (f >= 1.0f) {
            return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((int) f))));
        }
        return null;
    }

    public static int LJIILL(String str) {
        C2248371CzL.LIZ.getClass();
        if (!u.LJIJI(str, "START", true) && !u.LJIJI(str, "LEFT", true)) {
            if (u.LJIJI(str, "CENTER", true)) {
                return 17;
            }
            if (!u.LJIJI(str, "END", true) && !u.LJIJI(str, "RIGHT", true)) {
                if (u.LJIJI(str, "CENTER_HORIZONTAL", true)) {
                    return 1;
                }
                return 8388611;
            }
            return 8388613;
        }
        return 8388611;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LJJI(String str) {
        C2248371CzL.LIZ.getClass();
        if (str != null) {
            switch (str.hashCode()) {
                case -2047462195:
                    if (str.equals("IconArrowToDown")) {
                        return R.raw.icon_arrow_to_down;
                    }
                    break;
                case -1994512946:
                    if (str.equals("IconChevronLeftOffsetLTR")) {
                        return R.raw.icon_chevron_left_offset_ltr;
                    }
                    break;
                case -1920337906:
                    if (str.equals("IconTickFillSmall")) {
                        return R.raw.icon_tick_fill_small;
                    }
                    break;
                case -1706902598:
                    if (str.equals("IconAddShoppingCartLTR")) {
                        return R.raw.icon_add_shopping_cart_ltr;
                    }
                    break;
                case -1661507041:
                    if (str.equals("IconShieldTick")) {
                        return R.raw.icon_shield_tick;
                    }
                    break;
                case -1328414088:
                    if (str.equals("IconBankCardArrowTopLeft")) {
                        return R.raw.icon_bank_card_arrow_top_left;
                    }
                    break;
                case -1277947689:
                    if (str.equals("shopping_bag_tick_fill")) {
                        return R.raw.icon_shopping_bag_tick_fill;
                    }
                    break;
                case -1078007770:
                    if (str.equals("IconCirclePlusFill")) {
                        return R.raw.icon_circle_plus_fill;
                    }
                    break;
                case -1042077094:
                    if (str.equals("IconChevronRightSlimThinLTR")) {
                        return R.raw.icon_chevron_right_slim_thin_ltr;
                    }
                    break;
                case -1024820404:
                    if (str.equals("IconExclamationMarkTriangleFill")) {
                        return R.raw.icon_exclamation_mark_triangle_fill;
                    }
                    break;
                case -998765627:
                    if (str.equals("thumbs_up_fill")) {
                        return R.raw.icon_thumbs_up_fill;
                    }
                    break;
                case -991564072:
                    if (str.equals("IconEye")) {
                        return R.raw.icon_eye;
                    }
                    break;
                case -910472305:
                    if (str.equals("calendar_star_fill")) {
                        return R.raw.icon_calendar_star_fill;
                    }
                    break;
                case -892678580:
                    if (str.equals("IconShoppingLiveGiveaway")) {
                        return R.raw.icon_shopping_live_giveaway;
                    }
                    break;
                case -740622764:
                    if (str.equals("IconExclamationMarkCircleFill")) {
                        return R.raw.icon_exclamation_mark_circle_fill;
                    }
                    break;
                case -673674808:
                    if (str.equals("IconGear")) {
                        return R.raw.icon_gear;
                    }
                    break;
                case -673516188:
                    if (str.equals("IconLock")) {
                        return R.raw.icon_lock;
                    }
                    break;
                case -488210054:
                    if (str.equals("IconShieldPersonFill")) {
                        return R.raw.icon_shield_person_fill;
                    }
                    break;
                case -227049966:
                    if (str.equals("IconDollarSign")) {
                        return R.raw.icon_dollar_sign;
                    }
                    break;
                case -203546214:
                    if (str.equals("IconTimerMoving")) {
                        return R.raw.icon_timer_moving;
                    }
                    break;
                case -178324674:
                    if (str.equals("calendar")) {
                        return R.raw.icon_calendar;
                    }
                    break;
                case -171736413:
                    if (str.equals("IconTickOnDoc")) {
                        return R.raw.icon_tick_on_doc;
                    }
                    break;
                case -116950777:
                    if (str.equals("IconShoppingBagTickFill")) {
                        return R.raw.icon_shopping_bag_tick_fill;
                    }
                    break;
                case 3540562:
                    if (str.equals("star")) {
                        return R.raw.icon_star;
                    }
                    break;
                case 70502633:
                    if (str.equals("IconTickCircleFill")) {
                        return R.raw.icon_tick_circle_fill;
                    }
                    break;
                case 339918654:
                    if (str.equals("IconTiktokLogo")) {
                        return R.raw.icon_tiktok_logo;
                    }
                    break;
                case 419023237:
                    if (str.equals("IconEyeSlash")) {
                        return R.raw.icon_eye_slash;
                    }
                    break;
                case 453144627:
                    if (str.equals("IconChevronRightSlimLTR")) {
                        return R.raw.icon_chevron_right_slim_ltr;
                    }
                    break;
                case 596768679:
                    if (str.equals("IconMoney")) {
                        return R.raw.icon_money;
                    }
                    break;
                case 605902412:
                    if (str.equals("IconXMark")) {
                        return R.raw.icon_x_mark;
                    }
                    break;
                case 758996507:
                    if (str.equals("IconXMarkSmall")) {
                        return R.raw.icon_x_mark_small;
                    }
                    break;
                case 773090539:
                    if (str.equals("IconPersonPen")) {
                        return R.raw.icon_person_pen;
                    }
                    break;
                case 836343089:
                    if (str.equals("IconExclamationMarkCircle")) {
                        return R.raw.icon_exclamation_mark_circle;
                    }
                    break;
                case 858289859:
                    if (str.equals("IconWithdraw")) {
                        return R.raw.icon_withdraw;
                    }
                    break;
                case 919604046:
                    if (str.equals("IconQuestionMarkCircleLTR")) {
                        return R.raw.icon_question_mark_circle_ltr;
                    }
                    break;
                case 1033887263:
                    if (str.equals("IconCoupon")) {
                        return R.raw.icon_coupon;
                    }
                    break;
                case 1073353338:
                    if (str.equals("exclamation_mark_triangle_fill")) {
                        return R.raw.icon_exclamation_mark_triangle_fill;
                    }
                    break;
                case 1251250072:
                    if (str.equals("IconLeadsGenLTR")) {
                        return R.raw.icon_leads_gen_ltr;
                    }
                    break;
                case 1393941260:
                    if (str.equals("IconCalendarStarFill")) {
                        return R.raw.icon_calendar_star_fill;
                    }
                    break;
                case 1406422407:
                    if (str.equals("IconQRCode")) {
                        return R.raw.icon_qr_code;
                    }
                    break;
                case 1568375194:
                    if (str.equals("IconChevronRightOffsetFillLTR")) {
                        return R.raw.icon_chevron_right_offset_fill_ltr;
                    }
                    break;
                case 1593268722:
                    if (str.equals("IconWallet")) {
                        return R.raw.icon_wallet;
                    }
                    break;
                case 1724372404:
                    if (str.equals("IconThumbsUpFill")) {
                        return R.raw.icon_thumbs_up_fill;
                    }
                    break;
                case 1823169449:
                    if (str.equals("IconHeadset")) {
                        return R.raw.icon_headset;
                    }
                    break;
                case 1924127028:
                    if (str.equals("IconCalendarTick")) {
                        return R.raw.icon_calendar_tick;
                    }
                    break;
            }
            try {
                return C786410Ut5.n3(C20642515q3.LJFF(), C2248371CzL.LIZ(str), "raw", C1717770unn.LIZJ().getApplicationContext().getPackageName());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return -1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJJIFFI(java.lang.String r3) {
        /*
            X.1CzL r0 = X.C2248371CzL.LIZ
            r0.getClass()
            if (r3 == 0) goto L3e
            int r1 = r3.hashCode()
            r0 = -634144463(0xffffffffda33b931, float:-1.264691E16)
            if (r1 == r0) goto L32
            r0 = 538252081(0x20151331, float:1.2627141E-19)
            if (r1 == r0) goto L26
            r0 = 1120948180(0x42d04fd4, float:104.155914)
            if (r1 != r0) goto L3e
            java.lang.String r0 = "IllustrationSBrowsingExperience"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3e
            r0 = 2130968950(0x7f040176, float:1.7546568E38)
            return r0
        L26:
            java.lang.String r0 = "TuxIllustrationMActivationResultIdentityError"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3e
            r0 = 2130968823(0x7f0400f7, float:1.754631E38)
            return r0
        L32:
            java.lang.String r0 = "IllustrationSStatic"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3e
            r0 = 2130969002(0x7f0401aa, float:1.7546674E38)
            return r0
        L3e:
            java.lang.String r1 = "IllustrationXS"
            r2 = 1
            if (r3 == 0) goto L44
            goto L77
        L44:
            java.lang.String r1 = "IllustrationS"
            if (r3 == 0) goto L55
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r1, r2)     // Catch: java.lang.Throwable -> L9e
            if (r0 != r2) goto L55
            java.lang.String r0 = "illustration_s"
            java.lang.String r3 = kotlin.text.u.LJJIFFI(r3, r1, r0, r2)     // Catch: java.lang.Throwable -> L9e
            goto L83
        L55:
            java.lang.String r1 = "IllustrationM"
            if (r3 == 0) goto L66
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r1, r2)     // Catch: java.lang.Throwable -> L9e
            if (r0 != r2) goto L66
            java.lang.String r0 = "illustration_m"
            java.lang.String r3 = kotlin.text.u.LJJIFFI(r3, r1, r0, r2)     // Catch: java.lang.Throwable -> L9e
            goto L83
        L66:
            java.lang.String r1 = "IllustrationL"
            if (r3 == 0) goto L83
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r1, r2)     // Catch: java.lang.Throwable -> L9e
            if (r0 != r2) goto L83
            java.lang.String r0 = "illustration_l"
            java.lang.String r3 = kotlin.text.u.LJJIFFI(r3, r1, r0, r2)     // Catch: java.lang.Throwable -> L9e
            goto L83
        L77:
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r1, r2)     // Catch: java.lang.Throwable -> L9e
            if (r0 != r2) goto L44
            java.lang.String r0 = "illustration_xs"
            java.lang.String r3 = kotlin.text.u.LJJIFFI(r3, r1, r0, r2)     // Catch: java.lang.Throwable -> L9e
        L83:
            java.lang.String r3 = X.C2248371CzL.LIZ(r3)     // Catch: java.lang.Throwable -> L9e
            android.content.res.Resources r2 = X.C20642515q3.LJFF()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "drawable"
            X.0uus r0 = X.C1717770unn.LIZJ()     // Catch: java.lang.Throwable -> L9e
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L9e
            int r0 = X.C786410Ut5.n3(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> L9e
            return r0
        L9e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721300utU.LJJIFFI(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.widget.ImageView r14, com.bytedance.pipo.stellar.base.model.StellarBadgeDO r15) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721300utU.LIZJ(android.widget.ImageView, com.bytedance.pipo.stellar.base.model.StellarBadgeDO):void");
    }

    public static InterfaceC1720550usH LJII(InterfaceC1720230url interfaceC1720230url, CardDO cardDO) {
        try {
            return interfaceC1720230url.J2(cardDO);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static void LJIIIZ(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.MarginLayoutParams(0, 0);
        }
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static void LJIIJ(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.MarginLayoutParams(0, 0);
        }
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static void LJIIL(Fragment fragment, ToastContentDO toastContentDO) {
        Context context;
        String str;
        String name;
        ColorDO color;
        Integer numLJIILIIL;
        String name2;
        ImageDO imageDO;
        ImageDO imageDO2;
        String name3;
        ColorDO color2;
        Integer numLJIILIIL2;
        String name4;
        ColorDO color3;
        Integer numLJIILIIL3;
        String name5;
        if (fragment != null && (context = fragment.getContext()) != null) {
            String str2 = null;
            if (toastContentDO != null) {
                str = toastContentDO.position;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "middle")) {
                C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                C1721300utU c1721300utU = LIZ;
                ImageDO imageDO3 = toastContentDO.icon;
                if (imageDO3 != null) {
                    name4 = imageDO3.getName();
                } else {
                    name4 = null;
                }
                c1721300utU.getClass();
                if (LJJI(name4) != -1) {
                    ImageDO imageDO4 = toastContentDO.icon;
                    if (imageDO4 != null) {
                        name5 = imageDO4.getName();
                    } else {
                        name5 = null;
                    }
                    c1389880mGw.LJ(LJJI(name5));
                }
                ImageDO imageDO5 = toastContentDO.icon;
                if (imageDO5 != null && (color3 = imageDO5.getColor()) != null && (numLJIILIIL3 = LJIILIIL(color3, context, null)) != null) {
                    c1389880mGw.LJFF(numLJIILIIL3.intValue());
                }
                c1389880mGw.LJIIIZ(toastContentDO.message);
                c1389880mGw.LIZ(true);
                c1389880mGw.LJIIJ();
                return;
            }
            if (Intrinsics.LJFF(str, "bottom")) {
                C1389910mGz c1389910mGz = new C1389910mGz(fragment);
                C1721300utU c1721300utU2 = LIZ;
                ImageDO imageDO6 = toastContentDO.icon;
                if (imageDO6 != null) {
                    name3 = imageDO6.getName();
                } else {
                    name3 = null;
                }
                c1721300utU2.getClass();
                Integer numValueOf = Integer.valueOf(LJJI(name3));
                if (numValueOf.intValue() != -1) {
                    int iIntValue = numValueOf.intValue();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = iIntValue;
                    ImageDO imageDO7 = toastContentDO.icon;
                    if (imageDO7 != null && (color2 = imageDO7.getColor()) != null && (numLJIILIIL2 = LJIILIIL(color2, context, null)) != null) {
                        c419910GdJ.LIZLLL = Integer.valueOf(numLJIILIIL2.intValue());
                    }
                    c1389910mGz.LJIIL(c419910GdJ);
                }
                c1389910mGz.LJIIJ(toastContentDO.message);
                c1389910mGz.LIZ(true);
                c1389910mGz.LJIIJJI();
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            C1721300utU c1721300utU3 = LIZ;
            if (toastContentDO != null && (imageDO2 = toastContentDO.icon) != null) {
                name = imageDO2.getName();
            } else {
                name = null;
            }
            c1721300utU3.getClass();
            if (LJJI(name) != -1) {
                if (toastContentDO != null && (imageDO = toastContentDO.icon) != null) {
                    name2 = imageDO.getName();
                } else {
                    name2 = null;
                }
                c1389890mGx.LJFF(LJJI(name2));
            }
            if (toastContentDO != null) {
                ImageDO imageDO8 = toastContentDO.icon;
                if (imageDO8 != null && (color = imageDO8.getColor()) != null && (numLJIILIIL = LJIILIIL(color, context, null)) != null) {
                    c1389890mGx.LJI(numLJIILIIL.intValue());
                }
                str2 = toastContentDO.message;
            }
            c1389890mGx.LJIIJ(str2);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
    }

    public static int LJIILLIIL(Context context, String str) {
        Float fLJIIIIZZ;
        if (str != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) != null) {
            float fFloatValue = fLJIIIIZZ.floatValue();
            if (fFloatValue < 0.0f) {
                if (fFloatValue > -1.0f) {
                    return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(Math.abs(fFloatValue))));
                }
                return (int) fFloatValue;
            }
            if (0.0f <= fFloatValue && fFloatValue < 1.0f) {
                return (int) (C12ES.LJIIIIZZ(context) * fFloatValue);
            }
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((int) fFloatValue)));
        }
        return 0;
    }

    public static C1251150ifB LJIIZILJ(ImageDO imageDO, Context context) {
        Integer numLIZJ;
        String name = imageDO.getName();
        if (name != null) {
            int iLJJI = LJJI(name);
            ColorDO color = imageDO.getColor();
            if (color == null || (numLIZJ = LJJ(color, context)) == null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = iLJJI;
            c419910GdJ.LIZLLL = numLIZJ;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LJ = c419910GdJ;
            return c1251150ifB;
        }
        return null;
    }

    public static void LJIJJLI(TuxTextView tuxTextView, TuxTagDO tuxTagDO) {
        String str;
        String str2;
        String str3;
        String str4;
        String name;
        String width;
        String height;
        Integer numLJIILIIL;
        ColorDO color;
        if (tuxTagDO == null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        TextDO text = tuxTagDO.getText();
        if (text != null) {
            LIZ.getClass();
            LJIL(null, text, tuxTextView);
        }
        MarginDO padding = tuxTagDO.getPadding();
        if (padding != null) {
            str = padding.start;
        } else {
            str = null;
        }
        Integer numValueOf = Integer.valueOf(LJJIII(tuxTextView.getContext(), str));
        MarginDO padding2 = tuxTagDO.getPadding();
        if (padding2 != null) {
            str2 = padding2.top;
        } else {
            str2 = null;
        }
        Integer numValueOf2 = Integer.valueOf(LJIILLIIL(tuxTextView.getContext(), str2));
        MarginDO padding3 = tuxTagDO.getPadding();
        if (padding3 != null) {
            str3 = padding3.end;
        } else {
            str3 = null;
        }
        Integer numValueOf3 = Integer.valueOf(LJJIII(tuxTextView.getContext(), str3));
        MarginDO padding4 = tuxTagDO.getPadding();
        if (padding4 != null) {
            str4 = padding4.bottom;
        } else {
            str4 = null;
        }
        C426750GoL.LJIIL(tuxTextView, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(LJIILLIIL(tuxTextView.getContext(), str4)), 16);
        C419910GdJ c419910GdJ = new C419910GdJ();
        C1721300utU c1721300utU = LIZ;
        ImageDO icon = tuxTagDO.getIcon();
        if (icon != null) {
            name = icon.getName();
        } else {
            name = null;
        }
        c1721300utU.getClass();
        c419910GdJ.LIZ = LJJI(name);
        ImageDO icon2 = tuxTagDO.getIcon();
        if (icon2 != null) {
            width = icon2.getWidth();
        } else {
            width = null;
        }
        c419910GdJ.LIZIZ = LJJIII(tuxTextView.getContext(), width);
        ImageDO icon3 = tuxTagDO.getIcon();
        if (icon3 != null) {
            height = icon3.getHeight();
        } else {
            height = null;
        }
        c419910GdJ.LIZJ = LJIILLIIL(tuxTextView.getContext(), height);
        ImageDO icon4 = tuxTagDO.getIcon();
        if (icon4 != null && (color = icon4.getColor()) != null) {
            numLJIILIIL = LJIILIIL(color, tuxTextView.getContext(), null);
        } else {
            numLJIILIIL = null;
        }
        c419910GdJ.LIZLLL = numLJIILIIL;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxTextView.getContext());
        tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
        LIZ(tuxTextView, new BackgroundDO(tuxTagDO.getCorner(), null, tuxTagDO.getBackgroundColor(), null, null, null), null);
    }

    public static Integer LJJ(ColorDO colorDO, Context context) {
        String str;
        boolean z;
        String str2;
        C098200Yq c098200Yq;
        Integer numLJ;
        if (context == null) {
            return null;
        }
        if (colorDO != null && (str2 = colorDO.token) != null) {
            try {
                numLJ = C2248361CzK.LJ(context, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (numLJ != null) {
                return Integer.valueOf(numLJ.intValue());
            }
            C189200o6.m2constructorimpl(null);
            c098200Yq = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (c098200Yq != null) {
                return null;
            }
        }
        C2248371CzL c2248371CzL = C2248371CzL.LIZ;
        if (colorDO != null) {
            str = colorDO.tux;
        } else {
            str = null;
        }
        c2248371CzL.getClass();
        Integer numValueOf = Integer.valueOf(C2248371CzL.LIZIZ(str));
        if (numValueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return C1308910kAL.LIZJ(numValueOf.intValue(), context);
    }

    public static int LJJIII(Context context, String str) {
        Float fLJIIIIZZ;
        if (str != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) != null) {
            float fFloatValue = fLJIIIIZZ.floatValue();
            if (fFloatValue < 0.0f) {
                if (fFloatValue > -1.0f) {
                    return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(Math.abs(fFloatValue))));
                }
                return (int) fFloatValue;
            }
            if (0.0f <= fFloatValue && fFloatValue < 1.0f) {
                return (int) (C12ES.LJIIJ(context) * fFloatValue);
            }
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((int) fFloatValue)));
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0251 A[PHI: r20
      0x0251: PHI (r20v2 java.lang.Integer) = (r20v1 java.lang.Integer), (r20v4 java.lang.Integer) binds: [B:133:0x024d, B:62:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017e  */
    /* JADX WARN: Type inference failed for: r0v98, types: [T, java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(final android.view.View r20, final com.bytedance.pipo.stellar.base.model.BackgroundDO r21, java.lang.Boolean r22) {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721300utU.LIZ(android.view.View, com.bytedance.pipo.stellar.base.model.BackgroundDO, java.lang.Boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0280 A[PHI: r12
      0x0280: PHI (r12v6 com.bytedance.pipo.stellar.base.model.BaseWidgetDO) = (r12v2 com.bytedance.pipo.stellar.base.model.BaseWidgetDO), (r12v7 com.bytedance.pipo.stellar.base.model.BaseWidgetDO) binds: [B:126:0x027e, B:118:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0OM1 LJ(com.bytedance.tux.navigation.TuxNavBar r22, com.bytedance.pipo.stellar.base.model.NavBarDO r23, X.C1720760usc r24) {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721300utU.LJ(com.bytedance.tux.navigation.TuxNavBar, com.bytedance.pipo.stellar.base.model.NavBarDO, X.0usc):X.0OM1");
    }

    public static Integer LJIILIIL(ColorDO colorDO, Context context, Boolean bool) {
        Integer numLJJ = LJJ(colorDO, context);
        if (numLJJ != null) {
            return numLJJ;
        }
        if (colorDO == null) {
            return null;
        }
        String str = colorDO.darkColor;
        if (str == null) {
            str = colorDO.darkMode;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        String str2 = colorDO.lightColor;
        if ((str2 == null && (str2 = colorDO.lightMode) == null) || str2.length() == 0) {
            return null;
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                String str3 = colorDO.darkColor;
                if (str3 == null) {
                    str3 = colorDO.darkMode;
                }
                return Integer.valueOf(ColorProtector.parseColor(str3));
            }
            String str4 = colorDO.lightColor;
            if (str4 == null) {
                str4 = colorDO.lightMode;
            }
            return Integer.valueOf(ColorProtector.parseColor(str4));
        }
        if (LJFF(context)) {
            String str5 = colorDO.darkColor;
            if (str5 == null) {
                str5 = colorDO.darkMode;
            }
            return Integer.valueOf(ColorProtector.parseColor(str5));
        }
        String str6 = colorDO.lightColor;
        if (str6 == null) {
            str6 = colorDO.lightMode;
        }
        return Integer.valueOf(ColorProtector.parseColor(str6));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJ(X.C197039127h r7, com.bytedance.pipo.stellar.base.model.ButtonDO r8, X.InterfaceC1720050urT r9) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721300utU.LJIJ(X.127h, com.bytedance.pipo.stellar.base.model.ButtonDO, X.0urT):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.bytedance.tux.drawable.TuxIconDrawable] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, com.bytedance.tux.drawable.TuxIconDrawable] */
    public static void LJIJI(ImageView imageView, ImageDO imageDO, InterfaceC1720050urT interfaceC1720050urT) {
        Image light;
        ImageView.ScaleType scaleType;
        Object c098200Yq;
        Float f;
        CornerDO corner;
        int iIntValue;
        Integer num;
        CornerDO corner2;
        int iIntValue2;
        Integer num2;
        CornerDO corner3;
        int iIntValue3;
        Integer num3;
        Integer num4;
        Integer num5;
        Float f2;
        Integer numLJIILIIL;
        if (imageView != null && imageDO != null) {
            imageView.setTag(imageDO.getObjId());
            LIZJ(imageView, imageDO.getBadge());
            StellarActionDO action = imageDO.getAction();
            if (action != null) {
                C786410Ut5.I7(new AbS191S0400000_26(imageDO, imageView, interfaceC1720050urT, action, 0), imageView);
            }
            Integer type = imageDO.getType();
            int iIntValue4 = 0;
            String str = null;
            LayerDrawable layerDrawableLJIILIIL = null;
            if (type != null) {
                if (type.intValue() == 0) {
                    C259800zU c259800zU = new C259800zU();
                    String iconToken = imageDO.getIconToken();
                    if (iconToken != null) {
                        try {
                            C01GW c01gw = C2248361CzK.LIZ;
                            C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(imageView.getContext(), iconToken);
                            if (c698190Ra5LJFF != null) {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                C1721300utU c1721300utU = LIZ;
                                String width = imageDO.getWidth();
                                Context context = imageView.getContext();
                                c1721300utU.getClass();
                                c419910GdJ.LIZIZ = LJJIII(context, width);
                                c419910GdJ.LIZJ = LJIILLIIL(imageView.getContext(), imageDO.getHeight());
                                c419910GdJ.LIZ = c698190Ra5LJFF.LIZ;
                                c419910GdJ.LIZLLL = c698190Ra5LJFF.LIZIZ;
                                ?? LIZ2 = c419910GdJ.LIZ(imageView.getContext());
                                ColorDO color = imageDO.getColor();
                                if (color != null && (f = color.alpha) != null) {
                                    LIZ2.setAlpha((int) (f.floatValue() * 255));
                                }
                                c259800zU.element = LIZ2;
                                c098200Yq = Unit.LIZ;
                            } else {
                                c098200Yq = null;
                            }
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m1boximpl(c098200Yq);
                    }
                    if (c259800zU.element == 0) {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        C1721300utU c1721300utU2 = LIZ;
                        String width2 = imageDO.getWidth();
                        Context context2 = imageView.getContext();
                        c1721300utU2.getClass();
                        c419910GdJ2.LIZIZ = LJJIII(context2, width2);
                        c419910GdJ2.LIZJ = LJIILLIIL(imageView.getContext(), imageDO.getHeight());
                        c419910GdJ2.LIZ = LJJI(imageDO.getName());
                        ColorDO color2 = imageDO.getColor();
                        if (color2 != null && (numLJIILIIL = LJIILIIL(color2, imageView.getContext(), Boolean.FALSE)) != null) {
                            c419910GdJ2.LIZLLL = Integer.valueOf(numLJIILIIL.intValue());
                        }
                        ?? LIZ3 = c419910GdJ2.LIZ(imageView.getContext());
                        ColorDO color3 = imageDO.getColor();
                        if (color3 != null && (f2 = color3.alpha) != null) {
                            LIZ3.setAlpha((int) (f2.floatValue() * 255));
                        }
                        c259800zU.element = LIZ3;
                    }
                    if (imageDO.getBackground() != null) {
                        Drawable drawable = (Drawable) c259800zU.element;
                        if (drawable != null) {
                            C384050F3z c384050F3z = new C384050F3z();
                            C1721300utU c1721300utU3 = LIZ;
                            String width3 = imageDO.getBackground().getWidth();
                            Context context3 = imageView.getContext();
                            c1721300utU3.getClass();
                            c384050F3z.LJII = LJJIII(context3, width3);
                            c384050F3z.LJI = LJIILLIIL(imageView.getContext(), imageDO.getBackground().getHeight());
                            ColorDO color4 = imageDO.getBackground().getColor();
                            if (color4 != null) {
                                c384050F3z.LIZ = LJIILIIL(color4, imageView.getContext(), null);
                            }
                            CornerDO corner4 = imageDO.getBackground().getCorner();
                            if ((corner4 != null && (num = corner4.corner) != null) || ((corner = imageDO.getBackground().getCorner()) != null && (num = corner.leftTop) != null)) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                            CornerDO corner5 = imageDO.getBackground().getCorner();
                            if ((corner5 != null && (num2 = corner5.corner) != null) || ((corner2 = imageDO.getBackground().getCorner()) != null && (num2 = corner2.rightTop) != null)) {
                                iIntValue2 = num2.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
                            CornerDO corner6 = imageDO.getBackground().getCorner();
                            if ((corner6 != null && (num3 = corner6.corner) != null) || ((corner3 = imageDO.getBackground().getCorner()) != null && (num3 = corner3.rightBottom) != null)) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue3)));
                            CornerDO corner7 = imageDO.getBackground().getCorner();
                            if (corner7 != null && (num5 = corner7.corner) != null) {
                                iIntValue4 = num5.intValue();
                            } else {
                                CornerDO corner8 = imageDO.getBackground().getCorner();
                                if (corner8 != null && (num4 = corner8.leftBottom) != null) {
                                    iIntValue4 = num4.intValue();
                                }
                            }
                            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue4)));
                            layerDrawableLJIILIIL = C426750GoL.LJIILIIL(drawable, c384050F3z.LIZ(imageView.getContext()));
                        }
                        imageView.setImageDrawable(layerDrawableLJIILIIL);
                        return;
                    }
                    imageView.setImageDrawable((Drawable) c259800zU.element);
                    return;
                }
                if (type != null) {
                    if (type.intValue() == 1) {
                        int iLJJIFFI = LJJIFFI(imageDO.getName());
                        if (iLJJIFFI != 0 && iLJJIFFI != -1) {
                            C0HTI c0hti = new C0HTI();
                            C1721300utU c1721300utU4 = LIZ;
                            String name = imageDO.getName();
                            c1721300utU4.getClass();
                            c0hti.LIZ = LJJIFFI(name);
                            imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
                            return;
                        }
                        return;
                    }
                    if (type != null) {
                        if (type.intValue() == 2 || type.intValue() == 3) {
                            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new ViewGroup.MarginLayoutParams(imageView.getWidth(), imageView.getHeight());
                            }
                            layoutParams.width = LJJIII(imageView.getContext(), imageDO.getWidth());
                            layoutParams.height = LJIILLIIL(imageView.getContext(), imageDO.getHeight());
                            C786410Ut5.c6(imageView, layoutParams);
                            if (LJFF(imageView.getContext())) {
                                light = imageDO.getDark();
                                if (light == null) {
                                    light = imageDO.getLight();
                                    if (light != null) {
                                    }
                                }
                                str = light.imageUrl;
                            } else {
                                light = imageDO.getLight();
                                if (light == null) {
                                    light = imageDO.getDark();
                                    if (light != null) {
                                    }
                                }
                                str = light.imageUrl;
                            }
                            Integer type2 = imageDO.getType();
                            if (type2 != null && type2.intValue() == 2) {
                                if (str != null) {
                                    Integer retryCount = imageDO.getRetryCount();
                                    if (retryCount != null) {
                                        iIntValue4 = retryCount.intValue();
                                    }
                                    LJIJJ(iIntValue4, imageView, imageDO, str);
                                    return;
                                }
                                return;
                            }
                            if (str != null) {
                                LIZ.getClass();
                                try {
                                    byte[] bArrDecode = Base64.decode(a0.LJJLJLI(str, ",", str), 0);
                                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                                    if (bitmapDecodeByteArray != null) {
                                        imageView.setImageBitmap(bitmapDecodeByteArray);
                                        Integer scaleType2 = imageDO.getScaleType();
                                        if (scaleType2 == null || scaleType2.intValue() == 0) {
                                            scaleType = ImageView.ScaleType.FIT_XY;
                                        } else if (scaleType2.intValue() == 1) {
                                            scaleType = ImageView.ScaleType.FIT_CENTER;
                                        } else if (scaleType2.intValue() == 2) {
                                            scaleType = ImageView.ScaleType.CENTER_CROP;
                                        } else if (scaleType2.intValue() == 3) {
                                            scaleType = ImageView.ScaleType.FIT_START;
                                        } else {
                                            scaleType = ImageView.ScaleType.FIT_XY;
                                        }
                                        imageView.setScaleType(scaleType);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void LJIL(InterfaceC1720050urT interfaceC1720050urT, TextDO textDO, TuxTextView tuxTextView) {
        int iLIZJ;
        float fFloatValue;
        SpannableString spannableString;
        Float f;
        Integer numLJIILIIL;
        Integer numLIZIZ;
        if (textDO != null && tuxTextView != null) {
            tuxTextView.setTag(textDO.getObjId());
            C1721300utU c1721300utU = LIZ;
            String gravity = textDO.getGravity();
            c1721300utU.getClass();
            tuxTextView.setGravity(LJIILL(gravity));
            String fontToken = textDO.getFontToken();
            if (fontToken != null && (numLIZIZ = C2248361CzK.LIZIZ(fontToken)) != null) {
                iLIZJ = numLIZIZ.intValue();
            } else {
                String font = textDO.getFont();
                C2248371CzL.LIZ.getClass();
                iLIZJ = C2248371CzL.LIZJ(font);
            }
            tuxTextView.setTuxFont(iLIZJ);
            Integer maxLine = textDO.getMaxLine();
            if (maxLine != null) {
                tuxTextView.setMaxLines(maxLine.intValue());
            }
            ColorDO color = textDO.getColor();
            if (color != null && (numLJIILIIL = LJIILIIL(color, tuxTextView.getContext(), Boolean.FALSE)) != null) {
                tuxTextView.setTextColor(numLJIILIIL.intValue());
            }
            ColorDO color2 = textDO.getColor();
            if (color2 != null && (f = color2.alpha) != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C786410Ut5.B5(tuxTextView, fFloatValue);
            if (u.LJIJI(textDO.getTextType(), "MARKDOWN", true)) {
                String content = textDO.getContent();
                if (content == null) {
                    content = "";
                }
                AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(textDO, tuxTextView, 133);
                AwS235S0300000_26 awS235S0300000_26 = new AwS235S0300000_26(interfaceC1720050urT, textDO, tuxTextView, 41);
                C1721330utX c1721330utX = new C1721330utX(C13LQ.LJLIIL(new EnumC1721320utW[]{EnumC1721320utW.BOLD, EnumC1721320utW.LINK, EnumC1721320utW.ITALICS}), 2);
                C1721340utY c1721340utY = C1721390utd.LIZ;
                if (c1721340utY == null) {
                    C1721390utd.LIZ = new C1721340utY();
                } else {
                    c1721340utY.LIZJ();
                }
                C1721340utY c1721340utY2 = C1721390utd.LIZ;
                if (c1721340utY2 == null || (spannableString = c1721340utY2.LIZIZ(c1721330utX, content, new AwS585S0100000_6(awS392S0200000_26, (Function1<? super C1721380utc, ? extends List<? extends Object>>) 27), new AwS585S0100000_6(awS235S0300000_26, (Function1<? super C1721380utc, ? extends List<? extends Object>>) 28), new AwS585S0100000_6((Function1) null, (Function1<? super C1721380utc, ? extends List<? extends Object>>) 29))) == null) {
                    spannableString = new SpannableString(textDO.getContent());
                }
                tuxTextView.setText(spannableString);
                tuxTextView.setHighlightColor(0);
            } else {
                tuxTextView.setText(textDO.getContent());
            }
            StellarActionDO action = textDO.getAction();
            if (action != null) {
                C786410Ut5.I7(new AbS333S0300000_26(interfaceC1720050urT, action, new C1720250urn(textDO.getObjId(), textDO.getTrackingParams(), "button", tuxTextView, 8), 2), tuxTextView);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC1250290idn LJJII(com.bytedance.pipo.stellar.base.model.NavbarActionDO r6, android.content.Context r7, X.InterfaceC1720050urT r8) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721300utU.LJJII(com.bytedance.pipo.stellar.base.model.NavbarActionDO, android.content.Context, X.0urT):X.0idn");
    }

    public static void LJIIJJI(InterfaceC1720050urT interfaceC1720050urT, final Context context, DialogContentDO dialogContentDO, Map map) {
        String theme;
        if (context != null) {
            C1720680usU c1720680usU = EnumC1720670usT.Companion;
            if (dialogContentDO != null) {
                theme = dialogContentDO.getTheme();
            } else {
                theme = null;
            }
            c1720680usU.getClass();
            C1397580mTM c1397580mTM = new C1397580mTM(C1720680usU.LIZIZ(context, theme));
            if (dialogContentDO != null) {
                ImageDO topImage = dialogContentDO.getTopImage();
                if (topImage != null) {
                    final ImageView imageView = new ImageView(context);
                    LIZ.getClass();
                    LJIJI(imageView, topImage, interfaceC1720050urT);
                    c1397580mTM.LJIIIZ = new AbstractC1391830mK5(context, imageView) { // from class: X.0DVd
                        public final View LJ;

                        @Override // X.AbstractC1397490mTD
                        public final View LIZIZ() {
                            FrameLayout frameLayout = new FrameLayout(this.LIZ);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                            frameLayout.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            C786410Ut5.a6(frameLayout, layoutParams);
                            frameLayout.setBackground(new ColorDrawable(this.LIZLLL));
                            frameLayout.addView(this.LJ);
                            return frameLayout;
                        }

                        {
                            this.LJ = imageView;
                        }
                    };
                }
                TextDO title = dialogContentDO.getTitle();
                if (title != null) {
                    c1397580mTM.LJI(title.getContent());
                }
                TextDO message = dialogContentDO.getMessage();
                if (message != null) {
                    c1397580mTM.LIZIZ(message.getContent());
                }
                if (dialogContentDO != null) {
                    AccessoryDO accessory = dialogContentDO.getAccessory();
                    if (accessory != null && u.LJIJI(accessory.type, "LINK", true)) {
                        C1397720mTa.LIZ(c1397580mTM, null, new AwS235S0300000_26(context, accessory, interfaceC1720050urT, 36));
                    }
                    DialogActionDO actionArea = dialogContentDO.getActionArea();
                    if (actionArea != null) {
                        if (u.LJIJI(actionArea.type, "ACTION", true)) {
                            C985403tE.LIZ(c1397580mTM, new AwS392S0200000_26(actionArea, interfaceC1720050urT, 130));
                        } else {
                            C1238130iKB.LIZ(c1397580mTM, new AwS392S0200000_26(actionArea, interfaceC1720050urT, 131));
                        }
                    }
                }
            }
            c1397580mTM.LJ(new AwS392S0200000_26(map, (Map<String, String>) dialogContentDO, (DialogContentDO) 132));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public static final void LJIJJ(final int i, final ImageView imageView, final ImageDO imageDO, final String str) {
        EnumC1338240kve enumC1338240kve;
        C1331670kl3 c1331670kl3 = new C1331670kl3(str);
        c1331670kl3.LIZJ = imageView.getContext();
        C1721300utU c1721300utU = LIZ;
        Integer scaleType = imageDO.getScaleType();
        c1721300utU.getClass();
        if (scaleType == null || scaleType.intValue() == 0) {
            enumC1338240kve = EnumC1338240kve.FIT_XY;
        } else if (scaleType.intValue() == 1) {
            enumC1338240kve = EnumC1338240kve.FIT_CENTER;
        } else if (scaleType.intValue() == 2) {
            enumC1338240kve = EnumC1338240kve.CENTER_CROP;
        } else if (scaleType.intValue() == 3) {
            enumC1338240kve = EnumC1338240kve.FIT_START;
        } else {
            enumC1338240kve = EnumC1338240kve.FIT_XY;
        }
        c1331670kl3.LJJ = enumC1338240kve;
        c1331670kl3.LJJIJ = imageView;
        c1331670kl3.LJIILJJIL(new AbstractC2350809Ja() { // from class: X.0utL
            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                AbstractC20628015ni abstractC20628015ni;
                ViewParent parent = imageView.getParent();
                if ((parent instanceof C20627315nb) && (abstractC20628015ni = (AbstractC20628015ni) parent) != null) {
                    abstractC20628015ni.setLoading(false);
                }
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                int i2 = i;
                if (i2 > 0) {
                    C1721300utU.LJIJJ(i2 - 1, imageView, imageDO, str);
                }
            }
        });
        C786410Ut5.h3(c1331670kl3);
    }

    public static void LIZLLL(View view, MarginDO marginDO, MarginDO marginDO2, String str, String str2) {
        int iLJIIJ;
        int iLJIIIIZZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String str3;
        Integer numLJIIJJI;
        String str4;
        Integer numLJIIJJI2;
        String str5;
        Integer numLJIIJJI3;
        String str6;
        Integer numLJIIJJI4;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numLJIIJJI5;
        Integer numLJIIJJI6;
        Integer numLJIIJJI7;
        Integer numLJIIJJI8;
        Context context = view.getContext();
        if (str == null) {
            str = "-2";
        }
        Integer numLJI = LJI(str);
        if (numLJI != null) {
            iLJIIJ = numLJI.intValue();
        } else {
            iLJIIJ = (int) (C12ES.LJIIJ(context) * CastFloatProtector.parseFloat(str));
        }
        Context context2 = view.getContext();
        if (str2 == null) {
            str2 = "-2";
        }
        Integer numLJI2 = LJI(str2);
        if (numLJI2 != null) {
            iLJIIIIZZ = numLJI2.intValue();
        } else {
            iLJIIIIZZ = (int) (C12ES.LJIIIIZZ(context2) * CastFloatProtector.parseFloat(str2));
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer numValueOf4 = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(iLJIIJ, iLJIIIIZZ);
        }
        if (marginDO2 != null) {
            String str7 = marginDO2.start;
            if (str7 != null && (numLJIIJJI8 = C2095008Iq.LJIIJJI(str7)) != null) {
                numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI8)));
            } else {
                numValueOf = null;
            }
            String str8 = marginDO2.top;
            if (str8 != null && (numLJIIJJI7 = C2095008Iq.LJIIJJI(str8)) != null) {
                numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI7)));
            } else {
                numValueOf2 = null;
            }
            String str9 = marginDO2.end;
            if (str9 != null && (numLJIIJJI6 = C2095008Iq.LJIIJJI(str9)) != null) {
                numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI6)));
            } else {
                numValueOf3 = null;
            }
            String str10 = marginDO2.bottom;
            if (str10 != null && (numLJIIJJI5 = C2095008Iq.LJIIJJI(str10)) != null) {
                numValueOf4 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI5)));
            }
            C426750GoL.LJIIL(view, numValueOf, numValueOf2, numValueOf3, numValueOf4, 16);
        }
        marginLayoutParams.height = iLJIIIIZZ;
        marginLayoutParams.width = iLJIIJ;
        int iIntValue4 = 0;
        if (marginDO != null && (str6 = marginDO.start) != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(str6)) != null) {
            iIntValue = numLJIIJJI4.intValue();
        } else {
            iIntValue = 0;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        if (marginDO != null && (str5 = marginDO.top) != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str5)) != null) {
            iIntValue2 = numLJIIJJI3.intValue();
        } else {
            iIntValue2 = 0;
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
        if (marginDO != null && (str4 = marginDO.end) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str4)) != null) {
            iIntValue3 = numLJIIJJI2.intValue();
        } else {
            iIntValue3 = 0;
        }
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue3)));
        if (marginDO != null && (str3 = marginDO.bottom) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) != null) {
            iIntValue4 = numLJIIJJI.intValue();
        }
        marginLayoutParams.setMargins(iLIZIZ, iLIZIZ2, iLIZIZ3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue4))));
        C786410Ut5.W5(view, marginLayoutParams);
    }

    public static void LJIIIIZZ(GradientDrawable gradientDrawable, int i, Integer num, float f, float f2, float f3, float f4) {
        gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        if (i > 0 && num != null) {
            gradientDrawable.setStroke(i, num.intValue());
        }
    }
}
