package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y7B, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y7B implements C0Y7H {
    public final C0Y9J LIZ;

    public C0Y7B(C0YEM c0yem) {
        this.LIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
    }

    @Override // X.C0Y7H
    public final C869590Y9l LIZJ(long j) {
        return this.LIZ.LJI().LJJJ(j);
    }

    @Override // X.C0Y7H
    public final boolean LJ(C869590Y9l c869590Y9l) {
        return this.LIZ.LJI().LJJJLZIJ(c869590Y9l);
    }

    @Override // X.C0Y7H
    public final C869590Y9l LJJIIZI(String str) {
        return this.LIZ.LJI().LJJJI(str);
    }

    @Override // X.C0Y7H
    public final C869590Y9l LIZIZ(long j, String str) {
        return this.LIZ.LJI().LJJJJ(j, str);
    }

    @Override // X.C0Y7H
    public final void LIZ(String str, String str2, Map<String, String> map) {
        this.LIZ.LIZJ().LIZ(str, str2, map);
    }

    @Override // X.C0Y7H
    public final C043700Dr LJFF(String str, List list, Map map) {
        HashMap map2 = (HashMap) map;
        HashMap map3 = new HashMap(map2.size());
        HashMap map4 = new HashMap(map2.size());
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            C07ZY c07zy = (C07ZY) entry.getValue();
            if (!c07zy.LIZ.isEmpty()) {
                map3.put(key, c07zy.LIZ);
            }
            if (!c07zy.LIZIZ.isEmpty()) {
                map4.put(key, c07zy.LIZIZ);
            }
        }
        return this.LIZ.LJI().LJ(str, list, map3, map4);
    }

    @Override // X.C0Y7H
    public final boolean LIZLLL(C869590Y9l c869590Y9l, C07ZY c07zy, boolean z, boolean z2) {
        return this.LIZ.LJI().LIZ(c869590Y9l, c07zy.LIZ, c07zy.LIZIZ, z, z2);
    }
}
