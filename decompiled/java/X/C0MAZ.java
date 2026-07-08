package X;

import com.ss.android.ugc.aweme.activity.MoreInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MAZ extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ MoreInfoActivity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0MAZ(MoreInfoActivity moreInfoActivity, String str, Function1<? super String, Unit> function1, int i) {
        super(2);
        this.LL = moreInfoActivity;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LLLLZIL(this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ | 1));
        return Unit.LIZ;
    }
}
