package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1411640mq2 {
    public static final EnumC1411640mq2 EMPTY_RESPONSE;
    public static final /* synthetic */ EnumC1411640mq2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1411640mq2 OTHERS;
    public static final EnumC1411640mq2 SUCCESS;
    public static final EnumC1411640mq2 TNS_REFUSE;
    public static final EnumC1411640mq2 UPLOAD_TOS_FAIL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1411640mq2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1411640mq2 enumC1411640mq2 = new EnumC1411640mq2("SUCCESS", 0, 0);
        SUCCESS = enumC1411640mq2;
        EnumC1411640mq2 enumC1411640mq22 = new EnumC1411640mq2("UPLOAD_TOS_FAIL", 1, -2);
        UPLOAD_TOS_FAIL = enumC1411640mq22;
        EnumC1411640mq2 enumC1411640mq23 = new EnumC1411640mq2("TNS_REFUSE", 2, -3);
        TNS_REFUSE = enumC1411640mq23;
        EnumC1411640mq2 enumC1411640mq24 = new EnumC1411640mq2("EMPTY_RESPONSE", 3, -4);
        EMPTY_RESPONSE = enumC1411640mq24;
        EnumC1411640mq2 enumC1411640mq25 = new EnumC1411640mq2("OTHERS", 4, -1);
        OTHERS = enumC1411640mq25;
        EnumC1411640mq2[] enumC1411640mq2Arr = {enumC1411640mq2, enumC1411640mq22, enumC1411640mq23, enumC1411640mq24, enumC1411640mq25};
        LLILLJJLI = enumC1411640mq2Arr;
        LLILLL = new C2254308sP(enumC1411640mq2Arr);
    }

    public static EnumC1411640mq2[] values() {
        return (EnumC1411640mq2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1411640mq2 valueOf(String str) {
        return (EnumC1411640mq2) C08FF.LIZ(EnumC1411640mq2.class, str);
    }

    public EnumC1411640mq2(String str, int i, int i2) {
        this.LL = i2;
    }
}
