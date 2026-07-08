package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505060JrM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubSpaceDetailVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505060JrM(SubSpaceDetailVM subSpaceDetailVM) {
        super(0);
        this.LL = subSpaceDetailVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL.LL;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        SubSpaceDetailAbility subSpaceDetailAbility = (SubSpaceDetailAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceDetailAbility.class, null);
        if (subSpaceDetailAbility != null) {
            subSpaceDetailAbility.LJJLI();
        }
        return Unit.LIZ;
    }
}
