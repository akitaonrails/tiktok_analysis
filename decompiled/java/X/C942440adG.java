package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.MultiGuestEmojiPositionModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.MultiGuestEmojiPositionSettingModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.MultiGuestEmojiPositionSpecialSettingModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0adG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942440adG {
    public final C054G LIZ;
    public final EnumC771350UNp LIZIZ;
    public MultiGuestEmojiPositionSettingModel LIZJ;

    @InterfaceC947260al2(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder multiGuestDataHolder;

    public C942440adG() throws IllegalAccessException {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LIZIZ = EnumC771350UNp.MULTI_GUEST_EMOJI;
        C948450amx.LIZIZ.LIZLLL(this);
    }

    public static MultiGuestEmojiPositionSettingModel LIZIZ(String str) {
        Iterator<String> itKeys;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        try {
            if (str.length() == 0) {
                str = "{}";
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("common");
            if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject2 != null) {
                        linkedHashMap.put(Integer.valueOf(CastIntegerProtector.parseInt(next)), new MultiGuestEmojiPositionModel(jSONObjectOptJSONObject2.optInt("emo_size"), jSONObjectOptJSONObject2.optInt("start"), jSONObjectOptJSONObject2.optInt("top"), 0));
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("special");
            if (jSONObjectOptJSONObject3 != null) {
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("audio");
                if (jSONObjectOptJSONObject4 != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject(next2);
                        if (jSONObjectOptJSONObject5 != null) {
                            linkedHashMap2.put(next2, new MultiGuestEmojiPositionModel(jSONObjectOptJSONObject5.optInt("emo_size"), jSONObjectOptJSONObject5.optInt("start"), jSONObjectOptJSONObject5.optInt("top"), 0));
                        }
                    }
                }
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject3.optJSONObject("video");
                if (jSONObjectOptJSONObject6 != null) {
                    Iterator<String> itKeys3 = jSONObjectOptJSONObject6.keys();
                    while (itKeys3.hasNext()) {
                        String next3 = itKeys3.next();
                        JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject6.optJSONObject(next3);
                        if (jSONObjectOptJSONObject7 != null) {
                            linkedHashMap3.put(next3, new MultiGuestEmojiPositionModel(jSONObjectOptJSONObject7.optInt("emo_size"), jSONObjectOptJSONObject7.optInt("start"), jSONObjectOptJSONObject7.optInt("top"), jSONObjectOptJSONObject7.optInt("is_full_screen")));
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handle json object error: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("MultiGuestMicSeatEmojiDataSource", C2188811AlT.LIZIZ(sbLIZ));
        }
        return new MultiGuestEmojiPositionSettingModel(linkedHashMap, new MultiGuestEmojiPositionSpecialSettingModel(linkedHashMap2, linkedHashMap3));
    }

    public final int LIZ(String str) {
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder != null && Intrinsics.LJFF(multiGuestDataHolder.LJIILLIIL(str), Boolean.TRUE)) {
            return 2;
        }
        return 1;
    }
}
