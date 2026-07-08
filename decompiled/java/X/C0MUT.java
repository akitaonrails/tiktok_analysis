package X;

import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot;
import com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard;
import com.ss.android.ugc.tools.chat.data.TaskInfo;
import irm.AkS26S0300000_8;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MUT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot$showFailView$3$1", f = "AITheaterSocialGeneratingMessageListProtocol.kt", l = {}, m = "invokeSuspend")
public final class C0MUT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AITheaterSocialGeneratingReusedUISlot LL;
    public final /* synthetic */ AIGCSocialModel LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MUT(AITheaterSocialGeneratingReusedUISlot aITheaterSocialGeneratingReusedUISlot, AIGCSocialModel aIGCSocialModel, List<String> list, String str, Long l, InterfaceC1364105Vn<? super C0MUT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aITheaterSocialGeneratingReusedUISlot;
        this.LLILLJJLI = aIGCSocialModel;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MUT(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        String str2;
        TaskInfo taskInfo;
        C1C7U.LIZ("AITheaterSocialGeneratingReusedUISlot@aa9e.showFailView$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLIZ = C0MXG.LIZ(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(this.LL)).getUuid());
        C0MXF c0mxf = C0MXF.GENERATION;
        if (iLIZ != c0mxf.getType()) {
            z = true;
        } else {
            z = false;
        }
        if (this.LL.op() || z) {
            Keva keva = C548360Lf0.LIZ;
            IcAigcCommonMessageCard icAigcCommonMessageCardLJJIII = ((C0MXT) C631370Opb.LIZ(this.LL)).LJJIII();
            if (icAigcCommonMessageCardLJJIII != null && (taskInfo = icAigcCommonMessageCardLJJIII.taskInfo) != null) {
                str = taskInfo.taskId;
            } else {
                str = null;
            }
            if (C548360Lf0.LIZ(null, str)) {
                C0MU2 c0mu2 = C0MU2.LIZ;
                AIGCSocialModel aIGCSocialModel = this.LLILLJJLI;
                List<String> list = this.LLILLL;
                c0mu2.getClass();
                C0MU2.LJII(C0MU2.LIZ(aIGCSocialModel, false, list, false), this.LLILZ, this.LLILZIL, null);
            }
            C0MU2 c0mu22 = C0MU2.LIZ;
            AIGCSocialModel aIGCSocialModel2 = this.LLILLJJLI;
            if (aIGCSocialModel2 != null) {
                str2 = aIGCSocialModel2.conversationId;
            } else {
                str2 = null;
            }
            Integer numLJ = C2286608xc.LJ(1);
            c0mu22.getClass();
            C0MU2.LIZLLL(numLJ, str2, "generate_aitheater_video_server_fail");
        }
        C0MXG.LIZLLL(c0mxf.getType(), C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(this.LL)).getUuid());
        ((TextView) this.LL.LLLF.getValue()).setText(C547930LeJ.LIZ(2131826028, new Object[0]));
        this.LL.tp().setButtonStartIcon(null);
        this.LL.tp().setText(C547930LeJ.LIZ(2131826044, new Object[0]));
        C786410Ut5.I7(new AkS26S0300000_8(this.LLILLJJLI, this.LLILLL, this.LL, 0), this.LL.tp());
        C786410Ut5.I7(new AkS26S0300000_8(this.LLILLJJLI, this.LLILLL, this.LL, 1), this.LL.up());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterSocialGeneratingReusedUISlot@aa9e.showFailView$3$1");
        return unit;
    }
}
