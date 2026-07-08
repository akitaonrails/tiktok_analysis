package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import pyl.q;

/* JADX INFO: renamed from: X.0szO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648080szO {
    public final InterfaceC497601wk LIZ;
    public final C05YD<q> LIZIZ;
    public final Function1<q, Unit> LIZJ;
    public final InterfaceC346201Wa<Effect> LIZLLL;
    public final C2252321DDq LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1648080szO(LifecycleCoroutineScope lifecycleCoroutineScope, InterfaceC332260D0u interfaceC332260D0u, C1648120szS c1648120szS, InterfaceC346201Wa interfaceC346201Wa, C1648090szP c1648090szP) {
        this.LIZ = lifecycleCoroutineScope;
        this.LIZIZ = interfaceC332260D0u;
        this.LIZJ = c1648120szS;
        this.LIZLLL = interfaceC346201Wa;
        this.LJ = C1BNE.LIZ(c1648090szP.invoke(interfaceC332260D0u.getValue()));
    }
}
