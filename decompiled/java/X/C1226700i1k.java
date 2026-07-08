package X;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0i1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1226700i1k implements InterfaceC1224260hxo {
    public final AbstractC1225770i0F LLILLJJLI;
    public final C1226750i1p LLILLL;
    public C1224220hxk LLIZLLLIL;
    public String LLJ;
    public final /* synthetic */ C1224960hyw LL = new C1224960hyw();
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 36));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 35));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 33));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 34));

    @Override // X.InterfaceC1224250hxn
    public final void LIZLLL(EnumC1223630hwn enumC1223630hwn) {
    }

    @Override // X.InterfaceC1224300hxs
    public void LJFF() {
    }

    @Override // X.InterfaceC1224300hxs
    public final void LJIILL(String str) {
    }

    @Override // X.InterfaceC1224300hxs
    public final void LJIJI(String str) {
    }

    @Override // X.InterfaceC1224300hxs
    public void LJJI() {
    }

    @Override // X.InterfaceC1224300hxs
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC1224300hxs
    public final void LJJIJIIJIL() {
    }

    @Override // X.InterfaceC1224300hxs
    public final void LJJIJL() {
    }

    @Override // X.InterfaceC1224250hxn
    public final void LJJIJLIJ(C1224050hxT c1224050hxT) {
    }

    @Override // X.InterfaceC1224300hxs
    public final void LJJJIL() {
    }

    @Override // X.InterfaceC1224260hxo
    public void onShow() {
    }

    @Override // X.InterfaceC1224260hxo
    public void LIZIZ() {
        AbstractC1225770i0F abstractC1225770i0F = this.LLILLJJLI;
        LJJJJJ();
        abstractC1225770i0F.LJJJJZ(new AbstractC1225650i03() { // from class: X.0i04
        });
    }

    public final String LJJJJJ() {
        return (String) this.LLILZIL.getValue();
    }

    public final AbstractC1225780i0G LJJJJJL() {
        return (AbstractC1225780i0G) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1224260hxo
    public final C1224220hxk LJIJJ(Context context) {
        C1224220hxk c1224220hxk = this.LLIZLLLIL;
        if (c1224220hxk != null) {
            return c1224220hxk;
        }
        C1224220hxk c1224220hxkLJJJJIZL = LJJJJIZL(context);
        this.LLIZLLLIL = c1224220hxkLJJJJIZL;
        return c1224220hxkLJJJJIZL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // X.InterfaceC1224250hxn
    public void LJJJ(C1224790hyf c1224790hyf) {
        String str;
        ?? LJ;
        InterfaceC1226510i1R interfaceC1226510i1R;
        InterfaceC1226510i1R interfaceC1226510i1R2;
        InterfaceC1226510i1R interfaceC1226510i1R3;
        InterfaceC1226510i1R interfaceC1226510i1R4;
        List<C1224760hyc> listLJFF;
        List<C1224840hyk> list = c1224790hyf.LIZIZ;
        if (list != null && this.LLIZ.getValue() == C0N0C.SELECTED_LIST_NOT_EMPTY && (str = this.LLJ) != null) {
            int size = list.size();
            InterfaceC1226510i1R interfaceC1226510i1R5 = this.LL.LIZ;
            if (interfaceC1226510i1R5 != null && (listLJFF = interfaceC1226510i1R5.LJFF(str)) != null) {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJFF, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LJ = new LinkedHashMap(iLIZIZ);
                for (C1224760hyc c1224760hyc : listLJFF) {
                    LJ.put(c1224760hyc.LL, c1224760hyc);
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            if (size > 0) {
                EnumC1226770i1r enumC1226770i1r = (EnumC1226770i1r) this.LLILZLL.getValue();
                if (enumC1226770i1r != null) {
                    int i = C1226760i1q.LIZ[enumC1226770i1r.ordinal()];
                    if (i != 1) {
                        if (i == 2 && LJ.containsKey(LJJJJJ())) {
                            C1224760hyc c1224760hyc2 = (C1224760hyc) LJ.get(LJJJJJ());
                            if ((c1224760hyc2 != null && !c1224760hyc2.LLILZLL) || (interfaceC1226510i1R4 = this.LL.LIZ) == null) {
                                return;
                            }
                            interfaceC1226510i1R4.LJIL(str, LJJJJJ());
                            return;
                        }
                        return;
                    }
                    if (!LJ.containsKey(LJJJJJ())) {
                        return;
                    }
                    C1224760hyc c1224760hyc3 = (C1224760hyc) LJ.get(LJJJJJ());
                    if ((c1224760hyc3 != null && !c1224760hyc3.LLIZ) || (interfaceC1226510i1R3 = this.LL.LIZ) == null) {
                        return;
                    }
                    interfaceC1226510i1R3.LJII(str, LJJJJJ());
                    return;
                }
                return;
            }
            EnumC1226770i1r enumC1226770i1r2 = (EnumC1226770i1r) this.LLILZLL.getValue();
            if (enumC1226770i1r2 == null) {
                return;
            }
            int i2 = C1226760i1q.LIZ[enumC1226770i1r2.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 || !LJ.containsKey(LJJJJJ())) {
                    return;
                }
                C1224760hyc c1224760hyc4 = (C1224760hyc) LJ.get(LJJJJJ());
                if ((c1224760hyc4 != null && c1224760hyc4.LLILZLL) || (interfaceC1226510i1R2 = this.LL.LIZ) == null) {
                    return;
                }
                interfaceC1226510i1R2.LJ(str, LJJJJJ());
                return;
            }
            if (!LJ.containsKey(LJJJJJ())) {
                return;
            }
            C1224760hyc c1224760hyc5 = (C1224760hyc) LJ.get(LJJJJJ());
            if ((c1224760hyc5 != null && c1224760hyc5.LLIZ) || (interfaceC1226510i1R = this.LL.LIZ) == null) {
                return;
            }
            interfaceC1226510i1R.LJIJ(str, LJJJJJ(), true);
        }
    }

    public C1224220hxk LJJJJIZL(Context context) {
        return new C1224220hxk("", null, null, null, null, false, false);
    }

    public C1226700i1k(AbstractC1225770i0F abstractC1225770i0F, C1226750i1p c1226750i1p) {
        this.LLILLJJLI = abstractC1225770i0F;
        this.LLILLL = c1226750i1p;
    }
}
