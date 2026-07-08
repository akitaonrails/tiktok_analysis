package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308740C8i extends C09AY implements Function0<EnumC308730C8h> {
    public C308740C8i() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final EnumC308730C8h invoke() {
        if (C0NHD.LIZ()) {
            return EnumC308730C8h.NORMAL;
        }
        if (!((Boolean) C0BPV.LIZ.getValue()).booleanValue()) {
            return EnumC308730C8h.NONE;
        }
        C308750C8j c308750C8j = EnumC308730C8h.Companion;
        EnumC1335310kqv enumC1335310kqvLIZLLL = C1336210ksN.LIZLLL();
        c308750C8j.getClass();
        if (((Boolean) C269900Ahw.LIZ.getValue()).booleanValue()) {
            int i = C1335300kqu.LIZ[enumC1335310kqvLIZLLL.ordinal()];
            return i != 1 ? i != 2 ? EnumC308730C8h.NONE : EnumC308730C8h.MINI : EnumC308730C8h.AIR;
        }
        switch (C1335300kqu.LIZ[enumC1335310kqvLIZLLL.ordinal()]) {
            case 1:
                return EnumC308730C8h.AIR;
            case 2:
                return EnumC308730C8h.MINI;
            case 3:
            case 4:
            case 5:
                return EnumC308730C8h.NORMAL;
            case 6:
                return EnumC308730C8h.NONE;
            default:
                throw new C1954807lC();
        }
    }
}
