package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel$downloadListener$2$1$onSucceed$1", f = "BGMPlaylistViewModel.kt", l = {61}, m = "invokeSuspend")
public final class C762210Tv9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BGMPlaylistViewModel LLILLJJLI;
    public final /* synthetic */ MusicSong LLILLL;
    public final /* synthetic */ Function1<Long, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C762210Tv9(BGMPlaylistViewModel bGMPlaylistViewModel, MusicSong musicSong, Function1<? super Long, String> function1, InterfaceC1364105Vn<? super C762210Tv9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bGMPlaylistViewModel;
        this.LLILLL = musicSong;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762210Tv9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MusicSong musicSong;
        int iIntValue;
        C1C7U.LIZ("BGMPlaylistViewModel@a4b3.downloadListener$2$1$onSucceed$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
            AbstractC762270TvF abstractC762270TvF = new AbstractC762270TvF() { // from class: X.0TvA
            };
            this.LL = 1;
            if (c2252331DDr.emit(abstractC762270TvF, this) == objLJFF) {
                C1C7U.LIZIZ("BGMPlaylistViewModel@a4b3.downloadListener$2$1$onSucceed$1");
                return objLJFF;
            }
        }
        MusicSong musicSong2 = this.LLILLL;
        String strInvoke = this.LLILZ.invoke(C2286608xc.LJFF(musicSong2.id));
        if (strInvoke == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BGMPlaylistViewModel@a4b3.downloadListener$2$1$onSucceed$1");
            return unit;
        }
        C763260Twq.LJFF(musicSong2, strInvoke);
        BGMPlaylistViewModel bGMPlaylistViewModel = this.LLILLJJLI;
        C768690UDj c768690UDj = (C768690UDj) bGMPlaylistViewModel.LLIZLLLIL.getValue();
        C763480TxC c763480TxC = bGMPlaylistViewModel.LL;
        if (c763480TxC.LIZJ(c763480TxC.LJ) != null && r0.intValue() - 1 >= 0) {
            musicSong = (MusicSong) ListProtector.get(c763480TxC.LIZIZ, iIntValue);
        } else {
            musicSong = null;
        }
        c768690UDj.LIZ(musicSong);
        if (!Intrinsics.LJFF(bGMPlaylistViewModel.LL.LIZLLL(), bGMPlaylistViewModel.LL.LJ)) {
            ((C768690UDj) bGMPlaylistViewModel.LLIZLLLIL.getValue()).LIZ(bGMPlaylistViewModel.LL.LIZLLL());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BGMPlaylistViewModel@a4b3.downloadListener$2$1$onSucceed$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
