package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Z23, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z23 extends C09AY implements Function2<BaseSwitchActionViewModel<?>, InterfaceC893080Z1u, Unit> {
    public final /* synthetic */ C0Z28 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z23(C0Z28 c0z28, boolean z, boolean z2) {
        super(2);
        this.LL = c0z28;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(BaseSwitchActionViewModel<?> baseSwitchActionViewModel, InterfaceC893080Z1u interfaceC893080Z1u) {
        BaseSwitchActionViewModel<?> baseSwitchActionViewModel2 = baseSwitchActionViewModel;
        InterfaceC893080Z1u interfaceC893080Z1u2 = interfaceC893080Z1u;
        this.LL.LLJI.invoke(baseSwitchActionViewModel2, interfaceC893080Z1u2);
        boolean z = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseSwitchActionViewModel2), null, null, new C893130Z1z(interfaceC893080Z1u2, this.LL, z2, z, baseSwitchActionViewModel2, null), 3);
        return Unit.LIZ;
    }
}
