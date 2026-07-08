package X;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yD2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848740yD2 {
    public final C01GW LIZ;
    public final C1848750yD3 LIZIZ;
    public final C1848720yD0 LIZJ = new C1848720yD0();
    public final InterfaceC497601wk LIZLLL;
    public volatile AnonymousClass0956 LJ;
    public final AnonymousClass0956 LJFF;

    public final synchronized void LIZ() {
        for (C443120HZe c443120HZe : (ArrayList) C13LP.LJLIL(this.LIZJ.LIZIZ(), this.LIZJ.LIZ())) {
            this.LIZIZ.LIZIZ((String) c443120HZe.getFirst(), (String) c443120HZe.getSecond(), (String) c443120HZe.getThird());
        }
        this.LIZIZ.LIZ();
    }

    public final synchronized void LIZJ() {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            this.LJ = C23250099c.LIZLLL(this.LIZLLL, null, null, new C1403605eU(this, null), 3);
        }
    }

    public final synchronized void LIZLLL() {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJ = null;
    }

    public static final String LJ(String str) {
        String dir = EnumC2221141BwW.USER.getDir();
        if (str == null) {
            return dir + "/storage";
        }
        return dir + "/storage/" + str;
    }

    public final synchronized C2220221Bv2 LIZIZ(String str) {
        if (str != null) {
            if (!a0.LJJJIL(str)) {
                C1848720yD0 c1848720yD0 = this.LIZJ;
                C1848730yD1 c1848730yD1Remove = c1848720yD0.LIZ.remove(str);
                if (c1848730yD1Remove != null) {
                    c1848720yD0.LIZJ -= c1848730yD1Remove.LIZJ;
                    c1848720yD0.LIZIZ.remove(str);
                }
                C1848750yD3 c1848750yD3 = this.LIZIZ;
                Pair pair = (Pair) ((ConcurrentHashMap) c1848750yD3.LIZLLL).remove(str);
                if (pair != null) {
                    c1848750yD3.LJ -= (long) C1848700yCy.LIZ((String) pair.getFirst());
                    if (c1848750yD3.LJ < 0) {
                        c1848750yD3.LJ = 0L;
                    }
                }
                this.LIZIZ.LIZ();
                return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("data", "")));
            }
        }
        return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("data", "")));
    }

    public C1848740yD2(InterfaceC2220701Bvo interfaceC2220701Bvo, C054G c054g, final C1304160k2g c1304160k2g) {
        this.LIZ = C452501pT.LIZIZ(new Function0() { // from class: X.0yD4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new C0VSJ(c1304160k2g.LJIIIZ.LIZIZ.path, C1848740yD2.LJ(null));
            }
        });
        this.LIZIZ = new C1848750yD3(interfaceC2220701Bvo, LJ("storage.json"));
        this.LIZLLL = c054g == null ? C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ)) : c054g;
        this.LJFF = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1848710yCz(this, null), 3);
    }
}
