package X;

import com.ss.android.ugc.musicprovider.provider.MusicPlayer;

/* JADX INFO: renamed from: X.15Ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20498815Ja implements InterfaceC20499215Je {
    public final InterfaceC20499215Je LL;

    @Override // X.InterfaceC20499215Je
    public final int K2() {
        return this.LL.K2();
    }

    @Override // X.InterfaceC20499215Je
    public final int LJI() {
        return this.LL.LJI();
    }

    @Override // X.InterfaceC20499215Je
    public final boolean isPlaying() {
        return this.LL.isPlaying();
    }

    @Override // X.InterfaceC20499215Je
    public final void pause() {
        this.LL.pause();
    }

    @Override // X.InterfaceC20499215Je
    public final void release() {
        this.LL.release();
    }

    @Override // X.InterfaceC20499215Je
    public final void resume() {
        this.LL.resume();
    }

    @Override // X.InterfaceC20499215Je
    public final void stop() {
        this.LL.stop();
    }

    public C20498815Ja() {
        C1490520otG c1490520otGLJFF = C1490520otG.LJFF();
        if (c1490520otGLJFF.LIZJ == null) {
            c1490520otGLJFF.LJI();
        }
        this.LL = new MusicPlayer(c1490520otGLJFF.LIZJ);
        LJII();
    }

    public static void LJII() {
        String path;
        C1490520otG c1490520otGLJFF = C1490520otG.LJFF();
        if (c1490520otGLJFF.LIZIZ == null) {
            c1490520otGLJFF.LJI();
        }
        InterfaceC1490530otH interfaceC1490530otH = c1490520otGLJFF.LIZIZ;
        String str = "";
        if (interfaceC1490530otH != null && (path = interfaceC1490530otH.getPath()) != null) {
            str = path;
        }
        String strLIZ = C1490520otG.LJFF().LIZ();
        if (!C1487190ont.LIZ(str)) {
            C1487190ont.LIZIZ(str);
        }
        if (C1487190ont.LIZ(strLIZ)) {
            return;
        }
        C1487190ont.LIZIZ(strLIZ);
    }

    public C20498815Ja(String str) {
        this.LL = new C1485040okQ(str == null ? "" : str);
        LJII();
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZ(InterfaceC1485100okW interfaceC1485100okW) {
        this.LL.LIZ(interfaceC1485100okW);
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZIZ(C1485060okS c1485060okS) {
        this.LL.LIZIZ(c1485060okS);
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZJ(InterfaceC1485110okX interfaceC1485110okX) {
        this.LL.LIZJ(interfaceC1485110okX);
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZLLL(C0PDN c0pdn) {
        this.LL.LIZLLL(c0pdn);
    }

    @Override // X.InterfaceC20499215Je
    public final void LJ(InterfaceC1485120okY interfaceC1485120okY) {
        this.LL.LJ(interfaceC1485120okY);
    }

    @Override // X.InterfaceC20499215Je
    public final void Of(InterfaceC1485080okU interfaceC1485080okU) {
        this.LL.Of(interfaceC1485080okU);
    }

    @Override // X.InterfaceC20499215Je
    public final void LJIILLIIL(float f, float f2) {
        this.LL.LJIILLIIL(f, f2);
    }

    @Override // X.InterfaceC20499215Je
    public final void Nf(int i, InterfaceC1485090okV interfaceC1485090okV) {
        this.LL.Nf(i, interfaceC1485090okV);
    }

    @Override // X.InterfaceC20499215Je
    public final void LJFF(String str, String str2, InterfaceC1475840oVa interfaceC1475840oVa) {
        this.LL.LJFF(str, str2, interfaceC1475840oVa);
    }
}
