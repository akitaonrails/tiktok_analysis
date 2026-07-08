package X;

import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import com.ss.android.ugc.aweme.tako.router.model.TakoStreamRequestExtParams;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ycL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1864430ycL extends C09AY implements Function1<TakoBehaviorCollectData, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864430ycL(String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoBehaviorCollectData takoBehaviorCollectData) {
        TakoBehaviorCollectData takoBehaviorCollectData2 = takoBehaviorCollectData;
        takoBehaviorCollectData2.setEnterSearchId(this.LL);
        takoBehaviorCollectData2.setStreamRequestExtParams(new TakoStreamRequestExtParams(null, null, this.LLILLJJLI, null));
        Pair[] pairArr = new Pair[4];
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("search_id", str);
        String str3 = this.LLILLL;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("search_type", str3);
        String str4 = this.LLILZ;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[2] = new Pair("query", str4);
        String str5 = this.LLILZIL;
        if (str5 != null) {
            str2 = str5;
        }
        pairArr[3] = new Pair("icon_state", str2);
        takoBehaviorCollectData2.setChatMobParams(C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }
}
