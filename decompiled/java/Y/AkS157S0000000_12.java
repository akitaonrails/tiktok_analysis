package Y;

import X.C1161920gLG;
import X.InterfaceC1487280oo2;
import com.bytedance.android.live.effect.api.IEffectService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes13.dex */
public class AkS157S0000000_12 implements InterfaceC1487280oo2 {
    public final int $t;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS157S0000000_12(int i) {
        this.$t = i;
    }

    public static final Object apply$0(AkS157S0000000_12 akS157S0000000_12, Object obj) {
        return ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).convertStickerBean((Effect) obj);
    }

    public static final Object apply$1(AkS157S0000000_12 akS157S0000000_12, Object obj) {
        return ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).convertStickerBean((Effect) obj);
    }
}
