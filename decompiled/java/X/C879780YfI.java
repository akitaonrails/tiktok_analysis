package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879780YfI implements InterfaceC879790YfJ {
    public final String LIZ = "ChatListConversationFilter";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC879790YfJ
    public final C880700Ygm LIZ(Collection<? extends C879540Yeu<?>> collection, InterfaceC879770YfH interfaceC879770YfH, String str) {
        C0Y8T c0y8t;
        Object obj;
        IMUser iMUser;
        Object obj2;
        C880150Yft c880150Yft;
        if (!(interfaceC879770YfH instanceof C879760YfG)) {
            return new C880700Ygm(collection, C13BV.INSTANCE);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collection) {
            C879540Yeu c879540Yeu = (C879540Yeu) obj3;
            Object obj4 = c879540Yeu.LIZ;
            if (obj4 instanceof InterfaceC1606206Qq) {
                C880490YgR c880490YgR = ((C879760YfG) interfaceC879770YfH).LIZIZ;
                c880490YgR.getClass();
                T t = c879540Yeu.LIZJ;
                String uid = null;
                if ((t instanceof C0Y8T) && (c0y8t = (C0Y8T) t) != null) {
                    C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
                    if (c1490405sU != null) {
                        obj = c1490405sU.LIZIZ;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof IMUser) {
                        iMUser = (IMUser) obj;
                    } else {
                        iMUser = null;
                    }
                    C1490405sU<?> c1490405sU2 = c879540Yeu.LIZLLL.get(C879970Yfb.LIZ);
                    if (c1490405sU2 != null) {
                        obj2 = c1490405sU2.LIZIZ;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof C880150Yft) {
                        c880150Yft = (C880150Yft) obj2;
                    } else {
                        c880150Yft = null;
                    }
                    Set<EnumC880480YgQ> set = C880490YgR.LLILLL;
                    FilterTabType filterTabType = c880490YgR.LL;
                    Set<EnumC880480YgQ> set2 = c880490YgR.LLILLJJLI;
                    if (iMUser != null) {
                        uid = iMUser.getUid();
                    }
                    if (C880370YgF.LIZ(filterTabType, set2, c0y8t, iMUser, uid, c880150Yft)) {
                        arrayList.add(obj3);
                    }
                }
                arrayList2.add(obj3);
            } else {
                if (Intrinsics.LJFF(obj4, C878910Ydt.INSTANCE)) {
                    C881500Yi4 c881500Yi4 = AbstractC883730Ylf.LJIIIIZZ;
                    C880490YgR c880490YgR2 = ((C879760YfG) interfaceC879770YfH).LIZIZ;
                    FilterTabType filterTabType2 = c880490YgR2.LL;
                    Set<EnumC880480YgQ> set3 = c880490YgR2.LLILLJJLI;
                    c881500Yi4.getClass();
                    if (filterTabType2 == C19212010Ec.LIZJ.LJJIJIL() && Intrinsics.LJFF(set3, C881500Yi4.LIZLLL().LLILZ)) {
                        arrayList.add(obj3);
                    }
                }
                arrayList2.add(obj3);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.getFirst();
        List list2 = (List) pair.getSecond();
        String str2 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("filterWrapper acceptedSize=");
        sbLIZ.append(list.size());
        sbLIZ.append(", removedSize=");
        sbLIZ.append(list2.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        return new C880700Ygm(list, list2);
    }
}
