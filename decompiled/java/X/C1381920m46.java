package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0m46, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1381920m46 extends C1696260uF6 implements Function2<C1382130m4R<IMContact>, InterfaceC1364105Vn<? super Boolean>, Object>, InterfaceC842703Qz {
    public C1381920m46(Object obj) {
        super(2, obj, C1381910m45.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sharepanel/impl/relations/data/core/loader/CombinedLoader$InterceptPayload;)Z", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1382130m4R<IMContact> c1382130m4R, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        List<IMContact> listSubList;
        C1382130m4R<IMContact> c1382130m4R2 = c1382130m4R;
        C1381910m45 c1381910m45 = (C1381910m45) this.receiver;
        c1381910m45.getClass();
        boolean z = false;
        if (c1382130m4R2.LIZJ == c1381910m45.LLILZIL && c1382130m4R2.LIZIZ.size() > 15) {
            listSubList = c1382130m4R2.LIZIZ.subList(0, 15);
        } else {
            listSubList = c1382130m4R2.LIZIZ;
        }
        c1382130m4R2.LIZ.put(c1382130m4R2.LIZJ, listSubList);
        if (c1382130m4R2.LIZJ == c1381910m45.LLILZIL && (!listSubList.isEmpty())) {
            ((IMContact) ListProtector.get(listSubList, 0)).setType(2);
            c1381910m45.LLIZLLLIL = AbstractC1381820m3w.LJIIIIZZ(listSubList);
            z = true;
        } else {
            AbstractC328380Cu4<IMContact> abstractC328380Cu4 = c1382130m4R2.LIZJ;
            if (abstractC328380Cu4 == c1381910m45.LLJJI && ((C1382380m4q) abstractC328380Cu4).LJIIJ == 1 && (!listSubList.isEmpty())) {
                ((IMContact) ListProtector.get(listSubList, 0)).setType(3);
            }
        }
        return Boolean.valueOf(z);
    }
}
