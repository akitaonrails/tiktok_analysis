package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC545550LaT {
    public static final EnumC545550LaT COMPLETE;
    public static final EnumC545550LaT FAILED;
    public static final /* synthetic */ EnumC545550LaT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC545550LaT NONE;
    public static final EnumC545550LaT PROCESSING;

    public static InterfaceC2044707zh<EnumC545550LaT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC545550LaT enumC545550LaT = new EnumC545550LaT("NONE", 0);
        NONE = enumC545550LaT;
        EnumC545550LaT enumC545550LaT2 = new EnumC545550LaT("PROCESSING", 1);
        PROCESSING = enumC545550LaT2;
        EnumC545550LaT enumC545550LaT3 = new EnumC545550LaT("COMPLETE", 2);
        COMPLETE = enumC545550LaT3;
        EnumC545550LaT enumC545550LaT4 = new EnumC545550LaT("FAILED", 3);
        FAILED = enumC545550LaT4;
        EnumC545550LaT[] enumC545550LaTArr = {enumC545550LaT, enumC545550LaT2, enumC545550LaT3, enumC545550LaT4};
        LL = enumC545550LaTArr;
        LLILLJJLI = new C2254308sP(enumC545550LaTArr);
    }

    public static EnumC545550LaT[] values() {
        return (EnumC545550LaT[]) LL.clone();
    }

    public static EnumC545550LaT valueOf(String str) {
        return (EnumC545550LaT) C08FF.LIZ(EnumC545550LaT.class, str);
    }

    public EnumC545550LaT(String str, int i) {
    }
}
