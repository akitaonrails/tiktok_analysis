package X;

import Y.ARunnableS0S0301004_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Gwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432070Gwv {
    public static final void LJ(C19EG c19eg) {
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LJIIIZ(0);
        immersionBarLJIILJJIL.LJIIJ(true);
        immersionBarLJIILJJIL.LJII(true);
        tuxImmersionBar.LJ(R.attr.e1);
        tuxImmersionBar.LIZLLL();
    }

    public static final SpannableString LIZLLL(Context context, String str) {
        String string = context.getString(2131850541);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int iLJJJ = a0.LJJJ(strLIZIZ, string, 0, false, 6);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, new C1401770ma7(context, 4), iLJJJ, string.length() + iLJJJ, 17);
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), iLJJJ, string.length() + iLJJJ, 17);
        return spannableString;
    }

    public static final void LIZIZ(TuxTextView tuxTextView, int[] iArr, float[] fArr) {
        tuxTextView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, tuxTextView.getPaint().measureText(tuxTextView.getText().toString()), tuxTextView.getPaint().getTextSize(), iArr, fArr, Shader.TileMode.CLAMP));
    }

    public static final boolean LIZJ(int i, int i2, View view) {
        if (view == null) {
            return false;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        return rect.contains(i, i2);
    }

    public static final void LIZ(TuxIconView tuxIconView, int[] iArr, float[] fArr, float f, float f2, float f3, float f4, int i) {
        Drawable drawable;
        Drawable drawableMutate;
        if (tuxIconView.getWidth() != 0 && tuxIconView.getHeight() != 0 && (drawable = tuxIconView.getDrawable()) != null && drawable.mutate() != null) {
            Drawable drawable2 = tuxIconView.getDrawable();
            if (drawable2 != null && (drawableMutate = drawable2.mutate()) != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(tuxIconView.getWidth(), tuxIconView.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableMutate.setBounds(0, 0, tuxIconView.getWidth(), tuxIconView.getHeight());
                drawableMutate.draw(canvas);
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(f * tuxIconView.getWidth(), f3 * tuxIconView.getHeight(), f2 * tuxIconView.getWidth(), f4 * tuxIconView.getHeight(), iArr, fArr, Shader.TileMode.CLAMP));
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawRect(0.0f, 0.0f, tuxIconView.getWidth(), tuxIconView.getHeight(), paint);
                tuxIconView.setImageBitmap(bitmapCreateBitmap);
                return;
            }
            return;
        }
        if (i < 3) {
            HandlerHook.viewPost(tuxIconView, new ARunnableS0S0301004_6(tuxIconView, iArr, fArr, f, f2, f3, f4, i, 1));
        }
    }
}
