package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.chatroom.model.LocationIconDisplaySettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Q0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer$updateLocationDesc$1", f = "BasePreviewSettingMainFragmentSheetInitializer.kt", l = {614}, m = "invokeSuspend")
public final class C01Q0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BasePreviewSettingMainFragmentSheetInitializer LLILLJJLI;
    public final /* synthetic */ C16F5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01Q0(BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, C16F5 c16f5, InterfaceC1364105Vn<? super C01Q0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = basePreviewSettingMainFragmentSheetInitializer;
        this.LLILLL = c16f5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01Q0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.updateLocationDesc$1");
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
            DataChannel dataChannel = this.LLILLJJLI.LLILLJJLI;
            this.LL = 1;
            obj = iRoomFunctionService.Zq0(dataChannel, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.updateLocationDesc$1");
                return objLJFF;
            }
        }
        LocationIconDisplaySettings locationIconDisplaySettings = (LocationIconDisplaySettings) obj;
        if (locationIconDisplaySettings != null && locationIconDisplaySettings.location.length() > 0) {
            C16F5 c16f5 = this.LLILLL;
            if (c16f5 != null) {
                c16f5.setText(locationIconDisplaySettings.location);
            }
            C500260Jjc.LLFFF(this.LLILLL);
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).hG(locationIconDisplaySettings.location);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.updateLocationDesc$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
