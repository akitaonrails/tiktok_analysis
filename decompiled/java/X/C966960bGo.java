package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966960bGo extends C09AY implements Function0<List<? extends C967180bHA>> {
    public final /* synthetic */ C967130bH5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966960bGo(C967130bH5 c967130bH5) {
        super(0);
        this.LL = c967130bH5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C967180bHA> invoke() {
        List<C967180bHA> listLJJLIIIIJ;
        InterfaceC966930bGl interfaceC966930bGl = this.LL.LIZLLL;
        if (interfaceC966930bGl == null || (listLJJLIIIIJ = interfaceC966930bGl.LJJLIIIIJ()) == null) {
            listLJJLIIIIJ = C13BV.INSTANCE;
        }
        String str = this.LL.LIZJ;
        StringBuilder sb = new StringBuilder("linker linkedList result = ");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIIJ, 10));
        Iterator<C967180bHA> it2 = listLJJLIIIIJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL);
        }
        sb.append(arrayList);
        C20441214yg.LIZIZ(str, sb.toString());
        return listLJJLIIIIJ;
    }
}
