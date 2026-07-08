package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.143x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202047143x implements InterfaceC202048143y {
    public final /* synthetic */ C013C LIZ;
    public final /* synthetic */ MusicModel LIZIZ;
    public final /* synthetic */ InterfaceC202048143y LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ AbstractC1661230tKb LJ;

    @Override // X.InterfaceC202048143y
    public final void LIZIZ() {
        C013C c013c = this.LIZ;
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        C202045143v c202045143v = C202045143v.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRetry musicId = ");
        sbLIZ.append(this.LIZIZ.getMusicId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c202045143v.getClass();
        C202045143v.LIZJ(strLIZIZ);
        this.LIZJ.LIZIZ();
    }

    @Override // X.InterfaceC202048143y
    public final void LJJJLIIL(String str) {
        C202045143v c202045143v = C202045143v.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFinish musicId = ");
        sbLIZ.append(this.LIZIZ.getMusicId());
        sbLIZ.append(" url = ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c202045143v.getClass();
        C202045143v.LIZJ(strLIZIZ);
        this.LIZJ.LJJJLIIL(str);
    }

    @Override // X.InterfaceC202048143y
    public final void LIZ(int i, String str) {
        C013C c013c = this.LIZ;
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        C202045143v c202045143v = C202045143v.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError musicId = ");
        sbLIZ.append(this.LIZIZ.getMusicId());
        sbLIZ.append(" msg = ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c202045143v.getClass();
        C202045143v.LIZJ(strLIZIZ);
        this.LIZJ.LIZ(i, str);
        C202045143v.LIZLLL(this.LIZLLL, this.LJ.LIZ, false, false);
    }

    @Override // X.InterfaceC202048143y
    public final void LIZJ(String str, boolean z) {
        C013C c013c = this.LIZ;
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        C202045143v c202045143v = C202045143v.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSuccess: musicId = ");
        sbLIZ.append(this.LIZIZ.getMusicId());
        sbLIZ.append(" url = ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c202045143v.getClass();
        C202045143v.LIZJ(strLIZIZ);
        this.LIZJ.LIZJ(str, z);
        C202045143v.LIZLLL(this.LIZLLL, this.LJ.LIZ, true, z);
    }

    public C202047143x(C013C c013c, MusicModel musicModel, InterfaceC202048143y interfaceC202048143y, long j, AbstractC1661230tKb abstractC1661230tKb) {
        this.LIZ = c013c;
        this.LIZIZ = musicModel;
        this.LIZJ = interfaceC202048143y;
        this.LIZLLL = j;
        this.LJ = abstractC1661230tKb;
    }
}
