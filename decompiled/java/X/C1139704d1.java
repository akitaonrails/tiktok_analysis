package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.PrivilegeDiscordItemDetailFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04d1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1139704d1 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PrivilegeDiscordItemDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1139704d1(PrivilegeDiscordItemDetailFragment privilegeDiscordItemDetailFragment) {
        super(1);
        this.LL = privilegeDiscordItemDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1139604d0());
        return Unit.LIZ;
    }
}
