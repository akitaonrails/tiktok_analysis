package X;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0QYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672210QYh extends AbstractC672260QYm {
    public static final C672210QYh LIZIZ = new C672210QYh();
    public static final String LIZJ = "guess_cache_read_strategy";
    public static final String LIZLLL = "disable_guess_strategy";
    public static final int LJ = EnumC672240QYk.ENABLE_ALWAYS.getValue();

    @Override // X.C0QYK
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C0QYK
    public final Integer LIZ() {
        return Integer.valueOf(LJ);
    }

    @Override // X.C0QYK
    public final String LIZLLL() {
        return LIZJ;
    }

    @Override // X.C0QYK
    public final String LJ() {
        return LIZLLL;
    }

    @Override // X.C0QYK
    public final Integer LIZJ(String str, String str2) {
        Float fLJIIIIZZ;
        Boolean bool;
        C0QYK c0qyk = (C0QYK) ((LinkedHashMap) C672180QYe.LIZ).get(LIZLLL);
        Serializable serializable = null;
        if (c0qyk != null) {
            serializable = (Serializable) c0qyk.LIZIZ(str2);
        }
        if ((serializable instanceof Boolean) && (bool = (Boolean) serializable) != null && bool.booleanValue()) {
            return Integer.valueOf(EnumC672240QYk.DISABLE.getValue());
        }
        for (EnumC672240QYk enumC672240QYk : EnumC672240QYk.values()) {
            if (str != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) != null && ((int) fLJIIIIZZ.floatValue()) == enumC672240QYk.getValue()) {
                return Integer.valueOf(enumC672240QYk.getValue());
            }
        }
        return LIZIZ(str);
    }
}
