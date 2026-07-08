package X;

import android.graphics.Color;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorBadgeSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorContainerHeightSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorContentFontColorSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorContentShadowSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorNameShadowSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorTextFontSizeSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorUserFontColorSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceBadgeSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceContainerHeightSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceContentFontColorSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceContentShadowSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceNameShadowSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceTextFontSizeSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceUserFontColorSetting;
import com.bytedance.android.livesdk.livesetting.PublicScreenShadowConfig;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0g68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152540g68 {
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;

    public static int LJFF(boolean z) {
        float fLIZIZ;
        if (z) {
            fLIZIZ = C497740JfY.LIZIZ(LivePublicScreenUiConfigAnchorBadgeSetting.INSTANCE.getValue().height);
        } else {
            fLIZIZ = C497740JfY.LIZIZ(LivePublicScreenUiConfigAudienceBadgeSetting.INSTANCE.getValue().height);
        }
        return (int) fLIZIZ;
    }

    public static int LJI(boolean z) {
        if (z) {
            return LivePublicScreenUiConfigAnchorBadgeSetting.INSTANCE.getValue().typographyName;
        }
        return LivePublicScreenUiConfigAudienceBadgeSetting.INSTANCE.getValue().typographyName;
    }

    public static int LJII(boolean z) {
        String value;
        int color;
        if (z) {
            value = LivePublicScreenUiConfigAnchorContentFontColorSetting.INSTANCE.getValue();
        } else {
            value = LivePublicScreenUiConfigAudienceContentFontColorSetting.INSTANCE.getValue();
        }
        try {
            color = Color.parseColor(value);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            color = ColorProtector.parseColor("#E6FFFFFF");
        }
        if (color == 0) {
            return ColorProtector.parseColor("#E6FFFFFF");
        }
        return color;
    }

    public static int LJIIIIZZ(boolean z) {
        if (z) {
            int i = LIZLLL;
            if (i > 0) {
                return C439101nJ.LIZ(i);
            }
            return C439101nJ.LIZ(LivePublicScreenUiConfigAnchorContainerHeightSetting.INSTANCE.getValue());
        }
        int i2 = LIZJ;
        if (i2 > 0) {
            return C439101nJ.LIZ(i2);
        }
        if (C500260Jjc.LJJII(C497740JfY.LIZ) && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            return Math.max(C497740JfY.LJIILLIIL() / 2, C439101nJ.LIZ(LivePublicScreenUiConfigAudienceContainerHeightSetting.INSTANCE.getValue()));
        }
        return C439101nJ.LIZ(LivePublicScreenUiConfigAudienceContainerHeightSetting.INSTANCE.getValue());
    }

    public static int LJIIIZ(boolean z) {
        String value;
        int color;
        if (z) {
            value = LivePublicScreenUiConfigAnchorUserFontColorSetting.INSTANCE.getValue();
        } else {
            value = LivePublicScreenUiConfigAudienceUserFontColorSetting.INSTANCE.getValue();
        }
        try {
            color = Color.parseColor(value);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            color = ColorProtector.parseColor("#80FFFFFF");
        }
        if (color == 0) {
            return ColorProtector.parseColor("#80FFFFFF");
        }
        return color;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r8, java.lang.CharSequence r9) {
        /*
            com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAdaptiveLineHeightSetting r0 = com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAdaptiveLineHeightSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L6f
            if (r8 <= 0) goto L6f
            boolean r0 = r9 instanceof android.text.SpannableString
            if (r0 == 0) goto L6f
            android.text.SpannableString r9 = (android.text.SpannableString) r9
            if (r9 == 0) goto L6f
            int r1 = r9.length()
            java.lang.Class<X.0H0z> r0 = X.C434230H0z.class
            r5 = 0
            java.lang.Object[] r6 = r9.getSpans(r5, r1, r0)
            X.0H0z[] r6 = (X.C434230H0z[]) r6
            int r0 = r6.length
            r7 = 1
            if (r0 == 0) goto L60
            r4 = r6[r5]
            int r0 = r6.length
            int r3 = r0 + (-1)
            if (r3 != 0) goto L4f
            if (r4 == 0) goto L60
        L2c:
            int r0 = r4.LL
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L60
            int r0 = r1.intValue()
            if (r0 <= 0) goto L60
            X.0H0z r3 = new X.0H0z
            int r0 = r1.intValue()
            r3.<init>(r0)
        L43:
            int r2 = r6.length
            r1 = 0
        L45:
            if (r1 >= r2) goto L66
            r0 = r6[r1]
            r9.removeSpan(r0)
            int r1 = r1 + 1
            goto L45
        L4f:
            int r2 = r4.LL
            if (r7 > r3) goto L2c
        L53:
            r1 = r6[r7]
            int r0 = r1.LL
            if (r2 >= r0) goto L5b
            r4 = r1
            r2 = r0
        L5b:
            if (r7 == r3) goto L2c
            int r7 = r7 + 1
            goto L53
        L60:
            X.0H0z r3 = new X.0H0z
            r3.<init>(r8)
            goto L43
        L66:
            int r1 = r9.length()
            r0 = 17
            X.C786410Ut5.p2(r9, r3, r5, r1, r0)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1152540g68.LIZ(int, java.lang.CharSequence):void");
    }

    public static void LIZJ(SimpleLiveTextView simpleLiveTextView, boolean z, boolean z2) throws Throwable {
        int value;
        if (z2) {
            int iLJII = LJII(z);
            if (z) {
                value = LivePublicScreenUiConfigAnchorTextFontSizeSetting.INSTANCE.getValue();
            } else {
                value = LivePublicScreenUiConfigAudienceTextFontSizeSetting.INSTANCE.getValue();
            }
            LIZIZ(simpleLiveTextView, z, true, true);
            simpleLiveTextView.setTextColor(iLJII);
            simpleLiveTextView.setTextSize(1, value);
            LIZ(simpleLiveTextView.getLineHeight(), simpleLiveTextView.getText());
        }
    }

    public static void LJ(TextView textView, boolean z, boolean z2) {
        int value;
        if (z2) {
            int iLJIIIZ = LJIIIZ(z);
            if (z) {
                value = LivePublicScreenUiConfigAnchorTextFontSizeSetting.INSTANCE.getValue();
            } else {
                value = LivePublicScreenUiConfigAudienceTextFontSizeSetting.INSTANCE.getValue();
            }
            LIZLLL(textView, z, true, true);
            textView.setTextColor(iLJIIIZ);
            textView.setTextSize(1, value);
            LIZ(textView.getLineHeight(), textView.getText());
        }
    }

    public static void LIZIZ(SimpleLiveTextView simpleLiveTextView, boolean z, boolean z2, boolean z3) throws Throwable {
        String str;
        float f;
        float f2;
        float f3;
        if (z2) {
            if (z3) {
                if (z) {
                    str = LivePublicScreenUiConfigAnchorContentShadowSetting.INSTANCE.getValue().shadowColor;
                } else {
                    str = LivePublicScreenUiConfigAudienceContentShadowSetting.INSTANCE.getValue().shadowColor;
                }
                int color = LIZIZ;
                if (color <= 0) {
                    try {
                        color = Color.parseColor(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        color = ColorProtector.parseColor("#33000000");
                    }
                }
                LIZIZ = color;
                if (z) {
                    f = LivePublicScreenUiConfigAnchorContentShadowSetting.INSTANCE.getValue().shadowHeight;
                    f2 = LivePublicScreenUiConfigAnchorContentShadowSetting.INSTANCE.getValue().shadowX;
                    f3 = LivePublicScreenUiConfigAnchorContentShadowSetting.INSTANCE.getValue().shadowY;
                } else {
                    f = LivePublicScreenUiConfigAudienceContentShadowSetting.INSTANCE.getValue().shadowHeight;
                    f2 = LivePublicScreenUiConfigAudienceContentShadowSetting.INSTANCE.getValue().shadowX;
                    f3 = LivePublicScreenUiConfigAudienceContentShadowSetting.INSTANCE.getValue().shadowY;
                }
                simpleLiveTextView.setShadowLayer(C497740JfY.LIZIZ(f), C497740JfY.LIZIZ(f2), C497740JfY.LIZIZ(f3), color);
                return;
            }
            simpleLiveTextView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    public static void LIZLLL(TextView textView, boolean z, boolean z2, boolean z3) {
        PublicScreenShadowConfig value;
        PublicScreenShadowConfig value2;
        float f;
        float f2;
        if (z2) {
            if (z3) {
                if (z) {
                    value = LivePublicScreenUiConfigAnchorNameShadowSetting.INSTANCE.getValue();
                } else {
                    value = LivePublicScreenUiConfigAudienceNameShadowSetting.INSTANCE.getValue();
                }
                String str = value.shadowColor;
                int color = LIZ;
                if (color <= 0) {
                    try {
                        color = Color.parseColor(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        color = ColorProtector.parseColor("#33000000");
                    }
                }
                LIZ = color;
                if (z) {
                    value2 = LivePublicScreenUiConfigAnchorNameShadowSetting.INSTANCE.getValue();
                } else {
                    value2 = LivePublicScreenUiConfigAudienceNameShadowSetting.INSTANCE.getValue();
                }
                float f3 = value2.shadowHeight;
                if (z) {
                    f = LivePublicScreenUiConfigAnchorNameShadowSetting.INSTANCE.getValue().shadowX;
                    f2 = LivePublicScreenUiConfigAnchorNameShadowSetting.INSTANCE.getValue().shadowY;
                } else {
                    f = LivePublicScreenUiConfigAudienceNameShadowSetting.INSTANCE.getValue().shadowX;
                    f2 = LivePublicScreenUiConfigAudienceNameShadowSetting.INSTANCE.getValue().shadowY;
                }
                textView.setShadowLayer(C497740JfY.LIZIZ(f3), C497740JfY.LIZIZ(f), C497740JfY.LIZIZ(f2), color);
                return;
            }
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }
}
