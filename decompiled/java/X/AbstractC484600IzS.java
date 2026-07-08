package X;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.increase.IncreaseSDKTriggerEvent;
import com.bytedance.android.livesdk.livesetting.other.IncreaseSDKRegistrationOptimize;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tiktok.strategycenter.TTMStrategyCenter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS216S0300000_7;
import webcast.api.room.StrategyData;
import webcast.api.room.StrategyFilter;
import webcast.api.room.StrategyTrigger;

/* JADX INFO: renamed from: X.0IzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC484600IzS {
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final ArrayList<AbstractC484590IzR> LIZIZ = new ArrayList<>();
    public final ArrayList<C484610IzT> LIZJ = new ArrayList<>();
    public DataChannel LIZLLL;
    public StrategyData LJ;
    public boolean LJFF;
    public long LJI;

    public abstract AbstractC484590IzR LIZ(StrategyFilter strategyFilter);

    public abstract int LIZIZ();

    public void LIZJ() {
    }

    public void LIZLLL(String str, boolean z) {
    }

    public abstract void LJ(C470580Icq c470580Icq, C484610IzT c484610IzT);

    public boolean LJI() {
        return false;
    }

    public final void LJII() {
        for (C484610IzT c484610IzT : this.LIZJ) {
            StrategyTrigger strategyTrigger = c484610IzT.LIZ;
            if (!strategyTrigger.triggerByCep) {
                c484610IzT.LIZJ.removeCallbacksAndMessages(null);
            } else if (c484610IzT.LIZIZ) {
                TTMStrategyCenter.getInstance().unRegisterBizCepCallback("live_increase_sdk", c484610IzT.LIZ.cepRuleName);
                TTMStrategyCenter.getInstance().unRegisterRule("live_increase_sdk", c484610IzT.LIZ.cepRuleName);
                TTMStrategyCenter.getInstance().cleanBizCepRule("live_increase_sdk", c484610IzT.LIZ.cepRuleName);
            } else {
                C472880IgY.LIZ.remove(strategyTrigger.triggerId);
            }
        }
        this.LIZ.removeCallbacksAndMessages(null);
        this.LJI = 0L;
    }

    public final void LJFF(DataChannel dataChannel, LifecycleOwner lifecycleOwner, EnterRoomConfig enterRoomConfig) {
        boolean z;
        this.LIZLLL = dataChannel;
        C469620IbI c469620IbI = C469620IbI.LIZ;
        int iLIZIZ = LIZIZ();
        c469620IbI.getClass();
        this.LJ = C469620IbI.LIZIZ(iLIZIZ, null, true, true, false);
        if (LJI()) {
            return;
        }
        LIZJ();
        if (this.LJFF) {
            Iterator<C484610IzT> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ();
            }
            LIZLLL(null, true);
            return;
        }
        StrategyData strategyData = this.LJ;
        if (strategyData != null) {
            this.LJFF = true;
            Iterator<StrategyFilter> it3 = strategyData.filter.iterator();
            while (it3.hasNext()) {
                this.LIZIZ.add(LIZ(it3.next()));
            }
            ArrayList<AbstractC484590IzR> arrayList = this.LIZIZ;
            ArrayList<AbstractC484590IzR> arrayList2 = new ArrayList();
            for (AbstractC484590IzR abstractC484590IzR : arrayList) {
                if (abstractC484590IzR.LIZIZ.beforeTrigger) {
                    arrayList2.add(abstractC484590IzR);
                }
            }
            for (AbstractC484590IzR abstractC484590IzR2 : arrayList2) {
                if (abstractC484590IzR2.LIZIZ.filterType == 0 && !abstractC484590IzR2.LIZ(dataChannel, strategyData)) {
                    return;
                }
                if (abstractC484590IzR2.LIZIZ.filterType == 2 && !abstractC484590IzR2.LJFF(dataChannel)) {
                    return;
                }
            }
            for (StrategyTrigger strategyTrigger : strategyData.trigger) {
                ArrayList<C484610IzT> arrayList3 = this.LIZJ;
                if (LIZIZ() == 9 && IncreaseSDKRegistrationOptimize.parseRuleLocally()) {
                    z = false;
                } else {
                    z = true;
                }
                C484610IzT c484610IzT = new C484610IzT(strategyTrigger, z);
                c484610IzT.LIZIZ();
                arrayList3.add(c484610IzT);
            }
            LIZLLL(null, true);
            dataChannel.EQ2(lifecycleOwner, IncreaseSDKTriggerEvent.class, new AwS216S0300000_7(this, dataChannel, enterRoomConfig, 14));
            return;
        }
        LIZLLL("strategy data is null", false);
    }
}
