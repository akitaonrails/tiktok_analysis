package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerBackground;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerCountDown;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaPdpGradientColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C950403na extends LinearLayout {
    public static final /* synthetic */ int LLILZ = 0;
    public C950703nd LL;
    public InterfaceC950803ne LLILLJJLI;
    public C950303nZ LLILLL;

    public C950403na(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        SeaBannerCountDown seaBannerCountDown;
        C950303nZ c950303nZ = this.LLILLL;
        if (c950303nZ == null || (seaBannerCountDown = c950303nZ.LLILZLL) == null) {
            return;
        }
        c950303nZ.j0(seaBannerCountDown, c950303nZ.LLJ);
    }

    public final void LIZJ(boolean z) {
        C950303nZ c950303nZ = this.LLILLL;
        if (c950303nZ != null) {
            if (!z) {
                c950303nZ.LLILZLL = null;
                c950303nZ.LLJILJIL = null;
            }
            c950303nZ.LLIZ = -1;
            CountDownTimer countDownTimer = c950303nZ.LLIZLLLIL;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            c950303nZ.LLIZLLLIL = null;
            c950303nZ.LLJ = null;
            c950303nZ.LLJI = 0;
            c950303nZ.LLJIJIL = 0L;
        }
    }

    public final void LIZLLL(SeaBannerBackground seaBannerBackground) {
        int iIntValue;
        int iIntValue2;
        Image imageRequireImageForEcDarkMode;
        Integer numLIZ;
        Integer numLIZ2;
        CustomColor customColor;
        Integer numLIZ3;
        CustomColor customColor2;
        Integer numLIZ4;
        if (seaBannerBackground == null) {
            setBackground(null);
            return;
        }
        SeaPdpGradientColor seaPdpGradientColor = seaBannerBackground.defaultGradient;
        if (seaPdpGradientColor != null && (customColor2 = seaPdpGradientColor.start) != null && (numLIZ4 = C038L.LIZ(customColor2, getContext(), null)) != null) {
            iIntValue = numLIZ4.intValue();
        } else {
            iIntValue = 0;
        }
        SeaPdpGradientColor seaPdpGradientColor2 = seaBannerBackground.defaultGradient;
        if (seaPdpGradientColor2 != null && (customColor = seaPdpGradientColor2.end) != null && (numLIZ3 = C038L.LIZ(customColor, getContext(), null)) != null) {
            iIntValue2 = numLIZ3.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (C7809033f.LIZ(Integer.valueOf(iIntValue)) && C7809033f.LIZ(Integer.valueOf(iIntValue2))) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setColors(new int[]{iIntValue, iIntValue2});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
            CustomColor customColor3 = seaBannerBackground.borderColor;
            if (customColor3 != null && (numLIZ2 = C038L.LIZ(customColor3, getContext(), null)) != null) {
                gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f))), numLIZ2.intValue());
            }
            setBackground(gradientDrawable);
        }
        Icon icon = seaBannerBackground.image;
        if (icon != null && (imageRequireImageForEcDarkMode = icon.requireImageForEcDarkMode(getContext())) != null) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageRequireImageForEcDarkMode);
            CustomColor customColor4 = seaBannerBackground.borderColor;
            if (customColor4 != null && (numLIZ = C038L.LIZ(customColor4, getContext(), null)) != null) {
                int iIntValue3 = numLIZ.intValue();
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZIZ = C418440Gaw.LIZIZ(Float.valueOf(0.5f));
                c1331750klB.LIZJ = iIntValue3;
                c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
            }
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LIZLLL.LJJII(new C1077204Je(this, 0));
        }
    }

    public final void LIZ(C950703nd c950703nd, InterfaceC950803ne interfaceC950803ne) {
        int iIntValue;
        this.LL = c950703nd;
        this.LLILLJJLI = interfaceC950803ne;
        C426750GoL.LJIIIZ(this, Integer.valueOf(c950703nd.LIZ), Integer.valueOf(c950703nd.LIZIZ), Integer.valueOf(c950703nd.LIZJ), Integer.valueOf(c950703nd.LIZLLL), false, 16);
        Float f = c950703nd.LJ;
        if (f != null) {
            setOutlineProvider(new C04J9(f.floatValue(), 1));
            setClipToOutline(true);
        }
        Integer num = c950703nd.LJFF;
        if (num != null) {
            int iIntValue2 = num.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            Integer numLIZJ = C1308910kAL.LIZJ(iIntValue2, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -1;
            }
            gradientDrawable.setColor(iIntValue);
            setBackground(gradientDrawable);
        }
    }

    public final void LJ(C950203nY c950203nY, Function1<? super Boolean, Unit> function1) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int value;
        if (c950203nY != null) {
            LIZLLL(c950203nY.LIZJ);
            if (this.LLILLL == null) {
                C950303nZ c950303nZ = new C950303nZ(getContext(), null, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c950303nZ);
                c950303nZ.setLayoutParams(layoutParams);
                C950703nd c950703nd = this.LL;
                if (c950703nd != null) {
                    i = c950703nd.LJI;
                } else {
                    i = 0;
                }
                Integer numValueOf = Integer.valueOf(i);
                C950703nd c950703nd2 = this.LL;
                if (c950703nd2 != null) {
                    i2 = c950703nd2.LJII;
                } else {
                    i2 = 0;
                }
                Integer numValueOf2 = Integer.valueOf(i2);
                C950703nd c950703nd3 = this.LL;
                if (c950703nd3 != null) {
                    i3 = c950703nd3.LJI;
                } else {
                    i3 = 0;
                }
                Integer numValueOf3 = Integer.valueOf(i3);
                C950703nd c950703nd4 = this.LL;
                if (c950703nd4 != null) {
                    i4 = c950703nd4.LJII;
                    i5 = c950703nd4.LJIIIIZZ;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                C426750GoL.LJIIIZ(c950303nZ, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i4 + i5), false, 16);
                Integer num = c950203nY.LIZIZ;
                if (num != null) {
                    value = num.intValue();
                } else {
                    value = C03CS.SINGLE_LINE.getValue();
                }
                c950303nZ.h0(value);
                this.LLILLL = c950303nZ;
                addView(c950303nZ, 0);
            }
            C950303nZ c950303nZ2 = this.LLILLL;
            if (c950303nZ2 != null) {
                c950303nZ2.l0(c950203nY, function1);
            }
            C950303nZ c950303nZ3 = this.LLILLL;
            if (c950303nZ3 != null) {
                C786410Ut5.I7(new AjS40S0200000_1(this, c950203nY, 49), c950303nZ3);
            }
            C950303nZ c950303nZ4 = this.LLILLL;
            if (c950303nZ4 != null) {
                C12ES.LJIILL(0, c950303nZ4);
            }
            InterfaceC950803ne interfaceC950803ne = this.LLILLJJLI;
            if (interfaceC950803ne != null) {
                interfaceC950803ne.LIZ(this, c950203nY);
                return;
            }
            return;
        }
        LIZLLL(null);
        LIZJ(false);
        C03DZ.LIZ(this.LLILLL);
    }

    public C950403na(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setId(R.id.ehi);
        setOrientation(1);
    }
}
