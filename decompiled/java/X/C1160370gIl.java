package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160370gIl extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160370gIl(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = i5;
        this.LLILZLL = i6;
        this.LLIZ = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenListAdapterDataObserver.tailLoadMoreViewportNearTopRepair positionStart=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" itemCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" first=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" last=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" visibleSpan=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" lanes=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(" maxLastInclusive=");
        sbLIZ.append(this.LLIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
