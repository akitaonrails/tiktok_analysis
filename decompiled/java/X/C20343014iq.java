package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.14iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20343014iq {
    public static final ConcurrentHashMap<String, Integer> LJIIJJI = new ConcurrentHashMap<>();
    public final View LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final List<C20343014iq> LJI;
    public final int LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;

    public C20343014iq() {
        throw null;
    }

    public final String toString() {
        return (String) this.LJIIJ.getValue();
    }

    public C20343014iq(C20342714in c20342714in, View view, int i, int i2, int i3, int i4) {
        Integer numPutIfAbsent;
        float alpha = view.getAlpha();
        ArrayList arrayList = new ArrayList();
        this.LIZ = view;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = alpha;
        this.LJI = arrayList;
        ConcurrentHashMap<String, Integer> concurrentHashMap = LJIIJJI;
        String name = view.getClass().getName();
        Integer numValueOf = concurrentHashMap.get(name);
        if (numValueOf == null && (numPutIfAbsent = concurrentHashMap.putIfAbsent(name, (numValueOf = Integer.valueOf(concurrentHashMap.size())))) != null) {
            numValueOf = numPutIfAbsent;
        }
        this.LJII = numValueOf.intValue();
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1342));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1340));
        this.LJIIJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1341));
    }
}
