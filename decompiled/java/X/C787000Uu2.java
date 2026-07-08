package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Uu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787000Uu2 extends C09AY implements Function0<String> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C787000Uu2(float f, float f2, boolean z) {
        super(0);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchNestedFling: velocityX=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", velocityY=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", consumed=");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
