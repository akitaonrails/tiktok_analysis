package X;

import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044730dIF {
    public static final C1044730dIF LIZ = new C1044730dIF();

    public static C1262704wr LIZ(C1867807Tg c1867807Tg) throws JSONException {
        C1551950qUL c1551950qULLJIILJJIL = C1552050qUV.LJIILJJIL(c1867807Tg.LIZ, null);
        if (c1551950qULLJIILJJIL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init client failed, accessKey=");
            sbLIZ.append(c1867807Tg.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", "pre_load_gecko_error");
            jSONObject.put("message", strLIZIZ);
            C20684815ws.LJIJ("commercialize_shopping_task", jSONObject);
            C1022620cia.LIZIZ("ShoppingTaskGeckoPreLoader", strLIZIZ);
            return new C1262704wr(false, strLIZIZ);
        }
        List<String> list = c1867807Tg.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
            targetChannel.channelName = str;
            arrayList.add(targetChannel);
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("targetChannelList is empty, accessKey=");
            sbLIZ2.append(c1867807Tg.LIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", "pre_load_gecko_error");
            jSONObject2.put("message", strLIZIZ2);
            C20684815ws.LJIJ("commercialize_shopping_task", jSONObject2);
            C1022620cia.LIZIZ("ShoppingTaskGeckoPreLoader", strLIZIZ2);
            return new C1262704wr(false, strLIZIZ2);
        }
        Map<String, List<CheckRequestBodyModel.TargetChannel>> mapLIZJ = C2097908Jt.LIZJ(new Pair(c1867807Tg.LIZ, arrayList));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("preload targetChannels: ");
        sbLIZ3.append(mapLIZJ);
        C1022620cia.LIZ("ShoppingTaskGeckoPreLoader", C2188811AlT.LIZIZ(sbLIZ3));
        c1551950qULLJIILJJIL.LIZJ(mapLIZJ, new C1077190e8b(c1867807Tg, 2));
        return new C1262704wr(true, "");
    }
}
