package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01w1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.cleanup.SocialStickerPreloadTracker$trackEnterEditSuccess$1$1", f = "SocialStickerPreloadTracker.kt", l = {}, m = "invokeSuspend")
public final class C493101w1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AnonymousClass0522 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493101w1(AnonymousClass0522 anonymousClass0522, InterfaceC1364105Vn<? super C493101w1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = anonymousClass0522;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C493101w1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialStickerPreloadTracker@31a9.trackEnterEditSuccess$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialStickerPreloadTracker@31a9.trackEnterEditSuccess$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
