package X;

import com.ss.android.ugc.aweme.im.sticker.api.model.AiMojiModel;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453740Hqm implements InterfaceC451150Hmb {
    public final long LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final AiMojiModel LLILZ;
    public final Set<String> LLILZIL;
    public final int LLILZLL;
    public final Long LLIZ;
    public final String LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C453740Hqm)) {
            return false;
        }
        C453740Hqm c453740Hqm = (C453740Hqm) obj;
        return this.LL == c453740Hqm.LL && this.LLILLJJLI == c453740Hqm.LLILLJJLI && this.LLILLL == c453740Hqm.LLILLL && Intrinsics.LJFF(this.LLILZ, c453740Hqm.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c453740Hqm.LLILZIL) && this.LLILZLL == c453740Hqm.LLILZLL && Intrinsics.LJFF(this.LLIZ, c453740Hqm.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c453740Hqm.LLIZLLLIL);
    }

    public final int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31;
        Long l = this.LLIZ;
        int iHashCode = (iY2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiMojiSticker(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", creatorUid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", stickerSetId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", stickerUrl=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", expressions=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", aiMojiType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", originalStickerId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", typingRecommendationStickerId=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C453740Hqm(long j, long j2, long j3, AiMojiModel aiMojiModel, Set set, int i) {
        this(j, j2, j3, aiMojiModel, set, i, null, null);
    }

    public C453740Hqm(long j, long j2, long j3, AiMojiModel aiMojiModel, Set<String> set, int i, Long l, String str) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
        this.LLILZ = aiMojiModel;
        this.LLILZIL = set;
        this.LLILZLL = i;
        this.LLIZ = l;
        this.LLIZLLLIL = str;
    }
}
