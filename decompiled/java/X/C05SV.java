package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05SV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.compose.MusicGiftDetailHeaderKt$HeaderProgressBar$1$1", f = "MusicGiftDetailHeader.kt", l = {373}, m = "invokeSuspend")
public final class C05SV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P1<C1396005dG> LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SV(C1677480tko c1677480tko, C05P1 c05p1, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p1;
        this.LLILLL = c1677480tko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05SV(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailHeaderKt@5c0c.HeaderProgressBar$1$1");
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
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new C05SW(this.LLILLJJLI));
            C05SU c05su = new C05SU(this.LLILLL, null);
            this.LL = 1;
            if (C09IC.LJII(c095dLJIIIZ, this, c05su) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftDetailHeaderKt@5c0c.HeaderProgressBar$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailHeaderKt@5c0c.HeaderProgressBar$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
