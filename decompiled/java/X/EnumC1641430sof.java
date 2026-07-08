package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641430sof {
    public static final EnumC1641430sof FAILED;
    public static final /* synthetic */ EnumC1641430sof[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641430sof PENDING;
    public static final EnumC1641430sof START;
    public static final EnumC1641430sof SUCCESS;

    public static InterfaceC2044707zh<EnumC1641430sof> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641430sof enumC1641430sof = new EnumC1641430sof("PENDING", 0);
        PENDING = enumC1641430sof;
        EnumC1641430sof enumC1641430sof2 = new EnumC1641430sof("START", 1);
        START = enumC1641430sof2;
        EnumC1641430sof enumC1641430sof3 = new EnumC1641430sof("SUCCESS", 2);
        SUCCESS = enumC1641430sof3;
        EnumC1641430sof enumC1641430sof4 = new EnumC1641430sof("FAILED", 3);
        FAILED = enumC1641430sof4;
        EnumC1641430sof[] enumC1641430sofArr = {enumC1641430sof, enumC1641430sof2, enumC1641430sof3, enumC1641430sof4};
        LL = enumC1641430sofArr;
        LLILLJJLI = new C2254308sP(enumC1641430sofArr);
    }

    public static EnumC1641430sof[] values() {
        return (EnumC1641430sof[]) LL.clone();
    }

    public static EnumC1641430sof valueOf(String str) {
        return (EnumC1641430sof) C08FF.LIZ(EnumC1641430sof.class, str);
    }

    public EnumC1641430sof(String str, int i) {
    }
}
