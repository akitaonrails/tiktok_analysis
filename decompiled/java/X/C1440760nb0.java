package X;

import Y.AComparatorS41S0000000_22;
import com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileconfig.strategies.CompileStrategyJsonStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440760nb0<R extends BaseCompileConfigParams> implements InterfaceC1440780nb2<R> {
    public final InterfaceC1440780nb2<R> LIZ;
    public final List<C1440770nb1<R>> LIZIZ = new ArrayList();

    @Override // X.InterfaceC1440780nb2
    public final R execute() {
        InterfaceC1440780nb2<R> interfaceC1440780nb2Invoke = this.LIZ;
        Iterator it2 = C13LP.LJLLLL(new AComparatorS41S0000000_22(15), this.LIZIZ).iterator();
        while (it2.hasNext()) {
            interfaceC1440780nb2Invoke = ((C1440770nb1) it2.next()).LIZIZ.invoke(interfaceC1440780nb2Invoke);
        }
        return (R) interfaceC1440780nb2Invoke.execute();
    }

    public C1440760nb0(InterfaceC1440780nb2 interfaceC1440780nb2) {
        this.LIZ = interfaceC1440780nb2;
    }

    public final void LIZ(CompileStrategyJsonStruct compileStrategyJsonStruct, Function1<? super InterfaceC1440780nb2<R>, ? extends InterfaceC1440780nb2<R>> function1) {
        ((ArrayList) this.LIZIZ).add(new C1440770nb1(compileStrategyJsonStruct, function1));
    }
}
