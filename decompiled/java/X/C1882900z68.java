package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882900z68 extends C09AY implements Function0<String> {
    public final /* synthetic */ AbstractC1882890z67<M> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882900z68(AbstractC1882890z67<M> abstractC1882890z67) {
        super(0);
        this.LL = abstractC1882890z67;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("__mix_card_");
        String str = this.LL.LLILLJJLI.LLILLL.cardClass;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(this.LL.LLJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
