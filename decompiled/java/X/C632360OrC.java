package X;

import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem$MusicListComposable$5$1", f = "MusicListComposableAssem.kt", l = {404}, m = "invokeSuspend")
public final class C632360OrC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicListComposableAssem LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632360OrC(MusicListComposableAssem musicListComposableAssem, C1690080u58 c1690080u58, InterfaceC1364105Vn<? super C632360OrC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicListComposableAssem;
        this.LLILLL = c1690080u58;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C632360OrC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicListComposableAssem@c9b0.MusicListComposable$5$1");
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
            MusicListComposableAssem musicListComposableAssem = this.LLILLJJLI;
            C05YC<Boolean> c05yc = musicListComposableAssem.LLJI;
            C632370OrD c632370OrD = new C632370OrD(musicListComposableAssem, this.LLILLL, null);
            this.LL = 1;
            if (C09IC.LJII(c05yc, this, c632370OrD) == objLJFF) {
                C1C7U.LIZIZ("MusicListComposableAssem@c9b0.MusicListComposable$5$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicListComposableAssem@c9b0.MusicListComposable$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
