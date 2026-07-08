package X;

import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fHA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120940fHA {
    public String LIZ = "";
    public long LIZIZ;
    public long LIZJ;
    public Text LIZLLL;

    public final boolean LIZ() {
        if (Intrinsics.LJFF(this.LIZ, "privilege_level_up_blast_invite_bubble")) {
            return true;
        }
        return !((Intrinsics.LJFF(this.LIZ, "privilege_gameplay_gift_bubble") ? InterfaceC1094160eZy.O1.LIZ() : InterfaceC1094160eZy.P1.LIZ()) != null ? r2.contains(Long.valueOf(this.LIZIZ)) : false);
    }

    public final EnumC1120860fH2 LIZIZ() {
        String str = this.LIZ;
        return Intrinsics.LJFF(str, "privilege_gameplay_gift_bubble") ? EnumC1120860fH2.GAMEPLAY_GIFT : Intrinsics.LJFF(str, "privilege_level_up_blast_invite_bubble") ? EnumC1120860fH2.GAMEPLAY_INVITE : EnumC1120860fH2.GAMEPLAY_UPGRADE;
    }
}
