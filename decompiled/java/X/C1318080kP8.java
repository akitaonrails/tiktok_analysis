package X;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: X.0kP8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318080kP8 extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public C1318080kP8() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public C1318080kP8(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1318080kP8(int i, int i2, int i3, Throwable th) {
        String strK4 = C786410Ut5.k4(Locale.US, "Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(i), Long.valueOf(i2), Integer.valueOf(i3)});
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
        sbLIZ.append(strK4);
        super(C2188811AlT.LIZIZ(sbLIZ), th);
    }
}
