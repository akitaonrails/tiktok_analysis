package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ehr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1099050ehr {
    public static final EnumC1099050ehr COLLAPSING;
    public static final EnumC1099050ehr EXPANDING;
    public static final /* synthetic */ EnumC1099050ehr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1099050ehr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1099050ehr enumC1099050ehr = new EnumC1099050ehr("EXPANDING", 0);
        EXPANDING = enumC1099050ehr;
        EnumC1099050ehr enumC1099050ehr2 = new EnumC1099050ehr("COLLAPSING", 1);
        COLLAPSING = enumC1099050ehr2;
        EnumC1099050ehr[] enumC1099050ehrArr = {enumC1099050ehr, enumC1099050ehr2};
        LL = enumC1099050ehrArr;
        LLILLJJLI = new C2254308sP(enumC1099050ehrArr);
    }

    public static EnumC1099050ehr[] values() {
        return (EnumC1099050ehr[]) LL.clone();
    }

    public static EnumC1099050ehr valueOf(String str) {
        return (EnumC1099050ehr) C08FF.LIZ(EnumC1099050ehr.class, str);
    }

    public EnumC1099050ehr(String str, int i) {
    }
}
