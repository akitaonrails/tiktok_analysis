package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectManager$fetchVoiceEffectWithCategory$1$1$1", f = "AudioEffectManager.kt", l = {}, m = "invokeSuspend")
public final class C2247608rK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<List<Effect>> LL;
    public final /* synthetic */ Pair<Integer, String> LLILLJJLI;
    public final /* synthetic */ C2299808zk LLILLL;
    public final /* synthetic */ InterfaceC2247808rM LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2247608rK(List<List<Effect>> list, Pair<Integer, String> pair, C2299808zk c2299808zk, InterfaceC2247808rM interfaceC2247808rM, long j, InterfaceC1364105Vn<? super C2247608rK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = pair;
        this.LLILLL = c2299808zk;
        this.LLILZ = interfaceC2247808rM;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2247608rK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioEffectManager@e377.fetchVoiceEffectWithCategory$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if ((!this.LL.isEmpty()) && this.LLILLJJLI.getFirst().intValue() == 0) {
            C2299808zk c2299808zk = this.LLILLL;
            List<List<Effect>> list = this.LL;
            c2299808zk.LIZJ = list;
            InterfaceC2247808rM interfaceC2247808rM = this.LLILZ;
            if (interfaceC2247808rM != null) {
                interfaceC2247808rM.LIZLLL(list);
            }
            C2281251EQx.LIZ.LJII("changer_voice", "", "", true);
            C2299808zk.LIZLLL(0, this.LLILZIL, 0, this.LLILLL.LIZ, "");
        } else {
            InterfaceC2247808rM interfaceC2247808rM2 = this.LLILZ;
            if (interfaceC2247808rM2 != null) {
                interfaceC2247808rM2.LIZIZ(this.LLILLJJLI.getFirst().intValue(), this.LLILLJJLI.getSecond());
            }
            C2281251EQx.LIZ.LJII("changer_voice", "", "", false);
            C2299808zk.LIZLLL(1, this.LLILZIL, this.LLILLJJLI.getFirst().intValue(), this.LLILLL.LIZ, this.LLILLJJLI.getSecond());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioEffectManager@e377.fetchVoiceEffectWithCategory$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
