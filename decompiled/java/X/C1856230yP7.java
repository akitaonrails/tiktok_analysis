package X;

import Y.ACListenerS154S0100000_19;
import Y.ATListenerS459S0100000_27;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yP7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856230yP7 extends LinearLayout {
    public final SmartImageView LL;
    public final FrameLayout LLILLJJLI;
    public final C426320Gne LLILLL;
    public final TuxTextView LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public Function0<Unit> LLIZ;
    public Function2<? super Float, ? super Float, Unit> LLIZLLLIL;
    public BaseImage LLJ;
    public final String LLJI;
    public final AwS598S0100000_19 LLJIJIL;
    public ValueAnimator LLJILJIL;
    public float LLJILJILJ;

    public C1856230yP7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final BaseImage getImage() {
        return this.LLJ;
    }

    public final Function0<Unit> getOnClickListener() {
        return this.LLIZ;
    }

    public final Function2<Float, Float, Unit> getOnLongClickListener() {
        return this.LLIZLLLIL;
    }

    public final void LIZJ(BaseImage baseImage) {
        Integer num;
        long jLongValue;
        final float fLongValue;
        Integer num2 = baseImage.uploadStatus;
        if ((num2 != null && num2.intValue() == 1) || ((num = baseImage.uploadStatus) != null && num.intValue() == 2)) {
            FrameLayout frameLayout = this.LLILLJJLI;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            C426320Gne c426320Gne = this.LLILLL;
            if (c426320Gne != null) {
                C786410Ut5.LLLZZ(c426320Gne, 0);
            }
            final C426320Gne c426320Gne2 = this.LLILLL;
            if (c426320Gne2 != null) {
                Long l = baseImage.uploadProgress;
                if (l != null) {
                    fLongValue = l.longValue();
                } else {
                    fLongValue = 0.0f;
                }
                final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLJILJILJ, fLongValue);
                valueAnimatorOfFloat.setDuration((long) Math.max(fLongValue - this.LLJILJILJ, 0.0f));
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0yP8
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Float f;
                        float fFloatValue;
                        C1856230yP7 c1856230yP7 = this.LL;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Float) {
                            f = (Float) animatedValue;
                        } else {
                            f = null;
                        }
                        if (f != null) {
                            fFloatValue = f.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        c1856230yP7.LLJILJILJ = fFloatValue;
                        ValueAnimator valueAnimator2 = valueAnimatorOfFloat;
                        valueAnimator2.setDuration(valueAnimator2.getDuration() + ((long) Math.max(fLongValue - this.LL.LLJILJILJ, 0.0f)));
                        valueAnimatorOfFloat.setFloatValues(this.LL.LLJILJILJ, fLongValue);
                        c426320Gne2.LIZ(this.LL.LLJILJILJ, false);
                    }
                });
                valueAnimatorOfFloat.start();
                this.LLJILJIL = valueAnimatorOfFloat;
            }
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                AwS598S0100000_19 awS598S0100000_19 = this.LLJIJIL;
                Long l2 = baseImage.uploadProgress;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                tuxTextView.setText((CharSequence) awS598S0100000_19.invoke(Integer.valueOf((int) jLongValue)));
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        C426320Gne c426320Gne3 = this.LLILLL;
        if (c426320Gne3 != null) {
            C786410Ut5.LLLZZ(c426320Gne3, 8);
        }
        TuxTextView tuxTextView3 = this.LLILZ;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        this.LLJILJILJ = 0.0f;
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.LLJILJIL;
        if (valueAnimator2 == null) {
            return;
        }
        valueAnimator2.cancel();
    }

    public final void LJ(C1856260yPA c1856260yPA) {
        C1331100kk8 c1331100kk8;
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            C786410Ut5.G6(smartImageView, new C19ME(c1856260yPA.LIZ, c1856260yPA.LIZIZ));
            C1331070kk5 hierarchy = smartImageView.getHierarchy();
            if (hierarchy != null) {
                int iIntValue = 0;
                boolean z = true;
                if (smartImageView.getLayoutDirection() != 1) {
                    z = false;
                }
                if (z) {
                    c1331100kk8 = new C1331100kk8();
                    c1331100kk8.LJI(c1856260yPA.LIZLLL, c1856260yPA.LIZJ, c1856260yPA.LJ, c1856260yPA.LJFF);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, smartImageView.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    }
                    C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                    Double dValueOf = Double.valueOf(0.5d);
                    c1546210qL5.getClass();
                    c1331100kk8.LJ(C1546210qL5.LIZ(dValueOf), iIntValue);
                } else {
                    c1331100kk8 = new C1331100kk8();
                    c1331100kk8.LJI(c1856260yPA.LIZJ, c1856260yPA.LIZLLL, c1856260yPA.LJFF, c1856260yPA.LJ);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, smartImageView.getContext());
                    if (numLIZJ2 != null) {
                        iIntValue = numLIZJ2.intValue();
                    }
                    C1546210qL5 c1546210qL52 = C1546210qL5.LIZ;
                    Double dValueOf2 = Double.valueOf(0.5d);
                    c1546210qL52.getClass();
                    c1331100kk8.LJ(C1546210qL5.LIZ(dValueOf2), iIntValue);
                }
                hierarchy.LJJIII(c1331100kk8);
            }
        }
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setOnLongClickListener(Function2<? super Float, ? super Float, Unit> function2) {
        this.LLIZLLLIL = function2;
    }

    public final void LIZ(BaseImage baseImage, Map<String, String> map) {
        if (baseImage == null) {
            this.LLJ = null;
            return;
        }
        if (Intrinsics.LJFF(this.LLJ, baseImage)) {
            return;
        }
        this.LLJ = baseImage;
        if (!baseImage.urlList.isEmpty()) {
            LIZIZ(this, null, null, baseImage.urlList, map, 3);
            return;
        }
        String str = baseImage.localCachePath;
        if (str != null && C1854460yMG.LIZ(str)) {
            LIZIZ(this, null, baseImage.localCachePath, null, map, 5);
            return;
        }
        String str2 = baseImage.uri;
        if (str2 != null) {
            if (C1854460yMG.LIZIZ(str2)) {
                LIZIZ(this, UriProtector.parse(str2), null, null, map, 6);
                return;
            } else if (C1854460yMG.LIZ(str2)) {
                LIZIZ(this, null, str2, null, map, 5);
                return;
            } else {
                LIZLLL(baseImage, map);
                return;
            }
        }
        String str3 = baseImage.imageId;
        if (str3 == null || str3.length() == 0) {
            return;
        }
        LIZLLL(baseImage, map);
    }

    public final void LIZLLL(BaseImage baseImage, Map<String, String> map) {
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            C1331670kl3 c1331670kl3LIZ = C1856250yP9.LIZ(baseImage);
            c1331670kl3LIZ.LIZLLL("TakoImageItemView");
            int width = smartImageView.getWidth();
            int height = smartImageView.getHeight();
            c1331670kl3LIZ.LJIIIIZZ = width;
            c1331670kl3LIZ.LJIIIZ = height;
            c1331670kl3LIZ.LJJJIL = new C1338340kvo(smartImageView, "image_item", baseImage.imageId, map);
            c1331670kl3LIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZ);
        }
    }

    public C1856230yP7(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        if (a0.LJJIZ(NumberFormat.getPercentInstance().format(0L), ' ', 0, false, 6) == -1) {
            str = "";
        } else {
            str = " ";
        }
        this.LLJI = str;
        this.LLJIJIL = new AwS598S0100000_19(this, 261);
        C786410Ut5.Sd(R.layout.frm, C786410Ut5.ne(context), this);
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.x7r);
        smartImageView.setOnTouchListener(new ATListenerS459S0100000_27(this, 3));
        C786410Ut5.Q8(smartImageView, new ACListenerS154S0100000_19(this, 134));
        if (C07I2.LIZ()) {
            smartImageView.setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 7));
        }
        this.LL = smartImageView;
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.x_0);
        this.LLILLL = (C426320Gne) findViewById(R.id.x_2);
        this.LLILZ = (TuxTextView) findViewById(R.id.x_1);
    }

    public static void LIZIZ(C1856230yP7 c1856230yP7, Uri uri, String str, final List list, final Map map, int i) {
        if ((i & 1) != 0) {
            uri = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        final SmartImageView smartImageView = c1856230yP7.LL;
        if (smartImageView != null) {
            if (uri != null) {
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uri);
                c1331670kl3LJI.LIZLLL("TakoImageItemView");
                int width = smartImageView.getWidth();
                int height = smartImageView.getHeight();
                c1331670kl3LJI.LJIIIIZZ = width;
                c1331670kl3LJI.LJIIIZ = height;
                c1331670kl3LJI.LJJJIL = new C1338340kvo(smartImageView, "image_item", uri.toString(), map);
                c1331670kl3LJI.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJI);
                return;
            }
            if (C123100dR.LIZ(str)) {
                C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
                c1331670kl3LJII.LIZLLL("TakoImageItemView");
                int width2 = smartImageView.getWidth();
                int height2 = smartImageView.getHeight();
                c1331670kl3LJII.LJIIIIZZ = width2;
                c1331670kl3LJII.LJIIIZ = height2;
                c1331670kl3LJII.LJJJIL = new C1338340kvo(smartImageView, "image_item", str, map);
                c1331670kl3LJII.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJII);
                return;
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            final C03IT c03it = new C03IT(list);
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03it);
            c1331670kl3LJIIJ.LIZLLL("TakoImageItemView");
            int width3 = smartImageView.getWidth();
            int height3 = smartImageView.getHeight();
            c1331670kl3LJIIJ.LJIIIIZZ = width3;
            c1331670kl3LJIIJ.LJIIIZ = height3;
            c1331670kl3LJIIJ.LJJJIL = new C1338340kvo("image_item", map, (TuxIconView) null, 12);
            c1331670kl3LJIIJ.LJJIIJ(new AbstractC468201s0() { // from class: X.06ZL
                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    C1331670kl3 c1331670kl3LJIIJ2 = C1331660kl2.LJIIJ(c03it);
                    c1331670kl3LJIIJ2.LIZLLL("TakoImageItemView");
                    int width4 = smartImageView.getWidth();
                    int height4 = smartImageView.getHeight();
                    c1331670kl3LJIIJ2.LJIIIIZZ = width4;
                    c1331670kl3LJIIJ2.LJIIIZ = height4;
                    c1331670kl3LJIIJ2.LJJJIL = new C1338340kvo(smartImageView, "image_item", (String) C13LP.LJJJLL(list), map);
                    c1331670kl3LJIIJ2.LJJ(smartImageView);
                    C786410Ut5.h3(c1331670kl3LJIIJ2);
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    C1331670kl3 c1331670kl3LJIIJ2 = C1331660kl2.LJIIJ(c03it);
                    c1331670kl3LJIIJ2.LIZLLL("TakoImageItemView");
                    int width4 = smartImageView.getWidth();
                    int height4 = smartImageView.getHeight();
                    c1331670kl3LJIIJ2.LJIIIIZZ = width4;
                    c1331670kl3LJIIJ2.LJIIIZ = height4;
                    c1331670kl3LJIIJ2.LJJJIL = new C1338340kvo(smartImageView, "image_item", (String) C13LP.LJJJLL(list), map);
                    c1331670kl3LJIIJ2.LJJ(smartImageView);
                    C786410Ut5.h3(c1331670kl3LJIIJ2);
                }
            });
        }
    }
}
