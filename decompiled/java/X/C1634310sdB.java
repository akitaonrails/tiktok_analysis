package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634310sdB extends AbstractC1634090scp<List<? extends AbstractC1634360sdG>> implements InterfaceC1634030scj {
    public final Function0<InterfaceC1635390sev> LIZ;
    public final Function0<String> LIZIZ;
    public final Function0<String> LIZJ;
    public final Function0<String> LIZLLL;
    public final Function1<EffectCategoryResponse, Boolean> LJ;

    @Override // X.AbstractC1634060scm
    public final C11NZ<List<AbstractC1634360sdG>> LJ() {
        return C11NZ.LJIJJLI(new C1698350uIT(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1634310sdB(Function0<? extends InterfaceC1635390sev> function0, Function0<String> function02, Function0<String> function03, Function0<String> function04, Function1<? super EffectCategoryResponse, Boolean> function1) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function03;
        this.LIZLLL = function04;
        this.LJ = function1;
    }
}
