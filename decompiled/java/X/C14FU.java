package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14FU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14FU implements C0WHU {
    public static C14FV LIZIZ;
    public static WeakReference<C14FV> LIZJ;
    public static WeakReference<C19EG> LIZLLL;
    public static WeakReference<InterfaceC214902198i> LJ;
    public static final C14FU LIZ = new C14FU();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(17));

    public static C14FV LIZIZ() {
        C14FV c14fv;
        WeakReference<C14FV> weakReference = LIZJ;
        return (weakReference == null || (c14fv = weakReference.get()) == null) ? LIZIZ : c14fv;
    }

    public static void LIZJ() {
        C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1860520yW2.getClass();
        C1860520yW2.LJIIL().storeLong("tako_shortcut_dialog_last_show_time", jCurrentTimeMillis);
        C1860520yW2.LJIIL().storeInt("tako_shortcut_dialog_show_times", C1860520yW2.LJIIL().getInt("tako_shortcut_dialog_show_times", 0) + 1);
        C14FV c14fvLIZIZ = LIZIZ();
        if (c14fvLIZIZ != null) {
            c14fvLIZIZ.LIZIZ();
        }
    }

    @Override // X.C0WHU
    public final void LIZ(C0WHR c0whr) {
        C19EG c19eg;
        Object obj;
        Fragment fragment;
        FeedCommonService feedCommonService;
        WeakReference<InterfaceC214902198i> weakReference = LJ;
        if (weakReference != null && (obj = (InterfaceC214902198i) weakReference.get()) != null && (fragment = (Fragment) obj) != null) {
            if (!fragment.isDetached() && !fragment.isRemoving() && (feedCommonService = (FeedCommonService) PluggableExtentionKt.pluggableSpi$default(FeedCommonService.class, false, false, false, 14, null)) != null) {
                feedCommonService.LJIIJ(fragment, "tako", new AwS574S0100000_30(c0whr, 15), AFwS274S0000000_30.get$arr$(39), AFwS274S0000000_30.get$arr$(40), AFwS274S0000000_30.get$arr$(41));
                return;
            }
            return;
        }
        WeakReference<C19EG> weakReference2 = LIZLLL;
        if (weakReference2 != null && (c19eg = weakReference2.get()) != null && C1857690yRT.LJIIJJI(c19eg)) {
            ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIILJJIL(c19eg, "tako", new AwS574S0100000_30(c0whr, 16), AFwS274S0000000_30.get$arr$(42), AFwS274S0000000_30.get$arr$(43), AFwS274S0000000_30.get$arr$(44));
        }
    }

    public static void LIZLLL(C19EG c19eg, InterfaceC214902198i interfaceC214902198i, C14FV c14fv) {
        if (LJFF.getValue() == null) {
            return;
        }
        LIZLLL = new WeakReference<>(c19eg);
        if (C07CP.LIZ()) {
            LJ = new WeakReference<>(interfaceC214902198i);
        }
        if (C07Q4.LIZ()) {
            LIZJ = new WeakReference<>(c14fv);
        } else {
            LIZIZ = c14fv;
        }
        ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LJFF("tako", true);
    }
}
