package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19OR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19OR {
    public final C19OF LIZ;
    public final ArrayList<C19OF> LIZIZ = new ArrayList<>();

    public C19OR(C19OF c19of) {
        this.LIZ = c19of;
    }

    public static long LIZ(C19OL c19ol, long j) {
        C19OF c19of = c19ol.LIZLLL;
        if (c19of instanceof C19OM) {
            return j;
        }
        int size = ((ArrayList) c19ol.LJIIJ).size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC21531119Ob interfaceC21531119Ob = (InterfaceC21531119Ob) ListProtector.get(c19ol.LJIIJ, i);
            if (interfaceC21531119Ob instanceof C19OL) {
                C19OL c19ol2 = (C19OL) interfaceC21531119Ob;
                if (c19ol2.LIZLLL != c19of) {
                    jMin = Math.min(jMin, LIZ(c19ol2, ((long) c19ol2.LJFF) + j));
                }
            }
        }
        if (c19ol == c19of.LJIIIIZZ) {
            long jLJIIIZ = j - c19of.LJIIIZ();
            return Math.min(Math.min(jMin, LIZ(c19of.LJII, jLJIIIZ)), jLJIIIZ - ((long) c19of.LJII.LJFF));
        }
        return jMin;
    }

    public static long LIZIZ(C19OL c19ol, long j) {
        C19OF c19of = c19ol.LIZLLL;
        if (c19of instanceof C19OM) {
            return j;
        }
        int size = ((ArrayList) c19ol.LJIIJ).size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC21531119Ob interfaceC21531119Ob = (InterfaceC21531119Ob) ListProtector.get(c19ol.LJIIJ, i);
            if (interfaceC21531119Ob instanceof C19OL) {
                C19OL c19ol2 = (C19OL) interfaceC21531119Ob;
                if (c19ol2.LIZLLL != c19of) {
                    jMax = Math.max(jMax, LIZIZ(c19ol2, ((long) c19ol2.LJFF) + j));
                }
            }
        }
        if (c19ol == c19of.LJII) {
            long jLJIIIZ = j + c19of.LJIIIZ();
            return Math.max(Math.max(jMax, LIZIZ(c19of.LJIIIIZZ, jLJIIIZ)), jLJIIIZ - ((long) c19of.LJIIIIZZ.LJFF));
        }
        return jMax;
    }
}
