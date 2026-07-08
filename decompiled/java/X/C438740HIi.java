package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.text.u;
import lth.o;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0HIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438740HIi {
    public Bitmap LIZ;

    public static String LJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_save_local_watermark_with_draft_multi_language", true, false) ? o.LIZ.getString(2131844974) : "Draft";
    }

    public final boolean LJFF(String str) throws Throwable {
        C0VSV c0vsv;
        if (this.LIZ == null) {
            C201955140j.LJ("mBitmap is null");
            return false;
        }
        C0VSV c0vsv2 = null;
        try {
            try {
                c0vsv = new C0VSV(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e) {
            e = e;
        }
        try {
            this.LIZ.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
            try {
                c0vsv.close();
                return true;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return true;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsv2 != null) {
                try {
                    c0vsv2.close();
                    return false;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(th);
            if (c0vsv2 != null) {
                try {
                    c0vsv2.close();
                    throw th;
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }

    public final C438740HIi LIZ(int i, int i2) {
        InterfaceC438770HIl c421240GfS;
        if (i > 0 && i2 > 0) {
            float fMin = Math.min(i, i2) / C418440Gaw.LIZIZ(750);
            int iIntValue = ((Number) C277880Auo.LIZ.getValue()).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    c421240GfS = new C03CD(C1BWL.LIZ());
                } else {
                    c421240GfS = new C03CD(C1BWL.LIZ());
                }
            } else {
                c421240GfS = new C421240GfS(C1BWL.LIZ());
            }
            c421240GfS.LIZ(fMin);
            View viewLLLILZJ = c421240GfS.LLLILZJ();
            viewLLLILZJ.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            viewLLLILZJ.layout(0, 0, viewLLLILZJ.getMeasuredWidth(), viewLLLILZJ.getMeasuredHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewLLLILZJ.getMeasuredWidth(), viewLLLILZJ.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            viewLLLILZJ.draw(new Canvas(bitmapCreateBitmap));
            this.LIZ = bitmapCreateBitmap;
            return this;
        }
        return null;
    }

    public final void LIZIZ(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2) {
        float fMin;
        int iCeil;
        int width;
        int i3;
        float f;
        int width2;
        float f2;
        if (i != 0 && i2 != 0) {
            fMin = Math.min(i / 750.0f, i2 / 750.0f);
        } else {
            fMin = 1.0f;
        }
        Resources resources = o.LIZ.getResources();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (90 * fMin), (int) (87 * fMin), true);
        if (TextUtils.isEmpty(str)) {
            this.LIZ = bitmapCreateScaledBitmap;
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(resources.getColor(R.color.uj));
        float f3 = 20 * fMin;
        textPaint.setTextSize(f3);
        C12ES.LIZJ(1.0f, o.LIZ);
        textPaint.setShadowLayer(0.0f, 1.0f, 4.0f, resources.getColor(R.color.i5));
        int i4 = (int) f3;
        int iMeasureText = (int) (textPaint.measureText(str) + (5.0f * fMin));
        int width3 = bitmapCreateScaledBitmap.getWidth();
        if (z) {
            iCeil = ((int) Math.ceil(4 * fMin)) + i4;
        } else {
            iCeil = 0;
        }
        int iMax = Math.max(width3, iCeil + iMeasureText);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, (int) (bitmapCreateScaledBitmap.getHeight() + (28 * fMin)), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (z) {
            Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, R.drawable.c8s, null), i4, i4, true);
            if (z2) {
                f = 0.0f;
            } else {
                f = (iMax - iMeasureText) - (i4 + (fMin * 4.0f));
            }
            canvas.drawBitmap(bitmapCreateScaledBitmap2, f, bitmapCreateScaledBitmap.getHeight() + (6 * fMin), paint);
            if (z2) {
                width2 = 0;
            } else {
                width2 = (iMax - bitmapCreateScaledBitmap.getWidth()) + 3;
            }
            canvas.drawBitmap(bitmapCreateScaledBitmap, width2, 0.0f, paint);
            if (z2) {
                f2 = i4 + (4.0f * fMin);
            } else {
                f2 = iMax - iMeasureText;
            }
            canvas.drawText(str, f2, (bitmapCreateScaledBitmap.getHeight() - textPaint.ascent()) + (4 * fMin), textPaint);
        } else {
            if (z2) {
                width = 0;
            } else {
                width = (iMax - bitmapCreateScaledBitmap.getWidth()) + 3;
            }
            canvas.drawBitmap(bitmapCreateScaledBitmap, width, 0.0f, paint);
            if (z2) {
                i3 = 0;
            } else {
                i3 = iMax - iMeasureText;
            }
            canvas.drawText(str, i3, (bitmapCreateScaledBitmap.getHeight() - textPaint.ascent()) + (4 * fMin), textPaint);
        }
        this.LIZ = bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r40, int r41, java.lang.String r42, android.graphics.Bitmap r43, boolean r44, boolean r45, X.C438780HIm r46) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C438740HIi.LIZLLL(int, int, java.lang.String, android.graphics.Bitmap, boolean, boolean, X.0HIm):void");
    }

    public final C438740HIi LIZJ(int i, int i2, String str, int i3, boolean z, boolean z2, boolean z3, C438780HIm c438780HIm) {
        String strSubstring = str;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(o.LIZ.getResources(), i3, null);
        if (c438780HIm.LIZIZ && C438760HIk.LIZ() && strSubstring != null) {
            if (u.LJJIIJZLJL(strSubstring, e3.g, false) && strSubstring.length() > 1) {
                strSubstring = strSubstring.substring(1);
            }
            C438750HIj.LIZ.getClass();
            this.LIZ = C438750HIj.LIZIZ(i, i2, strSubstring, false);
            return this;
        }
        if (!z2) {
            LIZLLL(i, i2, strSubstring, bitmapDecodeResource, z, z3, c438780HIm);
            return this;
        }
        LIZIZ(i, i2, strSubstring, bitmapDecodeResource, z, z3);
        return this;
    }
}
