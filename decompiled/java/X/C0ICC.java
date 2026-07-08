package X;

import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ICC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICC extends AbstractC900170ZTb<GameChallengeCardTemplate> {
    public final Long LLILLL;
    public final GameChallengeCardTemplate LLILZ;
    public final C0ICD LLILZIL;
    public final boolean LLILZLL;
    public final C0IB0 LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ICC)) {
            return false;
        }
        C0ICC c0icc = (C0ICC) obj;
        return Intrinsics.LJFF(this.LLILLL, c0icc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0icc.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0icc.LLILZIL) && this.LLILZLL == c0icc.LLILZLL && Intrinsics.LJFF(this.LLIZ, c0icc.LLIZ);
    }

    public final int hashCode() {
        Long l = this.LLILLL;
        int iHashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        C0ICD c0icd = this.LLILZIL;
        return ((((iHashCode + (c0icd != null ? c0icd.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameChallengeCardData(indexOfTaskId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", template=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", gameChallengeFakeCreateMsgData=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hideCard=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", skeletonLayoutData=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LLIZ;
    }

    @Override // X.AbstractC900170ZTb, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0ICC)) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        if (C300840Bqk.LIZ()) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        if (Intrinsics.LJFF(interfaceC1891350zJl, this) && Intrinsics.LJFF(this.LLIZ.LIZ.LIZ.getLocalExt().get("local_ext_group_shot_hide_card"), C0I6Y.LIZ((InterfaceC461380I7k) interfaceC1891350zJl).getLocalExt().get("local_ext_group_shot_hide_card"))) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC900170ZTb, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ICC c0icc;
        GameChallengeCardTemplate gameChallengeCardTemplate;
        String str = this.LLILZ.taskId;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C0ICC) && (c0icc = (C0ICC) interfaceC1891350zJl) != null && (gameChallengeCardTemplate = c0icc.LLILZ) != null) {
            str2 = gameChallengeCardTemplate.taskId;
        }
        if (Intrinsics.LJFF(str, str2)) {
            return true;
        }
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    public C0ICC(Long l, GameChallengeCardTemplate gameChallengeCardTemplate, C0ICD c0icd, boolean z, C0IB0 c0ib0) {
        super(gameChallengeCardTemplate, z);
        this.LLILLL = l;
        this.LLILZ = gameChallengeCardTemplate;
        this.LLILZIL = c0icd;
        this.LLILZLL = z;
        this.LLIZ = c0ib0;
    }
}
