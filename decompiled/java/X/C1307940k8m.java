package X;

import com.bytedance.android.starship.base.IStarshipBaseBridge;
import com.bytedance.android.starship.spi.IStarshipAbility;
import com.bytedance.android.starship.spi.StarshipAbilityEmptyImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0k8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307940k8m {
    public static final IStarshipAbility LIZ;

    static {
        IStarshipAbility starshipAbilityEmptyImpl = (IStarshipAbility) PluggableExtentionKt.pluggableSpi$default(IStarshipAbility.class, false, false, false, 14, null);
        if (starshipAbilityEmptyImpl == null) {
            starshipAbilityEmptyImpl = new StarshipAbilityEmptyImpl();
        }
        LIZ = starshipAbilityEmptyImpl;
    }

    public static final IStarshipBaseBridge LIZ() {
        return LIZ.LJ();
    }

    public static final InterfaceC1306440k6M LIZIZ() {
        return LIZ.LIZLLL();
    }

    public static final InterfaceC1309280kAw LIZJ() {
        return LIZ.LIZJ();
    }

    public static final InterfaceC1307680k8M LIZLLL() {
        return LIZ.LIZ();
    }
}
