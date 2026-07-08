package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1147310fxh extends C2217421BqW implements Function1<Long, Unit> {
    public C1147310fxh(MusicGiftDetailViewModel musicGiftDetailViewModel) {
        super(1, musicGiftDetailViewModel, MusicGiftDetailViewModel.class, "onItemSelected", "onItemSelected(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        String str;
        List<C1147350fxl> list;
        long jLongValue = l.longValue();
        MusicGiftDetailViewModel musicGiftDetailViewModel = (MusicGiftDetailViewModel) this.receiver;
        if (jLongValue <= 0) {
            musicGiftDetailViewModel.getClass();
        } else {
            musicGiftDetailViewModel.wQ2();
            boolean z = !MusicGiftDetailViewModel.KQ2(musicGiftDetailViewModel.LLL, musicGiftDetailViewModel.LLJILJIL, jLongValue);
            musicGiftDetailViewModel.LLJILLL = jLongValue;
            musicGiftDetailViewModel.QQ2();
            C1147090fxL c1147090fxL = musicGiftDetailViewModel.LLJLL;
            C1147350fxl c1147350fxlBQ2 = musicGiftDetailViewModel.BQ2();
            C1147390fxp c1147390fxpXQ2 = musicGiftDetailViewModel.xQ2();
            C1147330fxj c1147330fxjYQ2 = musicGiftDetailViewModel.yQ2();
            C1147330fxj c1147330fxjYQ22 = musicGiftDetailViewModel.yQ2();
            int i = 0;
            if (c1147330fxjYQ22 != null && (list = c1147330fxjYQ22.LJI) != null) {
                Iterator<C1147350fxl> it2 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().LIZ == jLongValue) {
                        if (i2 >= 0) {
                            i = i2 + 1;
                        }
                    } else {
                        i2++;
                    }
                }
            }
            C474500IjA c474500IjALIZ = c1147090fxL.LIZ("livesdk_music_gift_page_song_select", c1147350fxlBQ2, c1147390fxpXQ2);
            if (c1147330fxjYQ2 == null || (str = c1147330fxjYQ2.LIZIZ) == null) {
                str = "";
            }
            c474500IjALIZ.LJJII(str, "tab_name");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "snippet_postion");
            c474500IjALIZ.LIZ();
            if (z) {
                musicGiftDetailViewModel.TQ2();
            }
        }
        return Unit.LIZ;
    }
}
