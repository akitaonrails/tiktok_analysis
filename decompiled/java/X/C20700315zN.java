package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15zN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20700315zN {
    public static final Keva LIZ;
    public static final C2252321DDq LIZIZ;
    public static final C2252321DDq LIZJ;
    public static final C01GW LIZLLL;

    static {
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        Keva repo = Keva.getRepo("auto_translation_settings_cache");
        LIZ = repo;
        LIZIZ = C1BNE.LIZ(null);
        LIZJ = C1BNE.LIZ(null);
        repo.registerChangeListener(new Keva.OnChangeListener() { // from class: X.15zP
            @Override // com.bytedance.keva.Keva.OnChangeListener
            public final void onChanged(Keva keva, String str) {
                if (Intrinsics.LJFF(str, "key_selected_do_not_translate_language_codes") && !C294270Bg9.LIZ()) {
                    C20700315zN.LIZLLL(C20700315zN.LIZJ());
                }
            }
        });
        C23250099c.LIZLLL(c054gLIZ, null, null, new C0QCN(null), 3);
        LIZLLL = C452501pT.LIZIZ(new C20700415zO());
    }

    public static boolean LIZIZ() {
        Keva keva = LIZ;
        String[] stringArray = keva.getStringArray("key_selected_do_not_translate_language_codes", new String[0]);
        return keva.getBoolean("key_has_user_manually_modified_dnt", !(stringArray == null || stringArray.length == 0));
    }

    public static String[] LIZ() {
        if (C294270Bg9.LIZ()) {
            return LIZ.getStringArray("key_default_dnt_lang", null);
        }
        return null;
    }

    public static String[] LIZJ() {
        String[] strArrLIZ;
        return (!C294270Bg9.LIZ() || (strArrLIZ = LIZ()) == null) ? LIZ.getStringArray("key_selected_do_not_translate_language_codes", null) : strArrLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String[] r2) {
        /*
            boolean r0 = X.C294270Bg9.LIZ()
            r1 = 0
            if (r0 == 0) goto L10
            if (r2 == 0) goto Lc
            int r0 = r2.length
            if (r0 != 0) goto L14
        Lc:
            java.lang.String[] r2 = LIZ()
        L10:
            if (r2 != 0) goto L14
            java.lang.String[] r2 = new java.lang.String[r1]
        L14:
            X.1DDq r1 = X.C20700315zN.LIZIZ
            java.util.List r0 = X.C13LQ.LJJLL(r2)
            r1.setValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20700315zN.LIZLLL(java.lang.String[]):void");
    }
}
