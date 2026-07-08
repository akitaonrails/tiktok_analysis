package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarGetResp;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.01zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C516301zl implements C09JN {
    public final int $t;
    public long j0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
        }
    }

    public C516301zl(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(C516301zl c516301zl, Object obj) {
        C1C7U.LIZ("CoHostNudgeReservationHelper@a063.startCountDown$2");
        long jLongValue = ((Number) obj).longValue() - 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountDown, value = ");
        sbLIZ.append(jLongValue);
        C20441214yg.LJIIIZ("NudgeReservationHelper", C2188811AlT.LIZIZ(sbLIZ));
        C916430ZxJ.LIZJ(c516301zl.j0, jLongValue);
        C1C7U.LIZIZ("CoHostNudgeReservationHelper@a063.startCountDown$2");
    }

    public static final void accept$1(C516301zl c516301zl, Object obj) {
        C1C7U.LIZ("MultiGuestAvatarIntroFragment@b119.onViewCreated$4$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get avatar id:");
        sbLIZ.append(c516301zl.j0);
        sbLIZ.append(" error:");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("MultiGuestAvatarIntroFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("MultiGuestAvatarIntroFragment@b119.onViewCreated$4$2");
    }

    public static final void accept$2(C516301zl c516301zl, Object obj) {
        C1C7U.LIZ("MultiGuestAvatarIntroFragment@b119.showReportDialog$2$1$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report id:");
        sbLIZ.append(c516301zl.j0);
        sbLIZ.append(" success");
        C20441214yg.LIZIZ("MultiGuestAvatarIntroFragment", C2188811AlT.LIZIZ(sbLIZ));
        C766270U4b.LIZLLL(2131852847);
        C1C7U.LIZIZ("MultiGuestAvatarIntroFragment@b119.showReportDialog$2$1$1");
    }

    public static final void accept$3(C516301zl c516301zl, Object obj) {
        C1C7U.LIZ("MultiGuestAvatarIntroFragment@b119.showReportDialog$2$1$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report id:");
        sbLIZ.append(c516301zl.j0);
        sbLIZ.append(" failed");
        C20441214yg.LJ("MultiGuestAvatarIntroFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("MultiGuestAvatarIntroFragment@b119.showReportDialog$2$1$2");
    }

    public static final void accept$4(C516301zl c516301zl, Object obj) {
        C1C7U.LIZ("QuickBattleCountDownManager@138e.startCountDown$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountDown, uid=");
        sbLIZ.append(c516301zl.j0);
        sbLIZ.append(", throwable=");
        sbLIZ.append(obj);
        C20441214yg.LJ("QuickBattleCountDownManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("QuickBattleCountDownManager@138e.startCountDown$3");
    }

    public static final void accept$5(C516301zl c516301zl, Object obj) {
        C1C7U.LIZ("QuickCoHostCountDownManager@d846.startCountDown$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountDown, uid=");
        sbLIZ.append(c516301zl.j0);
        sbLIZ.append(", throwable=");
        sbLIZ.append(obj);
        C20441214yg.LJ("QuickCoHostCountDownManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("QuickCoHostCountDownManager@d846.startCountDown$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$6(C516301zl c516301zl, Object obj) {
        Avatar avatar;
        C1C7U.LIZ("AvatarDataManager@42e9.get$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (avatar = ((AvatarGetResp.ResponseData) c470590Icr.data).avatar) != null) {
            C936250aTH.LIZLLL.put(Long.valueOf(c516301zl.j0), avatar);
        }
        C1C7U.LIZIZ("AvatarDataManager@42e9.get$2");
    }

    public static final void accept$7(C516301zl c516301zl, Object obj) {
        C1C7U.LIZ("GameGiftRoomActiveGuard@4319.cleanupIfActive$1$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("room_active_gameplay failed (best-effort, server timeout will eventually clean up): roomId=");
        sbLIZ.append(c516301zl.j0);
        C20441214yg.LJFF("GameGiftRoomActiveGuard__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        C1C7U.LIZIZ("GameGiftRoomActiveGuard@4319.cleanupIfActive$1$2");
    }
}
