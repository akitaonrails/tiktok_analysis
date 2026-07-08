package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01jZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C415901jZ implements InterfaceC2182251Aat {
    public static final /* synthetic */ int LJI = 0;
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public String LJFF = "";

    public static int LIZJ() {
        List<LinkUser> listLIZLLL;
        Integer numValueOf;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || (numValueOf = Integer.valueOf(listLIZLLL.size())) == null) {
            return 0;
        }
        return numValueOf.intValue() - 1;
    }

    @Override // X.InterfaceC2182251Aat
    public final void LIZ(String str) {
        if (this.LIZ == 0) {
            return;
        }
        this.LIZLLL = System.currentTimeMillis() - this.LIZIZ;
        if (this.LJ != 0) {
            LIZLLL(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2182251Aat
    public final void LIZIZ(String str) {
        this.LIZIZ = System.currentTimeMillis();
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 2 && !Intrinsics.LJFF(str, this.LJFF)) {
            if (LinkCoreModelKt.currentUserIsAnchor()) {
                C1EOY.LIZ.LJIJ("linkmic_anchor_layout_switch");
            } else {
                C1EOY.LIZ.LJIJ("linkmic_guest_layout_switch");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(String str) {
        String idStr;
        Long lValueOf;
        String str2;
        String str3;
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 2) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room == null) {
                room = (Room) dataChannelGlobal.gg0(C930930aKh.class);
            }
            HashMap map = new HashMap();
            map.put("origin_layout_key", this.LJFF);
            map.put("target_layout_key", str);
            map.put("layout_id", C940770aaZ.LIZ().getDataSource().LJIL());
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            map.put("room_id", idStr);
            if (room != null) {
                lValueOf = Long.valueOf(room.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            map.put("anchor_id", String.valueOf(lValueOf));
            C930480aJy c930480aJy = C930480aJy.LIZ;
            User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
            c930480aJy.getClass();
            if (C930480aJy.LJIJI(userLJIJJLI)) {
                str2 = "anchor";
            } else {
                str2 = "guest";
            }
            map.put("role_type", str2);
            map.put("guest_cnt", String.valueOf(LIZJ()));
            if (LIZJ() > 0) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_guest_connection", str3);
            map.put("rust_sdk_version", "41.6.0-rc.0");
            EnumC918970a1P enumC918970a1PLJIILIIL = C917520Zz4.LJIILIIL();
            map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getFirst());
            map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getSecond());
            map.put("parse_duration", String.valueOf(this.LIZIZ - this.LIZ));
            map.put("rtc_render_duration", String.valueOf(this.LIZLLL));
            map.put("biz_view_duration", String.valueOf(this.LJ));
            map.put("total_duration", String.valueOf(Math.max(this.LIZLLL, this.LJ) + (this.LIZIZ - this.LIZ)));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_linkmic_layout_render_duration_event");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
            this.LJFF = str;
            this.LIZ = 0L;
            this.LIZIZ = 0L;
            this.LIZJ = 0L;
            this.LIZLLL = 0L;
            this.LJ = 0L;
            return;
        }
        this.LJFF = str;
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = 0L;
    }
}
