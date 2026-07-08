package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Lo3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC553970Lo3 {
    public static final /* synthetic */ EnumC553970Lo3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC553970Lo3 NORMAL_INPUT;
    public static final EnumC553970Lo3 USER_CHANGE;

    public static InterfaceC2044707zh<EnumC553970Lo3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC553970Lo3 enumC553970Lo3 = new EnumC553970Lo3("NORMAL_INPUT", 0);
        NORMAL_INPUT = enumC553970Lo3;
        EnumC553970Lo3 enumC553970Lo32 = new EnumC553970Lo3("USER_CHANGE", 1);
        USER_CHANGE = enumC553970Lo32;
        EnumC553970Lo3[] enumC553970Lo3Arr = {enumC553970Lo3, enumC553970Lo32};
        LL = enumC553970Lo3Arr;
        LLILLJJLI = new C2254308sP(enumC553970Lo3Arr);
    }

    public static EnumC553970Lo3[] values() {
        return (EnumC553970Lo3[]) LL.clone();
    }

    public static EnumC553970Lo3 valueOf(String str) {
        return (EnumC553970Lo3) C08FF.LIZ(EnumC553970Lo3.class, str);
    }

    public EnumC553970Lo3(String str, int i) {
    }
}
