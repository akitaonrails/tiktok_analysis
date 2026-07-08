package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.model.message.PopupStateChangeContent;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0awp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954570awp {
    public final EnumC954840axG LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final Set<Long> LIZLLL = new LinkedHashSet();
    public InviteGroupMessage LJ;
    public ApplyGroupMessage LJFF;
    public PopupStateChangeContent LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCoHostConflictRecord(conflictRecordType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", EXPIRED_DURATION=20000, recordTimeStamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromUserId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", inviteGroupMessage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", applyGroupMessage=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C954570awp(EnumC954840axG enumC954840axG) {
        this.LIZ = enumC954840axG;
    }
}
