package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C427660Gpo extends C427870Gq9 {
    public int LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public float LLJJIJIIJIL;
    public Object LLJJIJIL;
    public int LLJJJ;
    public final Drawable LLJJJIL;
    public final Drawable LLJJJJ;
    public final TuxIconDrawable LLJJJJJIL;
    public final Drawable LLJJJJLIIL;
    public final int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;

    public C427660Gpo(Context context) {
        this(context, null, 6, 0);
    }

    public C427660Gpo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void LJIIJ(Object obj) {
        LJIIJJI(this, obj, false, null, null, false, false, null, null, false, null, 1022);
    }

    public final void LJIIL() {
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        if (this.LLJJIJI) {
            c1331750klB.LIZIZ = getAvatarStrokeWidth();
            if (this.LLJJJ == 2) {
                c1331750klB.LIZJ = this.LLJJL;
            }
        }
        setCircleOptions(c1331750klB.LIZ());
    }

    public final float getAvatarStrokeWidth() {
        float f = this.LLJJIJIIJIL;
        return f < 0.0f ? this.LLJJI < 64 ? C418440Gaw.LIZIZ(Double.valueOf(0.5d)) : C418440Gaw.LIZIZ(1) : f;
    }

    public final int getAvatarBorderColor() {
        return this.LLJJL;
    }

    public final int getSizePx() {
        return this.LLJJIII;
    }

    public final int getSizeVariant() {
        return this.LLJJI;
    }

    @Override // X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setSize(int i) {
        setSizeVariant(i);
        requestLayout();
    }

    public final void setSizePx(int i) {
        this.LLJJIII = i;
    }

    public final void setSizeVariant(int i) {
        this.LLJJI = i;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        this.LLJJIII = iLIZIZ;
        C427690Gpr.LJFF(this, iLIZIZ / 2.0f);
        requestLayout();
    }

    public final void setStrokeWidth(float f) {
        this.LLJJIJIIJIL = f;
        LJIIL();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLJJIII;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i3 = size;
        }
        int i4 = this.LLJJIII;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            i4 = size2;
        }
        setMeasuredDimension(i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ((GradientDrawable) this.LLJJJJLIIL).setStroke((int) getAvatarStrokeWidth(), this.LLJJLIIIJLLLLLLLZ);
        this.LLJJJJLIIL.setBounds(0, 0, measuredWidth, measuredHeight);
        this.LLJJJJJIL.LJII(measuredWidth);
        this.LLJJJJJIL.LJ(measuredHeight);
    }

    public C427660Gpo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJI = 64;
        this.LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = -1.0f;
        this.LLJJIJIL = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxAvatarView, i, 0);
        setSizeVariant(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAvatarView_tux_avatarSize, 64));
        this.LLJJL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAvatarView__tux_avatarBorderColor, -7829368);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAvatarView__tux_avatarFailureImageBorderColor, 0);
        this.LLJJLIIIJLLLLLLLZ = color;
        this.LLJJJIL = new ColorDrawable(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAvatarView__tux_avatarPlaceholderColor, 0));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxAvatarView__tux_avatarFailureIcon, 0);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = resourceId;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        this.LLJJJJJIL = tuxIconDrawableLIZ;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJ = Integer.valueOf(color);
        c384050F3z.LIZLLL = Integer.valueOf((int) getAvatarStrokeWidth());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        this.LLJJJJLIIL = drawableLIZ;
        this.LLJJJJ = C426750GoL.LJIILIIL(drawableLIZ, tuxIconDrawableLIZ);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C427660Gpo(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i3 = R.attr.xh;
        } else {
            i3 = 0;
        }
        this(context, attributeSet, i3);
    }

    public static void LJIIJJI(final C427660Gpo c427660Gpo, Object obj, boolean z, int[] iArr, String str, boolean z2, boolean z3, final CharSequence charSequence, final InterfaceC427850Gq7 interfaceC427850Gq7, boolean z4, Function1 function1, int i) {
        C1331670kl3 c1331670kl3LJIIIIZZ;
        Drawable drawable;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            iArr = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            z3 = true;
        }
        if ((i & 64) != 0) {
            charSequence = null;
        }
        if ((i & 128) != 0) {
            interfaceC427850Gq7 = null;
        }
        if ((i & 256) != 0) {
            z4 = false;
        }
        if ((i & 512) != 0) {
            function1 = null;
        }
        c427660Gpo.LLJJIJIL = obj;
        c427660Gpo.LLJJIJI = z3;
        if (z2) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(obj);
        } else if (obj instanceof Integer) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJFF(((Number) obj).intValue());
        } else if (obj instanceof File) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJII((File) obj);
        } else if (obj instanceof String) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIZ((String) obj);
        } else if (obj instanceof Uri) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJI((Uri) obj);
        } else if (obj instanceof C03IT) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIJ((C03IT) obj);
        } else {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(obj);
        }
        if (iArr != null) {
            c1331670kl3LJIIIIZZ.LJJIJ(iArr);
        }
        int i2 = c427660Gpo.LLJJIII;
        c1331670kl3LJIIIIZZ.LJIIIIZZ = i2;
        c1331670kl3LJIIIIZZ.LJIIIZ = i2;
        c1331670kl3LJIIIIZZ.LIZLLL(str);
        InterfaceC427850Gq7 interfaceC427850Gq72 = new InterfaceC427850Gq7() { // from class: X.0Gq6
            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.e1(uri);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.A3(uri, c428600GrK);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.Bh(uri, view);
                }
                C427660Gpo c427660Gpo2 = c427660Gpo;
                c427660Gpo2.LLJJJ = 0;
                c427660Gpo2.LJIIL();
                CharSequence charSequence2 = charSequence;
                if (charSequence2 != null && charSequence2.length() != 0) {
                    c427660Gpo.setContentDescription(charSequence);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.lg(uri, th);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.cm(uri, view, th);
                }
                C427660Gpo c427660Gpo2 = c427660Gpo;
                c427660Gpo2.LLJJJ = 1;
                c427660Gpo2.LJIIL();
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.Ad(uri, view, c428600GrK, animatable);
                }
                C427660Gpo c427660Gpo2 = c427660Gpo;
                c427660Gpo2.LLJJJ = 2;
                c427660Gpo2.LJIIL();
            }
        };
        c1331670kl3LJIIIIZZ.LJJIIZI(c427660Gpo.LLJJJIL);
        if (c427660Gpo.LLJJIJI) {
            drawable = c427660Gpo.LLJJJJ;
        } else {
            drawable = c427660Gpo.LLJJJJJIL;
        }
        c1331670kl3LJIIIIZZ.LJIL(drawable);
        c1331670kl3LJIIIIZZ.LJJIJLIJ = z;
        c1331670kl3LJIIIIZZ.LJJ(c427660Gpo);
        if (function1 != null) {
            function1.invoke(c1331670kl3LJIIIIZZ);
        }
        if (z4) {
            c1331670kl3LJIIIIZZ.LJIIL(interfaceC427850Gq72);
        } else {
            c1331670kl3LJIIIIZZ.LJIIJ(interfaceC427850Gq72);
        }
    }
}
