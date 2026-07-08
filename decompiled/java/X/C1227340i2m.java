package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.newselector.repository.RelatedFriendStruct;
import com.ss.android.ugc.aweme.newselector.repository.RelatedUserList;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227340i2m extends C1225800i0I {
    public final C1227120i2Q LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
    public final void LJI(C1224840hyk c1224840hyk) {
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

    @Override // X.C1225800i0I, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        C1224840hyk next;
        List<C1224840hyk> list = c1224790hyf.LIZIZ;
        if (list != null && !this.LLILZLL && ((List) this.LLIZLLLIL.getValue()).size() == 1) {
            this.LLILZLL = true;
            Iterator<C1224840hyk> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LLILZ, C13LP.LJJJJZI((List) this.LLIZLLLIL.getValue()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1224840hyk c1224840hyk = next;
            if (c1224840hyk != null) {
                LJJJJIZL(c1224840hyk, C00IX.HAS_ONE_SELECTED_CONTACT_AFTER_LOADED);
            }
        }
    }

    public C1227340i2m(AbstractC1225770i0F abstractC1225770i0F, C1227120i2Q c1227120i2Q) {
        super(abstractC1225770i0F, c1227120i2Q);
        this.LLILZ = c1227120i2Q;
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3285));
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3286));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3284));
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3283));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3287));
    }

    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
    public final void LJJJJ(C1224840hyk c1224840hyk, boolean z) {
        C00IX c00ix;
        if (z) {
            c00ix = C00IX.SELECT_CONTACT;
        } else {
            c00ix = C00IX.UNSELECT_CONTACT;
        }
        LJJJJIZL(c1224840hyk, c00ix);
    }

    public final void LJJJJIZL(C1224840hyk c1224840hyk, C00IX c00ix) {
        List list;
        List<C1224840hyk> list2;
        C1224780hye c1224780hyeLJIILLIIL;
        Map<String, List<C1224840hyk>> map;
        boolean z;
        RelatedUserList relatedUserList;
        if (((List) this.LLIZ.getValue()).isEmpty() && ((Boolean) this.LLJI.getValue()).booleanValue()) {
            if (c00ix != C00IX.UNSELECT_CONTACT && c1224840hyk.LL.LIZ == EnumC992630bwD.TYPE_CONTENT_PAGE && ((Number) C258380AAq.LIZ.getValue()).intValue() > 0) {
                return;
            }
            C1227350i2n c1227350i2n = (C1227350i2n) this.LLILZIL.getValue();
            c1227350i2n.getClass();
            if (c00ix != C00IX.SELECT_CONTACT && c00ix != C00IX.HAS_ONE_SELECTED_CONTACT_AFTER_LOADED) {
                if (Intrinsics.LJFF(c1224840hyk.LLILZ, c1227350i2n.LIZIZ)) {
                    c1227350i2n.LIZIZ = "";
                    InterfaceC1226510i1R interfaceC1226510i1R = c1227350i2n.LIZ.LL.LIZ;
                    if (interfaceC1226510i1R != null) {
                        interfaceC1226510i1R.LJIILIIL(0, EnumC1226540i1U.TAB_KEY_FRIENDS.getValue(), null, new C1227360i2o(c1227350i2n));
                    }
                }
                if (!Intrinsics.LJFF(c1224840hyk.LLILZ, c1227350i2n.LIZJ)) {
                    return;
                }
                c1227350i2n.LIZJ = "";
                return;
            }
            if (C1225230hzN.LIZIZ(c1224840hyk) && Intrinsics.LJFF(c1224840hyk.LLJI.get("is_search_page_default_item"), "1")) {
                InterfaceC1226510i1R interfaceC1226510i1R2 = c1227350i2n.LIZ.LL.LIZ;
                if (interfaceC1226510i1R2 == null) {
                    return;
                }
                interfaceC1226510i1R2.LJIIIZ(new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, EnumC1226540i1U.TAB_KEY_FRIENDS.getValue()));
                return;
            }
            if (!C1225230hzN.LIZIZ(c1224840hyk) && !C1227320i2k.LIZIZ(c1227350i2n.LIZ.LLILLJJLI).isEmpty() && c00ix != C00IX.HAS_ONE_SELECTED_CONTACT_AFTER_LOADED) {
                return;
            }
            c1227350i2n.LIZLLL = System.currentTimeMillis();
            String str = c1224840hyk.LLILZ;
            c1227350i2n.LIZJ = str;
            C1533905zV c1533905zV = C1533905zV.LLILZIL;
            C1533705zT c1533705zTLIZJ = c1533905zV.LIZJ();
            if ((c1533705zTLIZJ == null || (relatedUserList = c1533705zTLIZJ.relatedUserListMap.get(C2095008Iq.LJIILIIL(str))) == null || (list = relatedUserList.userList) == null || list.isEmpty()) && (list = (List) ((LinkedHashMap) c1533905zV.LLILZ).get(str)) == null) {
                list = C13BV.INSTANCE;
            }
            ArrayList<RelatedFriendStruct> arrayList = new ArrayList();
            for (Object obj : list) {
                RelatedFriendStruct relatedFriendStruct = (RelatedFriendStruct) obj;
                if (!C13LP.LJJJJ(relatedFriendStruct.uid, C1227320i2k.LIZIZ(c1227350i2n.LIZ.LLILLJJLI))) {
                    if (!C13LP.LJJJJ(relatedFriendStruct.uid, (Iterable) c1227350i2n.LIZ.LLJ.getValue())) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (RelatedFriendStruct relatedFriendStruct2 : arrayList) {
                C2201941BFw c2201941BFw = IMUser.Companion;
                User user$im_group_chat_release = relatedFriendStruct2.toUser$im_group_chat_release();
                c2201941BFw.getClass();
                IMUser iMUserLIZJ = C2201941BFw.LIZJ(user$im_group_chat_release);
                if (iMUserLIZJ != null) {
                    arrayList2.add(iMUserLIZJ);
                }
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("is_related_friend_item", "1"));
            ArrayList<C1224840hyk> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C1224840hyk c1224840hykLJI = C1227320i2k.LJI((IMUser) it2.next(), null, null, c1227350i2n.LIZ.LLILZ, mapLIZJ, 3);
                AbstractC1225770i0F abstractC1225770i0F = c1227350i2n.LIZ.LLILLJJLI;
                if (C1227320i2k.LIZIZ(abstractC1225770i0F).size() >= abstractC1225770i0F.LJJJJLL().LIZJ().LIZIZ()) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList3.add(C1224840hyk.LIZ(c1224840hykLJI, null, null, false, null, null, false, z, false, false, false, 61439));
            }
            InterfaceC1226510i1R interfaceC1226510i1R3 = c1227350i2n.LIZ.LL.LIZ;
            if (interfaceC1226510i1R3 == null || (c1224780hyeLJIILLIIL = interfaceC1226510i1R3.LJIILLIIL()) == null || (map = c1224780hyeLJIILLIIL.LIZ) == null || (list2 = map.get(EnumC1226540i1U.TAB_KEY_FRIENDS.getValue())) == null) {
                list2 = C13BV.INSTANCE;
            }
            ArrayList arrayList4 = new ArrayList();
            for (C1224840hyk c1224840hyk2 : list2) {
                if (c1224840hyk2.LLJJI) {
                    arrayList4.add(c1224840hyk2);
                }
            }
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((C1224840hyk) it3.next()).LLILZ);
            }
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            for (C1224840hyk c1224840hykLIZ : arrayList3) {
                if (arrayList5.contains(c1224840hykLIZ.LLILZ)) {
                    c1224840hykLIZ = C1224840hyk.LIZ(c1224840hykLIZ, null, null, false, null, null, false, false, false, false, true, 32767);
                }
                arrayList6.add(c1224840hykLIZ);
            }
            if (!arrayList6.isEmpty()) {
                if (Intrinsics.LJFF(c1227350i2n.LIZJ, c1224840hyk.LLILZ)) {
                    InterfaceC1226510i1R interfaceC1226510i1R4 = c1227350i2n.LIZ.LL.LIZ;
                    if (interfaceC1226510i1R4 != null) {
                        interfaceC1226510i1R4.LJIIIZ(new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, EnumC1226540i1U.TAB_KEY_FRIENDS.getValue()));
                    }
                    c1227350i2n.LIZIZ = c1224840hyk.LLILZ;
                    ArrayList arrayList7 = new ArrayList();
                    ListProtector.add(arrayList7, 0, new C1223790hx3(C1383370m6R.LIZ.getString(2131831125), C1227320i2k.LIZJ(), (Map<String, String>) C2097908Jt.LIZJ(new Pair("is_related_friend_item", "1"))));
                    arrayList7.addAll(arrayList6);
                    InterfaceC1226510i1R interfaceC1226510i1R5 = c1227350i2n.LIZ.LL.LIZ;
                    if (interfaceC1226510i1R5 != null) {
                        interfaceC1226510i1R5.LJIILIIL(0, EnumC1226540i1U.TAB_KEY_FRIENDS.getValue(), arrayList7, new C1227370i2p(c1227350i2n));
                    }
                    c1227350i2n.LIZIZ(arrayList6.size(), c1224840hyk);
                    return;
                }
            }
            if (!arrayList6.isEmpty()) {
                return;
            }
            c1227350i2n.LIZIZ(0, c1224840hyk);
        }
    }
}
