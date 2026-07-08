package X;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978090bYl implements InterfaceC1141530foN {
    public final Function2<Integer, String, Unit> LL;
    public C977630bY1 LLILLJJLI;
    public InterfaceC978260bZ2 LLILLL;
    public C428750GrZ LLILZ;
    public FrameLayout LLILZIL;
    public LinearLayout LLILZLL;
    public C1295960jpS LLIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C978090bYl(Function2<? super Integer, ? super String, Unit> function2) {
        this.LL = function2;
    }

    public static JSONArray LIZ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((Number) it2.next()).longValue()));
        }
        return new JSONArray((Collection) arrayList);
    }

    public static JSONObject LIZIZ(GiftGalleryBadgeInfo giftGalleryBadgeInfo) throws JSONException {
        String str;
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText;
        String str2;
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText2;
        JSONObject jSONObject = new JSONObject();
        GiftGalleryBadgeSection giftGalleryBadgeSection = giftGalleryBadgeInfo.leagueInfo;
        String str3 = "";
        if (giftGalleryBadgeSection == null || (linkMicGiftGalleryDisplayText2 = giftGalleryBadgeSection.displayText) == null || (str = linkMicGiftGalleryDisplayText2.content) == null) {
            str = "";
        }
        jSONObject.put("league_level", str);
        GiftGalleryBadgeSection giftGalleryBadgeSection2 = giftGalleryBadgeInfo.leagueInfo;
        if (giftGalleryBadgeSection2 != null && (linkMicGiftGalleryDisplayText = giftGalleryBadgeSection2.displayText) != null && (str2 = linkMicGiftGalleryDisplayText.color) != null) {
            str3 = str2;
        }
        jSONObject.put("text_color", str3);
        return jSONObject;
    }

    public static JSONObject LIZJ(C954460awe c954460awe) throws JSONException {
        String str;
        ImageModel imageModel;
        List urls;
        Object obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", String.valueOf(c954460awe.LJ));
        C754570Tip c754570Tip = c954460awe.LJIJJ;
        Object obj2 = "";
        if (c754570Tip == null || (str = c754570Tip.LIZIZ) == null) {
            str = "";
        }
        jSONObject.put("nickname", str);
        C754570Tip c754570Tip2 = c954460awe.LJIJJ;
        if (c754570Tip2 != null && (imageModel = c754570Tip2.LIZJ) != null && (urls = imageModel.getUrls()) != null && (obj = ListProtector.get(urls, 0)) != null) {
            obj2 = obj;
        }
        jSONObject.put("icon_url", obj2);
        return jSONObject;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    @Override // X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mh2(X.C262100zr r25) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C978090bYl.mh2(X.00zr):void");
    }

    public static final void LIZLLL(String str, JSONObject jSONObject) {
        C389001fE.LIZ(str, jSONObject, System.currentTimeMillis(), false);
    }
}
