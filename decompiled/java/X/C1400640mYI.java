package X;

import android.app.Activity;
import android.widget.Toast;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS67S1300000_31;

/* JADX INFO: renamed from: X.0mYI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400640mYI implements InterfaceC20499515Jh {
    public final Activity LL;
    public final Music LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final Integer LLIZ;
    public final int LLIZLLLIL;
    public final Function1<Boolean, Unit> LLJ;
    public InterfaceC20500415Jq LLJI;

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void J2(MusicModel musicModel, long j) {
    }

    @Override // X.InterfaceC20499515Jh
    public final MusicModel LJI() {
        return null;
    }

    @Override // X.InterfaceC20499515Jh
    public final boolean LLJLLIL() {
        return false;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void ba(MusicModel musicModel) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void v2() {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void y4(Map map, MusicModel musicModel, String str) {
    }

    public final void LIZ() {
        Activity activity = this.LL;
        if (activity == null) {
            return;
        }
        this.LLJI = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJZI(this, this.LLILLL);
        try {
            if (C036E.LIZ.LIZIZ()) {
                MusicModel musicModelConvertToMusicModel = this.LLILLJJLI.convertToMusicModel();
                if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(musicModelConvertToMusicModel, activity, true)) {
                    Function1<Boolean, Unit> function1 = this.LLJ;
                    if (function1 != null) {
                        function1.invoke(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(activity)) {
                    Function1<Boolean, Unit> function12 = this.LLJ;
                    if (function12 != null) {
                        function12.invoke(Boolean.FALSE);
                    }
                    C786410Ut5.re(Toast.makeText(activity, activity.getString(2131832497), 0));
                    return;
                }
                InterfaceC20500415Jq interfaceC20500415Jq = this.LLJI;
                if (interfaceC20500415Jq != null) {
                    interfaceC20500415Jq.ag(this.LLIZLLLIL, musicModelConvertToMusicModel, true, false, false);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
        Function1<Boolean, Unit> function13 = this.LLJ;
        if (function13 != null) {
            function13.invoke(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final Activity LLILLL() {
        return this.LL;
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJILJILJ(MusicModel musicModel, Exception exc) {
        Function1<Boolean, Unit> function1 = this.LLJ;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJJL(MusicModel musicModel, String str, String str2) {
        UrlModel coverMedium;
        if (musicModel == null || str == null || (coverMedium = this.LLILLJJLI.getCoverMedium()) == null) {
            return;
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicDetailFragment", new C1401810maB(new AwS67S1300000_31(this, str, musicModel, coverMedium, 3), 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1400640mYI(Activity activity, Music music, String str, String str2, String str3, String str4, Integer num, int i, Function1<? super Boolean, Unit> function1) {
        this.LL = activity;
        this.LLILLJJLI = music;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = num;
        this.LLIZLLLIL = i;
        this.LLJ = function1;
    }
}
