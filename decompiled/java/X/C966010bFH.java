package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966010bFH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C967670bHx LLILLJJLI;
    public final /* synthetic */ C2231741CWm LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966010bFH(C966020bFI c966020bFI, C967670bHx c967670bHx, C2231741CWm c2231741CWm) {
        super(0);
        this.LL = c966020bFI;
        this.LLILLJJLI = c967670bHx;
        this.LLILLL = c2231741CWm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C966020bFI c966020bFI = this.LL;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            LinkUser linkUserLJ = C1282000jSw.LJ(this.LLILLJJLI.LIZIZ);
            int i = this.LLILLJJLI.LIZJ ? 1 : 2;
            OnLineMicInfo onLineMicInfoBuild = new OnLineMicInfo.Builder().build();
            C967670bHx c967670bHx = this.LLILLJJLI;
            LayoutDSLConfig layoutDSLConfig = new LayoutDSLConfig((int) c967670bHx.LIZLLL, c967670bHx.LJ);
            C966020bFI c966020bFI2 = this.LL;
            C2231741CWm c2231741CWm = this.LLILLL;
            c966020bFI2.getClass();
            LinkLayerMessage linkLayerMessageLJIILJJIL = C966020bFI.LJIILJJIL(c2231741CWm);
            if (linkLayerMessageLJIILJJIL == null) {
                linkLayerMessageLJIILJJIL = new LinkLayerMessage(0, 0L, 4, null, null, null, null, null, null, null, null, null, null, null, null, null);
            }
            interfaceC965990bFF.LJLZ(c966020bFI, new PermitApplyMessage(linkUserLJ, i, onLineMicInfoBuild, layoutDSLConfig, C954920axO.LJ(linkLayerMessageLJIILJJIL, new ExtraDataWrapper(null, Double.valueOf(this.LLILLL.LJFF), 0L, new LinkMessage())), C1282000jSw.LJ(this.LLILLJJLI.LIZ), null));
        }
        return Unit.LIZ;
    }
}
