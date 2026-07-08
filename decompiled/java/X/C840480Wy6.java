package X;

import com.bytedance.helios.network.api.config.InventoryConfig;
import com.bytedance.helios.network.api.config.NetworkSettingsSnapshot;
import com.bytedance.helios.network.runtime.host.model.NetworkAppInfo;
import com.bytedance.helios.network.runtime.host.model.NetworkHostProxy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840480Wy6 {
    public Function0<NetworkSettingsSnapshot> LIZIZ;
    public NetworkSettingsSnapshot LIZJ;
    public NetworkAppInfo LIZLLL;
    public boolean LJI;
    public boolean LJII;
    public InventoryConfig LJIIIIZZ;
    public NetworkHostProxy LIZ = null;
    public final ThreadLocal<InterfaceC823460WSa> LJ = new ThreadLocal<>();
    public final long LJFF = System.currentTimeMillis();
}
