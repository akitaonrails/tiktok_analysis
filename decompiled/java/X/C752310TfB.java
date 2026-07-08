package X;

import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752310TfB extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List<User> LL;
    public final /* synthetic */ List<User> LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function1<List<? extends User>, Unit> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C752310TfB(List<? extends User> list, List<? extends User> list2, Long l, boolean z, Function1<? super List<? extends User>, Unit> function1, int i) {
        super(2);
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = l;
        this.LLILZ = z;
        this.LLILZIL = function1;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1670720tZu.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1));
        return Unit.LIZ;
    }
}
