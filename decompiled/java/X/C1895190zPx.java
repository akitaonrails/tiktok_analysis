package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.viewmodel.TaskEventVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895190zPx extends C09AY implements Function0<Unit> {
    public C1895190zPx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        ((BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(TaskEventVM.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1895200zPy(), null, null, null).getValue()).wQ2();
        return Unit.LIZ;
    }
}
