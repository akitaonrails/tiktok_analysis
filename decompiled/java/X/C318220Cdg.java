package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$fetchNetworkData$2$deferredDrafts$1", f = "MyEffectsViewModel.kt", l = {151}, m = "invokeSuspend")
public final class C318220Cdg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftEffect>>, Object> {
    public int LL;
    public final /* synthetic */ MyEffectsViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318220Cdg(MyEffectsViewModel myEffectsViewModel, InterfaceC1364105Vn<? super C318220Cdg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = myEffectsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318220Cdg(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MyEffectsViewModel@4e1b.fetchNetworkData$2$deferredDrafts$1");
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
            MyEffectsViewModel myEffectsViewModel = this.LLILLJJLI;
            this.LL = 1;
            myEffectsViewModel.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C318190Cdd(myEffectsViewModel, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchNetworkData$2$deferredDrafts$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchNetworkData$2$deferredDrafts$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftEffect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
