package X;

import Y.AgS55S0210000_16;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS103S0110000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingManager$contactNewAuthFlow$1", f = "FindCtxSettingManager.kt", l = {651}, m = "invokeSuspend")
public final class C1070060dx6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ LifecycleOwner LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070060dx6(Context context, boolean z, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C1070060dx6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = z;
        this.LLILZIL = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1070060dx6 c1070060dx6 = new C1070060dx6(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1070060dx6.LLILLJJLI = obj;
        return c1070060dx6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindCtxSettingManager@b41b.contactNewAuthFlow$1");
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
            C095D c095dLIZ = ((C1071200dyw) C1070250dxP.LIZ(this.LLILLL, new AwS103S0110000_16((InterfaceC497601wk) this.LLILLJJLI, this.LLILZ, 3))).LIZ();
            AgS55S0210000_16 agS55S0210000_16 = new AgS55S0210000_16(this.LLILLL, this.LLILZIL, this.LLILZ, 0);
            this.LL = 1;
            if (c095dLIZ.collect(agS55S0210000_16, this) == objLJFF) {
                C1C7U.LIZIZ("FindCtxSettingManager@b41b.contactNewAuthFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindCtxSettingManager@b41b.contactNewAuthFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
