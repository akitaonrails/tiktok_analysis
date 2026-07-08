package X;

import android.util.Log;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529020Kou extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C529210KpD LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529020Kou(int i, C529210KpD c529210KpD, int i2, String str) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = c529210KpD;
        this.LLILLL = i2;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("media selection blocked by duration limit, errorCode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", checkInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", minDuration=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(",message=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", scene=showImportErrorToast, callStacktrace=");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
