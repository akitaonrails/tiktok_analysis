package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876480YZy extends C09AY implements Function0<C876390YZp> {
    public final /* synthetic */ C876680YaI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876480YZy(C876680YaI c876680YaI) {
        super(0);
        this.LL = c876680YaI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C876390YZp invoke() {
        return new C876390YZp(this.LL, new C876520Ya2(this.LL), new C876500Ya0(this.LL), new C876490YZz(this.LL));
    }
}
