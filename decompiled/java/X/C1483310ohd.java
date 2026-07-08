package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.0ohd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483310ohd extends C0S3K {
    public final InterfaceC1483670oiD LL;
    public final InterfaceC1483770oiN LLILLJJLI;
    public final LruCache<String, Boolean> LLILLL = new LruCache<>(10);
    public final boolean LLILZ = C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableSoftwareDecodeBlockIssueOpt();

    @Override // X.C0S3K, X.InterfaceC1482530ogN
    public final void onStopPlay(String str) {
        InterfaceC1483770oiN interfaceC1483770oiN;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStopPlay: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILZ) {
            Boolean bool = this.LLILLL.get(str);
            if ((bool == null || !bool.booleanValue()) && (interfaceC1483770oiN = this.LLILLJJLI) != null) {
                interfaceC1483770oiN.LIZ();
            }
        }
    }

    public C1483310ohd(InterfaceC1483670oiD interfaceC1483670oiD, InterfaceC1483770oiN interfaceC1483770oiN) {
        this.LL = interfaceC1483670oiD;
        this.LLILLJJLI = interfaceC1483770oiN;
    }

    @Override // X.C0S3K, X.InterfaceC1482530ogN
    public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPreparePlay: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILZ) {
            this.LLILLL.put(str, Boolean.FALSE);
        }
    }

    @Override // X.C0S3K, X.InterfaceC1482530ogN
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        boolean z;
        if (this.LLILZ) {
            this.LLILLL.put(str, Boolean.TRUE);
        }
        int iLIZLLL = this.LL.LJIIIZ().LIZLLL();
        if (iLIZLLL != 3 && iLIZLLL != 4 && iLIZLLL != 5 && iLIZLLL != 6 && iLIZLLL != 7 && iLIZLLL != 8) {
            z = false;
        } else {
            z = true;
        }
        C786410Ut5.j4("onRenderFirstFrame: key:%s, softwareDecode:%s, codecName:%s", new Object[]{str, Boolean.valueOf(z), Integer.valueOf(iLIZLLL)});
        if (z) {
            this.LLILLJJLI.LIZ();
        }
    }
}
