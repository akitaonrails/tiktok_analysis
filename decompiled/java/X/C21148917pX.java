package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17pX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21148917pX extends C09AY implements Function0<String> {
    public final /* synthetic */ AbstractC21154817qU LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21148917pX(AbstractC21154817qU abstractC21154817qU, String str, int i) {
        super(0);
        this.LL = abstractC21154817qU;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSameLocalAnchorTagAndIndex[");
        sbLIZ.append(this.LL.LLJIJIL);
        sbLIZ.append("]: (anchorTag: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("), (index: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
