package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0i20, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226860i20 extends C1225970i0Z implements InterfaceC328360Cu2<IMContact> {
    public final EnumC1226540i1U LLILLL;
    public final AbstractC1225770i0F LLILZ;
    public final C1225890i0R LLILZIL;
    public C099F LLILZLL;
    public C099F LLIZ;
    public final C01GW LLIZLLLIL;
    public final C1226880i22 LLJ;

    @Override // X.InterfaceC328360Cu2
    public final void tg2(List<IMContact> list, boolean z) {
    }

    @Override // X.InterfaceC328360Cu2
    public final void ug(Throwable th) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIL(X.InterfaceC1364105Vn<? super X.AbstractC1223670hwr> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1226860i20.LJJIL(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC328360Cu2
    public final void WD2(Throwable th) {
        C099F c099f = this.LLILZLL;
        if (c099f != null && !c099f.isCompleted()) {
            c099f.LJJJJJ(th);
            this.LLILZLL = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226860i20(AbstractC1225770i0F abstractC1225770i0F, C1225890i0R c1225890i0R) {
        super(c1225890i0R);
        EnumC1226540i1U enumC1226540i1U = EnumC1226540i1U.TAB_KEY_ALL_FOR_LIVE;
        this.LLILLL = enumC1226540i1U;
        this.LLILZ = abstractC1225770i0F;
        this.LLILZIL = c1225890i0R;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1674));
        this.LLJ = C1226880i22.LL;
    }

    public final List<AbstractC1223800hx4> LJJJJJ(List<? extends IMContact> list, List<? extends IMContact> list2) {
        String string;
        String strLIZIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        ArrayList arrayList2 = new ArrayList();
        ArrayList<IMContact> arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList<IMContact> arrayList5 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(C1226680i1i.LJFF((IMContact) obj))) {
                arrayList5.add(obj);
            }
        }
        for (IMContact iMContact : arrayList5) {
            if (iMContact.getType() != 18 && !C1226680i1i.LJII(iMContact)) {
                arrayList3.add(iMContact);
            }
            if (iMContact.getType() == 18 && !C1226680i1i.LJII(iMContact)) {
                arrayList4.add(iMContact);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        arrayList6.addAll(arrayList4);
        Resources resources = this.LLILZ.LJJJJLL().LIZIZ().getResources();
        if (resources == null || (string = resources.getString(2131831591)) == null) {
            string = "";
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj2 : arrayList6) {
            if (!C1226680i1i.LJI((IMContact) obj2)) {
                arrayList7.add(obj2);
            }
        }
        ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(arrayList7, 10));
        Iterator it2 = arrayList7.iterator();
        while (it2.hasNext()) {
            arrayList8.add(LJJJJIZL((IMContact) it2.next(), string, "suggested"));
        }
        arrayList2.addAll(arrayList8);
        for (IMContact iMContact2 : arrayList3) {
            if (iMContact2 instanceof IMUser) {
                IMUser iMUser = (IMUser) iMContact2;
                IMFriendsService.LIZ.getClass();
                IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
                if (iMFriendsServiceLIZ != null) {
                    strLIZIZ = iMFriendsServiceLIZ.LIZIZ(iMContact2.getUid(), iMContact2.getDisplayName());
                } else {
                    strLIZIZ = null;
                }
                iMUser.setInitialLetter(C1489370orP.LIZ(C1489370orP.LIZ(strLIZIZ)));
            } else if (iMContact2 instanceof IMConversation) {
                IMConversation iMConversation = (IMConversation) iMContact2;
                iMConversation.setInitialLetter(C1489370orP.LIZ(iMConversation.getConversationName()));
            }
        }
        List listLJLLLL = C13LP.LJLLLL(this.LLJ, arrayList3);
        ArrayList<IMContact> arrayList9 = new ArrayList();
        for (Object obj3 : listLJLLLL) {
            if (!C1226680i1i.LJI((IMContact) obj3)) {
                arrayList9.add(obj3);
            }
        }
        ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(arrayList9, 10));
        for (IMContact iMContact3 : arrayList9) {
            arrayList10.add(LJJJJIZL(iMContact3, C1226910i25.LIZLLL(iMContact3), "a_to_z"));
        }
        arrayList2.addAll(arrayList10);
        ArrayList arrayList11 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj4 : arrayList2) {
            Object obj5 = ((C1224840hyk) obj4).LLJI.get("index");
            Object arrayList12 = linkedHashMap.get(obj5);
            if (arrayList12 == null) {
                arrayList12 = new ArrayList();
                linkedHashMap.put(obj5, arrayList12);
            }
            ((List) arrayList12).add(obj4);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            arrayList11.add(new C1223790hx3(String.valueOf(key), (C1223780hx2) null, 6));
            arrayList11.addAll(collection);
        }
        return arrayList11;
    }

    @Override // X.InterfaceC328360Cu2
    public final void r61(List<IMContact> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : list) {
            IMContact iMContact2 = iMContact;
            if (!(iMContact2 instanceof IMUser) || !C1226680i1i.LJII(iMContact2)) {
                arrayList.add(iMContact);
            }
        }
        C099F c099f = this.LLILZLL;
        if (c099f != null) {
            c099f.LJJLIIIJILLIZJL(arrayList);
        }
        this.LLILZLL = null;
    }

    public final C1224840hyk LJJJJIZL(IMContact iMContact, String str, String str2) {
        String str3;
        String quantityString;
        C1224850hyl c1224850hyl = new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, this.LLILLL.getValue());
        EnumC1224830hyj enumC1224830hyj = EnumC1224830hyj.NORMAL;
        if (!(iMContact instanceof IMUser) && (iMContact instanceof IMConversation)) {
            str3 = "group";
        } else {
            str3 = "private";
        }
        UrlModel displayAvatar = iMContact.getDisplayAvatar();
        String strLIZ = C1226910i25.LIZ(iMContact);
        String strLJFF = C1226680i1i.LJFF(iMContact);
        String str4 = "";
        if (strLJFF == null) {
            strLJFF = "";
        }
        Context contextLIZIZ = this.LLILZ.LJJJJLL().LIZIZ();
        if (iMContact instanceof IMUser) {
            quantityString = ((IMUser) iMContact).getUniqueId();
            if (quantityString != null) {
                str4 = quantityString;
            }
        } else if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            quantityString = contextLIZIZ.getResources().getQuantityString(2131755366, iMConversation.getConversationMemberCount(), Integer.valueOf(iMConversation.getConversationMemberCount()));
            str4 = quantityString;
        }
        return new C1224840hyk(c1224850hyl, enumC1224830hyj, str3, strLJFF, displayAvatar, strLIZ, str4, true, true, C2097608Jq.LJIIIIZZ(new Pair("index", str), new Pair("index_tag", str2), new Pair("contact", iMContact), new Pair("template_key", this.LLILZ.LJJJJLL().LJIIJ()), new Pair("ext_enter_from", this.LLILZ.LJJJJLL().LJIIIZ().LIZJ()), new Pair("ext_enter_method", this.LLILZ.LJJJJLL().LJIIIZ().LIZLLL())), C13LP.LJJJJ(C1226680i1i.LJFF(iMContact), this.LLILZIL.LJII), false, false, false, false, 17408);
    }
}
