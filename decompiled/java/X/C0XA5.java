package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XA5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XA5 extends C09AY implements Function0<ArrayList<C080U>> {
    public C0XA5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<C080U> invoke() {
        ArrayList<C080U> arrayList = new ArrayList<>();
        arrayList.add(new C080U("launch-time", String.valueOf(C1150504el.LIZ().LJJII)));
        String strLJI = C847400XMc.LJI();
        if (strLJI != null) {
            arrayList.add(new C080U("X-Tt-Token", strLJI));
            arrayList.add(new C080U("sdk-version", "2"));
        }
        return arrayList;
    }
}
