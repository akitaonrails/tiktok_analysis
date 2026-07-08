package X;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0H9M, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H9M extends C09AY implements InterfaceC1631620sYq<Integer, Boolean, Integer, Pair<? extends View, ? extends FrameLayout.LayoutParams>> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H9M(int i, Activity activity, String str) {
        super(3);
        this.LL = activity;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC1631620sYq
    public final Pair<? extends View, ? extends FrameLayout.LayoutParams> invoke(Integer num, Boolean bool, Integer num2) {
        Object c098200Yq;
        num.intValue();
        bool.booleanValue();
        int iIntValue = num2.intValue();
        C1372380loi c1372380loi = LiveSharePackage.Companion;
        Activity activity = this.LL;
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        c1372380loi.getClass();
        int i2 = 1;
        if (i < 1) {
            i = 1;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        try {
            int iLJII = C1372380loi.LJII(activity) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
            c098200Yq = Integer.valueOf((((ScreenUtils.getFullScreenHeight(activity) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(activity)) - iIntValue) - iLJII) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer numValueOf = Integer.valueOf(iLIZIZ);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = numValueOf;
        }
        int iIntValue2 = ((Number) c098200Yq).intValue();
        if (iLIZIZ > iIntValue2) {
            iLIZIZ = iIntValue2;
        }
        if (iLIZIZ >= 1) {
            i2 = iLIZIZ;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        View view = new View(activity);
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, -1, 81));
        view.setBackgroundColor(Integer.MIN_VALUE);
        RemoteImageView remoteImageView = new RemoteImageView(activity);
        remoteImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        remoteImageView.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LIZJ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i2, 81);
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        C786410Ut5.f7(remoteImageView, layoutParams);
        C1324840ka2.LJIIJ(remoteImageView, str, -1, -1);
        frameLayout.addView(view);
        frameLayout.addView(remoteImageView);
        return new Pair<>(frameLayout, new FrameLayout.LayoutParams(-1, -1, 81));
    }
}
