package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.view.assem.PollMemberListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jnz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502970Jnz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PollMemberListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502970Jnz(PollMemberListAssem pollMemberListAssem) {
        super(0);
        this.LL = pollMemberListAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PollMemberListAssem pollMemberListAssem = this.LL;
        FrameLayout frameLayout = pollMemberListAssem.LLJJIII;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = pollMemberListAssem.LLJJIII;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        return Unit.LIZ;
    }
}
