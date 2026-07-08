package X;

import Y.ARunnableS100S0200000_31;
import Y.ARunnableS28S0210000_31;
import Y.ARunnableS49S0110000_31;
import Y.ARunnableS64S0300000_31;
import Y.ARunnableS6S0111000_31;
import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15LD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15LD implements InterfaceC1661080tKM {
    public final /* synthetic */ MusicModel LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ C15L9 LJFF;

    @Override // X.InterfaceC1661080tKM
    public final void LIZ(C1661050tKJ c1661050tKJ) {
        if (c1661050tKJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFailed-->result:");
            sbLIZ.append(c1661050tKJ.LIZJ);
            C201955140j.LJIILIIL("MusicDetailDownloadHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        C20684815ws.LJIJI("music_detail_trace", new Pair("music_download_failed", "stage"));
        C15L9 c15l9 = this.LJFF;
        c15l9.LJII = null;
        Activity activity = c15l9.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS49S0110000_31(this, this.LIZIZ, 6));
        }
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZJ(C1661050tKJ c1661050tKJ) {
        ExceptionResult exceptionResult;
        Activity activity;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_music_shoot_same_unlogin_optimization", true, false) && (exceptionResult = c1661050tKJ.LJI) != null && 2012 == exceptionResult.getErrorCode()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSuccess-->result music:");
            sbLIZ.append(c1661050tKJ.LIZJ);
            sbLIZ.append(" effect:");
            sbLIZ.append(c1661050tKJ.LJFF);
            C201955140j.LJIILIIL("MusicDetailDownloadHelper", C2188811AlT.LIZIZ(sbLIZ));
            Activity activity2 = this.LJFF.LIZLLL;
            if (activity2 != null) {
                activity2.runOnUiThread(new ARunnableS49S0110000_31(this, this.LIZIZ, 5));
            }
            if (!C0XQ7.LJFF().isLogin() && (activity = this.LJFF.LIZLLL) != null && !activity.isFinishing()) {
                C0XPD.LIZIZ(this.LJFF.LIZLLL, "music_detail", "click_shoot", null, new C20749316Hj(c1661050tKJ, this, 0));
                return;
            }
            return;
        }
        LJFF(c1661050tKJ, this.LIZ, this.LIZIZ, this.LIZLLL, this.LJ);
    }

    @Override // X.InterfaceC1661080tKM
    public final void LJ(Effect effect) {
        this.LJFF.LJII = effect;
    }

    @Override // X.InterfaceC1661080tKM
    public final void onStart(Effect effect) {
        C201955140j.LJIILIIL("MusicDetailDownloadHelper", "onStart");
        C20684815ws.LJIJI("music_detail_trace", new Pair("music_download_start", "stage"));
        C15L9 c15l9 = this.LJFF;
        Activity activity = c15l9.LIZLLL;
        if (activity != null && c15l9.LJ != null) {
            activity.runOnUiThread(new ARunnableS28S0210000_31(this, this.LIZIZ, this.LIZ, 2));
            this.LJFF.LJ.Sx(this.LIZ);
        }
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZIZ(Effect effect, String str) {
        Activity activity;
        Activity activity2;
        C20684815ws.LJIJI("music_detail_trace", new Pair("music_download_skip", "stage"));
        if (this.LJFF.LJ == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C15L9 c15l9 = this.LJFF;
            c15l9.LJII = null;
            if (c15l9.LJ.h4() && (activity2 = this.LJFF.LIZLLL) != null) {
                activity2.runOnUiThread(new ARunnableS100S0200000_31(this, this.LIZ, 68));
                return;
            }
            return;
        }
        C15L9 c15l92 = this.LJFF;
        Effect effect2 = c15l92.LJII;
        c15l92.LJII = null;
        if (effect == null) {
            effect = effect2;
            if (effect2 == null) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().buildEffectPlatform(this.LJFF.LIZLLL, new C13V0(this, str), null);
                return;
            }
        }
        C15LG c15lg = c15l92.LJ;
        if ((c15lg == null || c15lg.h4()) && (activity = this.LJFF.LIZLLL) != null) {
            activity.runOnUiThread(new ARunnableS64S0300000_31(effect, this.LIZ, this, 11));
        }
    }

    @Override // X.InterfaceC1661080tKM
    public final void LIZLLL(int i, Effect effect, Long l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onProgress-->");
        sbLIZ.append(i);
        C201955140j.LIZIZ("MusicDetailDownloadHelper", C2188811AlT.LIZIZ(sbLIZ));
        Activity activity = this.LJFF.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS6S0111000_31(this, i, this.LIZIZ, 2));
        }
    }

    public final void LJFF(C1661050tKJ c1661050tKJ, final MusicModel musicModel, final boolean z, final int i, long j) {
        String strLIZIZ;
        C20684815ws.LJIJI("music_detail_trace", new Pair("music_download_success", "stage"));
        this.LJFF.LJII = null;
        final String str = c1661050tKJ.LIZ;
        if (C1661270tKf.LIZ() && (strLIZIZ = C202045143v.LIZIZ(str, musicModel.getMusicId(), musicModel.getResolvedUrlKey(str))) != null) {
            str = strLIZIZ;
        }
        if (musicModel.getMusicType() == 2 && (musicModel.getDuration() <= 0 || musicModel.getShootDuration().intValue() <= 0)) {
            int iIntValue = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).vesdkService().getAudioFileInfo(str).duration.intValue();
            musicModel.setDuration(iIntValue);
            musicModel.setShootDuration(Integer.valueOf(iIntValue));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toVideoProgress-->musicFile:");
        sbLIZ.append(str);
        C201955140j.LJIILIIL("MusicDetailDownloadHelper", C2188811AlT.LIZIZ(sbLIZ));
        final MusicWaveBean musicWaveBean = c1661050tKJ.LIZIZ;
        C15L9 c15l9 = this.LJFF;
        c15l9.LJI = c1661050tKJ.LJ;
        C15LG c15lg = c15l9.LJ;
        if (c15lg != null && !c15lg.h4()) {
            return;
        }
        Activity activity = this.LJFF.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: X.15LF
                @Override // java.lang.Runnable
                public final void run() {
                    C15LD c15ld = this.LL;
                    boolean z2 = z;
                    MusicModel musicModel2 = musicModel;
                    MusicWaveBean musicWaveBean2 = musicWaveBean;
                    String str2 = str;
                    int i2 = i;
                    C15LG c15lg2 = c15ld.LJFF.LJ;
                    if (c15lg2 != null) {
                        c15lg2.hb(z2, false);
                    }
                    musicModel2.setMusicWaveBean(musicWaveBean2);
                    musicModel2.setDownloadComplete(true);
                    C15LG c15lg3 = c15ld.LJFF.LJ;
                    if (c15lg3 != null) {
                        c15lg3.eL(i2, musicModel2, str2);
                    }
                }
            });
        }
        C15L9.LJII(System.currentTimeMillis() - j, str);
    }

    public C15LD(C15L9 c15l9, MusicModel musicModel, boolean z, String str, int i, long j) {
        this.LJFF = c15l9;
        this.LIZ = musicModel;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = j;
    }
}
