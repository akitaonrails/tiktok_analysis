package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Y6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868740Y6e implements InterfaceC871620YHg {
    public InterfaceC868750Y6f LIZJ;
    public final C0YEM LJ;
    public final Map<String, Long> LIZ = new ConcurrentHashMap();
    public final Map<String, C06SQ> LIZIZ = new ConcurrentHashMap();
    public final Set<InterfaceC868770Y6h> LIZLLL = new CopyOnWriteArraySet();

    @Override // X.InterfaceC871620YHg
    public final int LIZ() {
        int iLongValue = 0;
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
            if (((Long) entry.getValue()).longValue() > 0) {
                iLongValue = (int) (((long) iLongValue) + ((Long) entry.getValue()).longValue());
            }
        }
        return iLongValue;
    }

    @Override // X.InterfaceC871620YHg
    public final Map<String, C06SQ> LIZIZ() {
        return new HashMap(this.LIZIZ);
    }

    @Override // X.InterfaceC871620YHg
    public final Map<String, Long> LIZJ() {
        return new HashMap(this.LIZ);
    }

    public final void LJ() {
        if (((CopyOnWriteArraySet) this.LIZLLL).isEmpty()) {
            this.LJ.LIZLLL().LJIIJJI("UnReadCountHelper should add unread observer");
            return;
        }
        this.LJ.LIZLLL().LJIIJJI("UnReadCountHelper notify unread map update");
        Iterator it2 = ((CopyOnWriteArraySet) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC868770Y6h) it2.next()).LIZ();
        }
    }

    public C868740Y6e(C0YEM c0yem) {
        this.LJ = c0yem;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<X.C0Y8T> r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C868740Y6e.LIZLLL(java.util.List, boolean, boolean):void");
    }
}
