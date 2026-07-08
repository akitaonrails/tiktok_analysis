package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816980xNo extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1816940xNk LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816980xNo(C1816940xNk c1816940xNk) {
        super(1);
        this.LL = c1816940xNk;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C1816940xNk c1816940xNk = this.LL;
            c1816940xNk.LJIILL(c1816940xNk.getRichTextContent());
        } else {
            C20441214yg.LIZIZ("boards DEBUG", "Fonts unavailable (invalid/not yet downloaded)");
        }
        return Unit.LIZ;
    }
}
