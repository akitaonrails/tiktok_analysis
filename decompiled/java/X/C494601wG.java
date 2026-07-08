package X;

import android.app.Activity;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01wG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C494601wG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494601wG(Context context, boolean z) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activityLIZ = C1388190mED.LIZ(this.LL);
        if (activityLIZ != null) {
            if (this.LLILLJJLI) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131837530);
                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                c1389890mGx.LJII(R.attr.a1h);
                c1389890mGx.LJIIJJI();
            } else {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
                c1389890mGx2.LJIIIZ(2131835079);
                c1389890mGx2.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }
}
