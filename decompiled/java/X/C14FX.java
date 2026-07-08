package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import com.ss.android.ugc.aweme.tako.router.model.TakoStreamRequestExtParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14FX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14FX extends C09AY implements Function1<TakoBehaviorCollectData, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C2189821An6 LLILLL;
    public final /* synthetic */ C259800zU<Long> LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14FX(Aweme aweme, String str, C2189821An6 c2189821An6, C259800zU<Long> c259800zU, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        super(1);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = c2189821An6;
        this.LLILZ = c259800zU;
        this.LLILZIL = map;
        this.LLILZLL = map2;
        this.LLIZ = map3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoBehaviorCollectData takoBehaviorCollectData) {
        String aid;
        String searchKeyword;
        TakoBehaviorCollectData takoBehaviorCollectData2 = takoBehaviorCollectData;
        Aweme aweme = this.LL;
        Integer numValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        takoBehaviorCollectData2.setEnterAwemeId(aid);
        String searchId = this.LLILLJJLI;
        if (searchId == null) {
            C2189821An6 c2189821An6 = this.LLILLL;
            if (c2189821An6 != null) {
                searchId = c2189821An6.getSearchId();
            } else {
                searchId = null;
            }
        }
        takoBehaviorCollectData2.setEnterSearchId(searchId);
        Long l = this.LLILZ.element;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C20269114Sr.LJI(linkedHashMap, this.LLILZLL);
        takoBehaviorCollectData2.setStreamRequestExtParams(new TakoStreamRequestExtParams(null, l, null, linkedHashMap));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Map<String, String> map = this.LLIZ;
        Aweme aweme2 = this.LL;
        C2189821An6 c2189821An62 = this.LLILLL;
        if (map != null) {
            linkedHashMap2.putAll(map);
        }
        if (aweme2 != null) {
            numValueOf = Integer.valueOf(aweme2.getAwemeType());
        }
        linkedHashMap2.put("aweme_type", String.valueOf(numValueOf));
        if (c2189821An62 != null && (searchKeyword = c2189821An62.getSearchKeyword()) != null && searchKeyword.length() > 0) {
            linkedHashMap2.put("query", searchKeyword);
        }
        takoBehaviorCollectData2.setChatMobParams(linkedHashMap2);
        takoBehaviorCollectData2.setSendMessageMobParams(this.LLILZIL);
        return Unit.LIZ;
    }
}
