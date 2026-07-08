package X;

import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.14io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20342814io {
    public static final C20343014iq LIZ(C20342714in c20342714in, View view) {
        return new C20343014iq(c20342714in, view, view.getId(), view.getVisibility(), view.getWidth(), view.getHeight());
    }

    public static final String LIZIZ(C20343014iq c20343014iq, C1865460ye0 c1865460ye0) {
        String strLJJLIIIJ;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(c20343014iq);
        while (!arrayDeque.isEmpty()) {
            C20343014iq c20343014iq2 = (C20343014iq) arrayDeque.removeFirst();
            arrayList.add(c20343014iq2.toString());
            arrayDeque.addAll(c20343014iq2.LJI);
        }
        if (c1865460ye0 == null) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(c1865460ye0.LIZ.entrySet(), e3.c, null, null, 0, null, AnonymousClass0207.get$arr$(64), 30);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LP.LJJLIIIJ(arrayList, e3.c, null, null, 0, null, null, 62));
        sbLIZ.append("\n\n##TYPE_MAP##\n");
        sbLIZ.append(strLJJLIIIJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
