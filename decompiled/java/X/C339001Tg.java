package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.amberalert.v2.manager.AmberAlertColorManager$loadDynamicBackground$1$onCompleted$1$1", f = "AmberAlertColorManager.kt", l = {65}, m = "invokeSuspend")
public final class C339001Tg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function2<Bitmap, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C339001Tg(Function2<? super Bitmap, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, Bitmap bitmap, InterfaceC1364105Vn<? super C339001Tg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C339001Tg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmberAlertColorManager@e8ab.loadDynamicBackground$1$onCompleted$1$1");
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
            Function2<Bitmap, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLJJLI;
            Bitmap bitmap = this.LLILLL;
            this.LL = 1;
            if (function2.invoke(bitmap, this) == objLJFF) {
                C1C7U.LIZIZ("AmberAlertColorManager@e8ab.loadDynamicBackground$1$onCompleted$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmberAlertColorManager@e8ab.loadDynamicBackground$1$onCompleted$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
