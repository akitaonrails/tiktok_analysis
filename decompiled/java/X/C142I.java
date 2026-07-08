package X;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.net.URI;

/* JADX INFO: renamed from: X.142I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C142I {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZLLL() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.build.display.id");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            str = null;
        }
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains("flyme");
    }

    public static long LIZIZ(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                long jFloatValue = (long) Float.valueOf(C20144413ru.LIZJ(mediaMetadataRetriever)).floatValue();
                try {
                    mediaMetadataRetriever.release();
                    return jFloatValue;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return jFloatValue;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                try {
                    mediaMetadataRetriever.release();
                    return -1L;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return -1L;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                throw th;
            }
        }
    }

    public static String LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URI(str).getHost();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJ("music url illegal");
            return null;
        }
    }

    public static boolean LJ(MusicModel musicModel) {
        if (musicModel.getUrl() != null && !TextUtils.isEmpty(musicModel.getUrl().getUri()) && !C086I.LIZIZ(musicModel.getUrl().getUrlList()) && musicModel.getMusicStatus() != 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(MusicModel musicModel, Context context, boolean z) {
        if (musicModel == null) {
            return false;
        }
        if (!TextUtils.isEmpty(musicModel.getLocalPath()) || LJ(musicModel)) {
            return true;
        }
        if (z) {
            String offlineDesc = musicModel.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = context.getString(2131837770);
            }
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZJ(offlineDesc);
            c1233040iBy.LIZLLL();
        }
        return false;
    }
}
