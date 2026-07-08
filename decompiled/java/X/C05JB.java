package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05JB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.edit.impl.ui.IMEditFragment$subscribeSystemLayoutParams$1$1", f = "IMEditFragment.kt", l = {}, m = "invokeSuspend")
public final class C05JB extends C09AX implements InterfaceC1631620sYq<C2260681De6, Integer, InterfaceC1364105Vn<? super Pair<? extends C2260681De6, ? extends Integer>>, Object> {
    public /* synthetic */ C2260681De6 LL;
    public /* synthetic */ int LLILLJJLI;

    public C05JB(InterfaceC1364105Vn<? super C05JB> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMEditFragment@10f0.subscribeSystemLayoutParams$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(this.LL, C2286608xc.LJ(this.LLILLJJLI));
        C1C7U.LIZIZ("IMEditFragment@10f0.subscribeSystemLayoutParams$1$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C2260681De6 c2260681De6, Integer num, InterfaceC1364105Vn<? super Pair<? extends C2260681De6, ? extends Integer>> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C05JB c05jb = new C05JB(interfaceC1364105Vn);
        c05jb.LL = c2260681De6;
        c05jb.LLILLJJLI = iIntValue;
        return c05jb.invokeSuspend(Unit.LIZ);
    }
}
