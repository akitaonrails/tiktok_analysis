package X;

import com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS155S0400000_27;

/* JADX INFO: renamed from: X.0tuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1683420tuO extends C2217421BqW implements Function0<Unit> {
    public C1683420tuO(Object obj) {
        super(0, obj, ContactSelectViewModel.class, "onCustomTopItemClick", "onCustomTopItemClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AwS155S0400000_27 awS155S0400000_27 = ((ContactSelectViewModel) this.receiver).LL;
        if (awS155S0400000_27 != null) {
            awS155S0400000_27.invoke();
        }
        return Unit.LIZ;
    }
}
