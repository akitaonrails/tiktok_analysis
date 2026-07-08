package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ykA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869280ykA {
    public static float LIZ(List list, int i, InterfaceC1874070yrt interfaceC1874070yrt) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(r2.getVisibility(i) * ((EnumC1874050yrr) it2.next()).getHeight(interfaceC1874070yrt)));
        }
        return C13LP.LJZ(arrayList);
    }
}
