package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06c3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1643306c3 {
    public static final EnumC1643306c3 FRIENDS;
    public static final /* synthetic */ EnumC1643306c3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1643306c3 NO_ONE;
    public static final EnumC1643306c3 PUBLIC;

    public static InterfaceC2044707zh<EnumC1643306c3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1643306c3 enumC1643306c3 = new EnumC1643306c3("PUBLIC", 0);
        PUBLIC = enumC1643306c3;
        EnumC1643306c3 enumC1643306c32 = new EnumC1643306c3("FRIENDS", 1);
        FRIENDS = enumC1643306c32;
        EnumC1643306c3 enumC1643306c33 = new EnumC1643306c3("NO_ONE", 2);
        NO_ONE = enumC1643306c33;
        EnumC1643306c3[] enumC1643306c3Arr = {enumC1643306c3, enumC1643306c32, enumC1643306c33};
        LL = enumC1643306c3Arr;
        LLILLJJLI = new C2254308sP(enumC1643306c3Arr);
    }

    public static EnumC1643306c3[] values() {
        return (EnumC1643306c3[]) LL.clone();
    }

    public static EnumC1643306c3 valueOf(String str) {
        return (EnumC1643306c3) C08FF.LIZ(EnumC1643306c3.class, str);
    }

    public EnumC1643306c3(String str, int i) {
    }
}
