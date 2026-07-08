package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public interface C0UQ8 {
    InterfaceC759380Tqa[] LIZ();

    void LIZIZ();

    boolean LIZJ(ApplyLivePermission applyLivePermission, DetailLivePermission detailLivePermission);

    void LIZLLL(String str, String str2);

    void LJ(DataChannel dataChannel, int i);

    void LJFF(Fragment fragment);

    void LJI(Fragment fragment, Boolean bool);

    C772410URr LJII(Context context, DataChannel dataChannel, WeakHandler weakHandler);

    boolean LJIIIIZZ(Fragment fragment);
}
