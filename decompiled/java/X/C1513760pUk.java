package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513760pUk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513760pUk(Context context, int i) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.LL, this.LLILLJJLI);
        if (drawableLIZIZ != null) {
            C1513750pUj.LIZ.put(Integer.valueOf(this.LLILLJJLI), drawableLIZIZ);
        }
        return Unit.LIZ;
    }
}
