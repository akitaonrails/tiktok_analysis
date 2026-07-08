package X;

import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem$MusicListComposable$5$1$1", f = "MusicListComposableAssem.kt", l = {407, 409}, m = "invokeSuspend")
public final class C632370OrD extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ MusicListComposableAssem LLILLL;
    public final /* synthetic */ C1690080u58 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632370OrD(MusicListComposableAssem musicListComposableAssem, C1690080u58 c1690080u58, InterfaceC1364105Vn<? super C632370OrD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = musicListComposableAssem;
        this.LLILZ = c1690080u58;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C632370OrD c632370OrD = new C632370OrD(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c632370OrD.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c632370OrD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicListComposableAssem@c9b0.MusicListComposable$5$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            boolean z = this.LLILLJJLI;
            if (this.LLILLL.LLJIJIL > 0) {
                if (z) {
                    C1690080u58 c1690080u58 = this.LLILZ;
                    this.LL = 1;
                    if (c1690080u58.LJFF(0, 0, this) == objLJFF) {
                        C1C7U.LIZIZ("MusicListComposableAssem@c9b0.MusicListComposable$5$1$1");
                        return objLJFF;
                    }
                } else {
                    C1690080u58 c1690080u582 = this.LLILZ;
                    this.LL = 2;
                    if (c1690080u582.LJIIJ(0, 0, this) == objLJFF) {
                        C1C7U.LIZIZ("MusicListComposableAssem@c9b0.MusicListComposable$5$1$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicListComposableAssem@c9b0.MusicListComposable$5$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
