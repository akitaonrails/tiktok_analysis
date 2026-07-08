package X;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1DoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2267051DoN {
    public static final Integer LJ = 0;
    public final HashMap<Object, InterfaceC2267321Doo> LIZ;
    public final HashMap<Object, C2267351Dor> LIZIZ;
    public final HashMap<String, ArrayList<String>> LIZJ;
    public final C2267061DoO LIZLLL;

    public int LIZIZ(Object obj) {
        throw null;
    }

    public C2267051DoN() {
        HashMap<Object, InterfaceC2267321Doo> map = new HashMap<>();
        this.LIZ = map;
        this.LIZIZ = new HashMap<>();
        this.LIZJ = new HashMap<>();
        C2267061DoO c2267061DoO = new C2267061DoO(this);
        this.LIZLLL = c2267061DoO;
        map.put(LJ, c2267061DoO);
    }

    public final C2267061DoO LIZ(Object obj) {
        InterfaceC2267321Doo interfaceC2267321Doo = this.LIZ.get(obj);
        Object obj2 = interfaceC2267321Doo;
        if (interfaceC2267321Doo == null) {
            C2267061DoO c2267061DoO = new C2267061DoO(this);
            this.LIZ.put(obj, c2267061DoO);
            c2267061DoO.LIZ = obj;
            obj2 = c2267061DoO;
        }
        if (obj2 instanceof C2267061DoO) {
            return (C2267061DoO) obj2;
        }
        return null;
    }
}
