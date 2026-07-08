package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.base.BaseUseCase$invoke$2", f = "BaseUseCase.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT}, m = "invokeSuspend")
public final class C1321605Fe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1805010x4V<Object, Object> LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1321605Fe(AbstractC1805010x4V<Object, Object> abstractC1805010x4V, Object obj, InterfaceC1364105Vn<? super C1321605Fe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1805010x4V;
        this.LLILLL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1321605Fe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseUseCase@f9a4.invoke$2");
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
            AbstractC1805010x4V<Object, Object> abstractC1805010x4V = this.LLILLJJLI;
            Object obj2 = this.LLILLL;
            this.LL = 1;
            obj = abstractC1805010x4V.LJFF(obj2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseUseCase@f9a4.invoke$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BaseUseCase@f9a4.invoke$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
