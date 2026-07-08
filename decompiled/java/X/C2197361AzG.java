package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.1AzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197361AzG {
    public final String LIZ;
    public final HashMap<String, String> LIZIZ;

    public final String LIZ() {
        String str = this.LIZIZ.get("enter_from");
        return str == null ? "" : str;
    }

    public final String LIZIZ() {
        String str = this.LIZIZ.get("minis_id");
        return str == null ? "" : str;
    }

    public C2197361AzG(String str, int i) {
        HashMap<String, String> map;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            map = new HashMap<>();
        } else {
            map = null;
        }
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
