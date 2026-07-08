package X;

import Y.ARunnableS131S0100000_31;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;

/* JADX INFO: renamed from: X.16Ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20732616Ay extends C360660ECa {
    public final ViewPager LL;
    public final ViewPagerBottomSheetBehavior LLILLJJLI;

    @Override // X.C360660ECa, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        HandlerHook.viewPost(this.LL, new ARunnableS131S0100000_31(this, 49));
    }

    public C20732616Ay(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.LL = viewPager;
        this.LLILLJJLI = viewPagerBottomSheetBehavior;
    }
}
