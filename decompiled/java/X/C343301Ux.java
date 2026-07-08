package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01Ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.data.MultipleTypingIndicatorBuffer$numMemberTypingState$1", f = "MultipleTypingIndicatorBuffer.kt", l = {}, m = "invokeSuspend")
public final class C343301Ux extends C09AX implements InterfaceC1631620sYq<List<? extends C1808590xAH>, List<? extends C1808590xAH>, InterfaceC1364105Vn<? super Integer>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;

    public C343301Ux(InterfaceC1364105Vn<? super C343301Ux> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultipleTypingIndicatorBuffer@9335.numMemberTypingState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer numLJ = C2286608xc.LJ(((List) this.LL).size() + ((List) this.LLILLJJLI).size());
        C1C7U.LIZIZ("MultipleTypingIndicatorBuffer@9335.numMemberTypingState$1");
        return numLJ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends C1808590xAH> list, List<? extends C1808590xAH> list2, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        C343301Ux c343301Ux = new C343301Ux(interfaceC1364105Vn);
        c343301Ux.LL = list;
        c343301Ux.LLILLJJLI = list2;
        return c343301Ux.invokeSuspend(Unit.LIZ);
    }
}
