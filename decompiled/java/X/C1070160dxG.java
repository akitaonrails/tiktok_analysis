package X;

import Y.AgS204S0200000_16;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingManager$removeContactNewAuthFlow$1", f = "FindCtxSettingManager.kt", l = {791}, m = "invokeSuspend")
public final class C1070160dxG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070160dxG(Context context, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C1070160dxG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1070160dxG c1070160dxG = new C1070160dxG(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1070160dxG.LLILLJJLI = obj;
        return c1070160dxG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1070020dx2 interfaceC1070020dx2LIZ;
        C095D c095dLIZ;
        C1C7U.LIZ("FindCtxSettingManager@b41b.removeContactNewAuthFlow$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            Context context = this.LLILLL;
            if (context != null && (interfaceC1070020dx2LIZ = C1070250dxP.LIZ(context, new AwS595S0100000_16(interfaceC497601wk, 255))) != null && (c095dLIZ = ((C1071200dyw) interfaceC1070020dx2LIZ).LIZ()) != null) {
                AgS204S0200000_16 agS204S0200000_16 = new AgS204S0200000_16(this.LLILLL, this.LLILZ, 12);
                this.LL = 1;
                if (c095dLIZ.collect(agS204S0200000_16, this) == objLJFF) {
                    C1C7U.LIZIZ("FindCtxSettingManager@b41b.removeContactNewAuthFlow$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindCtxSettingManager@b41b.removeContactNewAuthFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
