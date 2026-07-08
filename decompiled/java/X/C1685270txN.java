package X;

import Y.ARunnableS58S0300000_25;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.screenshot.ScreenShotContent;
import com.ss.android.ugc.aweme.screenshot.ScreenShotShareMobParam;
import com.ss.android.ugc.aweme.screenshot.event.ScreenshotSharePopupShowEvent;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0txN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685270txN {
    public WeakReference<ViewGroup> LIZ;
    public WeakReference<ViewGroup> LIZIZ;
    public WeakReference<ComposeView> LIZJ;
    public ARunnableS58S0300000_25 LIZLLL;
    public List<? extends C1684090tvT<?>> LJ = C13BV.INSTANCE;

    public static boolean LIZIZ(C19EG c19eg) {
        boolean zLJFF = false;
        try {
            Boolean bool = null;
            Object objInvoke = Class.forName("com.ss.android.ugc.aweme.bugreport.config.BugReportToggle").getMethod("isEnabled", Context.class).invoke(null, c19eg);
            if (objInvoke instanceof Boolean) {
                bool = (Boolean) objInvoke;
            }
            zLJFF = Intrinsics.LJFF(bool, Boolean.TRUE);
            return zLJFF;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return zLJFF;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSnapSlayEnabled reflection failed: ");
            sbLIZ.append(e2.getMessage());
            C1720106oR.LIZ("DogfoodFeedback", C2188811AlT.LIZIZ(sbLIZ));
            return zLJFF;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(ComposeView composeView, ViewGroup viewGroup, ViewGroup viewGroup2, String str, boolean z, AbstractC19875512pd<C1684090tvT<?>> abstractC19875512pd, C0V08 c0v08) {
        float f;
        int iLIZIZ;
        float f2;
        ScreenShotContent screenShotContent;
        ScreenShotShareMobParam screenShotShareMobParam;
        Iterator it2 = abstractC19875512pd.iterator();
        while (it2.hasNext()) {
            T t = ((C1684090tvT) it2.next()).LIZLLL;
            if ((t instanceof ScreenShotContent) && (screenShotContent = (ScreenShotContent) t) != null && (screenShotShareMobParam = screenShotContent.mobParam) != null) {
                ScreenshotSharePopupShowEvent screenshotSharePopupShowEvent = new ScreenshotSharePopupShowEvent();
                screenshotSharePopupShowEvent.LJI(screenShotShareMobParam.enterFrom, "enter_from");
                screenshotSharePopupShowEvent.LJI(screenShotShareMobParam.itemId, "item_id");
                screenshotSharePopupShowEvent.LJI(screenShotShareMobParam.itemType, "item_type");
                screenshotSharePopupShowEvent.LJIIIIZZ();
            }
        }
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Dark, new C19719212De(287231825, new C1685250txL(c0v08, viewGroup2, str, z, abstractC19875512pd, viewGroup, this), true));
        if (z) {
            f = 12.0f;
        } else {
            f = 56.0f;
        }
        float fLIZ = C339190DRl.LIZ(f);
        if (z) {
            iLIZIZ = C0FV2.LIZ(viewGroup2.getContext());
            f2 = 0.35f;
        } else {
            iLIZIZ = C0FV2.LIZIZ(viewGroup2.getContext());
            f2 = 0.312f;
        }
        if (C444960Hcc.LIZIZ()) {
            fLIZ = -fLIZ;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(composeView);
        composeView.setX(fLIZ);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(composeView);
        composeView.setY(iLIZIZ * f2);
        ARunnableS58S0300000_25 aRunnableS58S0300000_25 = this.LIZLLL;
        if (aRunnableS58S0300000_25 != null) {
            HandlerHook.viewRemoveCallbacks(viewGroup, aRunnableS58S0300000_25);
        }
        this.LIZLLL = new ARunnableS58S0300000_25(viewGroup, viewGroup2, abstractC19875512pd, 14);
        HandlerHook.viewPostDelay(viewGroup, this.LIZLLL, Mp4ScreenVideoLoadTimeout.CONTROL);
        this.LIZIZ = new WeakReference<>(viewGroup2);
        this.LIZJ = new WeakReference<>(composeView);
    }
}
