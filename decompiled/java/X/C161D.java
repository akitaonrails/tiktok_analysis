package X;

import com.ss.android.ugc.aweme.translation.delegates.ITranslationFeedbackDelegate;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.161D, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C161D implements ITranslationFeedbackDelegate {
    public static final C161D LIZ = new C161D();
    public static final ConcurrentHashMap<String, C207088161u> LIZIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.translation.delegates.ITranslationFeedbackDelegate
    public final C207088161u getInfo(String str) {
        if (C123100dR.LIZ(str)) {
            return LIZIZ.get(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.translation.delegates.ITranslationFeedbackDelegate
    public final void insertInfo(String str, C207088161u c207088161u) {
        ConcurrentHashMap<String, C207088161u> concurrentHashMap = LIZIZ;
        C207088161u c207088161uPutIfAbsent = concurrentHashMap.putIfAbsent(str, c207088161u);
        if (c207088161uPutIfAbsent != null && c207088161u.LIZIZ.size() > c207088161uPutIfAbsent.LIZIZ.size()) {
            concurrentHashMap.put(str, c207088161u);
        }
    }
}
