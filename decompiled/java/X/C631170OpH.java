package X;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.AppleMusicToken;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C631170OpH extends C2217421BqW implements Function0<Unit> {
    public C631170OpH(MusicCellCompose musicCellCompose) {
        super(0, musicCellCompose, MusicCellCompose.class, "onAddSongBtnClick", "onAddSongBtnClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C631640Oq2 c631640Oq2;
        Music music;
        ComposeView composeView;
        Context context;
        Activity activityLIZIZ;
        Fragment fragmentLIZ;
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        String str;
        TT2DSPSongInfo next;
        String str2;
        AppleMusicToken appleMusicToken;
        TT2DSPSongInfo next2;
        AppleMusicToken appleMusicToken2;
        MusicCellCompose musicCellCompose = (MusicCellCompose) this.receiver;
        C632090Oql c632090Oql = musicCellCompose.LLJ;
        if (c632090Oql != null && (c631640Oq2 = musicCellCompose.LLJI) != null && (music = c632090Oql.getMusicModel().getMusic()) != null && (composeView = musicCellCompose.LLIZ) != null && (context = composeView.getContext()) != null && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null && (fragmentLIZ = C946803n0.LIZ(composeView)) != null && (tT2DSPSongInfos = music.getTT2DSPSongInfos()) != null) {
            DspPlatform dspPlatformLJIILJJIL = C633020OsG.LIZIZ.LJIILJJIL(music);
            Iterator<TT2DSPSongInfo> it2 = tT2DSPSongInfos.iterator();
            while (true) {
                str = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Integer num = next.dspPlatform;
                int value = dspPlatformLJIILJJIL.getValue();
                if (num != null && num.intValue() == value) {
                    break;
                }
            }
            TT2DSPSongInfo tT2DSPSongInfo = next;
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            String strLJIILL = c633020OsG.LJIILL(dspPlatformLJIILJJIL);
            MusicCellCompose.LLJIJIL.getClass();
            AddSongContextData addSongContextDataLIZIZ = C631160OpG.LIZIZ(c631640Oq2, music, dspPlatformLJIILJJIL);
            if (dspPlatformLJIILJJIL != DspPlatform.UNKNOWN) {
                if (tT2DSPSongInfo != null && (str2 = tT2DSPSongInfo.songId) != null && str2.length() != 0) {
                    if (strLJIILL.length() == 0 && !C297140Bkm.LIZ()) {
                        switch (C0P2Z.LIZ[dspPlatformLJIILJJIL.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                List<String> listLJIIL = C1697810uHb.LJIIL(tT2DSPSongInfo.songId);
                                EnumC587920N4c enumC587920N4c = EnumC587920N4c.DIRECTLY_AUTH;
                                DspAuthToken dspAuthToken = tT2DSPSongInfo.token;
                                if (dspAuthToken != null && (appleMusicToken = dspAuthToken.appleMusicToken) != null) {
                                    str = appleMusicToken.developToken;
                                }
                                c633020OsG.LJJJJZI(activityLIZIZ, fragmentLIZ, addSongContextDataLIZIZ, dspPlatformLJIILJJIL, listLJIIL, enumC587920N4c, str, null, null);
                                break;
                            default:
                                musicCellCompose.N5(fragmentLIZ, addSongContextDataLIZIZ, tT2DSPSongInfos);
                                break;
                        }
                    } else {
                        c633020OsG.LJJIIZI(activityLIZIZ, fragmentLIZ, addSongContextDataLIZIZ, dspPlatformLJIILJJIL, Collections.singletonList(tT2DSPSongInfo), false);
                    }
                } else {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZ);
                    c1389890mGx.LJIIIZ(2131824930);
                    c1389890mGx.LJIIJJI();
                }
            } else {
                List<DspPlatform> listLJJLIIIJJI = c633020OsG.LJJLIIIJJI(music, null, null, null);
                if (listLJJLIIIJJI.size() == 1) {
                    DspPlatform dspPlatform = (DspPlatform) ListProtector.get(listLJJLIIIJJI, 0);
                    Iterator<TT2DSPSongInfo> it3 = tT2DSPSongInfos.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        Integer num2 = next2.dspPlatform;
                        int value2 = dspPlatform.getValue();
                        if (num2 != null && num2.intValue() == value2) {
                            break;
                        }
                    }
                    TT2DSPSongInfo tT2DSPSongInfo2 = next2;
                    if (tT2DSPSongInfo2 != null) {
                        switch (C0P2Z.LIZ[dspPlatform.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                C633020OsG c633020OsG2 = C633020OsG.LIZIZ;
                                addSongContextDataLIZIZ.appendLogExtra(C2097608Jq.LJIIIIZZ(new Pair("dsp_installed", dspPlatform.getEventName()), new Pair("dsp_installed_number", "1")));
                                List<String> listLJIIL2 = C1697810uHb.LJIIL(tT2DSPSongInfo2.songId);
                                EnumC587920N4c enumC587920N4c2 = EnumC587920N4c.DIRECTLY_AUTH;
                                DspAuthToken dspAuthToken2 = tT2DSPSongInfo2.token;
                                if (dspAuthToken2 != null && (appleMusicToken2 = dspAuthToken2.appleMusicToken) != null) {
                                    str = appleMusicToken2.developToken;
                                }
                                c633020OsG2.LJJJJZI(activityLIZIZ, fragmentLIZ, addSongContextDataLIZIZ, dspPlatform, listLJIIL2, enumC587920N4c2, str, null, null);
                                break;
                            default:
                                musicCellCompose.N5(fragmentLIZ, addSongContextDataLIZIZ, tT2DSPSongInfos);
                                break;
                        }
                    } else {
                        musicCellCompose.N5(fragmentLIZ, addSongContextDataLIZIZ, tT2DSPSongInfos);
                    }
                } else {
                    musicCellCompose.N5(fragmentLIZ, addSongContextDataLIZIZ, tT2DSPSongInfos);
                }
            }
            C633020OsG c633020OsG3 = C633020OsG.LIZIZ;
            MusicCellCompose.LLJIJIL.getClass();
            c633020OsG3.LJJLJ(C631160OpG.LIZ(c631640Oq2, music));
        }
        return Unit.LIZ;
    }
}
