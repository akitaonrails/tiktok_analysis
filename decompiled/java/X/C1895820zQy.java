package X;

import android.graphics.Bitmap;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.SharePanelInfoViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895820zQy extends AbstractC1895130zPr {
    public static final C1895820zQy LL = new C1895820zQy();
    public static final C736950SvV LLILLJJLI;
    public static boolean LLILLL;
    public static Bitmap LLILZ;

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LLILLJJLI = new C736950SvV(C13LE.LIZ(SharePanelInfoViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1895890zR5(), null, null, null);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) LLILLJJLI.getValue();
    }

    public final void init() {
        boolean zLJI = MethodIDManager.LJI(196722);
        if (!LLILLL) {
            LLILLL = true;
            C736950SvV c736950SvV = LLILLJJLI;
            ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zQz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Long.valueOf(((C1895080zPm) obj).LL);
                }
            }, null, new C736990SvZ());
            ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zR1
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1895080zPm) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), new C1895870zR3());
            C1898040zUY.LIZ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJIIJJI(final String str, String str2) {
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ;
        if (str2 != null && str2.length() != 0 && (interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ()) != null) {
            interfaceC1897260zTILIZIZ.LJ(str2, new InterfaceC2281081EQg() { // from class: X.0Sva
                @Override // X.InterfaceC2281081EQg
                public final void onFailed() {
                }

                @Override // X.InterfaceC2281081EQg
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap != null) {
                        if (Intrinsics.LJFF(str, "shareButton")) {
                            C1895820zQy c1895820zQy = C1895820zQy.LL;
                        } else {
                            C1895820zQy.LLILZ = bitmap;
                        }
                    }
                }
            });
        }
    }

    public static void LJIIL(String str, String str2, String str3, String str4) {
        C1894320zOY.LIZ.getClass();
        Map<String, String> mapLIZIZ = C1894320zOY.LIZIZ(str, str2, str3, str4);
        mapLIZIZ.put("is_auto_show", CardStruct.IStatusCode.DEFAULT);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("invite_panel_show", mapLIZIZ);
        }
        C1893680zNW.LIZ.getClass();
        C1893680zNW.LJIIJJI(33, null);
    }

    public static void LJIIJ(String str, String str2, String str3, String str4, String str5) {
        C1894320zOY.LIZ.getClass();
        Map<String, String> mapLIZIZ = C1894320zOY.LIZIZ(str, str2, str3, str4);
        mapLIZIZ.put("is_auto_show", CardStruct.IStatusCode.DEFAULT);
        mapLIZIZ.put("platform", str5);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("invite_panel_click", mapLIZIZ);
        }
    }
}
