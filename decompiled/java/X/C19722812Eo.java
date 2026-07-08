package X;

import com.ss.android.socialbase.downloader.depend.IDownloadListener;

/* JADX INFO: renamed from: X.12Eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19722812Eo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AbstractC2199801B7q abstractC2199801B7q) {
        IDownloadListener iDownloadListener;
        C19723412Eu c19723412Eu;
        boolean z;
        if (abstractC2199801B7q != null) {
            iDownloadListener = abstractC2199801B7q.LJIIL;
        } else {
            iDownloadListener = null;
        }
        if (iDownloadListener instanceof C19723412Eu) {
            c19723412Eu = (C19723412Eu) iDownloadListener;
        } else {
            c19723412Eu = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelListener: task is null=");
        boolean z2 = true;
        if (abstractC2199801B7q == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", listener is null=");
        if (c19723412Eu != null) {
            z2 = false;
        }
        sbLIZ.append(z2);
        C21290818Tq.LIZJ("DownloadHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (c19723412Eu != null) {
            c19723412Eu.LL = null;
        }
    }
}
