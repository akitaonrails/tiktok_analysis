package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540280LGw {
    public static Bitmap LIZ(String str) {
        try {
            byte[] bArrDecode = Base64.decode((String) a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6).get(1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static int LIZIZ(Activity activity, TokenCert tokenCert, Function1 function1) {
        if (Build.VERSION.SDK_INT >= 33) {
            return ((Number) function1.invoke(Boolean.FALSE)).intValue();
        }
        if (C838410Wul.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return ((Number) function1.invoke(Boolean.FALSE)).intValue();
        }
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        if (C838410Wul.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            ((Number) function1.invoke(Boolean.FALSE)).intValue();
            return 2;
        }
        if (!(activity instanceof C19EG)) {
            return 2;
        }
        C19514711Wn.LIZIZ.LIZIZ(activity, tokenCert).LIZIZ((String[]) Arrays.copyOf(strArr, 1)).LIZJ(new C462970IDn(activity, function1, 4));
        return 2;
    }

    public static Uri LIZJ(Context context, Bitmap bitmap, String str) {
        if (bitmap == null) {
            return null;
        }
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        try {
            Uri uriLIZIZ = C2400409as.LIZIZ(context, str, "image/png");
            if (uriLIZIZ != null) {
                OutputStream outputStreamLJFF = C09NT.LJFF(context.getContentResolver(), uriLIZIZ);
                if (outputStreamLJFF != null) {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamLJFF);
                }
                return uriLIZIZ;
            }
            throw new IOException();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
