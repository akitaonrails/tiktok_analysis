package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841230WzJ extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C841230WzJ(int i, String str, String str2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postInvoke id: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" className: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" memberName: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
