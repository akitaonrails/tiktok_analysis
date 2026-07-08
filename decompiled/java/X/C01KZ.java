package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01KZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridgeKt$initPreviewSettings$1$4$7", f = "PreviewSettingsConfigBridge.kt", l = {272}, m = "invokeSuspend")
public final class C01KZ extends C09AX implements InterfaceC1631630sYr<InterfaceC497601wk, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object>, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Function1 LLILLJJLI;
    public /* synthetic */ Function1 LLILLL;
    public final /* synthetic */ DataChannel LLILZ;
    public final /* synthetic */ LifecycleOwner LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01KZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C01KZ> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = dataChannel;
        this.LLILZIL = lifecycleOwner;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LiveMode liveMode;
        C1C7U.LIZ("PreviewSettingsConfigBridgeKt@46e1.initPreviewSettings$1$4$7");
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
            Function1 function1 = this.LLILLJJLI;
            Function1 function12 = this.LLILLL;
            DataChannel dataChannel = this.LLILZ;
            if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
                liveMode = LiveMode.VIDEO;
            }
            if (!C354201Zc.LJFF(liveMode) && !C354201Zc.LJ(liveMode)) {
                this.LLILLJJLI = null;
                this.LL = 1;
                if (function12.invoke(this) == objLJFF) {
                    C1C7U.LIZIZ("PreviewSettingsConfigBridgeKt@46e1.initPreviewSettings$1$4$7");
                    return objLJFF;
                }
            } else {
                DataChannel dataChannel2 = this.LLILZ;
                if (dataChannel2 != null) {
                    LifecycleOwner lifecycleOwner = this.LLILZIL;
                    dataChannel2.EQ2(lifecycleOwner, RoomCreateInfoChannel.class, new C01KY(lifecycleOwner, function1, function12));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewSettingsConfigBridgeKt@46e1.initPreviewSettings$1$4$7");
        return unit;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function12, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C01KZ c01kz = new C01KZ(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c01kz.LLILLJJLI = function1;
        c01kz.LLILLL = function12;
        return c01kz.invokeSuspend(Unit.LIZ);
    }
}
