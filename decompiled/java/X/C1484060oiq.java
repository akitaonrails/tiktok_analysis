package X;

/* JADX INFO: renamed from: X.0oiq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484060oiq implements InterfaceC1483850oiV {
    public final InterfaceC1484080ois LIZ;

    @Override // X.InterfaceC1483850oiV
    public final boolean LJJIJIIJIL() {
        InterfaceC1484080ois interfaceC1484080ois = this.LIZ;
        return interfaceC1484080ois != null && interfaceC1484080ois.LJJIJIIJIL();
    }

    @Override // X.InterfaceC1483850oiV
    public final int getState() {
        InterfaceC1484080ois interfaceC1484080ois = this.LIZ;
        if (interfaceC1484080ois != null) {
            return interfaceC1484080ois.getState();
        }
        return 0;
    }

    @Override // X.InterfaceC1483850oiV
    public final boolean isPaused() {
        InterfaceC1484080ois interfaceC1484080ois = this.LIZ;
        return interfaceC1484080ois != null && interfaceC1484080ois.isPaused();
    }

    @Override // X.InterfaceC1483850oiV
    public final boolean isPlaying() {
        InterfaceC1484080ois interfaceC1484080ois = this.LIZ;
        return interfaceC1484080ois != null && interfaceC1484080ois.isPlaying();
    }

    public C1484060oiq(InterfaceC1484080ois interfaceC1484080ois) {
        this.LIZ = interfaceC1484080ois;
    }
}
