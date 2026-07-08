package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g86, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153760g86 {
    public static final EnumC1153760g86 BOE;
    public static final /* synthetic */ EnumC1153760g86[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153760g86 PPE;
    public static final EnumC1153760g86 PROD;

    public static InterfaceC2044707zh<EnumC1153760g86> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153760g86 enumC1153760g86 = new EnumC1153760g86("PPE", 0);
        PPE = enumC1153760g86;
        EnumC1153760g86 enumC1153760g862 = new EnumC1153760g86("BOE", 1);
        BOE = enumC1153760g862;
        EnumC1153760g86 enumC1153760g863 = new EnumC1153760g86("PROD", 2);
        PROD = enumC1153760g863;
        EnumC1153760g86[] enumC1153760g86Arr = {enumC1153760g86, enumC1153760g862, enumC1153760g863};
        LL = enumC1153760g86Arr;
        LLILLJJLI = new C2254308sP(enumC1153760g86Arr);
    }

    public static EnumC1153760g86[] values() {
        return (EnumC1153760g86[]) LL.clone();
    }

    public static EnumC1153760g86 valueOf(String str) {
        return (EnumC1153760g86) C08FF.LIZ(EnumC1153760g86.class, str);
    }

    public EnumC1153760g86(String str, int i) {
    }
}
