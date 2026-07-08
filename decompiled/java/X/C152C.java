package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.livesetting.game.SmartGameAnchorAiStrategyControlConfigSetting;
import com.ss.android.ugc.aweme.ml.ab.SmartGameAnchorAIStrategyExperiment;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.partnership.profile.LiveGameProfileFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.152C, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C152C implements C0PSA {
    public static final C152C LIZ = new C152C();

    @Override // X.C0PSA
    public final void LIZ() {
        C152I c152i = C152J.LIZ;
        if (c152i != null) {
            c152i.LIZ();
        }
        C152J.LIZ = null;
    }

    @Override // X.C0PSA
    public final void LIZJ() {
        ConcurrentLinkedDeque<C152G> concurrentLinkedDeque = C152D.LIZ;
        Collection<SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig> collectionValues = SmartGameAnchorAiStrategyControlConfigSetting.INSTANCE.getConfig().anchorConfigMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig anchorStrategyConfig = (SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig) obj;
            if (anchorStrategyConfig.enableInfer || anchorStrategyConfig.enableInferGIP) {
                if (anchorStrategyConfig.preloadTriggerCount > 0) {
                    arrayList.add(obj);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Integer numValueOf = Integer.valueOf(((SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig) it2.next()).preloadTriggerCount);
            while (it2.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig) it2.next()).preloadTriggerCount);
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                C152D.LIZJ++;
                if (C152D.LIZIZ().LIZIZ || C152D.LIZJ < iIntValue) {
                    return;
                }
                C20441214yg.LIZIZ("GameAnchorAiStrategyManager", "preloadEnv");
                C152E c152eLIZIZ = C152D.LIZIZ();
                if (c152eLIZIZ.LIZIZ) {
                    return;
                }
                AbstractC1511510pR7 abstractC1511510pR7 = c152eLIZIZ.LIZ;
                if (abstractC1511510pR7 != null) {
                    abstractC1511510pR7.preloadEnv();
                }
                c152eLIZIZ.LIZIZ = true;
            }
        }
    }

    @Override // X.C0PSA
    public final Fragment LJ() {
        return new LiveGameProfileFragment();
    }

    @Override // X.C0PSA
    public final void LJFF() {
        C152I c152i = C152J.LIZ;
        if (c152i != null) {
            c152i.LIZ();
        }
    }

    @Override // X.C0PSA
    public final void LIZLLL(int i, String str) {
        ConcurrentLinkedDeque<C152G> concurrentLinkedDeque = C152D.LIZ;
        SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig anchorConfig = SmartGameAnchorAiStrategyControlConfigSetting.INSTANCE.getAnchorConfig(i);
        if (anchorConfig != null && anchorConfig.enableDataCollect) {
            Iterator<C152G> itDescendingIterator = C152D.LIZ.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                C152G next = itDescendingIterator.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    next.LIZJ = true;
                }
            }
            C152D.LIZ();
        }
    }

    @Override // X.C0PSA
    public final void LJI(int i, String str) {
        ConcurrentLinkedDeque<C152G> concurrentLinkedDeque = C152D.LIZ;
        SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig anchorConfig = SmartGameAnchorAiStrategyControlConfigSetting.INSTANCE.getAnchorConfig(i);
        if (anchorConfig != null && anchorConfig.enableDataCollect) {
            Iterator<C152G> itDescendingIterator = C152D.LIZ.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                C152G next = itDescendingIterator.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    next.LIZIZ = true;
                }
            }
            C152D.LIZ();
            C1509310pNZ c1509310pNZ = new C1509310pNZ(0);
            c1509310pNZ.LIZIZ = str;
            SmartDataTrackerService.Companion.getClass();
            C1512160pSA.LIZ.onSceneRealCheckAndReport(SmartGameAnchorAIStrategyExperiment.SCENE, c1509310pNZ);
        }
    }

    @Override // X.C0PSA
    public final View LJIIIIZZ(Context context, Fragment fragment, ViewGroup viewGroup, AwS589S0100000_10 awS589S0100000_10) {
        C1882550z5Z c1882550z5ZIz0;
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        if (iGamePartnershipService != null) {
            c1882550z5ZIz0 = iGamePartnershipService.iz0(context);
        } else {
            c1882550z5ZIz0 = null;
        }
        C152J.LIZ = c1882550z5ZIz0;
        if (c1882550z5ZIz0 == null) {
            return null;
        }
        return c1882550z5ZIz0.LJ(fragment, awS589S0100000_10);
    }

    @Override // X.C0PSA
    public final void LIZIZ(String str, String str2, String str3, String str4, String str5, boolean z) {
        C152I c152i = C152J.LIZ;
        if (c152i != null) {
            c152i.LIZIZ(str, str2, str3, str4, str5, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01bc A[PHI: r15
      0x01bc: PHI (r15v1 double) = (r15v0 double), (r15v0 double), (r15v0 double), (r15v0 double), (r15v3 double) binds: [B:48:0x0159, B:49:0x015b, B:51:0x0161, B:56:0x018a, B:58:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0PSA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(int r24, java.lang.String r25, java.lang.String r26, boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152C.LJII(int, java.lang.String, java.lang.String, boolean, boolean, boolean):boolean");
    }
}
