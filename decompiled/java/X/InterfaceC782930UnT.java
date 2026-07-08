package X;

import android.view.SurfaceView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.UUID;

/* JADX INFO: renamed from: X.0UnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC782930UnT {
    void Ad(int i);

    LiveMode G9();

    void LLLLJ(UUID uuid, C2185991Agv c2185991Agv);

    void LLLLZLLLI();

    void QO();

    void Rs(C0UJY c0ujy);

    void Uq(SurfaceView surfaceView);

    void XB(C20328714gX c20328714gX);

    void bR(C0UKH c0ukh);

    int getCameraType();

    DataChannel getDataChannel();

    Fragment getFragment();

    void h8(Boolean bool);

    void iq();

    C0UJY ks();

    boolean onBackPressed();

    boolean rh();

    void setVideoSize(int i, int i2);

    void t7(float f);
}
