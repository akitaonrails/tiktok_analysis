package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.CkBeautyDataGlobalFetcherDelegate$queryBeautyData$1", f = "CkBeautyDataGlobalFetcherDelegate.kt", l = {52, 59}, m = "invokeSuspend")
public final class C1001630cAj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<List<BeautyCategory>, Unit> LLILLJJLI;
    public final /* synthetic */ C12HT LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1001630cAj(Function1<? super List<BeautyCategory>, Unit> function1, C12HT c12ht, InterfaceC1364105Vn<? super C1001630cAj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = c12ht;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001630cAj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CkBeautyDataGlobalFetcherDelegate@3cef.queryBeautyData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.invoke(C993500bxc.LIZIZ.getSecond());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("queryBeautyData success : date: ");
                    sbLIZ.append(C993500bxc.LIZIZ.getSecond());
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C993500bxc.LIZIZ = new Pair<>(EnumC992780bwS.FETCH_SUCCESS, obj);
                this.LLILLJJLI.invoke((List<BeautyCategory>) obj);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("queryBeautyData success : date: ");
                sbLIZ2.append(C993500bxc.LIZIZ.getSecond());
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (C993500bxc.LIZIZ.getFirst() == EnumC992780bwS.NO_FETCH) {
                C1DFB c1dfb = C0PEM.LIZJ;
                C1001640cAk c1001640cAk = new C1001640cAk(this.LLILLL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c1001640cAk);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CkBeautyDataGlobalFetcherDelegate@3cef.queryBeautyData$1");
                    return objLJFF;
                }
                C993500bxc.LIZIZ = new Pair<>(EnumC992780bwS.FETCH_SUCCESS, obj);
                this.LLILLJJLI.invoke((List<BeautyCategory>) obj);
                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                sbLIZ22.append("queryBeautyData success : date: ");
                sbLIZ22.append(C993500bxc.LIZIZ.getSecond());
                C2188811AlT.LIZIZ(sbLIZ22);
            } else {
                AnonymousClass0956 anonymousClass0956 = C993500bxc.LIZ;
                if (anonymousClass0956 != null) {
                    this.LL = 2;
                    if (anonymousClass0956.LJJZ(this) == objLJFF) {
                        C1C7U.LIZIZ("CkBeautyDataGlobalFetcherDelegate@3cef.queryBeautyData$1");
                        return objLJFF;
                    }
                }
                this.LLILLJJLI.invoke(C993500bxc.LIZIZ.getSecond());
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("queryBeautyData success : date: ");
                sbLIZ3.append(C993500bxc.LIZIZ.getSecond());
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CkBeautyDataGlobalFetcherDelegate@3cef.queryBeautyData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
