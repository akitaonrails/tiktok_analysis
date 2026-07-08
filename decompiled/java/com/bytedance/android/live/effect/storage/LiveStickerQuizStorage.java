package com.bytedance.android.live.effect.storage;

import X.C0VSJ;
import X.C1161920gLG;
import X.C13VI;
import X.C20441214yg;
import X.C2188811AlT;
import X.C766720U5u;
import X.C768270UBt;
import X.C771280UNi;
import X.C771340UNo;
import X.EnumC1335420kr6;
import X.EnumC771350UNp;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastClearExpiredResourceNormal;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastResourcesExpiredDays;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveStickerQuizStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "live_storage_business_tag";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC771350UNp.STICKER.getFullPath());
        sbLIZ.append("quiz");
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        long jLJIILL;
        long jLJIILL2 = 0;
        if (LiveBroadcastClearExpiredResourceNormal.enable()) {
            return 0L;
        }
        try {
            long jValue = LiveBroadcastResourcesExpiredDays.value();
            EffectManager effectManagerLLJILJILJ = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ();
            Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
            jLJIILL = LJIILL(false, jValue, effect, effectManagerLLJILJILJ);
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LiveStickerQuizStorage search size: ");
                sbLIZ.append(jLJIILL);
                sbLIZ.append(", doClean: ");
                sbLIZ.append(z);
                C20441214yg.LIZIZ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ));
                if (jLJIILL > 0) {
                    if (z) {
                        try {
                            jLJIILL2 = LJIILL(true, jValue, effect, effectManagerLLJILJILJ);
                        } catch (Throwable th) {
                            th = th;
                            jLJIILL2 = jLJIILL;
                        }
                    } else {
                        jLJIILL2 = jLJIILL;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("LiveStickerQuizStorage delete size: ");
                    sbLIZ2.append(jLJIILL2);
                    sbLIZ2.append(", doClean: ");
                    sbLIZ2.append(z);
                    C20441214yg.LIZIZ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ2));
                    C766720U5u.LIZ.getClass();
                    C766720U5u.LIZJ();
                    C768270UBt.LIZ.getClass();
                    C768270UBt.LIZ((int) jLJIILL2, "LiveStickerQuizStorage");
                    return jLJIILL2;
                }
                return jLJIILL;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        jLJIILL = jLJIILL2;
        TryCatchGuardChecker.doCheck(th);
        C768270UBt.LIZ.getClass();
        C768270UBt.LIZ(0, "catch_crash");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LiveStickerQuizStorage, error log: ");
        sbLIZ3.append(Log.getStackTraceString(th));
        C20441214yg.LJ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ3));
        return jLJIILL;
    }

    public final long LJIILL(boolean z, long j, Effect effect, EffectManager effectManager) {
        int i = C771340UNo.LIZ;
        long jLIZ = 0;
        for (Pair pair : (ArrayList) C771340UNo.LIZLLL(j, "sticker_quiz", LJIIIIZZ().getAbsolutePath(), z)) {
            if (!C771340UNo.LIZJ()) {
                long jLIZ2 = jLIZ + C771280UNi.LIZ(new C0VSJ((String) pair.getSecond()), z);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(effectManager.getEffectPlatform().LIZ.LJII);
                sbLIZ.append(File.separator);
                sbLIZ.append((String) pair.getFirst());
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                jLIZ = jLIZ2 + C771280UNi.LIZ(c0vsj, false);
                if (z && c0vsj.exists()) {
                    effect.setId((String) pair.getFirst());
                    effectManager.deleteEffect(effect);
                }
            }
        }
        return jLIZ;
    }
}
