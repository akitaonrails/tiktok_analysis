package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Y8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09Y8 extends C09AY implements Function1<SeaPdpMainState, Unit> {
    public final /* synthetic */ C09YH LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ C259800zU<Integer> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09Y8(C09YH c09yh, Map<String, Object> map, C259800zU<Integer> c259800zU, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, long j, String str) {
        super(1);
        this.LL = c09yh;
        this.LLILLJJLI = map;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = c259800zU3;
        this.LLILZLL = j;
        this.LLIZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SeaPdpMainState seaPdpMainState) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LL.LIZ), C0PEM.LIZJ, null, new C09Y6(this.LLILLJJLI, this.LL, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null), 2);
        return Unit.LIZ;
    }
}
