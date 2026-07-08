package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0keM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1327520keM<T> extends AbstractRunnableC2124508Tz<T> {
    public final InterfaceC1328020kfA<T> LLILLJJLI;
    public final InterfaceC1325690kbP LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public Map LJII() {
        return null;
    }

    public Map<String, String> LJIIIIZZ(T t) {
        return null;
    }

    @Override // X.AbstractRunnableC2124508Tz
    public void LIZLLL() {
        InterfaceC1325690kbP interfaceC1325690kbP = this.LLILLL;
        String str = this.LLILZIL;
        String str2 = this.LLILZ;
        interfaceC1325690kbP.LJIIJ(str);
        interfaceC1325690kbP.LJIIIIZZ(str, str2, null);
        this.LLILLJJLI.LIZIZ();
    }

    @Override // X.AbstractRunnableC2124508Tz
    public void LJ(Exception exc) {
        Map mapLJII;
        InterfaceC1325690kbP interfaceC1325690kbP = this.LLILLL;
        String str = this.LLILZIL;
        String str2 = this.LLILZ;
        if (interfaceC1325690kbP.LJIIJ(str)) {
            mapLJII = LJII();
        } else {
            mapLJII = null;
        }
        interfaceC1325690kbP.LIZ(str, exc, str2, mapLJII);
        this.LLILLJJLI.onFailure(exc);
    }

    @Override // X.AbstractRunnableC2124508Tz
    public void LJFF(T t) {
        Map<String, String> mapLJIIIIZZ;
        InterfaceC1325690kbP interfaceC1325690kbP = this.LLILLL;
        String str = this.LLILZIL;
        String str2 = this.LLILZ;
        if (interfaceC1325690kbP.LJIIJ(str)) {
            mapLJIIIIZZ = LJIIIIZZ(t);
        } else {
            mapLJIIIIZZ = null;
        }
        interfaceC1325690kbP.LIZIZ(str, str2, mapLJIIIIZZ);
        this.LLILLJJLI.LIZJ(1, t);
    }

    public AbstractC1327520keM(InterfaceC1328020kfA<T> interfaceC1328020kfA, InterfaceC1325690kbP interfaceC1325690kbP, String str, String str2) {
        this.LLILLJJLI = interfaceC1328020kfA;
        this.LLILLL = interfaceC1325690kbP;
        this.LLILZ = str;
        this.LLILZIL = str2;
        interfaceC1325690kbP.LJI(str2, str);
    }
}
