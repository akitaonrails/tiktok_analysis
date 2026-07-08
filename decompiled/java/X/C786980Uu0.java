package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Uu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786980Uu0 extends C09AY implements Function0<String> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C786980Uu0(float f, float f2) {
        super(0);
        this.LL = f;
        this.LLILLJJLI = f2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchNestedPreFling: velocityX=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", velocityY=");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
