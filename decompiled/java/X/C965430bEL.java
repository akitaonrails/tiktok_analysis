package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import kotlin.jvm.functions.Function2;
import tikcast.linkmic.common.GroupChannelAllUser;

/* JADX INFO: renamed from: X.0bEL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965430bEL extends C09AY implements Function2<String, C965950bFB, RechargeResult> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ InterfaceC966890bGh<RechargeResult> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965430bEL(C966020bFI c966020bFI, InterfaceC966890bGh<RechargeResult> interfaceC966890bGh) {
        super(2);
        this.LL = c966020bFI;
        this.LLILLJJLI = interfaceC966890bGh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final RechargeResult invoke(String str, C965950bFB c965950bFB) {
        GroupChannelAllUser groupChannelAllUser = (GroupChannelAllUser) C966250bFf.LIZ(c965950bFB.LIZIZ, GroupChannelAllUser.class);
        C966020bFI c966020bFI = this.LL;
        C965350bED c965350bED = c966020bFI.LJJ;
        String str2 = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call on recharge resp: ");
        sbLIZ.append(groupChannelAllUser);
        C965450bEN c965450bEN = null;
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (this.LLILLJJLI != null) {
            c965450bEN = new C965450bEN(this.LL);
        }
        return new RechargeResult(groupChannelAllUser, "", 0L, true, c965450bEN);
    }
}
