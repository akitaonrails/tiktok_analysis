package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0b4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959490b4l {
    public int LIZ;
    public final List<InterfaceC959480b4k> LIZIZ = new ArrayList();
    public Function0<Unit> LIZJ;
    public AwS416S0200000_15 LIZLLL;

    public final void LIZIZ() {
        if (this.LIZ > ((ArrayList) this.LIZIZ).size()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("index out of bound, index = ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" interceptorChain size = ");
            sbLIZ.append(((ArrayList) this.LIZIZ).size());
            sbLIZ.append(", interceptorChain = ");
            sbLIZ.append(this.LIZIZ);
            C20441214yg.LIZIZ("QuickCoHostInterceptorManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LIZ != ((ArrayList) this.LIZIZ).size()) {
            List<InterfaceC959480b4k> list = this.LIZIZ;
            int i = this.LIZ;
            this.LIZ = i + 1;
            ((InterfaceC959480b4k) ListProtector.get(list, i)).LIZ(this);
            return;
        }
        this.LIZ = 0;
        Function0<Unit> function0 = this.LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
        C20441214yg.LIZIZ("QuickCoHostInterceptorManager", "finish interceptor process, start quick cohost");
    }

    public final void LIZ(InterfaceC959480b4k interfaceC959480b4k) {
        if (!((ArrayList) this.LIZIZ).contains(interfaceC959480b4k)) {
            ((ArrayList) this.LIZIZ).add(interfaceC959480b4k);
        }
    }
}
