package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC861260XqW {
    public static final EnumC861260XqW EFFECT_CREATOR;
    public static final EnumC861260XqW GONE;
    public static final /* synthetic */ EnumC861260XqW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC861260XqW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC861260XqW enumC861260XqW = new EnumC861260XqW("GONE", 0);
        GONE = enumC861260XqW;
        EnumC861260XqW enumC861260XqW2 = new EnumC861260XqW("EFFECT_CREATOR", 1);
        EFFECT_CREATOR = enumC861260XqW2;
        EnumC861260XqW[] enumC861260XqWArr = {enumC861260XqW, enumC861260XqW2};
        LL = enumC861260XqWArr;
        LLILLJJLI = new C2254308sP(enumC861260XqWArr);
    }

    public static EnumC861260XqW[] values() {
        return (EnumC861260XqW[]) LL.clone();
    }

    public static EnumC861260XqW valueOf(String str) {
        return (EnumC861260XqW) C08FF.LIZ(EnumC861260XqW.class, str);
    }

    public EnumC861260XqW(String str, int i) {
    }
}
