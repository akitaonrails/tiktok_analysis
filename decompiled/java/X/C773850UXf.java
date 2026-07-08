package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.EnterRoom3sEvent;
import com.bytedance.android.livesdk.dataChannel.ShowAudienceInteractionFeatureToolbarChannel;
import com.bytedance.android.livesdk.dataChannel.ShowInteractionFeatureDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773850UXf implements InterfaceViewOnClickListenerC1102800enu {
    public final C01GW LL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(504));
    public DataChannel LLILLJJLI;
    public InterfaceC1103130eoR LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public C1110120ezi LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean f1() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    public final void LIZ() {
        FragmentManager fragmentManager;
        LiveDialogFragment liveDialogFragment = (LiveDialogFragment) this.LL.getValue();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        C492400JSs.LIZ(liveDialogFragment, fragmentManager, "ToolbarInteractionFeatureBehavior");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Map map;
        C0N1P c0n1p;
        String str2;
        C19EG c19egLJ;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LLIZ >= 500) {
            this.LLIZ = jUptimeMillis;
            if (this.LLIZLLLIL) {
                str = "long_press";
            } else {
                str = "click";
            }
            Map map2 = (Map) DataChannelGlobal.LLILZ.gg0(C1148020fyq.class);
            DataChannel dataChannel = this.LLILLJJLI;
            C0N1P c0n1p2 = null;
            if (dataChannel != null) {
                map = (Map) dataChannel.gg0(C754590Tir.class);
            } else {
                map = null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (map2 != null) {
                Iterator it2 = map2.keySet().iterator();
                while (it2.hasNext()) {
                    long jLongValue = ((Number) it2.next()).longValue();
                    if (Intrinsics.LJFF(map2.get(Long.valueOf(jLongValue)), Boolean.TRUE)) {
                        arrayList.add(Long.valueOf(jLongValue));
                    }
                }
            }
            if (map != null) {
                Iterator it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    long jLongValue2 = ((Number) it3.next()).longValue();
                    if (Intrinsics.LJFF(map.get(Long.valueOf(jLongValue2)), Boolean.TRUE)) {
                        arrayList2.add(Long.valueOf(jLongValue2));
                    }
                }
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_interaction_entrance_click");
            c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
            C1110120ezi c1110120ezi = this.LLILZLL;
            if (c1110120ezi != null) {
                c0n1p = c1110120ezi.LJII;
            } else {
                c0n1p = null;
            }
            C0N1P c0n1p3 = C0N1P.CUSTOM_POLL;
            if (c0n1p == c0n1p3) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "is_end_show");
            c474500IjALIZ.LJJII(str, "method");
            c474500IjALIZ.LJJII(arrayList.toString(), "envelope_permission");
            c474500IjALIZ.LJJII(arrayList2.toString(), "goody_bag_permission");
            c474500IjALIZ.LIZ();
            this.LLIZLLLIL = false;
            C1110120ezi c1110120ezi2 = this.LLILZLL;
            if (c1110120ezi2 != null) {
                c0n1p2 = c1110120ezi2.LJII;
            }
            if (c0n1p2 == c0n1p3) {
                if (c1110120ezi2 != null) {
                    c1110120ezi2.LJI();
                }
                Context context = view.getContext();
                if (context != null && (c19egLJ = C500260Jjc.LJ(context)) != null) {
                    ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Sc2("interaction_entrance", c19egLJ, this.LLILLJJLI, true, "");
                    return;
                }
                return;
            }
            LIZ();
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean x0(View view) {
        this.LLIZLLLIL = true;
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        C0IK5.LIZLLL(this);
        C1110120ezi c1110120ezi = this.LLILZLL;
        if (c1110120ezi != null) {
            c1110120ezi.LJIIIIZZ();
        }
        this.LLILZLL = null;
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC1103130eoR;
        interfaceC1103130eoR.LIZLLL();
        interfaceC1103130eoR.getContext();
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(dataChannel2.LLILZ, ShowAudienceInteractionFeatureToolbarChannel.class, new AwS591S0100000_12(this, 1119));
            dataChannel2.BQ2(dataChannel2.LLILZ, EnterRoom3sEvent.class, new AwS591S0100000_12(this, 1120));
            dataChannel2.BQ2(dataChannel2.LLILZ, ShowInteractionFeatureDialogEvent.class, new AwS591S0100000_12(this, 1121));
        }
        this.LLILZLL = new C1110120ezi(dataChannel, EnumC773890UXj.INTERACTION, interfaceC1103130eoR);
        C486790J7d.LIZ.post(new ARunnableS112S0100000_12(this, 432), this);
    }
}
