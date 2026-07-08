package X;

import java.util.Map;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0lPI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356620lPI {
    public static final Regex LIZ = new Regex("\\{([^}]*)\\}");

    public static final String LIZ(String str, Map<String, String> map) {
        return LIZ.replace(str, new C19302210fM(map));
    }
}
