package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226120i0o extends C1225800i0I {
    public final C1226170i0t LLILZ;
    public final C01GW LLILZIL;

    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
    public final void LJI(C1224840hyk c1224840hyk) {
        String nickName;
        super.LJI(c1224840hyk);
        if (C1225230hzN.LIZIZ(c1224840hyk)) {
            if (!c1224840hyk.LLJILJILJ) {
                InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                if (interfaceC1226510i1R != null) {
                    interfaceC1226510i1R.LJIIIIZZ();
                    return;
                }
                return;
            }
            C1226140i0q.LIZIZ(c1224840hyk, this.LLILLJJLI);
            return;
        }
        if (!Intrinsics.LJFF(c1224840hyk.LL.LIZIZ, EnumC1226540i1U.TAB_KEY_FRIENDS.getValue())) {
            InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
            if (interfaceC1226510i1R2 != null && interfaceC1226510i1R2.LJIIJ() && !c1224840hyk.LLJILJIL && !c1224840hyk.LLJILLL) {
                AbstractC1225770i0F abstractC1225770i0F = this.LLILLJJLI;
                C1226680i1i.LIZLLL(abstractC1225770i0F, abstractC1225770i0F.LJJJJLL().LIZIZ().getString(2131835236));
                return;
            }
            if (!c1224840hyk.LLJILJILJ || ((List) this.LLILZIL.getValue()).contains(c1224840hyk.LLILZ) || !c1224840hyk.LLJILLL) {
                return;
            }
            AbstractC1225770i0F abstractC1225770i0F2 = this.LLILLJJLI;
            Context contextLIZIZ = abstractC1225770i0F2.LJJJJLL().LIZIZ();
            Object[] objArr = new Object[1];
            IMUser iMUserLIZ = C1225230hzN.LIZ(c1224840hyk);
            if (iMUserLIZ == null || (nickName = iMUserLIZ.getNickName()) == null) {
                nickName = "";
            }
            objArr[0] = nickName;
            C1226680i1i.LIZLLL(abstractC1225770i0F2, contextLIZIZ.getString(2131831120, objArr));
            return;
        }
        if (!c1224840hyk.LLJILJILJ) {
            return;
        }
        C1226140i0q.LIZIZ(c1224840hyk, this.LLILLJJLI);
    }

    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
    public final boolean LJIIJJI(C1224840hyk c1224840hyk) {
        if (C1225230hzN.LIZIZ(c1224840hyk) && c1224840hyk.LLJILJIL && !c1224840hyk.LLJILJILJ) {
            return true;
        }
        return false;
    }

    public C1226120i0o(AbstractC1225770i0F abstractC1225770i0F, C1226170i0t c1226170i0t) {
        super(abstractC1225770i0F, c1226170i0t);
        this.LLILZ = c1226170i0t;
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3296));
    }

    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
    public final void LJJJJ(C1224840hyk c1224840hyk, boolean z) {
        InterfaceC1226510i1R interfaceC1226510i1R;
        if (z && c1224840hyk.LL.LIZ == EnumC992630bwD.TYPE_SEARCH_PAGE && (interfaceC1226510i1R = this.LL.LIZ) != null) {
            interfaceC1226510i1R.LJIILJJIL();
        }
    }
}
