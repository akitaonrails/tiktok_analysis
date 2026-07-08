package Y;

import X.C09JN;
import X.C1C7U;
import X.EnumC1149370g11;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import uuk.l;

/* JADX INFO: loaded from: classes26.dex */
public class AfS36S0210000_25 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS36S0210000_25 afS36S0210000_25, Object obj) {
        C1C7U.LIZ("DefaultFavoriteStickerEditor@6014.changeFavoriteStatus$1");
        ((l) afS36S0210000_25.l0).LJJIJIL((Effect) afS36S0210000_25.l1, !afS36S0210000_25.z2);
        C1C7U.LIZIZ("DefaultFavoriteStickerEditor@6014.changeFavoriteStatus$1");
    }

    public static final void accept$1(AfS36S0210000_25 afS36S0210000_25, Object obj) {
        C1C7U.LIZ("DefaultFavoriteStickerEditor@6014.changeFavoriteStatus$2");
        ((l) afS36S0210000_25.l0).LJJIJIL((Effect) afS36S0210000_25.l1, afS36S0210000_25.z2);
        C1C7U.LIZIZ("DefaultFavoriteStickerEditor@6014.changeFavoriteStatus$2");
    }

    public AfS36S0210000_25(l lVar, Effect effect, boolean z, EnumC1149370g11 enumC1149370g11, int i) {
        this.$t = i;
        this.l0 = lVar;
        this.l1 = effect;
        this.z2 = z;
    }
}
