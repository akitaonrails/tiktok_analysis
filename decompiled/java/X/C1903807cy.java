package X;

import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.07cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1903807cy {
    public static Request LIZ(Request request, Map map) {
        C0XMB c0xmbNewBuilder = request.newBuilder();
        ArrayList arrayList = new ArrayList();
        if (request.getHeaders() != null && (!request.getHeaders().isEmpty())) {
            request.getHeaders();
            arrayList.addAll(request.getHeaders());
        }
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
        }
        c0xmbNewBuilder.LIZJ = arrayList;
        return c0xmbNewBuilder.LIZ();
    }
}
