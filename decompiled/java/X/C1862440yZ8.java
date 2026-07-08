package X;

import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yZ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862440yZ8 extends C09AY implements Function1<TakoBehaviorCollectData, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SmartSearchItem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1862440yZ8(String str, String str2, SmartSearchItem smartSearchItem) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = smartSearchItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoBehaviorCollectData takoBehaviorCollectData) {
        String string;
        TakoBehaviorCollectData takoBehaviorCollectData2 = takoBehaviorCollectData;
        takoBehaviorCollectData2.setEnterAwemeId(this.LL);
        takoBehaviorCollectData2.setEnterSearchId(this.LLILLJJLI);
        Pair[] pairArr = new Pair[3];
        String str = this.LLILLJJLI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("search_id", str);
        String str3 = this.LLILLL.panelImplId;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("panel_impr_id", str3);
        Integer numIsPhoto = this.LLILLL.isPhoto();
        LinkedHashMap linkedHashMap = null;
        if (numIsPhoto != null && (string = numIsPhoto.toString()) != null) {
            str2 = string;
        }
        pairArr[2] = new Pair("is_photo", str2);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        SmartSearchItem smartSearchItem = this.LLILLL;
        String str4 = smartSearchItem.infoTitle;
        if (str4 != null && str4.length() > 0) {
            mapLJIIJ.put("info_title", str4);
        }
        String str5 = smartSearchItem.infoContent;
        if (str5 != null && str5.length() > 0) {
            mapLJIIJ.put("info_content", str5);
        }
        String str6 = smartSearchItem.wordId;
        if (str6 != null && str6.length() > 0) {
            mapLJIIJ.put("word_id", str6);
        }
        String str7 = smartSearchItem.wordContent;
        if (str7 != null && str7.length() > 0) {
            mapLJIIJ.put("words_content", str7);
        }
        Map<String, String> map = smartSearchItem.sugMobParams;
        if (map != null && (!map.isEmpty())) {
            mapLJIIJ.putAll(map);
        }
        takoBehaviorCollectData2.setChatMobParams(mapLJIIJ);
        Map<String, String> map2 = this.LLILLL.sugMobParams;
        if (map2 != null && (!map2.isEmpty())) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map2);
        }
        takoBehaviorCollectData2.setSendMessageMobParams(linkedHashMap);
        return Unit.LIZ;
    }
}
