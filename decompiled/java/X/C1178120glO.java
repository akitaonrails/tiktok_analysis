package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0glO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178120glO {
    public final Context LIZ;
    public final InterfaceC1176890gjP LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final ImageView LJFF;
    public final TuxTextView LJI;
    public C1178150glR LJII;
    public Drawable LJIIIIZZ;

    public C1178120glO(Context context) {
        this.LIZ = context;
        C1180740gpc.LIZ.getClass();
        this.LIZIZ = C1180740gpc.LIZ().LIZLLL();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2547));
        this.LIZJ = c01gwLIZIZ;
        this.LIZLLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2545));
        this.LJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2546));
        this.LJFF = (ImageView) ((View) c01gwLIZIZ.getValue()).findViewById(R.id.qx3);
        this.LJI = (TuxTextView) ((View) c01gwLIZIZ.getValue()).findViewById(R.id.qx4);
        this.LJII = new C1178150glR();
    }

    public final C1178150glR LIZ(C1178080glK c1178080glK, int i) {
        int i2;
        this.LJII = new C1178150glR();
        this.LJI.invalidate();
        if (c1178080glK.LJII) {
            return C1178150glR.LIZ(this.LJII, false, this.LIZIZ.LIZ((View) this.LIZLLL.getValue()), 1);
        }
        Bitmap bitmapCreateBitmap = c1178080glK.LIZIZ;
        if (bitmapCreateBitmap == null) {
            int i3 = C1913407eW.LIZ;
            bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            if (this.LJIIIIZZ == null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = i3;
                c384050F3z.LJI = i3;
                c384050F3z.LIZ = Integer.valueOf(C1180060goW.LJII("#FFA654"));
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                this.LJIIIIZZ = c384050F3z.LIZ(this.LIZ);
            }
            Drawable drawable = this.LJIIIIZZ;
            if (drawable != null) {
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
            }
            this.LJII = C1178150glR.LIZ(this.LJII, true, null, 2);
        }
        ImageView imageView = this.LJFF;
        Resources resources = this.LIZ.getResources();
        int width = bitmapCreateBitmap.getWidth();
        int height = bitmapCreateBitmap.getHeight();
        if (width >= height) {
            i2 = height;
        } else {
            i2 = width;
        }
        C443530HaJ c443530HaJ = new C443530HaJ(resources, Bitmap.createBitmap(bitmapCreateBitmap, (width - i2) / 2, (height - i2) / 2, i2, i2));
        c443530HaJ.LIZJ(C418440Gaw.LIZIZ(4));
        imageView.setImageDrawable(c443530HaJ);
        if (i > 1) {
            String strLJJIFFI = u.LJJIFFI((String) this.LJ.getValue(), "%1$s", String.valueOf(i), false);
            if (TextUtils.isEmpty(strLJJIFFI)) {
                C786410Ut5.LLLLZLL(this.LJI, 8);
            } else {
                this.LJI.setText(strLJJIFFI);
            }
        } else {
            String str = c1178080glK.LIZJ;
            if (TextUtils.isEmpty(str)) {
                C786410Ut5.LLLLZLL(this.LJI, 8);
            } else {
                this.LJI.setText(str);
            }
        }
        return C1178150glR.LIZ(this.LJII, false, this.LIZIZ.LIZ((View) this.LIZJ.getValue()), 1);
    }
}
