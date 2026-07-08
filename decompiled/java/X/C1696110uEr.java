package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696110uEr implements InterfaceC1679550to9 {
    public int LL;
    public float LLILLJJLI = 1.0f;
    public float LLILLL = 1.0f;
    public float LLILZ = 1.0f;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public long LLJILLL;
    public InterfaceC1680710tq1 LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public long LLJJIJI;
    public InterfaceC1690500u5o LLJJIJIIJIL;
    public EnumC1671200tag LLJJIJIL;
    public AbstractC1683790tuz LLJJJ;
    public AbstractC1680810tqB LLJJJIL;

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJJLIIIJLJLI(long j) {
        return C1682420tsm.LIZLLL(j, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJLI(long j) {
        return C1682420tsm.LIZIZ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ long LJLJLJ(float f) {
        return C1685230txJ.LIZIZ(this, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ int LJLLJ(float f) {
        return C1682420tsm.LIZ(f, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ float LJLLL(long j) {
        return C1682420tsm.LIZJ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ float LLI(long j) {
        return C1685230txJ.LIZ(this, j);
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LLJJIJIIJIL.LJJ();
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LLJJIJIIJIL.getDensity();
    }

    public C1696110uEr() {
        long j = C1679650toJ.LIZ;
        this.LLIZLLLIL = j;
        this.LLJ = j;
        this.LLJILJILJ = 8.0f;
        this.LLJILLL = C1676680tjW.LIZIZ;
        this.LLJJ = C1669430tXp.LIZ;
        this.LLJJIII = 0;
        this.LLJJIJI = 9205357640488583168L;
        this.LLJJIJIIJIL = C1689930u4t.LIZ(1.0f);
        this.LLJJIJIL = EnumC1671200tag.Ltr;
    }

    @Override // X.InterfaceC1679550to9
    public final long LIZIZ() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1679550to9
    public final void LIZJ(float f) {
        if (this.LLJI != f) {
            this.LL |= 256;
            this.LLJI = f;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJ(float f) {
        if (this.LLJIJIL != f) {
            this.LL |= 512;
            this.LLJIJIL = f;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJFF(float f) {
        if (this.LLJILJIL != f) {
            this.LL |= 1024;
            this.LLJILJIL = f;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJI(float f) {
        if (this.LLILZLL != f) {
            this.LL |= 16;
            this.LLILZLL = f;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJII(float f) {
        if (this.LLILZIL != f) {
            this.LL |= 8;
            this.LLILZIL = f;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJIIIIZZ(AbstractC1683790tuz abstractC1683790tuz) {
        if (!Intrinsics.LJFF(this.LLJJJ, abstractC1683790tuz)) {
            this.LL |= 131072;
            this.LLJJJ = abstractC1683790tuz;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJIIIZ(float f) {
        if (this.LLJILJILJ != f) {
            this.LL |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            this.LLJILJILJ = f;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJIIJ(float f) {
        if (this.LLILLJJLI != f) {
            this.LL |= 1;
            this.LLILLJJLI = f;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJIIJJI(float f) {
        if (this.LLILLL != f) {
            this.LL |= 2;
            this.LLILLL = f;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJIILIIL(boolean z) {
        if (this.LLJJI != z) {
            this.LL |= 16384;
            this.LLJJI = z;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJIILJJIL(float f) {
        if (this.LLIZ != f) {
            this.LL |= 32;
            this.LLIZ = f;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJIILLIIL(long j) {
        if (!C1685910tyP.LJ(this.LLIZLLLIL, j)) {
            this.LL |= 64;
            this.LLIZLLLIL = j;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJIIZILJ(long j) {
        if (!C1685910tyP.LJ(this.LLJ, j)) {
            this.LL |= 128;
            this.LLJ = j;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJIJ(int i) {
        if (this.LLJJIII != i) {
            this.LL |= 32768;
            this.LLJJIII = i;
        }
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * getDensity();
    }

    @Override // X.InterfaceC1679550to9
    public final void LJJLIIIIJ(long j) {
        if (!C1676680tjW.LIZ(this.LLJILLL, j)) {
            this.LL |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            this.LLJILLL = j;
        }
    }

    @Override // X.InterfaceC1679550to9
    public final void LJLJL(InterfaceC1680710tq1 interfaceC1680710tq1) {
        if (!Intrinsics.LJFF(this.LLJJ, interfaceC1680710tq1)) {
            this.LL |= 8192;
            this.LLJJ = interfaceC1680710tq1;
        }
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return f / getDensity();
    }

    @Override // X.InterfaceC1679550to9
    public final void setAlpha(float f) {
        if (this.LLILZ != f) {
            this.LL |= 4;
            this.LLILZ = f;
        }
    }
}
