package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizItem;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizResponse;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182920gt8 extends C09AY implements Function1<C1182980gtE, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ PoiQuizPageVM LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ PoiQuizResponse LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182920gt8(long j, PoiQuizPageVM poiQuizPageVM, boolean z, PoiQuizResponse poiQuizResponse) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = poiQuizPageVM;
        this.LLILLL = z;
        this.LLILZ = poiQuizResponse;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1182980gtE c1182980gtE) {
        Object obj;
        Object obj2;
        Object obj3;
        List<PoiQuizItem> list;
        Integer num;
        C1182980gtE c1182980gtE2 = c1182980gtE;
        c1182980gtE2.LIZLLL = "tiktok/poi/rewards/recommend";
        c1182980gtE2.LJ = "quiz_response";
        c1182980gtE2.LIZ = Long.valueOf(this.LL);
        c1182980gtE2.LIZIZ = Long.valueOf(System.currentTimeMillis());
        String str = "1";
        if (this.LLILLJJLI.LLJIJIL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c1182980gtE2.LJFF = new Pair<>("is_init", obj);
        if (this.LLILLL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1182980gtE2.LJI = new Pair<>("location_allowed", obj2);
        PoiQuizResponse poiQuizResponse = this.LLILZ;
        if (poiQuizResponse != null && (num = poiQuizResponse.statusCode) != null && num.intValue() == 0) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c1182980gtE2.LJII = new Pair<>("is_success", obj3);
        PoiQuizResponse poiQuizResponse2 = this.LLILZ;
        if (poiQuizResponse2 != null && (list = poiQuizResponse2.poiList) != null && !list.isEmpty()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1182980gtE2.LJIIIIZZ = new Pair<>("is_empty", str);
        return Unit.LIZ;
    }
}
