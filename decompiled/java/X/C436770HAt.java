package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewHolder$bindUiState$6", f = "CommerceMusicSubstituteMusicVideoViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C436770HAt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC346201Wa<C1786400waU> LLILLJJLI;
    public final /* synthetic */ C1838970xxH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436770HAt(InterfaceC346201Wa<C1786400waU> interfaceC346201Wa, C1838970xxH c1838970xxH, InterfaceC1364105Vn<? super C436770HAt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = c1838970xxH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C436770HAt c436770HAt = new C436770HAt(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c436770HAt.LL = obj;
        return c436770HAt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceMusicSubstituteMusicVideoViewHolder@7f75.bindUiState$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, null, new C436780HAu(this.LLILLJJLI, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceMusicSubstituteMusicVideoViewHolder@7f75.bindUiState$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
