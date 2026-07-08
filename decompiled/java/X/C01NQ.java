package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01NQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01NQ extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01NQ(long j, Function1<? super Bitmap, Unit> function1) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChooseCoverCompressUtil, setImageCompressBitmap, cost: ");
        sbLIZ.append(System.currentTimeMillis() - this.LL);
        C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.invoke(bitmap);
        return Unit.LIZ;
    }
}
