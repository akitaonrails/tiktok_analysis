package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0m6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383680m6w implements InterfaceC1663080tNa {
    public final /* synthetic */ AbstractC1383520m6g LIZ;
    public final /* synthetic */ Function1<String, Unit> LIZIZ;

    @Override // X.InterfaceC1663080tNa
    public final void LIZIZ(String str, String str2) {
    }

    @Override // X.InterfaceC1663080tNa
    public final void onProgress(float f) {
    }

    public final void LIZJ() {
        this.LIZIZ.invoke("VEVideoStream onRetry");
    }

    @Override // X.InterfaceC1663080tNa
    public final void onSuccess(String str) {
        AbstractC1383520m6g abstractC1383520m6g = this.LIZ;
        if (abstractC1383520m6g != null) {
            abstractC1383520m6g.LIZLLL(str, str);
        }
    }

    public C1383680m6w(AbstractC1383520m6g abstractC1383520m6g, C1383650m6t c1383650m6t) {
        this.LIZ = abstractC1383520m6g;
        this.LIZIZ = c1383650m6t;
    }

    @Override // X.InterfaceC1663080tNa
    public final void LIZ(int i, String str) {
        Function1<String, Unit> function1 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoStream onFailed errorCode=");
        sbLIZ.append(i);
        sbLIZ.append(" msg=");
        sbLIZ.append(str);
        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
    }
}
