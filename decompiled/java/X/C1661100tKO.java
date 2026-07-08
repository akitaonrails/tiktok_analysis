package X;

import Y.AfS194S0100000_25;
import Y.AfS1S0112000_25;
import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.0tKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661100tKO extends AbstractC1661070tKL {
    public final C1661110tKP LJIIIIZZ;

    @Override // X.AbstractC1661070tKL
    public final C09JN<C1661140tKS> LJI() {
        return new AfS1S0112000_25(this, 1);
    }

    @Override // X.AbstractC1661070tKL
    public final C09JN<C1661050tKJ> LJII() {
        return new AfS194S0100000_25(this, 204);
    }

    @Override // X.AbstractC1661070tKL
    public final boolean LIZLLL() {
        return C298000BmA.LIZ();
    }

    @Override // X.AbstractC1661070tKL
    public final void LIZIZ(InterfaceC1661080tKM interfaceC1661080tKM) {
        C1661090tKN c1661090tKN = this.LJII;
        if (c1661090tKN != null) {
            c1661090tKN.LJFF(interfaceC1661080tKM);
        }
    }

    public C1661100tKO(Context context, String str, MusicModel musicModel, C202033143j c202033143j, String str2) {
        String musicId;
        super(C786410Ut5.N3(context), str, musicModel, c202033143j);
        if (musicModel != null) {
            musicId = musicModel.getMusicId();
        } else {
            musicId = null;
        }
        this.LJIIIIZZ = new C1661110tKP(str2, str, musicId);
    }
}
