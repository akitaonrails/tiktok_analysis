package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.view.assem.PollMemberListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502960Jny extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PollMemberListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502960Jny(PollMemberListAssem pollMemberListAssem) {
        super(0);
        this.LL = pollMemberListAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((C491870JQr) this.LL.LLJJIJI.getValue()).LIZ();
        this.LL.hp();
        return Unit.LIZ;
    }
}
