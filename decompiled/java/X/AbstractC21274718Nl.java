package X;

import Y.ACallableS410S0100000_2;
import java.util.HashMap;

/* JADX INFO: renamed from: X.18Nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21274718Nl {
    public final String LIZ;
    public final HashMap<String, String> LIZIZ = new HashMap<>();
    public final HashMap<String, String> LIZJ = new HashMap<>();

    public abstract void LIZIZ();

    public final void LIZJ() {
        InterfaceC21276518Od.LIZ.getClass();
        LIZ("data_type", "commerce_data");
        LIZIZ();
        this.LIZIZ.putAll(this.LIZJ);
        C15O7.LIZJ(new ACallableS410S0100000_2(this, 17));
    }

    public AbstractC21274718Nl(String str) {
        this.LIZ = str;
    }

    public final void LIZ(String str, String str2) {
        if (str2 != null) {
            this.LIZIZ.put(str, C18O2.LIZ(str2));
        }
    }
}
