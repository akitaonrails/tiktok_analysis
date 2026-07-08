package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1010600cPC implements InterfaceC660150Puv {
    public final InterfaceC1010250cOd LL;
    public Integer LLILZIL;
    public InterfaceC1010450cOx LLILZLL;
    public final InterfaceC657510Pqf LLILLJJLI = C655610Pnb.LIZIZ.LIZLLL();
    public final List<AbstractC1010700cPM> LLILLL = new ArrayList();
    public final C1004580cFU LLILZ = new C1004580cFU(0);
    public final C1010750cPR LLIZ = new C1010750cPR();

    public void LJFF(String str) {
    }

    public void LJIJI() {
    }

    public InterfaceC1010250cOd LJJ() {
        throw null;
    }

    public void LJJI() {
        throw null;
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.C0PPF
    public void onDestroy() {
    }

    @Override // X.InterfaceC660150Puv
    public InterfaceC1011430cQX vQ0() {
        throw null;
    }

    public C1010640cPG LJJIFFI() {
        return new C1010640cPG(vQ0(), new C1010630cPF(true, C2097908Jt.LIZJ(new Pair(EnumC1010840cPa.BREAK, Boolean.FALSE)), null, null));
    }

    @Override // X.C0PPF
    public void bind() {
        LJJII(this.LLILLL);
        LJJI();
        int i = C2510609se.LIZ;
        InterfaceC657510Pqf interfaceC657510Pqf = this.LLILLJJLI;
        if (interfaceC657510Pqf != null) {
            interfaceC657510Pqf.LJIJJ(this);
        }
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1010700cPM) it2.next()).bind();
        }
    }

    @Override // X.C0PPF
    public void onViewAttachedToWindow() {
        LJJI();
        int i = C2510609se.LIZ;
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1010700cPM) it2.next()).onViewAttachedToWindow();
        }
        InterfaceC1010450cOx interfaceC1010450cOx = this.LLILZLL;
        if (interfaceC1010450cOx != null) {
            interfaceC1010450cOx.onViewAttachedToWindow();
        }
    }

    @Override // X.C0PPF
    public void onViewDetachedFromWindow() {
        LJJI();
        int i = C2510609se.LIZ;
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1010700cPM) it2.next()).onViewDetachedFromWindow();
        }
        InterfaceC1010450cOx interfaceC1010450cOx = this.LLILZLL;
        if (interfaceC1010450cOx != null) {
            interfaceC1010450cOx.onViewDetachedFromWindow();
        }
        C1010120cOQ.LJJIL(this.LLILZ);
        this.LLIZ.LIZ(LJJ().getAweme());
    }

    @Override // X.InterfaceC1002870cCj
    public final Integer LJIIL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1002830cCf
    public final C1004580cFU getShareInfo() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC658610PsR
    public final InterfaceC1010450cOx ne() {
        return this.LLILZLL;
    }

    public C1010600cPC(InterfaceC1010250cOd interfaceC1010250cOd) {
        this.LL = interfaceC1010250cOd;
    }

    @Override // X.InterfaceC658610PsR
    public final void LIZIZ(InterfaceC1010860cPc interfaceC1010860cPc) {
        Ms(ik(interfaceC1010860cPc));
    }

    @Override // X.InterfaceC1002870cCj
    public final void LJIJJ(Integer num) {
        this.LLILZIL = num;
        if (num != null) {
            C0DHT.LIZ = num;
        }
    }

    public void LJJII(List<AbstractC1010700cPM> list) {
        LJJI();
        int i = C2510609se.LIZ;
    }

    public void Ms(InterfaceC1010450cOx interfaceC1010450cOx) {
        C19EG c19egLIZIZ;
        Context context;
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((ArrayList) ((AbstractC1010700cPM) it2.next()).LLILZ).iterator();
            while (it3.hasNext()) {
                ((AbstractC1010710cPN) it3.next()).LIZJ(interfaceC1010450cOx);
            }
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view = interfaceC1010450cOx.Mh().getView();
        InterfaceC1010250cOd interfaceC1010250cOdLJJ = LJJ();
        if (interfaceC1010250cOdLJJ != null && (context = interfaceC1010250cOdLJJ.getContext()) != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        C1009940cO8.LIZIZ(interfaceC1010450cOx, SAFHelper.LJIJI(view, c19egLIZIZ), C2097608Jq.LJIIIIZZ(new Pair(C1010930cPj.LIZ, new AwS560S0100000_16(this, 921)), new Pair(C1010900cPg.LIZ, AFwS204S0000000_16.get$arr$(501))));
    }

    @Override // X.InterfaceC658610PsR
    public final InterfaceC1010450cOx ik(InterfaceC1010860cPc interfaceC1010860cPc) {
        LJJI();
        int i = C2510609se.LIZ;
        C1010790cPV c1010790cPVLIZ = C1010810cPX.LIZ(interfaceC1010860cPc);
        this.LLILZLL = c1010790cPVLIZ;
        c1010790cPVLIZ.LIZ(LJJIFFI());
        Ms(c1010790cPVLIZ);
        return c1010790cPVLIZ;
    }
}
