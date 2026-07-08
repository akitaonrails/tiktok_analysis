package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0kOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317920kOs extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public C1317920kOs() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public C1317920kOs(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1317920kOs(String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ), th);
    }
}
