package X;

import android.content.Context;
import android.graphics.RectF;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GTC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTC extends C09AY implements Function0<RectF> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0GTC(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RectF invoke() {
        float fLIZ = C0SK0.LIZ(this.LL) / 2;
        float f = 2;
        return new RectF(fLIZ - (C418440Gaw.LIZIZ(36) / f), C418440Gaw.LIZIZ(2), fLIZ + (C418440Gaw.LIZIZ(36) / f), C418440Gaw.LIZIZ(6));
    }
}
