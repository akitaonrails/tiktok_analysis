package X;

import java.util.HashMap;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0Vka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC806620Vka {
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(223));

    public abstract void LIZIZ();

    public void LIZJ() {
        LIZIZ();
        C20684815ws.LJIILLIIL(this.LIZ, (HashMap) this.LIZIZ.getValue());
    }

    public AbstractC806620Vka(String str) {
        this.LIZ = str;
    }

    public final void LIZ(Object obj) {
        String string;
        if (obj == null) {
            string = null;
        } else if (obj instanceof String) {
            string = (String) obj;
        } else {
            string = obj.toString();
        }
        ((HashMap) this.LIZIZ.getValue()).put("cache_hit_status", InterfaceC1210900hcG.LIZ.LIZ(string));
    }
}
