package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154670g9Z {
    public static final EnumC1154670g9Z CACHE;
    public static final /* synthetic */ EnumC1154670g9Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154670g9Z REMOTE;

    public static InterfaceC2044707zh<EnumC1154670g9Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154670g9Z enumC1154670g9Z = new EnumC1154670g9Z("CACHE", 0);
        CACHE = enumC1154670g9Z;
        EnumC1154670g9Z enumC1154670g9Z2 = new EnumC1154670g9Z("REMOTE", 1);
        REMOTE = enumC1154670g9Z2;
        EnumC1154670g9Z[] enumC1154670g9ZArr = {enumC1154670g9Z, enumC1154670g9Z2};
        LL = enumC1154670g9ZArr;
        LLILLJJLI = new C2254308sP(enumC1154670g9ZArr);
    }

    public static EnumC1154670g9Z[] values() {
        return (EnumC1154670g9Z[]) LL.clone();
    }

    public static EnumC1154670g9Z valueOf(String str) {
        return (EnumC1154670g9Z) C08FF.LIZ(EnumC1154670g9Z.class, str);
    }

    public EnumC1154670g9Z(String str, int i) {
    }
}
