package X;

import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.CommentAudioModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentLivePhotoInfoModel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0l6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345110l6j {
    public static final void LIZ(AppCompatTextView appCompatTextView) {
        int i;
        if (appCompatTextView != null) {
            if (C444960Hcc.LIZJ(appCompatTextView.getContext())) {
                i = 5;
            } else {
                i = 3;
            }
            appCompatTextView.setGravity(i);
        }
    }

    public static final List<CommentImageStruct> LIZIZ(List<CommentImageModel> list) {
        int i;
        String str;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (CommentImageModel commentImageModel : list) {
            CommentImageStruct commentImageStruct = new CommentImageStruct();
            commentImageStruct.setOriginUrl(commentImageModel);
            commentImageStruct.setCropUrl(commentImageModel);
            String uri = commentImageModel.getUri();
            boolean z = true;
            if (uri != null && uri.length() != 0) {
                i = 100;
            } else {
                i = 0;
            }
            commentImageStruct.setProgress(i);
            commentImageStruct.setSource(commentImageModel.getSource());
            commentImageStruct.setWidth(commentImageModel.getWidth());
            commentImageStruct.setHeight(commentImageModel.getHeight());
            CommentLivePhotoInfoModel commentLivePhotoInfoModel = new CommentLivePhotoInfoModel(commentImageModel.getVideoId(), null, commentImageModel.getVideoPath());
            String str2 = commentLivePhotoInfoModel.videoId;
            if ((str2 != null && str2.length() != 0) || ((str = commentLivePhotoInfoModel.localVideoPath) != null && str.length() != 0)) {
                z = false;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                commentLivePhotoInfoModel = null;
            }
            commentImageStruct.setLivePhotoInfoModel(commentLivePhotoInfoModel);
            arrayList.add(commentImageStruct);
        }
        return arrayList;
    }

    public static final AudioCommentModel LIZJ(CmtAudioStruct cmtAudioStruct) {
        long jLongValue;
        if (cmtAudioStruct == null) {
            return null;
        }
        List<Float> listLJ = LJ(cmtAudioStruct.getWave());
        if (cmtAudioStruct.getAudioModel() == null) {
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String content = cmtAudioStruct.getContent();
                c1227904rF.getClass();
                cmtAudioStruct.setAudioModel((CommentAudioModel) C1227904rF.LIZIZ(content, CommentAudioModel.class));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String localPath = cmtAudioStruct.getLocalPath();
        if (localPath == null) {
            localPath = "";
        }
        Long durationMillis = cmtAudioStruct.getDurationMillis();
        if (durationMillis != null) {
            jLongValue = durationMillis.longValue();
        } else {
            jLongValue = 0;
        }
        return new AudioCommentModel(localPath, jLongValue, listLJ, null, 0L, null, cmtAudioStruct.getVid(), cmtAudioStruct.getContent(), cmtAudioStruct.getAudioModel(), 56, null);
    }

    public static final float LIZLLL(List<Float> list) {
        double dLJJIZ;
        if (list != null) {
            dLJJIZ = C13LP.LJJIZ(list);
        } else {
            dLJJIZ = 0.0d;
        }
        return new BigDecimal(dLJJIZ).setScale(4, RoundingMode.UP).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.Float> LJ(java.lang.String r3) {
        /*
            if (r3 == 0) goto L33
            java.lang.String r0 = ","
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L2f
            r1 = 0
            r0 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r3, r2, r1, r0)     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L33
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2f
            r2.<init>()     // Catch: java.lang.Exception -> L2f
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Exception -> L2f
        L19:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L2f
            java.lang.Float r0 = X.C2327809Ae.LJIIIIZZ(r0)     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L19
            r2.add(r0)     // Catch: java.lang.Exception -> L2f
            goto L19
        L2f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L33:
            r2 = 0
        L34:
            if (r2 != 0) goto L38
            X.13BV r2 = X.C13BV.INSTANCE
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345110l6j.LJ(java.lang.String):java.util.List");
    }
}
