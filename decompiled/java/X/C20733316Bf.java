package X;

import Y.ARunnableS131S0100000_31;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior;

/* JADX INFO: renamed from: X.16Bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20733316Bf extends AbstractC712240Rwk {
    public final ViewOnAttachStateChangeListenerC20631115oD LL;
    public final SearchBottomSheetBehavior LLILLJJLI;

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        HandlerHook.viewPost(this.LL, new ARunnableS131S0100000_31(this, 94));
    }

    public C20733316Bf(ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, SearchBottomSheetBehavior searchBottomSheetBehavior) {
        this.LL = viewOnAttachStateChangeListenerC20631115oD;
        this.LLILLJJLI = searchBottomSheetBehavior;
    }
}
