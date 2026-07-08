package X;

import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem$MusicListComposable$4$1", f = "MusicListComposableAssem.kt", l = {397}, m = "invokeSuspend")
public final class C633140OsS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C636150OxJ<InterfaceC1891350zJl> LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633140OsS(C636150OxJ<InterfaceC1891350zJl> c636150OxJ, C1690080u58 c1690080u58, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C633140OsS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c636150OxJ;
        this.LLILLL = c1690080u58;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C633140OsS(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicListComposableAssem@c9b0.MusicListComposable$4$1");
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
            if ((!this.LLILLJJLI.getListItemState().isEmpty()) && !MusicListComposableAssem.ap(this.LLILZ)) {
                if (this.LLILLL.LJII() != 0 || this.LLILLL.LJIIIIZZ() != 0) {
                    C1690080u58 c1690080u58 = this.LLILLL;
                    this.LL = 1;
                    if (c1690080u58.LJIIJ(0, 0, this) == objLJFF) {
                        C1C7U.LIZIZ("MusicListComposableAssem@c9b0.MusicListComposable$4$1");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MusicListComposableAssem@c9b0.MusicListComposable$4$1");
            return unit;
        }
        MusicListComposableAssem.bp(this.LLILZ, true);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicListComposableAssem@c9b0.MusicListComposable$4$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
