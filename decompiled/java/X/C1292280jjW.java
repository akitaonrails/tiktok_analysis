package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0jjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292280jjW extends C09AY implements Function1<C1549320qQ6, Unit> {
    public final /* synthetic */ File LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Throwable LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1292280jjW(File file, String str, Throwable th) {
        super(1);
        this.LL = file;
        this.LLILLJJLI = str;
        this.LLILLL = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1549320qQ6 c1549320qQ6) {
        c1549320qQ6.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cleanupPreparedArtifactsAsync failed: dir=");
        sbLIZ.append(this.LL.getAbsolutePath());
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", err=");
        sbLIZ.append(this.LLILLL.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }
}
