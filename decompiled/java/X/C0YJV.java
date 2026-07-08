package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0YJV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJV implements InterfaceC881630YiH {
    public final C0YH7 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C872110YJd(this));
    public final C01GW LIZJ = C452501pT.LIZIZ(new C872100YJc(this));

    public final C0YJW LJIIIIZZ() {
        return (C0YJW) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC881630YiH
    public final void clear() {
        ((ConcurrentHashMap) LJIIIIZZ().LIZIZ.getValue()).clear();
        C01SA.LIZ.clear();
        C23118094a.LJ(C315110CWv.LIZ().getCoroutineContext());
    }

    public C0YJV(C0YH7 c0yh7) {
        this.LIZ = c0yh7;
    }

    @Override // X.InterfaceC881630YiH
    public final C872090YJb LIZ(String str) {
        return LJIIIIZZ().LIZ(str);
    }

    @Override // X.InterfaceC881630YiH
    public final void LJFF(Function0<Unit> function0) {
        ((ArrayList) LJIIIIZZ().LIZLLL).remove(function0);
    }

    @Override // X.InterfaceC881630YiH
    public final void LJI(Object obj) {
        ConcurrentHashMap<Object, C09AE> concurrentHashMap = C01SA.LIZ;
        C09AE c09ae = concurrentHashMap.get(obj);
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        concurrentHashMap.remove(obj);
    }

    @Override // X.InterfaceC881630YiH
    public final void LJII(Function0<Unit> function0) {
        ((ArrayList) LJIIIIZZ().LIZLLL).add(function0);
    }

    @Override // X.InterfaceC881630YiH
    public final Long LIZLLL(long j, String str) {
        Long l;
        Map map = (Map) ((ConcurrentHashMap) LJIIIIZZ().LIZJ.getValue()).get(str);
        if (map == null || (l = (Long) map.get(Long.valueOf(j))) == null) {
            C872090YJb c872090YJbLIZ = LJIIIIZZ().LIZ(str);
            if (c872090YJbLIZ == null || !c872090YJbLIZ.LIZJ.contains(Long.valueOf(j))) {
                return null;
            }
            return Long.valueOf(c872090YJbLIZ.LIZIZ);
        }
        return l;
    }

    @Override // X.InterfaceC881630YiH
    public final void LJ(C878990Ye1 c878990Ye1, Object obj) {
        LJI(obj);
        C01SA.LIZ.put(obj, C23250099c.LIZLLL(C315110CWv.LIZ(), C0PEM.LIZJ, null, new C01S8(c878990Ye1, null), 2));
    }

    @Override // X.InterfaceC881630YiH
    public final void LIZIZ(Object obj, String str, AwS593S0100000_14 awS593S0100000_14) {
        LJI(obj);
        C01SA.LIZ.put(obj, C23250099c.LIZLLL(C315110CWv.LIZ(), C0PEM.LIZJ, null, new C01S6(str, awS593S0100000_14, null), 2));
    }

    @Override // X.InterfaceC881630YiH
    public final void LIZJ(String str, boolean z, List list) {
        if (!this.LIZ.isLogin()) {
            return;
        }
        C0YJJ c0yjj = (C0YJJ) ((C0YJY) this.LIZJ.getValue()).LIZJ.getValue();
        c0yjj.getClass();
        if (z) {
            c0yjj.LIZ(new Pair<>(list, str));
        } else {
            C23250099c.LIZLLL(C315110CWv.LIZ(), null, null, new C0YJQ(c0yjj, list, str, false, null), 3);
        }
    }

    @Override // X.InterfaceC881630YiH
    public final void fetch(String str, String str2, boolean z) {
        if (!this.LIZ.isLogin()) {
            return;
        }
        C0YJJ c0yjj = (C0YJJ) ((C0YJY) this.LIZJ.getValue()).LIZJ.getValue();
        c0yjj.getClass();
        if (z) {
            c0yjj.LIZIZ(new Pair<>(str, str2));
        } else {
            C23250099c.LIZLLL(C315110CWv.LIZ(), null, null, new C0YJP(c0yjj, str, str2, false, null), 3);
        }
    }
}
