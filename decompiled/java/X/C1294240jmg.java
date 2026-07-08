package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1294240jmg extends C1294230jmf {
    public final Map<String, Object> LIZLLL;

    @Override // X.C1294230jmf
    public final String LIZIZ() {
        return "detail";
    }

    @Override // X.C1294230jmf
    public final Map<String, Object> LIZ() {
        return this.LIZLLL;
    }

    public C1294240jmg(int i, String str) {
        super(i, str);
        this.LIZLLL = new HashMap();
    }

    public final void LIZJ(Object obj, String str) {
        ((HashMap) this.LIZLLL).put(str, obj);
    }
}
