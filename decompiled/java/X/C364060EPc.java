package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;

/* JADX INFO: renamed from: X.0EPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364060EPc implements InterfaceC1645830svl {
    public final /* synthetic */ C1439740nZM LIZ;
    public final /* synthetic */ String LIZIZ;

    public C364060EPc(C1439740nZM c1439740nZM, String str) {
        this.LIZ = c1439740nZM;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC1645830svl
    public final void LIZ(AVChallenge aVChallenge) {
        this.LIZ.LIZ().getEditEffectStickerChallengeList().add(aVChallenge);
        this.LIZ.LIZ().getStickerToChallenge().put(this.LIZIZ, aVChallenge);
    }
}
