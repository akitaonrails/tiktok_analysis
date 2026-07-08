package X;

/* JADX INFO: renamed from: X.0wmw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public enum EnumC1794120wmw {
    Init,
    Pending,
    Success,
    Failed,
    Closed,
    Expired,
    Processing,
    Active,
    Abandoned,
    Cancelled,
    Preorder,
    SusPended,
    Unknown;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1794120wmw from(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1149187550:
                if (str.equals("SUCCEED")) {
                    return Success;
                }
                break;
            case -591252731:
                if (str.equals("EXPIRED")) {
                    return Expired;
                }
                break;
            case 2252048:
                if (str.equals("INIT")) {
                    return Init;
                }
                break;
            case 35394935:
                if (str.equals("PENDING")) {
                    return Pending;
                }
                break;
            case 907287315:
                if (str.equals("PROCESSING")) {
                    return Processing;
                }
                break;
            case 1990776172:
                if (str.equals("CLOSED")) {
                    return Closed;
                }
                break;
            case 2066319421:
                if (str.equals("FAILED")) {
                    return Failed;
                }
                break;
        }
        return Unknown;
    }

    public static EnumC1794120wmw valueOf(String str) {
        return (EnumC1794120wmw) C08FF.LIZ(EnumC1794120wmw.class, str);
    }
}
