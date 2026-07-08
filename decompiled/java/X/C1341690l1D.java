package X;

import android.app.Activity;
import android.media.AudioManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModelKt;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0l1D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341690l1D {
    public static long LIZ;
    public static Float LIZIZ;

    public static Float LIZLLL() {
        float fZ3;
        float streamVolume;
        Activity activityLIZIZ;
        int i = ((System.currentTimeMillis() - LIZ) > 500L ? 1 : ((System.currentTimeMillis() - LIZ) == 500L ? 0 : -1));
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Object objH2 = (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? null : C786410Ut5.H2(activityLIZIZ, "audio");
        AudioManager audioManager = objH2 instanceof AudioManager ? (AudioManager) objH2 : null;
        if (audioManager != null) {
            fZ3 = C786410Ut5.Z3(audioManager, 3);
            streamVolume = audioManager.getStreamVolume(3);
        } else {
            fZ3 = 1.0f;
            streamVolume = 0.0f;
        }
        LIZIZ = Float.valueOf(streamVolume / fZ3);
        LIZ = System.currentTimeMillis();
        return LIZIZ;
    }

    public static int LIZ(long j) {
        int i = (int) ((j + ((long) 500)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        if (i <= 0) {
            return 0;
        }
        if (i <= 10) {
            return i + 4;
        }
        if (i <= 20) {
            return ((i - 10) / 2) + 14;
        }
        return ((Math.min(i, 60) - 20) / 10) + 19;
    }

    public static List LIZIZ(int i, List list) {
        float[] fArrLLI = C13LP.LLI(list);
        if (fArrLLI.length <= 1) {
            return C13LQ.LJJLIL(fArrLLI);
        }
        if (i <= 1) {
            return Collections.singletonList(Float.valueOf(C13LQ.LJIJJ(fArrLLI)));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(C13LQ.LJIJJ(fArrLLI)));
        float length = 1.0f / (fArrLLI.length - 1);
        int i2 = i - 1;
        int i3 = 1;
        while (true) {
            float f = 0.0f;
            if (i3 >= i2) {
                break;
            }
            float f2 = i3 / i2;
            int iLJ = C13LZ.LJ((int) (f2 / length), 0, fArrLLI.length - 2);
            float f3 = f2 - (iLJ * length);
            if (f3 >= 0.0f) {
                f = f3;
            }
            float f4 = fArrLLI[iLJ];
            arrayList.add(Float.valueOf(f4 + ((f / length) * (fArrLLI[iLJ + 1] - f4))));
            i3++;
        }
        arrayList.add(Float.valueOf(C13LQ.LJJJI(fArrLLI)));
        float fMax = Math.max(0.0f, Math.min(1.0f, 0.5f));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Float.valueOf(0.0f));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf((((Number) it2.next()).floatValue() * fMax) + ((1 - fMax) * ((Number) ListProtector.get(arrayList2, arrayList2.size() - 1)).floatValue())));
        }
        C19719612Di.LJJIIZ(arrayList2);
        return arrayList2;
    }

    public static String LIZJ(Comment comment, CommentContextSource commentContextSource) {
        CmtAudioStruct audioStruct;
        String playId;
        String aid;
        EnumC1342450l2R currSortType = null;
        if (comment != null) {
            audioStruct = comment.getAudioStruct();
        } else {
            audioStruct = null;
        }
        AudioCommentModel audioCommentModelLIZJ = C1345110l6j.LIZJ(audioStruct);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (audioCommentModelLIZJ != null) {
            playId = AudioCommentModelKt.getPlayId(audioCommentModelLIZJ);
        } else {
            playId = null;
        }
        sbLIZ.append(playId);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(CommentContextSourceKt.enterFrom(commentContextSource));
        Aweme aweme = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ2.append(aid);
        if (commentContextSource != null) {
            currSortType = commentContextSource.getCurrSortType();
        }
        sbLIZ2.append(currSortType);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2).hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
