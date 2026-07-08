package X;

import com.ss.android.ugc.tiktok.tools.performance.services.VEVideoStreamDownloadServiceImpl;
import com.ss.android.vesdk.VEDownloaderConfig;
import com.ss.android.vesdk.VEFileDownloader;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0tNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663090tNb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VEVideoStreamDownloadServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C1156790gCz LLILZLL;
    public final /* synthetic */ VEFileDownloader LLIZ;
    public final /* synthetic */ InterfaceC1663080tNa LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1663090tNb(VEVideoStreamDownloadServiceImpl vEVideoStreamDownloadServiceImpl, String str, String str2, String str3, int i, C1156790gCz c1156790gCz, VEFileDownloader vEFileDownloader, C1383680m6w c1383680m6w) {
        super(0);
        this.LL = vEVideoStreamDownloadServiceImpl;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i;
        this.LLILZLL = c1156790gCz;
        this.LLIZ = vEFileDownloader;
        this.LLIZLLLIL = c1383680m6w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VEVideoStreamDownloadServiceImpl vEVideoStreamDownloadServiceImpl = this.LL;
        String strLIZIZ = this.LLILLJJLI;
        vEVideoStreamDownloadServiceImpl.getClass();
        if (!u.LJIIZILJ(strLIZIZ, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(File.separator);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("Accept-Encoding", "gzip");
        VEDownloaderConfig vEDownloaderConfig = new VEDownloaderConfig(this.LLILLL, strLIZIZ);
        String str = this.LLILZ;
        C1156790gCz c1156790gCz = this.LLILZLL;
        vEDownloaderConfig.maxDownloadCount = 4;
        vEDownloaderConfig.maxCacheFileCount = 10;
        vEDownloaderConfig.needSaveFile = true;
        vEDownloaderConfig.maxNetworkTimeout = 10000;
        vEDownloaderConfig.headerParams = map;
        vEDownloaderConfig.customSavePath = str;
        if (c1156790gCz != null && (!a0.LJJJIL(c1156790gCz.LIZ)) && c1156790gCz.LIZIZ > 0 && new C0VSJ(c1156790gCz.LIZ).exists()) {
            vEDownloaderConfig.externalPath = c1156790gCz.LIZ;
            vEDownloaderConfig.externalFirstSegOffset = c1156790gCz.LIZIZ;
            long j = c1156790gCz.LIZJ;
            if (j > 0) {
                vEDownloaderConfig.externalMediaSize = j;
            }
        }
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startStreamDownload start VE downloader: url=");
        sbLIZ2.append(this.LLILLL);
        sbLIZ2.append(" savePath=");
        sbLIZ2.append(this.LLILZ);
        sbLIZ2.append(" netLevelThreshold=");
        sbLIZ2.append(this.LLILZIL);
        sbLIZ2.append(" externalSegment=");
        sbLIZ2.append(this.LLILZLL);
        C201955140j.LIZLLL(c20102213l6, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ2));
        VEFileDownloader vEFileDownloader = this.LLIZ;
        final VEVideoStreamDownloadServiceImpl vEVideoStreamDownloadServiceImpl2 = this.LL;
        final String str2 = this.LLILLL;
        final String str3 = this.LLILZ;
        final InterfaceC1663080tNa interfaceC1663080tNa = this.LLIZLLLIL;
        vEVideoStreamDownloadServiceImpl2.getClass();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        vEFileDownloader.createFileDownloadWithCustomPath(vEDownloaderConfig, new AbstractC20187113yn() { // from class: X.0tNZ
            @Override // X.InterfaceC20187013ym
            public final void LIZ(String str4) {
                boolean z;
                String str5;
                C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onFinished savePath=");
                sbLIZ3.append(str3);
                sbLIZ3.append("，url=");
                sbLIZ3.append(str4);
                C201955140j.LIZLLL(c20102213l62, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ3));
                if (str4 != null) {
                    vEVideoStreamDownloadServiceImpl2.LIZ.remove(str4);
                } else {
                    str4 = str2;
                }
                C0VSJ c0vsj = new C0VSJ(str3);
                if (c0vsj.exists() && c0vsj.length() > 0) {
                    z = true;
                    vEVideoStreamDownloadServiceImpl2.LIZIZ.put(str2, str3);
                } else {
                    z = false;
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    interfaceC1663080tNa.onSuccess(str4);
                }
                if (z) {
                    str5 = str3;
                } else {
                    str5 = str4;
                }
                interfaceC1663080tNa.LIZIZ(str4, str5);
                Iterator<InterfaceC1663080tNa> it2 = vEVideoStreamDownloadServiceImpl2.LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(str4, str5);
                }
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZJ(String str4) {
                C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onConnected url=");
                sbLIZ3.append(str4);
                C201955140j.LIZLLL(c20102213l62, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ3));
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZLLL(String str4, boolean z) {
                String str5;
                C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onOpenResult success=");
                sbLIZ3.append(z);
                sbLIZ3.append("，url=");
                sbLIZ3.append(str4);
                sbLIZ3.append(' ');
                C201955140j.LIZLLL(c20102213l62, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ3));
                if (!atomicBoolean.compareAndSet(false, true)) {
                    return;
                }
                if (str4 == null) {
                    str5 = str2;
                } else {
                    str5 = str4;
                }
                if (z) {
                    interfaceC1663080tNa.onSuccess(str5);
                    Iterator<InterfaceC1663080tNa> it2 = vEVideoStreamDownloadServiceImpl2.LIZJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onSuccess(str5);
                    }
                    return;
                }
                if (str4 != null) {
                    vEVideoStreamDownloadServiceImpl2.LIZ.remove(str4);
                }
                interfaceC1663080tNa.LIZ(-100, "open result failed");
                Iterator<InterfaceC1663080tNa> it3 = vEVideoStreamDownloadServiceImpl2.LIZJ.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZ(-100, "open result failed");
                }
            }

            @Override // X.InterfaceC20187013ym
            public final void LJJJLL(String str4, float f) {
                C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onProgress progress=");
                sbLIZ3.append(f);
                C201955140j.LIZLLL(c20102213l62, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ3));
                interfaceC1663080tNa.onProgress(f);
                Iterator<InterfaceC1663080tNa> it2 = vEVideoStreamDownloadServiceImpl2.LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().onProgress(f);
                }
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZIZ(String str4, int i, int i2, String str5) {
                if (str4 != null) {
                    vEVideoStreamDownloadServiceImpl2.LIZ.remove(str4);
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("stream download error before settled: url=");
                    sbLIZ3.append(str4);
                    sbLIZ3.append(" errorCode=");
                    sbLIZ3.append(i);
                    sbLIZ3.append(" ext=");
                    sbLIZ3.append(i2);
                    sbLIZ3.append(" msg=");
                    sbLIZ3.append(str5);
                    sbLIZ3.append(" savePath=");
                    sbLIZ3.append(str3);
                    C201955140j.LJIIIIZZ(c20102213l62, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ3));
                    interfaceC1663080tNa.LIZ(i, str5);
                }
                Iterator<InterfaceC1663080tNa> it2 = vEVideoStreamDownloadServiceImpl2.LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(i, str5);
                }
            }

            @Override // X.AbstractC20187113yn
            public final void LJ(String str4, int i, int i2, float f, String str5) {
                C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onInfo type=");
                sbLIZ3.append(i);
                sbLIZ3.append(" msg=");
                sbLIZ3.append(str5);
                C201955140j.LIZLLL(c20102213l62, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ3));
            }
        });
        return Unit.LIZ;
    }
}
