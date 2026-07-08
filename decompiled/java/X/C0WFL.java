package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WFL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WFL {
    public static final Map<String, C0WFP> LIZ;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        LIZ = concurrentHashMap;
        concurrentHashMap.put("_contains", new C0WFP() { // from class: X.0WFK
            @Override // X.C0WFP
            public final Bundle LIZ(Context context, Bundle bundle) {
                if (bundle == null) {
                    return null;
                }
                String string = bundle.getString("_storage_key");
                String string2 = bundle.getString("_key");
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    return null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("_result", C0WFG.LIZ(context, string, true).contains(string2));
                return bundle2;
            }
        });
    }
}
