package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0nZO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439760nZO implements InterfaceC1645830svl {
    public final /* synthetic */ C1439740nZM LIZ;
    public final /* synthetic */ Effect LIZIZ;

    public C1439760nZO(C1439740nZM c1439740nZM, Effect effect) {
        this.LIZ = c1439740nZM;
        this.LIZIZ = effect;
    }

    @Override // X.InterfaceC1645830svl
    public final void LIZ(AVChallenge aVChallenge) {
        this.LIZ.LIZ().getStickerList().add(this.LIZIZ.getEffectId());
        this.LIZ.LIZ().getStickerToChallenge().put(this.LIZIZ.getEffectId(), aVChallenge);
    }
}
