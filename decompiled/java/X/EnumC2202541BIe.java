package X;

import com.facebook.FacebookSdk;
import java.util.Arrays;

/* JADX INFO: renamed from: X.1BIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2202541BIe {
    Login(0),
    Share(1),
    Message(2),
    Like(3),
    GameRequest(4),
    AppGroupCreate(5),
    AppGroupJoin(6),
    AppInvite(7),
    DeviceShare(8),
    GamingFriendFinder(9),
    GamingGroupIntegration(10),
    Referral(11),
    GamingContextCreate(12),
    GamingContextSwitch(13),
    GamingContextChoose(14),
    TournamentShareDialog(15),
    TournamentJoinDialog(16);

    public final int LL;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC2202541BIe[] valuesCustom() {
        return (EnumC2202541BIe[]) Arrays.copyOf(values(), 17);
    }

    public final int toRequestCode() {
        C0W7K.LJFF();
        return FacebookSdk.LJIIIIZZ + this.LL;
    }

    EnumC2202541BIe(int i) {
        this.LL = i;
    }
}
