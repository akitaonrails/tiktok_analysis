package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.touchpoint.data.parser.notify.TasksViewModel;
import java.util.List;

/* JADX INFO: renamed from: X.0zQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895550zQX extends AbstractC1895130zPr {
    public static final C1895550zQX LL = new C1895550zQX();
    public static SpecActPendantManager LLILLJJLI;
    public static boolean LLILLL;
    public static final List<? extends InterfaceC1895240zQ2> LLILZ;
    public static final C736950SvV LLILZIL;
    public static boolean LLILZLL;

    static {
        C01GW<C1896490zS3> c01gw = C1896490zS3.LLJJIII;
        LLILZ = C1697810uHb.LJ(C1896470zS1.LLJJJJ.getValue(), C1896500zS4.LLJJ.getValue(), C1896460zS0.LLJJ.getValue(), C739370SzP.LIZ());
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LLILZIL = new C736950SvV(C13LE.LIZ(TasksViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1895580zQa(), null, null, null);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) LLILZIL.getValue();
    }

    public final void init() {
        if (LLILZLL) {
            return;
        }
        LLILZLL = true;
        C736950SvV c736950SvV = LLILZIL;
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zQW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1895080zPm) obj).LL);
            }
        }, null, new C1895400zQI());
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zQY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1895080zPm) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C1895380zQG());
    }
}
