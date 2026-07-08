package X;

import Y.ARunnableS116S0100000_16;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkFragment;

/* JADX INFO: renamed from: X.0d8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038830d8j implements C0TVI {
    public final /* synthetic */ AdWebSparkFragment LL;

    public C1038830d8j(AdWebSparkFragment adWebSparkFragment) {
        this.LL = adWebSparkFragment;
    }

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        int i = c20246014Ju.LIZ(2).LIZLLL;
        View rootView = view.getRootView();
        if (rootView == null) {
            return c20246014Ju;
        }
        int[] iArr = new int[2];
        rootView.getLocationOnScreen(iArr);
        int measuredHeight = iArr[1] + rootView.getMeasuredHeight();
        view.getLocationOnScreen(iArr);
        int measuredHeight2 = measuredHeight - (iArr[1] + view.getMeasuredHeight());
        if (measuredHeight2 < 0) {
            HandlerHook.viewPost(view, new ARunnableS116S0100000_16(view, 186));
            return c20246014Ju;
        }
        this.LL.getClass();
        int i2 = i - measuredHeight2;
        if (i2 < 0) {
            i = 0;
        } else if (i2 <= i) {
            i = i2;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
        return c20246014Ju;
    }
}
