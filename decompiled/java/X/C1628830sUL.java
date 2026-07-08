package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0sUL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628830sUL extends C11T3<Unit, CategoryPageModel, C1631810sZ9, CategoryPageModel> {
    public final String LIZ;
    public final InterfaceC1635390sev LIZIZ;
    public final C01GW<C091J> LIZJ;

    @Override // X.C11T3, X.C11T4
    public final /* bridge */ /* synthetic */ Object convertKeyActual(Object obj) {
        return Unit.LIZ;
    }

    @Override // X.C11T3
    public final C11NZ<CategoryPageModel> requestActual(C1631810sZ9 c1631810sZ9) {
        InterfaceC1628810sUJ interfaceC1628810sUJLIZJ;
        C1631810sZ9 c1631810sZ92 = c1631810sZ9;
        InterfaceC2176408fq interfaceC2176408fq = this.LIZJ.getValue().LIZLLL().get(c1631810sZ92.LIZ);
        if (interfaceC2176408fq != null && (interfaceC1628810sUJLIZJ = interfaceC2176408fq.LIZJ()) != null) {
            return interfaceC1628810sUJLIZJ.LIZIZ(c1631810sZ92).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0njl
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return new CategoryPageModel((CategoryEffectModel) obj, new ArrayList(), null);
                }
            });
        }
        return C11NZ.LJIJJLI(new C1698340uIS(this, c1631810sZ92, 5));
    }

    @Override // X.C11T3, X.C11T4
    public final Object convertValActual(Object obj, Object obj2) {
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1628830sUL(String str, InterfaceC1635390sev interfaceC1635390sev, C01GW<? extends C091J> c01gw) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1635390sev;
        this.LIZJ = c01gw;
    }
}
