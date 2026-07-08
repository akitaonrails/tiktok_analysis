package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1380105ah {
    public static final /* synthetic */ C1380105ah LIZ = new C1380105ah();
    public static final C1692340u8m LIZIZ = new InterfaceC1692520u94() { // from class: X.0u8m
        @Override // X.InterfaceC1692520u94
        public final C1692450u8x LIZ(C1692350u8n c1692350u8n) {
            boolean z;
            C1692300u8i c1692300u8i = c1692350u8n.LJ;
            C1692580u9A c1692580u9ALIZ = c1692300u8i.LIZ(c1692300u8i.LIZJ);
            C1692300u8i c1692300u8i2 = c1692350u8n.LJ;
            C1692580u9A c1692580u9ALIZ2 = c1692300u8i2.LIZ(c1692300u8i2.LIZLLL);
            if (c1692350u8n.LIZIZ() == EnumC1692390u8r.CROSSED) {
                z = true;
            } else {
                z = false;
            }
            return new C1692450u8x(c1692580u9ALIZ, c1692580u9ALIZ2, z);
        }
    };
    public static final C1692400u8s LIZJ = new C1692400u8s();
    public static final C1692440u8w LIZLLL = new InterfaceC1692520u94() { // from class: X.0u8w
        @Override // X.InterfaceC1692520u94
        public final C1692450u8x LIZ(C1692350u8n c1692350u8n) {
            return C1692360u8o.LIZ(c1692350u8n, new InterfaceC1692690u9L() { // from class: X.0u8v
                @Override // X.InterfaceC1692690u9L
                public final long LIZ(C1692300u8i c1692300u8i, int i) {
                    String str = c1692300u8i.LJFF.LIZ.LIZ.LLILLJJLI;
                    return C1680680tpy.LIZ(C1692490u91.LIZIZ(i, str), C1692490u91.LIZ(i, str));
                }
            });
        }
    };
    public static final C1692380u8q LJ = new InterfaceC1692520u94() { // from class: X.0u8q
        @Override // X.InterfaceC1692520u94
        public final C1692450u8x LIZ(C1692350u8n c1692350u8n) {
            C1692580u9A c1692580u9A;
            C1692580u9A c1692580u9ALIZIZ;
            C1692580u9A c1692580u9A2;
            C1692580u9A c1692580u9A3;
            boolean z;
            C1692450u8x c1692450u8x = c1692350u8n.LIZLLL;
            if (c1692450u8x == null) {
                return C1380105ah.LIZJ.LIZ(c1692350u8n);
            }
            if (c1692350u8n.LIZ) {
                c1692580u9A = c1692450u8x.LIZ;
                c1692580u9ALIZIZ = C1692360u8o.LIZIZ(c1692350u8n, c1692350u8n.LJ, c1692580u9A);
                c1692580u9A3 = c1692450u8x.LIZIZ;
                c1692580u9A2 = c1692580u9ALIZIZ;
            } else {
                c1692580u9A = c1692450u8x.LIZIZ;
                c1692580u9ALIZIZ = C1692360u8o.LIZIZ(c1692350u8n, c1692350u8n.LJ, c1692580u9A);
                c1692580u9A2 = c1692450u8x.LIZ;
                c1692580u9A3 = c1692580u9ALIZIZ;
            }
            if (Intrinsics.LJFF(c1692580u9ALIZIZ, c1692580u9A)) {
                return c1692450u8x;
            }
            if (c1692350u8n.LIZIZ() == EnumC1692390u8r.CROSSED || (c1692350u8n.LIZIZ() == EnumC1692390u8r.COLLAPSED && c1692580u9A2.LIZ > c1692580u9A3.LIZ)) {
                z = true;
            } else {
                z = false;
            }
            return C1692360u8o.LJ(new C1692450u8x(c1692580u9A2, c1692580u9A3, z), c1692350u8n);
        }
    };
}
