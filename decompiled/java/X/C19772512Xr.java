package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.experiment.thought.StoryNoteMvpBackgroundOklchSettings;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageFragment;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageTransitionFragment;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerColor;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19772512Xr extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

    public static final void onFailed$3(C19772512Xr c19772512Xr, Throwable th) {
    }

    public static final void onFailed$6(C19772512Xr c19772512Xr, Throwable th) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            case 2:
                LIZ$2(this, bitmap);
                break;
            case 3:
                LIZ$3(this, bitmap);
                break;
            case 4:
                LIZ$4(this, bitmap);
                break;
            case 5:
                LIZ$5(this, bitmap);
                break;
            case 6:
                LIZ$6(this, bitmap);
                break;
            case 7:
                LIZ$7(this, bitmap);
                break;
            case 8:
                LIZ$8(this, bitmap);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, bitmap);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            case 2:
                onFailed$2(this, th);
                break;
            case 3:
                onFailed$3(this, th);
                break;
            case 4:
                onFailed$4(this, th);
                break;
            case 5:
                onFailed$5(this, th);
                break;
            case 6:
                onFailed$6(this, th);
                break;
            case 7:
                onFailed$7(this, th);
                break;
            case 8:
                onFailed$8(this, th);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onFailed$9(this, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onFailed$10(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public C19772512Xr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C19772512Xr c19772512Xr, Bitmap bitmap) {
        TakoImageFragment takoImageFragment = (TakoImageFragment) c19772512Xr.l0;
        takoImageFragment.getClass();
        if (bitmap != null) {
            try {
                Context context = takoImageFragment.getContext();
                if (context != null) {
                    C19HU c19hu = takoImageFragment.LLIZLLLIL;
                    if (c19hu != null) {
                        c19hu.setImageDrawable(new BitmapDrawable(context.getResources(), bitmap));
                    }
                    if (takoImageFragment.LLJILJIL != null) {
                        ImageView imageView = takoImageFragment.LLJ;
                        if (imageView != null) {
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                            imageView.setBackground(c384050F3z.LIZ(context));
                        }
                        ImageView imageView2 = takoImageFragment.LLJ;
                        if (imageView2 != null) {
                            imageView2.setImageBitmap(bitmap);
                        }
                        ImageView imageView3 = takoImageFragment.LLJ;
                        if (imageView3 != null) {
                            imageView3.setClipToOutline(true);
                        }
                        C19EG activity = takoImageFragment.getActivity();
                        if (activity != null) {
                            activity.startPostponedEnterTransition();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((TakoImageFragment) c19772512Xr.l0).SR();
    }

    public static final void LIZ$1(C19772512Xr c19772512Xr, Bitmap bitmap) {
        TakoImageTransitionFragment takoImageTransitionFragment = (TakoImageTransitionFragment) c19772512Xr.l0;
        takoImageTransitionFragment.getClass();
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Context context = takoImageTransitionFragment.getContext();
                if (context != null) {
                    C19HU c19hu = takoImageTransitionFragment.LLIZLLLIL;
                    if (c19hu != null) {
                        c19hu.setImageDrawable(new BitmapDrawable(context.getResources(), bitmap));
                    }
                    ImageView imageView = takoImageTransitionFragment.LLJ;
                    if (imageView != null) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                        imageView.setBackground(c384050F3z.LIZ(context));
                    }
                    ImageView imageView2 = takoImageTransitionFragment.LLJ;
                    if (imageView2 != null) {
                        imageView2.setImageBitmap(bitmap);
                    }
                    ImageView imageView3 = takoImageTransitionFragment.LLJ;
                    if (imageView3 != null) {
                        imageView3.setClipToOutline(true);
                    }
                    C19EG activity = takoImageTransitionFragment.getActivity();
                    if (activity != null) {
                        activity.startPostponedEnterTransition();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ((TakoImageTransitionFragment) c19772512Xr.l0).SR();
            }
        } else {
            ((TakoImageTransitionFragment) c19772512Xr.l0).SR();
        }
        ((TakoImageTransitionFragment) c19772512Xr.l0).LLJJI = bitmap;
    }

    public static final void LIZ$10(C19772512Xr c19772512Xr, Bitmap bitmap) {
        C19601511mX c19601511mX;
        int i;
        if (bitmap != null && (c19601511mX = (C19601511mX) ((C19599711mF) c19772512Xr.l0).LLJI.getValue()) != null) {
            long j = c19601511mX.LJII;
            long j2 = c19601511mX.LJI;
            if (1 <= j2 && j2 <= j) {
                if (Intrinsics.LJFF(c19601511mX.LJIIJJI, bitmap)) {
                    int i2 = c19601511mX.LJIIL + 1;
                    c19601511mX.LJIIL = i2;
                    if (i2 <= 5) {
                        i = 3;
                    } else {
                        i = 5;
                    }
                } else {
                    c19601511mX.LJIIJJI = bitmap;
                    c19601511mX.LJIIL = 1;
                    i = 16;
                }
                ArrayList arrayListLJI = c19601511mX.LJI(c19601511mX.LJI, bitmap, i, false);
                synchronized (c19601511mX.LIZJ()) {
                    try {
                        c19601511mX.LIZJ().addAll(arrayListLJI);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            c19601511mX.LJIIJJI = bitmap;
            c19601511mX.LJIIL = 1;
            c19601511mX.LJII = 0L;
            c19601511mX.LJFF(c19601511mX.LJI(0L, bitmap, 16, true));
        }
    }

    public static final void LIZ$2(C19772512Xr c19772512Xr, Bitmap bitmap) {
        Function1 function1 = (Function1) c19772512Xr.l0;
        if (function1 != null) {
            function1.invoke(bitmap);
        }
    }

    public static final void LIZ$3(C19772512Xr c19772512Xr, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        ((TuxIconView) c19772512Xr.l0).setBackground(null);
        ((TuxIconView) c19772512Xr.l0).setBackgroundDrawable(bitmapDrawable);
        if (C19339610lO.LIZ().largeIconHeight.length() != 0 && C19339610lO.LIZ().largeIconWidth.length() != 0) {
            Integer numValueOf = CastIntegerProtector.valueOf(C19339610lO.LIZ().largeIconHeight);
            Integer numValueOf2 = CastIntegerProtector.valueOf(C19339610lO.LIZ().largeIconWidth);
            TuxIconView tuxIconView = (TuxIconView) c19772512Xr.l0;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numValueOf2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numValueOf)));
            layoutParams.gravity = 17;
            if (C19339610lO.LIZ().spaceBetweenTextIcon.length() != 0) {
                layoutParams.setMargins(0, 0, CastIntegerProtector.valueOf(C19339610lO.LIZ().spaceBetweenTextIcon).intValue(), 0);
            }
            C786410Ut5.M6(tuxIconView, layoutParams);
        }
    }

    public static final void LIZ$4(C19772512Xr c19772512Xr, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        ((TuxIconView) c19772512Xr.l0).setBackground(null);
        ((TuxIconView) c19772512Xr.l0).setBackgroundDrawable(bitmapDrawable);
        if (C19339610lO.LIZ().middleIconHeight.length() != 0 && C19339610lO.LIZ().middleIconWidth.length() != 0) {
            Integer numValueOf = CastIntegerProtector.valueOf(C19339610lO.LIZ().middleIconHeight);
            Integer numValueOf2 = CastIntegerProtector.valueOf(C19339610lO.LIZ().middleIconWidth);
            TuxIconView tuxIconView = (TuxIconView) c19772512Xr.l0;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numValueOf2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numValueOf)));
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            C786410Ut5.M6(tuxIconView, layoutParams);
        }
    }

    public static final void LIZ$5(C19772512Xr c19772512Xr, Bitmap bitmap) {
        int iIntValue;
        GradientDrawable gradientDrawable;
        if (bitmap == null) {
            return;
        }
        C19615711op c19615711op = (C19615711op) c19772512Xr.l0;
        c19615711op.getClass();
        FlyMainColor flyMainColor = FlyMainColor.LIZ;
        Drawable background = null;
        C204674156y c204674156yLIZ = flyMainColor.LIZ(new C2439109h7(bitmap, null));
        c204674156yLIZ.LJFF(8.0f);
        c204674156yLIZ.LJ(0.0f, 0.12f, 0.3f, 0.6f, 0.0f);
        c204674156yLIZ.LJI(8.0f);
        float[] fArr = new float[3];
        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = -16777216;
        }
        Color.colorToHSV(iIntValue, fArr);
        Integer numValueOf = Integer.valueOf(Color.HSVToColor(new float[]{fArr[0], fArr[1], 0.3f}));
        C204674156y c204674156yLIZ2 = flyMainColor.LIZ(new C2439109h7(bitmap, null));
        c204674156yLIZ2.LJFF(50.0f);
        c204674156yLIZ2.LJ(0.0f, 0.1f, 0.8f, 1.0f, 0.0f);
        Integer numLIZIZ2 = c204674156yLIZ2.LIZIZ();
        if (numLIZIZ2 == null) {
            numLIZIZ2 = numValueOf;
        }
        MusicStickerColor musicStickerColor = new MusicStickerColor(numValueOf, numLIZIZ2);
        Integer num = musicStickerColor.cardBgColor;
        if (num != null) {
            int iIntValue2 = num.intValue();
            View view = c19615711op.LLJILJIL;
            if (view != null) {
                background = view.getBackground();
            }
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setColor(iIntValue2);
                View view2 = c19615711op.LLJILJIL;
                if (view2 != null) {
                    view2.setBackground(gradientDrawable);
                }
            }
        }
        Integer num2 = musicStickerColor.waveColor;
        if (num2 != null) {
            final int iIntValue3 = num2.intValue();
            C1295960jpS c1295960jpS = c19615711op.LLJIJIL;
            if (c1295960jpS != null) {
                c1295960jpS.addValueCallback(new C1295090jo3("**"), InterfaceC1295080jo2.LJJIJL, (InterfaceC1296040jpa<ColorFilter>) new InterfaceC1296040jpa() { // from class: X.0yLn
                    @Override // X.InterfaceC1296040jpa
                    public final Object LIZ(C1295570jop c1295570jop) {
                        return new PorterDuffColorFilter(iIntValue3, PorterDuff.Mode.SRC_ATOP);
                    }
                });
            }
        }
        ImageView cover = ((C19615711op) c19772512Xr.l0).getCover();
        if (cover != null) {
            cover.setImageBitmap(bitmap);
        }
    }

    public static final void LIZ$6(C19772512Xr c19772512Xr, Bitmap bitmap) {
        C19601311mV c19601311mV;
        SeekBar seekBar;
        if (bitmap != null && (seekBar = (c19601311mV = (C19601311mV) c19772512Xr.l0).LJIJI) != null) {
            c19601311mV.LJIL.getValue().getClass();
            seekBar.setThumb(C423380Giu.LIZIZ(bitmap));
        }
    }

    public static final void LIZ$7(C19772512Xr c19772512Xr, Bitmap bitmap) {
        ((Function1) c19772512Xr.l0).invoke(bitmap);
    }

    public static final void LIZ$8(C19772512Xr c19772512Xr, Bitmap bitmap) {
        ((Function1) c19772512Xr.l0).invoke(bitmap);
    }

    public static final void LIZ$9(C19772512Xr c19772512Xr, Bitmap bitmap) {
        int iIntValue;
        C12BU c12buLIZ;
        C12BU c12buLIZ2;
        C12BU c12buLIZ3;
        if (bitmap == null) {
            ((InterfaceC1631620sYq) c19772512Xr.l0).invoke(null, null, null);
            return;
        }
        C11GZ.LIZ.getClass();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        StoryNoteMvpBackgroundOklchSettings.BackgroundOklchModel backgroundOklchModel = StoryNoteMvpBackgroundOklchSettings.LIZ;
        StoryNoteMvpBackgroundOklchSettings.BackgroundOklchModel backgroundOklchModel2 = (StoryNoteMvpBackgroundOklchSettings.BackgroundOklchModel) settingsManagerLIZLLL.LJIIIIZZ("story_note_mvp_background_oklch", StoryNoteMvpBackgroundOklchSettings.BackgroundOklchModel.class, backgroundOklchModel);
        if (backgroundOklchModel2 != null) {
            backgroundOklchModel = backgroundOklchModel2;
        }
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, new Rect(bitmap.getWidth() / 8, bitmap.getHeight() / 8, (bitmap.getWidth() / 8) * 7, (bitmap.getHeight() / 8) * 7)));
        c204674156yLIZ.LJI(0.0f);
        c204674156yLIZ.LJFF(40.0f);
        c204674156yLIZ.LJ(0.0f, 0.4f, 0.8f, 1.0f, 0.0f);
        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = -16777216;
        }
        double[] dArr = {C19376710rN.LIZ(Color.red(iIntValue)), C19376710rN.LIZ(Color.green(iIntValue)), C19376710rN.LIZ(Color.blue(iIntValue))};
        double[][] dArr2 = {new double[]{0.4123907992659595d, 0.35758433938387796d, 0.1804807884018343d}, new double[]{0.21263900587151036d, 0.7151686787677559d, 0.07219231536073371d}, new double[]{0.01933081871559185d, 0.11919477979462599d, 0.9505321522496606d}};
        double[] dArr3 = {0.0d, 0.0d, 0.0d};
        int i = 0;
        do {
            int i2 = 0;
            do {
                dArr3[i] = dArr3[i] + (dArr2[i][i2] * dArr[i2]);
                i2++;
            } while (i2 < 3);
            i++;
        } while (i < 3);
        double[] dArr4 = {dArr3[0], dArr3[1], dArr3[2]};
        double[][] dArr5 = {new double[]{0.819022437996703d, 0.3619062600528904d, -0.1288737815209879d}, new double[]{0.0329836539323885d, 0.9292868615863434d, 0.0361446663506424d}, new double[]{0.0481771893596242d, 0.2642395317527308d, 0.6335478284694309d}};
        double[][] dArr6 = {new double[]{0.210454268309314d, 0.7936177747023054d, -0.0040720430116193d}, new double[]{1.9779985324311684d, -2.42859224204858d, 0.450593709617411d}, new double[]{0.0259040424655478d, 0.7827717124575296d, -0.8086757549230774d}};
        double[] dArr7 = {0.0d, 0.0d, 0.0d};
        int i3 = 0;
        do {
            int i4 = 0;
            do {
                dArr7[i3] = dArr7[i3] + (dArr5[i3][i4] * dArr4[i4]);
                i4++;
            } while (i4 < 3);
            i3++;
        } while (i3 < 3);
        ArrayList arrayList = new ArrayList(3);
        int i5 = 0;
        do {
            arrayList.add(Double.valueOf(Math.pow(dArr7[i5], 0.3333333333333333d)));
            i5++;
        } while (i5 < 3);
        double[] dArrLLFZ = C13LP.LLFZ(arrayList);
        double[] dArr8 = {0.0d, 0.0d, 0.0d};
        int i6 = 0;
        do {
            int i7 = 0;
            do {
                dArr8[i6] = dArr8[i6] + (dArr6[i6][i7] * dArrLLFZ[i7]);
                i7++;
            } while (i7 < 3);
            i6++;
        } while (i6 < 3);
        double d = dArr8[0];
        double d2 = dArr8[1];
        double d3 = dArr8[2];
        double dAtan2 = (Math.atan2(d3, d2) * ((double) 180)) / 3.141592653589793d;
        double dSqrt = Math.sqrt((d2 * d2) + (d3 * d3));
        if (dAtan2 < 0.0d) {
            dAtan2 += (double) 360;
        }
        C12BU c12bu = new C12BU(d, dSqrt, dAtan2);
        if (d < backgroundOklchModel.brightLightness * 100.0f) {
            c12buLIZ = C12BV.LIZ(d + (((double) backgroundOklchModel.lightnessShift) * 100.0d), c12bu.LIZIZ, c12bu.LIZJ);
        } else if (d <= backgroundOklchModel.whiteLightness * 100.0f) {
            c12buLIZ = C12BV.LIZ(c12bu.LIZ, c12bu.LIZIZ, c12bu.LIZJ);
        } else {
            StoryNoteMvpBackgroundOklchSettings.GrayOklch grayOklch = backgroundOklchModel.grayOklch1;
            c12buLIZ = C12BV.LIZ(grayOklch.l, grayOklch.c, grayOklch.h);
        }
        if (d < backgroundOklchModel.brightLightness * 100.0f) {
            c12buLIZ2 = C12BV.LIZ(d + (((double) backgroundOklchModel.lightnessShift) * 100.0d), c12bu.LIZIZ, dAtan2 + ((double) backgroundOklchModel.hueShift));
        } else if (d <= backgroundOklchModel.whiteLightness * 100.0f) {
            c12buLIZ2 = C12BV.LIZ(c12bu.LIZ, c12bu.LIZIZ, dAtan2 + ((double) backgroundOklchModel.hueShift));
        } else {
            StoryNoteMvpBackgroundOklchSettings.GrayOklch grayOklch2 = backgroundOklchModel.grayOklch2;
            c12buLIZ2 = C12BV.LIZ(grayOklch2.l, grayOklch2.c, grayOklch2.h);
        }
        if (d > backgroundOklchModel.whiteLightness * 100.0f) {
            StoryNoteMvpBackgroundOklchSettings.GrayOklch grayOklch3 = backgroundOklchModel.grayOklch3;
            c12buLIZ3 = C12BV.LIZ(grayOklch3.l, grayOklch3.c, grayOklch3.h);
        } else if (dSqrt <= ((double) backgroundOklchModel.grayChroma) * 100.0d) {
            c12buLIZ3 = C12BV.LIZ(d + (((double) backgroundOklchModel.lightnessShift) * 100.0d), c12bu.LIZIZ, c12bu.LIZJ);
        } else {
            double d4 = ((double) backgroundOklchModel.minChromaIfNotGray) * 100.0d;
            if (dSqrt >= d4) {
                c12buLIZ3 = C12BV.LIZ(d + (((double) backgroundOklchModel.lightnessShift) * 100.0d), c12bu.LIZIZ, dAtan2 + ((double) backgroundOklchModel.hueShift));
            } else {
                c12buLIZ3 = C12BV.LIZ(c12bu.LIZ, d4, dAtan2 + ((double) backgroundOklchModel.hueShift));
            }
        }
        C12BU c12buLIZ4 = C12BV.LIZ(d + ((double) 10.0f), c12bu.LIZIZ, c12bu.LIZJ);
        C12BU[] c12buArr = {c12bu, c12buLIZ, c12buLIZ2, c12buLIZ3};
        ArrayList arrayList2 = new ArrayList(4);
        int i8 = 0;
        do {
            arrayList2.add(Integer.valueOf(C12BV.LIZJ(c12buArr[i8])));
            i8++;
        } while (i8 < 4);
        Pair pair = new Pair(new C415650GRn(new float[]{0.0f, 0.6f, 0.8f, 1.0f}, C13LP.LLII(arrayList2)), Integer.valueOf(C12BV.LIZJ(c12buLIZ4)));
        ((InterfaceC1631620sYq) c19772512Xr.l0).invoke(pair.getFirst(), null, Integer.valueOf(((Number) pair.getSecond()).intValue()));
    }

    public static final void onFailed$0(C19772512Xr c19772512Xr, Throwable th) {
        ((TakoImageFragment) c19772512Xr.l0).SR();
    }

    public static final void onFailed$1(C19772512Xr c19772512Xr, Throwable th) {
        ((TakoImageTransitionFragment) c19772512Xr.l0).SR();
    }

    public static final void onFailed$10(C19772512Xr c19772512Xr, Throwable th) {
        ((C1910890zpH) ((C19599711mF) c19772512Xr.l0).LLJIJIL.getValue()).LIZ("SocialAvatarStickerClickListener", "Animation bitmap load fail");
    }

    public static final void onFailed$2(C19772512Xr c19772512Xr, Throwable th) {
        Function1 function1 = (Function1) c19772512Xr.l0;
        if (function1 != null) {
            function1.invoke(null);
        }
    }

    public static final void onFailed$4(C19772512Xr c19772512Xr, Throwable th) {
        TuxIconView tuxIconView = (TuxIconView) c19772512Xr.l0;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_effect_house;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public static final void onFailed$5(C19772512Xr c19772512Xr, Throwable th) {
        ImageView cover = ((C19615711op) c19772512Xr.l0).getCover();
        if (cover != null) {
            cover.setImageResource(R.drawable.coy);
        }
    }

    public static final void onFailed$7(C19772512Xr c19772512Xr, Throwable th) {
        ((Function1) c19772512Xr.l0).invoke(null);
    }

    public static final void onFailed$8(C19772512Xr c19772512Xr, Throwable th) {
        ((Function1) c19772512Xr.l0).invoke(null);
    }

    public static final void onFailed$9(C19772512Xr c19772512Xr, Throwable th) {
        ((InterfaceC1631620sYq) c19772512Xr.l0).invoke(null, null, null);
    }
}
