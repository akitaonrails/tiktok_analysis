package X;

import android.content.Context;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750640TcU extends C750630TcT {
    public final C750650TcV LLILZIL;
    public final int LLILZLL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        return new AwS556S0100000_12(this, 790);
    }

    public C750640TcU(C750650TcV c750650TcV) {
        super(c750650TcV);
        this.LLILZIL = c750650TcV;
        this.LLILZLL = 1;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        UserAttr userAttr;
        Map<Integer, Integer> map;
        Integer num;
        C750650TcV c750650TcV = this.LLILZIL;
        if (c750650TcV.LIZ == null) {
            return false;
        }
        if (!c750650TcV.LIZIZ) {
            if (!c750650TcV.LIZJ) {
                return false;
            }
            int i = this.LLILZLL;
            InterfaceC2262081DgM interfaceC2262081DgM = c750650TcV.LJI;
            if (interfaceC2262081DgM == null || (userAttr = interfaceC2262081DgM.getUserAttr()) == null || (map = userAttr.adminPermissions) == null || (num = map.get(Integer.valueOf(i))) == null || num.intValue() != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC752950TgD
    public final void LIZIZ(C755180Tjo c755180Tjo, Context context) {
        LiveMode liveMode;
        String str;
        this.LLILLJJLI = c755180Tjo;
        this.LL = context;
        C750650TcV c750650TcV = this.LLILZIL;
        DataChannel dataChannel = c750650TcV.LJIIIZ;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_comment_settings_show");
        c474500IjALIZ.LJIJJLI(c750650TcV.LJIIIZ);
        c474500IjALIZ.LJIILJJIL("live_take_page");
        c474500IjALIZ.LJJII(C0KYR.LIZIZ(c750650TcV.LIZLLL, c750650TcV.LJIIIZ), "admin_type");
        int i = C200200ps.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "third_party";
            } else {
                str = "screen_share";
            }
        } else {
            str = "video_live";
        }
        c474500IjALIZ.LJJII(str, "live_type");
        c474500IjALIZ.LJJII(c750650TcV.LJIIIIZZ, "panel_type");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZIL.LJIIJ ? 1 : 0), "is_hot_comment");
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        c474500IjALIZ.LIZ();
    }
}
