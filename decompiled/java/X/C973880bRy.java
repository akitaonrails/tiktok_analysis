package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0bRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973880bRy {
    public static final Set<String> LIZ = new LinkedHashSet();

    public static int LIZ() {
        w.LIZ.getClass();
        if (!Intrinsics.LJFF(w.LJIIL(), "battle_envelope")) {
            return 0;
        }
        long battleId = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId();
        return (battleId <= 0 || battleId != C973740bRk.LIZ.LIZ()) ? 0 : 1;
    }
}
