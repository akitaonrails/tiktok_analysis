package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.content.emotelist.SubWaveEmoteListEmoteCell;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JWD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JWD extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ SubWaveEmoteListEmoteCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JWD(SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell) {
        super(1);
        this.LL = subWaveEmoteListEmoteCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell = this.LL;
        IHostSubscription.Params params = new IHostSubscription.Params();
        SubWaveEmoteListEmoteCell subWaveEmoteListEmoteCell2 = this.LL;
        params.min_width = 255;
        params.min_height = 255;
        params.max_width = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        params.max_height = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        params.max_size = 20480000;
        subWaveEmoteListEmoteCell2.getClass();
        params.max_count = 0;
        params.emotesShowStyle = 1;
        params.logInfo = C2097908Jt.LIZJ(new Pair("show_entrance", subWaveEmoteListEmoteCell2.LLILLJJLI));
        subWaveEmoteListEmoteCell.LLILLL = params;
        return Unit.LIZ;
    }
}
