package X;

import com.bytedance.android.livesdk.sei.SeiAppData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181161AXy extends C09AY implements Function1<String, C1AYF> {
    public final /* synthetic */ C1AXM LL;
    public final /* synthetic */ SeiAppData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181161AXy(C1AXM c1axm, SeiAppData seiAppData) {
        super(1);
        this.LL = c1axm;
        this.LLILLJJLI = seiAppData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1AYF invoke(String str) {
        C1AXM c1axm = this.LL;
        return c1axm.LJJJJL(str, c1axm.LLLIILIL, this.LLILLJJLI);
    }
}
