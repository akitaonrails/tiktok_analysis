package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GHouseCacheLoader$loadInBatches$secondBatchJob$1", f = "GHouseCacheLoader.kt", l = {119}, m = "invokeSuspend")
public final class C591070NGf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ List<C591060NGe> LLILLL;
    public final /* synthetic */ List<C591060NGe> LLILZ;
    public final /* synthetic */ C591100NGi LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591070NGf(C118300cf c118300cf, List<C591060NGe> list, List<C591060NGe> list2, C591100NGi c591100NGi, InterfaceC1364105Vn<? super C591070NGf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c118300cf;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = c591100NGi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591070NGf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C591060NGe> listSubList;
        C1C7U.LIZ("GHouseCacheLoader@5f9a.loadInBatches$secondBatchJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ArrayList arrayList = new ArrayList();
            if (this.LLILLJJLI.element >= this.LLILLL.size() - 1) {
                listSubList = C13BV.INSTANCE;
            } else {
                List<C591060NGe> list = this.LLILZ;
                listSubList = list.subList(this.LLILLJJLI.element + 1, list.size());
            }
            C591100NGi c591100NGi = this.LLILZIL;
            for (C591060NGe c591060NGe : listSubList) {
                Aweme awemeLIZLLL = c591100NGi.LIZIZ.LIZLLL(c591060NGe.LJ.aid);
                if (awemeLIZLLL != null) {
                    c591060NGe.value = awemeLIZLLL;
                    arrayList.add(c591060NGe);
                }
            }
            if (!arrayList.isEmpty()) {
                C0NGO c0ngo = this.LLILZIL.LIZ;
                this.LL = 1;
                if (c0ngo.LIZLLL(arrayList) == objLJFF) {
                    C1C7U.LIZIZ("GHouseCacheLoader@5f9a.loadInBatches$secondBatchJob$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GHouseCacheLoader@5f9a.loadInBatches$secondBatchJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
