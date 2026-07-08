package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.utils.FetchHandler$activate$3$1", f = "FetchHandler.kt", l = {88, 90}, m = "invokeSuspend")
public final class C592000NJu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C592050NJz LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592000NJu(C592050NJz c592050NJz, List<String> list, InterfaceC1364105Vn<? super C592000NJu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c592050NJz;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592000NJu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FetchHandler@8189.activate$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FetchHandler@8189.activate$3$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C592050NJz c592050NJz = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            this.LL = 1;
            obj = c592050NJz.LIZIZ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FetchHandler@8189.activate$3$1");
                return objLJFF;
            }
        }
        C592010NJv c592010NJv = (C592010NJv) obj;
        C595260NWi c595260NWi = c592010NJv.LIZ;
        boolean z = c592010NJv.LIZIZ;
        C2252331DDr c2252331DDr = this.LLILLJJLI.LJI;
        C592020NJw c592020NJw = new C592020NJw(c595260NWi, z);
        this.LL = 2;
        if (c2252331DDr.emit(c592020NJw, this) == objLJFF) {
            C1C7U.LIZIZ("FetchHandler@8189.activate$3$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FetchHandler@8189.activate$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
