package X;

import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451630nsX {
    public final C1664680tQA<C1408460mku> LIZ = new C1664680tQA<>(new C1408460mku(0));

    public final void LIZIZ(Function1<? super C1408460mku, C1408460mku> function1) {
        this.LIZ.LIZLLL(new AwS601S0100000_22(function1, (Function1<? super Map<Integer, String>, Unit>) 415), true);
    }

    public final void LIZ(List<? extends InterfaceC2217241BqE<C1408460mku, Boolean>> list, LifecycleOwner lifecycleOwner, InterfaceC1441305kZ<Boolean> interfaceC1441305kZ) {
        Iterator<? extends InterfaceC2217241BqE<C1408460mku, Boolean>> it2 = list.iterator();
        while (it2.hasNext()) {
            this.LIZ.LIZ(it2.next()).LIZ(lifecycleOwner, interfaceC1441305kZ);
        }
    }
}
