package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0PiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC652340PiK {
    public final C652390PiP LL;
    public C653660PkS LLILLJJLI = new C653660PkS();

    public AbstractC652340PiK(C652390PiP c652390PiP) {
        this.LL = c652390PiP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0IeR, X.0PVL] */
    public final void LJII(AbstractC21673619ry abstractC21673619ry) {
        this.LL.LLILLJJLI.scrollToPosition(0);
        final C0PVK c0pvk = this.LL.LL;
        AbstractC21673619ry abstractC21673619ry2 = c0pvk.LL;
        if (abstractC21673619ry2 != abstractC21673619ry) {
            if (abstractC21673619ry2 != null) {
                try {
                    abstractC21673619ry2.unregisterAdapterDataObserver(c0pvk.LLILLJJLI);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c0pvk.LL = abstractC21673619ry;
            ?? r0 = new AbstractC471570IeR(c0pvk) { // from class: X.0PVL
                public final AbstractC21673619ry<?> LIZ;

                @Override // X.AbstractC471570IeR
                public final void LIZ() {
                    this.LIZ.notifyDataSetChanged();
                }

                {
                    this.LIZ = c0pvk;
                }

                @Override // X.AbstractC471570IeR
                public final void LIZIZ(int i, int i2) {
                    this.LIZ.notifyItemRangeChanged(i, i2);
                }

                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    this.LIZ.notifyItemRangeInserted(i, i2);
                }

                @Override // X.AbstractC471570IeR
                public final void LJ(int i, int i2) {
                    this.LIZ.notifyDataSetChanged();
                }

                @Override // X.AbstractC471570IeR
                public final void LJFF(int i, int i2) {
                    this.LIZ.notifyItemRangeRemoved(i, i2);
                }

                @Override // X.AbstractC471570IeR
                public final void LIZJ(int i, int i2, Object obj) {
                    LIZIZ(i, i2);
                    this.LIZ.notifyItemRangeChanged(i, i2, obj);
                }
            };
            c0pvk.LLILLJJLI = r0;
            abstractC21673619ry.registerAdapterDataObserver(r0);
        }
    }
}
