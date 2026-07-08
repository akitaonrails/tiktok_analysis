package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n0L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutHelper$requestNLEModelAsFlow$1$invokeSuspend$$inlined$transform$1", f = "AutoCutHelper.kt", l = {40}, m = "invokeSuspend")
public final class C1418030n0L extends C09AX implements Function2<InterfaceC346701Wf<? super C096H>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa LLILLL;
    public final /* synthetic */ List LLILZ;
    public final /* synthetic */ CreativeInfo LLILZIL;
    public final /* synthetic */ InterfaceC1635410sex LLILZLL;
    public final /* synthetic */ InterfaceC1418120n0U LLIZ;
    public final /* synthetic */ LifecycleOwner LLIZLLLIL;
    public final /* synthetic */ C1418130n0V LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418030n0L(InterfaceC346201Wa interfaceC346201Wa, InterfaceC1364105Vn interfaceC1364105Vn, List list, CreativeInfo creativeInfo, InterfaceC1635410sex interfaceC1635410sex, InterfaceC1418120n0U interfaceC1418120n0U, LifecycleOwner lifecycleOwner, C1418130n0V c1418130n0V) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = list;
        this.LLILZIL = creativeInfo;
        this.LLILZLL = interfaceC1635410sex;
        this.LLIZ = interfaceC1418120n0U;
        this.LLIZLLLIL = lifecycleOwner;
        this.LLJ = c1418130n0V;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1418030n0L c1418030n0L = new C1418030n0L(this.LLILLL, interfaceC1364105Vn, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
        c1418030n0L.LLILLJJLI = obj;
        return c1418030n0L;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C096H> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1$invokeSuspend$$inlined$transform$1");
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
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            InterfaceC346201Wa interfaceC346201Wa = this.LLILLL;
            C1417960n0E c1417960n0E = new C1417960n0E(interfaceC346701Wf, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
            this.LL = 1;
            if (interfaceC346201Wa.collect(c1417960n0E, this) == objLJFF) {
                C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1$invokeSuspend$$inlined$transform$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1$invokeSuspend$$inlined$transform$1");
        return unit;
    }
}
