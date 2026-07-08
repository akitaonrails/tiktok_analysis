package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965770bEt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965770bEt(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryLoadRustLib, source=");
        sbLIZ.append(this.LL);
        C20441214yg.LJIIIZ("LinkerPlugin", C2188811AlT.LIZIZ(sbLIZ));
        ((Boolean) C968160bIk.LIZ.getValue()).booleanValue();
        boolean z = C965700bEm.LIZ;
        C965700bEm.LIZ = true;
        return Unit.LIZ;
    }
}
