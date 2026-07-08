package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hMQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1201080hMQ {
    public static final EnumC1201080hMQ ADD_LOCATION;
    public static final EnumC1201080hMQ CHANGE_LOCATION;
    public static final EnumC1201080hMQ CLOSE;
    public static final /* synthetic */ EnumC1201080hMQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1201080hMQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1201080hMQ enumC1201080hMQ = new EnumC1201080hMQ("ADD_LOCATION", 0, "add_location");
        ADD_LOCATION = enumC1201080hMQ;
        EnumC1201080hMQ enumC1201080hMQ2 = new EnumC1201080hMQ("CHANGE_LOCATION", 1, "change_location");
        CHANGE_LOCATION = enumC1201080hMQ2;
        EnumC1201080hMQ enumC1201080hMQ3 = new EnumC1201080hMQ("CLOSE", 2, "close");
        CLOSE = enumC1201080hMQ3;
        EnumC1201080hMQ[] enumC1201080hMQArr = {enumC1201080hMQ, enumC1201080hMQ2, enumC1201080hMQ3};
        LLILLJJLI = enumC1201080hMQArr;
        LLILLL = new C2254308sP(enumC1201080hMQArr);
    }

    public static EnumC1201080hMQ[] values() {
        return (EnumC1201080hMQ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1201080hMQ valueOf(String str) {
        return (EnumC1201080hMQ) C08FF.LIZ(EnumC1201080hMQ.class, str);
    }

    public EnumC1201080hMQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
