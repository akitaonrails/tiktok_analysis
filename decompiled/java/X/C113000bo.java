package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C113000bo extends C09AY implements Function0<Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113000bo(boolean z, String str) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("precreate otherThread");
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
