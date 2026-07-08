package X;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13WV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tablet.impl.business.feed.ExternalDeviceFeedScrollEventTrackManager$flush$1", f = "ExternalDeviceFeedScrollEventTrackManager.kt", l = {}, m = "invokeSuspend")
public final class C13WV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13WV(int i, int i2, int i3, InterfaceC1364105Vn<? super C13WV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13WV(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InputManager inputManager;
        C1C7U.LIZ("ExternalDeviceFeedScrollEventTrackManager@5f87.flush$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C13WY c13wy = C13WY.LIZ;
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        c13wy.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "num_gesture");
        c2344009Gk.LIZJ(i2, "num_mouse_scroll");
        c2344009Gk.LIZJ(i3, "num_keyboard");
        c2344009Gk.LIZJ(C13WW.LIZ() ? 1 : 0, "is_mouse_connected");
        Object objG2 = C786410Ut5.G2(C1BWL.LIZ(), "input");
        if (objG2 instanceof InputManager) {
            inputManager = (InputManager) objG2;
        } else {
            inputManager = null;
        }
        int i4 = 0;
        if (inputManager != null) {
            int[] inputDeviceIds = inputManager.getInputDeviceIds();
            int length = inputDeviceIds.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    InputDevice inputDevice = inputManager.getInputDevice(inputDeviceIds[i5]);
                    if (inputDevice != null && !inputDevice.isVirtual() && (inputDevice.getSources() & 257) == 257 && inputDevice.getKeyboardType() == 2) {
                        i4 = 1;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
        }
        c2344009Gk.LIZJ(i4, "is_keyboard_connected");
        C20684815ws.LJIILLIIL("scroll_trigger_summary", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExternalDeviceFeedScrollEventTrackManager@5f87.flush$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
