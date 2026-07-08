package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584680rL8 extends C09AY implements Function0<List<String>> {
    public final /* synthetic */ C1585240rM2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584680rL8(C1585240rM2 c1585240rM2) {
        super(0);
        this.LL = c1585240rM2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<String> invoke() {
        this.LL.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<EnumC1584360rKc> it2 = C1584300rKW.LIZ.iterator();
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
