package X;

import Y.ALAdapterS19S0200000_25;
import Y.AUListenerS273S0100000_25;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0suw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645320suw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1645330sux LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1645320suw(C1645330sux c1645330sux, float f, float f2, int i) {
        super(0);
        this.LL = c1645330sux;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ValueAnimator valueAnimatorOfFloat;
        EnumC1645310suv enumC1645310suv;
        float fAbs;
        C1645330sux c1645330sux = this.LL;
        float f = this.LLILLJJLI;
        float f2 = this.LLILLL;
        int i = this.LLILZ;
        c1645330sux.getClass();
        if (Math.signum(f2) == Math.signum(f)) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, 0.0f);
            enumC1645310suv = EnumC1645310suv.NONE;
            fAbs = i * Math.abs(f2);
        } else {
            float[] fArr = new float[2];
            fArr[0] = f2;
            fArr[1] = f >= 1.0E-5f ? -1.0f : 1.0f;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            enumC1645310suv = f >= 1.0E-5f ? EnumC1645310suv.LEFT : EnumC1645310suv.RIGHT;
            fAbs = i * (1 - Math.abs(f2));
        }
        long jMin = Math.min((long) (((long) fAbs) / ((Math.abs(f) / LSPassThroughRecordSizeConfig.DEFAULT) / 2)), 400L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(jMin);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS273S0100000_25(c1645330sux, 1));
        valueAnimatorOfFloat.addListener(new ALAdapterS19S0200000_25(c1645330sux, enumC1645310suv, 0));
        valueAnimatorOfFloat.start();
        c1645330sux.LIZ = valueAnimatorOfFloat;
        return Unit.LIZ;
    }
}
