package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505130JrT extends C09AY implements Function0<C504890Jr5> {
    public final /* synthetic */ SubSpaceDetailVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505130JrT(SubSpaceDetailVM subSpaceDetailVM) {
        super(0);
        this.LL = subSpaceDetailVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C504890Jr5 invoke() {
        return new C504890Jr5(this.LL.vQ2());
    }
}
