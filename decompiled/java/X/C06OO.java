package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06OO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public class C06OO {
    public final EnumC1596306Mv LIZ;
    public final boolean LIZIZ = false;

    public C06OO(EnumC1596306Mv enumC1596306Mv) {
        this.LIZ = enumC1596306Mv;
    }

    public final void LIZIZ(String str, IChatNoticeFlowEngine iChatNoticeFlowEngine) {
        C0W8I.LIZ.getClass();
        if (C0W8I.LIZIZ() || C0W8I.LIZJ()) {
            try {
                C13E8<C1599606Oc> c13e8LJFF = iChatNoticeFlowEngine.LJFF();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(this.LIZ.getTrackingName());
                sbLIZ.append("] ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                System.currentTimeMillis();
                c13e8LJFF.addLast(new C1599606Oc());
                if (iChatNoticeFlowEngine.LJFF().size() > 50) {
                    iChatNoticeFlowEngine.LJFF().LJIILJJIL();
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final Object LIZ(EnumC1596306Mv enumC1596306Mv, IPromptUnifiedFrequencyController iPromptUnifiedFrequencyController, String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        InterfaceC1677406hY interfaceC1677406hYLIZ;
        if (enumC1596306Mv.getPriority() > this.LIZ.getPriority() && (enumC1596306Mv.getCanBeOverriden() || this.LIZ.getCanOverrideOthers())) {
            C1419505h3.LIZ.getClass();
            if (C1419505h3.LIZLLL && (interfaceC1677406hYLIZ = C1674606h6.LIZ(this)) != null) {
                return iPromptUnifiedFrequencyController.LJII(str, interfaceC1677406hYLIZ, null, System.currentTimeMillis(), interfaceC1364105Vn);
            }
            return true;
        }
        return false;
    }
}
