package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.05rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1482705rF {
    public final ConcurrentHashMap<String, AnonymousClass0617> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C09AE> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C05YD<ThoughtInfo>> LIZJ = new ConcurrentHashMap<>();

    public final void LIZ() {
        Iterator<T> it2 = this.LIZIZ.values().iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        this.LIZIZ.clear();
        this.LIZ.clear();
        this.LIZJ.clear();
    }
}
