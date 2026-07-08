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

/* JADX INFO: renamed from: X.0i1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226380i1E extends C1225970i0Z implements InterfaceC328360Cu2<IMContact> {
    public final EnumC1226540i1U LLILLL;
    public final AbstractC1225770i0F LLILZ;
    public final C1225430hzh LLILZIL;
    public C099F LLILZLL;
    public final C01GW LLIZ;
    public final C1226360i1C LLIZLLLIL;

    @Override // X.InterfaceC328360Cu2
    public final void tg2(List<IMContact> list, boolean z) {
    }

    @Override // X.InterfaceC328360Cu2
    public final void ug(Throwable th) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIL(X.InterfaceC1364105Vn<? super X.AbstractC1223670hwr> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1226390i1F
            if (r0 == 0) goto L22
            r5 = r7
            X.0i1F r5 = (X.C1226390i1F) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            X.0i1E r0 = r5.LL
            goto L6a
        L22:
            X.0i1F r5 = new X.0i1F
            r5.<init>(r6, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            X.099F r2 = r6.LLILZLL
            if (r2 == 0) goto L4a
            boolean r0 = r2.isActive()
            if (r0 != 0) goto L3e
            r2 = 0
        L3e:
            if (r2 == 0) goto L4a
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "refresh restart"
            r1.<init>(r0)
            r2.LIZIZ(r1)
        L4a:
            X.099F r1 = X.C090F.LIZIZ()
            r6.LLILZLL = r1
            X.01GW r0 = r6.LLIZ
            java.lang.Object r0 = r0.getValue()
            X.0ljk r0 = (X.InterfaceC1369300ljk) r0
            if (r0 == 0) goto L5d
            r0.LIZLLL()
        L5d:
            r5.LL = r6     // Catch: java.lang.Exception -> L79
            r5.LLILZ = r3     // Catch: java.lang.Exception -> L79
            java.lang.Object r1 = r1.LJLIIIL(r5)     // Catch: java.lang.Exception -> L79
            if (r1 != r4) goto L68
            return r4
        L68:
            r0 = r6
            goto L6d
        L6a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L79
        L6d:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L79
            java.util.List r0 = r0.LJJJJJ(r1)     // Catch: java.lang.Exception -> L79
            X.0hwq r1 = new X.0hwq     // Catch: java.lang.Exception -> L79
            r1.<init>(r0)     // Catch: java.lang.Exception -> L79
            return r1
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0hws r1 = new X.0hws
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1226380i1E.LJJIL(X.05Vn):java.lang.Object");
    }

    public final List<AbstractC1223800hx4> LJJJJJ(List<? extends IMContact> list) {
        String string;
        String strLIZIZ;
        ArrayList arrayList = new ArrayList();
        ArrayList<IMContact> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList<IMContact> arrayList4 = new ArrayList();
        for (IMContact iMContact : list) {
            if (hashSet.add(C1226680i1i.LJFF(iMContact))) {
                arrayList4.add(iMContact);
            }
        }
        for (IMContact iMContact2 : arrayList4) {
            if (iMContact2.getType() != 18 && !C1226680i1i.LJII(iMContact2)) {
                arrayList2.add(iMContact2);
            }
            if (iMContact2.getType() == 18 && !C1226680i1i.LJII(iMContact2)) {
                arrayList3.add(iMContact2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList3);
        Resources resources = this.LLILZ.LJJJJLL().LIZIZ().getResources();
        if (resources != null) {
            string = resources.getString(2131831591);
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj : arrayList5) {
            if (!C1226680i1i.LJI((IMContact) obj)) {
                arrayList6.add(obj);
            }
        }
        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList7.add(LJJJJIZL((IMContact) it2.next(), string, "suggested"));
        }
        arrayList.addAll(arrayList7);
        for (IMContact iMContact3 : arrayList2) {
            if (iMContact3 instanceof IMUser) {
                IMUser iMUser = (IMUser) iMContact3;
                IMFriendsService.LIZ.getClass();
                IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
                if (iMFriendsServiceLIZ == null || (strLIZIZ = iMFriendsServiceLIZ.LIZIZ(iMContact3.getUid(), iMContact3.getDisplayName())) == null) {
                    strLIZIZ = "";
                }
                iMUser.setInitialLetter(C1489370orP.LIZ(strLIZIZ));
            } else if (iMContact3 instanceof IMConversation) {
                IMConversation iMConversation = (IMConversation) iMContact3;
                iMConversation.setInitialLetter(C1489370orP.LIZ(iMConversation.getConversationName()));
            }
        }
        List listLJLLLL = C13LP.LJLLLL(this.LLIZLLLIL, arrayList2);
        ArrayList<IMContact> arrayList8 = new ArrayList();
        for (Object obj2 : listLJLLLL) {
            if (!C1226680i1i.LJI((IMContact) obj2)) {
                arrayList8.add(obj2);
            }
        }
        ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList8, 10));
        for (IMContact iMContact4 : arrayList8) {
            arrayList9.add(LJJJJIZL(iMContact4, C1226370i1D.LIZ(iMContact4), "a_to_z"));
        }
        arrayList.addAll(arrayList9);
        ArrayList arrayList10 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList) {
            Object obj4 = ((C1224840hyk) obj3).LLJI.get("index");
            Object arrayList11 = linkedHashMap.get(obj4);
            if (arrayList11 == null) {
                arrayList11 = new ArrayList();
                linkedHashMap.put(obj4, arrayList11);
            }
            ((List) arrayList11).add(obj3);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            arrayList10.add(new C1223790hx3(String.valueOf(key), (C1223780hx2) null, 6));
            arrayList10.addAll(collection);
        }
        return arrayList10;
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
    public C1226380i1E(AbstractC1225770i0F abstractC1225770i0F, C1225430hzh c1225430hzh) {
        super(c1225430hzh);
        EnumC1226540i1U enumC1226540i1U = EnumC1226540i1U.TAB_KEY_SELECT_CONVERSATION;
        this.LLILLL = enumC1226540i1U;
        this.LLILZ = abstractC1225770i0F;
        this.LLILZIL = c1225430hzh;
        this.LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1610));
        this.LLIZLLLIL = C1226360i1C.LL;
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
        C1224850hyl c1224850hyl = new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, this.LLILLL.getValue());
        EnumC1224830hyj enumC1224830hyj = EnumC1224830hyj.NORMAL;
        if (!(iMContact instanceof IMUser) && (iMContact instanceof IMConversation)) {
            str3 = "group";
        } else {
            str3 = "private";
        }
        UrlModel displayAvatar = iMContact.getDisplayAvatar();
        String strLIZ = C1226140i0q.LIZ(iMContact);
        String strLJFF = C1226680i1i.LJFF(iMContact);
        String quantityString = "";
        if (strLJFF == null) {
            strLJFF = "";
        }
        Context contextLIZIZ = this.LLILZ.LJJJJLL().LIZIZ();
        if (iMContact instanceof IMUser) {
            String uniqueId = ((IMUser) iMContact).getUniqueId();
            if (uniqueId != null) {
                quantityString = uniqueId;
            }
        } else if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            quantityString = contextLIZIZ.getResources().getQuantityString(2131755366, iMConversation.getConversationMemberCount(), Integer.valueOf(iMConversation.getConversationMemberCount()));
        }
        return new C1224840hyk(c1224850hyl, enumC1224830hyj, str3, strLJFF, displayAvatar, strLIZ, quantityString, true, true, C2097608Jq.LJIIIIZZ(new Pair("index", str), new Pair("index_tag", str2), new Pair("contact", iMContact), new Pair("template_key", this.LLILZ.LJJJJLL().LJIIJ()), new Pair("ext_enter_from", this.LLILZ.LJJJJLL().LJIIIZ().LIZJ()), new Pair("ext_enter_method", this.LLILZ.LJJJJLL().LJIIIZ().LIZLLL())), false, false, false, false, false, 17408);
    }
}
