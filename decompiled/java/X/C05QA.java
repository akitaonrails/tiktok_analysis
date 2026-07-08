package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05QA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05QA extends C09AY implements Function1<C616100OEm, C616100OEm> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05QA(String str, float f) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C616100OEm invoke(C616100OEm c616100OEm) {
        return C616100OEm.LIZ(c616100OEm, 0.0d, 0, null, false, 0, null, null, null, null, null, null, null, null, null, null, new Pair(this.LL, Float.valueOf(this.LLILLJJLI)), 32767);
    }
}
