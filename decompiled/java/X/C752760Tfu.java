package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingFragment$requestLocationPermission$1$1", f = "LiveLocationScopeSettingFragment.kt", l = {298}, m = "invokeSuspend")
public final class C752760Tfu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveLocationScopeSettingFragment LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752760Tfu(LiveLocationScopeSettingFragment liveLocationScopeSettingFragment, Integer num, InterfaceC1364105Vn<? super C752760Tfu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveLocationScopeSettingFragment;
        this.LLILLL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752760Tfu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveLocationScopeSettingFragment@eca1.requestLocationPermission$1$1");
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
            LiveLocationScopeSettingFragment liveLocationScopeSettingFragment = this.LLILLJJLI;
            this.LL = 1;
            obj = iRoomFunctionService.EW1(liveLocationScopeSettingFragment, "", "nearby_live_take_page", this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveLocationScopeSettingFragment@eca1.requestLocationPermission$1$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            Integer num = this.LLILLL;
            if (num != null && num.intValue() == 3) {
                C1841350y17 c1841350y17 = this.LLILLJJLI.LLILZ;
                if (c1841350y17 != null) {
                    c1841350y17.setChecked(false);
                }
                C1841350y17 c1841350y172 = this.LLILLJJLI.LLILZLL;
                if (c1841350y172 != null) {
                    c1841350y172.setChecked(true);
                }
                this.LLILLJJLI.LLILLL = 3;
            } else {
                Integer num2 = this.LLILLL;
                if (num2 != null && num2.intValue() == 2) {
                    C1841350y17 c1841350y173 = this.LLILLJJLI.LLILZ;
                    if (c1841350y173 != null) {
                        c1841350y173.setChecked(false);
                    }
                    C1841350y17 c1841350y174 = this.LLILLJJLI.LLILZIL;
                    if (c1841350y174 != null) {
                        c1841350y174.setChecked(true);
                    }
                    this.LLILLJJLI.LLILLL = 2;
                } else if (HostAddLocationSetting.INSTANCE.isV1()) {
                    C1841350y17 c1841350y175 = this.LLILLJJLI.LLILZ;
                    if (c1841350y175 != null) {
                        c1841350y175.setChecked(false);
                    }
                    C1841350y17 c1841350y176 = this.LLILLJJLI.LLILZLL;
                    if (c1841350y176 != null) {
                        c1841350y176.setChecked(true);
                    }
                    this.LLILLJJLI.LLILLL = 3;
                } else {
                    C1841350y17 c1841350y177 = this.LLILLJJLI.LLILZ;
                    if (c1841350y177 != null) {
                        c1841350y177.setChecked(false);
                    }
                    C1841350y17 c1841350y178 = this.LLILLJJLI.LLILZIL;
                    if (c1841350y178 != null) {
                        c1841350y178.setChecked(true);
                    }
                    this.LLILLJJLI.LLILLL = 2;
                }
            }
            this.LLILLJJLI.SR();
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext == null || !iHostAppContext.isLocationServiceEnabled(this.LLILLJJLI.getContext())) {
                C766270U4b.LIZLLL(2131854888);
            }
        } else {
            this.LLILLJJLI.LLILLL = 1;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveLocationScopeSettingFragment@eca1.requestLocationPermission$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
