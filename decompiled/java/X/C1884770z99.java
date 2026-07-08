package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.common.model.GameInfoCardModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884770z99 implements InterfaceC0148002o {
    public final GameInfoCardModel LL;
    public final Boolean LLILLJJLI;

    public C1884770z99() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1884770z99)) {
            return false;
        }
        C1884770z99 c1884770z99 = (C1884770z99) obj;
        return Intrinsics.LJFF(this.LL, c1884770z99.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1884770z99.LLILLJJLI);
    }

    public final int hashCode() {
        GameInfoCardModel gameInfoCardModel = this.LL;
        int iHashCode = (gameInfoCardModel == null ? 0 : gameInfoCardModel.hashCode()) * 31;
        Boolean bool = this.LLILLJJLI;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameIntroAssemState(cardData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showTranslatedIntroText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1884770z99(GameInfoCardModel gameInfoCardModel, Boolean bool) {
        this.LL = gameInfoCardModel;
        this.LLILLJJLI = bool;
    }

    public static C1884770z99 LIZ(C1884770z99 c1884770z99, GameInfoCardModel gameInfoCardModel, Boolean bool, int i) {
        if ((i & 1) != 0) {
            gameInfoCardModel = c1884770z99.LL;
        }
        if ((i & 2) != 0) {
            bool = c1884770z99.LLILLJJLI;
        }
        c1884770z99.getClass();
        return new C1884770z99(gameInfoCardModel, bool);
    }
}
