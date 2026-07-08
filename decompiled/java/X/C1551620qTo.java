package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551620qTo {
    public static final C1551620qTo LIZ = new C1551620qTo();
    public static final ConcurrentHashMap<C1552740qVc, UpdatePackage> LIZIZ = new ConcurrentHashMap<>();

    public static boolean LIZ(String str, String str2) {
        return LIZIZ.containsKey(new C1552740qVc(str, str2));
    }
}
