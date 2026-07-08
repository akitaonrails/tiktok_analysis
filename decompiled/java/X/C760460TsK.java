package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectController$updateEffectValue$2$2", f = "LiveEffectController.kt", l = {}, m = "invokeSuspend")
public final class C760460TsK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ LiveEffect LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760460TsK(LiveEffect liveEffect, String str, int i, InterfaceC1364105Vn<? super C760460TsK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveEffect;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760460TsK(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectController@4857.updateEffectValue$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0U8T c0u8t = C0U8T.LIZ;
        LiveEffect liveEffect = this.LL;
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        c0u8t.getClass();
        C0UA1.LIZ().LJIL(i, liveEffect, str);
        C1C7U.LIZIZ("LiveEffectController@4857.updateEffectValue$2$2");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
