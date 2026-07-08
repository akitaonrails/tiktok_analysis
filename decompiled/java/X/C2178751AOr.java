package X;

import com.ss.ttm.player.s;

/* JADX INFO: renamed from: X.1AOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178751AOr implements InterfaceC1471800oP4 {
    public final InterfaceC2178671AOj LIZ;
    public final InterfaceC1474410oTH LIZIZ;

    @Override // X.InterfaceC1471800oP4
    public final C1474520oTS LIZ() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LIZ;
        if (interfaceC2178671AOj != null) {
            return interfaceC2178671AOj.LIZ();
        }
        return null;
    }

    public final int LIZIZ() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LIZ;
        if (interfaceC2178671AOj != null) {
            return interfaceC2178671AOj.getCurrentPosition();
        }
        return 0;
    }

    public final int LIZJ() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LIZ;
        if (interfaceC2178671AOj != null) {
            return interfaceC2178671AOj.getDuration();
        }
        return 0;
    }

    public final boolean LIZLLL() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LIZ;
        return interfaceC2178671AOj != null && interfaceC2178671AOj.isLoop();
    }

    @Override // X.InterfaceC1471800oP4
    public final s LJII() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LIZ;
        if (interfaceC2178671AOj != null) {
            return interfaceC2178671AOj.LJII();
        }
        return null;
    }

    @Override // X.InterfaceC1471800oP4
    public final EnumC2281151EQn getResolution() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LIZ;
        if (interfaceC2178671AOj != null) {
            return interfaceC2178671AOj.getResolution();
        }
        return null;
    }

    public C2178751AOr(InterfaceC2178671AOj interfaceC2178671AOj, InterfaceC1474410oTH interfaceC1474410oTH) {
        this.LIZ = interfaceC2178671AOj;
        this.LIZIZ = interfaceC1474410oTH;
    }
}
