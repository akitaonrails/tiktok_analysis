package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z4S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881860z4S extends C09AY implements Function0<List<? extends String>> {
    public final /* synthetic */ C1883550z7B LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881860z4S(C1883550z7B c1883550z7B) {
        super(0);
        this.LL = c1883550z7B;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        List<C1883100z6S> list = this.LL.LLJJJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            String str = ((C1883100z6S) it2.next()).LLILLL.tabName;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        return arrayList;
    }
}
