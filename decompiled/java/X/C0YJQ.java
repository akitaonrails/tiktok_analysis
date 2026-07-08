package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YJQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.data.source.ReadReceiptDataSource$ReadReceiptFetcher$batchFetch$1", f = "ReadReceiptDataSource.kt", l = {99}, m = "invokeSuspend")
public final class C0YJQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0YJJ LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YJQ(C0YJJ c0yjj, List<String> list, String str, boolean z, InterfaceC1364105Vn<? super C0YJQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yjj;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YJQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReadReceiptDataSource$ReadReceiptFetcher@6649.batchFetch$1");
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
            C05YC c05yc = (C05YC) this.LLILLJJLI.LIZJ.getValue();
            Pair pair = new Pair(this.LLILLL, this.LLILZ);
            this.LL = 1;
            if (c05yc.emit(pair, this) == objLJFF) {
                C1C7U.LIZIZ("ReadReceiptDataSource$ReadReceiptFetcher@6649.batchFetch$1");
                return objLJFF;
            }
        }
        C868780Y6i c868780Y6iLIZLLL = this.LLILLJJLI.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("batch fetch, from: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", forceFetch: ");
        sbLIZ.append(this.LLILZIL);
        C868780Y6i.LJ(c868780Y6iLIZLLL, "ReadReceiptFetcher", C2188811AlT.LIZIZ(sbLIZ), 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReadReceiptDataSource$ReadReceiptFetcher@6649.batchFetch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
