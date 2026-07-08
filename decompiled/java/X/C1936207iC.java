package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07iC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1936207iC<T> implements InterfaceC1936307iD<List<? extends T>> {
    public final InterfaceC1936307iD<T> LIZ;

    public C1936207iC(InterfaceC1936307iD interfaceC1936307iD) {
        this.LIZ = interfaceC1936307iD;
    }

    @Override // X.InterfaceC1936307iD
    public final Object parse(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJLIL(str, '\"'), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            T t = this.LIZ.parse(a0.LJLIIIL((String) it2.next()).toString());
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
