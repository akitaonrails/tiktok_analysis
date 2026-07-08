package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R8c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690880R8c extends C09AY implements Function0<C0RJN> {
    public final /* synthetic */ C690870R8b LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C690880R8c(C690870R8b c690870R8b) {
        super(0);
        this.LL = c690870R8b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0RJN invoke() {
        Fragment fragment;
        C0RF0 c0rf0 = this.LL.LIZLLL;
        if (c0rf0 == null || (fragment = c0rf0.LIZJ) == null) {
            return null;
        }
        return C1578630rBN.LIZIZ(fragment);
    }
}
