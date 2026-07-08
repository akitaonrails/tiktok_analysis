package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YR2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YR2 implements C1DW6 {
    public static final C0YR2 LL = new C0YR2();

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
    }

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    public static void LIZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return;
        }
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZJ(c869590Y9l.getConversationId(), new C914090ZtX(3));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && C880080Yfm.LIZIZ(c869590Y9l)) {
            LIZ(c869590Y9l);
            C23250099c.LIZLLL(C0YR3.LIZ, null, null, new C0YNV(c869590Y9l, null), 3);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && C880080Yfm.LIZIZ(c869590Y9l)) {
            LIZ(c869590Y9l);
            C23250099c.LIZLLL(C0YR3.LIZ, null, null, new C0YNV(c869590Y9l, null), 3);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(final String str) {
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZJ(str, new InterfaceC863600XuI<C0Y8T>() { // from class: X.0YR1
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
            }

            @Override // X.InterfaceC863600XuI
            public final void onSuccess(C0Y8T c0y8t) {
                C0Y8T c0y8t2 = c0y8t;
                if (c0y8t2 != null && c0y8t2.isGroupChat()) {
                    C874150YQz.LIZ.getClass();
                    C874150YQz.LIZIZ.put(c0y8t2.getConversationId(), new C0YR4(2));
                    C054G c054g = C0YR3.LIZ;
                    C23250099c.LIZLLL(C0YR3.LIZ, null, null, new C0YNT(str, null), 3);
                }
            }
        });
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
        if (c869590Y9l != null && C880080Yfm.LIZJ(c869590Y9l)) {
            LIZ(c869590Y9l);
            C23250099c.LIZLLL(C0YR3.LIZ, null, null, new C0YNU(c869590Y9l, null), 3);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        if (list == null) {
            return;
        }
        for (C869590Y9l c869590Y9l : list) {
            if (C880080Yfm.LIZJ(c869590Y9l)) {
                LIZ(c869590Y9l);
                C23250099c.LIZLLL(C0YR3.LIZ, null, null, new C0YNU(c869590Y9l, null), 3);
            }
        }
    }
}
