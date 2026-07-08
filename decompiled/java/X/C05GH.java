package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05GH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05GH implements C05GL {
    public static boolean LIZ;
    public static final ConcurrentHashMap<String, C05GJ> LIZIZ;
    public static final AtomicBoolean LIZJ;
    public static final C054G LIZLLL;

    static {
        C05GH c05gh = new C05GH();
        LIZIZ = new ConcurrentHashMap<>();
        LIZJ = new AtomicBoolean(false);
        LIZLLL = C2296808zG.LIZ(C0PEM.LIZ);
        C06AB c06ab = new C06AB();
        C06TA c06ta = new C06TA();
        c05gh.LIZ(c06ab);
        c05gh.LIZ(c06ta);
        C05GD c05gd = new C05GD(c06ta, null);
        ConcurrentHashMap<String, Function2<Object, InterfaceC1364105Vn<? super List<? extends InterfaceC1329505If>>, Object>> concurrentHashMap = C1179404jQ.LIZ;
        concurrentHashMap.put("image", c05gd);
        concurrentHashMap.put("video", new C05GE(c06ab, null));
        C05GQ c05gq = new C05GQ();
        c05gh.LIZ(c05gq);
        concurrentHashMap.put("voice", new C05GF(c05gq, null));
        C05KX c05kx = new C05KX();
        c05gh.LIZ(c05kx);
        concurrentHashMap.put("live", new C05GG(c05kx, null));
    }

    public final void LIZ(C05GJ c05gj) {
        if (!LIZ) {
            LIZ = true;
            C05GN.LIZIZ.add(this);
        }
        LIZIZ.put(c05gj.getId(), c05gj);
    }

    @Override // X.C05GL, X.C05GM
    public void onEvent(C05GK c05gk) {
        if (LIZJ.get()) {
            return;
        }
        for (C05GJ c05gj : LIZIZ.values()) {
            if (c05gj.LIZJ().contains(c05gk.getEventType())) {
                C23250099c.LIZLLL(LIZLLL, null, null, new C05GI(c05gj, c05gk, null), 3);
            }
        }
    }
}
