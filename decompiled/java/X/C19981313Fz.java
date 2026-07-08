package X;

/* JADX INFO: renamed from: X.13Fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19981313Fz {
    public static final C13GT LIZ(C13HB c13hb) {
        C13GT c13gt;
        if ((c13hb instanceof C13GT) && (c13gt = (C13GT) c13hb) != null) {
            return c13gt;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        sbLIZ.append(C13LE.LIZ(c13hb.getClass()));
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ(C13HD c13hd) {
        if ((c13hd instanceof C13HH) && c13hd != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        sbLIZ.append(C13LE.LIZ(c13hd.getClass()));
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
