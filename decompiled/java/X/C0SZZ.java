package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.ext_power_list.AssemReusedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SZZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Lifecycle LL;
    public final /* synthetic */ AssemReusedDispatcher<C0SMO<Object, Object>, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SZZ(Lifecycle lifecycle, AssemReusedDispatcher<C0SMO<Object, Object>, Object> assemReusedDispatcher) {
        super(0);
        this.LL = lifecycle;
        this.LLILLJJLI = assemReusedDispatcher;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.addObserver(this.LLILLJJLI.LIZIZ);
        return Unit.LIZ;
    }
}
