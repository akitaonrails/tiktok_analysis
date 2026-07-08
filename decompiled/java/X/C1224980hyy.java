package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224980hyy extends C1225700i08 {
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    public final String LJJJJJ() {
        return (String) this.LLILZIL.getValue();
    }

    @Override // X.C1225700i08, X.InterfaceC1224490hyB
    public final void LJIJ(C1224590hyL c1224590hyL) {
        IMUser iMUser;
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        C1224840hyk c1224840hyk;
        Map<String, Object> map;
        String str;
        C1224780hye c1224780hyeLJIILLIIL2;
        List<C1224840hyk> list2;
        C1224840hyk c1224840hyk2;
        super.LJIJ(c1224590hyL);
        if (c1224590hyL.LJ || !c1224590hyL.LIZIZ || c1224590hyL.LIZ != EnumC1227730i3P.MAIN) {
            return;
        }
        Object obj = null;
        if (Intrinsics.LJFF(this.LLILZLL.getValue(), Boolean.TRUE)) {
            InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
            if (interfaceC1226510i1R == null || (c1224780hyeLJIILLIIL2 = interfaceC1226510i1R.LJIILLIIL()) == null || (list2 = c1224780hyeLJIILLIIL2.LIZIZ) == null || (c1224840hyk2 = (C1224840hyk) C13LP.LJJJLL(list2)) == null || (str = c1224840hyk2.LLILZ) == null) {
                str = "";
            }
            C1440005kM.LIZ(new C0Z6Z(str));
            InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
            if (interfaceC1226510i1R2 != null) {
                interfaceC1226510i1R2.LJIILL(C343970De7.LIZ, null);
                return;
            }
            return;
        }
        Context context = (Context) this.LLILZ.getValue();
        InterfaceC1226510i1R interfaceC1226510i1R3 = this.LL.LIZ;
        if (interfaceC1226510i1R3 != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R3.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null && (c1224840hyk = (C1224840hyk) C13LP.LJJJLL(list)) != null && (map = c1224840hyk.LLJI) != null) {
            obj = map.get("contact");
        }
        if ((obj instanceof IMUser) && (iMUser = (IMUser) obj) != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(context.getString(2131828489, iMUser.getDisplayName()));
            c1397580mTM.LIZ(2131828488);
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS385S0200000_19(iMUser, this, 136));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // X.C1225700i08, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        InterfaceC1226510i1R interfaceC1226510i1R;
        if (c1224790hyf.LIZIZ != null && (interfaceC1226510i1R = this.LL.LIZ) != null) {
            interfaceC1226510i1R.LJIIJJI(new C1224600hyM(EnumC1227730i3P.MAIN, Boolean.valueOf(!r2.isEmpty()), (String) null, (Boolean) null, (Boolean) null), false);
        }
    }

    public C1224980hyy(AbstractC1225770i0F abstractC1225770i0F, C1224990hyz c1224990hyz) {
        super(abstractC1225770i0F, c1224990hyz);
        this.LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(abstractC1225770i0F, 3248));
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1224990hyz, 3249));
        this.LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(c1224990hyz, 3250));
    }
}
