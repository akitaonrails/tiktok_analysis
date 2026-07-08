package X;

import com.ss.android.ugc.aweme.net.control.DispatchConfig;

/* JADX INFO: renamed from: X.0Zrq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913040Zrq implements InterfaceC913130Zrz {
    public static final C913040Zrq LIZ = new C913040Zrq();
    public static final DispatchConfig LIZIZ = new DispatchConfig(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null);

    @Override // X.InterfaceC913130Zrz
    public final DispatchConfig getConfig() {
        DispatchConfig dispatchConfig = (DispatchConfig) C0C64.LJIILLIIL().LJJII(DispatchConfig.class, LIZIZ, "im_out_push_net_control_config", true);
        if (dispatchConfig == null) {
            dispatchConfig = new DispatchConfig(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null);
        }
        if (dispatchConfig.sceneName.length() == 0) {
            return null;
        }
        return dispatchConfig;
    }

    @Override // X.InterfaceC913130Zrz
    public final EnumC2262571Dh9 getScene() {
        return EnumC2262571Dh9.BIZ_DM_OUT_PUSH;
    }
}
