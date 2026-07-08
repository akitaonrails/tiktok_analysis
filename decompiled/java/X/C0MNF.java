package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MNF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MNF {
    public static Pair LIZ(Context context, VideoPublishEditModel videoPublishEditModel) {
        String strLIZLLL;
        ForwardMedia forwardMedia;
        C0MM9 c0mm9;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        Object[] objArr = new Object[1];
        C0MND c0mnd = videoPublishEditModel.creativeModel.commentForwardModel;
        if (c0mnd != null && (forwardMedia = c0mnd.LIZIZ) != null && (c0mm9 = forwardMedia.author) != null) {
            C0MM5.LIZ.getClass();
            strLIZLLL = C0MM5.LIZLLL(c0mm9);
        } else {
            strLIZLLL = "";
        }
        objArr[0] = strLIZLLL;
        sbLIZ.append(context.getString(2131824810, objArr));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(context.getString(2131824809));
        sbLIZ2.append(' ');
        sbLIZ2.append(strLIZIZ);
        return new Pair(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
