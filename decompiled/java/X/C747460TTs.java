package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.api.Api;

/* JADX INFO: renamed from: X.0TTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747460TTs {
    public static final /* synthetic */ C747460TTs LIZ = new C747460TTs();
    public static final InterfaceC747470TTt LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final Keva LJ;

    static {
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(Api.LIZ);
        LIZIZ = (InterfaceC747470TTt) (interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(InterfaceC747470TTt.class) : null);
        LIZJ = LIZ("become_beta");
        LIZ("welcome_beta");
        LIZLLL = LIZ("invite_beta");
        LJ = Keva.getRepo("beta_testing");
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        sbLIZ.append('-');
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
