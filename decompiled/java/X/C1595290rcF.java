package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0rcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595290rcF {
    public static final List<String> LIZ(List<? extends InterfaceC1891350zJl> list) {
        String uid;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (interfaceC1891350zJl instanceof InterfaceC1595240rcA) {
                InterfaceC1595240rcA interfaceC1595240rcA = (InterfaceC1595240rcA) interfaceC1891350zJl;
                if (interfaceC1595240rcA.isSingleUser() && (uid = interfaceC1595240rcA.getUid()) != null) {
                    arrayList.add(uid);
                }
            }
        }
        return arrayList;
    }
}
