package X;

import Y.ARunnableS117S0100000_17;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0ehy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1099120ehy implements InterfaceC469360Ias {
    public final ViewPager LL;
    public final RunnableC469800Iba LLILLJJLI;
    public final String LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public boolean LLILZLL = true;
    public final String LLIZ;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        FeedBanner feedBannerLJJIJIL;
        if (i != 1 || !(this.LL.getAdapter() instanceof C1099110ehx) || (feedBannerLJJIJIL = ((C1099110ehx) this.LL.getAdapter()).LJJIJIL(this.LLILZIL)) == null) {
            return;
        }
        HashMap map = new HashMap();
        C1097980eg8.LIZ(feedBannerLJJIJIL, map, this.LLILZIL);
        map.put("show_source", this.LLILLL);
        map.put("banner_position", String.valueOf(this.LLILZIL + 1));
        map.put("tab_type", this.LLIZ);
        map.put("landing_reason", C467800IWc.LJIJ.LJIIL);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("banner_slide");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        C1099110ehx c1099110ehx;
        FeedBanner feedBannerLJJIJIL;
        this.LLILZIL = i;
        if (!this.LLILZ) {
            return;
        }
        String str = this.LLIZ;
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        String str2 = c467800IWc.LJIIIIZZ;
        if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) && !TextUtils.equals(str, str2)) {
            return;
        }
        ViewPager viewPager = this.LL;
        RunnableC469800Iba runnableC469800Iba = this.LLILLJJLI;
        HandlerHook.viewRemoveCallbacks(viewPager, runnableC469800Iba);
        HandlerHook.viewPostDelay(viewPager, runnableC469800Iba, Mp4ScreenVideoLoadTimeout.CONTROL);
        if (!this.LLILZLL || (c1099110ehx = (C1099110ehx) this.LL.getAdapter()) == null || (feedBannerLJJIJIL = ((C1099110ehx) this.LL.getAdapter()).LJJIJIL(i)) == null) {
            return;
        }
        HashMap map = new HashMap();
        int size = i % ((ArrayList) c1099110ehx.LLILZ).size();
        C1097980eg8.LIZ(feedBannerLJJIJIL, map, size);
        map.put("show_source", this.LLILLL);
        map.put("banner_position", String.valueOf(size + 1));
        map.put("tab_type", this.LLIZ);
        map.put("landing_reason", c467800IWc.LJIIL);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("banner_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
        ViewPager viewPager2 = this.LL;
        if (viewPager2 instanceof C1099140ei0) {
            C1099140ei0 c1099140ei0 = (C1099140ei0) viewPager2;
            MotionEvent motionEvent = c1099140ei0.LLILZIL;
            if (motionEvent == null || motionEvent.getAction() == 3 || c1099140ei0.LLILZIL.getAction() == 1) {
                HandlerHook.viewPost(c1099140ei0, new ARunnableS117S0100000_17(c1099140ei0, 215));
            }
            C20441214yg.LIZIZ("BannerViewPager", "onPageSelected ");
        }
    }

    public C1099120ehy(ViewPager viewPager, RunnableC469800Iba runnableC469800Iba, String str, String str2) {
        this.LL = viewPager;
        this.LLILLJJLI = runnableC469800Iba;
        this.LLILLL = str;
        this.LLIZ = str2;
    }
}
