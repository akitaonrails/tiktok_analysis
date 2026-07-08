package X;

/* JADX INFO: renamed from: X.08FM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C08FM {
    public static /* synthetic */ int LIZ(int i, String str) {
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long j = Long.parseLong(str, i);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }
}
