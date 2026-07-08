package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.16DT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16DT implements C16D5 {
    public final TreeMap<String, String> LIZ = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // X.C16D5
    public final void getContent() {
    }

    @Override // X.C16D5
    public final Iterator<String> LIZ() {
        return Collections.unmodifiableSet(this.LIZ.keySet()).iterator();
    }

    @Override // X.C16D5
    public final boolean LIZIZ(String str) {
        return this.LIZ.containsKey(str);
    }

    @Override // X.C16D5
    public final String LJ(String str) {
        String str2 = this.LIZ.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final void LJFF(String str, String str2) {
        this.LIZ.put(str, str2);
    }
}
