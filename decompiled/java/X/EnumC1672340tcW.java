package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1672340tcW {
    public static final EnumC1672340tcW LL;
    public static final EnumC1672340tcW LLILLJJLI;
    public static final EnumC1672340tcW LLILLL;
    public static final EnumC1672340tcW LLILZ;
    public static final /* synthetic */ EnumC1672340tcW[] LLILZIL;

    static {
        EnumC1672340tcW enumC1672340tcW = new EnumC1672340tcW("Start", 0);
        LL = enumC1672340tcW;
        EnumC1672340tcW enumC1672340tcW2 = new EnumC1672340tcW("Middle", 1);
        LLILLJJLI = enumC1672340tcW2;
        EnumC1672340tcW enumC1672340tcW3 = new EnumC1672340tcW("MiddleReCompose", 2);
        LLILLL = enumC1672340tcW3;
        EnumC1672340tcW enumC1672340tcW4 = new EnumC1672340tcW("End", 3);
        LLILZ = enumC1672340tcW4;
        EnumC1672340tcW[] enumC1672340tcWArr = {enumC1672340tcW, enumC1672340tcW2, enumC1672340tcW3, enumC1672340tcW4};
        LLILZIL = enumC1672340tcWArr;
        new C2254308sP(enumC1672340tcWArr);
    }

    public static EnumC1672340tcW[] values() {
        return (EnumC1672340tcW[]) LLILZIL.clone();
    }

    public static EnumC1672340tcW valueOf(String str) {
        return (EnumC1672340tcW) C08FF.LIZ(EnumC1672340tcW.class, str);
    }

    public EnumC1672340tcW(String str, int i) {
    }
}
