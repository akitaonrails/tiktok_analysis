package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.service.IInteractiveService;
import com.bytedance.touchpoint.api.service.IMultiDomainService;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.feed.lite.LiteFeedTimerPendantManger;
import com.bytedance.touchpoint.core.shortdrama.ShortDramaTimerPendantManager;
import com.bytedance.touchpoint.core.viewmodel.TaskEventVM;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS144S0110000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898110zUf extends AbstractC1895130zPr {
    public static final C1898110zUf LL = new C1898110zUf();
    public static boolean LLILLJJLI;
    public static final C736950SvV LLILLL;
    public static final List<InterfaceC1898130zUh> LLILZ;
    public static final Map<Integer, InterfaceC1898470zVF<TaskEvent>> LLILZIL;

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LLILLL = new C736950SvV(C13LE.LIZ(TaskEventVM.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1898170zUl(), null, null, null);
        LLILZ = new ArrayList();
        LLILZIL = new LinkedHashMap();
    }

    public static final void LJIIJ() {
        C01U6.LIZIZ(new C740090T1j());
        IWatchVideoService.LIZ.getClass();
        IWatchVideoService iWatchVideoServiceLIZ = C1898160zUk.LIZ();
        if (iWatchVideoServiceLIZ != null) {
            iWatchVideoServiceLIZ.clear();
        }
        ((IInteractiveService) ServiceManager.get().getService(IInteractiveService.class)).clear();
        ((IMultiDomainService) ServiceManager.get().getService(IMultiDomainService.class)).clear();
        ((ArrayList) LLILZ).clear();
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) LLILLL.getValue();
    }

    public final void init() {
        if (LLILLJJLI) {
            return;
        }
        LLILLJJLI = true;
        C736950SvV c736950SvV = LLILLL;
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zRl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1895080zPm) obj).LL);
            }
        }, null, new C1898140zUi());
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zRG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1895080zPm) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C1898150zUj());
    }

    public static boolean LJIIJJI(String str) {
        ArrayList<InterfaceC1898130zUh> arrayList = (ArrayList) LLILZ;
        if ((!arrayList.isEmpty()) && str.length() != 0) {
            for (InterfaceC1898130zUh interfaceC1898130zUh : arrayList) {
                if (Intrinsics.LJFF(interfaceC1898130zUh.getTaskEventKey(), str)) {
                    if (interfaceC1898130zUh.LJIIJ() && !interfaceC1898130zUh.LJFF()) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean LJIIL(Integer num) {
        if (num != null) {
            num.intValue();
            for (InterfaceC1898130zUh interfaceC1898130zUh : (ArrayList) LLILZ) {
                if (Intrinsics.LJFF(interfaceC1898130zUh.LJIIIIZZ(), num)) {
                    return interfaceC1898130zUh.LJI();
                }
            }
            return false;
        }
        return false;
    }

    public static void LJIILJJIL(String str) {
        ArrayList<InterfaceC1898130zUh> arrayList = (ArrayList) LLILZ;
        if ((!arrayList.isEmpty()) && str.length() > 0) {
            for (InterfaceC1898130zUh interfaceC1898130zUh : arrayList) {
                if (Intrinsics.LJFF(interfaceC1898130zUh.getTaskEventKey(), str)) {
                    C01U6.LIZIZ(new AwS572S0100000_28(interfaceC1898130zUh, 667));
                    return;
                }
            }
        }
    }

    public static void LJIILIIL(String str, boolean z) {
        C01GW<FeedTimerPendantManger> c01gw = FeedTimerPendantManger.LLJL;
        C1893440zN8.LIZ().LJJZZIII(str);
        LiteFeedTimerPendantManger.LLJLLL.getValue().LJJZZIII(str);
        C01GW<ShortDramaTimerPendantManager> c01gw2 = ShortDramaTimerPendantManager.LLJJJJ;
        C1893450zN9.LIZ().LJJZZIII(str);
        ArrayList<InterfaceC1898130zUh> arrayList = (ArrayList) LLILZ;
        if ((!arrayList.isEmpty()) && str.length() > 0) {
            for (InterfaceC1898130zUh interfaceC1898130zUh : arrayList) {
                if (Intrinsics.LJFF(interfaceC1898130zUh.getTaskEventKey(), str)) {
                    C01U6.LIZIZ(new AwS144S0110000_28(interfaceC1898130zUh, z, 1));
                    return;
                }
            }
        }
    }
}
