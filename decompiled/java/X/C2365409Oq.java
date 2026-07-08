package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09Oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2365409Oq {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(String str) {
        Object c098200Yq;
        try {
            byte[] bArrDecode = Base64.decode(str.substring(a0.LJJJ(str, "base64,", 0, false, 6) + 7), 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inSampleSize = 1;
            options.inJustDecodeBounds = false;
            c098200Yq = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Bitmap) c098200Yq;
    }

    public static TypedByteArray LIZIZ(byte[] bArr) {
        return new TypedByteArray("image/jpeg", bArr, "image");
    }
}
