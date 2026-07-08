package X;

import com.bytedance.android.livesdkapi.host.IHostConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0fLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1123930fLz {
    public final Map<EnumC756810TmR, List<InterfaceC1123960fM2>> LIZ = new HashMap();
    public final Map<EnumC1124020fM8, List<InterfaceC1123960fM2>> LIZIZ = new HashMap();
    public final Map<EnumC756810TmR, InterfaceC756730TmJ> LIZJ = new HashMap();
    public final Map<String, InterfaceC1123960fM2> LIZLLL = new HashMap();
    public final Map<String, InterfaceC756730TmJ> LJ = new HashMap();
    public volatile boolean LJFF = false;

    public final void LIZ() {
        if (!this.LJFF) {
            ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).d40();
        }
        this.LJFF = true;
    }
}
