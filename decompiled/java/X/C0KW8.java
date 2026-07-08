package X;

import com.bytedance.i18n.location.api.LocationData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import njp.a;

/* JADX INFO: renamed from: X.0KW8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.container.dynamicbutton.DynamicSuggestEditAction$onClick$1$result$1", f = "DynamicSuggestEditAction.kt", l = {214}, m = "invokeSuspend")
public final class C0KW8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Double, ? extends Double>>, Object> {
    public int LL;
    public final /* synthetic */ C1195910hE5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KW8(C1195910hE5 c1195910hE5, InterfaceC1364105Vn<? super C0KW8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1195910hE5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KW8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DynamicSuggestEditAction@33b3.onClick$1$result$1");
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
            C1195910hE5 c1195910hE5 = this.LLILLJJLI;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            final AwS621S0100000_7 awS621S0100000_7 = new AwS621S0100000_7(c2252611DEt, 77);
            final AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c2252611DEt, 656);
            c1195910hE5.getClass();
            Pair pairLIZLLL = C1198600hIQ.LIZLLL();
            C1207450hWh.LIZ.LJIIL("poi", "create_poi", (AbstractC1202400hOY) pairLIZLLL.getFirst(), (AbstractC1202400hOY) pairLIZLLL.getSecond(), new InterfaceC687820QyS() { // from class: X.0KW9
                @Override // X.InterfaceC687820QyS
                public final void LIZ(LocationData locationData) {
                    Function2<Double, Double, Unit> function2;
                    if (locationData.latitude != 0.0d && locationData.longitude != 0.0d && 1 != 0 && (function2 = awS621S0100000_7) != null) {
                        function2.invoke(Double.valueOf(locationData.latitude), Double.valueOf(locationData.longitude));
                        if (Unit.LIZ != null) {
                            return;
                        }
                    }
                    Function0<Unit> function0 = awS551S0100000_7;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // X.InterfaceC687820QyS
                public final void onError(int i2, String str) {
                    Function0<Unit> function0 = awS551S0100000_7;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }, -1L);
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DynamicSuggestEditAction@33b3.onClick$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DynamicSuggestEditAction@33b3.onClick$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Double, ? extends Double>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
