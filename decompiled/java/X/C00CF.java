package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00CF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CF extends C09AY implements Function0<String> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00CF(float f, float f2) {
        super(0);
        this.LL = f;
        this.LLILLJJLI = f2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("old level: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", new level: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
