package X;

import Y.AgS303S0100000_22;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0oDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.toolbar.impl.AiLiveStoryToolbarHandler$1$2", f = "AiLiveStoryToolbarHandler.kt", l = {105}, m = "invokeSuspend")
public final class C1464700oDc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1464660oDY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1464700oDc(C1464660oDY c1464660oDY, InterfaceC1364105Vn<? super C1464700oDc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1464660oDY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1464700oDc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<Boolean> interfaceC346201WaOv;
        C1C7U.LIZ("AiLiveStoryToolbarHandler@db9d.<init>$1$2");
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
            InterfaceC1464740oDg interfaceC1464740oDgLJ = this.LLILLJJLI.LJ();
            if (interfaceC1464740oDgLJ != null && (interfaceC346201WaOv = interfaceC1464740oDgLJ.Ov()) != null) {
                AgS303S0100000_22 agS303S0100000_22 = new AgS303S0100000_22(this.LLILLJJLI, 12);
                this.LL = 1;
                if (interfaceC346201WaOv.collect(agS303S0100000_22, this) == objLJFF) {
                    C1C7U.LIZIZ("AiLiveStoryToolbarHandler@db9d.<init>$1$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiLiveStoryToolbarHandler@db9d.<init>$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
