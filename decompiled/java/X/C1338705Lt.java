package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1338705Lt implements C05M0 {
    public static final Gson LJ = C7740030o.LIZ().getGson();
    public static final Type LJFF = new TypeToken<List<? extends String>>() { // from class: X.05Lw
    }.getType();
    public final AtomicReference<Pair<String, Keva>> LIZ = new AtomicReference<>(null);
    public final AtomicReference<Pair<String, ConcurrentHashMap<String, C05M1>>> LIZIZ = new AtomicReference<>(null);
    public final AtomicReference<String> LIZJ = new AtomicReference<>(null);
    public final ConcurrentHashMap<String, Object> LIZLLL = new ConcurrentHashMap<>();

    public static String LJIIIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        return (curUserId == null || curUserId.length() <= 0) ? "guest" : curUserId;
    }

    public final ConcurrentHashMap<String, C05M1> LJIIJ() {
        String strLJIIIZ = LJIIIZ();
        Pair<String, ConcurrentHashMap<String, C05M1>> pair = this.LIZIZ.get();
        if (pair != null) {
            String first = pair.getFirst();
            ConcurrentHashMap<String, C05M1> second = pair.getSecond();
            if (Intrinsics.LJFF(first, strLJIIIZ)) {
                return second;
            }
        }
        synchronized (this.LIZIZ) {
            try {
                Pair<String, ConcurrentHashMap<String, C05M1>> pair2 = this.LIZIZ.get();
                if (pair2 != null) {
                    String first2 = pair2.getFirst();
                    ConcurrentHashMap<String, C05M1> second2 = pair2.getSecond();
                    if (Intrinsics.LJFF(first2, strLJIIIZ)) {
                        return second2;
                    }
                }
                ConcurrentHashMap<String, C05M1> concurrentHashMap = new ConcurrentHashMap<>();
                this.LIZIZ.set(new Pair<>(strLJIIIZ, concurrentHashMap));
                return concurrentHashMap;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final Keva LJIILIIL() {
        String strLJIIIZ = LJIIIZ();
        Pair<String, Keva> pair = this.LIZ.get();
        if (pair != null) {
            String first = pair.getFirst();
            Keva second = pair.getSecond();
            if (Intrinsics.LJFF(first, strLJIIIZ)) {
                return second;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("offline_comment_");
        sbLIZ.append(strLJIIIZ);
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.set(new Pair<>(strLJIIIZ, repo));
        return repo;
    }

    public static List LJIIJJI(Keva keva) {
        Object c098200Yq;
        Object obj = null;
        String string = keva.getString("aid_index", null);
        if (string == null) {
            return C13BV.INSTANCE;
        }
        try {
            c098200Yq = (List) LJ.LJIIIIZZ(string, LJFF);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        List list = (List) obj;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static String LJIILJJIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("snap_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C05M0
    public final Object LIZ(C05M4 c05m4) {
        return C23250099c.LJI(c05m4, C0PEM.LIZJ, new C1338905Lv(this, null));
    }

    @Override // X.C05M0
    public final Object LIZJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1339305Lz(this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.C05M0
    public final Object LJ(C1396060mQu c1396060mQu) {
        return C23250099c.LJI(c1396060mQu, C0PEM.LIZJ, new C05KR(this, null));
    }

    public static C05M1 LJIIL(Keva keva, String str) {
        Object c098200Yq;
        String string = keva.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            c098200Yq = (C05M1) LJ.LJII(string, C05M1.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C05M1 c05m1 = (C05M1) c098200Yq;
        if (c05m1 == null || c05m1.LIZ == null || c05m1.LIZIZ == null || c05m1.LIZJ == null) {
            return null;
        }
        return c05m1;
    }

    @Override // X.C05M0
    public final Object LIZLLL(List list, AbstractC23140094w abstractC23140094w) throws Throwable {
        Object objLJI = C23250099c.LJI(abstractC23140094w, C0PEM.LIZJ, new C1338405Lq(list, this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.C05M0
    public final Object LJFF(String str, C05M4 c05m4) throws Throwable {
        Object objLJI = C23250099c.LJI(c05m4, C0PEM.LIZJ, new C1338305Lp(this, str, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.C05M0
    public final Object LJI(C05M1 c05m1, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1338805Lu(this, c05m1, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.C05M0
    public final Object LJII(String str, C1396090mQx c1396090mQx) {
        return C23250099c.LJI(c1396090mQx, C0PEM.LIZJ, new C1339205Ly(this, str, null));
    }

    @Override // X.C05M0
    public final Object LJIIIIZZ(String str, InterfaceC1364105Vn<? super C05M6> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1338605Ls(this, str, null));
    }

    @Override // X.C05M0
    public final Object LIZIZ(String str, C05M6 c05m6, AbstractC23140094w abstractC23140094w) throws Throwable {
        Object objLJI = C23250099c.LJI(abstractC23140094w, C0PEM.LIZJ, new C1338505Lr(this, str, c05m6, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
