package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0mGL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389510mGL {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final EnumC912680ZrG LIZJ;

    public static String LIZIZ(String str) {
        C1575530r6N.LIZ.getClass();
        C0VSJ c0vsj = new C0VSJ(C1575530r6N.LIZIZ(), str);
        if (!c0vsj.exists()) {
            return null;
        }
        return c0vsj.getAbsolutePath();
    }

    public static String LIZLLL(String str) throws Throwable {
        BufferedReader bufferedReader;
        try {
            Reader inputStreamReader = new InputStreamReader(new C0VSP(new C0VSJ(str)), Charsets.UTF_8);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            try {
                String strLIZJ = C08KC.LIZJ(bufferedReader);
                C2107108Nh.LIZ(bufferedReader, null);
                return strLIZJ;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                }
                try {
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedReader, th);
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJ(C427660Gpo c427660Gpo) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LIZ = 0;
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a0o);
        c427660Gpo.setForeground(c384050F3z.LIZ(c427660Gpo.getContext()));
    }

    public C1389510mGL(C19EG c19eg, C19EG c19eg2, EnumC912680ZrG enumC912680ZrG) {
        this.LIZ = c19eg;
        this.LIZIZ = c19eg2;
        this.LIZJ = enumC912680ZrG;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0257 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> r24, java.lang.Integer r25, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r26) {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1389510mGL.LIZ(java.util.List, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    public final Object LIZJ(final C427660Gpo c427660Gpo, UrlModel urlModel, C1389520mGM c1389520mGM) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c1389520mGM));
        C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel)).LJJII(new AbstractC468201s0() { // from class: X.0Gok
            @Override // X.AbstractC468201s0, X.InterfaceC1331910klR
            public final void onCanceled() {
                InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                Boolean bool = Boolean.FALSE;
                C189200o6.m2constructorimpl(bool);
                interfaceC1364105Vn.resumeWith(bool);
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                Bitmap bitmapCreateBitmap;
                if (bitmap == null) {
                    bitmapCreateBitmap = null;
                } else {
                    int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
                    bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    float f = (r2 - iMin) / 2.0f;
                    Matrix matrix = new Matrix();
                    matrix.setTranslate(-((r1 - iMin) / 2.0f), -f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    float f2 = iMin / 2.0f;
                    canvas.drawCircle(f2, f2, f2, paint);
                }
                c427660Gpo.setImageBitmap(bitmapCreateBitmap);
                C1389510mGL c1389510mGL = this;
                C427660Gpo c427660Gpo2 = c427660Gpo;
                c1389510mGL.getClass();
                C1389510mGL.LJ(c427660Gpo2);
                InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                Boolean bool = Boolean.TRUE;
                C189200o6.m2constructorimpl(bool);
                interfaceC1364105Vn.resumeWith(bool);
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                C427660Gpo c427660Gpo2 = c427660Gpo;
                c427660Gpo2.setImageDrawable(C800330VaR.LIZIZ(c427660Gpo2.getContext(), R.drawable.c5w));
                C1575440r6E.LIZIZ("vibe_feed_like_avatar_loading_failed", null);
                C1389510mGL c1389510mGL = this;
                C427660Gpo c427660Gpo3 = c427660Gpo;
                c1389510mGL.getClass();
                C1389510mGL.LJ(c427660Gpo3);
                InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                Boolean bool = Boolean.TRUE;
                C189200o6.m2constructorimpl(bool);
                interfaceC1364105Vn.resumeWith(bool);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c1389520mGM);
        }
        return objLIZ;
    }
}
