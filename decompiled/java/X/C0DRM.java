package X;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DRM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DRM extends C09AY implements Function1<Context, FrameLayout> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DRM(int i, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ FrameLayout invoke(Context context) {
        Context context2 = context;
        FrameLayout frameLayout = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.LL, this.LLILLJJLI);
        layoutParams.gravity = 17;
        C786410Ut5.a6(frameLayout, layoutParams);
        C786410Ut5.LJZ(0, frameLayout);
        C1390410mHn c1390410mHn = new C1390410mHn(context2, null, 6);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        layoutParams2.gravity = 17;
        C786410Ut5.V6(c1390410mHn, layoutParams2);
        C786410Ut5.LLLZZIL(c1390410mHn, 0);
        c1390410mHn.LIZJ();
        frameLayout.addView(c1390410mHn);
        return frameLayout;
    }
}
