package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EXO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXO implements InterfaceC379610EuV, InterfaceC350220DoC, C0EMV {
    public static final C0EXP LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public Pair<String, ? extends AVMusic> LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final C0EY6 LLILZ = new C0EY6(this);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXO.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = new C0EXP();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0EXO(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1454960nxu.class, null);
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        Pair<String, ? extends AVMusic> pair = this.LLILLJJLI;
        if (pair != null) {
            C0EY6 c0ey6 = this.LLILZ;
            String first = pair.getFirst();
            AVMusic second = pair.getSecond();
            C0EXO c0exo = c0ey6.LIZ;
            InterfaceC1454960nxu interfaceC1454960nxu = (InterfaceC1454960nxu) c0exo.LLILLL.getValue(c0exo, LLILZLL[0]);
            if (interfaceC1454960nxu != null) {
                interfaceC1454960nxu.Rq(first, second, false, true, false, false, -1L, false, true, "", false, null);
            }
        }
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01eb  */
    @Override // X.InterfaceC350220DoC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C0EMN r16) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXO.LIZLLL(X.0EMN):void");
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        LIZ(c0emo);
    }
}
