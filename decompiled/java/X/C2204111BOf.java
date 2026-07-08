package X;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204111BOf {
    public final C2204101BOe<String, C018F> LIZ = new C2204101BOe<>();
    public final C2092308Hp<Uri, String> LIZIZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.08Hp, X.08Hp<android.net.Uri, java.lang.String>] */
    public C2204111BOf() {
        final int i = 16;
        this.LIZIZ = new LinkedHashMap<K, V>(i) { // from class: X.08Hp
            public final int LL;

            {
                super(i, 1.0f, true);
                this.LL = i;
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry entry) {
                if (size() > this.LL) {
                    return true;
                }
                return false;
            }
        };
    }
}
