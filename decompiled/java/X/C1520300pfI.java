package X;

import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0pfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520300pfI implements InterfaceC1520310pfJ {
    public static volatile C1520300pfI LIZLLL;
    public BidInfo LIZ;
    public Map<String, Integer> LIZIZ;
    public Set<String> LIZJ;

    @Override // X.InterfaceC1520310pfJ
    public final HybridSettingInitConfig LJ() {
        return null;
    }

    @Override // X.InterfaceC1520310pfJ
    public final void LJI() {
    }

    @Override // X.InterfaceC1520310pfJ
    public final List<C1520780pg4> LJFF() {
        return new ArrayList();
    }

    @Override // X.InterfaceC1520310pfJ
    public final Map<String, Integer> LJII() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1520310pfJ
    public final BidInfo LJIIIIZZ() {
        if (this.LIZ == null) {
            this.LIZ = new BidInfo();
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC1520310pfJ
    public final Set<String> LJIIIZ() {
        if (this.LIZJ == null) {
            this.LIZJ = new HashSet();
        }
        return this.LIZJ;
    }
}
