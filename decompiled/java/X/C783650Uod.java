package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.0Uod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.stream.quality.core.GameStreamQualityCenterImpl$startSpeedTestInternal$1$2", f = "GameStreamQualityCenterImpl.kt", l = {}, m = "invokeSuspend")
public final class C783650Uod extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2250031D4v LL;
    public final /* synthetic */ C259800zU<C783680Uog> LLILLJJLI;
    public final /* synthetic */ EnumC783720Uok LLILLL;
    public final /* synthetic */ C783680Uog LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C327470Csb LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783650Uod(C2250031D4v c2250031D4v, C259800zU<C783680Uog> c259800zU, EnumC783720Uok enumC783720Uok, C783680Uog c783680Uog, long j, C327470Csb c327470Csb, InterfaceC1364105Vn<? super C783650Uod> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2250031D4v;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = enumC783720Uok;
        this.LLILZ = c783680Uog;
        this.LLILZIL = j;
        this.LLILZLL = c327470Csb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783650Uod(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        String str;
        String str2;
        String str3;
        int i;
        C1C7U.LIZ("GameStreamQualityCenterImpl@d868.startSpeedTestInternal$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC783690Uoh interfaceC783690UohLIZ = this.LL.LIZLLL().LIZ();
        if (interfaceC783690UohLIZ != null) {
            C783680Uog c783680Uog = this.LLILLJJLI.element;
            if (c783680Uog != null) {
                i = c783680Uog.LIZJ;
            } else {
                i = -1;
            }
            ((C2250051D4x) interfaceC783690UohLIZ).LIZ.put(EnumC2250061D4y.SPEED_TEST_RESPONSE_INFO_CODE, String.valueOf(i));
        }
        if (this.LLILLJJLI.element == null) {
            this.LL.LIZLLL().LIZJ(EnumC2239251Ckd.API_ERROR);
            C2250031D4v c2250031D4v = this.LL;
            EnumC783720Uok enumC783720Uok = this.LLILLL;
            C776550UdB c776550UdB = C776550UdB.LJIIJ;
            c2250031D4v.LJI(enumC783720Uok, c776550UdB);
            this.LL.LJIIJ(this.LLILLL, c776550UdB);
            this.LL.LJIIZILJ(EnumC776530Ud9.STOPPED);
            this.LL.LJIILL();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GameStreamQualityCenterImpl@d868.startSpeedTestInternal$1$2");
            return unit;
        }
        C2250031D4v c2250031D4v2 = this.LL;
        C783680Uog c783680Uog2 = this.LLILZ;
        c2250031D4v2.LJ = c783680Uog2;
        if (c783680Uog2 == null) {
            EnumC783720Uok enumC783720Uok2 = this.LLILLL;
            C776550UdB c776550UdB2 = C776550UdB.LJIIJJI;
            c2250031D4v2.LJI(enumC783720Uok2, c776550UdB2);
            this.LL.LJIIJ(this.LLILLL, c776550UdB2);
            this.LL.LJIIZILJ(EnumC776530Ud9.STOPPED);
            this.LL.LJIILL();
            this.LL.LJII(this.LLILZIL, "4");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GameStreamQualityCenterImpl@d868.startSpeedTestInternal$1$2");
            return unit2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preScheduleStream api result: logid=");
        sbLIZ.append(this.LLILLJJLI.element.LIZIZ);
        sbLIZ.append(" recommend level=");
        PreScheduleStream preScheduleStream = this.LLILZ.LIZ;
        Boolean bool = null;
        if (preScheduleStream != null) {
            numLJ = C2286608xc.LJ(preScheduleStream.recommendStreamResolution);
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        sbLIZ.append("  url=");
        PreScheduleStream preScheduleStream2 = this.LLILZ.LIZ;
        if (preScheduleStream2 != null) {
            str = preScheduleStream2.speedProbeUrl;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.LJ();
        C2250031D4v c2250031D4v3 = this.LL;
        long j = this.LLILZIL;
        C783680Uog c783680Uog3 = this.LLILZ;
        C327470Csb c327470Csb = this.LLILZLL;
        c2250031D4v3.getClass();
        PreScheduleStream preScheduleStream3 = c783680Uog3.LIZ;
        if (preScheduleStream3 != null && (str3 = preScheduleStream3.speedProbeUrl) != null && a0.LJJJIL(str3)) {
            c2250031D4v3.LJII(j, "3");
        } else {
            PreScheduleStream preScheduleStream4 = c783680Uog3.LIZ;
            if (preScheduleStream4 != null && (str2 = preScheduleStream4.sdkParams) != null && a0.LJJJIL(str2)) {
                c2250031D4v3.LJII(j, "2");
            } else {
                if (c327470Csb != null) {
                    bool = Boolean.FALSE;
                }
                if (C500260Jjc.LJJJI(bool)) {
                    c2250031D4v3.LJII(j, "11");
                } else {
                    c2250031D4v3.LJII(j, CardStruct.IStatusCode.DEFAULT);
                }
            }
        }
        this.LL.LJIILIIL(this.LLILLL);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("GameStreamQualityCenterImpl@d868.startSpeedTestInternal$1$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
