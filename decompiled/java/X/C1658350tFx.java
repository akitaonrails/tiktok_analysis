package X;

/* JADX INFO: renamed from: X.0tFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658350tFx {
    public static final EnumC1308705Af LIZ(EnumC1656620tDA enumC1656620tDA) {
        switch (C1656630tDB.LIZ[enumC1656620tDA.ordinal()]) {
            case 1:
                return EnumC1308705Af.NOT_RECORDING;
            case 2:
            case 3:
            case 4:
                return EnumC1308705Af.RECORDING;
            case 5:
            case 6:
            case 7:
            case 8:
                return EnumC1308705Af.PROCESSING;
            default:
                throw new C1954807lC();
        }
    }
}
