package X;

import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel$sendRequest$2$3", f = "OriginMusicListViewModel.kt", l = {298}, m = "invokeSuspend")
public final class C610380Nwq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public OriginMusicListViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ OriginMusicListViewModel LLILZ;
    public final /* synthetic */ C610430Nwv LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610380Nwq(boolean z, OriginMusicListViewModel originMusicListViewModel, C610430Nwv c610430Nwv, InterfaceC1364105Vn<? super C610380Nwq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = originMusicListViewModel;
        this.LLILZIL = c610430Nwv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610380Nwq(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        OriginMusicListViewModel originMusicListViewModel;
        C1C7U.LIZ("OriginMusicListViewModel@f6d8.sendRequest$2$3");
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
                String str = this.LLILZIL.LIZJ;
                if (str == null) {
                    str = "";
                }
                this.LL = originMusicListViewModel;
                this.LLILLJJLI = 1;
                obj = originMusicListViewModel.zQ2(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.sendRequest$2$3");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.sendRequest$2$3");
            return unit;
        }
        originMusicListViewModel.LLJJIII = (C07X8) obj;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.sendRequest$2$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
