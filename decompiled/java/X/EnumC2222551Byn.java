package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Byn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2222551Byn {
    public static final C2222661Byy Companion;
    public static final /* synthetic */ EnumC2222551Byn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2222551Byn ORIGIN;
    public static final EnumC2222551Byn WS_MSG_ORIGIN;
    public static final EnumC2222551Byn WS_ORIGIN;

    public static InterfaceC2044707zh<EnumC2222551Byn> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1Byy] */
    static {
        EnumC2222551Byn enumC2222551Byn = new EnumC2222551Byn("WS_MSG_ORIGIN", 0);
        WS_MSG_ORIGIN = enumC2222551Byn;
        EnumC2222551Byn enumC2222551Byn2 = new EnumC2222551Byn("WS_ORIGIN", 1);
        WS_ORIGIN = enumC2222551Byn2;
        EnumC2222551Byn enumC2222551Byn3 = new EnumC2222551Byn("ORIGIN", 2);
        ORIGIN = enumC2222551Byn3;
        EnumC2222551Byn[] enumC2222551BynArr = {enumC2222551Byn, enumC2222551Byn2, enumC2222551Byn3};
        LL = enumC2222551BynArr;
        LLILLJJLI = new C2254308sP(enumC2222551BynArr);
        Companion = new Object() { // from class: X.1Byy
        };
    }

    public static EnumC2222551Byn[] values() {
        return (EnumC2222551Byn[]) LL.clone();
    }

    public static EnumC2222551Byn valueOf(String str) {
        return (EnumC2222551Byn) C08FF.LIZ(EnumC2222551Byn.class, str);
    }

    public final String getStrategy(boolean z) {
        int i = C2222581Byq.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2 || !z) {
                return "origin_http";
            }
        } else if (!z) {
            return "room_http";
        }
        return "ws";
    }

    public EnumC2222551Byn(String str, int i) {
    }
}
