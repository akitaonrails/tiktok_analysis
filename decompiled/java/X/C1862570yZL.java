package X;

import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yZL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862570yZL extends C09AY implements Function1<TakoBehaviorCollectData, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1862570yZL(String str, String str2, String str3, String str4, String str5, String str6) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoBehaviorCollectData takoBehaviorCollectData) {
        TakoBehaviorCollectData takoBehaviorCollectData2 = takoBehaviorCollectData;
        takoBehaviorCollectData2.setEnterSearchId(this.LL);
        Pair[] pairArr = new Pair[6];
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("search_id", str);
        String str3 = this.LLILLJJLI;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("search_type", str3);
        String str4 = this.LLILLL;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[2] = new Pair("query", str4);
        String str5 = this.LLILZ;
        if (str5 == null) {
            str5 = "";
        }
        pairArr[3] = new Pair("token_type", str5);
        String str6 = this.LLILZIL;
        if (str6 == null) {
            str6 = "";
        }
        pairArr[4] = new Pair("universal_rank", str6);
        String str7 = this.LLILZLL;
        if (str7 != null) {
            str2 = str7;
        }
        pairArr[5] = new Pair("abase_id", str2);
        takoBehaviorCollectData2.setChatMobParams(C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }
}
