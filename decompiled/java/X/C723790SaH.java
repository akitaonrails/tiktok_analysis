package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723790SaH extends C09AY implements Function0<Assembler> {
    public final /* synthetic */ C723820SaK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723790SaH(C723820SaK c723820SaK) {
        super(0);
        this.LL = c723820SaK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Assembler invoke() {
        Assembler assembler = new Assembler();
        final C723820SaK c723820SaK = this.LL;
        c723820SaK.getClass();
        C0RTY c0rty = new C0RTY(null);
        C724710Sbl c724710Sbl = new C724710Sbl(null);
        AssemSupervisor assemSupervisor = new AssemSupervisor(c723820SaK.LIZIZ, null, c0rty, c724710Sbl);
        AbstractC724890Sc3 abstractC724890Sc3 = c723820SaK.LIZIZ;
        assembler.NQ2(abstractC724890Sc3, c0rty);
        assembler.OQ2(abstractC724890Sc3, c724710Sbl);
        assembler.PQ2(abstractC724890Sc3, assemSupervisor);
        LifecycleOwner lifecycleOwner = c723820SaK.LIZ;
        if (lifecycleOwner != null) {
            assembler.NQ2(lifecycleOwner, c0rty);
            assembler.OQ2(lifecycleOwner, c724710Sbl);
            assembler.PQ2(lifecycleOwner, assemSupervisor);
        }
        assembler.LLILLJJLI = new C723780SaG(c723820SaK);
        assembler.LLILLL = new C0RTR() { // from class: X.0SaJ
            @Override // X.C0RTR
            public final void LIZ(Runnable runnable) throws InterruptedException {
                c723820SaK.LJ.put(runnable);
            }
        };
        return assembler;
    }
}
