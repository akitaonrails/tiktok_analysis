package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R19, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R19 extends AbstractC813200VvC {
    public final Function2<FragmentManager, Fragment, Unit> LL;
    public String LLILLJJLI = "";

    /* JADX WARN: Multi-variable type inference failed */
    public C0R19(Function2<? super FragmentManager, ? super Fragment, Unit> function2) {
        this.LL = function2;
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        String string = fragment.toString();
        if (!Intrinsics.LJFF(this.LLILLJJLI, string)) {
            this.LLILLJJLI = string;
            this.LL.invoke(fragmentManager, fragment);
        }
    }
}
