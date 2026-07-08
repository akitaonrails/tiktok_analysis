package X;

import com.bytedance.hybrid.spark.page.SparkActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1Bqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217681Bqw extends C09AY implements Function2<InterfaceC2217701Bqy, SparkActivity, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String[] LLILLJJLI;
    public final /* synthetic */ int[] LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2217681Bqw(int i, String[] strArr, int[] iArr) {
        super(2);
        this.LL = i;
        this.LLILLJJLI = strArr;
        this.LLILLL = iArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC2217701Bqy interfaceC2217701Bqy, SparkActivity sparkActivity) {
        interfaceC2217701Bqy.LJJIZ(sparkActivity, this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
