package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0kBX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsSharedViewModel$downloadHighlightVideo$1", f = "MyMomentsSharedViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1309650kBX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309650kBX(String str, InterfaceC1364105Vn<? super C1309650kBX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309650kBX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("MyMomentsSharedViewModel@7ad7.downloadHighlightVideo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String path = C786410Ut5.w2(C1383370m6R.LIZ).getPath();
        if (u.LJIIZILJ(path, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(path);
            sbLIZ.append("poi_campaign_highlight_video_file");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(path);
            sbLIZ2.append("/poi_campaign_highlight_video_file");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        try {
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        final String strLIZ = C2177408g0.LIZ("ttls_rd_add_poi_campaign_experience_track", "highlights_video_download", null);
        C1200000hKg.LIZIZ(strLIZ).start();
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        abstractC2199801B7qWith.LIZJ = "poi_campaign_highlight_video_file";
        abstractC2199801B7qWith.LJ = C786410Ut5.w2(C1383370m6R.LIZ).getPath();
        abstractC2199801B7qWith.LJII = 1;
        abstractC2199801B7qWith.LJIIL = new IDownloadListener() { // from class: X.0hTI
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstStart(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstSuccess(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPrepare(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                InterfaceC1199990hKf interfaceC1199990hKfLIZIZ = C1200000hKg.LIZIZ(strLIZ);
                interfaceC1199990hKfLIZIZ.LJIJI("canceled");
                interfaceC1199990hKfLIZIZ.LJJIFFI();
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                if (downloadInfo != null) {
                    if (u.LJIIZILJ(downloadInfo.getSavePath(), "/", false)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(downloadInfo.getSavePath());
                        sbLIZ3.append(downloadInfo.getName());
                        C1440005kM.LIZIZ(new C7829033z(C2188811AlT.LIZIZ(sbLIZ3)));
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(downloadInfo.getSavePath());
                        sbLIZ4.append('/');
                        sbLIZ4.append(downloadInfo.getName());
                        C1440005kM.LIZIZ(new C7829033z(C2188811AlT.LIZIZ(sbLIZ4)));
                    }
                }
                C1200000hKg.LIZIZ(strLIZ).LJJ(null);
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                Integer numValueOf;
                C1440005kM.LIZIZ(new IEvent() { // from class: X.0hHq
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
                InterfaceC1199990hKf interfaceC1199990hKfLIZIZ = C1200000hKg.LIZIZ(strLIZ);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("failed_");
                if (baseException != null) {
                    numValueOf = Integer.valueOf(baseException.getErrorCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ3.append(numValueOf);
                interfaceC1199990hKfLIZIZ.LJIJI(C2188811AlT.LIZIZ(sbLIZ3));
                interfaceC1199990hKfLIZIZ.LJJIFFI();
            }
        };
        abstractC2199801B7qWith.LJ(new InterfaceC2329409Au() { // from class: X.0kBY
            @Override // X.InterfaceC2329409Au
            public final void onStart(int i) {
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MyMomentsSharedViewModel@7ad7.downloadHighlightVideo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
