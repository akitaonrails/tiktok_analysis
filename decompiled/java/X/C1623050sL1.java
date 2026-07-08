package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.sticker.senor.presenter.ARSenorPresenter;
import com.ss.android.vesdk.VEConfigCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sL1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623050sL1 implements InterfaceC1623550sLp {
    public final Handler LIZ;
    public final Function0<Boolean> LIZIZ;
    public InterfaceC1623040sL0 LIZJ;

    public static boolean LIZLLL() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("enable_build_in_sensor_service", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
        if (value == null) {
            return false;
        }
        return ((Boolean) value.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1623550sLp
    public final void LIZJ() {
        InterfaceC1623040sL0 interfaceC1623040sL0;
        if (LIZLLL()) {
            return;
        }
        if ((this.LIZIZ.invoke().booleanValue() && (this.LIZJ instanceof ARSenorPresenter)) || (interfaceC1623040sL0 = this.LIZJ) == null || !interfaceC1623040sL0.co1()) {
            return;
        }
        interfaceC1623040sL0.unRegister();
    }

    @Override // X.InterfaceC1623550sLp
    public final Handler LIZ() {
        return this.LIZ;
    }

    public C1623050sL1(Handler handler, Function0 function0) {
        this.LIZ = handler;
        this.LIZIZ = function0;
    }

    @Override // X.InterfaceC1623550sLp
    public final void LIZIZ(InterfaceC1623040sL0 interfaceC1623040sL0, boolean z) {
        InterfaceC1623040sL0 interfaceC1623040sL02;
        InterfaceC1623040sL0 interfaceC1623040sL03;
        InterfaceC1623040sL0 interfaceC1623040sL04 = this.LIZJ;
        if (z || interfaceC1623040sL04 == null || !Intrinsics.LJFF(interfaceC1623040sL0.getClass(), interfaceC1623040sL04.getClass()) || ((interfaceC1623040sL03 = this.LIZJ) != null && !interfaceC1623040sL03.co1())) {
            LIZJ();
            this.LIZJ = interfaceC1623040sL0;
            if (!LIZLLL() && (interfaceC1623040sL02 = this.LIZJ) != null && !interfaceC1623040sL02.co1()) {
                interfaceC1623040sL02.register();
            }
        }
    }
}
