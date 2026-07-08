package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0zpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910840zpC extends C09AY implements Function2<C0SY7, C0SY7, Unit> {
    public final /* synthetic */ User LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ UserMatchedAssem LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910840zpC(User user, Context context, UserMatchedAssem userMatchedAssem, C05P0<Boolean> c05p0) {
        super(2);
        this.LL = user;
        this.LLILLJJLI = context;
        this.LLILLL = userMatchedAssem;
        this.LLILZ = c05p0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C0SY7 c0sy7, C0SY7 c0sy72) {
        C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("relation button of ");
        sbLIZ.append(this.LL.getNickname());
        sbLIZ.append(" is clicked, isClick: ");
        C05P0<Boolean> c05p0 = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = UserMatchedAssem.LLJJ;
        sbLIZ.append(c05p0.getValue().booleanValue());
        c1910890zpHLIZ.LIZ("UserMatchedAssem", C2188811AlT.LIZIZ(sbLIZ));
        if ((c0sy7 == C0SY7.UNFOLLOW || c0sy7 == C0SY7.UNFOLLOW_BUT_BE_FOLLOWED || c0sy72 == C0SY7.FOLLOW_REQUESTED) && !this.LLILZ.getValue().booleanValue()) {
            this.LLILZ.setValue(Boolean.TRUE);
            new C0ZDN(this.LLILLJJLI).LIZ(0);
            this.LLILLL.cp(true);
        }
        return Unit.LIZ;
    }
}
