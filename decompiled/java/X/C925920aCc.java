package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925920aCc implements InterfaceC925980aCi {
    public final Function1<C055500If, Unit> LIZ;
    public final InterfaceC1631620sYq<Integer, String, Throwable, Unit> LIZIZ;
    public final List<Function1<C055500If, Unit>> LIZJ = new ArrayList();
    public final List<InterfaceC1631620sYq<Integer, String, Throwable, Unit>> LIZLLL = new ArrayList();

    @Override // X.InterfaceC925980aCi
    public final void LIZIZ(C055500If c055500If) {
        Function1<C055500If, Unit> function1 = this.LIZ;
        if (function1 != null) {
            function1.invoke(c055500If);
        }
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(c055500If);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C925920aCc(Function1<? super C055500If, Unit> function1, InterfaceC1631620sYq<? super Integer, ? super String, ? super Throwable, Unit> interfaceC1631620sYq) {
        this.LIZ = function1;
        this.LIZIZ = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC925980aCi
    public final void LIZ(int i, String str, Throwable th) {
        InterfaceC1631620sYq<Integer, String, Throwable, Unit> interfaceC1631620sYq = this.LIZIZ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Integer.valueOf(i), str, th);
        }
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1631620sYq) it2.next()).invoke(Integer.valueOf(i), str, th);
        }
    }
}
