package X;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D43, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D43 {
    public final C331730CzT LIZ;
    public final InterfaceC497601wk LIZIZ;
    public int LJII;
    public AnonymousClass0956 LJIIIIZZ;
    public boolean LJIIIZ;
    public C09AY LJIIJJI;
    public final ConcurrentHashMap<String, C0D47> LIZJ = new ConcurrentHashMap<>();
    public final ArrayDeque<String> LIZLLL = new ArrayDeque<>();
    public final HashSet<String> LJ = new HashSet<>();
    public String LJFF = "";
    public String LJI = "";
    public int LJIIJ = 5;

    public final void LIZ() {
        this.LJIIIZ = false;
        AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIIIIZZ = null;
        Iterator<Map.Entry<String, C0D47>> it2 = this.LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            C0D47 value = it2.next().getValue();
            C09AE c09ae = value.LJI;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            value.LJI = null;
        }
        this.LIZLLL.clear();
        this.LJ.clear();
        this.LIZJ.clear();
    }

    public final int LJFF() {
        Collection<C0D47> collectionValues = this.LIZJ.values();
        int i = 0;
        if (!collectionValues.isEmpty()) {
            i = 0;
            for (C0D47 c0d47 : collectionValues) {
                if (c0d47.LIZJ == C0D4A.UCP_IN_FLIGHT || c0d47.LIZJ == C0D4A.UCP_FAILED) {
                    i++;
                    if (i < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
        }
        return i;
    }

    public final boolean LJII() {
        int i = this.LJII;
        return i == 1 || C0D1H.LIZ(Integer.valueOf(i));
    }

    public final void LJIIIIZZ() {
        if (this.LJIIIZ || LJII()) {
            return;
        }
        this.LJIIIZ = true;
        int i = C0D48.LIZIZ().maxConcurrentSkuRequests;
        if (i <= 0) {
            i = C0D48.LIZ.maxConcurrentSkuRequests;
        }
        this.LJIIJ = i;
        LJ();
        AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIIIIZZ = C23250099c.LIZLLL(this.LIZIZ, C0PEM.LIZJ, null, new C0D44(this, null), 2);
    }

    public final void LJ() {
        while (LJFF() < this.LJIIJ && (!this.LIZLLL.isEmpty())) {
            String strRemoveFirst = this.LIZLLL.removeFirst();
            this.LJ.remove(strRemoveFirst);
            C0D47 c0d47 = this.LIZJ.get(strRemoveFirst);
            if (c0d47 != null && c0d47.LIZJ == C0D4A.IDLE) {
                LIZLLL(c0d47);
            }
        }
    }

    public final void LIZLLL(C0D47 c0d47) {
        if (LJII()) {
            return;
        }
        C09AE c09ae = c0d47.LJI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        LJIIIZ(c0d47, C0D4A.UCP_IN_FLIGHT);
        c0d47.LJI = C23250099c.LIZLLL(this.LIZIZ, C0PEM.LIZJ, null, new C0D41(c0d47, this, null), 2);
    }

    public final void LJI(C0D47 c0d47) {
        if (c0d47.LIZLLL >= 3) {
            LJIIIZ(c0d47, C0D4A.GIVEN_UP);
            if (this.LJIIIZ) {
                LJ();
                return;
            }
            return;
        }
        c0d47.LIZLLL++;
        long j = ((long) c0d47.LIZLLL) * 1000;
        C09AE c09ae = c0d47.LJI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        c0d47.LJI = C23250099c.LIZLLL(this.LIZIZ, C0PEM.LIZJ, null, new C0D45(j, this, c0d47, null), 2);
    }

    public C0D43(C331730CzT c331730CzT, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = c331730CzT;
        this.LIZIZ = interfaceC497601wk;
    }

    public static void LJIIIZ(C0D47 c0d47, C0D4A c0d4a) {
        c0d47.LIZJ = c0d4a;
        c0d47.LJFF = System.currentTimeMillis();
    }

    public final void LIZIZ(String str, List<String> list) {
        C0D47 c0d47PutIfAbsent;
        if (list.isEmpty() || LJII() || !C0D48.LIZJ(list.size())) {
            return;
        }
        for (String str2 : list) {
            ConcurrentHashMap<String, C0D47> concurrentHashMap = this.LIZJ;
            C0D47 c0d47 = concurrentHashMap.get(str2);
            if (c0d47 == null && (c0d47PutIfAbsent = concurrentHashMap.putIfAbsent(str2, (c0d47 = new C0D47(str2, str)))) != null) {
                c0d47 = c0d47PutIfAbsent;
            }
            if (c0d47.LIZJ == C0D4A.IDLE && this.LJ.add(str2)) {
                this.LIZLLL.addLast(str2);
            }
        }
        if (this.LJIIIZ) {
            LJ();
        }
    }

    public final void LIZJ(int i, String str, String str2, List list) {
        Object next;
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.LJ.clear();
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = i;
        if (LJII()) {
            return;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C332830D2z c332830D2z = (C332830D2z) next;
                if (u.LJIJI(c332830D2z.type, "color", true) || u.LJIJI(c332830D2z.type, "colour", true)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C332830D2z c332830D2z2 = (C332830D2z) next;
        if (c332830D2z2 != null && C0D48.LIZJ(c332830D2z2.options.size())) {
            String str3 = c332830D2z2.type;
            Iterator<C332800D2w> it3 = c332830D2z2.options.iterator();
            while (it3.hasNext()) {
                String str4 = it3.next().value;
                this.LIZJ.put(str4, new C0D47(str4, str3));
            }
        }
    }
}
