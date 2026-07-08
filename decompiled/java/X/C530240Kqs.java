package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS30S0202000_8;

/* JADX INFO: renamed from: X.0Kqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530240Kqs extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ C1322110kVd LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C530240Kqs(C1322110kVd c1322110kVd, int i, int i2) {
        super(1);
        this.LL = c1322110kVd;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (!bitmap2.isRecycled()) {
            C0CNO.LIZLLL(0L, new AwS30S0202000_8(this.LL, bitmap2, this.LLILLJJLI, this.LLILLL, 1));
        }
        return Unit.LIZ;
    }
}
