package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;

/* JADX INFO: renamed from: X.0KlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526710KlB {
    public static AutoCutMediaModel LIZ(Context context, MediaModel mediaModel) {
        String strLJIJ = C2471909mP.LJIJ(mediaModel);
        if (!C2286708xd.LIZJ(strLJIJ) && context != null) {
            strLJIJ = C09N5.LIZ(context, UriProtector.parse(mediaModel.LJFF()));
        }
        if (strLJIJ == null) {
            strLJIJ = "";
        }
        return new AutoCutMediaModel(strLJIJ, mediaModel.LJFF(), mediaModel.LJFF(), mediaModel.width, mediaModel.height, mediaModel.LJIILJJIL(), mediaModel.duration, 0L, 0L, 0.0f, mediaModel.LJIIL(), null, Long.valueOf(mediaModel.date), 2944, null);
    }
}
