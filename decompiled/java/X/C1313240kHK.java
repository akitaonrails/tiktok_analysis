package X;

import android.content.Context;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kHK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313240kHK extends AndroidView {
    public boolean LL;
    public ArrayList<C1313220kHI> LLILLJJLI;
    public C1313340kHU LLILLL;
    public final WeakReference<UIShadowProxy> LLILZ;

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1313240kHK.dispatchDraw(android.graphics.Canvas):void");
    }

    public C1313240kHK(UIShadowProxy uIShadowProxy, Context context) {
        super(context);
        this.LLILZ = new WeakReference<>(uIShadowProxy);
        setWillNotDraw(false);
    }
}
