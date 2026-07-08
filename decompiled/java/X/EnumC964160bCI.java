package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bCI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC964160bCI {
    public static final EnumC964160bCI BLOCKED;
    public static final EnumC964160bCI CONTINUE;
    public static final /* synthetic */ EnumC964160bCI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC964160bCI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC964160bCI enumC964160bCI = new EnumC964160bCI("CONTINUE", 0, "continue");
        CONTINUE = enumC964160bCI;
        EnumC964160bCI enumC964160bCI2 = new EnumC964160bCI("BLOCKED", 1, "blocked");
        BLOCKED = enumC964160bCI2;
        EnumC964160bCI[] enumC964160bCIArr = {enumC964160bCI, enumC964160bCI2};
        LLILLJJLI = enumC964160bCIArr;
        LLILLL = new C2254308sP(enumC964160bCIArr);
    }

    public static EnumC964160bCI[] values() {
        return (EnumC964160bCI[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC964160bCI valueOf(String str) {
        return (EnumC964160bCI) C08FF.LIZ(EnumC964160bCI.class, str);
    }

    public EnumC964160bCI(String str, int i, String str2) {
        this.LL = str2;
    }
}
