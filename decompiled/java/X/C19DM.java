package X;

import Y.ARunnableS101S0200000_32;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19DM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19DL LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19DM(C19DL c19dl, Context context) {
        super(0);
        this.LL = c19dl;
        this.LLILLJJLI = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C2073708Al.LIZ) {
            C823050WQl.LIZLLL().execute(new ARunnableS101S0200000_32(this.LL, this.LLILLJJLI, 12));
        } else {
            C1AMU c1amuLIZ = this.LL.LIZ(this.LLILLJJLI);
            if (c1amuLIZ != null) {
                c1amuLIZ.LIZIZ(this.LLILLJJLI);
            }
        }
        return Unit.LIZ;
    }
}
