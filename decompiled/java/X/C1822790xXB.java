package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0xXB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822790xXB {
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public long LJFF;
    public C11JF LJI;

    public final void LIZ() {
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJI = null;
    }

    public final void LIZJ(Map<String, String> map) {
        if (this.LIZLLL == 0) {
            return;
        }
        LIZ();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJIIJJI(new C517520KRi(this.LIZLLL, new LinkedHashMap(map)));
        }
        this.LIZLLL = 0;
    }

    public final void LJ(Map<String, String> map) {
        if (this.LJ || this.LIZLLL == 0) {
            return;
        }
        if (this.LIZJ > 0 && System.currentTimeMillis() - this.LJFF > this.LIZJ) {
            LIZIZ(1003, null, map);
            return;
        }
        LIZ();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJI(new C517500KRg(this.LIZLLL, 0, (String) null, new LinkedHashMap(map), 12));
        }
    }

    public /* synthetic */ C1822790xXB(String str, int i) {
        this(str, i, 2000L);
    }

    public C1822790xXB(String str, int i, long j) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
    }

    public final void LIZIZ(int i, String str, Map<String, String> map) {
        if (this.LJ || this.LIZLLL == 0) {
            return;
        }
        this.LJ = true;
        LIZ();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            int i2 = this.LIZLLL;
            String strValueOf = String.valueOf(i);
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (i == 1001) {
                linkedHashMap.put("schema", str);
            }
            interfaceC517590KRpLIZJ.LJI(new C517500KRg(i2, 1, strValueOf, linkedHashMap, 8));
        }
    }

    public final void LIZLLL(int i, String str, final Map<String, String> map) {
        LIZ();
        this.LIZLLL = i;
        this.LJ = false;
        this.LJFF = System.currentTimeMillis();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJIIIIZZ(this.LIZ, new C517510KRh(i, this.LIZIZ, str, new LinkedHashMap(map)));
        }
        long j = this.LIZJ;
        if (j > 0) {
            this.LJI = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJJLJLI(new C09JN() { // from class: X.0evT
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PcsPerfLogger@a0c4.onInit$1");
                    this.LL.LIZIZ(1003, null, map);
                    C1C7U.LIZIZ("PcsPerfLogger@a0c4.onInit$1");
                }
            });
        }
    }
}
