package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.spacemember.vm.SubSpaceMemberVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502780Jng extends C09AY implements Function0<C502870Jnp> {
    public final /* synthetic */ SubSpaceMemberVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502780Jng(SubSpaceMemberVM subSpaceMemberVM) {
        super(0);
        this.LL = subSpaceMemberVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C502870Jnp invoke() {
        C502870Jnp c502870Jnp = new C502870Jnp();
        c502870Jnp.LIZLLL = this.LL;
        return c502870Jnp;
    }
}
