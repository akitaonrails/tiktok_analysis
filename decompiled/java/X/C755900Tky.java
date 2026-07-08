package X;

import Y.ARunnableS112S0100000_12;
import android.os.Looper;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.adapter.widget.degrade.exps.LiveCardDegradeConfigStore;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Tky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755900Tky implements InterfaceC755920Tl0 {
    public static C1101180elI LLILZ;
    public static long LLILZIL;
    public static long LLILZLL;
    public static final C755900Tky LL = new C755900Tky();
    public static final ConcurrentHashMap<EnumC755930Tl1, CopyOnWriteArrayList<InterfaceC755910Tkz>> LLILLJJLI = new ConcurrentHashMap<>();
    public static final ConcurrentHashSet<String> LLILLL = new ConcurrentHashSet<>();
    public static final C01GW LLIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(363));
    public static final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(366));
    public static final C01GW LLJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(364));
    public static final C01GW LLJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(365));
    public static final C755960Tl4 LLJIJIL = new AbstractC467020ITc() { // from class: X.0Tl4
        @Override // X.AbstractC467020ITc, X.InterfaceC1101120elC
        public final void LIZJ(InterfaceC1100800ekg interfaceC1100800ekg, C1100750ekb c1100750ekb) {
            C1101180elI c1101180elI = c1100750ekb.LIZ;
            if (c1101180elI.LIZLLL == EnumC1101170elH.UNKNOWN) {
                return;
            }
            C473410IhP.LIZIZ(new ARunnableS112S0100000_12(c1101180elI, 330));
        }
    };

    public static C1100750ekb LIZIZ() {
        if ((Looper.getMainLooper().getThread() == C786410Ut5.u3()) || SystemClock.elapsedRealtime() - LLILZLL <= ((Number) LLJ.getValue()).longValue()) {
            return null;
        }
        LLILZLL = SystemClock.elapsedRealtime();
        InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) LLJI.getValue();
        if (interfaceC1100800ekg != null) {
            return interfaceC1100800ekg.LJIIIZ();
        }
        return null;
    }

    @Override // X.InterfaceC755920Tl0
    public final synchronized boolean LLIFFJFJJ(EnumC755930Tl1 enumC755930Tl1) {
        return LIZ(enumC755930Tl1, false);
    }

    public static boolean LIZ(EnumC755930Tl1 enumC755930Tl1, boolean z) {
        LiveCardDegradeConfigStore.LivePreviewCardDegradeConfigItem livePreviewCardDegradeConfigItem;
        Float f;
        LL.getClass();
        Map map = (Map) LLIZ.getValue();
        boolean z2 = false;
        if (map != null && (livePreviewCardDegradeConfigItem = (LiveCardDegradeConfigStore.LivePreviewCardDegradeConfigItem) map.get(enumC755930Tl1.getBizName())) != null && (f = livePreviewCardDegradeConfigItem.threshold) != null) {
            float fFloatValue = f.floatValue();
            C1101180elI c1101180elI = LLILZ;
            if (c1101180elI != null && ((z || SystemClock.elapsedRealtime() - LLILZIL < ((Number) LLIZLLLIL.getValue()).longValue()) && c1101180elI.LIZIZ < fFloatValue)) {
                z2 = true;
            }
        }
        C755940Tl2.LIZ(enumC755930Tl1, z2);
        return z2;
    }
}
