package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1757650vq7 {
    public static final EnumC1757650vq7 LEAVE;
    public static final /* synthetic */ EnumC1757650vq7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1757650vq7 MANUAL;
    public static final EnumC1757650vq7 SLIDE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1757650vq7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1757650vq7 enumC1757650vq7 = new EnumC1757650vq7("MANUAL", 0, "manual");
        MANUAL = enumC1757650vq7;
        EnumC1757650vq7 enumC1757650vq72 = new EnumC1757650vq7("LEAVE", 1, "leave");
        LEAVE = enumC1757650vq72;
        EnumC1757650vq7 enumC1757650vq73 = new EnumC1757650vq7("SLIDE", 2, "slide");
        SLIDE = enumC1757650vq73;
        EnumC1757650vq7[] enumC1757650vq7Arr = {enumC1757650vq7, enumC1757650vq72, enumC1757650vq73};
        LLILLJJLI = enumC1757650vq7Arr;
        LLILLL = new C2254308sP(enumC1757650vq7Arr);
    }

    public static EnumC1757650vq7[] values() {
        return (EnumC1757650vq7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1757650vq7 valueOf(String str) {
        return (EnumC1757650vq7) C08FF.LIZ(EnumC1757650vq7.class, str);
    }

    public EnumC1757650vq7(String str, int i, String str2) {
        this.LL = str2;
    }
}
