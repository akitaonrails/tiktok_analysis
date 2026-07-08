package X;

import android.os.Vibrator;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008620cM0 extends C09AY implements Function0<Vibrator> {
    public final /* synthetic */ ShakeEgg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1008620cM0(ShakeEgg shakeEgg) {
        super(0);
        this.LL = shakeEgg;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.Vibrator, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Vibrator invoke() {
        ?? J2 = C786410Ut5.J2(this.LL.LL, "vibrator");
        if (J2 instanceof Vibrator) {
            return J2;
        }
        return null;
    }
}
