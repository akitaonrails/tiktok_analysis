package X;

/* JADX INFO: renamed from: X.0X76, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X76 {
    public final C0X1V LIZ;
    public final AbstractC842530X3j LIZIZ;

    public C0X76(C0X1V c0x1v, AbstractC842530X3j abstractC842530X3j) {
        this.LIZ = c0x1v;
        this.LIZIZ = abstractC842530X3j;
    }

    public static C0X76 LIZ(C0X1V c0x1v, AbstractC842530X3j abstractC842530X3j) {
        if (abstractC842530X3j != null) {
            if (c0x1v != null) {
                if (c0x1v.LIZLLL("Content-Type") == null) {
                    if (c0x1v.LIZLLL("Content-Length") != null) {
                        throw new IllegalArgumentException("Unexpected header: Content-Length");
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
            }
            return new C0X76(c0x1v, abstractC842530X3j);
        }
        throw new NullPointerException("body == null");
    }

    public static C0X76 LIZIZ(String str, String str2, AbstractC842530X3j abstractC842530X3j) {
        if (str != null) {
            StringBuilder sb = new StringBuilder("form-data; name=");
            C0X7A.LJFF(str, sb);
            if (str2 != null) {
                sb.append("; filename=");
                C0X7A.LJFF(str2, sb);
            }
            C0X1U c0x1u = new C0X1U();
            String string = sb.toString();
            C0X1V.LIZIZ("Content-Disposition");
            c0x1u.LIZIZ("Content-Disposition", string);
            return LIZ(new C0X1V(c0x1u), abstractC842530X3j);
        }
        throw new NullPointerException("name == null");
    }
}
