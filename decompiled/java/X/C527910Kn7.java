package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;
import java.util.List;

/* JADX INFO: renamed from: X.0Kn7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527910Kn7 {
    public static final List<Integer> LIZ = C1697810uHb.LJIIJJI(0, 53, 22);
    public static int LIZIZ;
    public static boolean LIZJ;

    public static boolean LIZ() {
        UploadSingleSelectData uploadSingleSelectDataLIZ;
        if (!LIZ.contains(Integer.valueOf(LIZIZ))) {
            return false;
        }
        UploadSingleSelectData uploadSingleSelectDataLIZ2 = C527940KnA.LIZ();
        return (uploadSingleSelectDataLIZ2 != null && uploadSingleSelectDataLIZ2.getUpload3Columns() && C527940KnA.LIZJ()) || ((uploadSingleSelectDataLIZ = C527940KnA.LIZ()) != null && uploadSingleSelectDataLIZ.getUpload3ColumnsNonStory() && C527940KnA.LIZIZ());
    }

    public static boolean LIZIZ() {
        UploadSingleSelectData uploadSingleSelectDataLIZ;
        if (LIZJ) {
            return false;
        }
        if (!LIZ.contains(Integer.valueOf(LIZIZ))) {
            return false;
        }
        UploadSingleSelectData uploadSingleSelectDataLIZ2 = C527940KnA.LIZ();
        return (uploadSingleSelectDataLIZ2 != null && uploadSingleSelectDataLIZ2.getUploadSingleSelect() && C527940KnA.LIZJ()) || ((uploadSingleSelectDataLIZ = C527940KnA.LIZ()) != null && uploadSingleSelectDataLIZ.getUploadSingleSelectNonStory() && C527940KnA.LIZIZ());
    }
}
