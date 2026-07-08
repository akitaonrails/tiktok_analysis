package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nMQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431720nMQ extends C09AY implements Function1<VideoPublishEditModel, List<? extends String>> {
    public C1431720nMQ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends String> invoke(VideoPublishEditModel videoPublishEditModel) {
        String aiGeneratedSource;
        C140D.LIZ.getClass();
        List<AIGCInfo> list = C140D.LJJIIZ(videoPublishEditModel).LIZ;
        ArrayList arrayList = new ArrayList();
        for (AIGCInfo aIGCInfo : list) {
            if (aIGCInfo != null && (aiGeneratedSource = aIGCInfo.getAiGeneratedSource()) != null) {
                arrayList.add(aiGeneratedSource);
            }
        }
        return arrayList;
    }
}
