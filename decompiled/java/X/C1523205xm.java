package X;

import android.view.View;
import com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment$onViewCreated$3$1", f = "ImportDeviceSoundsFragment.kt", l = {128, 129}, m = "invokeSuspend")
public final class C1523205xm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ImportDeviceSoundsFragment LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523205xm(ImportDeviceSoundsFragment importDeviceSoundsFragment, View view, InterfaceC1364105Vn<? super C1523205xm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = importDeviceSoundsFragment;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1523205xm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImportDeviceSoundsFragment@5e82.onViewCreated$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.onViewCreated$3$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ImportDeviceSoundsFragment importDeviceSoundsFragment = this.LLILLJJLI;
            this.LL = 1;
            importDeviceSoundsFragment.getClass();
            obj = C2296808zG.LJ(new C1523005xk(importDeviceSoundsFragment, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.onViewCreated$3$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1523305xn c1523305xn = new C1523305xn(this.LLILLJJLI, (List) obj, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1523305xn) == objLJFF) {
            C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.onViewCreated$3$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.onViewCreated$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
