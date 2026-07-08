package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05NM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$combineScrollWithDownloadObserve$1$1", f = "FullWidthEffectCarouselComponent.kt", l = {}, m = "invokeSuspend")
public final class C05NM extends C09AX implements InterfaceC1631620sYq<C05NT, Boolean, InterfaceC1364105Vn<? super Pair<? extends C05NT, ? extends Boolean>>, Object> {
    public /* synthetic */ C05NT LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C05NM(InterfaceC1364105Vn<? super C05NM> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.combineScrollWithDownloadObserve$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(this.LL, Boolean.valueOf(this.LLILLJJLI));
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.combineScrollWithDownloadObserve$1$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C05NT c05nt, Boolean bool, InterfaceC1364105Vn<? super Pair<? extends C05NT, ? extends Boolean>> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C05NM c05nm = new C05NM(interfaceC1364105Vn);
        c05nm.LL = c05nt;
        c05nm.LLILLJJLI = zBooleanValue;
        return c05nm.invokeSuspend(Unit.LIZ);
    }
}
