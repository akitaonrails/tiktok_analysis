package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC971980bOu {
    public static final EnumC971980bOu ALL_LIST_TYPE;
    public static final /* synthetic */ EnumC971980bOu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC971980bOu ONLY_TEXT_HEADER_AND_CREATE_TYPE;
    public static final EnumC971980bOu UNKNOWN;

    public static InterfaceC2044707zh<EnumC971980bOu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC971980bOu enumC971980bOu = new EnumC971980bOu("UNKNOWN", 0);
        UNKNOWN = enumC971980bOu;
        EnumC971980bOu enumC971980bOu2 = new EnumC971980bOu("ONLY_TEXT_HEADER_AND_CREATE_TYPE", 1);
        ONLY_TEXT_HEADER_AND_CREATE_TYPE = enumC971980bOu2;
        EnumC971980bOu enumC971980bOu3 = new EnumC971980bOu("ALL_LIST_TYPE", 2);
        ALL_LIST_TYPE = enumC971980bOu3;
        EnumC971980bOu[] enumC971980bOuArr = {enumC971980bOu, enumC971980bOu2, enumC971980bOu3};
        LL = enumC971980bOuArr;
        LLILLJJLI = new C2254308sP(enumC971980bOuArr);
    }

    public static EnumC971980bOu[] values() {
        return (EnumC971980bOu[]) LL.clone();
    }

    public static EnumC971980bOu valueOf(String str) {
        return (EnumC971980bOu) C08FF.LIZ(EnumC971980bOu.class, str);
    }

    public EnumC971980bOu(String str, int i) {
    }
}
