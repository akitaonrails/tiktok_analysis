package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0WC8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WC8 {
    public final void LIZ(String str, String str2) {
        Map<String, String> map = ((C819250WBv) this).LJFF;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
}
