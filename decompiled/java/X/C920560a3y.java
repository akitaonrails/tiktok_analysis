package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0a3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C920560a3y extends C2217421BqW implements Function2<String, Throwable, Unit> {
    public C920560a3y(C968480bJG c968480bJG) {
        super(2, c968480bJG, C968480bJG.class, "upload", "upload(Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Throwable th) {
        String message;
        String str2 = str;
        Throwable th2 = th;
        this.receiver.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("split on rtc, error: ");
        sbLIZ.append(str2);
        sbLIZ.append(", ");
        if (th2 != null) {
            message = th2.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C20441214yg.LJIIIZ("RustLiveStreamer[Biz]", C2188811AlT.LIZIZ(sbLIZ));
        if (th2 != null) {
            C1304660k3U.LIZ.LIZIZ(20013, str2, th2, null);
        } else {
            C1304660k3U.LIZ.LIZ(20013, str2, null);
        }
        return Unit.LIZ;
    }
}
