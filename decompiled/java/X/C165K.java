package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.165K, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.store.PNSDataStore$getBoolFlow$1", f = "PNSDataStore.kt", l = {112}, m = "invokeSuspend")
public final class C165K extends C09AX implements Function2<C094D<? super Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165K(String str, InterfaceC1364105Vn<? super C165K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C165K c165k = new C165K(this.LLILLL, interfaceC1364105Vn);
        c165k.LLILLJJLI = obj;
        return c165k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.165M, com.bytedance.keva.Keva$OnChangeListener] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSDataStore@6f98.getBoolFlow$1");
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
            final C094D c094d = (C094D) this.LLILLJJLI;
            C15Z2.LIZ.getClass();
            if (C15Z2.LIZIZ().contains(this.LLILLL)) {
                c094d.LJIIIIZZ(Boolean.valueOf(C15Z2.LIZIZ().getBoolean(this.LLILLL, false)));
            } else {
                c094d.LJIIIIZZ(null);
            }
            final String str = this.LLILLL;
            ?? r2 = new Keva.OnChangeListener() { // from class: X.165M
                @Override // com.bytedance.keva.Keva.OnChangeListener
                public final void onChanged(Keva keva, String str2) {
                    if (Intrinsics.LJFF(str, str2)) {
                        C15Z2.LIZ.getClass();
                        if (C15Z2.LIZIZ().contains(str)) {
                            c094d.LJIIIIZZ(Boolean.valueOf(C15Z2.LIZIZ().getBoolean(str, false)));
                        } else {
                            c094d.LJIIIIZZ(null);
                        }
                    }
                }
            };
            C15Z2.LIZIZ().registerChangeListener(r2);
            AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31((C165M) r2, 1445);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS575S0100000_31, this) == objLJFF) {
                C1C7U.LIZIZ("PNSDataStore@6f98.getBoolFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSDataStore@6f98.getBoolFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Boolean> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
