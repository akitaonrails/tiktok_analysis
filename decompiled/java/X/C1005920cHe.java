package X;

import Y.AgS297S0100000_16;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewHolder$bindUiState$1$2", f = "CommerceMusicSubstituteMusicListViewHolder.kt", l = {123}, m = "invokeSuspend")
public final class C1005920cHe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<C1839120xxW> LLILLJJLI;
    public final /* synthetic */ C1839130xxX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005920cHe(InterfaceC346201Wa<C1839120xxW> interfaceC346201Wa, C1839130xxX c1839130xxX, InterfaceC1364105Vn<? super C1005920cHe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = c1839130xxX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1005920cHe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceMusicSubstituteMusicListViewHolder@a057.bindUiState$1$2");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C1077440e90(this.LLILLJJLI, 8));
            AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(this.LLILLL, 30);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS297S0100000_16, this) == objLJFF) {
                C1C7U.LIZIZ("CommerceMusicSubstituteMusicListViewHolder@a057.bindUiState$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceMusicSubstituteMusicListViewHolder@a057.bindUiState$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
