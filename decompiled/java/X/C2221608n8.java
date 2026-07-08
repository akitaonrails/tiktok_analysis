package X;

import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: X.08n8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2221608n8 extends C2221108n3 implements Comparable {
    public final ZipEntry LLILLL;
    public final int LLILZ;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.LL.compareTo(((C2221108n3) obj).LL);
    }

    public C2221608n8(String str, ZipEntry zipEntry, int i) {
        super(str, C786410Ut5.j4("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
        this.LLILLL = zipEntry;
        this.LLILZ = i;
    }
}
