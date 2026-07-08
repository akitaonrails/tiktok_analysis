package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E24, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.stickpoint.EditorProStickPointNLEHandler$startDefaultStickPoint$1$1", f = "EditorProStickPointNLEHandler.kt", l = {}, m = "invokeSuspend")
public final class C0E24 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Pair<C1441180nbg, Integer> LL;
    public final /* synthetic */ AVMusic LLILLJJLI;
    public final /* synthetic */ C357990E1t LLILLL;
    public final /* synthetic */ InterfaceC358010E1v LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E24(Pair<C1441180nbg, Integer> pair, AVMusic aVMusic, C357990E1t c357990E1t, InterfaceC358010E1v interfaceC358010E1v, InterfaceC1364105Vn<? super C0E24> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pair;
        this.LLILLJJLI = aVMusic;
        this.LLILLL = c357990E1t;
        this.LLILZ = interfaceC358010E1v;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E24(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String musicId;
        String musicId2;
        C1C7U.LIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPoint$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = "";
        if (this.LL.getFirst().LIZ < 0) {
            C1441170nbf c1441170nbf = C1441170nbf.LIZ;
            int iIntValue = this.LL.getSecond().intValue();
            int i = this.LL.getFirst().LIZ;
            AVMusic aVMusic = this.LLILLJJLI;
            if (aVMusic != null && (musicId2 = aVMusic.getMusicId()) != null) {
                str = musicId2;
            }
            C1441170nbf.LIZJ(c1441170nbf, false, iIntValue, i, str, null, null, this.LL.getFirst(), 48);
            this.LLILLL.LIZLLL(this.LLILZ);
        } else {
            C1441170nbf c1441170nbf2 = C1441170nbf.LIZ;
            int i2 = this.LL.getFirst().LIZ;
            AVMusic aVMusic2 = this.LLILLJJLI;
            if (aVMusic2 != null && (musicId = aVMusic2.getMusicId()) != null) {
                str = musicId;
            }
            C1441170nbf.LIZJ(c1441170nbf2, true, 0, i2, str, null, null, this.LL.getFirst(), 48);
            this.LLILLL.LJ(this.LLILZ, this.LL.getFirst().LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPoint$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
