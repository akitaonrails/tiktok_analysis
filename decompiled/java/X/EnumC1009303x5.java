package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03x5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1009303x5 {
    public static final EnumC1009303x5 JSON_AGGREGATE;
    public static final /* synthetic */ EnumC1009303x5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1009303x5 PASS_THROUGH;
    public static final EnumC1009303x5 STRING_AGGREGATE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1009303x5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1009303x5 enumC1009303x5 = new EnumC1009303x5("PASS_THROUGH", 0, 0);
        PASS_THROUGH = enumC1009303x5;
        EnumC1009303x5 enumC1009303x52 = new EnumC1009303x5("STRING_AGGREGATE", 1, 1);
        STRING_AGGREGATE = enumC1009303x52;
        EnumC1009303x5 enumC1009303x53 = new EnumC1009303x5("JSON_AGGREGATE", 2, 2);
        JSON_AGGREGATE = enumC1009303x53;
        EnumC1009303x5[] enumC1009303x5Arr = {enumC1009303x5, enumC1009303x52, enumC1009303x53};
        LLILLJJLI = enumC1009303x5Arr;
        LLILLL = new C2254308sP(enumC1009303x5Arr);
    }

    public static EnumC1009303x5[] values() {
        return (EnumC1009303x5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1009303x5 valueOf(String str) {
        return (EnumC1009303x5) C08FF.LIZ(EnumC1009303x5.class, str);
    }

    public EnumC1009303x5(String str, int i, int i2) {
        this.LL = i2;
    }
}
