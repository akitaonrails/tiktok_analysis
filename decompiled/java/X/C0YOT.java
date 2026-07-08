package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS7S0410000_9;

/* JADX INFO: renamed from: X.0YOT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YOT implements C0YOZ {
    public final C0YEF LIZ;
    public final C0YPY LIZIZ = new C0YPY(-1041, "No active session", null, null);
    public final C867170Y0d<InterfaceC1740206rg, Object> LIZJ = new C867170Y0d<>(new AwS558S0100000_14(this, 1359));
    public final C867220Y0i LIZLLL = new C867220Y0i(this);

    @Override // X.C0YOZ
    public final InterfaceC603530Nln LIZIZ() {
        C0Y3J c0y3j;
        C873390YOb c873390YObLJII = LJII("localExtensions");
        return (c873390YObLJII == null || (c0y3j = c873390YObLJII.LIZIZ) == null) ? new InterfaceC603530Nln() { // from class: X.0Y3K
            @Override // X.InterfaceC603530Nln
            public final void LIZLLL(C869590Y9l c869590Y9l, String str, C0Y3R c0y3r, C0Y3I c0y3i, boolean z) {
            }

            @Override // X.InterfaceC603530Nln
            public final boolean LJ() {
                return false;
            }

            @Override // X.InterfaceC603530Nln
            public final void LJFF(List list, boolean z, C0Y3I c0y3i) {
            }

            public static C0YMW LJIIIIZZ() {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.code = -1041;
                c0ymw.statusMsg = "No active session";
                return c0ymw;
            }

            @Override // X.InterfaceC603530Nln
            public final void LIZJ(C869590Y9l c869590Y9l, C0Y3I c0y3i, boolean z, InterfaceC863600XuI interfaceC863600XuI) {
                if (interfaceC863600XuI != null) {
                    interfaceC863600XuI.LIZIZ(LJIIIIZZ());
                }
            }

            @Override // X.InterfaceC603530Nln
            @InterfaceC1294060jmO
            public final Object LIZ(C869590Y9l c869590Y9l, Map<String, ? extends C0Y3O> map, C0Y3I c0y3i, boolean z, InterfaceC1364105Vn<? super C0Y6Q<C869590Y9l>> interfaceC1364105Vn) {
                return C867000Xzm.LIZ(interfaceC1364105Vn, new AwS7S0410000_9((InterfaceC603530Nln) this, (InterfaceC603530Nln) c869590Y9l, (C869590Y9l) map, (Map<String, ? extends C0Y3O>) c0y3i, (C0Y3I) z, false));
            }

            @Override // X.InterfaceC603530Nln
            public final void LIZIZ(C869590Y9l c869590Y9l, Map<String, ? extends C0Y3O> map, C0Y3I c0y3i, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
                if (interfaceC863600XuI != null) {
                    interfaceC863600XuI.LIZIZ(LJIIIIZZ());
                }
            }

            @Override // X.InterfaceC603530Nln
            @InterfaceC1294060jmO
            public final Object LJI(C869590Y9l c869590Y9l, Set<String> set, C0Y3I c0y3i, boolean z, InterfaceC1364105Vn<? super C0Y6Q<C869590Y9l>> interfaceC1364105Vn) {
                return C867000Xzm.LIZ(interfaceC1364105Vn, new AwS7S0410000_9((InterfaceC603530Nln) this, (InterfaceC603530Nln) c869590Y9l, (C869590Y9l) set, (Set<String>) c0y3i, (C0Y3I) z, true));
            }

            @Override // X.InterfaceC603530Nln
            public final void LJII(C869590Y9l c869590Y9l, Set<String> set, C0Y3I c0y3i, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
                if (interfaceC863600XuI != null) {
                    interfaceC863600XuI.LIZIZ(LJIIIIZZ());
                }
            }
        } : c0y3j;
    }

    @Override // X.C0YOZ
    public final InterfaceC1441505kb LIZLLL() {
        C0YOW c0yow;
        C873390YOb c873390YObLJII = LJII("kv");
        return (c873390YObLJII == null || (c0yow = c873390YObLJII.LIZJ) == null) ? new InterfaceC1441505kb() { // from class: X.0YOR
            @Override // X.InterfaceC1441505kb
            public final Object LIZIZ(String str, String str2, InterfaceC1364105Vn<? super C0Y6Q<String>> interfaceC1364105Vn) {
                return C865670Xxd.LIZ(-1041, "No active session");
            }

            @Override // X.InterfaceC1441505kb
            public final Object LIZ(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C0Y6Q<Boolean>> interfaceC1364105Vn) {
                return C865670Xxd.LIZ(-1041, "No active session");
            }
        } : c0yow;
    }

    public C0YOT(C0YEF c0yef) {
        this.LIZ = c0yef;
    }

    public final C873390YOb LJII(String str) {
        C0YEF c0yef = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionAwareMessageManager.");
        sbLIZ.append(str);
        C0YED c0yedLIZIZ = c0yef.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIIJ;
        }
        return null;
    }

    public final <T> C0Y6Q<T> LJIIIIZZ(C0YOY c0yoy, String str) {
        c0yoy.onEvent(new C0YQ0(null, null, this.LIZIZ, str));
        return C865670Xxd.LIZIZ(this.LIZIZ);
    }

    @Override // X.C0YOZ
    public final C0Y6Q<C00FC> LIZ(C873450YOh c873450YOh, C0IC5 c0ic5, C0YOY c0yoy) {
        C873390YOb c873390YObLJII = LJII("retrySendMediaMessage");
        if (c873390YObLJII == null) {
            return LJIIIIZZ(c0yoy, c873450YOh.LIZ);
        }
        return c873390YObLJII.LIZ(c873450YOh, c0ic5, c0yoy);
    }

    @Override // X.C0YOZ
    public final C0Y6Q<List<C00FC>> LIZJ(List<C0YP2> list, C0IC5 c0ic5, C0YOY c0yoy) {
        C873390YOb c873390YObLJII = LJII("sendMessages");
        if (c873390YObLJII == null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C0YP2> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
                arrayList.add(new C0YQ0(null, null, this.LIZIZ, null));
            }
            c0yoy.onEvent(new C0YPX(C13BV.INSTANCE, arrayList));
            return C865670Xxd.LIZIZ(this.LIZIZ);
        }
        return c873390YObLJII.LIZJ(list, c0ic5, c0yoy);
    }

    @Override // X.C0YOZ
    public final C0Y6Q<C00FC> LJ(C873410YOd c873410YOd, C0IC5 c0ic5, C0YOY c0yoy) {
        C873390YOb c873390YObLJII = LJII("sendMediaMessage");
        if (c873390YObLJII == null) {
            return LJIIIIZZ(c0yoy, null);
        }
        return c873390YObLJII.LJ(c873410YOd, c0ic5, c0yoy);
    }

    @Override // X.C0YOZ
    public final Object LJFF(C0YP2 c0yp2, C0IC5 c0ic5, InterfaceC1364105Vn<? super C0Y6Q<C0YPS>> interfaceC1364105Vn) {
        C873390YOb c873390YObLJII = LJII("sendMessage(suspend)");
        if (c873390YObLJII == null) {
            return C865670Xxd.LIZIZ(this.LIZIZ);
        }
        return c873390YObLJII.LJFF(c0yp2, c0ic5, interfaceC1364105Vn);
    }

    @Override // X.C0YOZ
    public final C0Y6Q<C00FC> LJI(C0YP2 c0yp2, C0IC5 c0ic5, C0YOY c0yoy) {
        C873390YOb c873390YObLJII = LJII("sendMessage");
        if (c873390YObLJII == null) {
            return LJIIIIZZ(c0yoy, null);
        }
        return c873390YObLJII.LJI(c0yp2, c0ic5, c0yoy);
    }
}
