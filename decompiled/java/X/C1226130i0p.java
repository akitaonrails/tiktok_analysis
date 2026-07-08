package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226130i0p extends C1225800i0I {
    public final C1226160i0s LLILZ;
    public final C01GW LLILZIL;

    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
    public final void LJI(C1224840hyk c1224840hyk) {
        BaseContact baseContact;
        String nickName;
        BaseContact baseContact2;
        String nickName2;
        InterfaceC1226510i1R interfaceC1226510i1R;
        super.LJI(c1224840hyk);
        if (Intrinsics.LJFF(c1224840hyk.LLJI.get("is_search_page_item"), "1")) {
            if (!c1224840hyk.LLJILJILJ && (interfaceC1226510i1R = this.LL.LIZ) != null) {
                interfaceC1226510i1R.LJIIIIZZ();
                return;
            }
            return;
        }
        String str = "";
        if (!Intrinsics.LJFF(c1224840hyk.LL.LIZIZ, EnumC1226540i1U.TAB_KEY_FRIENDS.getValue())) {
            if (!c1224840hyk.LLJILJILJ || ((List) this.LLILZIL.getValue()).contains(c1224840hyk.LLILZ)) {
                return;
            }
            AbstractC1225770i0F abstractC1225770i0F = this.LLILLJJLI;
            Context contextLIZIZ = abstractC1225770i0F.LJJJJLL().LIZIZ();
            Object[] objArr = new Object[1];
            Object obj = c1224840hyk.LLJI.get("contact");
            if ((obj instanceof IMUser) && (baseContact2 = (BaseContact) obj) != null && (nickName2 = baseContact2.getNickName()) != null) {
                str = nickName2;
            }
            objArr[0] = str;
            C1226680i1i.LIZLLL(abstractC1225770i0F, contextLIZIZ.getString(2131831120, objArr));
            return;
        }
        if (!c1224840hyk.LLJILJILJ) {
            return;
        }
        Object obj2 = c1224840hyk.LLJI.get("item_disable_reason");
        if (obj2 == EnumC1226150i0r.NO_GROUP_PERMISSION) {
            AbstractC1225770i0F abstractC1225770i0F2 = this.LLILLJJLI;
            C1226680i1i.LIZLLL(abstractC1225770i0F2, abstractC1225770i0F2.LJJJJLL().LIZIZ().getString(2131831400));
        } else if (obj2 == EnumC1226150i0r.NO_CHAT_PERMISSION) {
            AbstractC1225770i0F abstractC1225770i0F3 = this.LLILLJJLI;
            Context contextLIZIZ2 = abstractC1225770i0F3.LJJJJLL().LIZIZ();
            Object[] objArr2 = new Object[1];
            Object obj3 = c1224840hyk.LLJI.get("contact");
            if ((obj3 instanceof IMUser) && (baseContact = (BaseContact) obj3) != null && (nickName = baseContact.getNickName()) != null) {
                str = nickName;
            }
            objArr2[0] = str;
            C1226680i1i.LIZLLL(abstractC1225770i0F3, contextLIZIZ2.getString(2131831120, objArr2));
        }
        if (c1224840hyk.LLJILJIL || c1224840hyk.LLJILLL) {
            return;
        }
        AbstractC1225770i0F abstractC1225770i0F4 = this.LLILLJJLI;
        C1226680i1i.LIZLLL(abstractC1225770i0F4, abstractC1225770i0F4.LJJJJLL().LIZIZ().getString(2131835236));
    }

    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
    public final void LJIIIIZZ(C1224840hyk c1224840hyk) {
        super.LJIIIIZZ(c1224840hyk);
    }

    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
    public final boolean LJIIJJI(C1224840hyk c1224840hyk) {
        if (Intrinsics.LJFF(c1224840hyk.LLJI.get("is_search_page_item"), "1") && c1224840hyk.LLJILJIL && !c1224840hyk.LLJILJILJ) {
            return true;
        }
        return false;
    }

    public C1226130i0p(AbstractC1225770i0F abstractC1225770i0F, C1226160i0s c1226160i0s) {
        super(abstractC1225770i0F, c1226160i0s);
        this.LLILZ = c1226160i0s;
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3334));
    }

    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
    public final void LJJJJ(C1224840hyk c1224840hyk, boolean z) {
        InterfaceC1226510i1R interfaceC1226510i1R;
        if (z && c1224840hyk.LL.LIZ == EnumC992630bwD.TYPE_SEARCH_PAGE && (interfaceC1226510i1R = this.LL.LIZ) != null) {
            interfaceC1226510i1R.LJIILJJIL();
        }
    }
}
