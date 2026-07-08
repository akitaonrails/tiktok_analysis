package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841360WzW extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Object LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C841360WzW(int i, Object obj) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addInterceptor id: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" result: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
