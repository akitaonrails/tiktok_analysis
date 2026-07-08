package X;

import com.tiktok.strategycenter.storage.TTMStrategyCenterKVManager;

/* JADX INFO: renamed from: X.08Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2078408Cg implements InterfaceC1075980e6e {
    public static final C2078408Cg LIZ = new C2078408Cg();
    public static final TTMStrategyCenterKVManager LIZIZ = C2078308Cf.LIZIZ.LIZ;

    @Override // X.InterfaceC1075980e6e
    public final long getLongValue(String str) {
        return LIZIZ.getLongValue("relation", str);
    }

    @Override // X.InterfaceC1075980e6e
    public final void LIZ(String str, long j) {
        LIZIZ.storeLongValue("relation", str, j);
    }
}
