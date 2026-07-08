package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListAdapter$onBindViewHolder$1$2$2", f = "BGMSongListAdapter.kt", l = {174}, m = "invokeSuspend")
public final class C762520Tve extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C762500Tvc LLILLJJLI;
    public final /* synthetic */ MusicSong LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762520Tve(C762500Tvc c762500Tvc, MusicSong musicSong, InterfaceC1364105Vn<? super C762520Tve> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c762500Tvc;
        this.LLILLL = musicSong;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762520Tve(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEK c1dek;
        C1C7U.LIZ("BGMSongListAdapter@9e6d.onBindViewHolder$1$2$2");
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
            BGMSongListViewModel bGMSongListViewModel = this.LLILLJJLI.LL;
            if (bGMSongListViewModel != null && (c1dek = bGMSongListViewModel.LLILLL) != null) {
                C762930TwJ c762930TwJ = new C762930TwJ(this.LLILLL);
                this.LL = 1;
                if (c1dek.LJIJI(c762930TwJ, this) == objLJFF) {
                    C1C7U.LIZIZ("BGMSongListAdapter@9e6d.onBindViewHolder$1$2$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BGMSongListAdapter@9e6d.onBindViewHolder$1$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
