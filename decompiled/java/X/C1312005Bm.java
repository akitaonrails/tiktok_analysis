package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.MatchItemEnterAnimAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.MatchItemEnterAnimAssem$showSelfUseCardFirstStepAnim$1", f = "MatchItemEnterAnimAssem.kt", l = {}, m = "invokeSuspend")
public final class C1312005Bm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MatchItemEnterAnimAssem LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312005Bm(MatchItemEnterAnimAssem matchItemEnterAnimAssem, String str, InterfaceC1364105Vn<? super C1312005Bm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = matchItemEnterAnimAssem;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1312005Bm(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchItemEnterAnimAssem@375f.showSelfUseCardFirstStepAnim$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MatchItemEnterAnimAssem matchItemEnterAnimAssem = this.LL;
        String str = this.LLILLJJLI;
        int i = MatchItemEnterAnimAssem.LLJJL;
        matchItemEnterAnimAssem.So(0L, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchItemEnterAnimAssem@375f.showSelfUseCardFirstStepAnim$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
