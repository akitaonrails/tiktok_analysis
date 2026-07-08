package X;

import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import lnn.q;
import lth.o;

/* JADX INFO: renamed from: X.0sMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624180sMq {
    public final C1DRG LIZ;
    public final C19EG LIZIZ;
    public final C1624130sMl LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final Effect LIZIZ() {
        q qVar;
        C1DRG c1drg = this.LIZ;
        if (c1drg == null || (qVar = (q) c1drg.LJIIL(null, q.class)) == null) {
            return null;
        }
        return (Effect) qVar.C0().LJII().LJIJJLI().getValue();
    }

    public final boolean LIZ() {
        Effect effectLIZIZ = LIZIZ();
        if (!C1624200sMs.LJIIJ(effectLIZIZ) || C1624170sMp.LIZ(effectLIZIZ)) {
            return false;
        }
        this.LIZJ.getClass();
        this.LIZJ.getClass();
        return true;
    }

    public C1624180sMq(C1DRG c1drg) {
        new OnUnlockShareFinishListener() { // from class: X.0sXn
            @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onVKShareSucceed(Effect effect) {
            }

            @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onShareAppFailed() {
                InterfaceC1624140sMm interfaceC1624140sMm = o.LJJI;
                C19EG c19eg = this.LIZ.LIZIZ;
                interfaceC1624140sMm.getClass();
                C1627480sSA.LIZ(c19eg);
            }

            @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onShareAppSucceed(Effect effect) {
                C1630980sXo c1630980sXo = new C1630980sXo();
                c1630980sXo.LIZ = UnLockSticker.STICKER_UNLOCKED;
                c1630980sXo.LIZIZ = effect;
                c1630980sXo.LIZJ = true;
                C1440005kM.LIZIZ(c1630980sXo);
            }
        };
        this.LIZIZ = (C19EG) c1drg.LJII(C19EG.class, null);
        this.LIZ = c1drg;
        LIZIZ();
        InterfaceC1624140sMm interfaceC1624140sMm = o.LJJI;
        interfaceC1624140sMm.getClass();
        interfaceC1624140sMm.getClass();
        this.LIZJ = new C1624130sMl();
    }
}
