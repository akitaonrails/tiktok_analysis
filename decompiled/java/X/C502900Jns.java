package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.vm.SubSpacePollMemberVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502900Jns extends C09AY implements Function0<C502870Jnp> {
    public final /* synthetic */ SubSpacePollMemberVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502900Jns(SubSpacePollMemberVM subSpacePollMemberVM) {
        super(0);
        this.LL = subSpacePollMemberVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C502870Jnp invoke() {
        C502870Jnp c502870Jnp = new C502870Jnp();
        c502870Jnp.LIZLLL = this.LL;
        return c502870Jnp;
    }
}
