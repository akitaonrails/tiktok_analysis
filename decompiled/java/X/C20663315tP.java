package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.15tP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20663315tP {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C20663215tO());

    public static boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        InterfaceC20663415tQ interfaceC20663415tQ;
        int i2;
        if (innerPushMessage == null || (uiTemplate = innerPushMessage.getUiTemplate()) == null || (interfaceC20663415tQ = (InterfaceC20663415tQ) ((ConcurrentHashMap) LIZ.getValue()).get(Integer.valueOf(i))) == null) {
            return false;
        }
        if (i != 1) {
            if (i != 3) {
                return false;
            }
            i2 = uiTemplate.rightType;
            interfaceC20663415tQ.LIZJ();
            if (C13LQ.LJJIJ(uiTemplate.rightType, C0ZF6.LIZIZ) < 0) {
                return false;
            }
        } else {
            i2 = uiTemplate.leftType;
            interfaceC20663415tQ.LIZJ();
            if (C13LQ.LJJIJ(uiTemplate.leftType, C0ZF6.LIZIZ) < 0) {
                return false;
            }
        }
        return interfaceC20663415tQ.LIZ(i2, innerPushMessage);
    }
}
