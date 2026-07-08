package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0K7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512430K7t extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubPrivilegeDetailFullPage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512430K7t(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage) {
        super(0);
        this.LL = subPrivilegeDetailFullPage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveIconView liveIconViewOR;
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = this.LL;
        C0K8A c0k8a = subPrivilegeDetailFullPage.LLJJJIL;
        if (c0k8a != null && (liveIconViewOR = subPrivilegeDetailFullPage.OR()) != null) {
            HandlerHook.viewPost(liveIconViewOR, new RunnableC512390K7p(subPrivilegeDetailFullPage, c0k8a));
        }
        return Unit.LIZ;
    }
}
