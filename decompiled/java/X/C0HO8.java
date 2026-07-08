package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0HO8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel$startObservingTaskStatus$1$1", f = "MixStudioBaseViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0HO8 extends C09AX implements InterfaceC1631620sYq<AbstractC440540HPg, List<? extends C440830HQj>, InterfaceC1364105Vn<? super Pair<? extends AbstractC440540HPg, ? extends List<? extends C440830HQj>>>, Object> {
    public /* synthetic */ AbstractC440540HPg LL;
    public /* synthetic */ Object LLILLJJLI;

    public C0HO8(InterfaceC1364105Vn<? super C0HO8> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioBaseViewModel@9c39.startObservingTaskStatus$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(this.LL, this.LLILLJJLI);
        C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.startObservingTaskStatus$1$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(AbstractC440540HPg abstractC440540HPg, List<? extends C440830HQj> list, InterfaceC1364105Vn<? super Pair<? extends AbstractC440540HPg, ? extends List<? extends C440830HQj>>> interfaceC1364105Vn) {
        C0HO8 c0ho8 = new C0HO8(interfaceC1364105Vn);
        c0ho8.LL = abstractC440540HPg;
        c0ho8.LLILLJJLI = list;
        return c0ho8.invokeSuspend(Unit.LIZ);
    }
}
