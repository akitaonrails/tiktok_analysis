package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504370JqF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubSpaceFeedVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504370JqF(SubSpaceFeedVM subSpaceFeedVM) {
        super(0);
        this.LL = subSpaceFeedVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL.LL;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
        if (subSpaceFeedAbility != null) {
            subSpaceFeedAbility.LJJLI();
        }
        return Unit.LIZ;
    }
}
