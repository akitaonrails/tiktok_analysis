package X;

import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem$MusicListComposable$6$1", f = "MusicListComposableAssem.kt", l = {}, m = "invokeSuspend")
public final class C633150OsT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MusicListComposableAssem LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ C1260280itu LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633150OsT(MusicListComposableAssem musicListComposableAssem, C1690080u58 c1690080u58, InterfaceC497601wk interfaceC497601wk, C1260280itu c1260280itu, InterfaceC1364105Vn<? super C633150OsT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = musicListComposableAssem;
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = c1260280itu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C633150OsT(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicListComposableAssem@c9b0.MusicListComposable$6$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C633160OsU c633160OsUYp = this.LL.yp();
        C1690080u58 c1690080u58 = this.LLILLJJLI;
        InterfaceC497601wk interfaceC497601wk = this.LLILLL;
        c633160OsUYp.LL = c1690080u58;
        c633160OsUYp.LLILLJJLI = interfaceC497601wk;
        this.LL.yp().setDampScrollableLayout(this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicListComposableAssem@c9b0.MusicListComposable$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
