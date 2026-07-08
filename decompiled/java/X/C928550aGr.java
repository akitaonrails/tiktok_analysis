package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAutoApprovalSetting;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C928550aGr extends C2217421BqW implements Function0<Unit> {
    public C928550aGr(Object obj) {
        super(0, obj, MultiLiveAsAnchorListDialogV2.class, "onAutoApprovalTipClose", "onAutoApprovalTipClose()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        multiLiveAsAnchorListDialogV2.getClass();
        C925650aCB.LIZJ(C925650aCB.LIZ(), "click", "cancel");
        Iterator<?> it2 = multiLiveAsAnchorListDialogV2.LLLLIIIILLL.LL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!(it2.next() instanceof C07U6)) {
                i++;
            } else if (i >= 0) {
                C1117360fBO c1117360fBO = multiLiveAsAnchorListDialogV2.LLLLIIIILLL;
                C930320aJi.LJIILJJIL((C410901il) c1117360fBO.LL, i, c1117360fBO);
            }
        }
        if (MultiGuestAutoApprovalSetting.INSTANCE.enable() && !InterfaceC934710aQn.sc.LIZIZ().booleanValue()) {
            View view = multiLiveAsAnchorListDialogV2.LLLI;
            if (view == null) {
                view = null;
            }
            C785230UrB c785230UrB = new C785230UrB(view);
            c785230UrB.LJFF = 80;
            c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c785230UrB.LJIIIZ = true;
            c785230UrB.LIZLLL(2131853884);
            c785230UrB.LJIILL = new C987210bnT(multiLiveAsAnchorListDialogV2, 6);
            c785230UrB.LJ = new ACListenerS150S0100000_15(multiLiveAsAnchorListDialogV2, 307);
            C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.ANCHOR_MULTI_SETTING_FOR_AUTO_APPROVAL, multiLiveAsAnchorListDialogV2.LLJI);
        }
        InterfaceC934710aQn.Pb.LJFF(Boolean.TRUE);
        return Unit.LIZ;
    }
}
