package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.inbox.InboxInvitationCellMeta;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903580zdU {
    public final EnumC1903590zdV LIZ;
    public final String LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 984));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 983));
    public EnumC1903600zdW LJ = EnumC1903600zdW.GONE;

    public final EnumC1903600zdW LIZJ() {
        EnumC1903600zdW enumC1903600zdW;
        EnumC1903600zdW enumC1903600zdW2;
        C1903610zdX c1903610zdX = C1903610zdX.LIZ;
        c1903610zdX.getClass();
        if (C1903610zdX.LIZ()) {
            C1903130zcl c1903130zcl = (C1903130zcl) this.LIZLLL.getValue();
            c1903130zcl.getClass();
            if (C1903610zdX.LIZIZ().shouldDemoteInboxToBottom && C1903610zdX.LIZIZ().useNewFrequencyControl) {
                c1903610zdX.getClass();
                if (C1903610zdX.LIZIZ().numExposuresUpperThreshold <= c1903130zcl.LIZ().getInt("num_exposures", 0) || !c1903130zcl.LIZIZ()) {
                    c1903610zdX.getClass();
                    enumC1903600zdW = (C1903610zdX.LIZIZ().numExposuresUpperThreshold > c1903130zcl.LIZ().getInt("num_exposures", 0) || c1903130zcl.LIZ().getBoolean("has_inbox_bottom_dismissed", false)) ? EnumC1903600zdW.GONE : EnumC1903600zdW.BOTTOM;
                } else {
                    enumC1903600zdW = EnumC1903600zdW.TOP;
                }
            } else {
                c1903610zdX.getClass();
                enumC1903600zdW = (C1903610zdX.LIZIZ().numExposuresUpperThreshold <= c1903130zcl.LIZ().getInt("num_exposures", 0) || !c1903130zcl.LIZIZ()) ? EnumC1903600zdW.GONE : EnumC1903600zdW.TOP;
            }
        } else {
            C1903620zdY.LIZ.getClass();
            InboxInvitationCellMeta inboxInvitationCellMeta = (InboxInvitationCellMeta) C1903620zdY.LIZJ.getValue();
            enumC1903600zdW = (System.currentTimeMillis() - LIZLLL().getLong(LIZ("del_time_"), 0L) >= ((long) inboxInvitationCellMeta.hideDays) * 86400000 && LIZLLL().getInt(LIZ("del_times_"), 0) < inboxInvitationCellMeta.maxDeleteTimes) ? (!LIZLLL().getBoolean(LIZ("bottom_by_del_"), false) && LIZLLL().getInt(LIZ("enter_inbox_times_"), 0) <= inboxInvitationCellMeta.maxNoActionTimes) ? EnumC1903600zdW.TOP : EnumC1903600zdW.BOTTOM : EnumC1903600zdW.GONE;
        }
        EnumC1903600zdW enumC1903600zdW3 = EnumC1903600zdW.GONE;
        if (enumC1903600zdW != enumC1903600zdW3 && (enumC1903600zdW2 = this.LJ) != enumC1903600zdW3 && enumC1903600zdW != enumC1903600zdW2) {
            return enumC1903600zdW2;
        }
        this.LJ = enumC1903600zdW;
        return enumC1903600zdW;
    }

    public final Keva LIZLLL() {
        return (Keva) this.LIZJ.getValue();
    }

    public final EnumC1903600zdW LIZIZ() {
        EnumC1903600zdW enumC1903600zdWLIZJ = LIZJ();
        C1903610zdX.LIZ.getClass();
        boolean z = !C1903610zdX.LIZIZ().showInboxTop;
        boolean z2 = !C1903610zdX.LIZIZ().showInboxBottom;
        int i = C1903570zdT.LIZ[enumC1903600zdWLIZJ.ordinal()];
        if (i == 1) {
            return z ? EnumC1903600zdW.GONE : enumC1903600zdWLIZJ;
        }
        if (i == 2) {
            return z2 ? EnumC1903600zdW.GONE : enumC1903600zdWLIZJ;
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        return enumC1903600zdWLIZJ;
    }

    public final String LIZ(String str) {
        return this.LIZ.asRepoKey(str);
    }

    public C1903580zdU(EnumC1903590zdV enumC1903590zdV, String str) {
        this.LIZ = enumC1903590zdV;
        this.LIZIZ = str;
    }
}
