package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingSheet;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingSheet$requestLocationPermission$1$1", f = "LiveLocationScopeSettingSheet.kt", l = {280}, m = "invokeSuspend")
public final class C752790Tfx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveLocationScopeSettingSheet LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752790Tfx(LiveLocationScopeSettingSheet liveLocationScopeSettingSheet, Integer num, InterfaceC1364105Vn<? super C752790Tfx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveLocationScopeSettingSheet;
        this.LLILLL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752790Tfx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveLocationScopeSettingSheet@e317.requestLocationPermission$1$1");
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
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            LiveLocationScopeSettingSheet liveLocationScopeSettingSheet = this.LLILLJJLI;
            liveLocationScopeSettingSheet.getClass();
            LiveLocationScopeSettingSheet liveLocationScopeSettingSheet2 = this.LLILLJJLI;
            String str = liveLocationScopeSettingSheet2.LLLILZJ;
            String str2 = liveLocationScopeSettingSheet2.LLLILZLLLI;
            this.LL = 1;
            obj = iRoomFunctionService.EW1(liveLocationScopeSettingSheet, str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveLocationScopeSettingSheet@e317.requestLocationPermission$1$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            Integer num = this.LLILLL;
            if (num != null && num.intValue() == 3) {
                C1841350y17 c1841350y17 = this.LLILLJJLI.LLJZIJLIL;
                if (c1841350y17 != null) {
                    c1841350y17.setChecked(false);
                }
                C1841350y17 c1841350y172 = this.LLILLJJLI.LLLF;
                if (c1841350y172 != null) {
                    c1841350y172.setChecked(true);
                }
                this.LLILLJJLI.LLJZ = 3;
            } else {
                Integer num2 = this.LLILLL;
                if (num2 != null && num2.intValue() == 2) {
                    C1841350y17 c1841350y173 = this.LLILLJJLI.LLJZIJLIL;
                    if (c1841350y173 != null) {
                        c1841350y173.setChecked(false);
                    }
                    C1841350y17 c1841350y174 = this.LLILLJJLI.LLL;
                    if (c1841350y174 != null) {
                        c1841350y174.setChecked(true);
                    }
                    this.LLILLJJLI.LLJZ = 2;
                } else if (HostAddLocationSetting.INSTANCE.isV1()) {
                    C1841350y17 c1841350y175 = this.LLILLJJLI.LLJZIJLIL;
                    if (c1841350y175 != null) {
                        c1841350y175.setChecked(false);
                    }
                    C1841350y17 c1841350y176 = this.LLILLJJLI.LLLF;
                    if (c1841350y176 != null) {
                        c1841350y176.setChecked(true);
                    }
                    this.LLILLJJLI.LLJZ = 3;
                } else {
                    C1841350y17 c1841350y177 = this.LLILLJJLI.LLJZIJLIL;
                    if (c1841350y177 != null) {
                        c1841350y177.setChecked(false);
                    }
                    C1841350y17 c1841350y178 = this.LLILLJJLI.LLL;
                    if (c1841350y178 != null) {
                        c1841350y178.setChecked(true);
                    }
                    this.LLILLJJLI.LLJZ = 2;
                }
            }
            this.LLILLJJLI.BS();
            final LiveLocationScopeSettingSheet liveLocationScopeSettingSheet3 = this.LLILLJJLI;
            liveLocationScopeSettingSheet3.getClass();
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Nt2(new C1AUC() { // from class: X.0US5
                @Override // X.C1AUC
                public final void LIZ(C0UST c0ust) {
                    DataChannel dataChannelLJ = C475510Ikn.LJ(liveLocationScopeSettingSheet3);
                    if (dataChannelLJ != null) {
                        dataChannelLJ.SX0(C0USR.class, c0ust);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("latitude: ");
                    sbLIZ.append(c0ust.LIZ);
                    sbLIZ.append(", longitude: ");
                    sbLIZ.append(c0ust.LIZIZ);
                    C20441214yg.LJIIIZ("Location", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.C1AUC
                public final void onError(int i2, String str3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("errorCode: ");
                    sbLIZ.append(i2);
                    sbLIZ.append("errMsg: ");
                    sbLIZ.append(str3);
                    C20441214yg.LJ("Location", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext == null || !iHostAppContext.isLocationServiceEnabled(this.LLILLJJLI.getContext())) {
                C766270U4b.LIZLLL(2131854888);
            }
        } else {
            this.LLILLJJLI.LLJZ = 1;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveLocationScopeSettingSheet@e317.requestLocationPermission$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
