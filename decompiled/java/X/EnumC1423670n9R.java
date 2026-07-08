package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n9R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1423670n9R {
    public static final EnumC1423670n9R CANCEL;
    public static final EnumC1423670n9R FAIL;
    public static final /* synthetic */ EnumC1423670n9R[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1423670n9R NONE;
    public static final EnumC1423670n9R PROGRESS;
    public static final EnumC1423670n9R SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1423670n9R> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1423670n9R enumC1423670n9R = new EnumC1423670n9R("SUCCESS", 0, 0);
        SUCCESS = enumC1423670n9R;
        EnumC1423670n9R enumC1423670n9R2 = new EnumC1423670n9R("FAIL", 1, 1);
        FAIL = enumC1423670n9R2;
        EnumC1423670n9R enumC1423670n9R3 = new EnumC1423670n9R("CANCEL", 2, 2);
        CANCEL = enumC1423670n9R3;
        EnumC1423670n9R enumC1423670n9R4 = new EnumC1423670n9R("PROGRESS", 3, 3);
        PROGRESS = enumC1423670n9R4;
        EnumC1423670n9R enumC1423670n9R5 = new EnumC1423670n9R("NONE", 4, 4);
        NONE = enumC1423670n9R5;
        EnumC1423670n9R[] enumC1423670n9RArr = {enumC1423670n9R, enumC1423670n9R2, enumC1423670n9R3, enumC1423670n9R4, enumC1423670n9R5};
        LLILLJJLI = enumC1423670n9RArr;
        LLILLL = new C2254308sP(enumC1423670n9RArr);
    }

    public static EnumC1423670n9R[] values() {
        return (EnumC1423670n9R[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1423670n9R valueOf(String str) {
        return (EnumC1423670n9R) C08FF.LIZ(EnumC1423670n9R.class, str);
    }

    public EnumC1423670n9R(String str, int i, int i2) {
        this.LL = i2;
    }
}
