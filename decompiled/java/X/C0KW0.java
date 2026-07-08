package X;

import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KW0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel$startPointsExpireTask$1", f = "FansClubViewModel.kt", l = {1387}, m = "invokeSuspend")
public final class C0KW0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FansClubViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KW0(FansClubViewModel fansClubViewModel, long j, InterfaceC1364105Vn<? super C0KW0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fansClubViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KW0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1095140ebY c1095140ebY;
        C1C7U.LIZ("FansClubViewModel@394b.startPointsExpireTask$1");
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
            FansClubViewModel fansClubViewModel = this.LLILLJJLI;
            long j = this.LLILLL;
            fansClubViewModel.LLJJJ = j;
            long jLIZJ = (j - C158B.LIZJ()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (jLIZJ <= 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FansClubViewModel@394b.startPointsExpireTask$1");
                return unit;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLIZJ, this) == objLJFF) {
                C1C7U.LIZIZ("FansClubViewModel@394b.startPointsExpireTask$1");
                return objLJFF;
            }
        }
        FansClubViewModel fansClubViewModel2 = this.LLILLJJLI;
        DataChannel dataChannel = fansClubViewModel2.getDataChannel();
        if (dataChannel == null || (c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class)) == null) {
            c1095140ebY = new C1095140ebY(0L, 0L, null, 0, "", 0L, 7936);
        }
        C1095140ebY c1095140ebYLIZ = C1095140ebY.LIZ(c1095140ebY, 0L, 0L, null, null, 0, null, null, 0L, 0L, 0L, 0L, 0L, null, 4863);
        DataChannel dataChannel2 = fansClubViewModel2.getDataChannel();
        if (dataChannel2 != null) {
            dataChannel2.zW(FansClubChannel.class, c1095140ebYLIZ);
        }
        DataChannel dataChannel3 = fansClubViewModel2.getDataChannel();
        if (dataChannel3 != null) {
            dataChannel3.LC0(FansClubEvent.class, new C1095280ebm(c1095140ebY, c1095140ebYLIZ));
        }
        DataChannelGlobal.LLILZ.JQ2(C1148420fzU.class, null);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FansClubViewModel@394b.startPointsExpireTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
