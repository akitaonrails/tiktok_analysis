package X;

import Y.ARunnableS21S1200000_17;
import Y.AfS153S0200000_17;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.ExclusiveGiftUnlockEvent;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.TeamRankProgress;
import com.bytedance.android.livesdk.livesetting.gift.TeamGiftDelayUnlockImSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118340fCy {
    public static final C01GW<String> LJIIJJI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(268));
    public static final C01GW<String> LJIIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(266));
    public static final C01GW<String> LJIILIIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(267));
    public static final C01GW<String> LJIILJJIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(269));
    public TeamRankProgress LIZ;
    public InterfaceC1118350fCz LJFF;
    public boolean LJII;
    public boolean LJIIIZ;
    public Handler LJIIJ;
    public final Map<Long, GiftsInfo.LimitedTimeRewardGiftInfo> LIZIZ = new LinkedHashMap();
    public final Map<Long, Gift> LIZJ = new LinkedHashMap();
    public final Set<Long> LIZLLL = new LinkedHashSet();
    public final Map<Long, InterfaceC420801kM> LJ = new LinkedHashMap();
    public final Set<Long> LJI = new LinkedHashSet();
    public final Queue<C1096410edb> LJIIIIZZ = new LinkedList();

    public final void LIZ() {
        Handler handler = this.LJIIJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJIIJ = null;
        this.LJIIIZ = false;
    }

    public final void LIZIZ() {
        String strJ4;
        if (((LinkedList) this.LJIIIIZZ).size() <= 0) {
            LIZ();
            return;
        }
        Handler bPEAHandler = this.LJIIJ;
        if (bPEAHandler == null) {
            bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        }
        this.LJIIJ = bPEAHandler;
        C1096410edb c1096410edb = (C1096410edb) ((LinkedList) this.LJIIIIZZ).poll();
        if (c1096410edb == null) {
            return;
        }
        if (C1533950q1J.LJ(c1096410edb.LJFF)) {
            strJ4 = c1096410edb.LJFF;
        } else if (c1096410edb.LIZLLL == 7934) {
            strJ4 = LJIILJJIL.getValue();
        } else {
            strJ4 = C786410Ut5.j4(c1096410edb.LIZJ ? LJIIJJI.getValue() : LJIIL.getValue(), Arrays.copyOf(new Object[]{Integer.valueOf(c1096410edb.LIZ)}, 1));
        }
        this.LJIIIZ = true;
        Handler handler = this.LJIIJ;
        if (handler != null) {
            C786410Ut5.LJLIIL(((long) c1096410edb.LIZIZ) * 1000, handler, new ARunnableS21S1200000_17(c1096410edb, strJ4, this, 5));
        }
    }

    public final void LIZLLL() {
        GiftLockInfo giftLockInfo;
        try {
            if (TeamGiftDelayUnlockImSetting.INSTANCE.isEnabled()) {
                Iterator<Long> it2 = this.LJI.iterator();
                while (it2.hasNext()) {
                    Gift giftFindGiftById = GiftManager.inst().findGiftById(it2.next().longValue());
                    if (giftFindGiftById != null && (giftLockInfo = giftFindGiftById.giftSubInfo) != null && !giftLockInfo.mLock) {
                        ExclusiveGiftUnlockEvent exclusiveGiftUnlockEvent = new ExclusiveGiftUnlockEvent();
                        exclusiveGiftUnlockEvent.setValue(giftFindGiftById);
                        C784440Upu.LIZ().LIZIZ(exclusiveGiftUnlockEvent);
                        it2.remove();
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public final boolean LIZJ(long j) {
        List<Long> list;
        TeamRankProgress teamRankProgress = this.LIZ;
        if (teamRankProgress != null && (list = teamRankProgress.giftIds) != null) {
            return list.contains(Long.valueOf(j));
        }
        return false;
    }

    public final void LJ(TeamRankProgress teamRankProgress) {
        TeamRankProgress teamRankProgress2 = this.LIZ;
        if (teamRankProgress != null) {
            if (teamRankProgress2 == null || teamRankProgress.timestamp >= teamRankProgress2.timestamp) {
                this.LIZ = teamRankProgress;
            }
        }
    }

    public final void LJFF(List<GiftsInfo.LimitedTimeRewardGiftInfo> list) {
        ((LinkedHashMap) this.LIZIZ).clear();
        Iterator it2 = ((LinkedHashMap) this.LJ).entrySet().iterator();
        while (it2.hasNext()) {
            C500260Jjc.LJJLIIIJLJLI((InterfaceC420801kM) ((Map.Entry) it2.next()).getValue());
        }
        ((LinkedHashMap) this.LJ).clear();
        if (list != null) {
            for (GiftsInfo.LimitedTimeRewardGiftInfo limitedTimeRewardGiftInfo : list) {
                this.LIZIZ.put(Long.valueOf(limitedTimeRewardGiftInfo.giftId), limitedTimeRewardGiftInfo);
                long jLIZ = limitedTimeRewardGiftInfo.validEnd - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                if (jLIZ > 0) {
                    this.LJ.put(Long.valueOf(limitedTimeRewardGiftInfo.giftId), C11NZ.LJLJJLL(jLIZ, TimeUnit.SECONDS).LJJLJLI(new AfS153S0200000_17(limitedTimeRewardGiftInfo, this, 26)));
                }
            }
        }
    }
}
