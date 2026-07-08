package X;

import android.view.View;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cM2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008640cM2 extends C09AY implements Function0<C0T8H> {
    public final /* synthetic */ ShakeEgg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1008640cM2(ShakeEgg shakeEgg) {
        super(0);
        this.LL = shakeEgg;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0T8H, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C0T8H invoke() {
        return ((View) this.LL.LLJILJILJ.getValue()).findViewById(R.id.huo);
    }
}
