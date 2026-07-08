package X;

import com.ss.android.ugc.aweme.transcript.IMVoiceTranscribeModel;
import com.ss.android.ugc.aweme.transcript.IMVoiceTranscribeResponse;
import com.ss.android.ugc.aweme.transcript.ServerTranscriptHints;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.005o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0226005o {
    public static IMVoiceTranscribeModel LIZ(IMVoiceTranscribeResponse iMVoiceTranscribeResponse) {
        String str = iMVoiceTranscribeResponse.transcript;
        List<ServerTranscriptHints> list = iMVoiceTranscribeResponse.hints;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (ServerTranscriptHints serverTranscriptHints : list) {
            arrayList.add(new IMVoiceTranscribeModel.Hints(serverTranscriptHints.startTimeMs, serverTranscriptHints.endTimeMs, serverTranscriptHints.startIndex, serverTranscriptHints.endIndex));
        }
        return new IMVoiceTranscribeModel(str, arrayList);
    }
}
