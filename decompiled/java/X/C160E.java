package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.160E, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160E extends C09AY implements Function0<C160A> {
    public final /* synthetic */ CLACaptionViewModelV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160E(CLACaptionViewModelV2 cLACaptionViewModelV2) {
        super(0);
        this.LL = cLACaptionViewModelV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C160A invoke() {
        return new C160A(ViewModelKt.getViewModelScope(this.LL), new C160I(this.LL), new C160M(this.LL), new C160N(this.LL), new C20703815zw(this.LL));
    }
}
