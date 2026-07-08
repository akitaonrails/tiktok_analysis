package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636130sg7 extends AbstractC1636120sg6 {
    public final Effect LIZIZ;

    @Override // X.AbstractC1636120sg6
    public final String LJIIJJI() {
        return C13LP.LJJLIIIJ(this.LIZIZ.getIconUrl().getUrlList(), null, null, null, 0, null, null, 63);
    }

    @Override // X.AbstractC1636120sg6
    public final String LJIIL() {
        return this.LIZIZ.getId();
    }

    @Override // X.AbstractC1636120sg6
    public final String LJIILIIL() {
        return C1462560oAA.LJII(this.LIZIZ.getTags());
    }

    public C1636130sg7(Effect effect) {
        this.LIZIZ = effect;
    }
}
