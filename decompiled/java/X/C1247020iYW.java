package X;

/* JADX INFO: renamed from: X.0iYW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247020iYW {
    public static EnumC1247010iYV LIZ(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        EnumC1247010iYV enumC1247010iYV = EnumC1247010iYV.map.get(Integer.valueOf(iIntValue));
        if (enumC1247010iYV == null) {
            return EnumC1247010iYV.FOLLOWER;
        }
        return enumC1247010iYV;
    }
}
