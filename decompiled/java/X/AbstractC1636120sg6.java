package X;

import kotlin.jvm.internal.AwS1S3001000_25;

/* JADX INFO: renamed from: X.0sg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1636120sg6 extends C1320700kTM<InterfaceC1330440kj4> {
    public abstract String LJIIJJI();

    public abstract String LJIIL();

    public abstract String LJIILIIL();

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZ(String str, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effectId: ");
        sbLIZ.append(LJIIL());
        sbLIZ.append(", errorMessage: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C1634980seG.LIZ("edit_sticker_preview_download_failed", new AwS1S3001000_25(C2188811AlT.LIZIZ(sbLIZ), LJIIJJI(), LJIILIIL(), 1));
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effectId: ");
        sbLIZ.append(LJIIL());
        sbLIZ.append(", errorMessage: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C1634980seG.LIZ("edit_sticker_preview_download_failed", new AwS1S3001000_25(C2188811AlT.LIZIZ(sbLIZ), LJIIJJI(), LJIILIIL(), 1));
    }
}
