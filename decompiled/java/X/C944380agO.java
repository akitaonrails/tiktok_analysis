package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;

/* JADX INFO: renamed from: X.0agO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944380agO {
    public final IInteractService LIZ;
    public final C963970bBz LIZIZ;
    public boolean LIZJ;

    public final void LIZ() {
        if (this.LIZJ) {
            this.LIZ.Id0(this.LIZIZ);
            this.LIZJ = false;
        }
    }

    public final void LIZIZ(C944350agL c944350agL) {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        C963970bBz c963970bBz = this.LIZIZ;
        c963970bBz.LIZLLL = c944350agL;
        this.LIZ.EM(c963970bBz);
    }

    public C944380agO(IInteractService iInteractService, C963970bBz c963970bBz) {
        this.LIZ = iInteractService;
        this.LIZIZ = c963970bBz;
    }
}
