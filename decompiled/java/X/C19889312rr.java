package X;

import java.io.File;

/* JADX INFO: renamed from: X.12rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19889312rr extends AbstractC19889412rs {
    public final File LIZ;
    public final AbstractC19875112pZ<EnumC19889512rt> LIZIZ;

    public final String toString() {
        String strValueOf = String.valueOf(this.LIZ);
        String strValueOf2 = String.valueOf(this.LIZIZ);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 20 + strValueOf2.length());
        sb.append("Files.asByteSink(");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }

    public C19889312rr(C0VSJ c0vsj, EnumC19889512rt[] enumC19889512rtArr) {
        this.LIZ = c0vsj;
        this.LIZIZ = AbstractC19875112pZ.copyOf(enumC19889512rtArr);
    }
}
