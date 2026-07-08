package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05Jw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1333805Jw<COMPONENT, PARAM> {
    public final AbstractC738140SxQ LIZ;
    public final LifecycleOwner LIZIZ;
    public final PARAM LIZJ;

    public final void LIZ(AbstractC1333605Ju<? extends COMPONENT, PARAM> abstractC1333605Ju) {
        if (this.LIZIZ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        try {
            C723850SaN.LIZJ(this.LIZ, new C1333905Jx(abstractC1333605Ju, this));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "component_assembler");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1333805Jw(AbstractC738140SxQ abstractC738140SxQ, LifecycleOwner lifecycleOwner, C2189821An6 c2189821An6) {
        this.LIZ = abstractC738140SxQ;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = c2189821An6;
    }
}
