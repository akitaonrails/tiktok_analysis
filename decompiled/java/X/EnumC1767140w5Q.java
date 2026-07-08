package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w5Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1767140w5Q {
    public static final EnumC1767140w5Q ERROR_RESPONSE;
    public static final EnumC1767140w5Q IN_PROGRESS;
    public static final /* synthetic */ EnumC1767140w5Q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1767140w5Q NOT_STARTED;
    public static final EnumC1767140w5Q SUCCESS_EMPTY_DATA;
    public static final EnumC1767140w5Q SUCCESS_WITH_DATA;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1767140w5Q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1767140w5Q enumC1767140w5Q = new EnumC1767140w5Q("NOT_STARTED", 0, 1);
        NOT_STARTED = enumC1767140w5Q;
        EnumC1767140w5Q enumC1767140w5Q2 = new EnumC1767140w5Q("IN_PROGRESS", 1, 2);
        IN_PROGRESS = enumC1767140w5Q2;
        EnumC1767140w5Q enumC1767140w5Q3 = new EnumC1767140w5Q("ERROR_RESPONSE", 2, 3);
        ERROR_RESPONSE = enumC1767140w5Q3;
        EnumC1767140w5Q enumC1767140w5Q4 = new EnumC1767140w5Q("SUCCESS_EMPTY_DATA", 3, 4);
        SUCCESS_EMPTY_DATA = enumC1767140w5Q4;
        EnumC1767140w5Q enumC1767140w5Q5 = new EnumC1767140w5Q("SUCCESS_WITH_DATA", 4, 5);
        SUCCESS_WITH_DATA = enumC1767140w5Q5;
        EnumC1767140w5Q[] enumC1767140w5QArr = {enumC1767140w5Q, enumC1767140w5Q2, enumC1767140w5Q3, enumC1767140w5Q4, enumC1767140w5Q5};
        LLILLJJLI = enumC1767140w5QArr;
        LLILLL = new C2254308sP(enumC1767140w5QArr);
    }

    public static EnumC1767140w5Q[] values() {
        return (EnumC1767140w5Q[]) LLILLJJLI.clone();
    }

    public final int getStage() {
        return this.LL;
    }

    public static EnumC1767140w5Q valueOf(String str) {
        return (EnumC1767140w5Q) C08FF.LIZ(EnumC1767140w5Q.class, str);
    }

    public EnumC1767140w5Q(String str, int i, int i2) {
        this.LL = i2;
    }
}
