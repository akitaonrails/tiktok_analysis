package X;

import android.graphics.Typeface;

/* JADX INFO: renamed from: X.12Jw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19736612Jw {
    public static final C19736612Jw LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final C1663470tOD LIZJ;
    public static final C1663470tOD LIZLLL;
    public static C12VB LJ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C19736612Jw.class, "fontSource", "getFontSource()Lcom/ss/android/ugc/tools/view/style/IFontSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(C19736612Jw.class, "defaultFontProvider", "getDefaultFontProvider()Lkotlin/jvm/functions/Function0;", 0);
        c09r3.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2};
        LIZ = new C19736612Jw();
        LIZJ = new C1663470tOD(new C19736812Jy());
        LIZLLL = new C1663470tOD(new C19736712Jx());
    }

    public static final Typeface LIZ(String str) {
        C19736612Jw c19736612Jw = LIZ;
        c19736612Jw.getClass();
        InterfaceC1609810rzf interfaceC1609810rzf = (InterfaceC1609810rzf) LIZJ.getValue(c19736612Jw, LIZIZ[0]);
        if (interfaceC1609810rzf != null) {
            return interfaceC1609810rzf.LIZIZ(str);
        }
        return null;
    }
}
