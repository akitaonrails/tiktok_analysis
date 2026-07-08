package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bIC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967820bIC extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C967880bII LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967820bIC(C966020bFI c966020bFI, C967880bII c967880bII) {
        super(1);
        this.LL = c966020bFI;
        this.LLILLJJLI = c967880bII;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        InterfaceC965990bFF interfaceC965990bFF2 = this.LL.LJIIZILJ;
        if (interfaceC965990bFF2 != null) {
            C967880bII c967880bII = this.LLILLJJLI;
            String str = c967880bII.LIZ;
            List<C1283230jUv> list = c967880bII.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1283230jUv> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C1282000jSw.LJI(it2.next()));
            }
            interfaceC965990bFF2.LL(str, arrayList);
        }
        return Unit.LIZ;
    }
}
