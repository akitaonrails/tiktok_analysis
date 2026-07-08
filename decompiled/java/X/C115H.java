package X;

import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.115H, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C115H extends C2217421BqW implements Function0<Unit> {
    public C115H(EffectProfileListViewModel effectProfileListViewModel) {
        super(0, effectProfileListViewModel, EffectProfileListViewModel.class, "loadMore", "loadMore()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((ListViewModel) this.receiver).nR2();
        return Unit.LIZ;
    }
}
