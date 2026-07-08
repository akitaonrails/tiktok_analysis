package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0WtT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837610WtT {
    public static Request LIZ(Request request, Map map) {
        C0X0X c0x0x = (C0X0X) request.getRequestBody();
        C837630WtV c837630WtV = new C837630WtV();
        int iLJI = c0x0x.LJI();
        for (int i = 0; i < iLJI; i++) {
            c837630WtV.LIZIZ(c0x0x.LJFF(i), (String) ListProtector.get(c0x0x.LIZIZ, i));
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c837630WtV.LIZ((String) entry.getKey(), (String) entry.getValue());
        }
        C0X0X c0x0xLIZJ = c837630WtV.LIZJ();
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZIZ(new C0XMH(c0x0xLIZJ), "POST");
        return c0xmbNewBuilder.LIZ();
    }

    public static Request LIZIZ(Request request, Map map) {
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(request.getUrl());
        if (c0xlqLJIIL != null) {
            Set<String> setLJIIZILJ = c0xlqLJIIL.LJIIZILJ();
            C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
            for (String str : setLJIIZILJ) {
                Iterator<String> it2 = c0xlqLJIIL.LJIJ(str).iterator();
                while (it2.hasNext()) {
                    c0xlpLJIIJ.LIZJ(str, it2.next());
                }
            }
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                c0xlpLJIIJ.LIZJ((String) entry.getKey(), (String) entry.getValue());
            }
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ(c0xlpLJIIJ.LIZLLL().LJIIIIZZ);
            return c0xmbNewBuilder.LIZ();
        }
        return request;
    }

    public static Request LIZJ(Request request, Map map) {
        C0XMB c0xmbNewBuilder = request.newBuilder();
        ArrayList arrayList = new ArrayList();
        if (request.getHeaders() != null && (!request.getHeaders().isEmpty())) {
            request.getHeaders();
            arrayList.addAll(request.getHeaders());
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
        }
        c0xmbNewBuilder.LIZJ = arrayList;
        return c0xmbNewBuilder.LIZ();
    }
}
