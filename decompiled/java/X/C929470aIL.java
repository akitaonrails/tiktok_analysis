package X;

import Y.AcS496S0100000_15;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aIL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C929470aIL extends C2217421BqW implements Function0<Unit> {
    public C929470aIL(Object obj) {
        super(0, obj, MultiLiveAsAnchorListDialogV2.class, "onAutoApprovalBtnClicked", "onAutoApprovalBtnClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        multiLiveAsAnchorListDialogV2.getClass();
        C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.Ob;
        if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
            c20337914i1.LJFF(Boolean.TRUE);
            C782110Um9 c782110Um9 = new C782110Um9(multiLiveAsAnchorListDialogV2.getContext());
            c782110Um9.LJIILL = false;
            c782110Um9.LJIIZILJ(2131853879);
            c782110Um9.LJII(2131853876);
            c782110Um9.LJIIJ(2131853878, new InterfaceC743640TFa() { // from class: X.0aIM
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    C925650aCB.LIZIZ("click", "not_now", "connection_page");
                }
            });
            c782110Um9.LJIILIIL(2131853877, new AcS496S0100000_15(multiLiveAsAnchorListDialogV2, 69));
            C786410Ut5.E4(c782110Um9.LIZ());
            C925650aCB.LIZIZ("show", null, "connection_page");
        } else {
            multiLiveAsAnchorListDialogV2.LLIILII();
        }
        return Unit.LIZ;
    }
}
