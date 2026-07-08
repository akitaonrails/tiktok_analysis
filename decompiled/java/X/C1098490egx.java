package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerPreloadFirstFrameWithQuerySetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateBundle;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0egx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098490egx {
    public final SparkContext LIZ;
    public final List<? extends BannerInRoom> LIZIZ;
    public final InterfaceC1098410egp LIZJ;
    public TemplateBundle LIZLLL;

    public static String LIZ(BannerInRoom bannerInRoom) {
        String strLIZIZ;
        String strLIZJ = C1097970eg7.LIZJ(bannerInRoom);
        if (strLIZJ == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ);
        if (LiveBannerPreloadFirstFrameWithQuerySetting.INSTANCE.getValue()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('?');
            sbLIZ2.append(bannerInRoom.id);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH) throws JSONException {
        List<? extends BannerInRoom> list = this.LIZIZ;
        if (list != null && !list.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", C2348809Ig.LJIIIIZZ(this.LIZIZ));
            jSONObject.put("type", "init");
            interfaceC1541990qEH.LIZ("H5_roomStatusChange", jSONObject);
            InterfaceC1098410egp interfaceC1098410egp = this.LIZJ;
            if (interfaceC1098410egp != null) {
                interfaceC1098410egp.L();
            }
        }
    }

    public C1098490egx(SparkContext sparkContext, List list, NewTopRightBannerWidget newTopRightBannerWidget) {
        this.LIZ = sparkContext;
        this.LIZIZ = list;
        this.LIZJ = newTopRightBannerWidget;
    }
}
