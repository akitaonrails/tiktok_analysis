package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511800K5i extends C09AY implements Function1<AbstractC509530JyZ, Unit> {
    public final /* synthetic */ C259800zU<Fragment> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C511800K5i(C259800zU<Fragment> c259800zU) {
        super(1);
        this.LL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC509530JyZ abstractC509530JyZ) {
        C508910JxZ.LIZ(abstractC509530JyZ, new C511810K5j(this.LL));
        return Unit.LIZ;
    }
}
