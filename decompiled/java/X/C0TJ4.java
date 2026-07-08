package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0TJ4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJ4 {
    public static int LJFF;
    public static int LJIIIIZZ;
    public static Aweme LJIIIZ;
    public final WeakReference<IBaseListFragmentPanel> LIZ;
    public final WeakReference<C1620050sGB> LIZIZ;
    public NotInterestedTutorialData LIZJ;
    public static final Keva LIZLLL = Keva.getRepo("not_interested_tutorial");
    public static final HashSet<Integer> LJ = new HashSet<>();
    public static int LJI = 2;
    public static long LJII = -1;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0TJ4(java.lang.ref.WeakReference<com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel> r6, java.lang.ref.WeakReference<X.C1620050sGB> r7) {
        /*
            r5 = this;
            r5.<init>()
            r5.LIZ = r6
            r5.LIZIZ = r7
            com.bytedance.keva.Keva r2 = X.C0TJ4.LIZLLL
            java.lang.String r0 = "total_video_count"
            r1 = 0
            int r0 = r2.getInt(r0, r1)
            X.C0TJ4.LJIIIIZZ = r0
            java.lang.String r0 = "has_not_interested_tutorial_shown"
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L70
            int r1 = X.C0TJ4.LJIIIIZZ
            r0 = 100
            if (r1 >= r0) goto L70
            boolean r0 = com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt.getEnableFragmentSAFLifecycleRefactor()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r6.get()
            X.0MrB r0 = (X.InterfaceC581390MrB) r0
            if (r0 == 0) goto L84
            androidx.fragment.app.Fragment r4 = r0.getFragment()
        L32:
            java.lang.Object r0 = r6.get()
            X.0MrB r0 = (X.InterfaceC581390MrB) r0
            if (r0 == 0) goto L70
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            if (r0 == 0) goto L70
            X.19EG r0 = r0.getActivity()
            if (r0 == 0) goto L70
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r0)
            java.lang.Class<com.ss.android.ugc.aweme.feed.guide.notinterested.NotInterestedViewModel> r0 = com.ss.android.ugc.aweme.feed.guide.notinterested.NotInterestedViewModel.class
            androidx.lifecycle.ViewModel r3 = r1.get(r0)
            com.ss.android.ugc.aweme.feed.guide.notinterested.NotInterestedViewModel r3 = (com.ss.android.ugc.aweme.feed.guide.notinterested.NotInterestedViewModel) r3
            long r0 = java.lang.System.currentTimeMillis()
            X.C0TJ4.LJII = r0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.plugin.IPluginService> r0 = com.ss.android.ugc.aweme.plugin.IPluginService.class
            java.lang.Object r2 = r1.getService(r0)
            com.ss.android.ugc.aweme.plugin.IPluginService r2 = (com.ss.android.ugc.aweme.plugin.IPluginService) r2
            X.10Pl r1 = X.EnumC19241510Pl.VIDEO_TUTORIAL_DATA
            if (r4 == 0) goto L86
            X.0TJ0 r0 = new X.0TJ0
            r0.<init>()
            r2.observe(r1, r4, r0)
        L70:
            return
        L71:
            java.lang.Object r0 = r6.get()
            X.0MrB r0 = (X.InterfaceC581390MrB) r0
            if (r0 == 0) goto L84
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            if (r0 == 0) goto L84
            X.19EG r4 = r0.getActivity()
            goto L32
        L84:
            r4 = 0
            goto L32
        L86:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TJ4.<init>(java.lang.ref.WeakReference, java.lang.ref.WeakReference):void");
    }
}
