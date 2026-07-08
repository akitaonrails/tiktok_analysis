package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.bytedance.iap.arch.action.ActionAsyncExtKt$thenAsync$1$perform$2", f = "ActionAsyncExt.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT}, m = "invokeSuspend")
public final class C560990LzN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC560980LzM<Object, Object> LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C560990LzN(InterfaceC560980LzM<Object, Object> interfaceC560980LzM, Object obj, InterfaceC1364105Vn<? super C560990LzN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC560980LzM;
        this.LLILLL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C560990LzN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionAsyncExtKt@fd51.thenAsync$1$perform$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC560980LzM<Object, Object> interfaceC560980LzM = this.LLILLJJLI;
                Object obj2 = this.LLILLL;
                this.LL = 1;
                if (interfaceC560980LzM.LIZ(obj2, this) == objLJFF) {
                    C1C7U.LIZIZ("ActionAsyncExtKt@fd51.thenAsync$1$perform$2");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActionAsyncExtKt@fd51.thenAsync$1$perform$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
