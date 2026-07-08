package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C01N8;
import X.C1125830fP3;
import X.C1125860fP6;
import X.C1161920gLG;
import X.C13BV;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C1878960yzm;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C389001fE;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.EnumC1779270wOz;
import X.InterfaceC20354714kj;
import X.InterfaceC979390bar;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveGoalIntegrationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookLiveGoalSetting;
import com.bytedance.android.livesdkapi.depend.event.LiveCurrentGoalGlobalData;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveGoalEntity extends AbstractC20356314kz implements WeakHandler.IHandler {
    public final C20357914lF LLJJJJJIL = new C20357914lF("live_goal", 0, 35600000, 0, C1697810uHb.LJIIJJI("live_goal_ongoing", "live_goal_achieved_one", "live_goal_achieved_all", "live_goal_deleted", "never"), null, 20464);
    public final long LLJJJJLIIL = MultiGuestPlaybookLiveGoalSetting.INSTANCE.getValue();
    public final C1878960yzm LLJJL = new C1878960yzm(this);
    public final WeakHandler LLJJLIIIJLLLLLLLZ = new WeakHandler(Looper.getMainLooper(), this);

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        super.destroy();
        this.LLJJLIIIJLLLLLLLZ.removeMessages(0);
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 159));
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        C1125860fP6 c1125860fP6;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C1125830fP3 c1125830fP3 = (C1125830fP3) dataChannelGlobal.gg0(LiveCurrentGoalGlobalData.class);
        if (c1125830fP3 != null && (c1125860fP6 = c1125830fP3.LIZ) != null && c1125860fP6.LIZ > 0) {
            LJJIJ();
        } else {
            dataChannelGlobal.CQ2(LiveCurrentGoalGlobalData.class, this, new AwS610S0100000_31(this, 61));
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Integer numValueOf;
        if (message != null && (numValueOf = Integer.valueOf(message.what)) != null && numValueOf.intValue() == 0) {
            LJJLIIIJ(-1, "time out");
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        boolean z;
        String strLJIJI = C497740JfY.LJIJI(2131843703);
        String strLJIJI2 = C497740JfY.LJIJI(2131843703);
        C13BV c13bv = C13BV.INSTANCE;
        EnumC1779270wOz enumC1779270wOz = EnumC1779270wOz.DRAWABLE;
        if (!this.LLJILJILJ && !this.LLJIJIL) {
            z = false;
        } else {
            z = true;
        }
        return new C20361314ln(strLJIJI, strLJIJI2, R.drawable.cim, R.drawable.cim, c13bv, null, i, enumC1779270wOz, z, null, 3584);
    }

    public final void LJJLIIIJ(Integer num, String str) {
        this.LLJJLIIIJLLLLLLLZ.removeMessages(0);
        LJJLIIIIJ(0);
        if (Intrinsics.LJFF(str, "time out") && LiveGoalIntegrationSetting.INSTANCE.isEnable()) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(C497740JfY.LJII(), "aweme://roma_redirect/?spark_page=goal_edit_preset_page&roma_group_key=spark_page_goal_edit_preset_page&roma_page_key=p&entrance=playbook", AFwS276S0000000_31.get$arr$(254));
        } else if (num != null && num.intValue() != 0) {
            C766270U4b.LIZLLL(2131854130);
            C01N8.LIZ(num.intValue(), "entity_ready_to_start", this.LLJJJJJIL.LIZ, 0L, "anchor", str, "");
        }
        C1548820qPI.LJIIIIZZ("live_goal_jump_in_finish_event", this.LLJJL);
        this.LLJJL.LL = null;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        C013C c013c = new C013C();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LLJ, AFwS276S0000000_31.get$arr$(15), new AwS126S0400000_31(this, c20361214lm, interfaceC20354714kj, c013c, 3), AFwS276S0000000_31.get$arr$(16), C497740JfY.LJIJI(2131843703), Boolean.TRUE, null, Boolean.valueOf(z));
        return c013c.element;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        LJJLIIIIJ(1);
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(C497740JfY.LJII(), "aweme://roma_redirect/?spark_page=goal_edit_preset_page&roma_group_key=spark_page_goal_edit_preset_page&roma_page_key=p&entrance=playbook", AFwS276S0000000_31.get$arr$(17));
        if (interfaceC20354714kj != null) {
            interfaceC20354714kj.LJIIIIZZ(1, c20361214lm.LIZIZ);
            interfaceC20354714kj.LJFF(1, c20361214lm.LIZIZ);
        }
        LJJLIIIIJ(0);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) throws JSONException {
        if (this.LLJJJJJIL.LJ == 1) {
            long j = this.LLJJJJLIIL;
            if (j > 0) {
                this.LLJJLIIIJLLLLLLLZ.sendEmptyMessageDelayed(0, j);
                return;
            }
            return;
        }
        if (lifecycleOwner != null && PlaybookUtilKt.LIZJ(lifecycleOwner) != null) {
            LJJLIIIIJ(1);
            long j2 = this.LLJJJJLIIL;
            if (j2 > 0) {
                this.LLJJLIIIJLLLLLLLZ.sendEmptyMessageDelayed(0, j2);
            }
            C1878960yzm c1878960yzm = this.LLJJL;
            AwS432S0200000_31 awS432S0200000_31 = new AwS432S0200000_31(interfaceC20354714kj, c20361214lm, 34);
            c1878960yzm.getClass();
            c1878960yzm.LL = new WeakReference<>(awS432S0200000_31);
            C1548820qPI.LIZLLL("live_goal_jump_in_finish_event", c1878960yzm);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entrance", "playbook");
            jSONObject.put("gift_id", "");
            jSONObject.put("gift_count", "");
            C389001fE.LIZ("live_goal_jump_in_event", jSONObject, System.currentTimeMillis(), false);
        }
    }
}
