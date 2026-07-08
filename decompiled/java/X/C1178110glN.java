package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0glN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178110glN {
    public final Context LIZ;
    public final InterfaceC1176890gjP LIZIZ;
    public final View LIZJ;
    public final ImageView LIZLLL;
    public final ImageView LJ;
    public final ImageView LJFF;
    public final C426770GoN LJI;
    public final C417240GXq LJII;
    public final ImageView LJIIIIZZ;
    public C1178160glS LJIIIZ;
    public Drawable LJIIJ;

    public C1178110glN(Context context) {
        this.LIZ = context;
        C1180740gpc.LIZ.getClass();
        this.LIZIZ = C1180740gpc.LIZ().LIZLLL();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e0o, new FrameLayout(context), false);
        this.LIZJ = viewTd;
        this.LIZLLL = (ImageView) viewTd.findViewById(R.id.r4p);
        this.LJ = (ImageView) viewTd.findViewById(R.id.r4o);
        this.LJFF = (ImageView) viewTd.findViewById(R.id.r4v);
        this.LJI = (C426770GoN) viewTd.findViewById(R.id.r4q);
        this.LJII = (C417240GXq) viewTd.findViewById(R.id.r4u);
        this.LJIIIIZZ = (ImageView) viewTd.findViewById(R.id.r4t);
        this.LJIIIZ = new C1178160glS();
    }

    public final C1178160glS LIZ(C1177210gjv c1177210gjv, int i) {
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LJIIIZ = new C1178160glS();
        if (C960203pA.LIZIZ(this.LIZ)) {
            C417240GXq c417240GXq = this.LJII;
            c417240GXq.LLJJJJLIIL = false;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, c417240GXq.getContext());
            if (numLIZJ != null) {
                this.LJII.setTextColor(numLIZJ.intValue());
            }
        } else {
            C417240GXq c417240GXq2 = this.LJII;
            c417240GXq2.LLJJJJLIIL = true;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, c417240GXq2.getContext());
            if (numLIZJ2 != null) {
                this.LJII.setTextColor(numLIZJ2.intValue());
            }
        }
        this.LJII.invalidate();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (c1177210gjv.LIZLLL) {
            C786410Ut5.LJZI(0, this.LJFF);
            C417240GXq c417240GXq3 = this.LJII;
            int visibility = c417240GXq3.getVisibility();
            c417240GXq3.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c417240GXq3);
            C426750GoL.LJIIIZ(this.LJII, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, 0, false, 16);
            this.LJII.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            C786410Ut5.LLLLLLIL(this.LJI, 8);
            ImageView imageView = this.LJ;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i4 = C1178130glP.LIZ;
            int i5 = i4 - (C1178130glP.LIZLLL * 2);
            layoutParams.height = i5;
            layoutParams.width = i5;
            C786410Ut5.c6(imageView, layoutParams);
            ImageView imageView2 = this.LIZLLL;
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            layoutParams2.height = i4;
            layoutParams2.width = i4;
            C786410Ut5.c6(imageView2, layoutParams2);
            ImageView imageView3 = this.LJIIIIZZ;
            ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
            int i6 = C1178130glP.LJ;
            int i7 = i4 + i6;
            layoutParams3.height = i7;
            layoutParams3.width = i7;
            C786410Ut5.c6(imageView3, layoutParams3);
            ImageView imageView4 = this.LJFF;
            ViewGroup.LayoutParams layoutParams4 = imageView4.getLayoutParams();
            if ((layoutParams4 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams.topMargin = (i4 + (i6 / 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                marginLayoutParams2 = marginLayoutParams;
            }
            C786410Ut5.c6(imageView4, marginLayoutParams2);
        } else {
            C786410Ut5.LJZI(8, this.LJFF);
            C417240GXq c417240GXq4 = this.LJII;
            int visibility2 = c417240GXq4.getVisibility();
            c417240GXq4.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, c417240GXq4);
            C426750GoL.LJIIIZ(this.LJII, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 0, false, 16);
            this.LJII.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() > 1) {
                int iIntValue = numValueOf.intValue();
                C786410Ut5.LLLLLLIL(this.LJI, 0);
                this.LJI.setCount(iIntValue);
                numValueOf.intValue();
            } else {
                C786410Ut5.LLLLLLIL(this.LJI, 8);
            }
            ImageView imageView5 = this.LJ;
            ViewGroup.LayoutParams layoutParams5 = imageView5.getLayoutParams();
            int i8 = C1178130glP.LIZIZ;
            int i9 = i8 - (C1178130glP.LIZJ * 2);
            layoutParams5.height = i9;
            layoutParams5.width = i9;
            C786410Ut5.c6(imageView5, layoutParams5);
            ImageView imageView6 = this.LIZLLL;
            ViewGroup.LayoutParams layoutParams6 = imageView6.getLayoutParams();
            layoutParams6.height = i8;
            layoutParams6.width = i8;
            C786410Ut5.c6(imageView6, layoutParams6);
            ImageView imageView7 = this.LJIIIIZZ;
            ViewGroup.LayoutParams layoutParams7 = imageView7.getLayoutParams();
            int i10 = i8 + C1178130glP.LJ;
            layoutParams7.height = i10;
            layoutParams7.width = i10;
            C786410Ut5.c6(imageView7, layoutParams7);
        }
        Bitmap bitmapCreateBitmap = c1177210gjv.LIZIZ;
        if (bitmapCreateBitmap == null) {
            if (c1177210gjv.LIZLLL) {
                i3 = C1178130glP.LIZ;
            } else {
                i3 = C1178130glP.LIZIZ;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            if (this.LJIIJ == null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_map_pin_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a0o);
                int i11 = i3 / 2;
                c419910GdJ.LIZIZ = i11;
                c419910GdJ.LIZJ = i11;
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LIZ);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = i3;
                c384050F3z.LJI = i3;
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1m);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                this.LJIIJ = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.LIZ));
            }
            Drawable drawable = this.LJIIJ;
            if (drawable != null) {
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
            }
            C1178160glS c1178160glS = this.LJIIIZ;
            Bitmap bitmap = c1178160glS.LIZIZ;
            c1178160glS.getClass();
            this.LJIIIZ = new C1178160glS(bitmap, true);
        }
        ImageView imageView8 = this.LJ;
        Resources resources = this.LIZ.getResources();
        int width = bitmapCreateBitmap.getWidth();
        int height = bitmapCreateBitmap.getHeight();
        if (width >= height) {
            i2 = height;
        } else {
            i2 = width;
        }
        C443530HaJ c443530HaJ = new C443530HaJ(resources, Bitmap.createBitmap(bitmapCreateBitmap, (width - i2) / 2, (height - i2) / 2, i2, i2));
        c443530HaJ.LIZIZ();
        imageView8.setImageDrawable(c443530HaJ);
        String str = c1177210gjv.LIZJ;
        if (TextUtils.isEmpty(str)) {
            C417240GXq c417240GXq5 = this.LJII;
            int visibility3 = c417240GXq5.getVisibility();
            c417240GXq5.setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, c417240GXq5);
        } else {
            this.LJII.setText(str);
        }
        C1178160glS c1178160glS2 = this.LJIIIZ;
        Bitmap bitmapLIZ = this.LIZIZ.LIZ(this.LIZJ);
        boolean z = c1178160glS2.LIZ;
        c1178160glS2.getClass();
        return new C1178160glS(bitmapLIZ, z);
    }
}
