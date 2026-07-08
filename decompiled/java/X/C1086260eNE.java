package X;

import Y.AfS186S0100000_17;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.rank.AudienceListPromoteAwarenessCoolDownDurationSetting;
import com.bytedance.android.livesdk.livesetting.rank.AudienceListPromoteAwarenessTypeSetting;
import com.bytedance.android.livesdk.model.message.BoostedUsersMessage;
import com.bytedance.android.livesdk.model.message.FlareBoostedUsers;
import com.bytedance.android.livesdk.model.message.PromoteAdBoostedUsers;
import com.bytedance.android.livesdk.model.message.PromoteAdStatusMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0eNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086260eNE extends AbstractC1086230eNB implements OnMessageListener {
    public final boolean LLJJL;
    public final long LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;

    public final void LJIIJJI() {
        this.LLJLL = true;
        C1086300eNI.LIZ(new C1086220eNA(5));
        if (this.LLJJL) {
            this.LLJJIJI.LIZ(C11NZ.LJLJJLL(this.LLJJLIIIJLLLLLLLZ, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 82)));
        }
    }

    @Override // X.AbstractC1086230eNB
    public final Map<String, String> LJ() {
        String str;
        View view = this.LLILZIL;
        boolean zLJJJI = C500260Jjc.LJJJI(view != null ? Boolean.valueOf(C500260Jjc.LJJJJIZL(view)) : null);
        DataChannel dataChannel = this.LLJJIJIIJIL;
        if (dataChannel == null || !C500260Jjc.LJIIZILJ(dataChannel)) {
            DataChannel dataChannel2 = this.LLJJIJIIJIL;
            str = (dataChannel2 == null || !C01C5.LIZ(dataChannel2)) ? "viewer" : "admin";
        } else {
            str = "anchor";
        }
        C1086240eNC.LIZ(str, zLJJJI);
        HashMap map = new HashMap();
        C1086250eND c1086250eND = C1086280eNG.LIZIZ;
        map.put("boost_status", c1086250eND.LJFF ? "2" : c1086250eND.LJI ? "1" : CardStruct.IStatusCode.DEFAULT);
        map.put("boost_amount", String.valueOf(C1086280eNG.LIZIZ.LJII));
        map.put("boost_countdown", String.valueOf(C1086280eNG.LIZIZ.LIZIZ));
        map.put("boost_icon", C1086280eNG.LIZIZ.LIZ);
        map.put("promote_show_type", String.valueOf(AudienceListPromoteAwarenessTypeSetting.INSTANCE.getValue()));
        map.put("top_right_showing", String.valueOf(zLJJJI));
        map.put("is_promoting", this.LLJLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
        return map;
    }

    public final void LJIIL() {
        if (this.LLJJL) {
            this.LLJJIJI.LIZ(C11NZ.LJLJJLL(this.LLJJLIIIJLLLLLLLZ, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 86)));
        }
    }

    @Override // X.AbstractC1086230eNB
    public final void LJI() {
        super.LJI();
        if (this.LLJL) {
            this.LLJL = false;
            LJIIJJI();
        }
    }

    @Override // X.AbstractC1086230eNB
    public final void onDestroy() {
        IMessageManager iMessageManager;
        super.onDestroy();
        DataChannel dataChannel = this.LLJJIJIIJIL;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.removeMessageListener(this);
    }

    public C1086260eNE(C1105400es6 c1105400es6) {
        super(c1105400es6);
        this.LLJJL = AudienceListPromoteAwarenessTypeSetting.INSTANCE.enableCoolDown();
        this.LLJJLIIIJLLLLLLLZ = AudienceListPromoteAwarenessCoolDownDurationSetting.INSTANCE.getValue();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        if (iMessage instanceof PromoteAdStatusMessage) {
            this.LLJLLIL = true;
            PromoteAdStatusMessage promoteAdStatusMessage = (PromoteAdStatusMessage) iMessage;
            int i = promoteAdStatusMessage.status;
            if (i == 0) {
                boolean zLIZ = C1086280eNG.LIZ(promoteAdStatusMessage.adId);
                this.LLJLLL = true;
                if (zLIZ) {
                    LJIIL();
                }
                C1086300eNI.LIZ(new C1086220eNA(1));
                if (this.LLJLL) {
                    C1086300eNI.LIZ(new C1086220eNA(5));
                }
                long j = promoteAdStatusMessage.adId;
                boolean zEnableCoolDown = AudienceListPromoteAwarenessTypeSetting.INSTANCE.enableCoolDown();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_liveroom_promote_start");
                c474500IjALIZ.LJIL();
                if (zEnableCoolDown) {
                    str = "periodic";
                } else {
                    str = "permanent";
                }
                c474500IjALIZ.LJJII(str, "effect_show_strategy");
                c474500IjALIZ.LJJII(Long.valueOf(j), "promote_ad_id");
                c474500IjALIZ.LIZ();
                return;
            }
            if (i != 1) {
                return;
            }
            long j2 = promoteAdStatusMessage.adId;
            Map<Long, C1086330eNL> map = C1086280eNG.LIZJ;
            synchronized (map) {
                try {
                    if (map.containsKey(Long.valueOf(j2))) {
                        map.remove(Long.valueOf(j2));
                        C1086300eNI.LIZ(new C1086220eNA(3));
                        if (C1086280eNG.LIZIZ()) {
                            if (!this.LLJLL || C1086280eNG.LIZIZ.LJI) {
                                return;
                            }
                            C1086300eNI.LIZ(new C1086220eNA(5));
                            return;
                        }
                        this.LLJLL = false;
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (!(iMessage instanceof BoostedUsersMessage)) {
            return;
        }
        BoostedUsersMessage boostedUsersMessage = (BoostedUsersMessage) iMessage;
        C1086280eNG.LIZ = boostedUsersMessage.totalCnt;
        C784440Upu.LIZ().LIZIZ(new C1086220eNA(2));
        FlareBoostedUsers flareBoostedUsers = boostedUsersMessage.flare;
        if (flareBoostedUsers != null) {
            C1086250eND c1086250eND = C1086280eNG.LIZIZ;
            long j3 = flareBoostedUsers.cnt;
            c1086250eND.LJII = j3;
            LJIIJ(j3);
        }
        if (!(!boostedUsersMessage.promoteAds.isEmpty())) {
            return;
        }
        if (!C1086280eNG.LIZIZ() && !this.LLJLLIL) {
            Iterator<PromoteAdBoostedUsers> it2 = boostedUsersMessage.promoteAds.iterator();
            while (it2.hasNext()) {
                C1086280eNG.LIZ(it2.next().adId);
                this.LLJLLL = true;
            }
            C1086300eNI.LIZ(new C1086220eNA(1));
            return;
        }
        boolean z = false;
        for (PromoteAdBoostedUsers promoteAdBoostedUsers : boostedUsersMessage.promoteAds) {
            if (C1086280eNG.LIZJ(promoteAdBoostedUsers.adId, promoteAdBoostedUsers.percent)) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        if (this.LLJLIL) {
            this.LLJLIL = false;
            this.LLJLL = false;
            C1086300eNI.LIZ(new C1086220eNA(4));
            LJIIL();
            return;
        }
        if (!this.LLJLL) {
            return;
        }
        this.LLJLILLLLZIIL = true;
    }

    @Override // X.AbstractC1086230eNB
    public final void LJFF(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        super.LJFF(view, lifecycleOwner, dataChannel);
        if (dataChannel != null) {
            IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(C001A.PROMOTE_AD_STATUS_MESSAGE.getIntType(), this);
            }
            IMessageManager iMessageManager2 = (IMessageManager) dataChannel.gg0(C776250Uch.class);
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(C001A.BOOSTED_USERS_MESSAGE.getIntType(), this);
            }
        }
    }
}
