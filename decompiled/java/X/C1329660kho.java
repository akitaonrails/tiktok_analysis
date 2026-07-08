package X;

/* JADX INFO: renamed from: X.0kho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329660kho implements InterfaceC1330330kit {
    public static final Class<?> LIZIZ = C1329660kho.class;
    public final int LIZ;

    public C1329660kho() {
        this(3);
    }

    public C1329660kho(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC1330330kit
    public final void LIZ(InterfaceC1331320kkU interfaceC1331320kkU, InterfaceC1329690khr interfaceC1329690khr, InterfaceC1330960kju interfaceC1330960kju, int i) {
        for (int i2 = 1; i2 <= this.LIZ; i2++) {
            int frameCount = (i + i2) % interfaceC1330960kju.getFrameCount();
            if (C1328570kg3.LJIIJ(2)) {
                C1328570kg3.LJIIL(LIZIZ, "Preparing frame %d, last drawn: %d", Integer.valueOf(frameCount), Integer.valueOf(i));
            }
            ((C1329650khn) interfaceC1331320kkU).LIZ(interfaceC1329690khr, interfaceC1330960kju, frameCount);
        }
    }
}
