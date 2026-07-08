package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1006910cJF {
    public static final EnumC1006910cJF DOWNLOADING;
    public static final EnumC1006910cJF FAIL;
    public static final EnumC1006910cJF IDLE;
    public static final /* synthetic */ EnumC1006910cJF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1006910cJF SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1006910cJF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1006910cJF enumC1006910cJF = new EnumC1006910cJF("IDLE", 0, 0);
        IDLE = enumC1006910cJF;
        EnumC1006910cJF enumC1006910cJF2 = new EnumC1006910cJF("DOWNLOADING", 1, 1);
        DOWNLOADING = enumC1006910cJF2;
        EnumC1006910cJF enumC1006910cJF3 = new EnumC1006910cJF("SUCCESS", 2, 2);
        SUCCESS = enumC1006910cJF3;
        EnumC1006910cJF enumC1006910cJF4 = new EnumC1006910cJF("FAIL", 3, 3);
        FAIL = enumC1006910cJF4;
        EnumC1006910cJF[] enumC1006910cJFArr = {enumC1006910cJF, enumC1006910cJF2, enumC1006910cJF3, enumC1006910cJF4};
        LLILLJJLI = enumC1006910cJFArr;
        LLILLL = new C2254308sP(enumC1006910cJFArr);
    }

    public static EnumC1006910cJF[] values() {
        return (EnumC1006910cJF[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1006910cJF valueOf(String str) {
        return (EnumC1006910cJF) C08FF.LIZ(EnumC1006910cJF.class, str);
    }

    public EnumC1006910cJF(String str, int i, int i2) {
        this.LL = i2;
    }
}
