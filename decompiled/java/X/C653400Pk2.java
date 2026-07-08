package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pk2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653400Pk2 {
    public static final HashMap<String, String> LIZ = new HashMap<>();

    public static final void LIZ(Aweme aweme, Map map) {
        String str;
        String str2;
        if (aweme == null) {
            return;
        }
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null && (str2 = mobParams.get("is_entity")) != null) {
            map.put("is_entity", str2);
        }
        HashMap<String, String> mobParams2 = aweme.getMobParams();
        if (mobParams2 != null && (str = mobParams2.get("entity_type")) != null) {
            map.put("entity_type", str);
        }
    }

    public static final void LIZIZ(Aweme aweme, AbstractC1386130mAt abstractC1386130mAt) {
        String str;
        String str2;
        if (aweme == null) {
            return;
        }
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null && (str2 = mobParams.get("is_entity")) != null) {
            abstractC1386130mAt.LJ("is_entity", str2);
        }
        HashMap<String, String> mobParams2 = aweme.getMobParams();
        if (mobParams2 != null && (str = mobParams2.get("entity_type")) != null) {
            abstractC1386130mAt.LJ("entity_type", str);
        }
    }
}
