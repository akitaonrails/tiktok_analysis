package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05dJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1396305dJ extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C817403Hg LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1396305dJ(String str, float f, C817403Hg c817403Hg) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = f;
        this.LLILLL = c817403Hg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add [");
        sbLIZ.append(this.LL);
        sbLIZ.append("], text width: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", remainWidth: ");
        sbLIZ.append(this.LLILLL.element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
