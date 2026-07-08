package X;

import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetail;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Xhw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855940Xhw {
    public static PreCheckResult LIZ(PreCheckResultModel preCheckResultModel) {
        if (preCheckResultModel == null) {
            return null;
        }
        ArrayList<MusicInfo> arrayList = preCheckResultModel.musicInfos;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList<MatchDetail> arrayList2 = preCheckResultModel.matchDetails;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        ArrayList<MatchDetailsV1> arrayList3 = preCheckResultModel.matchDetailsV1;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList<>();
        }
        ArrayList<UnavailableReason> arrayList4 = preCheckResultModel.unavailableReasons;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList<>();
        }
        return new PreCheckResult(arrayList, arrayList2, arrayList3, arrayList4, 0, "", 0, null);
    }
}
