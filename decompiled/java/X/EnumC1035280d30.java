package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d30, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1035280d30 {
    public static final EnumC1035280d30 LL;
    public static final EnumC1035280d30 LLILLJJLI;
    public static final EnumC1035280d30 LLILLL;
    public static final /* synthetic */ EnumC1035280d30[] LLILZ;

    static {
        EnumC1035280d30 enumC1035280d30 = new EnumC1035280d30("TITLE", 0);
        LL = enumC1035280d30;
        EnumC1035280d30 enumC1035280d302 = new EnumC1035280d30("SUBTITLE", 1);
        LLILLJJLI = enumC1035280d302;
        EnumC1035280d30 enumC1035280d303 = new EnumC1035280d30("DESCRIPTION", 2);
        LLILLL = enumC1035280d303;
        EnumC1035280d30[] enumC1035280d30Arr = {enumC1035280d30, enumC1035280d302, enumC1035280d303};
        LLILZ = enumC1035280d30Arr;
        new C2254308sP(enumC1035280d30Arr);
    }

    public static EnumC1035280d30[] values() {
        return (EnumC1035280d30[]) LLILZ.clone();
    }

    public static EnumC1035280d30 valueOf(String str) {
        return (EnumC1035280d30) C08FF.LIZ(EnumC1035280d30.class, str);
    }

    public EnumC1035280d30(String str, int i) {
    }
}
