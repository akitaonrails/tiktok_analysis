package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590150rTx extends C09AY implements Function0<String> {
    public final /* synthetic */ ScrollSwitchStateManager LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590150rTx(ScrollSwitchStateManager scrollSwitchStateManager) {
        super(0);
        this.LL = scrollSwitchStateManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ScrollSwitchStateManager scrollSwitchStateManager = this.LL;
        Fragment fragmentVQ2 = scrollSwitchStateManager.vQ2();
        if (!(fragmentVQ2 instanceof InterfaceC1593630rZZ)) {
            return fragmentVQ2 instanceof InterfaceC1593550rZR ? "discovery" : fragmentVQ2 instanceof InterfaceC1564520qoc ? "homepage_friends" : fragmentVQ2 instanceof C0SSZ ? "personal_homepage" : "";
        }
        Fragment fragmentOQ2 = scrollSwitchStateManager.OQ2();
        return fragmentOQ2 instanceof InterfaceC1566480qrm ? "homepage_hot" : fragmentOQ2 instanceof InterfaceC1570670qyX ? "homepage_follow" : "";
    }
}
