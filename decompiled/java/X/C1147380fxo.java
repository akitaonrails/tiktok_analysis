package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1147380fxo extends C2217421BqW implements Function1<Long, Unit> {
    public C1147380fxo(MusicGiftDetailViewModel musicGiftDetailViewModel) {
        super(1, musicGiftDetailViewModel, MusicGiftDetailViewModel.class, "onMoodSelected", "onMoodSelected(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        C1147390fxp next;
        long jLongValue = l.longValue();
        MusicGiftDetailViewModel musicGiftDetailViewModel = (MusicGiftDetailViewModel) this.receiver;
        if (jLongValue > 0) {
            if (jLongValue != musicGiftDetailViewModel.LLJILJIL) {
                C1147090fxL c1147090fxL = musicGiftDetailViewModel.LLJLL;
                Iterator<C1147390fxp> it2 = musicGiftDetailViewModel.LLJIJIL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LIZ == jLongValue) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1147350fxl c1147350fxlBQ2 = musicGiftDetailViewModel.BQ2();
                musicGiftDetailViewModel.yQ2();
                c1147090fxL.LIZ("livesdk_music_gift_page_mood_select", c1147350fxlBQ2, next).LIZ();
                musicGiftDetailViewModel.PQ2(jLongValue, 0L, false, true, true);
            }
        } else {
            musicGiftDetailViewModel.getClass();
        }
        return Unit.LIZ;
    }
}
