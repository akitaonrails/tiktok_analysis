package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel$loadMoreFavoriteSongs$2", f = "BGMSongListViewModel.kt", l = {160}, m = "invokeSuspend")
public final class C762980TwO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BGMSongListViewModel LLILLJJLI;
    public final /* synthetic */ C763160Twg LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762980TwO(BGMSongListViewModel bGMSongListViewModel, C763160Twg c763160Twg, int i, long j, InterfaceC1364105Vn<? super C762980TwO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bGMSongListViewModel;
        this.LLILLL = c763160Twg;
        this.LLILZ = i;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762980TwO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListViewModel@6bca.loadMoreFavoriteSongs$2");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILZ;
            C762680Tvu c762680Tvu = new C762680Tvu(this.LLILLL, this.LLILZ, this.LLILZIL);
            this.LL = 1;
            if (c2252331DDr.emit(c762680Tvu, this) == objLJFF) {
                C1C7U.LIZIZ("BGMSongListViewModel@6bca.loadMoreFavoriteSongs$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BGMSongListViewModel@6bca.loadMoreFavoriteSongs$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
