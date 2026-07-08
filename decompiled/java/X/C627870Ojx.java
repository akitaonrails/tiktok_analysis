package X;

/* JADX INFO: renamed from: X.0Ojx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627870Ojx {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC627880Ojy LIZ(int i) {
        if (i == EnumC1430380nKG.CT_DUET_ANCHOR.getTYPE()) {
            return EnumC627880Ojy.DUET;
        }
        if (i == EnumC1430380nKG.CT_AI_MAGIC_ANCHOR.getTYPE()) {
            return EnumC627880Ojy.AI_MAGIC;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum constant ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZIZ(EnumC627880Ojy enumC627880Ojy) {
        int i = C627890Ojz.LIZ[enumC627880Ojy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "magic_page";
            }
            throw new C1954807lC();
        }
        return "duet_page";
    }
}
