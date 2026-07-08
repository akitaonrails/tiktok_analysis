package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.IPipelineListener;
import com.ss.android.ugc.aweme.music.understanding.PipelineTag;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08sC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2253008sC implements IPipelineListener {
    public static final C2253008sC LIZ = new C2253008sC();
    public static final ConcurrentHashMap<PipelineTag, Long> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<PipelineTag, Long> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<PipelineTag, ConcurrentHashMap<String, Long>> LIZLLL = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    public final void onFinishFailed(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, Throwable th, int i) {
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    /* JADX INFO: renamed from: onNodeFailed-qawT-gY */
    public final void mo16onNodeFailedqawTgY(PipelineTag pipelineTag, String str, Throwable th, int i) {
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    /* JADX INFO: renamed from: onNodeStart-R6Iu3AI */
    public final void mo17onNodeStartR6Iu3AI(PipelineTag pipelineTag, String str) {
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    /* JADX INFO: renamed from: onNodeSuccess-qawT-gY */
    public final void mo18onNodeSuccessqawTgY(PipelineTag pipelineTag, String str, ContentUnderstandingResult contentUnderstandingResult, boolean z) {
    }

    public static long LIZ(C2253208sE c2253208sE) {
        Long l = LIZJ.get(c2253208sE);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    public final void onStart(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest) {
        LIZIZ.put(pipelineTag, Long.valueOf(SystemClock.elapsedRealtime()));
        LIZJ.put(pipelineTag, 0L);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    public final void onFinishSuccess(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, ContentUnderstandingResult contentUnderstandingResult) {
        ContentUnderstandingResult.RequestResult requestResult;
        String understandingKey;
        ConcurrentHashMap<String, Long> concurrentHashMapPutIfAbsent;
        Long lRemove = LIZIZ.remove(pipelineTag);
        if (lRemove != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - lRemove.longValue();
            LIZJ.put(pipelineTag, Long.valueOf(jElapsedRealtime));
            if ((contentUnderstandingResult instanceof ContentUnderstandingResult.RequestResult) && (requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResult) != null && (understandingKey = requestResult.getUnderstandingKey()) != null && understandingKey.length() != 0) {
                ConcurrentHashMap<PipelineTag, ConcurrentHashMap<String, Long>> concurrentHashMap = LIZLLL;
                ConcurrentHashMap<String, Long> concurrentHashMap2 = concurrentHashMap.get(pipelineTag);
                if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(pipelineTag, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                    concurrentHashMap2 = concurrentHashMapPutIfAbsent;
                }
                concurrentHashMap2.put(understandingKey, Long.valueOf(jElapsedRealtime));
            }
        }
    }
}
