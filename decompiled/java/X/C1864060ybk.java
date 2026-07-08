package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import com.ss.android.ugc.aweme.tako.router.model.TakoStreamRequestExtParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ybk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1864060ybk extends C09AY implements Function1<TakoBehaviorCollectData, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Uri LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864060ybk(Uri uri, String str, String str2, Map map) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = uri;
        this.LLILLL = map;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoBehaviorCollectData takoBehaviorCollectData) {
        String strLIZIZ;
        String strLIZIZ2;
        String strLIZIZ3;
        TakoBehaviorCollectData takoBehaviorCollectData2 = takoBehaviorCollectData;
        takoBehaviorCollectData2.setEnterSearchId(this.LL);
        Uri uri = this.LLILLJJLI;
        if (uri != null) {
            strLIZIZ = C1862500yZE.LIZIZ(uri, "sar_info");
        } else {
            strLIZIZ = null;
        }
        takoBehaviorCollectData2.setStreamRequestExtParams(new TakoStreamRequestExtParams(null, null, strLIZIZ, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = this.LLILLL;
        Uri uri2 = this.LLILLJJLI;
        String str = this.LLILZ;
        linkedHashMap.putAll(map);
        if (uri2 != null && (strLIZIZ3 = C1862500yZE.LIZIZ(uri2, "token_type")) != null) {
            linkedHashMap.put("token_type", strLIZIZ3);
        }
        if (str != null) {
            linkedHashMap.put("query", str);
        }
        if (uri2 != null && (strLIZIZ2 = C1862500yZE.LIZIZ(uri2, "search_general_card_type")) != null) {
            linkedHashMap.put("search_card_type", strLIZIZ2);
        }
        takoBehaviorCollectData2.setChatMobParams(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(this.LLILLL);
        takoBehaviorCollectData2.setSendMessageMobParams(linkedHashMap2);
        return Unit.LIZ;
    }
}
