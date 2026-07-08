package X;

/* JADX INFO: renamed from: X.14dL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20308914dL implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, obj);
                break;
            case 1:
                onResult$1(this, obj);
                break;
            case 2:
                onResult$2(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20308914dL(Object obj, C1292030jj7<C1294720jnS> c1292030jj7) {
        this.$t = c1292030jj7;
        this.l0 = obj;
    }

    public static final void onResult$0(C20308914dL c20308914dL, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        C1292030jj7<C1294720jnS> c1292030jj7 = ((C20270314Td) c20308914dL.l0).LJIIJ;
        if (c1292030jj7 != null) {
            c1292030jj7.LJII(c20308914dL);
        }
        C20270314Td c20270314Td = (C20270314Td) c20308914dL.l0;
        if (!c20270314Td.LJIIL && !c20270314Td.LJIIIIZZ) {
            c20270314Td.LJIIIIZZ = true;
            c20270314Td.LIZ.LIZIZ(c1294720jnS);
        }
    }

    public static final void onResult$1(C20308914dL c20308914dL, Object obj) {
        ((C1292030jj7) c20308914dL.l0).LJI(c20308914dL);
    }

    public static final void onResult$2(C20308914dL c20308914dL, Object obj) {
        C1647306ch.LIZ(null, "load lottie fail!", false);
        ((C1292030jj7) c20308914dL.l0).LJI(c20308914dL);
    }
}
