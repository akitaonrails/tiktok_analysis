package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yjw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869140yjw extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1869140yjw(String str, boolean z, Boolean bool) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = bool;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(", forward: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reuse: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
