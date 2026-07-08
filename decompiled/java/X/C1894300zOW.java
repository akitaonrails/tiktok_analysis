package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.shoppingbag.list.DefaultShopBagList$launchPreload$1", f = "DefaultShopBagList.kt", l = {975}, m = "invokeSuspend")
public final class C1894300zOW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C21208517z9 LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1894300zOW(long j, C21208517z9 c21208517z9, boolean z, boolean z2, InterfaceC1364105Vn<? super C1894300zOW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = c21208517z9;
        this.LLILZIL = z;
        this.LLILZLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1894300zOW c1894300zOW = new C1894300zOW(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1894300zOW.LLILLJJLI = obj;
        return c1894300zOW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("DefaultShopBagList@b462.launchPreload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            long j = this.LLILLL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultShopBagList@b462.launchPreload$1");
                return objLJFF;
            }
        }
        if (Intrinsics.LJFF(this.LLILZ.LLJZIJLIL, true)) {
            C421580Gg0.LIZ(new AwS576S0100000_32(this.LLILZ, 856));
        } else if (this.LLILZ.LLJJI) {
            if (C2296808zG.LJI(interfaceC497601wk)) {
                this.LLILZ.LJIIZILJ(true);
            }
        } else if (!this.LLILZIL && this.LLILZLL && C2296808zG.LJI(interfaceC497601wk)) {
            C21208517z9 c21208517z9 = this.LLILZ;
            c21208517z9.LJIIZILJ(((Boolean) c21208517z9.LLJJJIL.getValue()).booleanValue());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultShopBagList@b462.launchPreload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
