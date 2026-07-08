package X;

import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Uoe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.stream.quality.core.GameStreamQualityCenterImpl$startSpeedTestInternal$1$1", f = "GameStreamQualityCenterImpl.kt", l = {}, m = "invokeSuspend")
public final class C783660Uoe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2250031D4v LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C327470Csb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783660Uoe(C2250031D4v c2250031D4v, long j, C327470Csb c327470Csb, InterfaceC1364105Vn<? super C783660Uoe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2250031D4v;
        this.LLILLJJLI = j;
        this.LLILLL = c327470Csb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783660Uoe(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean bool2;
        Boolean boolValueOf3;
        InterfaceC1699460uKG interfaceC1699460uKGWr1;
        C1C7U.LIZ("GameStreamQualityCenterImpl@d868.startSpeedTestInternal$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2250031D4v c2250031D4v = this.LL;
        long j = this.LLILLJJLI;
        C327470Csb c327470Csb = this.LLILLL;
        c2250031D4v.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pre request state: isPreRequest = ");
        Boolean boolValueOf4 = null;
        if (c327470Csb != null) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        sbLIZ.append(bool);
        sbLIZ.append(", isPreRequestFail = ");
        if (c327470Csb != null) {
            boolValueOf = Boolean.valueOf(c327470Csb.LIZJ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", isPreRequestExpire = ");
        if (c327470Csb != null) {
            boolValueOf2 = Boolean.valueOf(c327470Csb.LIZIZ);
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        C20441214yg.LIZIZ("speed_test", C2188811AlT.LIZIZ(sbLIZ));
        if (c327470Csb != null) {
            bool2 = Boolean.FALSE;
        } else {
            bool2 = null;
        }
        if (C500260Jjc.LJJJI(bool2)) {
            c2250031D4v.LJIIIIZZ(j, "11");
        } else {
            if (c327470Csb != null) {
                boolValueOf3 = Boolean.valueOf(c327470Csb.LIZJ);
            } else {
                boolValueOf3 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf3)) {
                c2250031D4v.LJIIIIZZ(j, "12");
            } else {
                if (c327470Csb != null) {
                    boolValueOf4 = Boolean.valueOf(c327470Csb.LIZIZ);
                }
                if (C500260Jjc.LJJJI(boolValueOf4)) {
                    c2250031D4v.LJIIIIZZ(j, "13");
                } else {
                    c2250031D4v.LJIIIIZZ(j, CardStruct.IStatusCode.DEFAULT);
                }
            }
        }
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null && (interfaceC1699460uKGWr1 = iPullStreamService.Wr1()) != null) {
            interfaceC1699460uKGWr1.LIZ("video_pre_schedule_helper");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameStreamQualityCenterImpl@d868.startSpeedTestInternal$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
