package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xmj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.component.StorySocialEventStickerComponent$asyncCreateCoverAfterFirstFrame$1$1", f = "StorySocialEventStickerComponent.kt", l = {}, m = "invokeSuspend")
public final class C858910Xmj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1442850neN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C858910Xmj(C1442850neN c1442850neN, InterfaceC1364105Vn<? super C858910Xmj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1442850neN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C858910Xmj(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorySocialEventStickerComponent@9135.asyncCreateCoverAfterFirstFrame$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1442850neN c1442850neN = this.LL;
        c1442850neN.X1(c1442850neN.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StorySocialEventStickerComponent@9135.asyncCreateCoverAfterFirstFrame$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
