package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0YxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890980YxM extends C09AY implements Function2<BaseActionViewModel<?>, InterfaceC893080Z1u, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C890980YxM(String str, boolean z, boolean z2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(BaseActionViewModel<?> baseActionViewModel, InterfaceC893080Z1u interfaceC893080Z1u) {
        BaseActionViewModel<?> baseActionViewModel2 = baseActionViewModel;
        InterfaceC893080Z1u interfaceC893080Z1u2 = interfaceC893080Z1u;
        if (this.LLILLJJLI) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel2), null, null, new C890960YxK(interfaceC893080Z1u2, this.LL, this.LLILLL, baseActionViewModel2, null), 3);
        }
        return Unit.LIZ;
    }
}
