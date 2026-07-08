package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321520kUg extends C09AY implements Function1<C1549320qQ6, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1321520kUg(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1549320qQ6 c1549320qQ6) {
        c1549320qQ6.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolveSource ok: from=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", to=");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }
}
