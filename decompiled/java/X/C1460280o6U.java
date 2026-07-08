package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o6U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460280o6U extends C19IN {
    public boolean LLILZLL;
    public final /* synthetic */ C1460230o6P LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    @Override // X.C19IN
    public final void LIZ(View view) {
        InterfaceC1453760nvy interfaceC1453760nvyBr;
        boolean zLJI = MethodIDManager.LJI(72034);
        C1460230o6P c1460230o6P = this.LLIZ;
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 585);
        if (!c1460230o6P.LLLILZLLLI) {
            if (!c1460230o6P.LLLLLJLJLL(false) && (C1428470nHB.LJJZZI(c1460230o6P.getEditModel()) || C1428470nHB.LJLLI(c1460230o6P.getEditModel()))) {
                Activity activityRequireActivity = c1460230o6P.requireActivity();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131844961);
                C1390380mHk.LIZ(activityRequireActivity, 2037, creativeToastBuilder);
            }
        } else if (c1460230o6P.getEditModel().getAILivePhotoModel().LJIIJ() && c1460230o6P.LLLJL() != null) {
            InterfaceC1455680nz4 interfaceC1455680nz4LLLJL = c1460230o6P.LLLJL();
            if (interfaceC1455680nz4LLLJL != null) {
                interfaceC1455680nz4LLLJL.Qu(true, new AwS566S0100000_22(awS566S0100000_22, 577));
            }
        } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_audio_copyright_detect_story", true) != 1 || (interfaceC1453760nvyBr = c1460230o6P.br()) == null || !interfaceC1453760nvyBr.KB2("video_edit_page", "click_edit_page_next", !c1460230o6P.getEditModel().creativeModel.audioCopyrightDetectModel.getContinueSelected(), null, new AwS566S0100000_22(awS566S0100000_22, 579))) {
            C1460230o6P c1460230o6P2 = this.LLIZ;
            c1460230o6P2.LLLILZLLLI(new AwS266S0300000_22(c1460230o6P2, (C1460230o6P) this, (C1460280o6U) this.LLIZLLLIL, (Function0<Unit>) 17));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1460280o6U(C1460230o6P c1460230o6P, Function0<Unit> function0) {
        super(2500, 2);
        this.LLIZ = c1460230o6P;
        this.LLIZLLLIL = function0;
    }
}
