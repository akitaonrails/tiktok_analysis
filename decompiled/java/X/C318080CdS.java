package X;

import java.io.File;

/* JADX INFO: renamed from: X.0CdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C318080CdS {
    public static final C318080CdS LIZ = new C318080CdS();

    public static C0VSJ LIZ(String str) {
        C844470XAv.LIZ.getClass();
        File fileW2 = C786410Ut5.w2(C844470XAv.LIZ());
        if (fileW2 == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(fileW2, "effect_list");
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            return null;
        }
        return new C0VSJ(c0vsj, C2084808Es.LIZ(str));
    }
}
