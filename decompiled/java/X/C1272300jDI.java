package X;

import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1272300jDI implements InterfaceC1272580jDk {
    @Override // X.InterfaceC1272580jDk
    public final void onError(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Effect api return error: ");
        sbLIZ.append(i);
        sbLIZ.append(". Calling info: ");
        sbLIZ.append(str);
        AVLog.logKibana(6, "VideoEffectNode", C2188811AlT.LIZIZ(sbLIZ), null);
    }
}
