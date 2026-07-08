package X;

import Y.AComparatorS501S0100000_2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1381800m3u extends C2217421BqW implements Function2<C1382130m4R<IMContact>, InterfaceC1364105Vn<? super Boolean>, Object>, InterfaceC842703Qz {
    public C1381800m3u(Object obj) {
        super(2, obj, C1381810m3v.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sharepanel/impl/relations/data/core/loader/CombinedLoader$InterceptPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1382130m4R<IMContact> c1382130m4R, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean z;
        Map<String, SocialAffinityItem> mapLIZIZ;
        List<IMContact> listSubList;
        C1382130m4R<IMContact> c1382130m4R2 = c1382130m4R;
        C1381810m3v c1381810m3v = (C1381810m3v) this.receiver;
        c1381810m3v.getClass();
        AbstractC328380Cu4<IMContact> abstractC328380Cu4 = c1382130m4R2.LIZJ;
        boolean z2 = true;
        if (abstractC328380Cu4 == c1381810m3v.LLILZIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start interceptRecent, recentList size: ");
            sbLIZ.append(c1382130m4R2.LIZIZ.size());
            C2188811AlT.LIZIZ(sbLIZ);
            int size = c1382130m4R2.LIZIZ.size();
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    ((IMContact) ListProtector.get(c1382130m4R2.LIZIZ, i)).setType(2);
                } else {
                    ((IMContact) ListProtector.get(c1382130m4R2.LIZIZ, i)).setType(1);
                    if (i < 5) {
                    }
                }
                ((IMContact) ListProtector.get(c1382130m4R2.LIZIZ, i)).setRecentTop5Contact(1);
            }
            LinkedHashMap<AbstractC328380Cu4<IMContact>, List<IMContact>> linkedHashMap = c1382130m4R2.LIZ;
            AbstractC328380Cu4<IMContact> abstractC328380Cu42 = c1382130m4R2.LIZJ;
            int size2 = c1382130m4R2.LIZIZ.size();
            int i2 = c1381810m3v.LL.LJJIIJ;
            if (size2 > i2) {
                listSubList = c1382130m4R2.LIZIZ.subList(0, i2);
            } else {
                listSubList = c1382130m4R2.LIZIZ;
            }
            linkedHashMap.put(abstractC328380Cu42, listSubList);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("end interceptRecent, recentList size: ");
            sbLIZ2.append(c1382130m4R2.LIZIZ.size());
            C2188811AlT.LIZIZ(sbLIZ2);
            ((ArrayList) c1381810m3v.LLJJIJIL).clear();
        } else if (Intrinsics.LJFF(abstractC328380Cu4, c1381810m3v.LLJJJIL.getValue())) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("start interceptMAF, mafList size: ");
            sbLIZ3.append(c1382130m4R2.LIZIZ.size());
            C2188811AlT.LIZIZ(sbLIZ3);
            int size3 = c1382130m4R2.LIZIZ.size();
            for (int i3 = 0; i3 < size3; i3++) {
                IMUser iMUser = (IMUser) ListProtector.get(c1382130m4R2.LIZIZ, i3);
                if (c1381810m3v.LL.LJJIIZI) {
                    if (iMUser.getShareStatus() != 2) {
                        arrayList.add(iMUser);
                        iMUser.setType(16);
                    }
                } else if (iMUser.getShareStatus() == 1) {
                    arrayList.add(iMUser);
                    iMUser.setType(16);
                }
            }
            if (arrayList.size() > 0) {
                if (c1381810m3v.LL.LJJIJ && (mapLIZIZ = C1610960s1W.LIZIZ.LIZIZ("share_more")) != null && arrayList.size() > 1) {
                    C08XD.LJJ(arrayList, new AComparatorS501S0100000_2(mapLIZIZ, 10));
                }
                ((IMContact) ListProtector.get(arrayList, 0)).setType(17);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("end interceptMAF, mafList size: ");
            sbLIZ4.append(c1382130m4R2.LIZIZ.size());
            C2188811AlT.LIZIZ(sbLIZ4);
            c1382130m4R2.LIZ.put(c1382130m4R2.LIZJ, arrayList);
        } else if (Intrinsics.LJFF(c1382130m4R2.LIZJ, c1381810m3v.LLJJJJ.getValue())) {
            List<IMContact> list = c1382130m4R2.LIZIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<IMContact> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setType(18);
                arrayList2.add(Unit.LIZ);
            }
            c1382130m4R2.LIZ.put(c1382130m4R2.LIZJ, c1382130m4R2.LIZIZ);
        } else {
            int i4 = c1381810m3v.LL.LIZ;
            if (i4 != 1 && i4 != 2 && i4 != 3) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                List<IMContact> list2 = c1382130m4R2.LIZ.get(c1381810m3v.LLILZIL);
                if (list2 != null && !list2.isEmpty()) {
                    c1381810m3v.LJIILIIL().add("recent");
                    c1381810m3v.LJIIL().add(Integer.valueOf(list2.size()));
                }
                ArrayList arrayList3 = new ArrayList();
                List<IMContact> listLJIILLIIL = C1381810m3v.LJIILLIIL(c1382130m4R2.LIZIZ);
                ArrayList arrayList4 = (ArrayList) listLJIILLIIL;
                if (!arrayList4.isEmpty()) {
                    if (c1381810m3v.LL.LIZIZ) {
                        c1381810m3v.LJIIZILJ(listLJIILLIIL);
                    } else {
                        c1381810m3v.LJIILIIL().add("Friend");
                        c1381810m3v.LJIIL().add(Integer.valueOf(arrayList4.size()));
                    }
                    arrayList3.addAll(listLJIILLIIL);
                }
                if (!c1381810m3v.LL.LIZIZ && (!c1382130m4R2.LIZIZ.isEmpty())) {
                    c1381810m3v.LJIIZILJ(c1382130m4R2.LIZIZ);
                    arrayList3.addAll(c1382130m4R2.LIZIZ);
                }
                c1382130m4R2.LIZ.put(c1382130m4R2.LIZJ, arrayList3);
            } else {
                ArrayList arrayList5 = new ArrayList();
                List listLJIILLIIL2 = C1381810m3v.LJIILLIIL(c1382130m4R2.LIZIZ);
                ArrayList arrayList6 = (ArrayList) listLJIILLIIL2;
                if (!arrayList6.isEmpty()) {
                    c1381810m3v.LJIILIIL().add("Friend");
                    c1381810m3v.LJIIL().add(Integer.valueOf(arrayList6.size()));
                    arrayList5.addAll(listLJIILLIIL2);
                }
                if (!c1381810m3v.LL.LIZIZ && (!c1382130m4R2.LIZIZ.isEmpty())) {
                    c1381810m3v.LJIIZILJ(c1382130m4R2.LIZIZ);
                    arrayList5.addAll(c1382130m4R2.LIZIZ);
                }
                c1382130m4R2.LIZ.put(c1382130m4R2.LIZJ, arrayList5);
            }
            if (Intrinsics.LJFF(c1382130m4R2.LIZJ, c1381810m3v.LLJJJ) || Intrinsics.LJFF(c1382130m4R2.LIZJ, c1381810m3v.LLJJIJI)) {
                z2 = false;
            }
        }
        return Boolean.valueOf(z2);
    }
}
