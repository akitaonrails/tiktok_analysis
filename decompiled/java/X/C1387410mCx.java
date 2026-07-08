package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387410mCx extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C1387370mCt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387410mCx(C1387370mCt c1387370mCt) {
        super(1);
        this.LL = c1387370mCt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.LL.LLLILZLLLI = str;
        return Unit.LIZ;
    }
}
