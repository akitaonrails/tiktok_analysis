package X;

/* JADX INFO: renamed from: X.0ozA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1494180ozA {
    NONE(0),
    NO_CALLBACK(1),
    CONFIG_EMPTY(2),
    AID_FETCH_FAILED(3),
    NO_MATCHING_CONFIG(4),
    PARSE_CONFIG_HAS_EXCEPTION(5);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1494180ozA valueOf(String str) {
        return (EnumC1494180ozA) C08FF.LIZ(EnumC1494180ozA.class, str);
    }

    EnumC1494180ozA(int i) {
        this.LL = i;
    }
}
