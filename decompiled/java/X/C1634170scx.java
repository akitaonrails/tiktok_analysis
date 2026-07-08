package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0scx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634170scx extends AbstractC1634150scv<String, Unit> implements InterfaceC1632780sai {
    public C1634170scx(final Function0<? extends InterfaceC1635390sev> function0) {
        new InterfaceC1632640saU<ProviderEffect, RESULT, INFO>(function0) { // from class: X.0scv
            public final Function0<InterfaceC1635390sev> LIZ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = function0;
            }

            @Override // X.InterfaceC1632640saU
            public final void LIZIZ(ProviderEffect providerEffect, InterfaceC1632620saS interfaceC1632620saS) {
                ProviderEffect providerEffect2 = providerEffect;
                this.LIZ.invoke().LJIIJJI(providerEffect2, new C1634160scw((C1632770sah) interfaceC1632620saS, providerEffect2, this));
            }
        };
    }
}
