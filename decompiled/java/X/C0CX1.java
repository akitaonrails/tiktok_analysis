package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0CX1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CX1 {
    public static final C0CX1 LIZ = new C0CX1();
    public static final Keva LIZIZ = Keva.getRepo("article_mode_keva");

    public static boolean LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("article_mode_intro_shown|");
        sbLIZ.append(curUserId);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }
}
