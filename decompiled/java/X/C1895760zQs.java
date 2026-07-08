package X;

import android.graphics.Bitmap;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.ChristmasShareInfo;
import com.bytedance.touchpoint.api.model.ShareBubble;
import com.bytedance.touchpoint.api.model.ShareTopPanel;
import com.bytedance.touchpoint.api.service.IInteractiveService;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.ChristmasShareInfoViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895760zQs extends AbstractC1895130zPr {
    public static final C1895760zQs LL = new C1895760zQs();
    public static final C736950SvV LLILLJJLI;
    public static boolean LLILLL;
    public static boolean LLILZ;
    public static boolean LLILZIL;
    public static int LLILZLL;
    public static ShareBubble LLIZ;
    public static ShareTopPanel LLIZLLLIL;
    public static ChristmasShareInfo LLJ;
    public static Bitmap LLJI;
    public static C1895910zR7 LLJIJIL;

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LLILLJJLI = new C736950SvV(C13LE.LIZ(ChristmasShareInfoViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1895900zR6(), null, null, null);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) LLILLJJLI.getValue();
    }

    public final void init() {
        if (LLILLL) {
            return;
        }
        LLILLL = true;
        C736950SvV c736950SvV = LLILLJJLI;
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(C1895790zQv.INSTANCE, null, new C1895770zQt());
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(C1895860zR2.INSTANCE, C736820SvI.LIZLLL(), new C1895750zQr());
    }

    public final boolean LJIIJ(String str) {
        String str2;
        IInteractiveService iInteractiveService;
        ChristmasShareInfo christmasShareInfo = LLJ;
        if (christmasShareInfo != null) {
            str2 = christmasShareInfo.taskEventKey;
        } else {
            str2 = null;
        }
        if (str2 == null || (iInteractiveService = (IInteractiveService) ServiceManager.get().getService(IInteractiveService.class)) == null || !iInteractiveService.LJ(str2) || LLJI == null) {
            return false;
        }
        init();
        return Intrinsics.LJFF(str, "2");
    }
}
