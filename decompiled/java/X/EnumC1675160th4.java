package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0th4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1675160th4 {
    public static final /* synthetic */ EnumC1675160th4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1675160th4 MATCHED_LIST;
    public static final EnumC1675160th4 PERMISSION_DENIED;
    public static final EnumC1675160th4 WAITING_ROOM;

    public static InterfaceC2044707zh<EnumC1675160th4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1675160th4 enumC1675160th4 = new EnumC1675160th4("PERMISSION_DENIED", 0);
        PERMISSION_DENIED = enumC1675160th4;
        EnumC1675160th4 enumC1675160th42 = new EnumC1675160th4("WAITING_ROOM", 1);
        WAITING_ROOM = enumC1675160th42;
        EnumC1675160th4 enumC1675160th43 = new EnumC1675160th4("MATCHED_LIST", 2);
        MATCHED_LIST = enumC1675160th43;
        EnumC1675160th4[] enumC1675160th4Arr = {enumC1675160th4, enumC1675160th42, enumC1675160th43};
        LL = enumC1675160th4Arr;
        LLILLJJLI = new C2254308sP(enumC1675160th4Arr);
    }

    public static EnumC1675160th4[] values() {
        return (EnumC1675160th4[]) LL.clone();
    }

    public static EnumC1675160th4 valueOf(String str) {
        return (EnumC1675160th4) C08FF.LIZ(EnumC1675160th4.class, str);
    }

    public EnumC1675160th4(String str, int i) {
    }
}
