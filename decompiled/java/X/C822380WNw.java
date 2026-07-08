package X;

/* JADX INFO: renamed from: X.0WNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822380WNw {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC822390WNx LIZ(String str) {
        switch (str.hashCode()) {
            case -891985903:
                if (str.equals("string")) {
                    return EnumC822390WNx.Str;
                }
                break;
            case -567811164:
                if (str.equals("constant")) {
                    return EnumC822390WNx.Constant;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    return EnumC822390WNx.Int;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    return EnumC822390WNx.Bool;
                }
                break;
            case 93090393:
                if (str.equals("array")) {
                    return EnumC822390WNx.Array;
                }
                break;
        }
        return EnumC822390WNx.Null;
    }
}
