package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.pusher.core.utils.GsonHolder;

/* JADX INFO: renamed from: X.0bFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966350bFp implements InterfaceC927230aEj {
    public static final C966350bFp LIZ = new C966350bFp();

    @Override // X.InterfaceC927230aEj
    public final void LIZIZ(C927240aEk c927240aEk) {
    }

    @Override // X.InterfaceC927230aEj
    public final void LIZJ(C927240aEk c927240aEk) {
    }

    @Override // X.InterfaceC927230aEj
    public final void LIZ(C945340ahw c945340ahw) {
        C474500IjA c474500IjA = c945340ahw.LIZ;
        c474500IjA.LJJII(GsonProtectorUtils.toJson(GsonHolder.LIZ, c945340ahw.LIZIZ), "cur_nodes");
        c474500IjA.LIZ();
    }
}
