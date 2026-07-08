package X;

import Y.AgS307S0100000_27;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewHolder$bindUiState$6$1", f = "CommerceMusicSubstituteMusicVideoViewHolder.kt", l = {104}, m = "invokeSuspend")
public final class C436780HAu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<C1786400waU> LLILLJJLI;
    public final /* synthetic */ C1838970xxH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436780HAu(InterfaceC346201Wa<C1786400waU> interfaceC346201Wa, C1838970xxH c1838970xxH, InterfaceC1364105Vn<? super C436780HAu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = c1838970xxH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436780HAu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceMusicSubstituteMusicVideoViewHolder@7f75.bindUiState$6$1");
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
            InterfaceC346201Wa<C1786400waU> interfaceC346201Wa = this.LLILLJJLI;
            AgS307S0100000_27 agS307S0100000_27 = new AgS307S0100000_27(this.LLILLL, 36);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS307S0100000_27, this) == objLJFF) {
                C1C7U.LIZIZ("CommerceMusicSubstituteMusicVideoViewHolder@7f75.bindUiState$6$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceMusicSubstituteMusicVideoViewHolder@7f75.bindUiState$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
