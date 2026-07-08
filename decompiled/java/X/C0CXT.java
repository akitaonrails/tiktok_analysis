package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CXT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXT extends C09AY implements Function0<ArrayList<String>> {
    public final /* synthetic */ C1585260rM4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CXT(C1585260rM4 c1585260rM4) {
        super(0);
        this.LL = c1585260rM4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<String> invoke() {
        this.LL.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<EnumC1584360rKc> it2 = C1584280rKU.LIZ.iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            if (key == null) {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(key);
        }
        return arrayList;
    }
}
