package com.bytedance.android.live.network;

import X.C080U;
import X.C09UD;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1904507d5;
import X.C501450JlX;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class ResponseInterceptor implements InterfaceC1904907d9 {
    public static ResponseInterceptor LIZ() {
        return new ResponseInterceptor();
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        if (C09UD.LIZJ(requestLIZ)) {
            LinkedList linkedList = new LinkedList(requestLIZ.getHeaders());
            linkedList.add(new C080U("response-format", "protobuf"));
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            c0xmbNewBuilder.LIZJ = linkedList;
            requestLIZ = c0xmbNewBuilder.LIZ();
        }
        Request requestLIZIZ = C1904507d5.LIZIZ(requestLIZ);
        C0X52 c0x52LIZ = c1494590ozp.LIZ(requestLIZIZ);
        C501450JlX.LIZIZ(requestLIZIZ, c0x52LIZ);
        return c0x52LIZ;
    }
}
