package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0F2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383680F2o {
    public static final void LIZIZ(View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(C20642515q3.LIZIZ(R.attr.zg));
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        if (C423170GiZ.LIZ(view.getContext())) {
            gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, 0.0f, 0.0f, fLIZIZ2, fLIZIZ2, 0.0f, 0.0f});
        } else {
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, fLIZIZ, fLIZIZ, 0.0f, 0.0f, fLIZIZ2, fLIZIZ2});
        }
        view.setBackground(gradientDrawable);
    }

    public static final float LIZ(Context context, String str) {
        int iLJFF;
        int i;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            if (C2471909mP.LJJIIZI(str)) {
                Uri uri = UriProtector.parse(str);
                InputStream inputStreamLJ = C09NT.LJ(context.getContentResolver(), uri);
                Throwable th = null;
                if (inputStreamLJ != null) {
                    try {
                        BitmapFactory.decodeStream(inputStreamLJ, null, options);
                        C2107108Nh.LIZ(inputStreamLJ, null);
                    } finally {
                        try {
                            try {
                            } catch (Throwable th2) {
                                while (true) {
                                }
                            }
                        } catch (Throwable th3) {
                        }
                    }
                }
                inputStreamLJ = C09NT.LJ(context.getContentResolver(), uri);
                if (inputStreamLJ != null) {
                    try {
                        iLJFF = new C2259271Dbp(inputStreamLJ).LJFF(1);
                        C2107108Nh.LIZ(inputStreamLJ, null);
                    } finally {
                        try {
                            try {
                            } catch (Throwable th4) {
                                while (true) {
                                }
                            }
                        } catch (Throwable th5) {
                        }
                    }
                } else {
                    iLJFF = 1;
                }
            } else {
                BitmapFactory.decodeFile(str, options);
                iLJFF = new C2259271Dbp(str).LJFF(1);
            }
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            if (i2 <= 0 || i3 <= 0) {
                return 0.75f;
            }
            if (iLJFF != 6 && iLJFF != 8 && iLJFF != 5 && iLJFF != 7) {
                i = i2;
                i2 = i3;
            } else {
                i = i3;
            }
            return i / i2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0.75f;
        }
    }
}
