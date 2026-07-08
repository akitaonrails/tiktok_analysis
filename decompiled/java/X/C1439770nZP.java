package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;

/* JADX INFO: renamed from: X.0nZP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439770nZP implements InterfaceC1645830svl {
    public final /* synthetic */ C1439740nZM LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    public C1439770nZP(C1439740nZM c1439740nZM, String str, String str2) {
        this.LIZ = c1439740nZM;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    @Override // X.InterfaceC1645830svl
    public final void LIZ(AVChallenge aVChallenge) {
        this.LIZ.LIZ().getStickerList().add(this.LIZIZ);
        this.LIZ.LIZ().getStickerToChallenge().put(this.LIZJ, aVChallenge);
    }
}
