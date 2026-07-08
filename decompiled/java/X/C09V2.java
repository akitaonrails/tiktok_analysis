package X;

import android.content.Context;
import com.ss.android.ugc.aweme.minis.performance.video.MinisPreloadVideoMetadata;
import java.io.File;

/* JADX INFO: renamed from: X.09V2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09V2 {
    public static final /* synthetic */ int LIZ = 0;

    public static MinisPreloadVideoMetadata LIZ(String str, String str2) {
        File fileLIZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPreloadVideoMetadataIfExists, clientKey:");
        sbLIZ.append(str);
        sbLIZ.append(", resourceUrl:");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ != null && (fileLIZ = C08CZ.LIZ(contextLIZ, str, str2, "json")) != null && fileLIZ.exists()) {
            return C08CZ.LIZIZ(fileLIZ);
        }
        return null;
    }

    public static boolean LIZIZ(MinisPreloadVideoMetadata minisPreloadVideoMetadata, Long l) {
        if (minisPreloadVideoMetadata.totalBytes <= 0) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isMetaDataValid, invalid totalBytes:");
            sbLIZ.append(minisPreloadVideoMetadata.totalBytes);
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        String str = minisPreloadVideoMetadata.contentRange;
        if (str != null && str.length() != 0) {
            String str2 = minisPreloadVideoMetadata.contentType;
            if (str2 != null && str2.length() != 0) {
                String str3 = minisPreloadVideoMetadata.videoType;
                if (str3 != null && str3.length() != 0) {
                    String str4 = minisPreloadVideoMetadata.contentLength;
                    if (str4 != null && str4.length() != 0) {
                        long j = minisPreloadVideoMetadata.contentLengthInBytes;
                        if (j <= 0) {
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("isMetaDataValid, invalid contentLengthInBytes:");
                            sbLIZ2.append(minisPreloadVideoMetadata.contentLengthInBytes);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            return false;
                        }
                        if (minisPreloadVideoMetadata.totalBytes < j) {
                            int i3 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("isMetaDataValid, invalid totalBytes:");
                            sbLIZ3.append(minisPreloadVideoMetadata.totalBytes);
                            sbLIZ3.append(", less than contentLengthInBytes:");
                            sbLIZ3.append(minisPreloadVideoMetadata.contentLengthInBytes);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            return false;
                        }
                        if (l != null) {
                            long jLongValue = l.longValue();
                            if (jLongValue != minisPreloadVideoMetadata.contentLengthInBytes) {
                                int i4 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("isMetaDataValid, invalid contentLengthInBytes:");
                                sbLIZ4.append(minisPreloadVideoMetadata.contentLengthInBytes);
                                sbLIZ4.append(", not match with videoFile length:");
                                sbLIZ4.append(jLongValue);
                                C2188811AlT.LIZIZ(sbLIZ4);
                                return false;
                            }
                        }
                        return true;
                    }
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("isMetaDataValid, invalid contentLength:");
                    sbLIZ5.append(minisPreloadVideoMetadata.contentLength);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    return false;
                }
                int i6 = C2187451AjH.LIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("isMetaDataValid, invalid videoType:");
                sbLIZ6.append(minisPreloadVideoMetadata.videoType);
                C2188811AlT.LIZIZ(sbLIZ6);
                return false;
            }
            int i7 = C2187451AjH.LIZ;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("isMetaDataValid, invalid contentType:");
            sbLIZ7.append(minisPreloadVideoMetadata.contentType);
            C2188811AlT.LIZIZ(sbLIZ7);
            return false;
        }
        int i8 = C2187451AjH.LIZ;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("isMetaDataValid, invalid contentRange:");
        sbLIZ8.append(minisPreloadVideoMetadata.contentRange);
        C2188811AlT.LIZIZ(sbLIZ8);
        return false;
    }
}
