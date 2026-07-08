package X;

import Y.ARunnableS3S0600000_10;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.EcSearchPromotionInfoAbModel;
import com.ss.android.ugc.aweme.ab.PromotionLabelTextInfo;
import com.ss.android.ugc.aweme.model.EcPromotionIcon;
import com.ss.android.ugc.aweme.model.EcPromotionInfo;
import com.ss.android.ugc.aweme.model.EcPromotionText;
import com.ss.android.ugc.aweme.search.model.EComWordRichExpression;
import com.ss.android.ugc.aweme.search.model.IconTextInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QWV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QWV {
    public static boolean LIZLLL() {
        return C306840C1a.LJ.getValue().booleanValue();
    }

    public static C306840C1a LIZ(Context context, EcPromotionIcon ecPromotionIcon) {
        int i;
        List<String> list = ecPromotionIcon.urlList;
        Integer num = ecPromotionIcon.width;
        Integer num2 = ecPromotionIcon.height;
        if (list != null && num != null && num2 != null) {
            int iIntValue = num2.intValue();
            int iIntValue2 = num.intValue();
            if ((!list.isEmpty()) && iIntValue2 > 0 && iIntValue > 0) {
                int i2 = C306840C1a.LIZLLL;
                if (LIZLLL()) {
                    i = 18;
                } else {
                    i = 16;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                int i3 = (int) ((iIntValue2 / iIntValue) * iLIZIZ);
                SmartImageView smartImageView = new SmartImageView(context);
                smartImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, iLIZIZ);
                layoutParams.topMargin = 1;
                C786410Ut5.G6(smartImageView, layoutParams);
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
                c1331670kl3LJIIJ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIJ);
                return new C306840C1a(i3, smartImageView, "icon");
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r0 = X.C306840C1a.LIZLLL;
        r0 = LIZ(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
    
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00de, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e2, code lost:
    
        if (r1 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e4, code lost:
    
        r0 = X.C306840C1a.LIZLLL;
        r0 = LIZ(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ee, code lost:
    
        if (r1 != null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C306840C1a LIZJ(X.C0QWU r7, android.content.Context r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QWV.LIZJ(X.0QWU, android.content.Context, boolean):X.0C1a");
    }

    public static void LJII(C0QWU c0qwu, ViewGroup viewGroup, TextView textView) {
        if (c0qwu.LIZLLL) {
            textView.setPaddingRelative(c0qwu.LJ, 0, c0qwu.LJFF, 0);
        }
        C786410Ut5.LJLZ(0, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v218, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.String] */
    public static C306840C1a LIZIZ(final Context context, EcPromotionText ecPromotionText, C0QWU c0qwu, boolean z) {
        EcPromotionInfo ecPromotionInfo;
        EcPromotionIcon ecPromotionIcon;
        int i;
        int iLIZIZ;
        String str;
        Integer numLIZJ;
        int color;
        int color2;
        Integer numLIZJ2;
        int color3;
        int color4;
        Integer numLIZJ3;
        int color5;
        EcPromotionInfo ecPromotionInfo2;
        EcPromotionIcon ecPromotionIcon2;
        EcPromotionInfo ecPromotionInfo3;
        int color6;
        Integer numLIZJ4;
        Integer numLIZJ5;
        Integer numLIZJ6;
        Integer numLIZJ7;
        EcPromotionInfo ecPromotionInfo4;
        EcPromotionIcon ecPromotionIcon3;
        EcPromotionInfo ecPromotionInfo5;
        EcPromotionInfo ecPromotionInfo6;
        Integer num;
        EcPromotionInfo ecPromotionInfo7;
        EcPromotionIcon ecPromotionIcon4;
        EcPromotionInfo ecPromotionInfo8;
        EcPromotionInfo ecPromotionInfo9;
        EcPromotionIcon ecPromotionIcon5;
        EcPromotionInfo ecPromotionInfo10;
        ?? r4 = ecPromotionText.content;
        String str2 = ecPromotionText.style;
        if (r4 != 0 && str2 != null) {
            int iLIZIZ2 = 0;
            if (r4.length() == 0 && !Intrinsics.LJFF(str2, C0QWT.WATCHED_IMAGE_TEXT.getStyleCode())) {
                if (C960203pA.LIZIZ(context)) {
                    if (c0qwu == null || (ecPromotionInfo10 = c0qwu.LIZIZ) == null) {
                        return null;
                    }
                    ecPromotionIcon5 = ecPromotionInfo10.darkIcon;
                } else {
                    if (c0qwu == null || (ecPromotionInfo9 = c0qwu.LIZIZ) == null) {
                        return null;
                    }
                    ecPromotionIcon5 = ecPromotionInfo9.icon;
                }
                if (ecPromotionIcon5 == null) {
                    return null;
                }
                int i2 = C306840C1a.LIZLLL;
                return LIZ(context, ecPromotionIcon5);
            }
            if (c0qwu != null && (ecPromotionInfo6 = c0qwu.LIZIZ) != null && (num = ecPromotionInfo6.LIZ) != null && num.intValue() == 1) {
                if (C960203pA.LIZIZ(context)) {
                    if (c0qwu == null || (ecPromotionInfo8 = c0qwu.LIZIZ) == null) {
                        return null;
                    }
                    ecPromotionIcon4 = ecPromotionInfo8.darkIcon;
                } else {
                    if (c0qwu == null || (ecPromotionInfo7 = c0qwu.LIZIZ) == null) {
                        return null;
                    }
                    ecPromotionIcon4 = ecPromotionInfo7.icon;
                }
                if (ecPromotionIcon4 == null) {
                    return null;
                }
                int i3 = C306840C1a.LIZLLL;
                return LIZ(context, ecPromotionIcon4);
            }
            if (r4.length() > 12 && !Intrinsics.LJFF(str2, C0QWT.RED_FONT_WITH_DOT_SEPARATOR.getStyleCode()) && !Intrinsics.LJFF(str2, C0QWT.FLEX_COLOR_FONT.getStyleCode()) && !Intrinsics.LJFF(str2, C0QWT.WATCHED_IMAGE_TEXT.getStyleCode()) && !Intrinsics.LJFF(str2, C0QWT.LEFT_ICON_RIGHT_TEXT.getStyleCode())) {
                if (C960203pA.LIZIZ(context)) {
                    if (c0qwu == null || (ecPromotionInfo5 = c0qwu.LIZIZ) == null) {
                        return null;
                    }
                    ecPromotionIcon3 = ecPromotionInfo5.darkIcon;
                } else {
                    if (c0qwu == null || (ecPromotionInfo4 = c0qwu.LIZIZ) == null) {
                        return null;
                    }
                    ecPromotionIcon3 = ecPromotionInfo4.icon;
                }
                if (ecPromotionIcon3 == null) {
                    return null;
                }
                int i4 = C306840C1a.LIZLLL;
                return LIZ(context, ecPromotionIcon3);
            }
            int i5 = C306840C1a.LIZLLL;
            if (LIZLLL()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            } else {
                if (!Intrinsics.LJFF(str2, C0QWT.FLEX_COLOR_FONT.getStyleCode()) && !Intrinsics.LJFF(str2, C0QWT.WATCHED_IMAGE_TEXT.getStyleCode())) {
                    i = 15;
                } else {
                    i = 20;
                }
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            }
            final TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, iLIZIZ));
            tuxTextView.setTuxFont(73);
            Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.a04, context);
            if (numLIZJ8 != null) {
                tuxTextView.setTextColor(numLIZJ8.intValue());
            }
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = r4;
            if (!Intrinsics.LJFF(str2, C0QWT.RED_FONT.getStyleCode())) {
                if (Intrinsics.LJFF(str2, C0QWT.YELLOW_FONT.getStyleCode())) {
                    Integer numLIZJ9 = C1308910kAL.LIZJ(R.attr.ww, context);
                    if (numLIZJ9 != null) {
                        tuxTextView.setTextColor(numLIZJ9.intValue());
                    }
                } else if (Intrinsics.LJFF(str2, C0QWT.ROUND_RECTANGLE_WITH_OVAL.getStyleCode())) {
                    tuxTextView.setTuxFont(92);
                    if (C960203pA.LIZIZ(context)) {
                        numLIZJ6 = C1308910kAL.LIZJ(R.attr.bz, context);
                    } else {
                        numLIZJ6 = C1308910kAL.LIZJ(R.attr.wc, context);
                    }
                    if (C960203pA.LIZIZ(context)) {
                        numLIZJ7 = C1308910kAL.LIZJ(R.attr.wc, context);
                    } else {
                        numLIZJ7 = C1308910kAL.LIZJ(R.attr.wd, context);
                    }
                    if (numLIZJ6 != null && numLIZJ7 != null) {
                        int iIntValue = numLIZJ7.intValue();
                        int iIntValue2 = numLIZJ6.intValue();
                        C417730GZn c417730GZn = new C417730GZn(C418440Gaw.LIZIZ(2), iIntValue);
                        float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
                        if (c417730GZn.LIZLLL != iIntValue2) {
                            c417730GZn.LIZLLL = iIntValue2;
                            c417730GZn.invalidateSelf();
                        }
                        if (c417730GZn.LJFF != fLIZIZ) {
                            c417730GZn.LJFF = fLIZIZ;
                            c417730GZn.LIZ();
                            c417730GZn.invalidateSelf();
                        }
                        float fLIZIZ2 = C418440Gaw.LIZIZ(4);
                        c417730GZn.LJIIJ = C418440Gaw.LIZIZ(5);
                        c417730GZn.LJIIJJI = fLIZIZ2;
                        tuxTextView.setBackground(c417730GZn);
                        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.5d))), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.5d))), 0);
                    }
                } else if (Intrinsics.LJFF(str2, C0QWT.ROUND_RECTANGLE.getStyleCode())) {
                    tuxTextView.setTuxFont(92);
                    if (C960203pA.LIZIZ(context)) {
                        numLIZJ4 = C1308910kAL.LIZJ(R.attr.bz, context);
                    } else {
                        numLIZJ4 = C1308910kAL.LIZJ(R.attr.wc, context);
                    }
                    if (C960203pA.LIZIZ(context)) {
                        numLIZJ5 = C1308910kAL.LIZJ(R.attr.wc, context);
                    } else {
                        numLIZJ5 = C1308910kAL.LIZJ(R.attr.wd, context);
                    }
                    if (numLIZJ4 != null && numLIZJ5 != null) {
                        int iIntValue3 = numLIZJ5.intValue();
                        int iIntValue4 = numLIZJ4.intValue();
                        C440190HNx c440190HNx = new C440190HNx(C418440Gaw.LIZIZ(4), iIntValue3);
                        c440190HNx.LJIIJ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)), iIntValue4);
                        tuxTextView.setBackground(c440190HNx);
                        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
                    }
                } else if (Intrinsics.LJFF(str2, C0QWT.RED_FONT_WITH_DOT_SEPARATOR.getStyleCode())) {
                    tuxTextView.setTuxFont(62);
                    C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("· ");
                    sbLIZ.append((String) r4);
                    c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    String str3 = "";
                    if (Intrinsics.LJFF(str2, C0QWT.FLEX_COLOR_FONT.getStyleCode())) {
                        try {
                            if (C960203pA.LIZIZ(context)) {
                                String str4 = ecPromotionText.textDarkColor;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                color2 = Color.parseColor(C1099070eht.LIZIZ(str4));
                            } else {
                                String str5 = ecPromotionText.textColor;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                color2 = Color.parseColor(C1099070eht.LIZIZ(str5));
                            }
                            numLIZJ = Integer.valueOf(color2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
                        }
                        if (numLIZJ != null) {
                            tuxTextView.setTextColor(numLIZJ.intValue());
                        }
                        if (C123100dR.LIZ(ecPromotionText.bgColor) & C123100dR.LIZ(ecPromotionText.bgDarkColor)) {
                            try {
                                if (C960203pA.LIZIZ(context)) {
                                    String str6 = ecPromotionText.bgDarkColor;
                                    if (str6 != null) {
                                        str3 = str6;
                                    }
                                    color = Color.parseColor(C1099070eht.LIZIZ(str3));
                                } else {
                                    String str7 = ecPromotionText.bgColor;
                                    if (str7 != null) {
                                        str3 = str7;
                                    }
                                    color = Color.parseColor(C1099070eht.LIZIZ(str3));
                                }
                                tuxTextView.setBackground(new C440190HNx(C418440Gaw.LIZIZ(4), color));
                                tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C189200o6.m2constructorimpl(new C098200Yq(th2));
                            }
                        }
                        int i6 = C306840C1a.LIZLLL;
                        if (LIZLLL()) {
                            LJI(context, c0qwu, str2, tuxTextView);
                        }
                    } else {
                        str = "textandicon";
                        if (Intrinsics.LJFF(str2, C0QWT.WATCHED_IMAGE_TEXT.getStyleCode())) {
                            try {
                                if (C960203pA.LIZIZ(context)) {
                                    String str8 = ecPromotionText.textDarkColor;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    color4 = Color.parseColor(C1099070eht.LIZIZ(str8));
                                } else {
                                    String str9 = ecPromotionText.textColor;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    color4 = Color.parseColor(C1099070eht.LIZIZ(str9));
                                }
                                numLIZJ2 = Integer.valueOf(color4);
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                numLIZJ2 = C1308910kAL.LIZJ(R.attr.a04, context);
                            }
                            if (numLIZJ2 != null) {
                                tuxTextView.setTextColor(numLIZJ2.intValue());
                            }
                            if (C123100dR.LIZ(ecPromotionText.bgColor) & C123100dR.LIZ(ecPromotionText.bgDarkColor)) {
                                try {
                                    if (C960203pA.LIZIZ(context)) {
                                        String str10 = ecPromotionText.bgDarkColor;
                                        if (str10 != null) {
                                            str3 = str10;
                                        }
                                        color3 = Color.parseColor(C1099070eht.LIZIZ(str3));
                                    } else {
                                        String str11 = ecPromotionText.bgColor;
                                        if (str11 != null) {
                                            str3 = str11;
                                        }
                                        color3 = Color.parseColor(C1099070eht.LIZIZ(str3));
                                    }
                                    tuxTextView.setBackground(new C440190HNx(C418440Gaw.LIZIZ(4), color3));
                                    tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    C189200o6.m2constructorimpl(new C098200Yq(th4));
                                }
                            }
                            ?? spannableString = new SpannableString(" " + ecPromotionText.content);
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_replay_fill;
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a1r);
                            C786410Ut5.p2(spannableString, c419910GdJ.LIZIZ(2, context), 0, 1, 18);
                            if (!C123100dR.LIZ(ecPromotionText.content)) {
                                str = "icon";
                            }
                            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                            c259800zU.element = spannableString;
                        } else if (Intrinsics.LJFF(str2, C0QWT.LEFT_ICON_RIGHT_TEXT.getStyleCode())) {
                            try {
                                if (C960203pA.LIZIZ(context)) {
                                    String str12 = ecPromotionText.textDarkColor;
                                    if (str12 == null) {
                                        str12 = "";
                                    }
                                    color6 = Color.parseColor(C1099070eht.LIZIZ(str12));
                                } else {
                                    String str13 = ecPromotionText.textColor;
                                    if (str13 == null) {
                                        str13 = "";
                                    }
                                    color6 = Color.parseColor(C1099070eht.LIZIZ(str13));
                                }
                                numLIZJ3 = Integer.valueOf(color6);
                            } catch (Throwable th5) {
                                TryCatchGuardChecker.doCheck(th5);
                                numLIZJ3 = C1308910kAL.LIZJ(R.attr.a04, context);
                            }
                            if (numLIZJ3 != null) {
                                tuxTextView.setTextColor(numLIZJ3.intValue());
                            }
                            if (C123100dR.LIZ(ecPromotionText.bgColor) & C123100dR.LIZ(ecPromotionText.bgDarkColor)) {
                                try {
                                    if (C960203pA.LIZIZ(context)) {
                                        String str14 = ecPromotionText.bgDarkColor;
                                        if (str14 != null) {
                                            str3 = str14;
                                        }
                                        color5 = Color.parseColor(C1099070eht.LIZIZ(str3));
                                    } else {
                                        String str15 = ecPromotionText.bgColor;
                                        if (str15 != null) {
                                            str3 = str15;
                                        }
                                        color5 = Color.parseColor(C1099070eht.LIZIZ(str3));
                                    }
                                    tuxTextView.setBackground(new C440190HNx(C418440Gaw.LIZIZ(4), color5));
                                    tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th6) {
                                    TryCatchGuardChecker.doCheck(th6);
                                    C189200o6.m2constructorimpl(new C098200Yq(th6));
                                }
                            }
                            int i7 = C306840C1a.LIZLLL;
                            if (LIZLLL()) {
                                LJI(context, c0qwu, str2, tuxTextView);
                            }
                            if (C960203pA.LIZIZ(context)) {
                                if (c0qwu != null && (ecPromotionInfo3 = c0qwu.LIZIZ) != null) {
                                    ecPromotionIcon2 = ecPromotionInfo3.darkIcon;
                                    if (ecPromotionIcon2 == null && C123100dR.LIZ(r4)) {
                                        Integer num2 = ecPromotionIcon2.width;
                                        Integer num3 = ecPromotionIcon2.height;
                                        List<String> list = ecPromotionIcon2.urlList;
                                        if (num2 != null && num3 != null && list != null) {
                                            int iIntValue5 = num3.intValue();
                                            int iIntValue6 = num2.intValue();
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(' ');
                                            sbLIZ2.append(ecPromotionText.content);
                                            final SpannableString spannableString2 = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
                                            final int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                                            final int i8 = (int) ((iIntValue6 / iIntValue5) * iLIZIZ3);
                                            final int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                                            final int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                                            iLIZIZ2 = i8 + iLIZIZ4 + iLIZIZ5;
                                            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                                            C03IT c03it = new C03IT(list);
                                            c1326790kdB.getClass();
                                            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(c03it);
                                            c1331670kl3LIZLLL.LJJIJL(context);
                                            c1331670kl3LIZLLL.LJJII(new InterfaceC1331910klR() { // from class: X.0QWZ
                                                @Override // X.InterfaceC1331910klR
                                                public final void onCanceled() {
                                                }

                                                @Override // X.InterfaceC1331910klR
                                                public final void onFailed(Throwable th7) {
                                                }

                                                @Override // X.InterfaceC1331910klR
                                                public final void onProgress(float f) {
                                                }

                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference failed for: r9v0, types: [T, android.text.SpannableString, java.lang.CharSequence] */
                                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                                 */
                                                @Override // X.InterfaceC1331910klR
                                                public final void LIZ(Bitmap bitmap) {
                                                    if (bitmap != null) {
                                                        ?? r9 = spannableString2;
                                                        C259800zU<CharSequence> c259800zU2 = c259800zU;
                                                        TuxTextView tuxTextView2 = tuxTextView;
                                                        int i9 = i8;
                                                        int i10 = iLIZIZ3;
                                                        Context context2 = context;
                                                        int i11 = iLIZIZ4;
                                                        int i12 = iLIZIZ5;
                                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                                                        bitmapDrawable.setBounds(0, 0, i9, i10);
                                                        C419890GdH c419890GdH = new C419890GdH(bitmapDrawable, 2);
                                                        c419890GdH.LIZIZ(i11, i12, C426750GoL.LIZLLL(context2));
                                                        C786410Ut5.p2(r9, c419890GdH, 0, 1, 18);
                                                        c259800zU2.element = r9;
                                                        tuxTextView2.setText((CharSequence) r9);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            } else if (c0qwu != null && (ecPromotionInfo2 = c0qwu.LIZIZ) != null) {
                                ecPromotionIcon2 = ecPromotionInfo2.icon;
                                if (ecPromotionIcon2 == null) {
                                }
                            }
                        }
                    }
                }
                str = "text";
            } else {
                str = "text";
            }
            int i9 = C306840C1a.LIZLLL;
            if (!LIZLLL() && (Intrinsics.LJFF(str2, C0QWT.FLEX_COLOR_FONT.getStyleCode()) || Intrinsics.LJFF(str2, C0QWT.WATCHED_IMAGE_TEXT.getStyleCode()))) {
                tuxTextView.setPadding(tuxTextView.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
                tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
            }
            tuxTextView.setText((CharSequence) c259800zU.element);
            int iMeasureText = iLIZIZ2 + ((int) tuxTextView.getPaint().measureText(tuxTextView.getText().toString())) + tuxTextView.getPaddingStart() + tuxTextView.getPaddingEnd();
            if (c0qwu != null) {
                c0qwu.LJIIL = r4;
            }
            return new C306840C1a(iMeasureText, tuxTextView, str);
        }
        if (c0qwu == null || (ecPromotionInfo = c0qwu.LIZIZ) == null || (ecPromotionIcon = ecPromotionInfo.icon) == null) {
            return null;
        }
        int i10 = C306840C1a.LIZLLL;
        return LIZ(context, ecPromotionIcon);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C0QWU r3, android.content.Context r4, android.view.ViewGroup r5, X.C0QNH r6) {
        /*
            if (r3 == 0) goto L4a
            if (r4 == 0) goto L4a
            if (r5 == 0) goto L4a
            com.ss.android.ugc.aweme.search.model.EComWordRichExpression r0 = r3.LIZJ
            if (r0 == 0) goto L4a
            java.util.List<com.ss.android.ugc.aweme.search.model.IconTextInfo> r0 = r0.iconTextInfo
            if (r0 == 0) goto L4a
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            if (r0 == 0) goto L4a
            float r0 = X.C0QWW.LIZ
            com.ss.android.ugc.aweme.search.model.EComWordRichExpression r0 = r3.LIZJ
            if (r0 == 0) goto L4a
            java.util.List<com.ss.android.ugc.aweme.search.model.IconTextInfo> r0 = r0.iconTextInfo
            if (r0 == 0) goto L4a
            java.lang.Object r3 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.search.model.IconTextInfo r3 = (com.ss.android.ugc.aweme.search.model.IconTextInfo) r3
            if (r3 == 0) goto L4a
            if (r6 == 0) goto L3b
            int[] r1 = X.C0QNJ.LIZ
            int r0 = r6.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case -1: goto L3b;
                case 0: goto L33;
                case 1: goto L3b;
                case 2: goto L3b;
                case 3: goto L3b;
                case 4: goto L39;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L40;
                case 8: goto L40;
                default: goto L33;
            }
        L33:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L39:
            r2 = 1
            goto L41
        L3b:
            boolean r2 = X.C960203pA.LIZIZ(r4)
            goto L41
        L40:
            r2 = 0
        L41:
            Y.ARunnableS12S0210000_10 r1 = new Y.ARunnableS12S0210000_10
            r0 = 1
            r1.<init>(r3, r5, r2, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r5, r1)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QWV.LJFF(X.0QWU, android.content.Context, android.view.ViewGroup, X.0QNH):void");
    }

    public static void LJI(Context context, C0QWU c0qwu, String str, TuxTextView tuxTextView) {
        EcPromotionInfo ecPromotionInfo;
        String str2;
        Map<String, PromotionLabelTextInfo> map;
        PromotionLabelTextInfo promotionLabelTextInfo;
        Integer numLIZJ;
        float fIntValue;
        String font_name;
        int iIntValue;
        int color;
        if (c0qwu != null && (ecPromotionInfo = c0qwu.LIZIZ) != null && (str2 = ecPromotionInfo.type) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            EcSearchPromotionInfoAbModel ecSearchPromotionInfoAbModel = (EcSearchPromotionInfoAbModel) C0QX3.LIZIZ.getValue();
            if (ecSearchPromotionInfoAbModel != null && (map = ecSearchPromotionInfoAbModel.map) != null && (promotionLabelTextInfo = map.get(strLIZIZ)) != null) {
                try {
                    String str3 = "";
                    if (C960203pA.LIZIZ(context)) {
                        String str4 = promotionLabelTextInfo.fontDarkColor;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        color = Color.parseColor(C1099070eht.LIZIZ(str3));
                    } else {
                        String str5 = promotionLabelTextInfo.fontColor;
                        if (str5 != null) {
                            str3 = str5;
                        }
                        color = Color.parseColor(C1099070eht.LIZIZ(str3));
                    }
                    numLIZJ = Integer.valueOf(color);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
                }
                if (numLIZJ != null) {
                    tuxTextView.setTextColor(numLIZJ.intValue());
                }
                Integer num = promotionLabelTextInfo.fontSize;
                if (num != null) {
                    fIntValue = num.intValue();
                } else {
                    fIntValue = 15.0f;
                }
                tuxTextView.LJJJJI(fIntValue);
                Integer num2 = promotionLabelTextInfo.fontWeight;
                if (num2 != null && (iIntValue = num2.intValue()) != 400) {
                    if (iIntValue != 500) {
                        if (iIntValue != 700) {
                            font_name = C12MF.REGULAR.getFONT_NAME();
                        } else {
                            font_name = C12MF.BOLD.getFONT_NAME();
                        }
                    } else {
                        font_name = C12MF.MEDIUM.getFONT_NAME();
                    }
                } else {
                    font_name = C12MF.REGULAR.getFONT_NAME();
                }
                Typeface typefaceLIZ = C19736612Jw.LIZ(font_name);
                if (typefaceLIZ != null) {
                    tuxTextView.setTypeface(typefaceLIZ);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59, types: [T, X.0QWe] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, X.0QWe] */
    public static void LJ(final C0QWU c0qwu, Context context, final ViewGroup viewGroup, final TextView textView, C0QL8 c0ql8, boolean z, boolean z2, final C670090QQd c670090QQd, boolean z3, C671720QWk c671720QWk) {
        final boolean z4;
        int i;
        int i2;
        boolean z5;
        Number numberValueOf;
        int i3;
        EcPromotionText ecPromotionText;
        List<IconTextInfo> list;
        List<IconTextInfo> list2;
        IconTextInfo iconTextInfo;
        if (viewGroup != null && textView != null) {
            EComWordRichExpression eComWordRichExpression = c0qwu.LIZJ;
            String str = null;
            if (eComWordRichExpression != null && (list = eComWordRichExpression.iconTextInfo) != null && C13LP.LJJJLL(list) != null) {
                float f = C0QWW.LIZ;
                try {
                    EComWordRichExpression eComWordRichExpression2 = c0qwu.LIZJ;
                    if (eComWordRichExpression2 != null && (list2 = eComWordRichExpression2.iconTextInfo) != null && (iconTextInfo = (IconTextInfo) C13LP.LJJJLL(list2)) != null) {
                        if (viewGroup.getChildCount() <= 0 || z) {
                            C786410Ut5.LJJJJI(viewGroup);
                            C259800zU c259800zU = new C259800zU();
                            ?? LIZIZ = C0QWW.LIZIZ(context, iconTextInfo);
                            if (LIZIZ != 0) {
                                c259800zU.element = LIZIZ;
                                if (LIZIZ.LIZJ == EnumC671630QWb.TEXT_AND_ICON && c0qwu.LJIILL) {
                                    c259800zU.element = C0QWW.LIZLLL(LIZIZ);
                                }
                                C0QWW.LJFF(c0qwu, iconTextInfo, (C671660QWe) c259800zU.element);
                                if (z3) {
                                    C680790Qn7 c680790Qn7 = C680790Qn7.LIZ;
                                    C0QWX c0qwx = new C0QWX(c0qwu, viewGroup, textView, c259800zU, c670090QQd, iconTextInfo, c671720QWk);
                                    c680790Qn7.getClass();
                                    HandlerHook.viewPost(textView, new RunnableC514801zW(c0qwx, (Function0<Unit>) 195));
                                } else if (z2) {
                                    HandlerHook.viewPost(textView, new ARunnableS3S0600000_10(c0qwu, viewGroup, textView, c259800zU, c670090QQd, iconTextInfo, 4));
                                } else {
                                    HandlerHook.viewPost(textView, new ARunnableS3S0600000_10(c0qwu, viewGroup, textView, c259800zU, c670090QQd, iconTextInfo, 5));
                                }
                            }
                        } else {
                            C0QWW.LIZJ(viewGroup, textView, c0qwu, c670090QQd);
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return;
                }
            }
            boolean z6 = true;
            if (((Number) C256690A4d.LIZ.getValue()).intValue() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (LIZLLL()) {
                i = 4;
            } else {
                i = 2;
            }
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
            if (LIZLLL()) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
            C0QAW.LIZIZ(iLIZIZ, viewGroup);
            if (c0ql8 == C0QL8.SHOW_ICON_END) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (c0ql8 != C0QL8.SHOW_ICON_START) {
                z6 = false;
            }
            EcPromotionInfo ecPromotionInfo = c0qwu.LIZIZ;
            if (ecPromotionInfo != null && (ecPromotionText = ecPromotionInfo.text) != null) {
                str = ecPromotionText.style;
            }
            if (Intrinsics.LJFF(str, C0QWT.FLEX_COLOR_FONT.getStyleCode()) || Intrinsics.LJFF(str, C0QWT.WATCHED_IMAGE_TEXT.getStyleCode())) {
                C12ES.LJIILL(4, viewGroup);
                C786410Ut5.LJJJJI(viewGroup);
            }
            if (z2) {
                if (viewGroup.getChildCount() > 0 && !z) {
                    LJII(c0qwu, viewGroup, textView);
                    return;
                }
                C786410Ut5.LJJJJI(viewGroup);
                final C306840C1a c306840C1aLIZJ = LIZJ(c0qwu, context, z2);
                if (c306840C1aLIZJ == null || c306840C1aLIZJ.LIZIZ <= 0) {
                    return;
                }
                viewGroup.addView(c306840C1aLIZJ.LIZ);
                final boolean z7 = z4;
                HandlerHook.viewPost(textView, new Runnable() { // from class: X.0QWL
                    public final void LIZ() {
                        EcPromotionText ecPromotionText2;
                        EcPromotionText ecPromotionText3;
                        int iMeasureText = (int) textView.getPaint().measureText(textView.getHint().toString());
                        int measuredWidth = textView.getMeasuredWidth() - iMeasureText;
                        int i4 = c306840C1aLIZJ.LIZIZ + iLIZIZ;
                        if (i4 <= measuredWidth) {
                            viewGroup.setPaddingRelative(0, iLIZIZ2, ((textView.getMeasuredWidth() - iMeasureText) - c306840C1aLIZJ.LIZIZ) - iLIZIZ, 0);
                        } else {
                            if (z7) {
                                C12ES.LJIILL(4, viewGroup);
                                C786410Ut5.LJJJJI(viewGroup);
                                return;
                            }
                            EcPromotionInfo ecPromotionInfo2 = c0qwu.LIZIZ;
                            String str2 = (ecPromotionInfo2 == null || (ecPromotionText3 = ecPromotionInfo2.text) == null) ? null : ecPromotionText3.style;
                            if (Intrinsics.LJFF(str2, C0QWT.FLEX_COLOR_FONT.getStyleCode()) || Intrinsics.LJFF(str2, C0QWT.WATCHED_IMAGE_TEXT.getStyleCode())) {
                                C12ES.LJIILL(4, viewGroup);
                                C786410Ut5.LJJJJI(viewGroup);
                                return;
                            } else {
                                C0QWU c0qwu2 = c0qwu;
                                c0qwu2.LIZLLL = true;
                                c0qwu2.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                                c0qwu.LJFF = i4;
                            }
                        }
                        int i5 = C306840C1a.LIZLLL;
                        C0QWV.LJII(c0qwu, viewGroup, textView);
                        EcPromotionInfo ecPromotionInfo3 = c0qwu.LIZIZ;
                        String str3 = (ecPromotionInfo3 == null || (ecPromotionText2 = ecPromotionInfo3.text) == null) ? null : ecPromotionText2.style;
                        if ((Intrinsics.LJFF(str3, C0QWT.FLEX_COLOR_FONT.getStyleCode()) || Intrinsics.LJFF(str3, C0QWT.WATCHED_IMAGE_TEXT.getStyleCode())) && !c670090QQd.isReentrantSearch()) {
                            C0QWU c0qwu3 = c0qwu;
                            if (c0qwu3.LJIILJJIL) {
                                return;
                            }
                            C670090QQd c670090QQd2 = c670090QQd;
                            c670090QQd2.setWordState(c0qwu3.LJIIIZ);
                            c670090QQd2.setIconType(c0qwu3.LJIIJJI);
                            c670090QQd2.setIconContent(c0qwu3.LJIIL);
                            C670080QQc.LIZ(c670090QQd2, null);
                            c0qwu.LJIILJJIL = true;
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EcIconViewWrapper$Companion@15f.showIconView$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EcIconViewWrapper$Companion@15f.showIconView$1$1");
                    }
                });
                return;
            }
            if (viewGroup.getChildCount() > 0 && !z) {
                LJII(c0qwu, viewGroup, textView);
                return;
            }
            C786410Ut5.LJJJJI(viewGroup);
            final C306840C1a c306840C1aLIZJ2 = LIZJ(c0qwu, context, false);
            if (c306840C1aLIZJ2 == null || c306840C1aLIZJ2.LIZIZ <= 0) {
                return;
            }
            if (z6) {
                numberValueOf = 47;
            } else {
                numberValueOf = Double.valueOf(32.5d);
            }
            final int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numberValueOf));
            textView.setPaddingRelative(iLIZIZ3, 0, 0, 0);
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            if (z5) {
                i3 = C306840C1a.LIZLLL;
            } else {
                i3 = 0;
            }
            final int i4 = iLIZIZ4 + i3;
            viewGroup.setPaddingRelative(0, iLIZIZ2, i4, 0);
            viewGroup.addView(c306840C1aLIZJ2.LIZ);
            HandlerHook.viewPost(textView, new Runnable() { // from class: X.0QWM
                public final void LIZ() {
                    EcPromotionText ecPromotionText2;
                    EcPromotionText ecPromotionText3;
                    int iMeasureText = (int) textView.getPaint().measureText(textView.getHint().toString());
                    if (c306840C1aLIZJ2.LIZIZ <= ((((textView.getMeasuredWidth() - textView.getPaddingStart()) - textView.getPaddingEnd()) - iMeasureText) - iLIZIZ) - i4) {
                        viewGroup.setPaddingRelative(0, iLIZIZ2, (((textView.getMeasuredWidth() - textView.getPaddingStart()) - iMeasureText) - c306840C1aLIZJ2.LIZIZ) - iLIZIZ, 0);
                    } else {
                        if (z4) {
                            C12ES.LJIILL(4, viewGroup);
                            C786410Ut5.LJJJJI(viewGroup);
                            return;
                        }
                        EcPromotionInfo ecPromotionInfo2 = c0qwu.LIZIZ;
                        String str2 = (ecPromotionInfo2 == null || (ecPromotionText3 = ecPromotionInfo2.text) == null) ? null : ecPromotionText3.style;
                        if (Intrinsics.LJFF(str2, C0QWT.FLEX_COLOR_FONT.getStyleCode()) || Intrinsics.LJFF(str2, C0QWT.WATCHED_IMAGE_TEXT.getStyleCode())) {
                            C12ES.LJIILL(4, viewGroup);
                            C786410Ut5.LJJJJI(viewGroup);
                            return;
                        } else {
                            C0QWU c0qwu2 = c0qwu;
                            c0qwu2.LIZLLL = true;
                            c0qwu2.LJ = iLIZIZ3;
                            c0qwu2.LJFF = c306840C1aLIZJ2.LIZIZ + viewGroup.getPaddingStart() + viewGroup.getPaddingEnd() + iLIZIZ;
                        }
                    }
                    int i5 = C306840C1a.LIZLLL;
                    C0QWV.LJII(c0qwu, viewGroup, textView);
                    EcPromotionInfo ecPromotionInfo3 = c0qwu.LIZIZ;
                    String str3 = (ecPromotionInfo3 == null || (ecPromotionText2 = ecPromotionInfo3.text) == null) ? null : ecPromotionText2.style;
                    if ((Intrinsics.LJFF(str3, C0QWT.FLEX_COLOR_FONT.getStyleCode()) || Intrinsics.LJFF(str3, C0QWT.WATCHED_IMAGE_TEXT.getStyleCode()) || Intrinsics.LJFF(str3, C0QWT.LEFT_ICON_RIGHT_TEXT.getStyleCode())) && !c670090QQd.isReentrantSearch()) {
                        C670090QQd c670090QQd2 = c670090QQd;
                        C0QWU c0qwu3 = c0qwu;
                        c670090QQd2.setWordState(c0qwu3.LJIIIZ);
                        c670090QQd2.setIconType(c0qwu3.LJIIJJI);
                        c670090QQd2.setIconContent(c0qwu3.LJIIL);
                        C670080QQc.LIZ(c670090QQd2, null);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EcIconViewWrapper$Companion@15f.showIconView$2$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EcIconViewWrapper$Companion@15f.showIconView$2$1");
                }
            });
        }
    }
}
