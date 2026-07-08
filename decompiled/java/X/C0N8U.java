package X;

import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N8U, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N8U extends C09AY implements Function0<InterfaceC2258651Dap> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0N8U(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2258651Dap invoke() {
        C0N8O c0n8o = new C0N8O(this.LL.exposureSourceDelegate, new C584970Mwx(0));
        c0n8o.LJIILL();
        return c0n8o;
    }
}
