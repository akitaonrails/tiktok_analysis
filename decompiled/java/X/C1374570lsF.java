package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0lsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374570lsF extends C09AY implements Function2<String, String, Unit> {
    public final /* synthetic */ C1374500ls8 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374570lsF(C1374500ls8 c1374500ls8, String str, Context context) {
        super(2);
        this.LL = c1374500ls8;
        this.LLILLJJLI = str;
        this.LLILLL = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        this.LL.LIZ.LJJIIJ(new C1374270lrl(C1374720lsU.LJFF(C1374720lsU.LIZIZ(), this.LLILLJJLI), null, null, str2, 28), this.LLILLL, null);
        return Unit.LIZ;
    }
}
