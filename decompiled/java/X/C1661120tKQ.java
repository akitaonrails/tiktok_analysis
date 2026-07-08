package X;

import Y.AfS194S0100000_25;
import Y.AfS1S0112000_25;
import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.0tKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661120tKQ extends AbstractC1661070tKL {
    public final C1661110tKP LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;

    @Override // X.AbstractC1661070tKL
    public final C09JN<C1661140tKS> LJI() {
        return new AfS1S0112000_25(this, 0);
    }

    @Override // X.AbstractC1661070tKL
    public final C09JN<C1661050tKJ> LJII() {
        return new AfS194S0100000_25(this, 203);
    }

    @Override // X.AbstractC1661070tKL
    public final boolean LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC1661070tKL
    public final boolean LJ() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC1661070tKL
    public final void LIZIZ(InterfaceC1661080tKM interfaceC1661080tKM) {
        C1661090tKN c1661090tKN = this.LJII;
        if (c1661090tKN != null) {
            c1661090tKN.LJFF(interfaceC1661080tKM);
        }
    }

    public C1661120tKQ(Context context, String str, MusicModel musicModel, String str2, boolean z) {
        String musicId;
        Context contextN3 = C786410Ut5.N3(context);
        C202033143j c202033143j = new C202033143j(context, false, true, true, "prop_detail_page");
        c202033143j.LIZIZ.LJ = 2;
        super(contextN3, str, musicModel, c202033143j);
        if (musicModel != null) {
            musicId = musicModel.getMusicId();
        } else {
            musicId = null;
        }
        this.LJIIIIZZ = new C1661110tKP(str2, str, musicId);
        this.LJIIIZ = true;
        this.LJIIJ = z;
    }
}
