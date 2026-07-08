package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0kQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319140kQq implements InterfaceC1319180kQu {
    public final AbstractC1298750jtx LIZ;
    public final BPEAHandler LIZIZ;
    public RunnableC1319130kQp LIZJ;
    public LinkedList<C1319120kQo> LIZLLL;
    public LinkedList<C1319120kQo> LJ;
    public boolean LJFF;

    @Override // X.InterfaceC1319180kQu
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1319180kQu
    public final void dispose() {
    }

    public final void LJFF() {
        if (this.LIZJ != null) {
            return;
        }
        RunnableC1319130kQp runnableC1319130kQp = new RunnableC1319130kQp(this);
        this.LIZJ = runnableC1319130kQp;
        C786410Ut5.LJLIIL(50, this.LIZIZ, runnableC1319130kQp);
    }

    public C1319140kQq(AbstractC1298750jtx abstractC1298750jtx) {
        this.LIZ = abstractC1298750jtx;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZIZ = bPEAHandler;
        this.LJ = new LinkedList<>();
        this.LIZLLL = new LinkedList<>();
        RunnableC1319130kQp runnableC1319130kQp = new RunnableC1319130kQp(this);
        this.LIZJ = runnableC1319130kQp;
        C786410Ut5.LJLIIL(500, bPEAHandler, runnableC1319130kQp);
    }

    @Override // X.InterfaceC1319180kQu
    public final void LIZ(C1318570kPv c1318570kPv) {
        int i = UIList.LLLL;
        this.LJ.push(new C1319120kQo(c1318570kPv, "nodedisappear"));
        LJFF();
    }

    @Override // X.InterfaceC1319180kQu
    public final void LIZJ(C1318570kPv c1318570kPv) {
        int i = UIList.LLLL;
        this.LJ.push(new C1319120kQo(c1318570kPv, "nodeappear"));
        LJFF();
    }

    @Override // X.InterfaceC1319180kQu
    public final void LIZLLL(C1318570kPv c1318570kPv) {
        UIComponent uIComponent;
        for (C1319120kQo c1319120kQo : this.LIZLLL) {
            if (c1319120kQo.LIZ == c1318570kPv && (uIComponent = c1318570kPv.LL.LLILLJJLI) != null) {
                c1319120kQo.LIZLLL = uIComponent.LLILLJJLI;
            }
        }
        for (C1319120kQo c1319120kQo2 : this.LJ) {
            if (c1319120kQo2.LIZ == c1318570kPv) {
                c1319120kQo2.LIZLLL = c1318570kPv.LL.LLILLJJLI.LLILLJJLI;
            }
        }
    }

    public final boolean LJI(C1319120kQo c1319120kQo) {
        if (c1319120kQo == null) {
            return false;
        }
        if (c1319120kQo.LIZ.LL.LLILLJJLI == null) {
            if (!this.LJFF) {
                return false;
            }
            return "nodedisappear".equals(c1319120kQo.LIZIZ);
        }
        if (c1319120kQo.LIZIZ == null) {
            return false;
        }
        return true;
    }

    public final boolean LJ(C1319120kQo c1319120kQo, C1319120kQo c1319120kQo2) {
        if (this.LJFF && !TextUtils.isEmpty(c1319120kQo.LIZIZ) && !c1319120kQo.LIZIZ.equals(c1319120kQo2.LIZIZ)) {
            return false;
        }
        String str = c1319120kQo.LIZLLL;
        if (str == null && c1319120kQo2.LIZLLL == null) {
            if (c1319120kQo.LIZJ != c1319120kQo2.LIZJ) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(str, c1319120kQo2.LIZLLL);
    }
}
