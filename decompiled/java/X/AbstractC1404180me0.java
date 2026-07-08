package X;

import Y.ARunnableS122S0100000_22;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0me0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1404180me0 {
    public final String LIZ;
    public final Map<String, String> LIZIZ = new HashMap();
    public final Map<String, String> LIZJ = new HashMap();

    public abstract void LIZIZ();

    public final void LIZJ() {
        LIZIZ();
        ((HashMap) this.LIZIZ).putAll(this.LIZJ);
        C810560Vqw.LJ(new ARunnableS122S0100000_22(this, 104));
    }

    public AbstractC1404180me0(String str) {
        this.LIZ = str;
    }

    public final void LIZ(String str, String str2) {
        ((HashMap) this.LIZIZ).put(str, C1404190me1.LIZ(str2));
    }
}
