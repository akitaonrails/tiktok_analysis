package X;

import android.content.Context;
import android.util.Log;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService;

/* JADX INFO: renamed from: X.0nHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428730nHb<T> implements InterfaceC1478005qU {
    public final /* synthetic */ C11RK<C0L7F> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Boolean LIZLLL;
    public final /* synthetic */ C1428780nHg LJ;
    public final /* synthetic */ C1418100n0S LJFF;

    public C1428730nHb(C11RK<C0L7F> c11rk, String str, String str2, Boolean bool, C1428780nHg c1428780nHg, C1418100n0S c1418100n0S) {
        this.LIZ = c11rk;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = bool;
        this.LJ = c1428780nHg;
        this.LJFF = c1418100n0S;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<C1428790nHh> c09aj) {
        INLETemplateOfflineService iNLETemplateOfflineService;
        C1C7U.LIZ("TemplateWithMusicDownloader@9a2f.provideMusicDownloadObservable$1");
        this.LIZ.onNext(new C0L7F("stage_fetch_music", 0.0f, null, 12));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateDownloader start requestMusic: musicId = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", musicUrl = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", musicUnavailable = ");
        sbLIZ.append(this.LIZLLL);
        C0LCY.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ == null && this.LIZJ == null && (iNLETemplateOfflineService = (INLETemplateOfflineService) ServiceManager.get().getService(INLETemplateOfflineService.class)) != null && iNLETemplateOfflineService.LJFF()) {
            C0LCY.LIZ(LogLevel.LEVEL_INFO, "downloadMusic failed: music is null");
            String str = this.LIZIZ;
            c09aj.onNext(new C1428790nHh((String) null, 0, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, str, 3, (AVMusic) null, (String) null, this.LIZLLL, 105, str, 4607));
            c09aj.onComplete();
            C1C7U.LIZIZ("TemplateWithMusicDownloader@9a2f.provideMusicDownloadObservable$1");
            return;
        }
        ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
        Context context = this.LJ.LIZ;
        final String str2 = this.LIZIZ;
        String str3 = this.LIZJ;
        final Boolean bool = this.LIZLLL;
        C1418100n0S c1418100n0S = this.LJFF;
        final C11RK<C0L7F> c11rk = this.LIZ;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        iTemplateResourceService.LIZ(context, str2, str3, null, bool, c1418100n0S, new InterfaceC1428880nHq() { // from class: X.0nHc
            @Override // X.InterfaceC1428880nHq
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJI() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZIZ(Exception exc) {
                String stackTraceString;
                C0LCY.LIZ(LogLevel.LEVEL_INFO, "start requestMusic: onLoadMusicFail");
                C09AJ<C1428790nHh> c09aj2 = c19482611Ke;
                if (exc != null) {
                    stackTraceString = Log.getStackTraceString(exc);
                } else {
                    stackTraceString = null;
                }
                c09aj2.onNext(new C1428790nHh((String) null, 0, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, str2, 3, (AVMusic) null, (String) null, bool, 102, stackTraceString, 6655));
                c19482611Ke.onComplete();
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZLLL(AVMusic aVMusic) {
                String musicId;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("start requestMusic: onLoadMusicSuccess: ");
                if (aVMusic != null) {
                    musicId = aVMusic.getMusicId();
                } else {
                    musicId = null;
                }
                sbLIZ2.append(musicId);
                C0LCY.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                c11rk.onNext(new C0L7F("stage_fetch_music", 100.0f, null, 12));
                c11rk.onNext(new C0L7F("stage_download_music", 0.0f, null, 12));
                C0LCY.LIZ(LogLevel.LEVEL_INFO, "start downloadMusic");
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJII(int i) {
                c11rk.onNext(new C0L7F("stage_download_music", i, null, 12));
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZ(Integer num, String str4) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("downloadMusic failed: errCode = ");
                sbLIZ2.append(num);
                sbLIZ2.append(", errMsg = ");
                sbLIZ2.append(str4);
                C0LCY.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                C09AJ<C1428790nHh> c09aj2 = c19482611Ke;
                String str5 = str2;
                c09aj2.onNext(new C1428790nHh((String) null, 0, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, str5, 3, (AVMusic) null, (String) null, bool, 105, str5, 4607));
                c19482611Ke.onComplete();
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJFF(AVMusic aVMusic, String str4, boolean z, boolean z2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("downloadMusic success ");
                sbLIZ2.append(aVMusic);
                C0LCY.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                c11rk.onNext(new C0L7F("stage_download_music", 100.0f, null, 12));
                c19482611Ke.onNext(new C1428790nHh((String) null, 0, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, str2, 2, aVMusic, str4, Boolean.valueOf(z2), 0, (String) null, 49663));
                c19482611Ke.onComplete();
            }
        });
        C1C7U.LIZIZ("TemplateWithMusicDownloader@9a2f.provideMusicDownloadObservable$1");
    }
}
