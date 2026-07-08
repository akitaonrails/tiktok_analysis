package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14Zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20285914Zd extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C21610619ho LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20285914Zd(boolean z, boolean z2, boolean z3, C21610619ho c21610619ho) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = c21610619ho;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SwipeRefreshBlock] updateSwipeRefreshBlocker enabled=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", expEnable=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shouldEnable=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", swipeRefreshLayoutAttached=");
        sbLIZ.append(this.LLILZ != null);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LLILLL ? "swipeRefreshBlockCallback" : "null");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
