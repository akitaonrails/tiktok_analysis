package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.AdLynxDialogVM;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.0zUM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897920zUM extends AbstractC1895130zPr {
    public static final C1897920zUM LL = new C1897920zUM();
    public static final C736950SvV LLILLJJLI;
    public static boolean LLILLL;
    public static DialogC1897810zUB LLILZ;

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LLILLJJLI = new C736950SvV(C13LE.LIZ(AdLynxDialogVM.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(329), null, null, null);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) LLILLJJLI.getValue();
    }
}
