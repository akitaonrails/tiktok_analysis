package X;

import Y.ARunnableS116S0100000_16;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ch8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021720ch8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C1021680ch4 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1021720ch8(boolean z, boolean z2, C425220Gls c425220Gls, int i, C1021680ch4 c1021680ch4) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c425220Gls;
        this.LLILZ = i;
        this.LLILZIL = c1021680ch4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.LL ? 50 : DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        if (this.LLILLJJLI) {
            this.LLILLL.smoothScrollBy(this.LLILZ, 0, C1619980sG4.LJIIJJI(), i);
            C1021750chB c1021750chB = this.LLILZIL.LLL;
            long j = i;
            View view = c1021750chB.LIZ;
            if (view != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS116S0100000_16(c1021750chB, 104), j);
            }
        } else {
            this.LLILLL.scrollBy(this.LLILZ, 0);
            this.LLILZIL.LLL.LIZ();
        }
        return Unit.LIZ;
    }
}
