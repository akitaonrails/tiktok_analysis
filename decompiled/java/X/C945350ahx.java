package X;

import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ahx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945350ahx {
    public final DataChannel LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public String LJIIIZ;
    public int LJFF = 1;
    public String LJI = "";
    public String LJII = "";
    public String LJIIIIZZ = "";
    public final C987150bnN LJIIJ = new C987150bnN(this, 1);

    public final void LIZ() {
        String string;
        String strU3;
        Room room;
        Long l;
        DataChannel dataChannel = this.LIZ;
        String str = "";
        if (dataChannel == null || (l = (Long) dataChannel.gg0(C956680b0E.class)) == null || (string = l.toString()) == null) {
            string = "";
        }
        DataChannel dataChannel2 = this.LIZ;
        long id = (dataChannel2 == null || (room = (Room) dataChannel2.gg0(RoomChannel.class)) == null) ? 0L : room.getId();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null) {
            str = strU3;
        }
        LIZJ(0, null, String.valueOf(id), str, string);
    }

    public final void LIZIZ() {
        if (this.LIZIZ) {
            return;
        }
        C20441214yg.LIZIZ("BannerHelper", "refresh banner");
        if (MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().bannerRefreshShuffleTime < 0) {
            return;
        }
        ((IBannerService) C1161920gLG.LIZJ(IBannerService.class)).mE0(C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(0, r2)));
        this.LIZIZ = true;
    }

    public C945350ahx(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZLLL(String str) {
        String string;
        long id;
        String strU3;
        Room room;
        Long l;
        if (str.length() != 0 && !Intrinsics.LJFF(str, this.LJIIIZ)) {
            DataChannel dataChannel = this.LIZ;
            String str2 = "";
            if (dataChannel == null || (l = (Long) dataChannel.gg0(C956680b0E.class)) == null || (string = l.toString()) == null) {
                string = "";
            }
            if (string.length() == 0) {
                return;
            }
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null) {
                str2 = strU3;
            }
            LIZJ(1, str, String.valueOf(id), str2, string);
            this.LJIIIZ = str;
        }
    }

    public final void LIZJ(int i, String str, String str2, String str3, String str4) throws JSONException {
        if (!this.LIZJ) {
            C20441214yg.LJIIL("BannerHelper", "not receive banner ready event");
            this.LJFF = i;
            this.LJ = str;
            this.LJI = str2;
            this.LJII = str3;
            this.LJIIIIZZ = str4;
            this.LIZLLL = true;
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        jSONObject.put("bannerType", "wallpaper");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        jSONObject2.put("pic_url", str);
        jSONObject2.put("room_id", str2);
        jSONObject2.put("channel_id", str3);
        if (i == 0) {
            jSONObject2.put("wallpaper_id", (Object) null);
        } else {
            jSONObject2.put("wallpaper_id", str4);
        }
        jSONObject2.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJII).getFirst());
        jSONObject2.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJII).getSecond());
        jSONObject.put("data", jSONObject2);
        C01ZY.LIZLLL(jSONObject);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendBannerShowJsEvent, params: ");
        sbLIZ.append(jSONObject);
        C20441214yg.LIZIZ("BannerHelper", C2188811AlT.LIZIZ(sbLIZ));
    }
}
