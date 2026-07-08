package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ofs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625340Ofs extends C09AY implements Function0<String> {
    public final /* synthetic */ C625320Ofq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625340Ofs(C625320Ofq c625320Ofq) {
        super(0);
        this.LL = c625320Ofq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryDismissPush, loadMoreJob ");
        sbLIZ.append(this.LL.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
