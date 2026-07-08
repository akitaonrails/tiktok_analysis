package X;

import com.bytedance.android.livesdk.config.GameAudioInferModel;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0kxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339330kxP implements InterfaceC19483011Ki {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC19483011Ki
    public final boolean test(Object obj) {
        switch (this.$t) {
            case 0:
                return test$0(this, obj);
            case 1:
                return test$1(this, obj);
            default:
                return false;
        }
    }

    public C1339330kxP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean test$0(C1339330kxP c1339330kxP, Object obj) {
        boolean z;
        C1286510jaD c1286510jaD = (C1286510jaD) c1339330kxP.l0;
        synchronized (c1286510jaD) {
            try {
                if (c1286510jaD.LJ.size() < 5) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public static final boolean test$1(C1339330kxP c1339330kxP, Object obj) {
        String path;
        String modeFile = ((GameAudioInferModel) c1339330kxP.l0).getModeFile();
        if (modeFile == null) {
            modeFile = "";
        }
        File fileLJII = C1143780fs0.LJII("tiktok_live_game_demand_2", modeFile);
        if (fileLJII == null) {
            ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).NP0("tiktok_live_game_demand_2");
            fileLJII = C1143780fs0.LJII("tiktok_live_game_demand_2", modeFile);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("filter file = ");
        if (fileLJII != null) {
            path = fileLJII.getPath();
        } else {
            path = null;
        }
        sbLIZ.append(path);
        C20441214yg.LJIIIZ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ));
        if (fileLJII != null && fileLJII.exists()) {
            return true;
        }
        return false;
    }
}
