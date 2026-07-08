package X;

/* JADX INFO: renamed from: X.0H7V, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7V {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC431710GwL LIZ(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1349088399:
                if (!str.equals("custom")) {
                    return null;
                }
                return EnumC431710GwL.CUSTOM;
            case 188702929:
                if (!str.equals("ellipsis")) {
                    return null;
                }
                return EnumC431710GwL.ELLIPSIS;
            case 985920449:
                if (!str.equals("see_more")) {
                    return null;
                }
                return EnumC431710GwL.SEE_MORE;
            case 1196165383:
                if (!str.equals("view_all")) {
                    return null;
                }
                return EnumC431710GwL.VIEW_ALL;
            default:
                return null;
        }
    }
}
