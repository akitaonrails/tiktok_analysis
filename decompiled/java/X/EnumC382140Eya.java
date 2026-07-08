package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Eya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC382140Eya {
    public static final EnumC382140Eya AI_IMAGE;
    public static final EnumC382140Eya AI_VIDEO;
    public static final /* synthetic */ EnumC382140Eya[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC382140Eya> getEntries() {
        return LLILLL;
    }

    static {
        EnumC382140Eya enumC382140Eya = new EnumC382140Eya("AI_IMAGE", 0, "AI Image");
        AI_IMAGE = enumC382140Eya;
        EnumC382140Eya enumC382140Eya2 = new EnumC382140Eya("AI_VIDEO", 1, "AI Video");
        AI_VIDEO = enumC382140Eya2;
        EnumC382140Eya[] enumC382140EyaArr = {enumC382140Eya, enumC382140Eya2};
        LLILLJJLI = enumC382140EyaArr;
        LLILLL = new C2254308sP(enumC382140EyaArr);
    }

    public static EnumC382140Eya[] values() {
        return (EnumC382140Eya[]) LLILLJJLI.clone();
    }

    public final String getTaskName() {
        return this.LL;
    }

    public static EnumC382140Eya valueOf(String str) {
        return (EnumC382140Eya) C08FF.LIZ(EnumC382140Eya.class, str);
    }

    public EnumC382140Eya(String str, int i, String str2) {
        this.LL = str2;
    }
}
