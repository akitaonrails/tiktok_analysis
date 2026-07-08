package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0YHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871610YHf extends AbstractC880230Yg1 {
    public final C0YHX LIZIZ;
    public final Map<String, Integer> LIZJ = new ConcurrentHashMap();
    public final InterfaceC871620YHg LIZLLL;

    @Override // X.AbstractC880230Yg1
    public final int LIZ() {
        return this.LIZLLL.LIZ();
    }

    public C871610YHf(C0YHX c0yhx) {
        this.LIZIZ = c0yhx;
        this.LIZLLL = c0yhx.LJIILL();
        final InterfaceC871620YHg interfaceC871620YHgLJIILL = c0yhx.LJIILL();
        new C2217401BqU(interfaceC871620YHgLJIILL) { // from class: X.0YHh
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((InterfaceC871620YHg) this.receiver).LIZJ();
            }
        };
        final InterfaceC871620YHg interfaceC871620YHgLJIILL2 = c0yhx.LJIILL();
        new C2217401BqU(interfaceC871620YHgLJIILL2) { // from class: X.0YHi
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((InterfaceC871620YHg) this.receiver).LIZIZ();
            }
        };
    }

    @Override // X.AbstractC880230Yg1
    public final void LIZIZ(int i, String str) {
        CoroutineContext coroutineContext;
        boolean zLJI = MethodIDManager.LJI(137694);
        Integer num = (Integer) ((ConcurrentHashMap) this.LIZJ).get(str);
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unread count was=");
        sbLIZ.append(num);
        sbLIZ.append(", new unread=");
        sbLIZ.append(i);
        C882690Yjz.LJIIIZ("UnreadCountModelImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (ChatRoomAdaptiveRequestManager.LIZ.LJLJLJ()) {
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("UnreadCountModelImpl", "unread count skipped due to poor network");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (num == null || num.intValue() != i) {
            ((ConcurrentHashMap) this.LIZJ).put(str, Integer.valueOf(i));
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "imsdk_fix_stranger_message", true) > 0) {
                coroutineContext = C0PEM.LIZJ;
            } else {
                coroutineContext = C0PEM.LIZ;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(coroutineContext), null, null, new C0YEA(this, str, i, num, null), 3);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
