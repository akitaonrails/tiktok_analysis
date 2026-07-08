package X;

import com.ss.android.ugc.aweme.creative.model.AutoPickMediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;

/* JADX INFO: renamed from: X.0KiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525010KiR {
    public static AutoPickMediaModel LIZ(MediaModel mediaModel) {
        String str = mediaModel.id;
        String strLJIJ = C2471909mP.LJIJ(mediaModel);
        if (strLJIJ == null) {
            strLJIJ = "";
        }
        return new AutoPickMediaModel(strLJIJ, mediaModel.width, mediaModel.height, mediaModel.LJIILJJIL(), mediaModel.duration, mediaModel.LJFF(), str);
    }
}
