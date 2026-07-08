package X;

import Y.AObserverS218S0100000_14;
import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS96S0210000_14;
import njp.a;

/* JADX INFO: renamed from: X.0XqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.NewEditToolbarScene$showDMGroupChatPromote$1$1", f = "NewEditToolbarScene.kt", l = {}, m = "invokeSuspend")
public final class C861120XqI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1459970o5z LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861120XqI(C1459970o5z c1459970o5z, boolean z, Function0<Boolean> function0, InterfaceC1364105Vn<? super C861120XqI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1459970o5z;
        this.LLILLJJLI = z;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861120XqI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LiveData<Unit> liveDataJS;
        C1C7U.LIZ("NewEditToolbarScene@2309.showDMGroupChatPromote$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwS96S0210000_14 awS96S0210000_14 = new AwS96S0210000_14(this.LL, this.LLILLL, this.LLILLJJLI, 0);
        if (C1428470nHB.LJJZZI(this.LL.LLLLJ())) {
            C1459970o5z c1459970o5z = this.LL;
            InterfaceC1451050nrb interfaceC1451050nrb = (InterfaceC1451050nrb) c1459970o5z.LLJJJJJIL.getValue(c1459970o5z, C1459970o5z.LLJZ[7]);
            if (interfaceC1451050nrb != null && (liveDataJS = interfaceC1451050nrb.JS()) != null) {
                liveDataJS.observe(this.LL, new AObserverS218S0100000_14(awS96S0210000_14, 24));
            }
        } else {
            this.LL.LLLLIL().ww2().observe(this.LL, new AObserverS218S0100000_14(awS96S0210000_14, 25));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewEditToolbarScene@2309.showDMGroupChatPromote$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
