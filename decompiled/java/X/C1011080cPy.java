package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0cPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1011080cPy implements InterfaceC660150Puv {
    public final InterfaceC1010250cOd LL;
    public Integer LLILLJJLI;
    public final C1004580cFU LLILLL = new C1004580cFU(0);
    public final List<AbstractC1010700cPM> LLILZ = new ArrayList();
    public final InterfaceC657510Pqf LLILZIL = C655610Pnb.LIZIZ.LIZLLL();

    @Override // X.InterfaceC658610PsR
    public final void LIZIZ(InterfaceC1010860cPc interfaceC1010860cPc) {
    }

    @Override // X.InterfaceC1002830cCf
    public final void LJFF(String str) {
    }

    @Override // X.InterfaceC1002830cCf
    public final void LJIJI() {
    }

    @Override // X.InterfaceC658610PsR
    public final void Ms(InterfaceC1010450cOx interfaceC1010450cOx) {
    }

    @Override // X.InterfaceC658610PsR
    public final InterfaceC1010450cOx ik(InterfaceC1010860cPc interfaceC1010860cPc) {
        return null;
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC658610PsR
    public final InterfaceC1010450cOx ne() {
        return null;
    }

    @Override // X.InterfaceC660150Puv
    public InterfaceC1011430cQX vQ0() {
        return null;
    }

    @Override // X.C0PPF
    public void bind() {
        int i = C2510609se.LIZ;
        Iterator<AbstractC1010700cPM> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().bind();
        }
        InterfaceC657510Pqf interfaceC657510Pqf = this.LLILZIL;
        if (interfaceC657510Pqf != null) {
            interfaceC657510Pqf.LJIJJ(this);
        }
    }

    @Override // X.C0PPF
    public void onViewAttachedToWindow() {
        int i = C2510609se.LIZ;
        Iterator<AbstractC1010700cPM> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().onViewAttachedToWindow();
        }
    }

    @Override // X.C0PPF
    public void onViewDetachedFromWindow() {
        int i = C2510609se.LIZ;
        Iterator<AbstractC1010700cPM> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().onViewDetachedFromWindow();
        }
    }

    @Override // X.C0PPF
    public void unBind() {
        int i = C2510609se.LIZ;
        Iterator<AbstractC1010700cPM> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    @Override // X.InterfaceC1002870cCj
    public final Integer LJIIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1002830cCf
    public final C1004580cFU getShareInfo() {
        return this.LLILLL;
    }

    public C1011080cPy(InterfaceC1010250cOd interfaceC1010250cOd) {
        this.LL = interfaceC1010250cOd;
    }

    @Override // X.InterfaceC1002870cCj
    public final void LJIJJ(Integer num) {
        this.LLILLJJLI = num;
        C0DHT.LIZ = num;
    }
}
