package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0m41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1381870m41 extends C1696260uF6 implements Function2<C1382130m4R<IMContact>, InterfaceC1364105Vn<? super Boolean>, Object>, InterfaceC842703Qz {
    public C1381870m41(Object obj) {
        super(2, obj, C1381880m42.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sharepanel/impl/relations/data/core/loader/CombinedLoader$InterceptPayload;)Z", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1382130m4R<IMContact> c1382130m4R, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C1382130m4R<IMContact> c1382130m4R2 = c1382130m4R;
        C1381880m42 c1381880m42 = (C1381880m42) this.receiver;
        c1381880m42.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("intercept begin list: ");
        sbLIZ.append(c1382130m4R2.LIZIZ.size());
        sbLIZ.append(" map: ");
        sbLIZ.append(c1382130m4R2.LIZ.size());
        C2188811AlT.LIZIZ(sbLIZ);
        c1382130m4R2.LIZ.put(c1382130m4R2.LIZJ, c1382130m4R2.LIZIZ);
        if (c1382130m4R2.LIZJ == c1381880m42.LLILZIL) {
            c1381880m42.LLIZLLLIL = AbstractC1381820m3w.LJIIIIZZ(c1382130m4R2.LIZIZ);
        }
        Iterator<T> it2 = c1382130m4R2.LIZ.values().iterator();
        boolean z = false;
        int size = 0;
        while (it2.hasNext()) {
            size += ((List) it2.next()).size();
        }
        if (size <= c1381880m42.LLJ) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
