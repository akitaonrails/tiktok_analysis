package X;

import android.graphics.Color;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeBackground;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.FontStyle;
import com.bytedance.android.live.base.model.user.PaddingInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Kc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521090Kc7 {
    /* JADX WARN: Removed duplicated region for block: B:40:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C521150KcD LIZ(boolean r10, com.bytedance.android.live.base.model.user.BadgeStruct r11) {
        /*
            r9 = 0
            if (r10 == 0) goto L4c
            com.bytedance.android.live.base.model.user.CombineBadgeStruct r1 = r11.combineBadgeStruct
            if (r1 == 0) goto L4c
            com.bytedance.android.live.base.model.user.CombineBadgeBackground r0 = r1.backgroundDarkMode
            if (r0 == 0) goto L4c
            if (r1 == 0) goto L53
            com.bytedance.android.live.base.model.user.CombineBadgeBackground r2 = r1.backgroundDarkMode
        Lf:
            X.0KcD r3 = new X.0KcD
            com.bytedance.android.live.base.model.user.CombineBadgeStruct r0 = r11.combineBadgeStruct
            if (r0 == 0) goto L4a
            com.bytedance.android.live.base.model.ImageModel r4 = r0.icon
        L17:
            X.00jV r1 = X.C160700jV.LIZ
            if (r0 == 0) goto L48
            com.bytedance.android.live.base.model.user.BadgeText r0 = r0.text
        L1d:
            r1.getClass()
            java.lang.CharSequence r5 = X.C160700jV.LIZ(r0)
            com.bytedance.android.live.base.model.user.CombineBadgeStruct r1 = r11.combineBadgeStruct
            if (r1 == 0) goto L46
            java.lang.String r6 = r1.str
        L2a:
            if (r2 == 0) goto L44
            com.bytedance.android.live.base.model.ImageModel r7 = r2.image
        L2e:
            if (r1 == 0) goto L40
            com.bytedance.android.live.base.model.user.ArrowConfig r0 = r1.arrowConfig
            if (r0 == 0) goto L40
            com.bytedance.android.live.base.model.ImageModel r8 = r0.icon
        L36:
            com.bytedance.android.live.base.model.user.CombineBadgeBackground r0 = r1.background
            if (r0 == 0) goto L3c
            com.bytedance.android.live.base.model.user.StretchableBackgroundImage r9 = r0.stretchableBackgroundImage
        L3c:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L40:
            r8 = r9
            if (r1 == 0) goto L3c
            goto L36
        L44:
            r7 = r9
            goto L2e
        L46:
            r6 = r9
            goto L2a
        L48:
            r0 = r9
            goto L1d
        L4a:
            r4 = r9
            goto L17
        L4c:
            com.bytedance.android.live.base.model.user.CombineBadgeStruct r0 = r11.combineBadgeStruct
            if (r0 == 0) goto L53
            com.bytedance.android.live.base.model.user.CombineBadgeBackground r2 = r0.background
            goto Lf
        L53:
            r2 = r9
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C521090Kc7.LIZ(boolean, com.bytedance.android.live.base.model.user.BadgeStruct):X.0KcD");
    }

    public static int LIZLLL(C521090Kc7 c521090Kc7, Integer num) {
        int iIntValue;
        c521090Kc7.getClass();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return (int) C497740JfY.LIZIZ(iIntValue);
    }

    public static float LJ(int i, boolean z) {
        float fLJFF;
        int iLJIIIZ;
        if (i != 1) {
            if (i != 3 && i != 10) {
                return 1.0f;
            }
            fLJFF = C497740JfY.LJIIIZ(R.dimen.ang);
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.f617avg);
        } else {
            fLJFF = C1152540g68.LJFF(z);
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.f617avg);
        }
        return fLJFF / iLJIIIZ;
    }

    public static int LJFF(int i, BadgeStruct badgeStruct) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        switch (i) {
            case 0:
                CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
                if (combineBadgeStruct == null || (num8 = combineBadgeStruct.personalCardShowStyle) == null) {
                    return 0;
                }
                return num8.intValue();
            case 1:
            case BdTuring.TYPE_ECAF /* 9 */:
                CombineBadgeStruct combineBadgeStruct2 = badgeStruct.combineBadgeStruct;
                if (combineBadgeStruct2 == null || (num7 = combineBadgeStruct2.publicScreenShowStyle) == null) {
                    return 0;
                }
                return num7.intValue();
            case 2:
            case 5:
            default:
                return 0;
            case 3:
                CombineBadgeStruct combineBadgeStruct3 = badgeStruct.combineBadgeStruct;
                if (combineBadgeStruct3 == null || (num6 = combineBadgeStruct3.publicScreenShowStyle) == null) {
                    return 0;
                }
                return num6.intValue();
            case 4:
                CombineBadgeStruct combineBadgeStruct4 = badgeStruct.combineBadgeStruct;
                if (combineBadgeStruct4 == null || (num5 = combineBadgeStruct4.rankListOnlineAudienceShowStyle) == null) {
                    return 0;
                }
                return num5.intValue();
            case 6:
                CombineBadgeStruct combineBadgeStruct5 = badgeStruct.combineBadgeStruct;
                if (combineBadgeStruct5 == null || (num4 = combineBadgeStruct5.publicScreenShowStyle) == null) {
                    return 0;
                }
                return num4.intValue();
            case 7:
                CombineBadgeStruct combineBadgeStruct6 = badgeStruct.combineBadgeStruct;
                if (combineBadgeStruct6 == null || (num3 = combineBadgeStruct6.personalCardShowStyle) == null) {
                    return 0;
                }
                return num3.intValue();
            case 8:
                CombineBadgeStruct combineBadgeStruct7 = badgeStruct.combineBadgeStruct;
                if (combineBadgeStruct7 == null || (num2 = combineBadgeStruct7.publicScreenShowStyle) == null) {
                    return 0;
                }
                return num2.intValue();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                CombineBadgeStruct combineBadgeStruct8 = badgeStruct.combineBadgeStruct;
                if (combineBadgeStruct8 == null || (num = combineBadgeStruct8.publicScreenShowStyle) == null) {
                    return 0;
                }
                return num.intValue();
        }
    }

    public static void LJI(C521100Kc8 c521100Kc8, CombineBadgeStruct combineBadgeStruct) {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        PaddingInfo paddingInfo;
        Integer numValueOf;
        Integer numValueOf2;
        int i3;
        Integer numValueOf3;
        CombineBadgeBackground combineBadgeBackground;
        CombineBadgeBackground combineBadgeBackground2;
        FontStyle fontStyle;
        FontStyle fontStyle2;
        FontStyle fontStyle3;
        if (combineBadgeStruct != null && (fontStyle3 = combineBadgeStruct.fontStyle) != null) {
            i = fontStyle3.fontSize;
        } else {
            i = c521100Kc8.LJIJ;
        }
        c521100Kc8.LJIJ = i;
        if (combineBadgeStruct != null && (fontStyle2 = combineBadgeStruct.fontStyle) != null) {
            i2 = fontStyle2.fontWidth;
        } else {
            i2 = c521100Kc8.LJIJI;
        }
        c521100Kc8.LJIJI = i2;
        C521090Kc7 c521090Kc7 = C521100Kc8.LJJIIJ;
        Integer numValueOf4 = null;
        if (combineBadgeStruct != null && (fontStyle = combineBadgeStruct.fontStyle) != null) {
            str = fontStyle.fontColor;
        } else {
            str = null;
        }
        c521100Kc8.LJIJJ = LJII(c521100Kc8.LJIJJ, str);
        if (combineBadgeStruct != null && (combineBadgeBackground2 = combineBadgeStruct.background) != null) {
            str2 = combineBadgeBackground2.backgroundColorCode;
        } else {
            str2 = null;
        }
        c521100Kc8.LJIL = LJII(c521100Kc8.LJIL, str2);
        if (combineBadgeStruct != null && (combineBadgeBackground = combineBadgeStruct.background) != null) {
            str3 = combineBadgeBackground.borderColorCode;
        } else {
            str3 = null;
        }
        c521100Kc8.LJJ = LJII(c521100Kc8.LJJ, str3);
        if (combineBadgeStruct != null && (paddingInfo = combineBadgeStruct.paddingNewFont) != null && paddingInfo.useSpecific) {
            PaddingInfo paddingInfo2 = combineBadgeStruct.paddingNewFont;
            if (paddingInfo2 != null && paddingInfo2.horizontalPaddingRule == 0) {
                c521100Kc8.LJIIZILJ = paddingInfo2.useSpecific;
                if (paddingInfo2 != null) {
                    i3 = paddingInfo2.badgeWidth;
                } else {
                    i3 = 0;
                }
                c521100Kc8.LJIILL = (int) C497740JfY.LIZIZ(i3 * LJ(c521100Kc8.LJIILJJIL, c521100Kc8.LJJII));
                PaddingInfo paddingInfo3 = combineBadgeStruct.paddingNewFont;
                if (paddingInfo3 != null) {
                    numValueOf3 = Integer.valueOf(paddingInfo3.middlePadding);
                } else {
                    numValueOf3 = null;
                }
                c521100Kc8.LJIILLIIL = LIZLLL(c521090Kc7, numValueOf3);
            }
            PaddingInfo paddingInfo4 = combineBadgeStruct.paddingNewFont;
            if (paddingInfo4 != null && paddingInfo4.horizontalPaddingRule == 1) {
                c521100Kc8.LJIILLIIL = LIZLLL(c521090Kc7, Integer.valueOf(paddingInfo4.middlePadding));
                PaddingInfo paddingInfo5 = combineBadgeStruct.paddingNewFont;
                if (paddingInfo5 != null) {
                    numValueOf = Integer.valueOf(paddingInfo5.leftPadding);
                } else {
                    numValueOf = null;
                }
                c521100Kc8.LJIIIZ = LIZLLL(c521090Kc7, numValueOf);
                PaddingInfo paddingInfo6 = combineBadgeStruct.paddingNewFont;
                if (paddingInfo6 != null) {
                    numValueOf2 = Integer.valueOf(paddingInfo6.rightPadding);
                } else {
                    numValueOf2 = null;
                }
                c521100Kc8.LJIIJ = LIZLLL(c521090Kc7, numValueOf2);
            }
            PaddingInfo paddingInfo7 = combineBadgeStruct.paddingNewFont;
            if (paddingInfo7 != null && paddingInfo7.verticalPaddingRule == 1) {
                c521100Kc8.LJIIJJI = LIZLLL(c521090Kc7, Integer.valueOf(paddingInfo7.iconTopPadding));
                PaddingInfo paddingInfo8 = combineBadgeStruct.paddingNewFont;
                if (paddingInfo8 != null) {
                    numValueOf4 = Integer.valueOf(paddingInfo8.iconBottomPadding);
                }
                c521100Kc8.LJIIL = LIZLLL(c521090Kc7, numValueOf4);
            }
        }
    }

    public static int LJII(int i, String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    i = Color.parseColor(str);
                    return i;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return i;
    }

    public final C521100Kc8 LIZIZ(String str, int i, int i2, boolean z, boolean z2, boolean z3, C521100Kc8 c521100Kc8, boolean z4, C521150KcD c521150KcD, boolean z5, boolean z6, List<Long> list, boolean z7, boolean z8) {
        int iLJIIIZ;
        int iLJIIIZ2;
        int iLJIIIZ3;
        int iLJIIIZ4;
        int iLJIIIZ5;
        int iLJIIIZ6;
        int iLJIIIZ7;
        int iLJFF;
        int iLJFF2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        C521100Kc8 c521100Kc82;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int iLIZLLL = LIZLLL(this, 4);
        int i3 = R.dimen.ang;
        switch (i) {
            case 0:
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.sl);
                iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.sv);
                iLJIIIZ4 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ5 = C497740JfY.LJIIIZ(R.dimen.sv);
                iLJIIIZ6 = C497740JfY.LJIIIZ(R.dimen.sv);
                iLJIIIZ2 = 0;
                iLJFF2 = 0;
                iLJFF = -1;
                iLJIIIZ7 = 0;
                break;
            case 1:
                iLJIIIZ = C1152540g68.LJFF(z7);
                if (z3) {
                    iLJIIIZ2 = 0;
                } else {
                    iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.avh);
                }
                iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ4 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ5 = 0;
                iLJIIIZ6 = 0;
                iLJFF2 = 0;
                iLJFF = -1;
                iLJIIIZ7 = 0;
                break;
            case 2:
            case 5:
            default:
                iLJIIIZ2 = 0;
                iLJIIIZ3 = 0;
                iLJIIIZ5 = 0;
                iLJIIIZ6 = 0;
                iLJIIIZ = 0;
                iLJIIIZ4 = 0;
                iLJFF2 = 0;
                iLJFF = -1;
                iLJIIIZ7 = 0;
                break;
            case 3:
                if (z6) {
                    i3 = R.dimen.f617avg;
                }
                iLJIIIZ = C497740JfY.LJIIIZ(i3);
                if (z3) {
                    iLJIIIZ2 = 0;
                } else {
                    iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.avh);
                }
                iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ4 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ5 = 0;
                iLJIIIZ6 = 0;
                iLJFF2 = 0;
                iLJFF = -1;
                iLJIIIZ7 = 0;
                break;
            case 4:
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.sc);
                iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.sz);
                iLJIIIZ4 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ5 = C497740JfY.LJIIIZ(R.dimen.sj);
                iLJIIIZ6 = C497740JfY.LJIIIZ(R.dimen.sj);
                iLJIIIZ2 = 0;
                iLJFF2 = 0;
                iLJFF = -1;
                iLJIIIZ7 = 0;
                break;
            case 6:
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.sc);
                if (z3) {
                    iLJIIIZ2 = 0;
                } else {
                    iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.avh);
                }
                iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ4 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ5 = 0;
                iLJIIIZ6 = 0;
                iLJFF2 = 0;
                iLJFF = -1;
                iLJIIIZ7 = 0;
                break;
            case 7:
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.sh);
                iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.sz);
                iLJIIIZ4 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ5 = C497740JfY.LJIIIZ(R.dimen.sv);
                iLJIIIZ6 = C497740JfY.LJIIIZ(R.dimen.sv);
                iLJIIIZ7 = C497740JfY.LJIIIZ(R.dimen.aut);
                iLJFF = C497740JfY.LJFF(R.color.dj);
                iLJFF2 = C497740JfY.LJFF(R.color.aj);
                iLJIIIZ2 = 0;
                break;
            case 8:
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.sb);
                if (z3) {
                    iLJIIIZ2 = 0;
                } else {
                    iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.avh);
                }
                iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ4 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ5 = 0;
                iLJIIIZ6 = 0;
                iLJFF2 = 0;
                iLJFF = -1;
                iLJIIIZ7 = 0;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.sc);
                if (z3) {
                    iLJIIIZ2 = 0;
                } else {
                    iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.avh);
                }
                iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ4 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ5 = 0;
                iLJIIIZ6 = 0;
                iLJFF2 = 0;
                iLJFF = -1;
                iLJIIIZ7 = 0;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ang);
                if (z3) {
                    iLJIIIZ2 = 0;
                } else {
                    iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.avh);
                }
                iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ4 = C497740JfY.LJIIIZ(R.dimen.sr);
                iLJIIIZ5 = 0;
                iLJIIIZ6 = 0;
                iLJFF2 = 0;
                iLJFF = -1;
                iLJIIIZ7 = 0;
                break;
        }
        boolean z18 = true;
        if (c521150KcD.LIZ != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z19 = !z10;
        if (c521100Kc8 != null) {
            if (z9 && (i2 & 8) == 8) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i2 & 2) == 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z19 && (i2 & 1) == 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i2 & 4) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            c521100Kc82 = new C521100Kc8(z14, z15, z16, z17, z, z2, z4, c521100Kc8.LJII, c521100Kc8.LJIIIIZZ, c521100Kc8.LJIIIZ, c521100Kc8.LJIIJ, c521100Kc8.LJIIJJI, c521100Kc8.LJIIL, c521100Kc8.LJIILIIL, c521100Kc8.LJIILJJIL, c521100Kc8.LJIILL, c521100Kc8.LJIILLIIL, c521100Kc8.LJIIZILJ, c521100Kc8.LJIJ, c521100Kc8.LJIJI, c521100Kc8.LJIJJ, c521100Kc8.LJIJJLI, c521100Kc8.LJIL, c521100Kc8.LJJ, c521100Kc8.LJJI, c521100Kc8.LJJIFFI, c521100Kc8.LJJII, z8);
        } else {
            if (z9 && (i2 & 8) == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i2 & 2) == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z19 && (i2 & 1) == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i2 & 4) != 4) {
                z18 = false;
            }
            c521100Kc82 = new C521100Kc8(z11, z12, z13, z18, z, z2, z4, iLJIIIZ2, iLJIIIZ7, iLJIIIZ3, iLIZLLL, iLJIIIZ5, iLJIIIZ6, iLJIIIZ, i, iLJIIIZ4, iLJFF, iLJFF2, list, z6, z7, z8, 2260992);
        }
        c521100Kc82.LJIJJLI = z5;
        c521100Kc82.LJIILJJIL = i;
        c521100Kc82.LJJIFFI = z6;
        c521100Kc82.LJJI = list;
        return c521100Kc82;
    }
}
