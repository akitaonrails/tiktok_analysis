package X;

import com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1683390tuL extends C2217421BqW implements Function0<Unit> {
    public C1683390tuL(Object obj) {
        super(0, obj, ContactSelectViewModel.class, "consumeTopAvatarScrollToEndState", "consumeTopAvatarScrollToEndState()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2252321DDq c2252321DDq = ((ContactSelectViewModel) this.receiver).LLJ;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), null)) {
        }
        return Unit.LIZ;
    }
}
