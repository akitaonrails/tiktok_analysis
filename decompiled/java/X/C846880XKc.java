package X;

import com.orbu.core.config.AgConfig;
import com.orbu.core.config.BootConfig;
import com.orbu.core.config.BootConfigKt;
import com.orbu.core.config.IConfigCenter;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0XKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846880XKc implements IConfigCenter {
    public static final C846880XKc LIZ = new C846880XKc();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(246));
    public static final BootConfig LIZJ = new BootConfig(new AgConfig(null, null, null, 7, null), BootConfigKt.getDefaultThirdPartyConfig(), "671089669", C1697810uHb.LJIIJJI("http://", "https://", "wss://", "tcp://", "udp://", "tls://", "quic://"));

    @Override // com.orbu.core.config.IConfigCenter
    public final BootConfig updateConfig() {
        return (BootConfig) LIZIZ.getValue();
    }
}
