package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0P0G, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.MusicChallengeHelper$checkMusicBindChallenge$1$3", f = "MusicChallengeHelper.kt", l = {}, m = "invokeSuspend")
public final class C0P0G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0P0F<MusicModel> LL;
    public final /* synthetic */ MusicModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P0G(C0P0F<MusicModel> c0p0f, MusicModel musicModel, InterfaceC1364105Vn<? super C0P0G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0p0f;
        this.LLILLJJLI = musicModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0P0G(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicChallengeHelper@3b87.checkMusicBindChallenge$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicChallengeHelper@3b87.checkMusicBindChallenge$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
