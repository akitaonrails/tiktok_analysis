package X;

import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;

/* JADX INFO: renamed from: X.0nT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435840nT4 {
    public static final CompileLevel LIZ(int i) {
        switch (i) {
            case 0:
                return CompileLevel.REENCODE;
            case 1:
                return CompileLevel.REMUX;
            case 2:
                return CompileLevel.COPY_WITH_METADATA;
            case 3:
                return CompileLevel.COPY;
            case 4:
                return CompileLevel.CONCAT_WITH_METADATA;
            case 5:
                return CompileLevel.UPLOAD_DIRECTLY;
            case 6:
                return CompileLevel.CLOUD_PROCESS_WITH_MUSIC;
            case 7:
                return CompileLevel.PIC_UPLOAD_DIRECTLY;
            case 8:
                return CompileLevel.REMUX_VIDEO_AND_AUDIO;
            default:
                return CompileLevel.UNKNOWN;
        }
    }
}
