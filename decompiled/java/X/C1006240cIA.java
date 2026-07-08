package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cIA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006240cIA implements InterfaceC0148002o {
    public final GameCardMaterial LL;
    public final String LLILLJJLI;
    public final VideoItemParams LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;

    public C1006240cIA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1006240cIA)) {
            return false;
        }
        C1006240cIA c1006240cIA = (C1006240cIA) obj;
        return Intrinsics.LJFF(this.LL, c1006240cIA.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1006240cIA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1006240cIA.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1006240cIA.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1006240cIA.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1006240cIA.LLILZLL);
    }

    public final int hashCode() {
        GameCardMaterial gameCardMaterial = this.LL;
        int iHashCode = (gameCardMaterial == null ? 0 : gameCardMaterial.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        VideoItemParams videoItemParams = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (videoItemParams == null ? 0 : videoItemParams.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLILZ;
        int iHashCode4 = (((iHashCode3 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILZLL;
        return iHashCode4 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniGameInstantPlayState(cardMaterial=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cardMaterialStr=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", curItem=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onDataBinded=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onHolderSelected=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onHolderResumedEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1006240cIA(int i) {
        this(null, null, null, null, new C291001Au(Boolean.FALSE), null);
    }

    public C1006240cIA(GameCardMaterial gameCardMaterial, String str, VideoItemParams videoItemParams, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3) {
        this.LL = gameCardMaterial;
        this.LLILLJJLI = str;
        this.LLILLL = videoItemParams;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
        this.LLILZLL = c291001Au3;
    }

    public static C1006240cIA LIZ(C1006240cIA c1006240cIA, GameCardMaterial gameCardMaterial, String str, VideoItemParams videoItemParams, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        VideoItemParams videoItemParams2 = videoItemParams;
        String str2 = str;
        GameCardMaterial gameCardMaterial2 = gameCardMaterial;
        if ((i & 1) != 0) {
            gameCardMaterial2 = c1006240cIA.LL;
        }
        if ((i & 2) != 0) {
            str2 = c1006240cIA.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            videoItemParams2 = c1006240cIA.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au6 = c1006240cIA.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au5 = c1006240cIA.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au4 = c1006240cIA.LLILZLL;
        }
        c1006240cIA.getClass();
        return new C1006240cIA(gameCardMaterial2, str2, videoItemParams2, c291001Au6, c291001Au5, c291001Au4);
    }
}
