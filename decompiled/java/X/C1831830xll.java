package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1831830xll extends C09AY implements Function0<C0RTY> {
    public final /* synthetic */ C03K6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1831830xll(C03K6 c03k6) {
        super(0);
        this.LL = c03k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C0RTY invoke() {
        Fragment fragmentLIZIZ = C827203La.LIZIZ(this.LL.getCurrentLifeCycleOwner());
        C19EG activity = fragmentLIZIZ.getActivity();
        if (activity == null) {
            return null;
        }
        return C0RPA.LIZ(activity).zQ2(fragmentLIZIZ);
    }
}
