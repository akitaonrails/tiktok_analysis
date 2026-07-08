package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS286S0300000_8;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Kxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534500Kxk implements InterfaceC534480Kxi {
    public final Context LIZ;
    public final InterfaceC534560Kxq LIZIZ;
    public Function1<? super Integer, Unit> LIZJ;
    public Function2<? super C534490Kxj, ? super DownloadInfo, Unit> LIZLLL;
    public Function0<Unit> LJ;
    public Function2<? super DownloadInfo, ? super C534490Kxj, Unit> LJFF;
    public int LJII;
    public int LJIIIZ;
    public final List<Integer> LJI = new ArrayList();
    public final Map<Long, Integer> LJIIIIZZ = new LinkedHashMap();
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);

    public final void LJ() {
        C534580Kxs c534580Kxs = C534580Kxs.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCancel, ");
        sbLIZ.append(this.LJIIJ.get());
        C201955140j.LIZLLL(c534580Kxs, "DownloadCallback", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJ.get()) {
            DownloadInfo downloadInfo = new DownloadInfo();
            downloadInfo.setFailedException(new BaseException(-9999, "cancel"));
            LJFF(downloadInfo, null);
        }
    }

    @Override // X.InterfaceC534480Kxi
    public final void LIZ(AwS405S0200000_4 awS405S0200000_4) {
        this.LJ = awS405S0200000_4;
    }

    @Override // X.InterfaceC534480Kxi
    public final void LIZIZ(AwS286S0300000_8 awS286S0300000_8) {
        this.LIZLLL = awS286S0300000_8;
    }

    @Override // X.InterfaceC534480Kxi
    public final void LIZJ(AwS286S0300000_8 awS286S0300000_8) {
        this.LJFF = awS286S0300000_8;
    }

    @Override // X.InterfaceC534480Kxi
    public final void LIZLLL(AwS587S0100000_8 awS587S0100000_8) {
        this.LIZJ = awS587S0100000_8;
    }

    public C534500Kxk(Context context, InterfaceC534560Kxq interfaceC534560Kxq) {
        this.LIZ = context;
        this.LIZIZ = interfaceC534560Kxq;
    }

    public final void LJFF(DownloadInfo downloadInfo, C534490Kxj c534490Kxj) {
        BaseException failedException;
        C534580Kxs c534580Kxs = C534580Kxs.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed, config: ");
        sbLIZ.append(c534490Kxj);
        sbLIZ.append(", failedReason: ");
        if (downloadInfo != null) {
            failedException = downloadInfo.getFailedException();
        } else {
            failedException = null;
        }
        sbLIZ.append(failedException);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJIIJ.get());
        C201955140j.LIZLLL(c534580Kxs, "DownloadCallback", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJIIJ.get()) {
            return;
        }
        Function2<? super DownloadInfo, ? super C534490Kxj, Unit> function2 = this.LJFF;
        if (function2 != null) {
            function2.invoke(downloadInfo, c534490Kxj);
        }
        this.LJIIJ.set(false);
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).clearDownloadData(((Number) it2.next()).intValue());
        }
        ((ArrayList) this.LJI).clear();
        this.LJII = 0;
        ((LinkedHashMap) this.LJIIIIZZ).clear();
        this.LJIIIZ = 0;
        this.LIZIZ.cancel();
    }

    public final void LJI(C534490Kxj c534490Kxj, int i) {
        if (!this.LJIIJ.get()) {
            return;
        }
        this.LJIIIIZZ.put(Long.valueOf(c534490Kxj.LIZ), Integer.valueOf(i));
        int iLJZI = C13LP.LJZI(((LinkedHashMap) this.LJIIIIZZ).values());
        Function1<? super Integer, Unit> function1 = this.LIZJ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(Math.min(iLJZI / this.LJII, 100)));
        }
    }
}
