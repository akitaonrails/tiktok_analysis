package X;

import com.bytedance.iap.core.model.IAPQueryRequest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0wai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786540wai implements InterfaceC560980LzM<IAPQueryRequest, IAPQueryRequest> {
    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "validate_query_input";
    }

    @Override // X.InterfaceC560980LzM
    public final Object LIZ(IAPQueryRequest iAPQueryRequest, InterfaceC1364105Vn<? super IAPQueryRequest> interfaceC1364105Vn) {
        IAPQueryRequest iAPQueryRequest2 = iAPQueryRequest;
        List<String> list = iAPQueryRequest2.productIds;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.length() != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            return iAPQueryRequest2;
        }
        throw new IllegalArgumentException("query request invalid");
    }
}
