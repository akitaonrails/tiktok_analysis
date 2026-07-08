package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00o8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C189400o8 extends C09AY implements Function0<Map<String, ? extends String>> {
    public final /* synthetic */ C1097420efE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C189400o8(C1097420efE c1097420efE) {
        super(0);
        this.LL = c1097420efE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        String string;
        String string2;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        InterfaceC500940Jki interfaceC500940JkiUser2;
        InterfaceC2262081DgM currentUser2;
        this.LL.getClass();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Pair[] pairArr = new Pair[3];
        UserService userService = UserService.getInstance();
        String secUid = null;
        if (userService != null && (interfaceC500940JkiUser2 = userService.user()) != null && (currentUser2 = interfaceC500940JkiUser2.getCurrentUser()) != null) {
            secUid = currentUser2.getSecUid();
        }
        String str = "";
        if (secUid == null) {
            secUid = "";
        }
        pairArr[0] = new Pair("PCS_Default_Preload_Current_Sec_Uid", secUid);
        UserService userService2 = UserService.getInstance();
        if (userService2 == null || (interfaceC500940JkiUser = userService2.user()) == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null || (string = Long.valueOf(currentUser.getId()).toString()) == null) {
            string = "";
        }
        pairArr[1] = new Pair("PCS_Default_Preload_Current_Uid", string);
        if (room != null && (string2 = Long.valueOf(room.getId()).toString()) != null) {
            str = string2;
        }
        pairArr[2] = new Pair("PCS_Default_Preload_Current_Room_Id", str);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
