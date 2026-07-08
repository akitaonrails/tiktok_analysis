package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.BottomTabBubble;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.bottomtabbubble.CoinTabViewModel;
import com.bytedance.touchpoint.data.parser.notify.BottomTabBubbleViewModel;

/* JADX INFO: renamed from: X.0zRX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896170zRX extends AbstractC1895130zPr {
    public static final C1896170zRX LL = new C1896170zRX();
    public static final C736950SvV LLILLJJLI;
    public static final C736950SvV LLILLL;
    public static BottomTabBubble LLILZ;
    public static int LLILZIL;
    public static boolean LLILZLL;

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BottomTabBubbleViewModel.class);
        C1896200zRa c1896200zRa = new C1896200zRa();
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        boolean z = lifecycleOwner instanceof HasDefaultViewModelProviderFactory;
        C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(z ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), c1896200zRa, null, null, null);
        LLILLJJLI = c736950SvV;
        LLILLL = new C736950SvV(C13LE.LIZ(CoinTabViewModel.class), null, c452070Ho5, C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(z ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1896210zRb(), null, null, null);
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zRZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1895080zPm) obj).LL);
            }
        }, null, new C1896180zRY());
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) LLILLJJLI.getValue();
    }
}
