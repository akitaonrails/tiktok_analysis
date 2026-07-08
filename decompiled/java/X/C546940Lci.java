package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.aikit.api.create.AICreateService;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Lci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546940Lci extends AbstractC2255721DQs<InterfaceC548510LfF> implements InterfaceC548510LfF, InterfaceC379610EuV {
    public static final C546970Lcl LLILZIL = new Object() { // from class: X.0Lcl
    };
    public final C1DRG LL;
    public InterfaceC546960Lck LLILLL;
    public final InterfaceC548510LfF LLILLJJLI = this;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(609));

    public final AICreateService X1() {
        return (AICreateService) this.LLILZ.getValue();
    }

    public InterfaceC548510LfF W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C546940Lci(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC548510LfF
    public void EA1(AIGCCreationModel aIGCCreationModel) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C546930Lch(aIGCCreationModel, this, null), 3);
    }

    @Override // X.InterfaceC548510LfF
    public void a30(InterfaceC546960Lck interfaceC546960Lck) {
        this.LLILLL = interfaceC546960Lck;
    }

    @Override // X.InterfaceC548510LfF
    public void iw(C546750LcP c546750LcP) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C546950Lcj(this, c546750LcP, null), 3);
    }

    @Override // X.InterfaceC548510LfF
    public void z1(String str) {
        AICreateService aICreateServiceX1 = X1();
        if (aICreateServiceX1 != null) {
            aICreateServiceX1.z1(str);
        }
    }

    @Override // X.InterfaceC548510LfF
    public void av1(String str, AIGCCreationModel aIGCCreationModel) {
        if (aIGCCreationModel == null) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C546920Lcg(this, str, aIGCCreationModel, null), 2);
    }
}
