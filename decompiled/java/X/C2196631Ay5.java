package X;

import android.webkit.WebView;

/* JADX INFO: renamed from: X.1Ay5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196631Ay5 implements InterfaceC1547420qN2 {
    @Override // X.InterfaceC1547420qN2
    public final void LIZ(InterfaceC1541990qEH interfaceC1541990qEH) {
        C2188811AlT.LIZ().append("sparkViewCallback, onLoadFinish, isWebEntryPageLoadFinished:");
        throw null;
    }

    @Override // X.InterfaceC1547420qN2
    public final void LIZIZ(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkViewCallback, onPageFinished, url:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        throw null;
    }

    @Override // X.InterfaceC1547420qN2
    public final void LIZJ(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkViewCallback, onPageStarted, url:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1547420qN2
    public final void LIZLLL(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceivedTitle, title:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        throw null;
    }

    @Override // X.InterfaceC1547420qN2
    public final void LJ(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkViewCallback, onLoadStart, url:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        throw null;
    }

    @Override // X.InterfaceC1547420qN2
    public final void LJFF(String str, C1542120qEU c1542120qEU) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkViewCallback, onLoadFailed, url:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        throw null;
    }

    @Override // X.InterfaceC1547420qN2
    public final void onProgressChanged(WebView webView, int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkViewCallback, onProgressChanged, newProgress:");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        throw null;
    }
}
