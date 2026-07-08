package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ofr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625330Ofr extends C09AY implements Function0<String> {
    public final /* synthetic */ C625320Ofq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625330Ofr(C625320Ofq c625320Ofq) {
        super(0);
        this.LL = c625320Ofq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewpagerChanged, loadMoreJob ");
        AnonymousClass0956 anonymousClass0956 = this.LL.LL;
        sbLIZ.append(anonymousClass0956 != null ? Boolean.valueOf(anonymousClass0956.isActive()) : null);
        sbLIZ.append(", progressJob ");
        AnonymousClass0956 anonymousClass09562 = this.LL.LLILLJJLI;
        sbLIZ.append(anonymousClass09562 != null ? Boolean.valueOf(anonymousClass09562.isActive()) : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
