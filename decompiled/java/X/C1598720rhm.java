package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS36S0010000_24;

/* JADX INFO: renamed from: X.0rhm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598720rhm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InboxSkylightWidgetV2 LL;
    public final /* synthetic */ SkylightListViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598720rhm(InboxSkylightWidgetV2 inboxSkylightWidgetV2, SkylightListViewModel skylightListViewModel, boolean z, int i) {
        super(0);
        this.LL = inboxSkylightWidgetV2;
        this.LLILLJJLI = skylightListViewModel;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.getClass();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C1598660rhg.LIZ.getClass();
            C1598730rhn.LIZJ(C1598660rhg.LIZLLL, 11);
            C1598660rhg.LJ.LIZIZ(2);
        } else {
            C1600070rjx.LIZIZ(new AwS36S0010000_24(C298520Bn0.LIZ(), 21));
            InboxSkylightWidgetV2 inboxSkylightWidgetV2 = this.LL;
            inboxSkylightWidgetV2.LLJJIJI = null;
            inboxSkylightWidgetV2.LLJJIJIIJIL = null;
            inboxSkylightWidgetV2.LLJJIJIL = null;
            this.LLILLJJLI.HQ2(true);
            this.LL.LLJJJ = true;
            AnonymousClass0956 anonymousClass0956 = this.LL.LLJJJJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            InboxSkylightWidgetV2 inboxSkylightWidgetV22 = this.LL;
            inboxSkylightWidgetV22.LLJJJJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(inboxSkylightWidgetV22), C0PEM.LIZJ, null, new C1598640rhe(this.LL, this.LLILLL, this.LLILZ, this.LLILLJJLI, null), 2);
            ICelebrationCreateService iCelebrationCreateService = (ICelebrationCreateService) PluggableExtentionKt.pluggableSpi$default(ICelebrationCreateService.class, false, false, false, 14, null);
            if (iCelebrationCreateService != null) {
                iCelebrationCreateService.loadCelebrationMaterial(this.LL.getContext(), 5);
            }
        }
        return Unit.LIZ;
    }
}
