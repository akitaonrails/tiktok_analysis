package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS391S0200000_25;
import njp.a;

/* JADX INFO: renamed from: X.0uHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend")
public final class C1697700uHQ extends C09AX implements Function2<C1697730uHT, InterfaceC1364105Vn<?>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1697770uHX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697700uHQ(C1697770uHX c1697770uHX, InterfaceC1364105Vn<? super C1697700uHQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1697770uHX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1697700uHQ c1697700uHQ = new C1697700uHQ(this.LLILLL, interfaceC1364105Vn);
        c1697700uHQ.LLILLJJLI = obj;
        return c1697700uHQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1697730uHT c1697730uHT = (C1697730uHT) this.LLILLJJLI;
            C1697770uHX c1697770uHX = this.LLILLL;
            this.LLILLJJLI = c1697730uHT;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1692080u8M c1692080u8M = c1697770uHX.LLILLJJLI;
            c1692080u8M.LIZ.LIZJ();
            c1692080u8M.LIZIZ.set(new C1692530u95(c1692080u8M, c1692080u8M.LIZ));
            c2252611DEt.LJJII(new AwS391S0200000_25(c1697730uHT, c1697770uHX, 13));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1697730uHT c1697730uHT, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return ((a) create(c1697730uHT, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
