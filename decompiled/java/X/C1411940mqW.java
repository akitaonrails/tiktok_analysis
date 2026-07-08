package X;

import com.ss.android.ugc.aweme.tools.music.music.recent.cache.LruCacheMusicModel;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0mqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411940mqW {
    public final LinkedHashMap<String, LruCacheMusicModel> LIZ = new LinkedHashMap<>(50);
    public final Set<String> LIZIZ = new LinkedHashSet(2);

    public final List<LruCacheMusicModel> LIZ() {
        return C13LP.LLIIII(this.LIZ.values());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cache: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" Auto Music: ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
