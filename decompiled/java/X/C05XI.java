package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05XI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05XI implements InterfaceC1629850sVz<Effect> {
    public final HashMap<String, Integer> LIZ = new HashMap<>();
    public final HashMap<String, Integer> LIZIZ = new HashMap<>();

    @Override // X.InterfaceC1629850sVz
    public final int Gp(Effect effect) {
        Effect effect2 = effect;
        if (effect2 != null) {
            Integer num = this.LIZ.get(effect2.getEffectId());
            if (num == null && (TextUtils.isEmpty(effect2.getResourceId()) || (num = this.LIZIZ.get(effect2.getResourceId())) == null)) {
                return -1;
            }
            return num.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC1629850sVz
    public final void LIZ(final int i, final List list) {
        this.LIZ.clear();
        this.LIZIZ.clear();
        C15O7.LIZJ(new Callable() { // from class: X.05XH
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("BaseStickerListViewModel@c2df.provideStickerPositionMapper$1$recordStickers$1");
                List<Effect> list2 = list;
                int i2 = i;
                C05XI c05xi = this;
                int i3 = 0;
                for (Effect effect : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    Effect effect2 = effect;
                    int i5 = i3 + i2;
                    if (effect2 != null) {
                        String effectId = effect2.getEffectId();
                        if (!TextUtils.isEmpty(effectId)) {
                            c05xi.LIZ.put(effectId, Integer.valueOf(i5));
                        }
                        String resourceId = effect2.getResourceId();
                        if (!TextUtils.isEmpty(resourceId)) {
                            c05xi.LIZIZ.put(resourceId, Integer.valueOf(i5));
                        }
                    }
                    i3 = i4;
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaseStickerListViewModel@c2df.provideStickerPositionMapper$1$recordStickers$1");
                return unit;
            }
        });
    }
}
