package X;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0XzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866740XzM {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C0YHX LIZ;
    public final ConcurrentHashMap<InterfaceC866830XzV, C866730XzL> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Pair<String, InterfaceC866850XzX>, C866570Xz5> LIZJ = new ConcurrentHashMap<>();

    public C866740XzM(C0YHX c0yhx) {
        this.LIZ = c0yhx;
    }

    public final void LIZIZ(InterfaceC866830XzV interfaceC866830XzV) {
        C866730XzL c866730XzLRemove = this.LIZIZ.remove(interfaceC866830XzV);
        if (c866730XzLRemove == null) {
            return;
        }
        c866730XzLRemove.LIZ.unsubscribe();
        c866730XzLRemove.LIZIZ.unsubscribe();
        this.LIZ.LIZ().LJJII(c866730XzLRemove.LIZJ);
    }

    public static void LIZ(InterfaceC866850XzX interfaceC866850XzX, InterfaceC866870XzZ interfaceC866870XzZ) {
        if (interfaceC866870XzZ instanceof C866780XzQ) {
            C866780XzQ c866780XzQ = (C866780XzQ) interfaceC866870XzZ;
            interfaceC866850XzX.LJLI(c866780XzQ.LIZ, new ArrayList(c866780XzQ.LIZIZ));
            return;
        }
        if (interfaceC866870XzZ instanceof C866810XzT) {
            interfaceC866850XzX.LJJZZI(new ArrayList(((C866810XzT) interfaceC866870XzZ).LIZIZ));
            return;
        }
        if (interfaceC866870XzZ instanceof C866790XzR) {
            interfaceC866850XzX.LJJLL(new ArrayList(((C866790XzR) interfaceC866870XzZ).LIZIZ));
            return;
        }
        if (interfaceC866870XzZ instanceof C866800XzS) {
            interfaceC866850XzX.LJJLJLI(new ArrayList(((C866800XzS) interfaceC866870XzZ).LIZIZ));
        } else {
            if (interfaceC866870XzZ instanceof C866770XzP) {
                C866770XzP c866770XzP = (C866770XzP) interfaceC866870XzZ;
                interfaceC866850XzX.LLIILZL(c866770XzP.LIZIZ, c866770XzP.LIZ, new ArrayList(c866770XzP.LIZJ));
                return;
            }
            throw new C1954807lC();
        }
    }

    public final void LIZJ(String str, InterfaceC866850XzX interfaceC866850XzX) {
        C866570Xz5 c866570Xz5Remove = this.LIZJ.remove(new Pair(str, interfaceC866850XzX));
        if (c866570Xz5Remove == null) {
            return;
        }
        c866570Xz5Remove.LIZ.unsubscribe();
        c866570Xz5Remove.LIZIZ.unsubscribe();
    }
}
