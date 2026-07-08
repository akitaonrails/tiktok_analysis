package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08sS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2254608sS {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        String strLJJIJIIJI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIIJI(videoPublishEditModel, str.substring(a0.LJJJJI(str, File.separator, 0, 6) + 1));
        if (C2286708xd.LIZJ(strLJJIJIIJI)) {
            return strLJJIJIIJI;
        }
        return str;
    }
}
