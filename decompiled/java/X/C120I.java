package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicNameService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.120I, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C120I {
    public static final C120I LIZ = new C120I();

    public static final C1331670kl3 LIZJ(MusicModel musicModel) {
        Object c098200Yq;
        C1331670kl3 c1331670kl3LJIIIIZZ;
        Object obj = null;
        String strLIZIZ = null;
        if (musicModel.getMusicType() != 3 && musicModel.getMusicType() != 0) {
            Music music = musicModel.getMusic();
            if (music != null) {
                IMusicNameService iMusicNameService = (IMusicNameService) PluggableExtentionKt.pluggableSpi$default(IMusicNameService.class, false, false, false, 14, null);
                if (iMusicNameService != null) {
                    strLIZIZ = iMusicNameService.LIZIZ(musicModel);
                }
                if (C290810BaZ.LIZ() && strLIZIZ != null) {
                    c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(strLIZIZ));
                } else if (music.getCoverThumb() != null) {
                    c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(music.getCoverThumb()));
                } else if (music.getCoverMedium() != null) {
                    c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(music.getCoverMedium()));
                } else if (music.getCoverLarge() != null) {
                    c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(music.getCoverLarge()));
                }
                if (c1331670kl3LJIIIIZZ != null) {
                    return c1331670kl3LJIIIIZZ;
                }
            }
            if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                return C1331660kl2.LJIIIZ(musicModel.getPicPremium());
            }
            if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                return C1331660kl2.LJIIIZ(musicModel.getPicBig());
            }
            return C1331660kl2.LJFF(R.drawable.by9);
        }
        if (musicModel.getLocalThumbPath() != null) {
            if (C1487190ont.LIZ(musicModel.getLocalThumbPath())) {
                return C1331660kl2.LJII(new C0VSJ(musicModel.getLocalThumbPath()));
            }
            return C1331660kl2.LJI(UriProtector.parse(musicModel.getLocalThumbPath()));
        }
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = SettingsManager.LJI("tt_local_music_default_image", "");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            str = "https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/Local_Music_Default.png";
        }
        return C1331660kl2.LJIIIZ(str);
    }

    public static final void LIZIZ(C1D92 c1d92, MusicModel musicModel, AwS608S0100000_29 awS608S0100000_29) {
        List<MusicModel> mergedMusicList;
        C1331670kl3 c1331670kl3;
        if (musicModel != null && (mergedMusicList = musicModel.getMergedMusicList()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<MusicModel> it2 = mergedMusicList.iterator();
            while (it2.hasNext()) {
                C1331670kl3 c1331670kl3LIZJ = LIZJ(it2.next());
                if (c1331670kl3LIZJ != null) {
                    if (c1d92.getMeasuredHeight() > 0 && c1d92.getMeasuredWidth() > 0) {
                        int measuredWidth = c1d92.getMeasuredWidth();
                        int measuredHeight = c1d92.getMeasuredHeight();
                        c1331670kl3LIZJ.LJIIIIZZ = measuredWidth;
                        c1331670kl3LIZJ.LJIIIZ = measuredHeight;
                    }
                    c1331670kl3LIZJ.LJJIJ(C422830Gi1.LIZ(301));
                    c1331670kl3LIZJ.LJJIJLIJ = true;
                    c1331670kl3LIZJ.LIZLLL("MultiCoversFrameLayout");
                    arrayList.add(c1331670kl3LIZJ);
                }
            }
            c1d92.LIZIZ(arrayList);
            if (awS608S0100000_29 != null && (c1331670kl3 = (C1331670kl3) C13LP.LJJJLL(arrayList)) != null) {
                c1331670kl3.LJJIIJ(new C19775012Yq(awS608S0100000_29, 1));
            }
        }
    }

    public static final void LIZ(SmartImageView smartImageView, MusicModel musicModel, String str, Function1<? super Bitmap, Unit> function1) {
        C1331670kl3 c1331670kl3LIZJ;
        if (musicModel == null || (c1331670kl3LIZJ = LIZJ(musicModel)) == null) {
            return;
        }
        if (smartImageView.getMeasuredHeight() > 0 && smartImageView.getMeasuredWidth() > 0) {
            int measuredWidth = smartImageView.getMeasuredWidth();
            int measuredHeight = smartImageView.getMeasuredHeight();
            c1331670kl3LIZJ.LJIIIIZZ = measuredWidth;
            c1331670kl3LIZJ.LJIIIZ = measuredHeight;
        }
        c1331670kl3LIZJ.LJJIJ(C422830Gi1.LIZ(301));
        c1331670kl3LIZJ.LIZLLL(str);
        c1331670kl3LIZJ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LIZJ);
        if (function1 != null) {
            c1331670kl3LIZJ.LJJIIJ(new C19775012Yq(function1, 0));
        }
    }
}
