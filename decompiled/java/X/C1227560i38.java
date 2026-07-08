package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: renamed from: X.0i38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227560i38 extends C1225700i08 {
    public final C1227630i3F LLILZ;
    public final C01GW LLILZIL;

    @Override // X.C1225700i08, X.InterfaceC1224490hyB
    public final void LJIJ(C1224590hyL c1224590hyL) {
        EnumC1227730i3P enumC1227730i3P;
        List list;
        C1224780hye c1224780hyeLJIILLIIL;
        super.LJIJ(c1224590hyL);
        if (!c1224590hyL.LJ && c1224590hyL.LIZIZ && (enumC1227730i3P = c1224590hyL.LIZ) == EnumC1227730i3P.MAIN) {
            C1226910i25.LJFF(this.LLILLJJLI, enumC1227730i3P, true);
            InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
            if (interfaceC1226510i1R == null || (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) == null || (list = c1224780hyeLJIILLIIL.LIZIZ) == null) {
                list = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object obj = ((C1224840hyk) it2.next()).LLJI.get("contact");
                if ((obj instanceof IMUser) && obj != null) {
                    arrayList.add(obj);
                }
            }
            AbstractC1225770i0F abstractC1225770i0F = this.LLILLJJLI;
            C1227630i3F c1227630i3F = this.LLILZ;
            String str = c1227630i3F.LJIIL;
            if (str == null) {
                str = "";
            }
            C1227760i3S.LIZ(abstractC1225770i0F, str, null, arrayList, c1227630i3F.LJIILJJIL, new AwS385S0200000_19(this, c1224590hyL, 134));
            C1227860i3c c1227860i3c = (C1227860i3c) this.LLILZIL.getValue();
            if (c1227860i3c != null) {
                C23250099c.LIZLLL(c1227860i3c.LIZIZ, C0PEM.LIZJ, null, new C1224910hyr(c1227860i3c, "create", false, null), 2);
            }
            C1227860i3c c1227860i3c2 = (C1227860i3c) this.LLILZIL.getValue();
            if (c1227860i3c2 != null) {
                C23250099c.LIZLLL(c1227860i3c2.LIZIZ, C0PEM.LIZJ, null, new C1224920hys(c1227860i3c2, "create", false, null), 2);
            }
        }
    }

    @Override // X.C1225700i08, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        List<C1224840hyk> list;
        boolean z;
        boolean z2;
        String strInvoke;
        InterfaceC1226510i1R interfaceC1226510i1R = this.LLILLJJLI.LLILLL;
        if (interfaceC1226510i1R != null && (list = c1224790hyf.LIZIZ) != null) {
            if (!this.LLILZ.LJIILIIL && !(!list.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            interfaceC1226510i1R.LJIIZILJ(z, false);
            EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
            if (!this.LLILZ.LJIILIIL && !(!list.isEmpty())) {
                z2 = false;
            } else {
                z2 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            Function1<Integer, String> function1 = this.LLILZ.LJIILL;
            if (function1 == null || (strInvoke = function1.invoke(Integer.valueOf(list.size()))) == null) {
                strInvoke = this.LLILZ.LJIIIZ.LIZJ;
            }
            interfaceC1226510i1R.LJIJJLI(new C1224600hyM(enumC1227730i3P, boolValueOf, strInvoke, (Boolean) null, 24), new C1224600hyM(EnumC1227730i3P.SECONDARY, Boolean.valueOf(!list.isEmpty()), (String) null, (Boolean) null, 28), false);
        }
    }

    public C1227560i38(AbstractC1225770i0F abstractC1225770i0F, C1227630i3F c1227630i3F) {
        super(abstractC1225770i0F, c1227630i3F);
        this.LLILZ = c1227630i3F;
        this.LLILZIL = C452501pT.LIZIZ(new AwS420S0200000_19(this, abstractC1225770i0F, 197));
    }
}
