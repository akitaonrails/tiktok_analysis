package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Z1G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z1G extends C09AY implements Function2<BaseActionViewModel<?>, InterfaceC893080Z1u, Unit> {
    public final /* synthetic */ AtomicReference<IMUser> LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z1G(AtomicReference<IMUser> atomicReference, boolean z) {
        super(2);
        this.LL = atomicReference;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(BaseActionViewModel<?> baseActionViewModel, InterfaceC893080Z1u interfaceC893080Z1u) {
        BaseActionViewModel<?> baseActionViewModel2 = baseActionViewModel;
        InterfaceC893080Z1u interfaceC893080Z1u2 = interfaceC893080Z1u;
        AtomicReference<IMUser> atomicReference = this.LL;
        C0Z1M c0z1mLJJJJ = interfaceC893080Z1u2.LJJJJ();
        if (c0z1mLJJJJ != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel2), null, null, new C0Z1J(c0z1mLJJJJ, atomicReference, null), 3);
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel2), null, null, new C0Z1D(interfaceC893080Z1u2, this.LLILLJJLI, baseActionViewModel2, null), 3);
        return Unit.LIZ;
    }
}
