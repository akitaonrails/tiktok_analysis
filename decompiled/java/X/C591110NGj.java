package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GHouseCacheLoader$loadInBatches$7", f = "GHouseCacheLoader.kt", l = {123, 124}, m = "invokeSuspend")
public final class C591110NGj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09AE LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<List<CacheEntry>> LLILLL;
    public final /* synthetic */ C591100NGi LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C591110NGj(C09AE c09ae, AnonymousClass0957<? extends List<? extends CacheEntry>> anonymousClass0957, C591100NGi c591100NGi, InterfaceC1364105Vn<? super C591110NGj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09ae;
        this.LLILLL = anonymousClass0957;
        this.LLILZ = c591100NGi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591110NGj(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<? extends CacheEntry> list;
        C0NGM c0ngm;
        C1C7U.LIZ("GHouseCacheLoader@5f9a.loadInBatches$7");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    list = (List) obj;
                    if (list != null && (!list.isEmpty()) && (c0ngm = this.LLILZ.LIZJ) != null) {
                        c0ngm.LIZIZ(list);
                    }
                    this.LLILZ.LIZ();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GHouseCacheLoader@5f9a.loadInBatches$7");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C09AE c09ae = this.LLILLJJLI;
            this.LL = 1;
            if (c09ae.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("GHouseCacheLoader@5f9a.loadInBatches$7");
                return objLJFF;
            }
        }
        AnonymousClass0957<List<CacheEntry>> anonymousClass0957 = this.LLILLL;
        this.LL = 2;
        obj = anonymousClass0957.LJLIIIL(this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("GHouseCacheLoader@5f9a.loadInBatches$7");
            return objLJFF;
        }
        list = (List) obj;
        if (list != null) {
            c0ngm.LIZIZ(list);
        }
        this.LLILZ.LIZ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GHouseCacheLoader@5f9a.loadInBatches$7");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
