package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289910jfh extends C1298700jts {
    public String LJII;
    public HashMap<String, Object> LJIIIIZZ;

    @Override // X.C1298700jts
    public final Map<String, Object> LIZJ() {
        HashMap<String, Object> map = this.LJIIIIZZ;
        return map == null ? new HashMap() : map;
    }

    @Override // X.C1298700jts
    public final String LIZLLL() {
        String str = this.LJII;
        return str != null ? str : "params";
    }

    public C1289910jfh(int i, String str) {
        super(i, str);
    }
}
