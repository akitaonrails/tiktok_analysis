package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.03IN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03IN extends LinearLayout {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public Set<C03IP> LLILZIL;
    public float LLILZLL;

    public final void setTagShow(boolean z) {
    }

    public final SmartImageView getTagIcFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x1b);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getTagTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x29);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final Set<C03IP> getTagLayoutParams() {
        return this.LLILZIL;
    }

    public final float getTagRadius() {
        return this.LLILZLL;
    }

    public final int getTextFont() {
        return this.LLILZ;
    }

    public final int getTextMaxLine() {
        return this.LLILLL;
    }

    public C03IN(Context context) {
        this(context, null, 0);
    }

    public static boolean LIZIZ(C03CH c03ch) {
        C812103Ff c812103Ff;
        String str;
        Integer num;
        if (c03ch == null) {
            return false;
        }
        C812103Ff c812103Ff2 = c03ch.LIZ;
        if ((c812103Ff2 == null || (num = c812103Ff2.LIZ) == null || num.intValue() != 0) && ((c812103Ff = c03ch.LIZJ) == null || (str = c812103Ff.LIZIZ) == null || str.length() == 0)) {
            return false;
        }
        return true;
    }

    public static final GradientDrawable LJ(float f) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        int color = ColorProtector.parseColor("#57FE2C55");
        int color2 = ColorProtector.parseColor("#FFFFFF");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color2);
        gradientDrawable.setCornerRadius(iLIZIZ2);
        gradientDrawable.setStroke(iLIZIZ, color);
        return gradientDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setStyle(java.lang.Integer r9) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03IN.setStyle(java.lang.Integer):void");
    }

    private final void setTagBg(C812103Ff c812103Ff) {
        Integer num = null;
        if (c812103Ff != null) {
            if (c812103Ff.LIZJ != null) {
                List<String> urls = c812103Ff.LIZJ.getUrls();
                if (urls != null && !urls.isEmpty()) {
                    C1331660kl2.LJIIJ(new C03IT(c812103Ff.LIZJ.getUrls())).LJJII(new C1077104Jd(this, c812103Ff, 1));
                    return;
                }
            } else if (c812103Ff != null) {
            }
            num = c812103Ff.LIZ;
        }
        setBackground(LIZLLL(this, num));
    }

    private final void setTagIcon(C812103Ff c812103Ff) {
        boolean z;
        Integer num;
        if (c812103Ff != null && (num = c812103Ff.LIZ) != null && num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            GImage gImage = c812103Ff.LIZJ;
            if (gImage != null) {
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(gImage.getUrls()));
                c1331670kl3LJIIJ.LJJ(getTagIcFromXml());
                C786410Ut5.h3(c1331670kl3LJIIJ);
                getTagIcFromXml().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                C786410Ut5.LLFF(0, getTagIcFromXml());
                return;
            }
            C03CK c03ck = c812103Ff.LIZLLL;
            if (c03ck != null && c03ck.LIZJ != null) {
                ViewGroup.LayoutParams layoutParams = getTagIcFromXml().getLayoutParams();
                C03CK c03ck2 = c812103Ff.LIZLLL;
                layoutParams.width = c03ck2.LIZ;
                layoutParams.height = c03ck2.LIZIZ;
                C786410Ut5.G6(getTagIcFromXml(), layoutParams);
                getTagIcFromXml().setImageResource(c812103Ff.LIZLLL.LIZJ.intValue());
                C786410Ut5.LLFF(0, getTagIcFromXml());
                return;
            }
            C786410Ut5.LLFF(8, getTagIcFromXml());
            return;
        }
        C786410Ut5.LLFF(8, getTagIcFromXml());
    }

    private final void setTagIconV1(C812103Ff c812103Ff) {
        boolean z;
        Integer num;
        if (c812103Ff != null && (num = c812103Ff.LIZ) != null && num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            GImage gImage = c812103Ff.LIZJ;
            if (gImage != null) {
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(gImage.getUrls()));
                c1331670kl3LJIIJ.LJJ(getTagIcFromXml());
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c1331670kl3LJIIJ.LJIIIIZZ = iLIZIZ;
                c1331670kl3LJIIJ.LJIIIZ = iLIZIZ2;
                C786410Ut5.h3(c1331670kl3LJIIJ);
                C786410Ut5.LLFF(0, getTagIcFromXml());
                return;
            }
            C03CK c03ck = c812103Ff.LIZLLL;
            if (c03ck != null && c03ck.LIZJ != null) {
                ViewGroup.LayoutParams layoutParams = getTagIcFromXml().getLayoutParams();
                C03CK c03ck2 = c812103Ff.LIZLLL;
                layoutParams.width = c03ck2.LIZ;
                layoutParams.height = c03ck2.LIZIZ;
                C786410Ut5.G6(getTagIcFromXml(), layoutParams);
                getTagIcFromXml().setImageResource(c812103Ff.LIZLLL.LIZJ.intValue());
                C786410Ut5.LLFF(0, getTagIcFromXml());
                return;
            }
            C786410Ut5.LLFF(8, getTagIcFromXml());
            return;
        }
        C786410Ut5.LLFF(8, getTagIcFromXml());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setTagText(X.C812103Ff r11) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03IN.setTagText(X.03Ff):void");
    }

    public final float LIZ(float f) {
        return (f * getContext().getResources().getDisplayMetrics().density) + 0.5f;
    }

    public final void setTagIcFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setTagLayoutParams(Set<C03IP> set) {
        this.LLILZIL = set;
    }

    public final void setTagRadius(float f) {
        this.LLILZLL = f;
    }

    public final void setTagTextFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setTagUi(X.C03CH r20) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03IN.setTagUi(X.03CH):void");
    }

    public final void setTagUiV1(C03CH c03ch) {
        C812103Ff c812103Ff;
        C812103Ff c812103Ff2;
        C812103Ff c812103Ff3;
        C812103Ff c812103Ff4;
        if (LIZIZ(c03ch)) {
            Integer num = null;
            if (c03ch != null) {
                c812103Ff = c03ch.LIZ;
            } else {
                c812103Ff = null;
            }
            setTagIconV1(c812103Ff);
            if (c03ch != null) {
                c812103Ff2 = c03ch.LIZJ;
            } else {
                c812103Ff2 = null;
            }
            setTagText(c812103Ff2);
            if (c03ch != null) {
                c812103Ff3 = c03ch.LIZIZ;
            } else {
                c812103Ff3 = null;
            }
            setTagBg(c812103Ff3);
            if (c03ch != null && (c812103Ff4 = c03ch.LIZIZ) != null) {
                num = c812103Ff4.LIZ;
            }
            setStyle(num);
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            return;
        }
        int visibility2 = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, this);
    }

    public final void setTextFont(int i) {
        this.LLILZ = i;
    }

    public final void setTextMaxLine(int i) {
        this.LLILLL = i;
    }

    public C03IN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final Drawable LIZLLL(C03IN c03in, Integer num) {
        if (num != null) {
            if (num.intValue() == 2) {
                return C800330VaR.LIZIZ(c03in.getContext(), R.drawable.bj3);
            }
            if (num.intValue() == 1) {
                return C800330VaR.LIZIZ(c03in.getContext(), R.drawable.bj2);
            }
            if (num.intValue() == 3) {
                return LJ(0.5f);
            }
            if (num != null) {
                if (num.intValue() == 4) {
                    return LJ(1.0f);
                }
                if (num.intValue() == 5) {
                    return C800330VaR.LIZIZ(c03in.getContext(), R.drawable.bj8);
                }
                if (num.intValue() == 9) {
                    return C800330VaR.LIZIZ(c03in.getContext(), R.drawable.bj5);
                }
                if (num.intValue() == 10) {
                    return C800330VaR.LIZIZ(c03in.getContext(), R.drawable.bj7);
                }
                if (num.intValue() == 19) {
                    return C800330VaR.LIZIZ(c03in.getContext(), R.drawable.bj6);
                }
                if (num != null) {
                    if (num.intValue() == 11) {
                        return C800330VaR.LIZIZ(c03in.getContext(), R.drawable.bj4);
                    }
                    if (num.intValue() == 7) {
                        return C800330VaR.LIZIZ(c03in.getContext(), R.drawable.bj4);
                    }
                    if (num.intValue() == 12) {
                        return C800330VaR.LIZIZ(c03in.getContext(), R.drawable.bji);
                    }
                    if (num != null) {
                        if (num.intValue() == 13) {
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                            c384050F3z.LIZIZ = Integer.valueOf(R.attr.wy);
                            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                            c384050F3z.LJFF = Integer.valueOf(R.attr.x1);
                            return c384050F3z.LIZ(c03in.getContext());
                        }
                        if (num.intValue() == 14) {
                            C384050F3z c384050F3z2 = new C384050F3z();
                            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.x0);
                            return c384050F3z2.LIZ(c03in.getContext());
                        }
                        if (num.intValue() == 15) {
                            C384050F3z c384050F3z3 = new C384050F3z();
                            c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                            c384050F3z3.LIZIZ = Integer.valueOf(R.attr.uv);
                            return c384050F3z3.LIZ(c03in.getContext());
                        }
                        if (num.intValue() == 16) {
                            C384050F3z c384050F3z4 = new C384050F3z();
                            c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                            c384050F3z4.LIZIZ = Integer.valueOf(R.attr.x2);
                            c384050F3z4.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                            c384050F3z4.LJFF = Integer.valueOf(R.attr.x4);
                            return c384050F3z4.LIZ(c03in.getContext());
                        }
                        if (num.intValue() == 17) {
                            C384050F3z c384050F3z5 = new C384050F3z();
                            c384050F3z5.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                            c384050F3z5.LIZIZ = Integer.valueOf(R.attr.us);
                            return c384050F3z5.LIZ(c03in.getContext());
                        }
                        if (num.intValue() == 18) {
                            C384050F3z c384050F3z6 = new C384050F3z();
                            c384050F3z6.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                            c384050F3z6.LIZIZ = Integer.valueOf(R.attr.xb);
                            return c384050F3z6.LIZ(c03in.getContext());
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public C03IN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bpo, this, true);
        this.LLILLL = 1;
        this.LLILZ = 92;
        this.LLILZLL = LIZ(2.0f);
    }

    public static Bitmap LIZJ(float f, Bitmap bitmap, C03IN c03in) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c03in.getWidth(), c03in.getHeight(), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        RectF rectF = new RectF(new Rect(0, 0, c03in.getWidth(), c03in.getHeight()));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f, f, paint);
        int width = bitmap.getWidth();
        float height = c03in.getHeight() / bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(c03in.getWidth() / width, height);
        canvas.drawBitmap(bitmap, matrix, paint);
        return bitmapCreateBitmap;
    }
}
