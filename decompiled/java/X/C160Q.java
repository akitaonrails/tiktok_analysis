package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.160Q, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160Q extends C09AY implements Function0<C207044160c> {
    public final /* synthetic */ CLACaptionViewModelV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160Q(CLACaptionViewModelV2 cLACaptionViewModelV2) {
        super(0);
        this.LL = cLACaptionViewModelV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C207044160c invoke() {
        return new C207044160c(new C160G(this.LL));
    }
}
