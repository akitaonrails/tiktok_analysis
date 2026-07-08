package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common;

import X.C01IS;
import X.C01JX;
import X.C0UO0;
import X.C11NJ;
import X.C20441214yg;
import X.C213500s1;
import X.C2188811AlT;
import X.C516201zk;
import X.C776250Uch;
import X.C948450amx;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllGetContentParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCountDownForAllV2ViewModel extends ViewModel {
    public final C11NJ LL = new C11NJ();
    public final MutableLiveData<Integer> LLILLJJLI = new MutableLiveData<>(0);

    public abstract String BQ2();

    public abstract C01IS vQ2();

    public final User CQ2() {
        return vQ2().LJFF;
    }

    public final String DQ2() {
        return vQ2().LJI;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        IMessageManager iMessageManager;
        super.onCleared();
        this.LL.LJ();
        C01IS c01isVQ2 = vQ2();
        C20441214yg.LJIIIZ(c01isVQ2.LJIIIIZZ(), "destroy");
        C213500s1 c213500s1 = c01isVQ2.LJIIIIZZ;
        c213500s1.getClass();
        try {
            DataChannel dataChannel = c213500s1.LIZ;
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) c213500s1.LIZJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("CountDownForAllV2MessageChannel", e);
        }
        ((C11NJ) c01isVQ2.LJIILL.getValue()).LJ();
        C20441214yg.LIZIZ("CountDownForAllV2Service", "CountDownForAllService release");
        C948450amx.LIZIZ.LJI("COUNT_DOWN_FOR_ALL_V2_SERVICE");
    }

    public final CountdownForAllContent wQ2() {
        return vQ2().LIZIZ;
    }

    public final long xQ2() {
        CountdownForAllContent countdownForAllContentWQ2 = wQ2();
        if (countdownForAllContentWQ2 != null) {
            return countdownForAllContentWQ2.playId;
        }
        return 0L;
    }

    public final int yQ2() {
        return vQ2().LJI();
    }

    public final long zQ2() {
        CountdownForAllConfig countdownForAllConfig;
        C01IS c01isVQ2 = vQ2();
        CountdownForAllContent countdownForAllContent = c01isVQ2.LIZIZ;
        if (countdownForAllContent == null || (countdownForAllConfig = countdownForAllContent.playConfig) == null) {
            return 0L;
        }
        long j = countdownForAllConfig.duration;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        return ((j * j2) - c01isVQ2.LJII()) / j2;
    }

    public final long AQ2(Long l) {
        if (l != null) {
            Long l2 = vQ2().LJIIIZ.get(Long.valueOf(l.longValue()));
            if (l2 != null) {
                return l2.longValue();
            }
            return 0L;
        }
        return 0L;
    }

    public final void EQ2(String str) {
        String strBQ2 = BQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCountDownForAllContent, getContentType: ");
        sbLIZ.append(1);
        sbLIZ.append(", source: ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(strBQ2, C2188811AlT.LIZIZ(sbLIZ));
        CountdownForAllGetContentParams countdownForAllGetContentParams = new CountdownForAllGetContentParams();
        countdownForAllGetContentParams.roomId = C01JX.LJII();
        countdownForAllGetContentParams.channelId = C01JX.LJI();
        countdownForAllGetContentParams.playId = xQ2();
        countdownForAllGetContentParams.getType = 1;
        this.LL.LIZ(vQ2().LJIIJJI(countdownForAllGetContentParams, str).LJFF(new C0UO0()).LJJIIZ(new C516201zk(this, 8), new C516201zk(this, 9)));
    }
}
