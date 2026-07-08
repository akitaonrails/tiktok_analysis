package com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide;

import X.C01GW;
import X.C01JS;
import X.C01JT;
import X.C09JN;
import X.C1145050fu3;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C19487311Lz;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C480460Ism;
import X.C516801zq;
import X.C5182020e;
import X.C915980Zwa;
import X.C921180a4y;
import X.C924810aAp;
import X.C927940aFs;
import X.C928030aG1;
import X.C930540aK4;
import X.C930940aKi;
import X.C937570aVP;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import X.InterfaceC938950aXd;
import Y.AfS184S0100000_15;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.ApplyGuideParams;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class ApplyGuideViewModel extends AssemViewModel<C927940aFs> implements InterfaceC938950aXd {
    public final C01GW LL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(64));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C5182020e(this, 28));
    public final C11NJ LLILLL = new C11NJ();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C927940aFs();
    }

    public final void vQ2() {
        setState(AFwS250S0000000_15.get$arr$(43));
    }

    public final C937570aVP wQ2() {
        return (C937570aVP) this.LL.getValue();
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        C20441214yg.LIZIZ("ApplyLinkMicHandler", "onDestroy");
        C01GW c01gw = C1145050fu3.LIZ;
        C1145050fu3.LIZIZ((C01JT) this.LLILLJJLI.getValue());
        this.LLILLL.dispose();
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        long j;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        C20441214yg.LIZIZ("ApplyLinkMicHandler", "onCreate");
        C01GW c01gw = C1145050fu3.LIZ;
        C1145050fu3.LIZ((C01JT) this.LLILLJJLI.getValue());
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        if (roomLJIIIZ != null && (multiLiveUserSettings = roomLJIIIZ.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null) {
            j = multiLiveUserApplySettings.triggerGuideTime;
        } else {
            j = 0;
        }
        if (C928030aG1.LIZ() && j > 0) {
            C19487311Lz.LIZIZ(C11NZ.LJJJJZ(1).LJJI(j, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), this.LLILLL, new AfS184S0100000_15(this, 25), new C09JN() { // from class: X.00bm
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ApplyGuideViewModel@7f7.onCreate$2");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("trigger onError=");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("ApplyLinkMicHandler", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("ApplyGuideViewModel@7f7.onCreate$2");
                }
            }, null, null, 56);
        }
    }

    public static void yQ2(ApplyGuideViewModel applyGuideViewModel, LifecycleOwner lifecycleOwner, Function1 function1) {
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(true);
        c1770850wBP.LIZ = true;
        AssemViewModel.subscribeInternal$default(applyGuideViewModel, c1770850wBP, lifecycleOwner, null, function1, 4, null);
    }

    public final void xQ2(String str, C01JS c01js, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleTrigger business:");
        sbLIZ.append(str);
        sbLIZ.append(" rule:");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("ApplyLinkMicHandler", C2188811AlT.LIZIZ(sbLIZ));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            ApplyGuideParams applyGuideParams = new ApplyGuideParams();
            applyGuideParams.roomId = room.getId();
            applyGuideParams.channelId = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
            if (c01js != null) {
                applyGuideParams.triggerParamsJsonStr = c01js.LIZ();
            }
            applyGuideParams.triggerType = Intrinsics.LJFF(str2, "watch_time_over") ? 1 : 0;
            C924810aAp.LJ().LJJJJL = System.currentTimeMillis();
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZJ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).fetchGuideApply(applyGuideParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()), this.LLILLL, new C516801zq(this, str2, 1), new C09JN() { // from class: X.00bl
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ApplyGuideViewModel@7f7.handleTrigger$1$3");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("applyGuide error, ");
                    sbLIZ2.append(((Throwable) obj).getMessage());
                    C20441214yg.LJ("ApplyLinkMicHandler", C2188811AlT.LIZIZ(sbLIZ2));
                    C1C7U.LIZIZ("ApplyGuideViewModel@7f7.handleTrigger$1$3");
                }
            }, 24);
        }
    }
}
