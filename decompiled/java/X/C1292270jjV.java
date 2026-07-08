package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0jjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292270jjV extends C09AY implements Function1<C1549320qQ6, Unit> {
    public final /* synthetic */ File LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1292270jjV(File file, int i) {
        super(1);
        this.LL = file;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1549320qQ6 c1549320qQ6) {
        c1549320qQ6.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareZipSourceAsync stale result ignored: zip=");
        sbLIZ.append(this.LL.getAbsolutePath());
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }
}
