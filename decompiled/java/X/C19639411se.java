package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11se, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19639411se extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19639411se(int i, int i2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adjustPreviewStickerLayout: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
