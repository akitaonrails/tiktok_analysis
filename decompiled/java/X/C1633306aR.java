package X;

import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06aR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1633306aR extends C06OO {
    public final PreshownStickerSceneConfig LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1633306aR) && Intrinsics.LJFF(this.LIZJ, ((C1633306aR) obj).LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreshownStickerTask(data=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1633306aR(PreshownStickerSceneConfig preshownStickerSceneConfig) {
        super(EnumC1596306Mv.PRESHOWN_STICKERS);
        this.LIZJ = preshownStickerSceneConfig;
    }
}
