package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1147280fxe extends C2217421BqW implements Function0<Unit> {
    public C1147280fxe(MusicGiftDetailViewModel musicGiftDetailViewModel) {
        super(0, musicGiftDetailViewModel, MusicGiftDetailViewModel.class, "onFavoriteClicked", "onFavoriteClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jLongValue;
        boolean zContains;
        MusicGiftDetailViewModel musicGiftDetailViewModel = (MusicGiftDetailViewModel) this.receiver;
        C1147350fxl c1147350fxlBQ2 = musicGiftDetailViewModel.BQ2();
        if (c1147350fxlBQ2 == null) {
            Long lValueOf = Long.valueOf(musicGiftDetailViewModel.LLJILLL);
            if (lValueOf.longValue() > 0) {
                jLongValue = lValueOf.longValue();
                zContains = musicGiftDetailViewModel.LLJLLIL.contains(Long.valueOf(jLongValue));
            }
            return Unit.LIZ;
        }
        jLongValue = c1147350fxlBQ2.LIZ;
        zContains = c1147350fxlBQ2.LJIIIZ;
        boolean z = !zContains;
        if (musicGiftDetailViewModel.LLJLLL.add(Long.valueOf(jLongValue))) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(musicGiftDetailViewModel.LLJLLIL);
            boolean z2 = z && !linkedHashSet.contains(Long.valueOf(jLongValue)) && linkedHashSet.size() < 4;
            int i = zContains ? 2 : 1;
            boolean z3 = musicGiftDetailViewModel.LLJJL;
            musicGiftDetailViewModel.XQ2(jLongValue, z, true);
            if (z2 && jLongValue > 0) {
                musicGiftDetailViewModel.LLJLLIL.add(Long.valueOf(jLongValue));
            }
            musicGiftDetailViewModel.QQ2();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(musicGiftDetailViewModel), null, null, new C1147290fxf(musicGiftDetailViewModel, i, jLongValue, z, c1147350fxlBQ2, z2, z3, zContains, linkedHashSet, null), 3);
            if (!zContains) {
                C1147090fxL c1147090fxL = musicGiftDetailViewModel.LLJLL;
                C1147390fxp c1147390fxpXQ2 = musicGiftDetailViewModel.xQ2();
                musicGiftDetailViewModel.yQ2();
                c1147090fxL.LIZIZ("pin", c1147350fxlBQ2, c1147390fxpXQ2);
            }
        }
        return Unit.LIZ;
    }
}
