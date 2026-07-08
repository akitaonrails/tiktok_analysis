package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12EM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12EM extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12EM(boolean z, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorCtaView bindData normal, shouldPlayExpansion: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shouldPlayCtaWidthOnly: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
