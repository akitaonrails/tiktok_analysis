package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0TvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlayListAdapter$onBindViewHolder$1$1$1", f = "BGMPlayListAdapter.kt", l = {172}, m = "invokeSuspend")
public final class C762350TvN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C762490Tvb LLILLJJLI;
    public final /* synthetic */ MusicSong LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762350TvN(C762490Tvb c762490Tvb, MusicSong musicSong, InterfaceC1364105Vn<? super C762350TvN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c762490Tvb;
        this.LLILLL = musicSong;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762350TvN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlayListAdapter@f666.onBindViewHolder$1$1$1");
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
            C1DEK c1dek = this.LLILLJJLI.LL.LLILLJJLI;
            C762410TvT c762410TvT = new C762410TvT(this.LLILLL);
            this.LL = 1;
            if (c1dek.LJIJI(c762410TvT, this) == objLJFF) {
                C1C7U.LIZIZ("BGMPlayListAdapter@f666.onBindViewHolder$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BGMPlayListAdapter@f666.onBindViewHolder$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
