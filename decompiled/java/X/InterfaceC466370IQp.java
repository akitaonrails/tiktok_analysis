package X;

import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: renamed from: X.0IQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC466370IQp {
    void AJ(Object obj);

    void Be();

    void CJ(Room room, EnterRoomConfig enterRoomConfig);

    boolean Dt();

    void EN(String str);

    int Ei();

    void Eo();

    EnterRoomConfig Eq();

    void FP(LiveRoomFragment liveRoomFragment);

    boolean H5();

    void IP();

    void LJLLLL();

    C0IID LLD();

    boolean O3();

    void OB();

    void PH();

    void Qb(String str);

    void Rm();

    void SD();

    void UP(int i, int i2, boolean z, boolean z2);

    Object XJ();

    void Ys();

    boolean Za();

    void bK();

    Long bg();

    boolean bl();

    void cD(String str, boolean z);

    void cancel();

    void dl(Rect rect);

    void e0();

    void eE(LiveRoomFragment liveRoomFragment);

    void ea();

    Room f8();

    void fG(int i);

    void fN();

    void fO();

    void fk();

    void fy();

    void gc();

    DataChannel getDataChannel();

    Fragment getFragment();

    long getRoomId();

    void hC();

    String hx();

    void i9();

    void jm();

    void kR();

    void kb(C0IHD c0ihd);

    void ki();

    void l0();

    boolean lk();

    void n0(boolean z);

    boolean onBackPressed();

    void pD();

    void pL(boolean z);

    void pause();

    void resume();

    void tF();

    void vH();

    void wA(C0IHD c0ihd);

    void wD(int i);

    void z7(Rect rect);

    LiveWidget zb();
}
