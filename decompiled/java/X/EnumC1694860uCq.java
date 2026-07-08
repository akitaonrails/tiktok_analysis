package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1694860uCq {
    public static final EnumC1694860uCq LL;
    public static final EnumC1694860uCq LLILLJJLI;
    public static final EnumC1694860uCq LLILLL;
    public static final EnumC1694860uCq LLILZ;
    public static final /* synthetic */ EnumC1694860uCq[] LLILZIL;

    public static EnumC1694860uCq valueOf(String str) {
        return (EnumC1694860uCq) C08FF.LIZ(EnumC1694860uCq.class, str);
    }

    public static EnumC1694860uCq[] values() {
        return (EnumC1694860uCq[]) LLILZIL.clone();
    }

    static {
        EnumC1694860uCq enumC1694860uCq = new EnumC1694860uCq("StartInput", 0);
        LL = enumC1694860uCq;
        EnumC1694860uCq enumC1694860uCq2 = new EnumC1694860uCq("StopInput", 1);
        LLILLJJLI = enumC1694860uCq2;
        EnumC1694860uCq enumC1694860uCq3 = new EnumC1694860uCq("ShowKeyboard", 2);
        LLILLL = enumC1694860uCq3;
        EnumC1694860uCq enumC1694860uCq4 = new EnumC1694860uCq("HideKeyboard", 3);
        LLILZ = enumC1694860uCq4;
        EnumC1694860uCq[] enumC1694860uCqArr = {enumC1694860uCq, enumC1694860uCq2, enumC1694860uCq3, enumC1694860uCq4};
        LLILZIL = enumC1694860uCqArr;
        new C2254308sP(enumC1694860uCqArr);
    }

    public EnumC1694860uCq(String str, int i) {
    }
}
