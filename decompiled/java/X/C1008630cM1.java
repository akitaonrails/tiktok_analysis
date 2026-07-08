package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cM1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008630cM1 extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ ShakeEgg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1008630cM1(ShakeEgg shakeEgg) {
        super(0);
        this.LL = shakeEgg;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.widget.FrameLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        return ((View) this.LL.LLJILJILJ.getValue()).findViewById(R.id.hup);
    }
}
