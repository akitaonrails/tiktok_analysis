package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.141p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201987141p implements InterfaceC201990141s {
    public final UrlModel LIZ;
    public final String LIZIZ;
    public final CountDownLatch LIZJ;
    public final String LIZLLL;
    public int LJ = -1;
    public C20306414cw LJFF;
    public C201989141r LJI;

    public final void LIZ() {
        List<String> list;
        UrlModel urlModel = this.LIZ;
        if (urlModel == null || TextUtils.isEmpty(urlModel.getUri()) || !(!C086I.LIZIZ(urlModel.getUrlList()))) {
            CountDownLatch countDownLatch = this.LIZJ;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Download Music Beat illegal beat url: ");
            sbLIZ.append(C1838950xxF.LIZIZ(this.LIZ));
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HttpHeader("Accept-Encoding", " "));
        this.LJFF = new C20306414cw(this, 1);
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(C1838950xxF.LIZ(this.LIZ));
        UrlModel urlModel2 = this.LIZ;
        List<String> urlList = urlModel2.getUrlList();
        if (urlList != null) {
            ArrayList arrayList2 = new ArrayList(urlList);
            arrayList2.remove(C1838950xxF.LIZ(urlModel2));
            list = arrayList2;
        } else {
            list = C13BV.INSTANCE;
        }
        abstractC2199801B7qWith.LJIIIIZZ = list;
        abstractC2199801B7qWith.LJ = C2428409fO.LIZ;
        abstractC2199801B7qWith.LIZJ = this.LIZLLL;
        abstractC2199801B7qWith.LJII = 3;
        abstractC2199801B7qWith.LJIIJ = "music_beat_file";
        abstractC2199801B7qWith.LJIIL = this.LJFF;
        abstractC2199801B7qWith.LJJ = true;
        abstractC2199801B7qWith.LJFF(arrayList);
        this.LJ = abstractC2199801B7qWith.LIZJ();
    }

    @Override // X.InterfaceC201990141s
    public final void cancel() {
        C844470XAv.LIZ.getClass();
        Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C844470XAv.LIZ()).removeSubThreadListener(this.LJ, this.LJFF);
        this.LJI = null;
    }

    @Override // X.InterfaceC201990141s
    public final void release() {
        C844470XAv.LIZ.getClass();
        Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C844470XAv.LIZ()).removeSubThreadListener(this.LJ, this.LJFF);
        this.LJI = null;
    }

    public C201987141p(UrlModel urlModel, String str, String str2, CountDownLatch countDownLatch) {
        this.LIZ = urlModel;
        this.LIZIZ = str2;
        this.LIZJ = countDownLatch;
        String str3 = C2428409fO.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str4 = C2428409fO.LIZ;
        sbLIZ.append(str4);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C08HM.LIZJ(str));
        sbLIZ2.append(".json");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C08HM.LIZJ(str));
        sbLIZ3.append(".json");
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
        C2137908Zd.LIZJ.LIZIZ(str4);
    }
}
