package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.199c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214922199c extends C09AY implements Function0<InterfaceC214902198i> {
    public final /* synthetic */ C199Y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C214922199c(C199Y c199y) {
        super(0);
        this.LL = c199y;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC214902198i invoke() {
        Class<? extends InterfaceC214902198i> rootFragmentClz = this.LL.getRootFragmentClz();
        if (rootFragmentClz != null) {
            return rootFragmentClz.newInstance();
        }
        "rootFragmentClz should be filled when saf enabled.".toString();
        throw new IllegalArgumentException("rootFragmentClz should be filled when saf enabled.");
    }
}
