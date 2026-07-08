package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RJO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJO extends C09AY implements Function0<C19EG> {
    public final /* synthetic */ C0RJN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RJO(C0RJN c0rjn) {
        super(0);
        this.LL = c0rjn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C19EG invoke() {
        Fragment fragment = this.LL.LJ;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }
}
