package Y;

import X.AbstractC960500b6O;
import X.C01EX;
import X.C09JN;
import X.C1C7U;
import X.C238400w2;
import X.C915980Zwa;
import X.C916490ZxP;
import X.C919310a1x;
import X.C923170a8B;
import X.C925150aBN;
import X.C935480aS2;
import X.C936270aTJ;
import X.C946050aj5;
import X.C946060aj6;
import X.C950790aqj;
import X.C955540ayO;
import X.C955590ayT;
import X.C956780b0O;
import X.C960610b6Z;
import X.C960620b6a;
import X.C963140bAe;
import X.EnumC918990a1R;
import X.InterfaceC954180awC;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.SharedBgStatusChangeEvent;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS102S0110000_15;

/* JADX INFO: loaded from: classes16.dex */
public class AfS0S0410100_15 implements C09JN {
    public final int $t;
    public long j5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0410100_15 afS0S0410100_15, Object obj) {
        C1C7U.LIZ("BaseMultiCoHostInviteListPresenter@7cd8.apply$2");
        C955590ayT c955590ayT = (C955590ayT) afS0S0410100_15.l0;
        C955540ayO c955540ayO = (C955540ayO) afS0S0410100_15.l1;
        boolean z = afS0S0410100_15.z4;
        String str = c955590ayT.LJII;
        if (str == null) {
            str = "";
        }
        C950790aqj.LIZJ(c955590ayT, c955540ayO, z, str, (AbstractC960500b6O) afS0S0410100_15.l2, afS0S0410100_15.j5, ((C238400w2) afS0S0410100_15.l3).element);
        C1C7U.LIZIZ("BaseMultiCoHostInviteListPresenter@7cd8.apply$2");
    }

    public static final void accept$1(AfS0S0410100_15 afS0S0410100_15, Object obj) {
        C1C7U.LIZ("MultiCoHostHistoryPresenter@e856.apply$2");
        C950790aqj.LIZJ((C955590ayT) afS0S0410100_15.l0, (C955540ayO) afS0S0410100_15.l1, afS0S0410100_15.z4, "", (C960620b6a) afS0S0410100_15.l2, afS0S0410100_15.j5, ((C238400w2) afS0S0410100_15.l3).element);
        C1C7U.LIZIZ("MultiCoHostHistoryPresenter@e856.apply$2");
    }

    public static final void accept$2(AfS0S0410100_15 afS0S0410100_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSearchPresenter@ec83.apply$2");
        C950790aqj.LIZJ((C955590ayT) afS0S0410100_15.l0, (C955540ayO) afS0S0410100_15.l1, afS0S0410100_15.z4, "", (C960610b6Z) afS0S0410100_15.l2, afS0S0410100_15.j5, ((C238400w2) afS0S0410100_15.l3).element);
        C1C7U.LIZIZ("MultiCoHostSearchPresenter@ec83.apply$2");
    }

    public static final void accept$3(AfS0S0410100_15 afS0S0410100_15, Object obj) {
        Integer numValueOf;
        int iLIZIZ;
        String resourceId;
        C946060aj6 c946060aj6XQ2;
        C946050aj5 c946050aj5LIZIZ;
        String resourceId2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        EnumC918990a1R enumC918990a1RLIZ;
        String strLIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        String resourceId3;
        C1C7U.LIZ("MultiGuestSharedBgAnchorViewModel@72.onSelectedSharedBg$result$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (((LiveEffect) afS0S0410100_15.l0) != null && PlayEntityUtilKt.LJIIJ("shared_background")) {
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "onSelectSharedBg, abort setState, mutex scene running after api success");
            Function0 function0 = (Function0) afS0S0410100_15.l1;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            DataChannel dataChannel = ((MultiGuestSharedBgAnchorViewModel) afS0S0410100_15.l2).LL;
            String resourceId4 = null;
            if (dataChannel != null) {
                LiveEffect liveEffect = (LiveEffect) afS0S0410100_15.l0;
                if (liveEffect != null) {
                    resourceId3 = liveEffect.getResourceId();
                } else {
                    resourceId3 = null;
                }
                dataChannel.SX0(C956780b0O.class, C936270aTJ.LIZ(resourceId3));
            }
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "onSelectSharedBg, update settings success");
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = C925150aBN.LJFF();
            if (multiLiveAnchorPanelSettingsLJFF != null) {
                numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsLJFF.fixMicNumAction);
            } else {
                numValueOf = null;
            }
            if (numValueOf == null || numValueOf.intValue() != 0) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    iLIZIZ = interfaceC954180awCLLJLL.LIZIZ();
                } else {
                    iLIZIZ = 0;
                }
                int i = iLIZIZ - 1;
                if (((LiveEffect) afS0S0410100_15.l0) != null && i < 1) {
                    ((MultiGuestSharedBgAnchorViewModel) afS0S0410100_15.l2).JQ2(2131843385, "pm_mt_multiWallpaper_liveScreen_finishedState_toast");
                }
            }
            if (!C936270aTJ.LIZLLL() && ((LiveEffect) afS0S0410100_15.l0) != null) {
                C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "onSelectSharedBg, auto switch to grid layout");
                MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) != null && (enumC918990a1RLIZ = C923170a8B.LIZ(multiLiveAnchorPanelSettingsLIZIZ)) != null) {
                    MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) afS0S0410100_15.l2;
                    MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
                    if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
                        strLIZ = C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZIZ2);
                    } else {
                        strLIZ = null;
                    }
                    multiGuestSharedBgAnchorViewModel.getClass();
                    MultiGuestSharedBgAnchorViewModel.KQ2(enumC918990a1RLIZ, strLIZ);
                }
            }
            C935480aS2 c935480aS2 = ((MultiGuestSharedBgAnchorViewModel) afS0S0410100_15.l2).LLILLL;
            if (c935480aS2 != null) {
                c935480aS2.LIZJ();
            }
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel2 = (MultiGuestSharedBgAnchorViewModel) afS0S0410100_15.l2;
            LiveEffect liveEffect2 = (LiveEffect) afS0S0410100_15.l0;
            multiGuestSharedBgAnchorViewModel2.LLILLL = new C935480aS2(liveEffect2, multiGuestSharedBgAnchorViewModel2.LLILZ, false);
            if (liveEffect2 != null) {
                resourceId = liveEffect2.getResourceId();
            } else {
                resourceId = null;
            }
            boolean zBQ2 = multiGuestSharedBgAnchorViewModel2.BQ2(!TextUtils.isEmpty(resourceId));
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel3 = (MultiGuestSharedBgAnchorViewModel) afS0S0410100_15.l2;
            multiGuestSharedBgAnchorViewModel3.LLJJI = afS0S0410100_15.z4;
            multiGuestSharedBgAnchorViewModel3.setState(new AwS102S0110000_15((LiveEffect) afS0S0410100_15.l0, zBQ2, 1));
            Function0 function02 = (Function0) afS0S0410100_15.l3;
            if (function02 != null) {
                function02.invoke();
            }
            DataChannel dataChannel2 = ((MultiGuestSharedBgAnchorViewModel) afS0S0410100_15.l2).LL;
            if (dataChannel2 != null && (c946060aj6XQ2 = MultiGuestSharedBgAnchorViewModel.xQ2(dataChannel2)) != null && (c946050aj5LIZIZ = c946060aj6XQ2.LIZIZ()) != null) {
                LiveEffect liveEffect3 = (LiveEffect) afS0S0410100_15.l0;
                if (liveEffect3 == null || (resourceId2 = liveEffect3.getResourceId()) == null) {
                    resourceId2 = "";
                }
                c946050aj5LIZIZ.LIZ(new SharedEffect(resourceId2, "", (LiveEffect) afS0S0410100_15.l0));
            }
            DataChannel dataChannel3 = ((MultiGuestSharedBgAnchorViewModel) afS0S0410100_15.l2).LL;
            if (dataChannel3 != null) {
                LiveEffect liveEffect4 = (LiveEffect) afS0S0410100_15.l0;
                if (liveEffect4 != null) {
                    resourceId4 = liveEffect4.getResourceId();
                }
                dataChannel3.LC0(SharedBgStatusChangeEvent.class, resourceId4);
            }
            C01EX.LIZLLL(C963140bAe.LIZIZ() - afS0S0410100_15.j5, "change_sahred_bg", baseResponse.LIZIZ, "change_sahred_bg");
        }
        C1C7U.LIZIZ("MultiGuestSharedBgAnchorViewModel@72.onSelectedSharedBg$result$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0000: IPUT (r9 I:int), (r1 I:Y.AfS0S0410100_15) (LINE:117440512) Y.AfS0S0410100_15.$t int, block:B:2:0x0000 */
    public AfS0S0410100_15(Object obj, LiveEffect liveEffect, Function0<Unit> function0, MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, boolean z, Function0<Unit> function02, long j) {
        int i;
        this.$t = i;
        this.l0 = obj;
        this.l1 = liveEffect;
        this.l2 = function0;
        this.z4 = multiGuestSharedBgAnchorViewModel;
        this.l3 = z;
        this.j5 = function02;
    }
}
