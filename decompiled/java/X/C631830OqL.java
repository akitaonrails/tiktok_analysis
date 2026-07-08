package X;

import android.content.Context;
import android.os.Trace;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellAdd2DspViewModelCompose;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCollectIconViewModelCompose;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellFeaturedVideosIconViewModelCompose;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.DspSheetType;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.vm.MusicHighlightBackgroundViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS138S0400000_9;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS71S0500000_9;

/* JADX INFO: renamed from: X.0OqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631830OqL {
    public static final void LIZIZ(Fragment fragment, AddSongContextData addSongContextData, List<TT2DSPSongInfo> list) {
        C633020OsG.LIZIZ.LJJZ(fragment, addSongContextData, DspSheetType.SELECT_DSP, list, null, null);
    }

    public static final void LIZJ(C631640Oq2 c631640Oq2, C632090Oql c632090Oql, String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c631640Oq2.LIZJ) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("button_name", str);
        String str3 = c631640Oq2.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("to_user_id", str3);
        c2344009Gk.LIZJ(c632090Oql.getMusicItemModel().isHighlighted() ? 1 : 0, "highlight");
        C20684815ws.LJIILLIIL("new_song_click", c2344009Gk.LIZ);
    }

    public static final void LIZ(C632090Oql c632090Oql, int i, OriginMusicListViewModel originMusicListViewModel, MusicPlayViewModel musicPlayViewModel, MusicHighlightBackgroundViewModel musicHighlightBackgroundViewModel, MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose, MusicCellAdd2DspViewModelCompose musicCellAdd2DspViewModelCompose, MusicCellFeaturedVideosIconViewModelCompose musicCellFeaturedVideosIconViewModelCompose, InterfaceC1680500tpg interfaceC1680500tpg, int i2) throws Throwable {
        int i3;
        Pair<Integer, Integer> pair;
        C05P0 c05p0;
        boolean z;
        C05P0 c05p02;
        int i4;
        C05P0 c05p03;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1182178841);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJII(c632090Oql)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        OriginMusicListViewModel originMusicListViewModel2 = originMusicListViewModel;
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(originMusicListViewModel2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        MusicPlayViewModel musicPlayViewModel2 = musicPlayViewModel;
        if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(musicPlayViewModel2)) {
                i9 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(musicHighlightBackgroundViewModel)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose2 = musicCellCollectIconViewModelCompose;
        if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJJIIJ(musicCellCollectIconViewModelCompose2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i2) == 0) {
            if (c13zcLJIIJ.LJJIIJ(musicCellAdd2DspViewModelCompose)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((12582912 & i2) == 0) {
            if (c13zcLJIIJ.LJJIIJ(musicCellFeaturedVideosIconViewModelCompose)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((i3 & 4793491) == 4793490 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = originMusicListViewModel2.LLILLJJLI;
                if (objLJJ == null) {
                    objLJJ = new C631640Oq2(null, null, false, null, null, false, null, null, null, 4095);
                }
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C631640Oq2 c631640Oq2 = (C631640Oq2) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            View view = (View) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LJFF);
            String musicId = c632090Oql.getMusicModel().getMusicId();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJFF(c632090Oql, C631860OqO.LIZ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p04 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c05p04.setValue(c632090Oql);
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(Integer.valueOf(i), c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-2092439988);
            Trace.beginSection("zprofile_music_tab:cell:state_subscribe");
            try {
                C05P0 c05p0LIZ = C1244280iU6.LIZ(musicPlayViewModel2, null, c13zcLJIIJ, (i3 >> 9) & 14, 7);
                Trace.endSection();
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(musicId);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ || objLJJ3 == c1680520tpi) {
                    objLJJ3 = C20028913Yh.LJ(new AwS158S1100000_9(c05p0LIZ, musicId, 32));
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                C05P1 c05p1 = (C05P1) objLJJ3;
                c13zcLJIIJ.LJJJJL(false);
                C05P0 c05p0LIZ2 = C1244280iU6.LIZ(musicHighlightBackgroundViewModel, null, c13zcLJIIJ, (i3 >> 12) & 14, 7);
                if (!c632090Oql.getMusicItemModel().isHighlighted() && !c632090Oql.getMusicItemModel().isHighlightedSimilarMusic()) {
                    pair = null;
                } else {
                    pair = ((C2438609h2) c05p0LIZ2.getValue()).LL;
                }
                EnumC631410Opf enumC631410Opf = (EnumC631410Opf) c05p1.getValue();
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (objLJJ4 == c1680520tpi) {
                    objLJJ4 = new AwS253S0300000_9(c05p04, c05p0LJIIIIZZ, musicPlayViewModel2, 12);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                Function0 function0 = (Function0) objLJJ4;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (objLJJ5 == c1680520tpi) {
                    objLJJ5 = new AwS410S0200000_9(c05p04, (C05P0<C632090Oql>) musicHighlightBackgroundViewModel, (MusicHighlightBackgroundViewModel) 109);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                Function0 function02 = (Function0) objLJJ5;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ6 = c13zcLJIIJ.LJJ();
                if (objLJJ6 == c1680520tpi) {
                    c05p04 = c05p04;
                    objLJJ6 = new AwS138S0400000_9(c05p04, (C05P0<C632090Oql>) c631640Oq2, (C631640Oq2) context, (Context) originMusicListViewModel2, (OriginMusicListViewModel) 0);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                }
                Function0 function03 = (Function0) objLJJ6;
                c13zcLJIIJ.LJJJJL(false);
                C05P0 c05p0LIZ3 = C1244280iU6.LIZ(musicCellFeaturedVideosIconViewModelCompose, null, c13zcLJIIJ, (i3 >> 21) & 14, 7);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ7 = c13zcLJIIJ.LJJ();
                if (objLJJ7 == c1680520tpi) {
                    z = false;
                    c05p0 = c05p04;
                    objLJJ7 = new AwS71S0500000_9(c05p04, c05p0LJIIIIZZ, c631640Oq2, context, musicPlayViewModel2, 3);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ7);
                } else {
                    c05p0 = c05p04;
                    z = false;
                }
                Function0 function04 = (Function0) objLJJ7;
                c13zcLJIIJ.LJJJJL(z);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ8 = c13zcLJIIJ.LJJ();
                if (objLJJ8 == c1680520tpi) {
                    objLJJ8 = new AwS138S0400000_9(c05p0, c05p0LJIIIIZZ, context, originMusicListViewModel2, 1);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ8);
                }
                Function0 function05 = (Function0) objLJJ8;
                c13zcLJIIJ.LJJJJL(z);
                C05P0 c05p0LIZ4 = C1244280iU6.LIZ(musicCellCollectIconViewModelCompose2, null, c13zcLJIIJ, (i3 >> 15) & 14, 7);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ9 = c13zcLJIIJ.LJJ();
                if (objLJJ9 == c1680520tpi) {
                    c05p02 = c05p0LJIIIIZZ;
                    objLJJ9 = new AwS71S0500000_9(c05p0, c05p0LJIIIIZZ, context, musicPlayViewModel2, musicCellCollectIconViewModelCompose2, 4);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ9);
                } else {
                    c05p02 = c05p0LJIIIIZZ;
                }
                Function0 function06 = (Function0) objLJJ9;
                c13zcLJIIJ.LJJJJL(z);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ10 = c13zcLJIIJ.LJJ();
                if (objLJJ10 == c1680520tpi) {
                    objLJJ10 = new AwS253S0300000_9(c05p0, c05p02, musicPlayViewModel2, 14);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ10);
                }
                Function0 function07 = (Function0) objLJJ10;
                c13zcLJIIJ.LJJJJL(z);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ11 = c13zcLJIIJ.LJJ();
                if (objLJJ11 == c1680520tpi) {
                    c05p0 = c05p0;
                    objLJJ11 = new AwS253S0300000_9(c05p0, c05p02, musicPlayViewModel2, 15);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ11);
                }
                Function0 function08 = (Function0) objLJJ11;
                c13zcLJIIJ.LJJJJL(z);
                C05P0 c05p0LIZ5 = C1244280iU6.LIZ(musicCellAdd2DspViewModelCompose, null, c13zcLJIIJ, (i3 >> 18) & 14, 7);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ12 = c13zcLJIIJ.LJJ();
                if (objLJJ12 == c1680520tpi) {
                    c05p03 = c05p0;
                    i4 = 1849434622;
                    musicPlayViewModel2 = musicPlayViewModel2;
                    originMusicListViewModel2 = originMusicListViewModel2;
                    musicCellCollectIconViewModelCompose2 = musicCellCollectIconViewModelCompose2;
                    objLJJ12 = new AwS138S0400000_9(c05p03, c05p02, c631640Oq2, view, context, musicPlayViewModel2, originMusicListViewModel2, musicCellCollectIconViewModelCompose2, 2);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ12);
                } else {
                    i4 = 1849434622;
                    c05p03 = c05p0;
                }
                Function0 function09 = (Function0) objLJJ12;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(i4);
                Object objLJJ13 = c13zcLJIIJ.LJJ();
                if (objLJJ13 == c1680520tpi) {
                    objLJJ13 = new AwS253S0300000_9(c05p03, (C05P0<C632090Oql>) c631640Oq2, (C631640Oq2) originMusicListViewModel2, (OriginMusicListViewModel) 13);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ13);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1671390taz.LJIIJ(c632090Oql, c631640Oq2, enumC631410Opf, pair, function0, function02, function03, c05p0LIZ3, function04, function05, c05p0LIZ4, function06, function07, function08, c05p0LIZ5, function09, (Function0) objLJJ13, c13zcLJIIJ, (i3 & 14) | 907763712, 1772976);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Trace.endSection();
                throw th;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C631840OqM(c632090Oql, i, originMusicListViewModel2, musicPlayViewModel2, musicHighlightBackgroundViewModel, musicCellCollectIconViewModelCompose2, musicCellAdd2DspViewModelCompose, musicCellFeaturedVideosIconViewModelCompose, i2);
        }
    }
}
