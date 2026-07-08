package X;

import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Aa5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181751Aa5 extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ C2181481AZe LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181751Aa5(C2181481AZe c2181481AZe) {
        super(0);
        this.LL = c2181481AZe;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ FrameLayout invoke() {
        FrameLayout frameLayout = new FrameLayout(this.LL.LL);
        frameLayout.setId(R.id.ysg);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }
}
