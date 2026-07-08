package X;

import com.ss.android.ugc.aweme.longpress.LongPressComponent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380520m1q extends C1380510m1p {
    public final Set<Integer> LIZJ = new LinkedHashSet();

    @Override // X.C1380510m1p
    public final void LIZ(List<? extends InterfaceC1380530m1r> list) {
        super.LIZ(list);
        this.LIZJ.clear();
        int size = 0;
        this.LIZJ.add(0);
        for (InterfaceC1380530m1r interfaceC1380530m1r : (ArrayList) this.LIZ) {
            List<InterfaceC1380660m24> listLIZIZ = interfaceC1380530m1r.LIZIZ();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1380660m24 interfaceC1380660m24 : listLIZIZ) {
                if (interfaceC1380660m24 instanceof LongPressComponent) {
                    arrayList.add(interfaceC1380660m24);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (Intrinsics.LJFF(((LongPressComponent) obj).type, "action")) {
                    arrayList2.add(obj);
                }
            }
            interfaceC1380530m1r.LIZ(C13LP.LLIIII(arrayList2));
            size += interfaceC1380530m1r.LIZIZ().size();
            this.LIZJ.add(Integer.valueOf(size));
        }
    }
}
