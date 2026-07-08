package X;

import android.util.LruCache;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0IXT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IXT {
    public static boolean LIZ() {
        n nVar;
        k kVarLJJIIZ;
        LruCache<String, n> lruCache = C468040IXa.LIZ;
        try {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room == null || (nVar = C468040IXa.LIZ.get(room.getIdStr())) == null || (kVarLJJIIZ = nVar.LJJIIZ("enable_game_linkmic_charm")) == null) {
                return false;
            }
            Boolean boolValueOf = Boolean.valueOf(kVarLJJIIZ.LJ());
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getBoolValue error ");
            sbLIZ.append("enable_game_linkmic_charm");
            C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
            return false;
        }
    }
}
