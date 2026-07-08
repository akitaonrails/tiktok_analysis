package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511810K5j extends C09AY implements Function1<C512220K6y, Unit> {
    public final /* synthetic */ C259800zU<Fragment> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C511810K5j(C259800zU<Fragment> c259800zU) {
        super(1);
        this.LL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512220K6y c512220K6y) {
        DialogFragment dialogFragment;
        if (!c512220K6y.LIZJ) {
            Fragment fragment = this.LL.element;
            if ((fragment instanceof TuxSheet) && (dialogFragment = (DialogFragment) fragment) != null) {
                dialogFragment.dismiss();
            }
        }
        return Unit.LIZ;
    }
}
