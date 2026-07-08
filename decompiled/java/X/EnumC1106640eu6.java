package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1106640eu6 {
    public static final EnumC1106640eu6 ANIMATION;
    public static final EnumC1106640eu6 FALLBACK;
    public static final EnumC1106640eu6 FIRST_FRAME;
    public static final EnumC1106640eu6 GLINT_RECOVER;
    public static final /* synthetic */ EnumC1106640eu6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1106640eu6 RESUME;

    public static InterfaceC2044707zh<EnumC1106640eu6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1106640eu6 enumC1106640eu6 = new EnumC1106640eu6("RESUME", 0);
        RESUME = enumC1106640eu6;
        EnumC1106640eu6 enumC1106640eu62 = new EnumC1106640eu6("FIRST_FRAME", 1);
        FIRST_FRAME = enumC1106640eu62;
        EnumC1106640eu6 enumC1106640eu63 = new EnumC1106640eu6("FALLBACK", 2);
        FALLBACK = enumC1106640eu63;
        EnumC1106640eu6 enumC1106640eu64 = new EnumC1106640eu6("ANIMATION", 3);
        ANIMATION = enumC1106640eu64;
        EnumC1106640eu6 enumC1106640eu65 = new EnumC1106640eu6("GLINT_RECOVER", 4);
        GLINT_RECOVER = enumC1106640eu65;
        EnumC1106640eu6[] enumC1106640eu6Arr = {enumC1106640eu6, enumC1106640eu62, enumC1106640eu63, enumC1106640eu64, enumC1106640eu65};
        LL = enumC1106640eu6Arr;
        LLILLJJLI = new C2254308sP(enumC1106640eu6Arr);
    }

    public static EnumC1106640eu6[] values() {
        return (EnumC1106640eu6[]) LL.clone();
    }

    public static EnumC1106640eu6 valueOf(String str) {
        return (EnumC1106640eu6) C08FF.LIZ(EnumC1106640eu6.class, str);
    }

    public EnumC1106640eu6(String str, int i) {
    }
}
