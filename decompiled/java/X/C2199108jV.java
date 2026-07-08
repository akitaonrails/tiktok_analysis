package X;

import com.ss.android.ugc.aweme.dynamic.card.api.event.IIMDynamicCardOpenService;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08jV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.dsp.dm.audio.AudioManager$audioPlayStatusListener$1$onAudioStopped$1", f = "AudioManager.kt", l = {61}, m = "invokeSuspend")
public final class C2199108jV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C2199108jV(InterfaceC1364105Vn<? super C2199108jV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2199108jV(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("AudioManager@6e3f.audioPlayStatusListener$1$onAudioStopped$1");
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
            IIMDynamicCardOpenService.LIZ.getClass();
            IIMDynamicCardOpenService value = C2198708jR.LIZIZ.getValue();
            DmMessageConfig dmMessageConfig = C2199308jX.LIZJ;
            if (dmMessageConfig == null || (str = dmMessageConfig.messageId) == null) {
                str = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("play_status", C2286608xc.LJ(0)));
            this.LL = 1;
            if (value.LIZIZ(str, mapLIZJ, this) == objLJFF) {
                C1C7U.LIZIZ("AudioManager@6e3f.audioPlayStatusListener$1$onAudioStopped$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioManager@6e3f.audioPlayStatusListener$1$onAudioStopped$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2199108jV(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
