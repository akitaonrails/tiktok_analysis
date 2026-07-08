package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.spacemember.view.assem.SpaceMemberListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502810Jnj extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ SpaceMemberListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502810Jnj(SpaceMemberListAssem spaceMemberListAssem) {
        super(1);
        this.LL = spaceMemberListAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        SpaceMemberListAssem spaceMemberListAssem = this.LL;
        FrameLayout frameLayout = spaceMemberListAssem.LLJJIII;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = spaceMemberListAssem.LLJJIII;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        C501540Jlg.LIZJ(this.LL.getContext(), th2);
        ((C491870JQr) this.LL.LLJJIJI.getValue()).LIZJ(true);
        return Unit.LIZ;
    }
}
