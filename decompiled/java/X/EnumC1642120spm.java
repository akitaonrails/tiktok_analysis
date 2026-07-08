package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0spm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1642120spm {
    public static final EnumC1642120spm EMPTY;
    public static final EnumC1642120spm ERROR;
    public static final /* synthetic */ EnumC1642120spm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1642120spm LOADING;
    public static final EnumC1642120spm OK;

    public static InterfaceC2044707zh<EnumC1642120spm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1642120spm enumC1642120spm = new EnumC1642120spm("OK", 0);
        OK = enumC1642120spm;
        EnumC1642120spm enumC1642120spm2 = new EnumC1642120spm("LOADING", 1);
        LOADING = enumC1642120spm2;
        EnumC1642120spm enumC1642120spm3 = new EnumC1642120spm("ERROR", 2);
        ERROR = enumC1642120spm3;
        EnumC1642120spm enumC1642120spm4 = new EnumC1642120spm("EMPTY", 3);
        EMPTY = enumC1642120spm4;
        EnumC1642120spm[] enumC1642120spmArr = {enumC1642120spm, enumC1642120spm2, enumC1642120spm3, enumC1642120spm4};
        LL = enumC1642120spmArr;
        LLILLJJLI = new C2254308sP(enumC1642120spmArr);
    }

    public static EnumC1642120spm[] values() {
        return (EnumC1642120spm[]) LL.clone();
    }

    public static EnumC1642120spm valueOf(String str) {
        return (EnumC1642120spm) C08FF.LIZ(EnumC1642120spm.class, str);
    }

    public EnumC1642120spm(String str, int i) {
    }
}
