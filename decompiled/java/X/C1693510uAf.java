package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0uAf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693510uAf {
    public static final C1693510uAf LIZIZ = new C1693510uAf(0);
    public static final C1693510uAf LIZJ = new C1693510uAf(1);
    public static final C1693510uAf LIZLLL = new C1693510uAf(2);
    public final int LIZ;

    public final String toString() {
        if (this.LIZ == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.LIZ & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((this.LIZ & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TextDecoration.");
            sbLIZ.append((String) ListProtector.get(arrayList, 0));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TextDecoration[");
        sbLIZ2.append(C09RP.LIZ(arrayList, ", ", null, 62));
        sbLIZ2.append(']');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public C1693510uAf(int i) {
        this.LIZ = i;
    }

    public final boolean LIZ(C1693510uAf c1693510uAf) {
        int i = this.LIZ;
        if ((c1693510uAf.LIZ | i) == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1693510uAf) && this.LIZ == ((C1693510uAf) obj).LIZ) {
            return true;
        }
        return false;
    }
}
