package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ofb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625170Ofb extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C625320Ofq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625170Ofb(C625320Ofq c625320Ofq, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c625320Ofq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("1 triggerPopupByProgressBarState start ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", progressJob is active ");
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI.LLILLJJLI;
        sbLIZ.append(anonymousClass0956 != null ? Boolean.valueOf(anonymousClass0956.isActive()) : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
