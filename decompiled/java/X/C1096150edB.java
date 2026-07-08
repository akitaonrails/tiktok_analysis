package X;

import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubClaimPointsOptSetting;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0edB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.revenue.level.impl.fansclub.controller.FansClubSystemMessageController$trySendFansClubMessage$1", f = "FansClubSystemMessageController.kt", l = {139}, m = "invokeSuspend")
public final class C1096150edB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1095370ebv LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ IMessageManager LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096150edB(C1095370ebv c1095370ebv, long j, IMessageManager iMessageManager, InterfaceC1364105Vn<? super C1096150edB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1095370ebv;
        this.LLILLL = j;
        this.LLILZ = iMessageManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1096150edB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1095140ebY c1095140ebY;
        long j2;
        long j3;
        String strLJIIL;
        long j4;
        long j5;
        C1C7U.LIZ("FansClubSystemMessageController@994.trySendFansClubMessage$1");
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
            C1095370ebv c1095370ebv = this.LLILLJJLI;
            long j6 = this.LLILLL;
            c1095370ebv.getClass();
            long jLIZJ = j6 - C158B.LIZJ();
            LiveFansClubClaimPointsOptSetting liveFansClubClaimPointsOptSetting = LiveFansClubClaimPointsOptSetting.INSTANCE;
            if (jLIZJ < liveFansClubClaimPointsOptSetting.getSwitchConfig().pointsExpireInterval) {
                j = 0;
            } else {
                j = jLIZJ - liveFansClubClaimPointsOptSetting.getSwitchConfig().pointsExpireInterval;
            }
            long j7 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (j7 == 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FansClubSystemMessageController@994.trySendFansClubMessage$1");
                return unit;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j7, this) == objLJFF) {
                C1C7U.LIZIZ("FansClubSystemMessageController@994.trySendFansClubMessage$1");
                return objLJFF;
            }
        }
        DataChannel dataChannel = this.LLILLJJLI.LIZ;
        if (dataChannel != null) {
            c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class);
        } else {
            c1095140ebY = null;
        }
        if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
            if (c1095140ebY != null) {
                j4 = c1095140ebY.LJIIIIZZ;
            } else {
                j4 = 0;
            }
            int i2 = (int) j4;
            Object[] objArr = new Object[1];
            if (c1095140ebY != null) {
                j5 = c1095140ebY.LJIIIIZZ;
            } else {
                j5 = 0;
            }
            objArr[0] = String.valueOf(j5);
            strLJIIL = C497740JfY.LJIIL(2131755837, i2, objArr);
        } else {
            if (c1095140ebY != null) {
                j2 = c1095140ebY.LJIIIIZZ;
            } else {
                j2 = 0;
            }
            int i3 = (int) j2;
            Object[] objArr2 = new Object[1];
            if (c1095140ebY != null) {
                j3 = c1095140ebY.LJIIIIZZ;
            } else {
                j3 = 0;
            }
            objArr2[0] = String.valueOf(j3);
            strLJIIL = C497740JfY.LJIIL(2131756004, i3, objArr2);
        }
        if (c1095140ebY != null && c1095140ebY.LJIIIIZZ > 0) {
            C518180KTw.LJIJJ(this.LLILLJJLI.LIZ, 3);
            IMessageManager iMessageManager = this.LLILZ;
            if (iMessageManager != null) {
                iMessageManager.insertMessage(this.LLILLJJLI.LIZ("1", strLJIIL, C13BV.INSTANCE), true);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FansClubSystemMessageController@994.trySendFansClubMessage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
