package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Luc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC558040Luc {
    public static final EnumC558040Luc EDIT;
    public static final /* synthetic */ EnumC558040Luc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC558040Luc PUBLISH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC558040Luc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC558040Luc enumC558040Luc = new EnumC558040Luc("EDIT", 0, "edit");
        EDIT = enumC558040Luc;
        EnumC558040Luc enumC558040Luc2 = new EnumC558040Luc("PUBLISH", 1, "publish");
        PUBLISH = enumC558040Luc2;
        EnumC558040Luc[] enumC558040LucArr = {enumC558040Luc, enumC558040Luc2};
        LLILLJJLI = enumC558040LucArr;
        LLILLL = new C2254308sP(enumC558040LucArr);
    }

    public static EnumC558040Luc[] values() {
        return (EnumC558040Luc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC558040Luc valueOf(String str) {
        return (EnumC558040Luc) C08FF.LIZ(EnumC558040Luc.class, str);
    }

    public EnumC558040Luc(String str, int i, String str2) {
        this.LL = str2;
    }
}
