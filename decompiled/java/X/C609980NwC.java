package X;

import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel$sendRequest$2$4", f = "OriginMusicListViewModel.kt", l = {303}, m = "invokeSuspend")
public final class C609980NwC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public OriginMusicListViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ OriginMusicListViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C609980NwC(boolean z, OriginMusicListViewModel originMusicListViewModel, InterfaceC1364105Vn<? super C609980NwC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = originMusicListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C609980NwC(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        OriginMusicListViewModel originMusicListViewModel;
        C1C7U.LIZ("OriginMusicListViewModel@f6d8.sendRequest$2$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                originMusicListViewModel = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLL) {
                originMusicListViewModel = this.LLILZ;
                InterfaceC346201Wa<DspPlatform> interfaceC346201WaLJJIJIL = C633020OsG.LIZIZ.LJJIJIL();
                this.LL = originMusicListViewModel;
                this.LLILLJJLI = 1;
                obj = C09IC.LJJIJ(interfaceC346201WaLJJIJIL, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.sendRequest$2$4");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.sendRequest$2$4");
            return unit;
        }
        originMusicListViewModel.LLJJJ = (DspPlatform) obj;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.sendRequest$2$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
