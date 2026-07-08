package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15Te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20525215Te {
    public static final ConcurrentHashMap<Integer, Boolean> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, CopyOnWriteArraySet<C15U2>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, String> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, Boolean> LIZLLL = new ConcurrentHashMap<>();

    public static final void LIZ(C19EG c19eg) {
        ExploreLynxParams exploreLynxParams;
        String str;
        LIZJ(c19eg, false);
        Intent intent = c19eg.getIntent();
        if (intent != null && (exploreLynxParams = (ExploreLynxParams) intent.getParcelableExtra("explore_lynx_params")) != null) {
            if (!exploreLynxParams.showBackButton && (((str = exploreLynxParams.backUrl) == null || a0.LJJJIL(str)) && !exploreLynxParams.needBackFyp)) {
                return;
            }
            intent.putExtra("explore_lynx_params", new ExploreLynxParams(exploreLynxParams.lynxJumpInterestId, exploreLynxParams.lynxJumpInterestName, exploreLynxParams.lynxJumpAwemeIds, exploreLynxParams.lynxIsPinTopic, exploreLynxParams.enterMethod, exploreLynxParams.groupId, exploreLynxParams.requestId, exploreLynxParams.subEnterMethod, exploreLynxParams.specialShapedCardTriggerType, false, null, false));
        }
    }

    public static void LIZJ(C19EG c19eg, boolean z) {
        CopyOnWriteArraySet<C15U2> copyOnWriteArraySet;
        int iIdentityHashCode = System.identityHashCode(c19eg);
        if (!Intrinsics.LJFF(LIZ.put(Integer.valueOf(iIdentityHashCode), Boolean.valueOf(z)), Boolean.valueOf(z)) && (copyOnWriteArraySet = LIZIZ.get(Integer.valueOf(iIdentityHashCode))) != null) {
            Iterator<C15U2> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(z);
            }
        }
    }

    public static final void LIZIZ(C19EG c19eg, String str, boolean z) {
        int iIdentityHashCode = System.identityHashCode(c19eg);
        if (str != null && !a0.LJJJIL(str)) {
            LIZJ.put(Integer.valueOf(iIdentityHashCode), str);
        }
        LIZLLL.put(Integer.valueOf(iIdentityHashCode), Boolean.valueOf(z));
        LIZJ(c19eg, true);
    }
}
