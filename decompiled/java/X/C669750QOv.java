package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import java.util.LinkedList;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669750QOv implements InterfaceC676470Qg9 {
    public static final C01GW<C669750QOv> LIZLLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS196S0000000_10.get$arr$(743));
    public final LinkedList<LastSearch> LIZ = new LinkedList<>();
    public final int LIZIZ = 10;
    public final Gson LIZJ = C7740030o.LIZ().getGson();

    @Override // X.InterfaceC676470Qg9
    public final String LIZ() {
        return "";
    }

    public final synchronized String LIZJ() {
        return GsonProtectorUtils.toJson(this.LIZJ, new LinkedList(this.LIZ));
    }

    @Override // X.InterfaceC676470Qg9
    public final LastSearch LIZIZ() {
        if (this.LIZ.size() == 0) {
            return null;
        }
        try {
            return this.LIZ.getFirst();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC676470Qg9
    public final synchronized void LJIJJLI(LastSearch lastSearch) {
        if (this.LIZ.size() < this.LIZIZ) {
            this.LIZ.addFirst(lastSearch);
        } else {
            C19719612Di.LJJIJIIJI(this.LIZ);
            this.LIZ.addFirst(lastSearch);
        }
    }
}
