package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallRecommendationViewModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0D4V, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4V implements ViewModelProvider.Factory {
    public final C0D0E LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;
    public final EnumC332220D0q LJFF;
    public final String LJI;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (cls.isAssignableFrom(WaterfallRecommendationViewModel.class)) {
            return new WaterfallRecommendationViewModel(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }

    public C0D4V(C0D0E c0d0e, String str, String str2, String str3, Map<String, String> map, EnumC332220D0q enumC332220D0q, String str4, Integer num, String str5, String str6, String str7, String str8, String str9) {
        this.LIZ = c0d0e;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = map;
        this.LJFF = enumC332220D0q;
        this.LJI = str4;
    }
}
