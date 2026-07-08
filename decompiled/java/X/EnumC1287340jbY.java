package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1287340jbY {
    public static final EnumC1287340jbY FAILURE;
    public static final /* synthetic */ EnumC1287340jbY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1287340jbY SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1287340jbY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1287340jbY enumC1287340jbY = new EnumC1287340jbY("SUCCESS", 0, 0);
        SUCCESS = enumC1287340jbY;
        EnumC1287340jbY enumC1287340jbY2 = new EnumC1287340jbY("FAILURE", 1, 1);
        FAILURE = enumC1287340jbY2;
        EnumC1287340jbY[] enumC1287340jbYArr = {enumC1287340jbY, enumC1287340jbY2};
        LLILLJJLI = enumC1287340jbYArr;
        LLILLL = new C2254308sP(enumC1287340jbYArr);
    }

    public static EnumC1287340jbY[] values() {
        return (EnumC1287340jbY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1287340jbY valueOf(String str) {
        return (EnumC1287340jbY) C08FF.LIZ(EnumC1287340jbY.class, str);
    }

    public EnumC1287340jbY(String str, int i, int i2) {
        this.LL = i2;
    }
}
