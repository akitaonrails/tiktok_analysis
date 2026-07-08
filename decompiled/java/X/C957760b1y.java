package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0b1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957760b1y implements InterfaceC943940afg {
    public static final /* synthetic */ int LIZLLL = 0;
    public final DataChannel LIZ;
    public final InterfaceC957770b1z LIZIZ;
    public final String LIZJ;

    static {
        new C957750b1x();
    }

    @Override // X.InterfaceC943940afg
    public final void dismiss() {
        this.LIZIZ.dismiss();
    }

    @Override // X.InterfaceC943940afg
    public final boolean isVisible() {
        return this.LIZIZ.isVisible();
    }

    @Override // X.InterfaceC943940afg
    public final void show() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        this.LIZIZ.show(fragmentManager, tag());
    }

    @Override // X.InterfaceC943940afg
    public final String tag() {
        String str = this.LIZJ;
        return str == null ? "LinkDialog" : str;
    }

    @Override // X.InterfaceC943940afg
    public final void LIZ(AwS559S0100000_15 awS559S0100000_15) {
        this.LIZIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(awS559S0100000_15, 30));
    }

    public C957760b1y(DataChannel dataChannel, InterfaceC957770b1z interfaceC957770b1z, String str) {
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC957770b1z;
        this.LIZJ = str;
    }
}
