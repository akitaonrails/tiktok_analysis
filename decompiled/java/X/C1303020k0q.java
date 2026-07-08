package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0k0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303020k0q extends AbstractC1303030k0r {
    public final Context LIZ;
    public final Uri LIZIZ;

    public final boolean LIZ() {
        Context context = this.LIZ;
        Uri uri = this.LIZIZ;
        boolean z = false;
        Cursor cursorLJJJ = null;
        try {
            try {
                cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), uri, new String[]{"document_id"}, null, null, null, new C0WZX("dTF6Tg0zW9KSUVgiUB+BaHuUMqRp6zNetEKcAvLzu0T7JjzA2S3tgD/jVxHuZSDh60hhAVg=", new String[]{"01789"}));
                if (cursorLJJJ.getCount() > 0) {
                    z = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1303010k0p.LIZ(cursorLJJJ);
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1303010k0p.LIZ(cursorLJJJ);
            throw th;
        }
    }

    public C1303020k0q(Context context, Uri uri) {
        this.LIZ = context;
        this.LIZIZ = uri;
    }
}
