package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.003y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0184003y {
    public final Long LIZ;
    public final String LIZIZ;
    public final ImageModel LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C0184003y() {
        this((Long) null, (String) (0 == true ? 1 : 0), (ImageModel) (0 == true ? 1 : 0), 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0184003y)) {
            return false;
        }
        C0184003y c0184003y = (C0184003y) obj;
        return Intrinsics.LJFF(this.LIZ, c0184003y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0184003y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0184003y.LIZJ) && this.LIZLLL == c0184003y.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudienceApplyPanelInfo(inviterUserId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inviterNickname=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inviterAvatar=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFromGuestInviteIM=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0184003y(Long l, String str, ImageModel imageModel, int i) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : imageModel, false);
    }

    public C0184003y(Long l, String str, ImageModel imageModel, boolean z) {
        this.LIZ = l;
        this.LIZIZ = str;
        this.LIZJ = imageModel;
        this.LIZLLL = z;
    }
}
