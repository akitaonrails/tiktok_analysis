package X;

import com.ss.android.ugc.nearby.container.NearbyContentAssem;
import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0hRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.NearbyContentAssem$initObserver$2", f = "NearbyContentAssem.kt", l = {278}, m = "invokeSuspend")
public final class C1204450hRr extends C09AX implements InterfaceC1631620sYq<Long, C1203960hR4, InterfaceC1364105Vn<? super Pair<? extends EnumC1204140hRM, ? extends C1204080hRG>>, Object> {
    public int LL;
    public /* synthetic */ long LLILLJJLI;
    public /* synthetic */ C1203960hR4 LLILLL;
    public final /* synthetic */ NearbyContentAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204450hRr(NearbyContentAssem nearbyContentAssem, InterfaceC1364105Vn<? super C1204450hRr> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = nearbyContentAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyContentAssem@bf9f.initObserver$2");
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
            long j = this.LLILLJJLI;
            C1203960hR4 c1203960hR4 = this.LLILLL;
            NearbyContainerViewModel nearbyContainerViewModelOo = this.LLILZ.Oo();
            this.LL = 1;
            obj = nearbyContainerViewModelOo.EQ2(j, c1203960hR4, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NearbyContentAssem@bf9f.initObserver$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("NearbyContentAssem@bf9f.initObserver$2");
        return obj;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Long l, C1203960hR4 c1203960hR4, InterfaceC1364105Vn<? super Pair<? extends EnumC1204140hRM, ? extends C1204080hRG>> interfaceC1364105Vn) {
        long jLongValue = l.longValue();
        C1204450hRr c1204450hRr = new C1204450hRr(this.LLILZ, interfaceC1364105Vn);
        c1204450hRr.LLILLJJLI = jLongValue;
        c1204450hRr.LLILLL = c1203960hR4;
        return c1204450hRr.invokeSuspend(Unit.LIZ);
    }
}
