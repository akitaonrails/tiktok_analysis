package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.touchpoint.api.model.Control;
import com.bytedance.touchpoint.api.model.InAppPush;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.InAppPushViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898560zVO extends AbstractC1895130zPr {
    public static final C1898560zVO LL = new C1898560zVO();
    public static final List<InAppPush> LLILLJJLI = new ArrayList();
    public static final List<InAppPush> LLILLL = new ArrayList();
    public static final List<InAppPush> LLILZ = new ArrayList();
    public static final List<InAppPush> LLILZIL = new ArrayList();
    public static boolean LLILZLL;
    public static boolean LLIZ;
    public static boolean LLIZLLLIL;
    public static boolean LLJ;
    public static final C736950SvV LLJI;

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LLJI = new C736950SvV(C13LE.LIZ(InAppPushViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1898550zVN(), null, null, null);
    }

    public static boolean LJIIJ() {
        C1879340z0O c1879340z0OLIZ;
        if (LLIZ) {
            return false;
        }
        C1893790zNh.LIZ.getClass();
        if (C1893790zNh.LJIIZILJ) {
            return false;
        }
        return (LLILZLL || !ViewOnClickListenerC1898570zVP.LLJI) && (c1879340z0OLIZ = C1619720sFe.LIZ.LIZ(6)) != null && c1879340z0OLIZ.LIZ();
    }

    public static void LJIIJJI() {
        Activity activityLJIILL;
        try {
            ArrayList arrayList = (ArrayList) LLILZIL;
            if ((!arrayList.isEmpty()) && LJIIJ()) {
                InAppPush inAppPush = (InAppPush) arrayList.get(0);
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
                if (abstractC1896090zRP == null || (activityLJIILL = abstractC1896090zRP.LJIILL()) == null) {
                    return;
                }
                LL.getClass();
                LJIILJJIL(activityLJIILL, inAppPush);
                arrayList.remove(inAppPush);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LJIIL() {
        ((ArrayList) LLILLJJLI).clear();
        ((ArrayList) LLILLL).clear();
        ((ArrayList) LLILZ).clear();
        ((ArrayList) LLILZIL).clear();
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) LLJI.getValue();
    }

    public final void init() {
        if (LLJ) {
            return;
        }
        LLJ = true;
        C736950SvV c736950SvV = LLJI;
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zRn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1895080zPm) obj).LL);
            }
        }, null, new C1898620zVU());
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zRI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1895080zPm) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C1898490zVH());
        C1898650zVX c1898650zVX = (C1898650zVX) C1619720sFe.LIZ.LIZ(6);
        LLILZLL = c1898650zVX != null ? c1898650zVX.LIZIZ() : false;
    }

    public static void LJIILL(InAppPush inAppPush) {
        Activity activityLJIILL;
        boolean zLJI = MethodIDManager.LJI(72049);
        try {
            int i = 0;
            String str = "";
            if (LJIIJ()) {
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
                if (abstractC1896090zRP != null && (activityLJIILL = abstractC1896090zRP.LJIILL()) != null) {
                    LJIILJJIL(activityLJIILL, inAppPush);
                } else {
                    ((ArrayList) LLILZIL).add(inAppPush);
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    Control control = inAppPush.control;
                    if (control != null) {
                        i = control.type;
                    }
                    String str2 = inAppPush.inAppPushName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = inAppPush.taskIds;
                    if (str3 != null) {
                        str = str3;
                    }
                    c1894320zOY.getClass();
                    C1894320zOY.LJII(i, str2, str, "not_cold_launch");
                }
            } else {
                ((ArrayList) LLILZIL).add(inAppPush);
                C1894320zOY c1894320zOY2 = C1894320zOY.LIZ;
                Control control2 = inAppPush.control;
                if (control2 != null) {
                    i = control2.type;
                }
                String str4 = inAppPush.inAppPushName;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = inAppPush.taskIds;
                if (str5 != null) {
                    str = str5;
                }
                c1894320zOY2.getClass();
                C1894320zOY.LJII(i, str4, str, "occupied");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJIILJJIL(Activity activity, InAppPush inAppPush) {
        View decorView;
        Integer numValueOf;
        String str;
        Integer numValueOf2;
        String strLJIJJ;
        if (LLILZLL) {
            C1898650zVX c1898650zVX = (C1898650zVX) C1619720sFe.LIZ.LIZ(6);
            if (c1898650zVX != null) {
                c1898650zVX.LIZLLL(inAppPush);
                return;
            }
            return;
        }
        ViewOnClickListenerC1898570zVP viewOnClickListenerC1898570zVP = new ViewOnClickListenerC1898570zVP(activity, inAppPush);
        C1899850zXT c1899850zXT = viewOnClickListenerC1898570zVP.LLIZLLLIL;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1899850zXT.LLILLL, "translationY", c1899850zXT.LLILLL.getTranslationY(), 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        if (viewOnClickListenerC1898570zVP.LL.isFinishing() || viewOnClickListenerC1898570zVP.isShowing()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = viewOnClickListenerC1898570zVP.LLILLL;
        viewOnClickListenerC1898570zVP.LLILZIL = jCurrentTimeMillis + j;
        HandlerHook.viewPostDelay(viewOnClickListenerC1898570zVP.LLIZLLLIL, viewOnClickListenerC1898570zVP.LLILZLL, j);
        if (viewOnClickListenerC1898570zVP.LLIZ.getParent() != null) {
            C786410Ut5.LJJJLZIJ(viewOnClickListenerC1898570zVP.LLIZ, (ViewGroup) viewOnClickListenerC1898570zVP.LLIZ.getParent());
        }
        try {
            Window window = viewOnClickListenerC1898570zVP.LL.getWindow();
            if (window != null) {
                decorView = window.getDecorView();
            } else {
                decorView = null;
            }
            viewOnClickListenerC1898570zVP.showAtLocation(decorView, 48, 0, -C12ES.LJIIJJI(viewOnClickListenerC1898570zVP.LJJIIJ()));
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(viewOnClickListenerC1898570zVP);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Control control = viewOnClickListenerC1898570zVP.LLILLJJLI.control;
                if (control != null) {
                    numValueOf2 = Integer.valueOf(control.type);
                } else {
                    numValueOf2 = null;
                }
                linkedHashMap.put("type", String.valueOf(numValueOf2));
                String str2 = viewOnClickListenerC1898570zVP.LLILLJJLI.inAppPushName;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("name", str2);
                String str4 = viewOnClickListenerC1898570zVP.LLILLJJLI.taskIds;
                if (str4 != null) {
                    str3 = str4;
                }
                linkedHashMap.put("task_id", str3);
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP != null) {
                    strLJIJJ = abstractC1896090zRP.LJIJJ();
                } else {
                    strLJIJJ = null;
                }
                linkedHashMap.put("region", strLJIJJ);
                interfaceC1897260zTILIZIZ.LIZ("inapp_push_show", linkedHashMap);
            }
            String str5 = viewOnClickListenerC1898570zVP.LLILLJJLI.LIZIZ;
            if (str5 != null && str5.length() != 0) {
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                InAppPush inAppPush2 = viewOnClickListenerC1898570zVP.LLILLJJLI;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Control control2 = viewOnClickListenerC1898570zVP.LLILLJJLI.control;
                if (control2 != null) {
                    numValueOf = Integer.valueOf(control2.type);
                } else {
                    numValueOf = null;
                }
                linkedHashMap2.put("sub_type", String.valueOf(numValueOf));
                Control control3 = viewOnClickListenerC1898570zVP.LLILLJJLI.control;
                if (control3 != null) {
                    str = control3.taskName;
                } else {
                    str = null;
                }
                linkedHashMap2.put("task_key", str);
                C1894320zOY.LJIL(c1894320zOY, inAppPush2, linkedHashMap2);
            }
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ2 != null) {
                interfaceC1897260zTILIZIZ2.LJFF(true, null);
            }
            ViewOnClickListenerC1898570zVP.LLJI = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIILIIL(C1898560zVO c1898560zVO, int i, String str) {
        List<InAppPush> list;
        int i2;
        String str2;
        c1898560zVO.getClass();
        if (i == 6) {
            list = LLILLL;
        } else {
            list = LLILZ;
        }
        if (list != null && !list.isEmpty() && 0 == 0) {
            for (InAppPush inAppPush : list) {
                Control control = inAppPush.control;
                if (control != null) {
                    str2 = control.taskName;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    LJIILL(inAppPush);
                    return;
                }
            }
        }
        if (i == 6) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        C1894320zOY.LIZ.getClass();
        C1894320zOY.LJII(i2, "", "", "key_not_match");
    }
}
