package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961230b7Z {
    public static final EnumC961230b7Z FRIEND_LIST_TYPE;
    public static final /* synthetic */ EnumC961230b7Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC961230b7Z MAY_KNOW_LIST_TYPE;
    public static final EnumC961230b7Z VIEWER_SUGGESTION_LIST_TYPE;

    public static InterfaceC2044707zh<EnumC961230b7Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC961230b7Z enumC961230b7Z = new EnumC961230b7Z("FRIEND_LIST_TYPE", 0);
        FRIEND_LIST_TYPE = enumC961230b7Z;
        EnumC961230b7Z enumC961230b7Z2 = new EnumC961230b7Z("MAY_KNOW_LIST_TYPE", 1);
        MAY_KNOW_LIST_TYPE = enumC961230b7Z2;
        EnumC961230b7Z enumC961230b7Z3 = new EnumC961230b7Z("VIEWER_SUGGESTION_LIST_TYPE", 2);
        VIEWER_SUGGESTION_LIST_TYPE = enumC961230b7Z3;
        EnumC961230b7Z[] enumC961230b7ZArr = {enumC961230b7Z, enumC961230b7Z2, enumC961230b7Z3};
        LL = enumC961230b7ZArr;
        LLILLJJLI = new C2254308sP(enumC961230b7ZArr);
    }

    public static EnumC961230b7Z[] values() {
        return (EnumC961230b7Z[]) LL.clone();
    }

    public static EnumC961230b7Z valueOf(String str) {
        return (EnumC961230b7Z) C08FF.LIZ(EnumC961230b7Z.class, str);
    }

    public EnumC961230b7Z(String str, int i) {
    }
}
