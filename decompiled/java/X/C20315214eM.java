package X;

import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;

/* JADX INFO: renamed from: X.14eM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20315214eM implements InterfaceC757210Tn5 {
    public static final C20315214eM LIZ = C20315314eN.LIZ;

    @Override // X.InterfaceC757210Tn5
    public final BroadcastTunnelVM LIZ(C19EG c19eg) {
        return (BroadcastTunnelVM) C0KTH.LIZ(c19eg, BroadcastTunnelVM.class);
    }

    @Override // X.InterfaceC757210Tn5
    public final BroadcastTunnelVM LIZIZ(Context context) {
        ViewModelProvider viewModelProviderLJIIIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZJ = C520150Kab.LIZJ(context);
        if (abstractC1387200mCcLIZJ != null && (viewModelProviderLJIIIZ = abstractC1387200mCcLIZJ.LJIIIZ()) != null) {
            return (BroadcastTunnelVM) viewModelProviderLJIIIZ.get(BroadcastTunnelVM.class);
        }
        return null;
    }
}
