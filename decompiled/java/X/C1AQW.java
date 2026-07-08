package X;

/* JADX INFO: renamed from: X.1AQW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AQW implements InterfaceC2179191AQj, C1AR6 {
    public final /* synthetic */ C1AQV LL;

    @Override // X.C1AR6
    public final void LJI(InterfaceC2179261AQq interfaceC2179261AQq) {
    }

    @Override // X.C1AR6
    public final void LJIIL(C1AQY c1aqy) {
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIIZILJ(long j) {
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPrepare() {
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPrepared() {
    }

    @Override // X.InterfaceC2179191AQj
    public final void onCompletion() {
        C1AQX c1aqx = this.LL.LIZIZ;
        if (c1aqx != null) {
            c1aqx.LJIIJJI(C1ANG.PLAYBACK_STATE_ENDED);
        }
    }

    public C1AQW(C1AQV c1aqv) {
        this.LL = c1aqv;
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJ(EnumC1782190wTh enumC1782190wTh) {
        C1AQX c1aqx = this.LL.LIZIZ;
        if (c1aqx != null) {
            c1aqx.LJ(enumC1782190wTh);
        }
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJFF(C1AN0 c1an0) {
        String string;
        C1AQX c1aqx = this.LL.LIZIZ;
        if (c1aqx != null) {
            c1aqx.onError(c1an0.getCode(), c1an0.getMsg());
        }
        C1AQV c1aqv = this.LL;
        C1AOB c1aob = c1aqv.LJII;
        String desc = c1aqv.LJI.getDesc();
        C1AQV c1aqv2 = this.LL;
        boolean z = c1aqv2.LJIILL;
        InterfaceC2179261AQq interfaceC2179261AQq = c1aqv2.LJIILIIL;
        if (interfaceC2179261AQq != null) {
            string = interfaceC2179261AQq.toString();
        } else {
            string = null;
        }
        c1aob.LIZIZ(-1, -1, desc, "play error final", string, z);
    }

    @Override // X.C1AR6
    public final void LJIIIZ(InterfaceC2179131AQd interfaceC2179131AQd) {
        C1AQX c1aqx = this.LL.LIZIZ;
        if (c1aqx != null) {
            c1aqx.LJFF();
        }
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIIJJI(C2179231AQn c2179231AQn) {
        C2179281AQs c2179281AQs;
        C1AQV c1aqv = this.LL;
        C1AQX c1aqx = c1aqv.LIZIZ;
        if (c1aqx != null) {
            c1aqx.LJI(c1aqv.LJIIL());
        }
        C1AQV c1aqv2 = this.LL;
        if (c1aqv2.LJIILL && (c2179281AQs = c1aqv2.LIZJ) != null) {
            c2179281AQs.LJII(null);
        }
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIILIIL(EnumC1778440wNe enumC1778440wNe) {
        C1AQV c1aqv;
        C1AQX c1aqx;
        if (enumC1778440wNe == EnumC1778440wNe.SEEK_SUCCESS && (c1aqx = (c1aqv = this.LL).LIZIZ) != null) {
            c1aqx.LJIILIIL(c1aqv.LIZIZ());
        }
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIILLIIL(C1ANF c1anf) {
        C1AQX c1aqx = this.LL.LIZIZ;
        if (c1aqx != null) {
            c1aqx.LJIIJJI(C1AQV.LIZLLL(c1anf));
        }
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPlaybackTimeChanged(long j) {
        C1AQX c1aqx = this.LL.LIZIZ;
        if (c1aqx != null) {
            c1aqx.LJJIIZ((int) j);
        }
    }
}
