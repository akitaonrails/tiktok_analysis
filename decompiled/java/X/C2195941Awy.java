package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.1Awy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195941Awy {
    public final EnumC2197771Azv LIZ;
    public final C2195931Awx LIZIZ;
    public final HashMap<String, Object> LIZJ;
    public final C1232850iBf LIZLLL;

    public C2195941Awy(EnumC2197771Azv enumC2197771Azv, C2195931Awx c2195931Awx, C1232850iBf c1232850iBf, int i) {
        HashMap<String, Object> map;
        C2195931Awx c2195931Awx2 = (i & 2) != 0 ? new C2195931Awx(0, null, null, null, 15) : c2195931Awx;
        if ((i & 4) != 0) {
            map = new HashMap<>();
        } else {
            map = null;
        }
        c1232850iBf = (i & 8) != 0 ? null : c1232850iBf;
        this.LIZ = enumC2197771Azv;
        this.LIZIZ = c2195931Awx2;
        this.LIZJ = map;
        this.LIZLLL = c1232850iBf;
    }
}
