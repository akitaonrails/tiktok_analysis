package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1223620hwm {
    public static final boolean LJFF() {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (C894660Z7w.LIZJ()) {
            return true;
        }
        c0i0b.LIZJ();
        return Intrinsics.LJFF(C894660Z7w.LIZIZ(), "local_test");
    }

    public static final AbstractC595720NYc LIZIZ(C1224840hyk c1224840hyk) {
        List<String> listLJJ;
        String str = c1224840hyk.LLILLL;
        if (Intrinsics.LJFF(str, "private")) {
            return new C595710NYb(c1224840hyk.LLILZ);
        }
        if (!Intrinsics.LJFF(str, "group") || (listLJJ = C0ZFW.LJJ(c1224840hyk.LLILZ, false)) == null) {
            return null;
        }
        return new C595700NYa(c1224840hyk.LLILZ, listLJJ);
    }

    public static final C01GW<C1224280hxq> LIZLLL(AbstractC738140SxQ abstractC738140SxQ) {
        return C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS563S0100000_19(new C1559260qg8(new C723580SZw(abstractC738140SxQ, C1153920g8M.class, "protocol_uuid"), abstractC738140SxQ.checkSupervisorPrepared()), (C1559260qg8<C1153920g8M>) 2945));
    }

    public static final <S extends InterfaceC0148002o> C01GW<C1224280hxq> LJ(AssemViewModel<S> assemViewModel) {
        return C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS563S0100000_19(new C1559260qg8(new C723600SZy(assemViewModel, C1153920g8M.class, "protocol_uuid"), true), (C1559260qg8<C1153920g8M>) 2944));
    }

    public static final void LIZ(InterfaceC1224180hxg interfaceC1224180hxg, C20603715jn c20603715jn) {
        boolean zLIZ;
        C20603715jn c20603715jnLIZIZ = interfaceC1224180hxg.LIZJ().LIZIZ();
        Class<? extends PowerLoadingCell> cls = c20603715jnLIZIZ.LIZLLL;
        if (cls != null) {
            c20603715jn.LIZLLL = cls;
        }
        c20603715jn.LIZJ = c20603715jnLIZIZ.LIZJ;
        c20603715jn.LIZ = c20603715jnLIZIZ.LIZ;
        c20603715jn.LJ = c20603715jnLIZIZ.LJ;
        c20603715jn.LJI = c20603715jnLIZIZ.LJI;
        c20603715jn.LJIIL = c20603715jnLIZIZ.LJIIL;
        if (C1697810uHb.LJIIJJI(1, 2, 3).contains(Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "im_contact_selector_performance_optimization", true)))) {
            zLIZ = interfaceC1224180hxg.LIZJ().LIZ();
        } else {
            zLIZ = true;
        }
        c20603715jn.LJIIJJI = zLIZ;
        c20603715jn.LJII = C786410Ut5.h4();
        c20603715jn.LJIILLIIL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(C627660Ojc<AbstractC1223800hx4> c627660Ojc, InterfaceC1223330hwJ interfaceC1223330hwJ) {
        boolean z;
        boolean z2;
        EnumC1223310hwH enumC1223310hwH;
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c627660Ojc.LL;
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2 = c627660Ojc.LLILLJJLI;
        if (abstractC1623806Xk instanceof C1623706Xj) {
            interfaceC1223330hwJ.sU0(EnumC1223310hwH.LOADING);
            return;
        }
        if (abstractC1623806Xk instanceof C491001vg) {
            interfaceC1223330hwJ.sU0(EnumC1223310hwH.ERROR);
            return;
        }
        if (!(abstractC1623806Xk instanceof C1623606Xi)) {
            return;
        }
        if (((C626160OhC) ((C1623606Xi) abstractC1623806Xk).LIZ).LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        List<AbstractC1223800hx4> list = c627660Ojc.LLILZ;
        if (list != null && list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2 && (abstractC1623806Xk2 instanceof C491101vh)) {
            interfaceC1223330hwJ.sU0(EnumC1223310hwH.SUCCESS);
            return;
        }
        if (abstractC1623806Xk2 instanceof C1623706Xj) {
            return;
        }
        List<AbstractC1223800hx4> list2 = c627660Ojc.LLILZ;
        if (list2 != null && !list2.isEmpty()) {
            enumC1223310hwH = EnumC1223310hwH.SUCCESS;
        } else {
            enumC1223310hwH = EnumC1223310hwH.EMPTY;
        }
        interfaceC1223330hwJ.sU0(enumC1223310hwH);
    }
}
