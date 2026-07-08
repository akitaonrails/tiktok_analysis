package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.0Uoa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.stream.quality.core.GameStreamQualityCenterImpl$initStrategyConfigWithoutProbe$1$1", f = "GameStreamQualityCenterImpl.kt", l = {}, m = "invokeSuspend")
public final class C783620Uoa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<C783680Uog> LL;
    public final /* synthetic */ C2250031D4v LLILLJJLI;
    public final /* synthetic */ C783680Uog LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783620Uoa(C259800zU<C783680Uog> c259800zU, C2250031D4v c2250031D4v, C783680Uog c783680Uog, InterfaceC1364105Vn<? super C783620Uoa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c2250031D4v;
        this.LLILLL = c783680Uog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783620Uoa(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("GameStreamQualityCenterImpl@d868.initStrategyConfigWithoutProbe$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.element == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GameStreamQualityCenterImpl@d868.initStrategyConfigWithoutProbe$1$1");
            return unit;
        }
        C2250031D4v c2250031D4v = this.LLILLJJLI;
        C783680Uog c783680Uog = this.LLILLL;
        c2250031D4v.LJ = c783680Uog;
        if (c783680Uog == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GameStreamQualityCenterImpl@d868.initStrategyConfigWithoutProbe$1$1");
            return unit2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initStrategyProbeConfig preScheduleStream api result: logid=");
        sbLIZ.append(this.LL.element.LIZIZ);
        sbLIZ.append(" recommend level=");
        PreScheduleStream preScheduleStream = this.LLILLL.LIZ;
        String str = null;
        if (preScheduleStream != null) {
            numLJ = C2286608xc.LJ(preScheduleStream.recommendStreamResolution);
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        sbLIZ.append("  url=");
        PreScheduleStream preScheduleStream2 = this.LLILLL.LIZ;
        if (preScheduleStream2 != null) {
            str = preScheduleStream2.speedProbeUrl;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LJ();
        PushStreamInfo.Quality qualityLIZJ = C2250031D4v.LIZJ();
        if (qualityLIZJ != null) {
            this.LLILLJJLI.LIZLLL().LJIILIIL(EnumC2178851APb.sdkKeyToGameLevel(qualityLIZJ.sdkKey).level(), EnumC2249781D3w.USER_SELECT);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("GameStreamQualityCenterImpl@d868.initStrategyConfigWithoutProbe$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
