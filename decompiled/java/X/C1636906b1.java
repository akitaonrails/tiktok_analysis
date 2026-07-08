package X;

import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06b1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1636906b1 implements InterfaceC0148002o {
    public final PreshownStickerSceneConfig LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1636906b1)) {
            return false;
        }
        C1636906b1 c1636906b1 = (C1636906b1) obj;
        return Intrinsics.LJFF(this.LL, c1636906b1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1636906b1.LLILLJJLI);
    }

    public final int hashCode() {
        PreshownStickerSceneConfig preshownStickerSceneConfig = this.LL;
        return ((preshownStickerSceneConfig == null ? 0 : preshownStickerSceneConfig.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageListFooterVMState(preshownConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", addFakeMsgEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1636906b1(PreshownStickerSceneConfig preshownStickerSceneConfig, C291001Au<Boolean> c291001Au) {
        this.LL = preshownStickerSceneConfig;
        this.LLILLJJLI = c291001Au;
    }

    public static C1636906b1 LIZ(C1636906b1 c1636906b1, PreshownStickerSceneConfig preshownStickerSceneConfig, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            preshownStickerSceneConfig = c1636906b1.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1636906b1.LLILLJJLI;
        }
        c1636906b1.getClass();
        return new C1636906b1(preshownStickerSceneConfig, c291001Au);
    }
}
