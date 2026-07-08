package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1381830m3x extends C1696260uF6 implements Function2<C1382130m4R<IMContact>, InterfaceC1364105Vn<? super Boolean>, Object>, InterfaceC842703Qz {
    public C1381830m3x(Object obj) {
        super(2, obj, C1381840m3y.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sharepanel/impl/relations/data/core/loader/CombinedLoader$InterceptPayload;)Z", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1382130m4R<IMContact> c1382130m4R, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        EnumC1381990m4D enumC1381990m4D;
        ArrayList arrayList;
        C1382130m4R<IMContact> c1382130m4R2 = c1382130m4R;
        C1381840m3y c1381840m3y = (C1381840m3y) this.receiver;
        c1381840m3y.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("intercept begin list: ");
        sbLIZ.append(c1382130m4R2.LIZIZ.size());
        sbLIZ.append(" map: ");
        sbLIZ.append(c1382130m4R2.LIZ.size());
        C2188811AlT.LIZIZ(sbLIZ);
        c1382130m4R2.LIZ.put(c1382130m4R2.LIZJ, c1382130m4R2.LIZIZ);
        AbstractC328380Cu4<IMContact> abstractC328380Cu4 = c1382130m4R2.LIZJ;
        if (abstractC328380Cu4 == c1381840m3y.LLILZIL) {
            enumC1381990m4D = EnumC1381990m4D.RECENT_CHAT;
        } else if (abstractC328380Cu4 == c1381840m3y.LLILZLL) {
            enumC1381990m4D = EnumC1381990m4D.MUF;
        } else if (abstractC328380Cu4 == c1381840m3y.LLIZ) {
            enumC1381990m4D = EnumC1381990m4D.ME_FOLLOWING;
        } else if (abstractC328380Cu4 == c1381840m3y.LLJJ.getValue()) {
            enumC1381990m4D = EnumC1381990m4D.MAF;
        } else {
            enumC1381990m4D = EnumC1381990m4D.UNKNOWN;
        }
        for (IMContact iMContact : c1382130m4R2.LIZIZ) {
            iMContact.setInfo(C1367140lgG.LIZ(iMContact.getInfo(), enumC1381990m4D, false, null, null, null, false, null, 126));
        }
        c1381840m3y.LLJIJIL.addAll(AbstractC1381820m3w.LJIIIIZZ(c1382130m4R2.LIZIZ));
        AbstractC328380Cu4<IMContact> abstractC328380Cu42 = c1382130m4R2.LIZJ;
        if (abstractC328380Cu42 == c1381840m3y.LLILZIL) {
            c1381840m3y.LLIZLLLIL = AbstractC1381820m3w.LJIIIIZZ(c1382130m4R2.LIZIZ);
            List<String> list = c1381840m3y.LLJI;
            List<String> list2 = c1381840m3y.LLIZLLLIL;
            if (list2 != null) {
                arrayList = new ArrayList(list2);
            } else {
                arrayList = new ArrayList();
            }
            ((ArrayList) list).addAll(arrayList);
        } else if (Intrinsics.LJFF(abstractC328380Cu42, c1381840m3y.LLJJ.getValue())) {
            ArrayList arrayList2 = new ArrayList();
            int size = c1382130m4R2.LIZIZ.size();
            for (int i = 0; i < size; i++) {
                IMUser iMUser = (IMUser) ListProtector.get(c1382130m4R2.LIZIZ, i);
                if (iMUser.getShareStatus() == 1) {
                    arrayList2.add(iMUser);
                }
            }
            c1382130m4R2.LIZ.put(c1382130m4R2.LIZJ, arrayList2);
        }
        List<IMContact> list3 = c1382130m4R2.LIZIZ;
        Iterator<IMContact> it2 = list3.subList(0, Math.min(list3.size(), 5)).iterator();
        while (it2.hasNext()) {
            it2.next().setRecentTop5Contact(1);
        }
        return true;
    }
}
