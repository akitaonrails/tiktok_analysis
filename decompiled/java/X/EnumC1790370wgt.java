package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1790370wgt {
    public static final EnumC1790370wgt CANCELLED;
    public static final EnumC1790370wgt COMPLETED;
    public static final EnumC1790370wgt FAILED;
    public static final /* synthetic */ EnumC1790370wgt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1790370wgt PENDING;
    public static final EnumC1790370wgt RUNNING;

    public static InterfaceC2044707zh<EnumC1790370wgt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1790370wgt enumC1790370wgt = new EnumC1790370wgt("PENDING", 0);
        PENDING = enumC1790370wgt;
        EnumC1790370wgt enumC1790370wgt2 = new EnumC1790370wgt("RUNNING", 1);
        RUNNING = enumC1790370wgt2;
        EnumC1790370wgt enumC1790370wgt3 = new EnumC1790370wgt("COMPLETED", 2);
        COMPLETED = enumC1790370wgt3;
        EnumC1790370wgt enumC1790370wgt4 = new EnumC1790370wgt("CANCELLED", 3);
        CANCELLED = enumC1790370wgt4;
        EnumC1790370wgt enumC1790370wgt5 = new EnumC1790370wgt("FAILED", 4);
        FAILED = enumC1790370wgt5;
        EnumC1790370wgt[] enumC1790370wgtArr = {enumC1790370wgt, enumC1790370wgt2, enumC1790370wgt3, enumC1790370wgt4, enumC1790370wgt5};
        LL = enumC1790370wgtArr;
        LLILLJJLI = new C2254308sP(enumC1790370wgtArr);
    }

    public static EnumC1790370wgt[] values() {
        return (EnumC1790370wgt[]) LL.clone();
    }

    public static EnumC1790370wgt valueOf(String str) {
        return (EnumC1790370wgt) C08FF.LIZ(EnumC1790370wgt.class, str);
    }

    public EnumC1790370wgt(String str, int i) {
    }
}
