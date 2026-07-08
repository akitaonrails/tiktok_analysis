package X;

import Y.AComparatorS40S0000000_21;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1367090lgB extends C1696260uF6 implements Function2<List<IMContact>, InterfaceC1364105Vn<? super List<IMContact>>, Object>, InterfaceC842703Qz {
    public C1367090lgB(Object obj) {
        super(2, obj, C1381860m40.class, "interceptFinish", "interceptFinish(Ljava/util/List;)Ljava/util/List;", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<IMContact> list, InterfaceC1364105Vn<? super List<IMContact>> interfaceC1364105Vn) throws Throwable {
        boolean z;
        ArrayList<IMContact> arrayList;
        boolean z2;
        boolean zLJFF;
        IMContact iMContact;
        C1157190gDd c1157190gDd;
        boolean z3;
        boolean z4;
        C796400VLy next;
        Long lValueOf;
        InterfaceC1367160lgI c1157190gDd2;
        List<IMContact> list2 = list;
        C1381860m40 c1381860m40 = (C1381860m40) this.receiver;
        C1231704rr c1231704rr = c1381860m40.LLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("interceptFinish, before list size=");
        sbLIZ.append(list2.size());
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        List listLIZ = C1345505Oj.LIZ(null, list2);
        C1231704rr c1231704rr2 = c1381860m40.LLJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("filterOutMAFDuplicateList size ");
        ArrayList arrayList2 = (ArrayList) listLIZ;
        sbLIZ2.append(arrayList2.size());
        C2188811AlT.LIZIZ(sbLIZ2);
        c1231704rr2.LIZIZ();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean z5 = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            IMContact iMContact2 = (IMContact) next2;
            if (iMContact2 instanceof IMConversation) {
                IMConversation iMConversation = (IMConversation) iMContact2;
                if (iMConversation.getConversationType() == AbstractC1711506n3.LIZIZ) {
                    String conversationId = iMConversation.getConversationId();
                    if (conversationId != null ? !C0ZNY.LIZ.LIZLLL(conversationId, true) : false) {
                        z5 = true;
                    }
                }
            }
            if (!z5) {
                arrayList3.add(next2);
            }
        }
        ArrayList<IMContact> arrayList4 = new ArrayList(arrayList3);
        C1231704rr c1231704rr3 = c1381860m40.LLJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("filterOutInvalidGroupChatList size ");
        sbLIZ3.append(arrayList4.size());
        C2188811AlT.LIZIZ(sbLIZ3);
        c1231704rr3.LIZIZ();
        ArrayList<String> arrayList5 = C805520Vio.LIZ;
        C805520Vio c805520VioLIZ = C805530Vip.LIZ();
        c805520VioLIZ.getClass();
        C0I0B.LJFF.LIZJ();
        InterfaceC805460Vii interfaceC805460ViiLIZ = C797560VQk.LIZIZ(C894660Z7w.LIZ()).LIZ();
        String strLIZ = C805520Vio.LIZ();
        c805520VioLIZ.LJ();
        C1367000lg2.LIZ.getClass();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_share_panel_usability_improvement", true) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j = 0;
        if (z) {
            ArrayList<IMContact> arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList4);
            boolean zLIZ = C1367000lg2.LIZ();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C23250099c.LJ(C23271099x.INSTANCE, new C805540Viq(linkedHashSet, c805520VioLIZ, null));
            List<C796400VLy> listLJIIIZ = interfaceC805460ViiLIZ.LJIIIZ(strLIZ);
            for (IMContact iMContact3 : arrayList6) {
                if (linkedHashSet.contains(C805520Vio.LIZIZ(iMContact3))) {
                    iMContact3.setInfo(C1367140lgG.LIZ(iMContact3.getInfo(), null, true, null, null, null, false, null, 125));
                    z4 = true;
                } else {
                    z4 = false;
                }
                Iterator<C796400VLy> it3 = listLJIIIZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.LIZIZ, C805520Vio.LIZIZ(iMContact3))) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C796400VLy c796400VLy = next;
                if (c796400VLy != null) {
                    lValueOf = Long.valueOf(c796400VLy.LJ);
                } else {
                    lValueOf = null;
                }
                C1367140lgG info = iMContact3.getInfo();
                if (lValueOf == null || lValueOf.longValue() <= j || (!zLIZ && z4)) {
                    c1157190gDd2 = C1367070lg9.LIZ;
                } else {
                    c1157190gDd2 = new C1157190gDd(lValueOf.longValue());
                }
                iMContact3.setInfo(C1367140lgG.LIZ(info, null, false, null, c1157190gDd2, null, false, null, 119));
                j = 0;
            }
            arrayList = new ArrayList();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("2. recent send: current size=");
            sbLIZ4.append(arrayList6.size());
            C2188811AlT.LIZIZ(sbLIZ4);
            ArrayList arrayList7 = new ArrayList();
            for (Object obj : arrayList6) {
                IMContact iMContact4 = (IMContact) obj;
                if ((iMContact4.getInfo().LIZLLL instanceof C1157190gDd) && (zLIZ || !iMContact4.getInfo().LIZIZ)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    arrayList7.add(obj);
                }
            }
            ArrayList arrayList8 = new ArrayList(arrayList7);
            if (arrayList8.size() > 1) {
                C08XD.LJJ(arrayList8, new AComparatorS40S0000000_21(0));
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("2. recent send: size=");
            sbLIZ5.append(arrayList8.size());
            sbLIZ5.append(", limit=");
            C1367000lg2.LIZ.getClass();
            sbLIZ5.append(C1367000lg2.LIZJ());
            C2188811AlT.LIZIZ(sbLIZ5);
            while ((!arrayList8.isEmpty()) && (iMContact = (IMContact) C13LP.LJJLIIIJL(arrayList8)) != null) {
                InterfaceC1367160lgI interfaceC1367160lgI = iMContact.getInfo().LIZLLL;
                if (interfaceC1367160lgI instanceof C1157190gDd) {
                    c1157190gDd = (C1157190gDd) interfaceC1367160lgI;
                } else {
                    c1157190gDd = null;
                }
                if (c1157190gDd == null) {
                    break;
                }
                long j2 = c1157190gDd.LIZ;
                C1367000lg2.LIZ.getClass();
                if (j2 >= C1367000lg2.LIZIZ()) {
                    break;
                }
                interfaceC805460ViiLIZ.LJ(strLIZ, C805520Vio.LIZIZ(iMContact));
                iMContact.setInfo(C1367140lgG.LIZ(iMContact.getInfo(), null, false, new InterfaceC1367040lg6() { // from class: X.0lgK
                }, null, null, false, null, 123));
                C19719612Di.LJJIJ(arrayList8);
            }
            arrayList8.size();
            ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList8, 10));
            Iterator it4 = arrayList8.iterator();
            while (it4.hasNext()) {
                arrayList9.add(C805520Vio.LIZIZ((IMContact) it4.next()));
            }
            HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList9);
            int i = 0;
            for (Object obj2 : arrayList8) {
                final int i2 = i + 1;
                if (i >= 0) {
                    IMContact iMContact5 = (IMContact) obj2;
                    iMContact5.setInfo(C1367140lgG.LIZ(iMContact5.getInfo(), null, false, null, null, new InterfaceC1367150lgH(i2) { // from class: X.0Uxi
                        public final int LIZ;

                        public final boolean equals(Object obj3) {
                            if (this == obj3) {
                                return true;
                            }
                            return (obj3 instanceof C789280Uxi) && this.LIZ == ((C789280Uxi) obj3).LIZ;
                        }

                        public final int hashCode() {
                            return this.LIZ;
                        }

                        public final String toString() {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("RecentSend(rank=");
                            sbLIZ6.append(this.LIZ);
                            sbLIZ6.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ6);
                        }

                        {
                            this.LIZ = i2;
                        }
                    }, false, null, 111));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            arrayList.addAll(arrayList8);
            arrayList8.clear();
            ArrayList arrayList10 = new ArrayList();
            for (Object obj3 : arrayList6) {
                if (!hashSetLLIFFJFJJ.contains(C805520Vio.LIZIZ((IMContact) obj3))) {
                    arrayList10.add(obj3);
                }
            }
            ArrayList<IMContact> arrayList11 = new ArrayList(arrayList10);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("3. final: remaining size=");
            sbLIZ6.append(arrayList11.size());
            C2188811AlT.LIZIZ(sbLIZ6);
            for (IMContact iMContact6 : arrayList11) {
                iMContact6.setInfo(C1367140lgG.LIZ(iMContact6.getInfo(), null, false, null, null, new InterfaceC1367150lgH() { // from class: X.0lgM
                }, false, null, 111));
            }
            arrayList.addAll(arrayList11);
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList4);
            for (IMContact iMContact7 : arrayList) {
                iMContact7.setInfo(C1367140lgG.LIZ(iMContact7.getInfo(), null, false, C1367080lgA.LIZ, C1367070lg9.LIZ, new InterfaceC1367150lgH() { // from class: X.0lgM
                }, false, null, 97));
            }
            LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet();
            ArrayList arrayList12 = new ArrayList();
            ArrayList<String> arrayList13 = C805520Vio.LIZJ;
            arrayList12.addAll(arrayList13);
            linkedHashSet2.addAll(arrayList13);
            ArrayList arrayList14 = new ArrayList();
            synchronized (c805520VioLIZ) {
                try {
                    for (String str : linkedHashSet2) {
                        for (IMContact iMContact8 : arrayList4) {
                            if (C805520Vio.LIZJ(iMContact8, str)) {
                                arrayList14.add(iMContact8);
                                arrayList.remove(iMContact8);
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!arrayList14.isEmpty()) {
                arrayList.addAll(0, arrayList14);
            }
            for (IMContact iMContact9 : arrayList) {
                Iterator it5 = arrayList12.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        if (C805520Vio.LIZJ(iMContact9, (String) it5.next())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    iMContact9.setInfo(C1367140lgG.LIZ(iMContact9.getInfo(), null, false, null, new C1157190gDd(0L), null, false, null, 119));
                }
            }
        }
        ArrayList arrayList15 = new ArrayList(arrayList);
        C1231704rr c1231704rr4 = c1381860m40.LLJ;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("recent share sort size ");
        sbLIZ7.append(arrayList15.size());
        C2188811AlT.LIZIZ(sbLIZ7);
        c1231704rr4.LIZIZ();
        ArrayList arrayList16 = new ArrayList();
        for (Object obj4 : arrayList15) {
            BaseContact baseContact = (BaseContact) obj4;
            if (baseContact instanceof IMUser) {
                zLJFF = Intrinsics.LJFF(baseContact.getUid(), c1381860m40.LLJIJIL);
            } else {
                zLJFF = false;
            }
            if (!zLJFF) {
                arrayList16.add(obj4);
            }
        }
        C1231704rr c1231704rr5 = c1381860m40.LLJ;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("interceptFinish, after list size=");
        sbLIZ8.append(arrayList15.size());
        C2188811AlT.LIZIZ(sbLIZ8);
        c1231704rr5.LIZIZ();
        return new ArrayList(arrayList16);
    }
}
