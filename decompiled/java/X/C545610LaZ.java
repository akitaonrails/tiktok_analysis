package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.service.CreativeDraftUpdateServiceImpl$deleteAsync$1", f = "DraftUpdateServiceImpl.kt", l = {116}, m = "invokeSuspend")
public final class C545610LaZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C570330MYl LLILLJJLI;
    public final /* synthetic */ InterfaceC545620Laa LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545610LaZ(C570330MYl c570330MYl, InterfaceC545620Laa interfaceC545620Laa, InterfaceC1364105Vn<? super C545610LaZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c570330MYl;
        this.LLILLL = interfaceC545620Laa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545610LaZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreativeDraftUpdateServiceImpl@1350.deleteAsync$1");
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
            C570330MYl c570330MYl = this.LLILLJJLI;
            this.LL = 1;
            obj = C570340MYm.LIZ(c570330MYl, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreativeDraftUpdateServiceImpl@1350.deleteAsync$1");
                return objLJFF;
            }
        }
        C545650Lad c545650Lad = (C545650Lad) obj;
        if (c545650Lad.LIZ.isSuc()) {
            InterfaceC545620Laa interfaceC545620Laa = this.LLILLL;
            if (interfaceC545620Laa != null) {
                interfaceC545620Laa.onSuccess();
            }
        } else {
            InterfaceC545620Laa interfaceC545620Laa2 = this.LLILLL;
            if (interfaceC545620Laa2 != null) {
                interfaceC545620Laa2.LIZ(c545650Lad);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreativeDraftUpdateServiceImpl@1350.deleteAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
