package X;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09mO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2471809mO {
    public static final /* synthetic */ int LIZ = 0;

    public static Uri LIZ(String str) {
        if (!u.LJJIIJZLJL(str, "content://", false) && !u.LJJIIJZLJL(str, "file://", false)) {
            return Uri.fromFile(new C0VSJ(str));
        }
        return UriProtector.parse(str);
    }

    public static Bitmap LIZIZ(String str) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                try {
                    mediaMetadataRetriever.release();
                    return frameAtTime;
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return frameAtTime;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    mediaMetadataRetriever.release();
                    throw th;
                } catch (RuntimeException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw th;
                }
            }
        } catch (IllegalArgumentException e3) {
            TryCatchGuardChecker.doCheck(e3);
            try {
                mediaMetadataRetriever.release();
                return null;
            } catch (RuntimeException e4) {
                TryCatchGuardChecker.doCheck(e4);
                return null;
            }
        } catch (RuntimeException e5) {
            TryCatchGuardChecker.doCheck(e5);
            mediaMetadataRetriever.release();
            return null;
        }
    }
}
