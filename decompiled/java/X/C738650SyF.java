package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.top.TopStatusBarVM;
import com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedEarphonePlayerControlComponent;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS42S0000100_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738650SyF extends BroadcastReceiver {
    public final int $t;
    public Object l0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.$t) {
            case 0:
                onReceive$0(this, context, intent);
                break;
            case 1:
                onReceive$1(this, context, intent);
                break;
            default:
                super.onReceive(context, intent);
                break;
        }
    }

    public final void LIZ$0(Intent intent) {
        String action;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (Intrinsics.LJFF(action, "android.intent.action.TIME_TICK")) {
            TopStatusBarVM topStatusBarVM = (TopStatusBarVM) this.l0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            topStatusBarVM.getClass();
            topStatusBarVM.setState(new AwS42S0000100_29(jCurrentTimeMillis, 1));
        }
    }

    public final void LIZ$1(Intent intent) {
        String action;
        Aweme awemeLLLLLJLJLL;
        Aweme awemeLLLLLJLJLL2;
        String previousPage;
        Aweme awemeLLLLLJLJLL3;
        Aweme awemeLLLLLJLJLL4 = null;
        String fromGroupId = null;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (Intrinsics.LJFF(action, "android.media.AUDIO_BECOMING_NOISY")) {
            LandscapeFeedPlayerAbility landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) ((LandscapeFeedEarphonePlayerControlComponent) this.l0).LLILLJJLI.getValue();
            if (landscapeFeedPlayerAbility != null && landscapeFeedPlayerAbility.isPlaying()) {
                LandscapeFeedPlayerAbility landscapeFeedPlayerAbility2 = (LandscapeFeedPlayerAbility) ((LandscapeFeedEarphonePlayerControlComponent) this.l0).LLILLJJLI.getValue();
                if (landscapeFeedPlayerAbility2 != null) {
                    LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) ((LandscapeFeedEarphonePlayerControlComponent) this.l0).LL.getValue();
                    if (landscapeFeedViewPagerAbility != null && (awemeLLLLLJLJLL3 = landscapeFeedViewPagerAbility.LLLLLJLJLL()) != null) {
                        landscapeFeedPlayerAbility2.Y2(awemeLLLLLJLJLL3, true, false);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                String strLIZ = C1389300mG0.LIZ(((LandscapeFeedEarphonePlayerControlComponent) this.l0).getPanelContext());
                LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility2 = (LandscapeFeedViewPagerAbility) ((LandscapeFeedEarphonePlayerControlComponent) this.l0).LL.getValue();
                if (landscapeFeedViewPagerAbility2 != null) {
                    awemeLLLLLJLJLL = landscapeFeedViewPagerAbility2.LLLLLJLJLL();
                } else {
                    awemeLLLLLJLJLL = null;
                }
                C584080MvW.LIZIZ(awemeLLLLLJLJLL, "play", strLIZ);
                LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility3 = (LandscapeFeedViewPagerAbility) ((LandscapeFeedEarphonePlayerControlComponent) this.l0).LL.getValue();
                if (landscapeFeedViewPagerAbility3 != null && (awemeLLLLLJLJLL2 = landscapeFeedViewPagerAbility3.LLLLLJLJLL()) != null) {
                    LandscapeFeedEarphonePlayerControlComponent landscapeFeedEarphonePlayerControlComponent = (LandscapeFeedEarphonePlayerControlComponent) this.l0;
                    C735740StY c735740StY = new C735740StY();
                    c735740StY.LJJLIIIJLLLLLLLZ = "earphone_disconnected";
                    c735740StY.LJJIJIL(C1389300mG0.LJ(landscapeFeedEarphonePlayerControlComponent.getPanelContext()), awemeLLLLLJLJLL2);
                    c735740StY.LJJLIIIJ = C1389300mG0.LIZ(landscapeFeedEarphonePlayerControlComponent.getPanelContext());
                    C2189821An6 c2189821An6 = landscapeFeedEarphonePlayerControlComponent.getPanelContext().LIZJ;
                    if (c2189821An6 != null) {
                        previousPage = c2189821An6.getPreviousPage();
                    } else {
                        previousPage = null;
                    }
                    C2189821An6 c2189821An62 = landscapeFeedEarphonePlayerControlComponent.getPanelContext().LIZJ;
                    if (c2189821An62 != null) {
                        fromGroupId = c2189821An62.getFromGroupId();
                    }
                    c735740StY.LJJLIIIIJ = C584760Mwc.LIZ(previousPage, fromGroupId);
                    c735740StY.LJIILJJIL();
                }
                ((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LIZJ("landscape_feed", true);
                return;
            }
            String strLIZ2 = C1389300mG0.LIZ(((LandscapeFeedEarphonePlayerControlComponent) this.l0).getPanelContext());
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility4 = (LandscapeFeedViewPagerAbility) ((LandscapeFeedEarphonePlayerControlComponent) this.l0).LL.getValue();
            if (landscapeFeedViewPagerAbility4 != null) {
                awemeLLLLLJLJLL4 = landscapeFeedViewPagerAbility4.LLLLLJLJLL();
            }
            C584080MvW.LIZIZ(awemeLLLLLJLJLL4, "pause", strLIZ2);
        }
    }

    public C738650SyF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onReceive$0(C738650SyF c738650SyF, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c738650SyF.LIZ$0(intent);
        } else {
            C2408409cA.LIZ();
            c738650SyF.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(C738650SyF c738650SyF, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c738650SyF.LIZ$1(intent);
        } else {
            C2408409cA.LIZ();
            c738650SyF.LIZ$1(intent);
        }
    }
}
