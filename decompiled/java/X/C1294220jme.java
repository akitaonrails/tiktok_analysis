package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294220jme extends C1294230jmf {
    public String LIZLLL;
    public HashMap<String, Object> LJ;

    @Override // X.C1294230jmf
    public final Map<String, Object> LIZ() {
        HashMap<String, Object> map = this.LJ;
        if (map == null) {
            return null;
        }
        return map;
    }

    @Override // X.C1294230jmf
    public final String LIZIZ() {
        String str = this.LIZLLL;
        return str != null ? str : "params";
    }

    public C1294220jme(int i, String str) {
        super(i, str);
    }
}
