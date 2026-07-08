package X;

/* JADX INFO: renamed from: X.0lzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379010lzP {
    public static EnumC1379020lzQ LIZ(Integer num) {
        for (EnumC1379020lzQ enumC1379020lzQ : EnumC1379020lzQ.values()) {
            int iOrdinal = enumC1379020lzQ.ordinal();
            if (num != null && iOrdinal == num.intValue()) {
                return enumC1379020lzQ;
            }
        }
        return EnumC1379020lzQ.MINIS_TYPE_UNKNOWN;
    }
}
