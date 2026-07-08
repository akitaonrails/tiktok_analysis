package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1281904zx implements InterfaceC1281804zw {
    public final C0LAB LIZ;

    public C1281904zx(C0LAB c0lab) {
        this.LIZ = c0lab;
    }

    @Override // X.InterfaceC1281804zw
    public final void LIZ(List<? extends InterfaceC1282004zy> list) {
        C0LAB c0lab = this.LIZ;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            for (Map.Entry<String, Object> entry : ((InterfaceC1282004zy) it2.next()).keyParams().entrySet()) {
                c0lab.LJ(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
    }
}
