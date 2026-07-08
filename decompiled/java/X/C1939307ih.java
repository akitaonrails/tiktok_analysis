package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1939307ih extends C09AY implements Function0<Object> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1939307ih(Object obj, String str, boolean z) {
        super(0);
        this.LL = obj;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page: ");
        sbLIZ.append(this.LL.getClass().getName());
        sbLIZ.append("\nbtm: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("\nauto: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
