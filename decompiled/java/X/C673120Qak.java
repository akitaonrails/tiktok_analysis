package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.mob.SearchMusicMiddlePerfMobHelper$processTrendingData$1", f = "SearchMusicMiddlePerfMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C673120Qak extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C681610QoR LL;
    public final /* synthetic */ SuggestWordResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673120Qak(C681610QoR c681610QoR, SuggestWordResponse suggestWordResponse, InterfaceC1364105Vn<? super C673120Qak> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c681610QoR;
        this.LLILLJJLI = suggestWordResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673120Qak(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        SuggestWordResponse.Extra extra;
        Map<String, String> timingLog;
        String str;
        TypeWords typeWords;
        List<Word> list;
        C1C7U.LIZ("SearchMusicMiddlePerfMobHelper@2b04.processTrendingData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C681610QoR c681610QoR = this.LL;
        List<TypeWords> list2 = this.LLILLJJLI.data;
        int size = 0;
        if (list2 != null && (typeWords = (TypeWords) C13LP.LJJJLZIJ(0, list2)) != null && (list = typeWords.words) != null) {
            size = list.size();
        }
        c681610QoR.LIZLLL = size;
        C681610QoR c681610QoR2 = this.LL;
        try {
            extra = this.LLILLJJLI.extra;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extra != null && (timingLog = extra.getTimingLog()) != null && (str = timingLog.get("server_api_cost")) != null) {
            j = CastLongProtector.parseLong(str);
        } else {
            j = 0;
        }
        c681610QoR2.LJII = j;
        C099F c099f = this.LL.LJIILJJIL;
        Unit unit = Unit.LIZ;
        c099f.LJJLIIIJILLIZJL(unit);
        C1C7U.LIZIZ("SearchMusicMiddlePerfMobHelper@2b04.processTrendingData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
