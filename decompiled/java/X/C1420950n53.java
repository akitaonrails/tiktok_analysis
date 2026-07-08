package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0n53, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointDownloadHelper$downloadMusicInfoV2$1$downloadMusicFileTask$1", f = "StickPointDownloadHelper.kt", l = {219}, m = "invokeSuspend")
public final class C1420950n53 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends AVMusic>>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ AVMusic LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420950n53(Context context, AVMusic aVMusic, InterfaceC1364105Vn<? super C1420950n53> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = aVMusic;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1420950n53(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Application applicationLIZ;
        List<String> urlList;
        C1C7U.LIZ("StickPointDownloadHelper@e94d.downloadMusicInfoV2$1$downloadMusicFileTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1420960n54 c1420960n54 = C1420960n54.LIZ;
            Context context = this.LLILLJJLI;
            final AVMusic aVMusic = this.LLILLL;
            this.LL = 1;
            c1420960n54.getClass();
            if (context != null && aVMusic != null && !TextUtils.isEmpty(aVMusic.getPath())) {
                final String strLJFF = C1444820nhY.LJFF(aVMusic);
                String str = null;
                try {
                    ((C19221910Hx) ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService()).getClass();
                    applicationLIZ = C1BWL.LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C201955140j.LJIIL("ServiceManager fail, no context and local music load fail");
                    applicationLIZ = null;
                }
                if (C2486109oh.LIZLLL(applicationLIZ, strLJFF)) {
                    C201955140j.LIZJ(C201962140q.LIZIZ, "StickPointMusic, local music file exist, music id: " + aVMusic.getMusicId());
                    obj = new Pair(true, aVMusic);
                } else {
                    String strLIZ = C141Q.LIZ(aVMusic);
                    if (strLIZ == null || u.LJJIIJZLJL(strLIZ, "http", false)) {
                        z = false;
                    }
                    if (z && !u.LJJIIJZLJL(strLIZ, "https", false)) {
                        UrlModel playUrl = aVMusic.getPlayUrl();
                        if (playUrl != null && (urlList = playUrl.getUrlList()) != null) {
                            str = (String) ListProtector.get(urlList, 0);
                        }
                        strLIZ = str;
                    }
                    final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                    final C013C c013c = new C013C();
                    C1420960n54 c1420960n542 = C1420960n54.LIZ;
                    C1421000n58 c1421000n58 = new C1421000n58() { // from class: X.0n55
                        @Override // X.C1421000n58, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            if (!C2354709Kn.LIZIZ(strLJFF)) {
                                C013C c013c2 = c013c;
                                InterfaceC1364105Vn<Pair<Boolean, ? extends AVMusic>> interfaceC1364105Vn = c23260099m;
                                Pair pair = new Pair(Boolean.FALSE, aVMusic);
                                if (!c013c2.element) {
                                    c013c2.element = true;
                                    C189200o6.m2constructorimpl(pair);
                                    interfaceC1364105Vn.resumeWith(pair);
                                }
                                C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                                AVMusic aVMusic2 = aVMusic;
                                c1441170nbf.getClass();
                                C1441170nbf.LIZLLL(false, aVMusic2, null);
                                return;
                            }
                            C013C c013c3 = c013c;
                            InterfaceC1364105Vn<Pair<Boolean, ? extends AVMusic>> interfaceC1364105Vn2 = c23260099m;
                            Pair pair2 = new Pair(Boolean.TRUE, aVMusic);
                            if (!c013c3.element) {
                                c013c3.element = true;
                                C189200o6.m2constructorimpl(pair2);
                                interfaceC1364105Vn2.resumeWith(pair2);
                            }
                            C1441170nbf c1441170nbf2 = C1441170nbf.LIZ;
                            AVMusic aVMusic3 = aVMusic;
                            c1441170nbf2.getClass();
                            C1441170nbf.LIZLLL(true, aVMusic3, null);
                        }

                        @Override // X.C1421000n58, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            C013C c013c2 = c013c;
                            InterfaceC1364105Vn<Pair<Boolean, ? extends AVMusic>> interfaceC1364105Vn = c23260099m;
                            Pair pair = new Pair(Boolean.FALSE, aVMusic);
                            if (!c013c2.element) {
                                c013c2.element = true;
                                C189200o6.m2constructorimpl(pair);
                                interfaceC1364105Vn.resumeWith(pair);
                            }
                            C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                            AVMusic aVMusic2 = aVMusic;
                            c1441170nbf.getClass();
                            C1441170nbf.LIZLLL(false, aVMusic2, baseException);
                        }
                    };
                    c1420960n542.getClass();
                    C1420960n54.LIZ(applicationLIZ, strLIZ, strLJFF, c1421000n58);
                    obj = c23260099m.LIZ();
                    if (obj == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                }
            } else {
                obj = new Pair(false, aVMusic);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickPointDownloadHelper@e94d.downloadMusicInfoV2$1$downloadMusicFileTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StickPointDownloadHelper@e94d.downloadMusicInfoV2$1$downloadMusicFileTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends AVMusic>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
