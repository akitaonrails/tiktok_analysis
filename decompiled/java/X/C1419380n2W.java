package X;

import com.bytedance.ies.smartmovie.jni.IMusicNetworkDelegate;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0n2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419380n2W extends IMusicNetworkDelegate {
    public final Map<String, C2472609mW> LIZ = new LinkedHashMap();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(322));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(323));
    public InterfaceC1419480n2g LIZLLL;

    public final Pair<String, String> LIZ() {
        return (Pair) this.LIZIZ.getValue();
    }

    @Override // com.bytedance.ies.smartmovie.jni.IMusicNetworkDelegate
    public final void cancel(String str) {
        Unit unit;
        if (str == null) {
            return;
        }
        try {
            C2472609mW c2472609mW = (C2472609mW) ((LinkedHashMap) this.LIZ).get(str);
            if (c2472609mW != null) {
                c2472609mW.cancel();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LIZ.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0189  */
    /* JADX WARN: Type inference failed for: r1v111, types: [T, java.lang.Long] */
    @Override // com.bytedance.ies.smartmovie.jni.IMusicNetworkDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void request(final com.bytedance.ies.smartmovie.jni.MusicRequestParams r54, final com.bytedance.ies.smartmovie.jni.CommonRequestCallback r55, com.bytedance.ies.smartmovie.jni.MusicRequestCallback r56) {
        /*
            Method dump skipped, instruction units count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419380n2W.request(com.bytedance.ies.smartmovie.jni.MusicRequestParams, com.bytedance.ies.smartmovie.jni.CommonRequestCallback, com.bytedance.ies.smartmovie.jni.MusicRequestCallback):void");
    }
}
