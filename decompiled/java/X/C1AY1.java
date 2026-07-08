package X;

import com.bytedance.android.livesdk.sei.SeiAppData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AY1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AY1 extends C09AY implements Function1<String, C1AYF> {
    public final /* synthetic */ C1AXM LL;
    public final /* synthetic */ SeiAppData LLILLJJLI;
    public final /* synthetic */ SeiAppData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AY1(C1AXM c1axm, SeiAppData seiAppData, SeiAppData seiAppData2) {
        super(1);
        this.LL = c1axm;
        this.LLILLJJLI = seiAppData;
        this.LLILLL = seiAppData2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1AYF invoke(String str) {
        return this.LL.LJJJJL(str, this.LLILLJJLI, this.LLILLL);
    }
}
