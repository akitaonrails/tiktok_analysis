package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Q3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer$initGuardian$1", f = "BasePreviewSettingMainFragmentSheetInitializer.kt", l = {3539}, m = "invokeSuspend")
public final class C01Q3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BasePreviewSettingMainFragmentSheetInitializer LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C20743716Ff LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01Q3(BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, boolean z, C20743716Ff c20743716Ff, InterfaceC1364105Vn<? super C01Q3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = basePreviewSettingMainFragmentSheetInitializer;
        this.LLILLL = z;
        this.LLILZ = c20743716Ff;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01Q3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        Integer num;
        C20743716Ff c20743716Ff;
        C1C7U.LIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initGuardian$1");
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
            obj = iRoomFunctionService.ND1(dataChannel, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initGuardian$1");
                return objLJFF;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = this.LLILLL;
        }
        DataChannel dataChannel2 = this.LLILLJJLI.LLILLJJLI;
        if (dataChannel2 != null && (num = (Integer) dataChannel2.gg0(GiftFeatureChannel.class)) != null && num.intValue() == 1) {
            C20743716Ff c20743716Ff2 = this.LLILZ;
            if ((c20743716Ff2 == null || c20743716Ff2.isChecked() != zBooleanValue) && (c20743716Ff = this.LLILZ) != null) {
                c20743716Ff.setChecked(zBooleanValue);
            }
        } else {
            C20743716Ff c20743716Ff3 = this.LLILZ;
            if (c20743716Ff3 != null) {
                c20743716Ff3.setEnabled(false);
            }
            C20743716Ff c20743716Ff4 = this.LLILZ;
            if (c20743716Ff4 != null) {
                c20743716Ff4.setChecked(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initGuardian$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
