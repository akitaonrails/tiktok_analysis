package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC456980Hw0 {
    public static final EnumC456980Hw0 FOLLOW_EXP;
    public static final EnumC456980Hw0 FORCE_HIDE;
    public static final EnumC456980Hw0 FORCE_SHOW;
    public static final /* synthetic */ EnumC456980Hw0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC456980Hw0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC456980Hw0 enumC456980Hw0 = new EnumC456980Hw0("FORCE_SHOW", 0);
        FORCE_SHOW = enumC456980Hw0;
        EnumC456980Hw0 enumC456980Hw02 = new EnumC456980Hw0("FOLLOW_EXP", 1);
        FOLLOW_EXP = enumC456980Hw02;
        EnumC456980Hw0 enumC456980Hw03 = new EnumC456980Hw0("FORCE_HIDE", 2);
        FORCE_HIDE = enumC456980Hw03;
        EnumC456980Hw0[] enumC456980Hw0Arr = {enumC456980Hw0, enumC456980Hw02, enumC456980Hw03};
        LL = enumC456980Hw0Arr;
        LLILLJJLI = new C2254308sP(enumC456980Hw0Arr);
    }

    public static EnumC456980Hw0[] values() {
        return (EnumC456980Hw0[]) LL.clone();
    }

    public static EnumC456980Hw0 valueOf(String str) {
        return (EnumC456980Hw0) C08FF.LIZ(EnumC456980Hw0.class, str);
    }

    public EnumC456980Hw0(String str, int i) {
    }
}
