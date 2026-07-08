package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0TwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel$updateFavoriteSongUI$1", f = "BGMSongListViewModel.kt", l = {193}, m = "invokeSuspend")
public final class C762990TwP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BGMSongListViewModel LLILLJJLI;
    public final /* synthetic */ MusicSong LLILLL;
    public final /* synthetic */ C763160Twg LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762990TwP(BGMSongListViewModel bGMSongListViewModel, MusicSong musicSong, C763160Twg c763160Twg, InterfaceC1364105Vn<? super C762990TwP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bGMSongListViewModel;
        this.LLILLL = musicSong;
        this.LLILZ = c763160Twg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762990TwP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListViewModel@6bca.updateFavoriteSongUI$1");
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
            C762700Tvw c762700Tvw = new C762700Tvw(this.LLILLL, this.LLILZ);
            this.LL = 1;
            if (c2252331DDr.emit(c762700Tvw, this) == objLJFF) {
                C1C7U.LIZIZ("BGMSongListViewModel@6bca.updateFavoriteSongUI$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BGMSongListViewModel@6bca.updateFavoriteSongUI$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
