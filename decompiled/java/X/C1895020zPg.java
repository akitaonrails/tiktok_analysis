package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.PostDialogViewModel;

/* JADX INFO: renamed from: X.0zPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895020zPg extends AbstractC1895130zPr {
    public static final C1895020zPg LL = new C1895020zPg();
    public static final C736950SvV LLILLJJLI;

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LLILLJJLI = new C736950SvV(C13LE.LIZ(PostDialogViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1895030zPh(), null, null, null);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) LLILLJJLI.getValue();
    }
}
